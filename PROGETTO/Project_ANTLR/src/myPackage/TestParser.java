package myPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import myCompiler.ProjectLexer;
import myCompiler.ProjectParser;

public class TestParser {
	public static void main(String[] args) {
		ProjectParser parser;
		String cartella = ".\\resources\\Esempio_aeroporto\\";
		//String cartella = "";
		String fileInStati = cartella + "inputStati.file";
		String fileInOperatori = cartella + "inputOperatori.file";
		String fileInApplicazioni = cartella + "inputApplicazioni.file";
		String fileIn = cartella + "input.file";
		
		String[] files = new String[3];
		files[0] = fileInStati;
		files[1] = fileInOperatori;
		files[2] = fileInApplicazioni;
			
		File outFile = new File(fileIn);
		
		OutputStream out;
		try {
			out = new FileOutputStream(outFile);
			 byte[] buf = new byte[1024];
			    for (String file : files) {
			        InputStream in = new FileInputStream(file);
			        int b = 0;
			        while ( (b = in.read(buf)) >= 0) {
			            out.write(buf, 0, b);
			        }
			        in.close();
			    }
			    out.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	   
	   
		

  	
  	try {
  		
  		ProjectLexer  lexer = new ProjectLexer (new ANTLRReaderStream(new FileReader(fileIn))); 
  		CommonTokenStream tokens = new CommonTokenStream (lexer);	
		parser = new ProjectParser (tokens);
	    parser.start();
	    System.out.println ("\nParsing con ANTLR terminato con successo\n\n");
  	
  	} catch (Exception e) {
			System.out.println ("\nParsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
  }
}
