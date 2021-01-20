package util;

import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.Token;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class ParserSemantic {
	ParserEnvironment env;

	public ParserSemantic(ParserEnvironment e) {
		env = e;
	}

	// DONE
	public void registraStato(Stato nuovoStato) {
		System.out.println(nuovoStato);
		if (!(nuovoStato.getNome().equals("statoIniziale") || nuovoStato.getNome().equals("statoFinale"))) {
			env.errorList.add("Stato non valido!");
			System.err.println("ERR: Stato non valido!");
		}
		if (env.symbolTable.contains(nuovoStato))
			System.err.println("ERR: Duplicazione stato!");
		else {
			env.symbolTable.put(nuovoStato.getNome(), nuovoStato);
		}
	}

	// DONE
	public void registraOperatore(Azione a, Precondizioni p, Effetti e, Costo c) {

		Operatore nuovoOperatore = new Operatore(a, p, e, c);
		System.out.println(nuovoOperatore);

		if (env.symbolTable.contains(nuovoOperatore))
			// controllo solo sull'id. Controllare su coppia nome - numero di variabili
			System.err.println("ERR: Duplicazione operatore!");
		else {
			env.symbolTable.put(String.valueOf(nuovoOperatore.getId()), nuovoOperatore);
			System.out.println("\tAggiunto operatore: " + nuovoOperatore.getId());
		}
	}

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

		if (controllaPrecondizioni(statoIntermedio, a)) {
			System.out.println("\nPrecondizioni rispettate");
			if (applicaEffetti(statoIntermedio, a.getOperatore().getEffetti())) {
				System.out.println("\nEffetti applicati");

			}
		}
		
		return new Costo(String.valueOf(c.getValore() + a.getOperatore().getCosto().getValore()));

	}

	private boolean controllaPrecondizioni(Stato s, Applicazione a) {
		ArrayList<Attributo> listaA =  s.getListaAttributi();
		ArrayList<AttributoVariabile> listaPrecond = a.getOperatore().getPrecondizioni().getPrecond();
		ArrayList<Oggetto> listaO = a.getListaOggetti();
		
		// 
		
		return false;
	}

	private boolean applicaEffetti(Stato s, Effetti e) {

		return false;
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
