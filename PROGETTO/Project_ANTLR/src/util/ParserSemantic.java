package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.antlr.runtime.Token;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

/**
 * Logica semantica per il parser.
 */
public class ParserSemantic {
	ParserEnvironment env;

	/**
	 * Costruttore specificando un environment del parser.
	 * 
	 * @param e
	 */
	public ParserSemantic(ParserEnvironment e) {
		env = e;
	}

	/**
	 * Metodo per l'aggiunta di un errore alla lista degli errori. Prende in input
	 * un token da cui prende le informazioni necessarie per localizzare l'errore.
	 * Prende in input una stringa relativa al messaggio di errore.
	 * 
	 * @param tk
	 * @param msg
	 */
	private void addError(Token tk, String msg) {
		env.errorList.add("Semantic Error [" + tk.getLine() + ", " + tk.getCharPositionInLine() + "] :" + " variable "
				+ tk.getText() + ": " + msg);
		System.err.println(env.errorList.get(env.errorList.size() - 1));
	}

	/**
	 * Metodo per l'aggiunta di un waring alla lista degli warnings. Prende in input
	 * un token da cui prende le informazioni necessarie per localizzare il warning.
	 * Prende in input una stringa relativa al messaggio di warning.
	 * 
	 * @param tk
	 * @param msg
	 */
	private void addWarning(Token tk, String msg) {
		env.warningList.add("Warning [" + tk.getLine() + ", " + tk.getCharPositionInLine() + "] :" + " variable "
				+ tk.getText() + ": " + msg);
		System.err.println("**  " + env.warningList.get(env.warningList.size() - 1));
	}

	/**
	 * Metodo per registrare un nuovo stato nella tabella dei simboli.
	 * 
	 * @param nuovoStato
	 */
	public void registraStato(Stato nuovoStato) {
		env.symbolTable.put(nuovoStato.getNome(), nuovoStato);
		if (nuovoStato.getNome().equals("statoIniziale")) {env.addStato(nuovoStato);} // per salvataggio stati intermedi
		System.out.println("\tAggiunto stato: " + nuovoStato.getNome());
		System.out.println("\t"+nuovoStato);
	}

	private boolean controllaEsistenzaStati(Token tk) {
		if (env.symbolTable.get("statoIniziale") == null) {
			addError(tk, "Stato iniziale mancante.");
			return false;
		}
		if (env.symbolTable.get("statoFinale") == null) {
			addError(tk, "Stato finale mancante.");
			return false;
		}
		return true;
	}

	/**
	 * Metodo per registrare un nuovo operatore nella tabella dei simboli.
	 * 
	 * @param a
	 * @param p
	 * @param e
	 * @param c
	 * @param tk
	 */
	public void registraOperatore(Azione a, Precondizioni p, Effetti e, Costo c, Token tk) {

		if (env.symbolTable.get("0") == null) {
			if (!controllaEsistenzaStati(tk))
				System.exit(1);
		}
		;

		// controllo variabili
		Set<Variabile> insiemeVarAz = new HashSet<>(a.getListaVariabili());
		Set<Variabile> insiemeVarP = new HashSet<>(
				p.getPrecond().stream().map(AttributoVariabile::getListaVariabili).flatMap(Collection::stream).collect(Collectors.toList()));
		Set<Variabile> insiemeVarE = new HashSet<>(
				e.getEffetti().stream().map(AttributoVariabile::getListaVariabili).flatMap(Collection::stream).collect(Collectors.toList()));

//		System.out.println("\n\n---------------------------------------");
//		System.out.println(insiemeVarP);
//		System.out.println(insiemeVarE);

		boolean error = false;
		if (!insiemeVarAz.containsAll(insiemeVarP))
			addError(tk, "una o più variabili di Precondizioni non corrispondono a quelle di Azione.");
		error = true;
		if (!insiemeVarAz.containsAll(insiemeVarE))
			addError(tk, "una o più variabili di Effetti non corrispondono a quelle di Azione.");
		error = true;
		if (!error) {
			insiemeVarP.addAll(insiemeVarE);
			if (insiemeVarAz.size() > insiemeVarP.size())
				addError(tk, "una o più variabili extra rispetto alle Precondizioni o Effetti");
		}

		// Controllo warning
		ArrayList<AttributoVariabile> nuovo = new ArrayList<>(p.getPrecond());
		nuovo.retainAll(e.getEffetti());
		if (nuovo.size() > 0)
			addWarning(tk, nuovo + " attributi già soddisfatti nelle Precondizioni");

		// Controllo negazione
		 Predicate<AttributoVariabile> byNot = attrv -> attrv.isNot();

		ArrayList<AttributoVariabile> negati = new ArrayList<>(
				e.getEffetti().stream().filter(attrv -> attrv.isNot() == true).collect(Collectors.toList()));
		boolean er = false;
		for (AttributoVariabile n : negati) {
			er = p.getPrecond().stream().anyMatch(attr -> attr.getNome().equals(n.getNome())
					&& listEqualsIgnoreOrder(attr.getListaVariabili(), n.getListaVariabili()) && attr.isNot() == false);
			if (!er)
				addError(tk, n + " non è presente nelle precondizioni");
			;
		}

		Operatore nuovoOperatore = new Operatore(a, p, e, c);
		env.symbolTable.put(String.valueOf(nuovoOperatore.getId()), nuovoOperatore);
		System.out.println("\t- Aggiunto operatore: " + nuovoOperatore.getAzione().getNome());
	}

