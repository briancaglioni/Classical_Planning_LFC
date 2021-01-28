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
		String fileInStati = ".\\resources\\inputStati.file";
		String fileInOperatori = ".\\resources\\inputOperatori.file";
		String fileInApplicazioni = ".\\resources\\inputApplicazioni.file";
		String fileIn = ".\\resources\\input.file";
		String fileIn2 = ".\\resources\\input2.file";
		
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
  		
  		ProjectLexer  lexer = new ProjectLexer (new ANTLRReaderStream(new FileReader(fileIn2))); 
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
