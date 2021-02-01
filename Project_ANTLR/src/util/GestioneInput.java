package util;

import java.util.Scanner;

public class GestioneInput {
	
	@SuppressWarnings("resource")
	public static boolean getInput(String s) {
		String input = null;
		Scanner scanner = new Scanner(System.in);
	    
	    do {
	    System.out.print("Stampa stati intermedi su " + s +" : true/false \n");
	    input = scanner.nextLine();
	    if(!(input.equals("true") || input.equals("false")))
    		System.err.println("Input errato! Riprova.");
	    } while (!(input.equals("true") || input.equals("false")));
	    
	    return Boolean.parseBoolean(input);
	}
	
}
