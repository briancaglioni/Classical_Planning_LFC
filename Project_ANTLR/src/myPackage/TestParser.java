package myPackage;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import myCompiler.ProjectLexer;
import myCompiler.ProjectParser;

public class TestParser {
	public static void main(String[] args) {
		ProjectParser parser;
		String fileIn = ".\\resources\\input.file";
  	
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