	/**
	 * Metodo che cerca l'operatore corrispondente all'azione a cui fa riferimento
	 * l'applicazione passata in input.
	 * 
	 * @param app
	 * @return operatore corrispondente l'azione a cui fa riferimento applicazione.
	 */
	private Operatore getOperatore(Applicazione app, Token tk) {
		Operatore operatore = new Operatore();
		operatore.setId(-1);
		env.symbolTable.forEach((k, v) -> {
			try {
				Integer a = Integer.parseInt(k);
				Operatore o = (Operatore) env.symbolTable.get(String.valueOf(a));
				if (o.getAzione().getNome().equals(app.getNome())) {
					if (o.getAzione().getListaVariabili().size() == app.getListaOggetti().size()) {
						operatore.setPrecondizioni(o.getPrecondizioni());
						operatore.setEffetti(o.getEffetti());
						operatore.setCosto(o.getCosto());
						operatore.setAzione(o.getAzione());
						operatore.setId(o.getId());
					} else
						addError(tk, "Numero di oggetti errato. Rimuovere o aggiungere un oggetto.");
				}

			} catch (NumberFormatException e) {
			}
		});
		if (operatore.getId() == -1) {
			addError(tk, "Nessun operatore corrispondente all'azione.");
			return null;
		}
		return operatore;

	}
	
	

	/**
	 * Metodo che applica gli effetti di un'azione se lo stato corrente soddisfa le
	 * precondizioni. Viene passato in input il costo accumulato finora.
	 * 
	 * @param a
	 * @param c
	 * @return costo totale accumulato in seguito all'applicazione dell'azione.
	 */
	public Costo applicaAzione(Applicazione a, Costo c, Token tk) {

		Operatore op = getOperatore(a, tk);
		if (op == null)
			return c;
		a.setOperatore(op);
		System.out.println("\n\n===========================================================================================================\n");
		System.out.println("\nApplica -> " + a.getNome() + " : " + a.getListaOggetti());
		Stato statoIntermedio;
		if (env.symbolTable.containsKey("statoIntermedio")) {
			statoIntermedio = (Stato) env.symbolTable.get("statoIntermedio");
		} else {
			Stato statoIniziale = (Stato) env.symbolTable.get("statoIniziale");
			statoIntermedio = new Stato("statoIntermedio", statoIniziale.getListaAttributi());
			env.symbolTable.put("statoIntermedio", statoIntermedio);
		}
		ArrayList<Attributo> listaA = statoIntermedio.getListaAttributi();
		ArrayList<AttributoVariabile> listaPrecond = a.getOperatore().getPrecondizioni().getPrecond();
		ArrayList<Oggetto> listaO = a.getListaOggetti();
		ArrayList<Variabile> listaV = a.getOperatore().getAzione().getListaVariabili();
		ArrayList<AttributoVariabile> listaEffetti = a.getOperatore().getEffetti().getEffetti();
		boolean controlloP = controllaPrecondizioni(listaPrecond, listaV, listaA, listaO);
		if (controlloP) {
			System.out.println("    Precondizioni rispettate");
			applicaEffetti(listaEffetti, listaV, listaA, listaO);
				env.addStato(new Stato(statoIntermedio.getNome(), statoIntermedio.getListaAttributi()));
				System.out.println("    Effetti applicati");
				System.out.println("    "+statoIntermedio);
				System.out.println("    " + new Costo(String.valueOf(c.getValore() + a.getOperatore().getCosto().getValore()))+ "\n");
				// controllo stato finale
				if (controllaFinale(statoIntermedio)) {
					System.out.println("\n##########################");
					System.out.println("# STATO FINALE RAGGIUNTO #");
					System.out.println("##########################\n");
					System.out.println("Costo totale: " + String.valueOf(c.getValore() + a.getOperatore().getCosto().getValore()));
					System.out.println(env.symbolTable.get("statoFinale")+"\n");
					

				} else {
					System.out.println("\n=====================================");
					System.out.println("| STATO FINALE NON ANCORA RAGGIUNTO |");
					System.out.println("=====================================\n");
				
					System.out.println(env.symbolTable.get("statoFinale"));
				}

				return new Costo(String.valueOf(c.getValore() + a.getOperatore().getCosto().getValore()));
		} else {
			addError(tk, "Precondizioni non rispettate");
		}

		return new Costo(String.valueOf(c.getValore()));

	}

