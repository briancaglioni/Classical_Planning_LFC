package util;

import java.util.Hashtable;

import org.antlr.runtime.Token;

public class ParserSemantic {
	ParserEnvironment env;
		
	public ParserSemantic (ParserEnvironment e) {
		env = e;
	}
		
	public void registerState (Token tk) {
		Hashtable<String, String> attrs = new Hashtable<>();
		if (env.symbolTable.containsKey(tk.getText()))
			attrs = env.symbolTable.get(tk.getText());
		env.symbolTable.put(tk.getText(), attrs);		
	}
	
	public void registerAttr (String state, Token attr, Token value) {
		
		if(state == "command") {
			return;
		}
		Hashtable<String, String> attrs = new Hashtable<>();
		if (env.symbolTable.containsKey(state)) {
			attrs = env.symbolTable.get(state);
			attrs.put(attr.getText(), value.getText());		
		}
		env.symbolTable.put(state, attrs);		
	}
	
	
	public void applyCommand(String state, String command) {
		if (env.symbolTable.containsKey(state) && env.symbolTable.containsKey(command)) {
			System.out.println("applying command");
			Hashtable<String, String> commandTable = env.symbolTable.get(command);
			Hashtable<String, String> stateTable = env.symbolTable.get(state);
			commandTable.forEach((key, value)->{
				stateTable.put(key, value);
			 });
		}
	}
	
	String state = "";
	
	public void checkObj() {
		System.out.println("\n\tChecking..");
		env.symbolTable.forEach((k, table)->{ // k == a, table == (X=T, Y=F)
			if(!Character.isUpperCase(k.charAt(0))) {
				boolean[] flag = {true};
				env.symbolTable.get("Obj").forEach((kk, value)->{ // k == X, value == T
				if(table.containsKey(kk)) {
						if(!table.get(kk).equals(value)){
							flag[0] = false;
						} 
					} else {
						flag[0] = false;
					}
					
				});
				if(flag[0]) state += "" + k;
			}
		
		});
		if(state.length() > 0)System.out.println("\tReached -> " + state);

		
	};



	public double getValue (Token tk) {
		return new Double(tk.getText());
	}

	
	public Hashtable<String, String> getVarValue (Token tk) {
		if (env.symbolTable.containsKey(tk.getText()))
			return env.symbolTable.get(tk.getText());

		System.out.println("Variabile '" + tk.getText() + "' non trovata");
		return new Hashtable<>();
	}

}
