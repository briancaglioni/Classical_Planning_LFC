package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.RecognitionException;

/**
 * Environment del parser. Contiene una tabella dei simboli, una lista dei
 * messaggi di errore, una lista dei messaggi di warning, e una stringa relativa
 * alla traduzione.
 */
public class ParserEnvironment {

	public Hashtable<String, Symbol> symbolTable;
	public ArrayList<String> errorList;
	public ArrayList<String> warningList;
	public ArrayList<Stato> statiPercorsi;
	boolean console, file;

	/**
	 * Costruttore vuoto. Inizializza la tabella dei simboli, le liste e la stringa
	 * vuote.
	 */
	public ParserEnvironment(boolean console, boolean file) {
		symbolTable = new Hashtable<String, Symbol>(101);
		errorList = new ArrayList<>();
		warningList = new ArrayList<>();
		statiPercorsi = new ArrayList<>();
		this.console = console;
		this.file = file;
	}

	/**
	 * Metodo che ritorna semplicemente la tabella di tutti i simboli dopo aver
	 * stampato nella console.
	 * 
	 * @return tablle dei simboli
	 */
	public Hashtable<String, Symbol> getAllSymbols() {
		System.out.println("getAllSymbols");
		return symbolTable;
	}

	/**
	 * Metodo per la gestione degli errori. Aggiunge l'errore corrente alla lista degli errori.
	 * @param tokenNames
	 * @param e
	 * @param h
	 * @param m
	 */
	public void handleError(String[] tokenNames, RecognitionException e, String h, String m) {
		
		System.err.println("ERROR");
		String st;
		if (tokenNames[e.token.getType()].equals("ERROR"))
			st = "Lexical Error at [" + e.token.getLine() + ", " + e.token.getCharPositionInLine() + "] : "
					+ "Character not recognized: '" + e.token.getText() + "'";
		else
			st = "Sintax Error at [" + e.token.getLine() + ", " + e.token.getCharPositionInLine() + "] : " + "Found "
					+ tokenNames[e.token.getType()] + "'" + e.token.getText() + "' - " + m;

//		        if (e instanceof MissingTokenException)
//		           st = st + m;
//		        st= st + "\n"+ e.getUnexpectedType()+ "\n" + h + " \n" + m ;
		errorList.add(st);
		System.err.println(st);
	}
	
	public void addStato(Stato s) {
		this.statiPercorsi.add(s);
	}
	
	/**
	 * scrittura su console degli stati intermedi
	 */
	private void writeConsole() {
		if (console) {
		int i = 1;
		System.out.println("STATI PERCORSI: ");
		for (Stato st : statiPercorsi)
			System.out.println(i++ + ". " + st);
		}
	}
	
	/**
	 * scrittura su file degli stati intermedi
	 */
	private void  writeFile() {
		if (file) {
		try {
			int i = 1;
			FileWriter myWriter;
			myWriter = new FileWriter(".\\resources\\statiPercorsi.txt");
			myWriter.write("STATI PERCORSI:\n");
			for (Stato st : statiPercorsi)
				myWriter.write("\n" + i++ + ". " + st.toString());
			myWriter.close();
			
		} catch (IOException e) {
			System.err.println("Impossibile scrivere il file!");
		}

	}
	}
	
	/**
	 * scrittura file
	 */
	public void printStatiPercorsi() {
		writeConsole();
		writeFile();
	}
	
}