	/**
	 * Controllo precondizioni: controlla che le preocndizioni siano rispettate e
	 * che il numero di variabili sia uguale a quello dell'azione
	 * 
	 * @param s
	 * @param a
	 * @param listaV
	 * @return
	 */
	private boolean controllaPrecondizioni(ArrayList<AttributoVariabile> listaPrecond, ArrayList<Variabile> listaV,
			ArrayList<Attributo> listaA, ArrayList<Oggetto> listaO) {
		ArrayList<Attributo> listaAttrPrecond = new ArrayList<>();

		for (AttributoVariabile av : listaPrecond) {
			Attributo attr = varToAttr(listaV, listaO, av);
			listaAttrPrecond.add(attr);
		}

		//System.out.println("Lista attributi stato: "+listaA);
		//System.out.println("Lista attributi precondizioni: "+listaAttrPrecond);

		return listaA.containsAll(listaAttrPrecond) ? true : false;

	}

	/**
	 * Metodo che restituisce l'attributo corrispondente all'attributo variabile.
	 * 
	 * @param listaV
	 * @param listaO
	 * @param av
	 * @return
	 */
	private Attributo varToAttr(ArrayList<Variabile> listaV, ArrayList<Oggetto> listaO, AttributoVariabile av) {
		String nomeAttributo = av.getNome();
		ArrayList<Variabile> listaVariabili = av.getListaVariabili();
		ArrayList<Oggetto> listaOggetti = new ArrayList<Oggetto>();
		for(Variabile v : listaVariabili) {
			int indice = listaV.indexOf(v);
			Oggetto ogg = listaO.get(indice);
			listaOggetti.add(ogg);
		
		}
		Attributo attr = new Attributo(nomeAttributo, listaOggetti);
		return attr;
	}

	/**
	 * Metodo che applica gli effetti di un opereatore.
	 * 
	 * @param listaEffetti
	 * @param listaV
	 * @param listaA
	 * @param listaO
	 * @return
	 */
	private void applicaEffetti(ArrayList<AttributoVariabile> listaEffetti, ArrayList<Variabile> listaV,
			ArrayList<Attributo> listaA, ArrayList<Oggetto> listaO) {
		ArrayList<Attributo> listaAttrEffettiAgg = new ArrayList<>();
		ArrayList<Attributo> listaAttrEffettiRim = new ArrayList<>();

		for (AttributoVariabile av : listaEffetti) {
			Attributo attr = varToAttr(listaV, listaO, av);
			if (av.isNot())
				listaAttrEffettiRim.add(attr);
			else
				listaAttrEffettiAgg.add(attr);
		}

		// applica gli effetti
		listaA.removeAll(listaAttrEffettiRim);
		listaA.addAll(listaAttrEffettiAgg);
		// ArrayList<Attributo> listaADistinct = new ArrayList<>(new HashSet<>(listaA));
	}
/**
 * Controlla se lo stato è finale
 * @param statoIntermedio
 * @return boolean: true = finale, false = non finale
 */
	private boolean controllaFinale(Stato statoIntermedio) {
		Stato statoFinale = (Stato) env.symbolTable.get("statoFinale");
		ArrayList<Attributo> listaIntermedia = statoIntermedio.getListaAttributi();
		ArrayList<Attributo> listaFinale = statoFinale.getListaAttributi();
		if (listaIntermedia.size() < listaFinale.size())
			return false;
		for (Attributo a : listaFinale) {
			if (!listaIntermedia.contains(a))
				return false;
		}
		return true;
	}
	
	public static <T> boolean listEqualsIgnoreOrder(List<T> list1, List<T> list2) {
	    return new HashSet<>(list1).equals(new HashSet<>(list2));
	}
}
