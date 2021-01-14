package util;

import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.Token;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class ParserSemantic {
	ParserEnvironment env;

	public ParserSemantic (ParserEnvironment e) {
		env = e;
	}
	
	// DONE
	public void registraStato(Stato nuovoStato) {
		System.out.println(nuovoStato);	
		if(!(nuovoStato.getNome().equals("statoIniziale") || 
				nuovoStato.getNome().equals("statoFinale")))
			System.err.println("ERR: Stato non valido!");
		if(env.symbolTable.contains(nuovoStato)) 
			System.err.println("ERR: Duplicazione stato!");
		 else  {
		env.symbolTable.put(nuovoStato.getNome(), nuovoStato);
		System.out.println(env.getAllSymbols());
		 }
	}
	
	
	// DONE
	public void registraOperatore(Azione a, Precondizioni p, Effetti e, Costo c)	{
		
		Operatore o = new Operatore(a,p,e,c);
		System.out.println(o);
		
//		Operatore nuovoOperatore = new Operatore();
//		if(env.symbolTable1.contains(nuovoOperatore)) 
//			System.err.println("ERR: Duplicazione operatore!");
//		 else {
//			env.symbolTable1.put(String.valueOf(nuovoOperatore.getId()), nuovoOperatore);
//			System.out.println("\tAggiunto operatore: "+ nuovoOperatore.getId());
//		 }
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
