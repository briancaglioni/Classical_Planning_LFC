package myPackage;

import java.io.FileReader;

import myCompiler.Project;
import myCompiler.ProjectLexer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;


public class TestScanner {

	public static void main(String[] args) {
  	String fileIn = ".\\resources\\input.file";
  	Token tk;
  	int i;

		try {
			System.out.println ("Test ANTLR lexer\n");
			ProjectLexer lexer = new ProjectLexer (new ANTLRReaderStream(new FileReader(fileIn))); 
			
			i = 1;
			
			while ((tk = lexer.nextToken()).getType() != Project.EOF) {
				if (tk.getChannel()!= Project.HIDDEN)
					System.out.println("Token " + i++ + ": (" + 
														tk.getLine() + "," + 
														tk.getCharPositionInLine() + ")\t" + 
														"TokenType:" + tk.getType() + 
														":\t" + tk.getText());
			} 

		} catch (Exception e) {
			System.out.println ("Test ANTLR abortito");
			e.printStackTrace();
		}
  }
}