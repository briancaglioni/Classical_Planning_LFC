package util;

import java.util.Hashtable;


public class ParserEnvironment {
		
	public Hashtable<String, Hashtable<String, String>> symbolTable;
	public Hashtable<String, Symbol> symbolTable1;
	
	public ParserEnvironment () {
		System.out.println("Inizio Costruttore PE");
		symbolTable1 = new Hashtable<String, Symbol> (101);
		Operatore o1 = new Operatore();
		Stato s1 = new Stato();
		symbolTable1.put("Operatore1", o1);
		symbolTable1.put("Stato1", s1);
		System.out.println("Fine Costruttore PE");
		System.out.println(symbolTable1.get("Stato1"));
	}

}

abstract class Symbol{
	
}

class Operatore extends Symbol{
	public Operatore() {};
}

class Stato extends Symbol{
	public Stato() {};
	
	@Override
	public String toString() {
		return "Stato";
	}
}

