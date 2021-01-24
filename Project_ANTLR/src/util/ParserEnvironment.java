package util;

import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.RecognitionException;


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
		System.out.println("getAllSymbols");
		return symbolTable;
	}
	
	public void handleError(String[] tokenNames,
		      RecognitionException e, String h, String m){

//		        String st=h+m;
		        String st;
		        if (tokenNames[e.token.getType()].equals("ERROR"))
		            st = "Lexical Error at [" + e.token.getLine() + 
		            ", " + e.token.getCharPositionInLine()+"] : "
		            + "Character not recognized: '"+ e.token.getText() + "'";
		        else
		            st = "Sintax Error at [" + e.token.getLine() + 
		            ", " + e.token.getCharPositionInLine()+"] : "
		            + "Found " + tokenNames[e.token.getType()] + 
		             "'" + e.token.getText() + "' - " + m;

//		        if (e instanceof MissingTokenException)
//		           st = st + m;
//		        st= st + "\n"+ e.getUnexpectedType()+ "\n" + h + " \n" + m ;
		        errorList.add(st); 
		        System.err.println(st);
		    }
	
}





