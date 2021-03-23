grammar Project;

options {
	language = Java;
	k=1;
}
@lexer::header {
	package myCompiler;
}
@lexer::members {
}

@header {
package myCompiler;
import util.*;
import java.util.Hashtable;
import java.util.Scanner;

}
@members {
ParserEnvironment env;
 ParserSemantic sem;
 
  void init () {
    System.out.println("Inizio l'analisi!\n");
    env = new ParserEnvironment (GestioneInput.getInput("console"), GestioneInput.getInput("file"));
    sem = new ParserSemantic (env);
    
   }
  
  public Hashtable<String, Symbol> getVariables() {
    return env.symbolTable;
  }
  
  public void displayRecognitionError(String[] tokenNames,
                                     RecognitionException e) {
     String hdr = getErrorHeader(e);
     String msg = getErrorMessage(e, tokenNames);
     Token tk = input.LT(1);
     
    env.handleError(tokenNames,e,hdr,msg);
 }
  
}

start
@init { init(); c = new Costo("0.0"); }
	:	(definizione_stato | definizione_operatore | c=applicazione_azione[c])+
		{env.printStatiPercorsi();}
		EOF
	;
	

definizione_stato
	:	nomeStato=(STATOINIZIALE | STATOFINALE)
		{Stato x = new Stato($nomeStato.getText()); }
			OPG 
				(a1=attributo {x.addAttributo(a1);}
				( COMMA a2=attributo {x.addAttributo(a2);})*)?
			CPG 
		{sem.registraStato(x);}
			
	;
attributo returns [Attributo a]
	:	nomeAttributo=ID 
		{a = new Attributo($nomeAttributo.getText());}
		OPT 
			o1=OGGETTO {a.addOggetto($o1.getText());}
			( COMMA o2=OGGETTO {a.addOggetto($o2.getText());})*
		CPT 
		;



definizione_operatore
	:	o=OPERATORE 
			OPG 
				a=azione COMMA 		
				p=precondizioni COMMA 	
				e=effetti COMMA 	
				c=costo 		
			CPG
			{sem.registraOperatore(a,p,e,c,o);} 
		;

azione	returns [Azione a] :	x=ID {Azione y = new Azione($x.getText());}
				OPT 
					v1=VARIABILE {y.addVariabile($v1.getText());}
					( COMMA v2=VARIABILE {y.addVariabile($v2.getText());} )* 
				CPT
				{a = y;}
				;

precondizioni returns [Precondizioni p]
	:	PRECONDIZIONI {Precondizioni pr = new Precondizioni();} 
		EQ 
		OPG
			 (av1=attributo_variabile {pr.addAttrVariabile(av1);}
			 (COMMA av2=attributo_variabile {pr.addAttrVariabile(av2);})*)?
		CPG
		{p = pr;}
		;

effetti	returns [Effetti e]
	:	effects=EFFETTI {Effetti ef = new Effetti();}
		EQ 
		OPG 
			av1=attributo_variabile {ef.addAttrVariabile(av1);}
			(COMMA av2=attributo_variabile {ef.addAttrVariabile(av2);})*
		CPG
		{e = ef;}
		;

attributo_variabile returns [AttributoVariabile x]
	:	n=NOT?
		nomeAV=ID
		{x = new AttributoVariabile($nomeAV.getText(),n);}
		OPT 
			v1=VARIABILE {x.addVariabile($v1.getText());}
			( COMMA v2=VARIABILE {x.addVariabile($v2.getText());})*
		CPT 
	;


	
costo returns [Costo c]:	COSTO
				EQ
				x=FLOAT
				{c = new Costo($x.getText());}
				;



applicazione_azione [Costo c] returns [Costo c1]
	:	x=ID {Applicazione a = new Applicazione($x.getText());}
		OPT 
			o1=OGGETTO {a.addOggetto($o1.getText());}
			(COMMA o2=OGGETTO {a.addOggetto($o2.getText());})*
		CPT
		{ c1 = sem.applicaAzione(a, c, x);}
		;

//LEXER TOKENS
	
EQ 	:	'=';
OPT	:	'(';
CPT	:	')';
OPG	:	'{';
CPG	:	'}';
COMMA	:	',';	
PV	:	';';
TRUE	:	'T';	
FALSE 	:	'F';
NOT	:	'!';

STATOINIZIALE	:	 'statoIniziale';
STATOFINALE	:	 'statoFinale';
OPERATORE
	:	'operatore';
	
PRECONDIZIONI
	:	'precondizioni';
EFFETTI	:	'effetti';
COSTO	:	'costo';


OGGETTO  :	('O_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+;
VARIABILE  :	('V_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+;
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT :	'0'..'9'+;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')?
    |   '.' ('0'..'9')?
    |   ('0'..'9')
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
ERROR	:
	.
;