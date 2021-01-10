package util;

import java.util.Hashtable;


public class ParserEnvironment {
		
	public Hashtable<String, Hashtable<String, String>> symbolTable;
	public Hashtable<String, Symbol> symbolTable1;
	
	public ParserEnvironment () {
		System.out.println("Inizio Costruttore PE");
		symbolTable1 = new Hashtable<String, Symbol> (101);
	}
	
	public Hashtable<String, Symbol> getAllSymbols() {
		return symbolTable1;
	}
}





