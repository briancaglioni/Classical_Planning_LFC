package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
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
		System.out.println("\tAggiunto stato: " + nuovoStato.getNome());
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
		// controllo variabili
		Set<Variabile> insiemeVarAz = new HashSet<>(a.getListaVariabili());
		Set<Variabile> insiemeVarP = new HashSet<>(
				p.getPrecond().stream().map(AttributoVariabile::getVariabile).collect(Collectors.toList()));
		Set<Variabile> insiemeVarE = new HashSet<>(
				e.getEffetti().stream().map(AttributoVariabile::getVariabile).collect(Collectors.toList()));

		System.out.println("\n\n ---INSIEMI---");
		System.out.println(insiemeVarP);
		System.out.println(insiemeVarE);

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
		// Predicate<AttributoVariabile> byNot = attrv -> attrv.isNot();
		// ERRORE, CONTROLLARE <----

		ArrayList<AttributoVariabile> negati = new ArrayList<>(
				e.getEffetti().stream().filter(attrv -> attrv.isNot() == true).collect(Collectors.toList()));
		System.out.println("ARRIVO QUI");
		System.out.println(negati);
		boolean er = false;
		for (AttributoVariabile n : negati) {
			er = p.getPrecond().stream().anyMatch(attr -> attr.getNome().equals(n.getNome())
					&& attr.getVariabile().equals(n.getVariabile()) && attr.isNot() == false);
			if (!er)
				addError(tk, n + " non è presente nelle precondizioni");
			;
		}

		Operatore nuovoOperatore = new Operatore(a, p, e, c);
		env.symbolTable.put(String.valueOf(nuovoOperatore.getId()), nuovoOperatore);
		System.out.println("\tAggiunto operatore: " + nuovoOperatore.getId());
	}

	/**
	 * Metodo che cerca l'operatore corrispondente all'azione a cui fa riferimento
	 * l'applicazione passata in input.
	 * 
	 * @param app
	 * @return operatore corrispondente l'azione a cui fa riferimento applicazione.
	 */
	private Operatore getOperatore(Applicazione app) {
		Operatore operatore = new Operatore();
		operatore.setId(-1);
		env.symbolTable.forEach((k, v) -> {

			try {
				Integer a = Integer.parseInt(k);
				Operatore o = (Operatore) env.symbolTable.get(String.valueOf(a));
				if (o.getAzione().getNome().equals(app.getNome())
						&& o.getAzione().getListaVariabili().size() == app.getListaOggetti().size()) {
					operatore.setPrecondizioni(o.getPrecondizioni());
					operatore.setEffetti(o.getEffetti());
					operatore.setCosto(o.getCosto());
					operatore.setAzione(o.getAzione());
					operatore.setId(o.getId());
				}

			} catch (NumberFormatException e) {
			}

		});
		if (operatore.getId() == -1) {
			env.errorList.add("Azione non trovata!");
			System.err.println("Azione non trovata!");
		}
//		System.out.println("Trovato operatore per l'applicazione!" +  nomeAzione);
//		System.out.println(operatore);
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
	public Costo applicaAzione(Applicazione a, Costo c) {
		a.setOperatore(getOperatore(a));
		System.out.println("applica azione");
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
		int controlloP = controllaPrecondizioni(listaPrecond, listaV, listaA, listaO);
		if (controlloP == 0) {
			System.out.println("\nPrecondizioni rispettate");
			if (applicaEffetti(listaEffetti, listaV, listaA, listaO) == 0) {
				System.out.println("\nEffetti applicati");
				System.out.println(statoIntermedio);
				System.out.println(new Costo(String.valueOf(c.getValore() + a.getOperatore().getCosto().getValore())));
				// controllo stato finale
				if (controllaFinale(statoIntermedio)) {
					System.out.println("\nHAI RAGGIUNTO LO STATO FINALE");
					System.out.println(env.symbolTable.get("statoFinale"));
				} else {
					System.out.println("\nSTATO FINALE NON ANCORA RAGGIUNTO");
					System.out.println(env.symbolTable.get("statoFinale"));
				}

				return new Costo(String.valueOf(c.getValore() + a.getOperatore().getCosto().getValore()));

			}
		} else if (controlloP == 1) {
			System.out.println("Precondizioni non rispettate");
		} else {
			System.out.println("Oggetto mancante nell'azione");
		}

		return new Costo(String.valueOf(c.getValore()));

	}

	private boolean controllaFinale(Stato statoIntermedio) {
		Stato statoFinale = (Stato) env.symbolTable.get("statoFinale");
		ArrayList<Attributo> listaIntermedia = statoIntermedio.getListaAttributi();
		ArrayList<Attributo> listaFinale = statoFinale.getListaAttributi();
		if (listaIntermedia.size() != listaFinale.size())
			return false;
		for (Attributo a : listaFinale) {
			if (!listaIntermedia.contains(a))
				return false;
		}
		return true;
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
	private int controllaPrecondizioni(ArrayList<AttributoVariabile> listaPrecond, ArrayList<Variabile> listaV,
			ArrayList<Attributo> listaA, ArrayList<Oggetto> listaO) {
		ArrayList<Attributo> listaAttrPrecond = new ArrayList<>();

		for (AttributoVariabile av : listaPrecond) {
			Attributo attr = varToAttr(listaV, listaO, av);
			listaAttrPrecond.add(attr);
		}

		System.out.println(listaA);
		System.out.println(listaAttrPrecond);

		return listaA.containsAll(listaAttrPrecond) ? 0 : 1;

	}
	
	/**
	 * Metodo che restituisce l'attributo corrispondente all'attributo variabile.
	 * @param listaV
	 * @param listaO
	 * @param av
	 * @return
	 */
	private Attributo varToAttr(ArrayList<Variabile> listaV, ArrayList<Oggetto> listaO, AttributoVariabile av) {
		String nomeAttributo = av.getNome();
		Variabile nomeVariabile = av.getVariabile();
		int indice = listaV.indexOf(nomeVariabile);
		// if(indice == -1) return -1;
		Oggetto ogg = listaO.get(indice);
		Attributo attr = new Attributo(nomeAttributo, ogg);
		return attr;
	}
	
	
	/**
	 * Metodo che applica gli effetti di un opereatore.
	 * @param listaEffetti
	 * @param listaV
	 * @param listaA
	 * @param listaO
	 * @return
	 */
	private int applicaEffetti(ArrayList<AttributoVariabile> listaEffetti, ArrayList<Variabile> listaV,
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
		return 0;
	}

//---------------------------------------------------

//	public void registerAttr (String state, Token attr, Token value) {
//
//		if(state == "command") {
//			return;
//		}
//		Hashtable<String, String> attrs = new Hashtable<>();
//		if (env.symbolTable.containsKey(state)) {
//			attrs = env.symbolTable.get(state);
//			attrs.put(attr.getText(), value.getText());		
//		}
//		env.symbolTable.put(state, attrs);		
//	}
//
//
//	public void applyCommand(String state, String command) {
//		if (env.symbolTable.containsKey(state) && env.symbolTable.containsKey(command)) {
//			System.out.println("applying command");
//			Hashtable<String, String> commandTable = env.symbolTable.get(command);
//			Hashtable<String, String> stateTable = env.symbolTable.get(state);
//			commandTable.forEach((key, value)->{
//				stateTable.put(key, value);
//			});
//		}
//	}
//
//	String state = "";
//
//	public void checkObj() {
//		System.out.println("\n\tChecking..");
//		env.symbolTable.forEach((k, table)->{ // k == a, table == (X=T, Y=F)
//			if(!Character.isUpperCase(k.charAt(0))) {
//				boolean[] flag = {true};
//				env.symbolTable.get("Obj").forEach((kk, value)->{ // k == X, value == T
//					if(table.containsKey(kk)) {
//						if(!table.get(kk).equals(value)){
//							flag[0] = false;
//						} 
//					} else {
//						flag[0] = false;
//					}
//
//				});
//				if(flag[0]) state += "" + k;
//			}
//
//		});
//		if(state.length() > 0)System.out.println("\tReached -> " + state);
//
//
//	};
//
//
//
//	public double getValue (Token tk) {
//		return new Double(tk.getText());
//	}
//
//
//	public Hashtable<String, String> getVarValue (Token tk) {
//		if (env.symbolTable.containsKey(tk.getText()))
//			return env.symbolTable.get(tk.getText());
//
//		System.out.println("Variabile '" + tk.getText() + "' non trovata");
//		return new Hashtable<>();
//	}

}
