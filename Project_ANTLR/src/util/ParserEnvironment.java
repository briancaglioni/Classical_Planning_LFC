package util;

import java.util.ArrayList;
import java.util.Hashtable;


public class ParserEnvironment {
		
	//public Hashtable<String, Hashtable<String, String>> symbolTable;
	public Hashtable<String, Symbol> symbolTable;
	public ArrayList<String> errorList;
	public ArrayList<String> warningList;
	public String translation;
	
	public ParserEnvironment () {
		symbolTable = new Hashtable<String, Symbol> (101);
		errorList = new ArrayList<>();
		warningList = new ArrayList<>();
		translation = "";
	}
	
	public Hashtable<String, Symbol> getAllSymbols() {
		return symbolTable;
	}
}





