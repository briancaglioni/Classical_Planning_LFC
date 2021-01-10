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

}
@members {
ParserEnvironment env;
 ParserSemantic sem;
 
  void init () {
    System.out.println("Inizio l'analisi!\n");
    env = new ParserEnvironment ();
    sem = new ParserSemantic (env);
   }
  
  public Hashtable<String, Hashtable<String, String>> getVariables() {
    return env.symbolTable;
  }
}

start
@init { init(); }
	:	(statement)+
	;
	
statement
	:	(definizione_stato | definizione_operatore | applicazione_azione)
		{ System.out.println(env.getAllSymbols());}
	;
	
definizione_stato
	:	nomeStato=(STATOINIZIALE | STATOFINALE)
	{ sem.registraStato(nomeStato); }
	OPG lista_attributi[nomeStato] CPG 
	
	;

lista_attributi [Token nomeStato]
	:	 attributo[nomeStato]*;

attributo [Token nomeStato]
	:	nomeAttributo=ID OPT nomeOggetto=OGGETTO 
	{sem.registraAttributo(nomeStato, nomeAttributo, nomeOggetto);} 
	CPT (COMMA attributo[nomeStato])*;
	
definizione_operatore
	:	OPERATORE {sem.registraOperatore();} OPG azione COMMA precondizioni COMMA effetti COMMA costo CPG;

precondizioni
	:	preconditions=PRECONDIZIONI EQ OPG lista_attributi_variabili[preconditions] CPG;


lista_attributi_variabili [Token PrecondOrEffects]
	:	 attributo_variabile[PrecondOrEffects]*;

attributo_variabile [Token PrecondOrEffects]
	:	nomeAttributoVariabile=ID OPT nomeVariabile=VARIABILE CPT
	 { sem.registraAttributoVariabile(nomeAttributoVariabile, nomeVariabile, PrecondOrEffects); }
	  (COMMA attributo_variabile[PrecondOrEffects])*;

effetti	
	:	effects=EFFETTI EQ OPG lista_attributi_variabili[effects] CPG;
	
costo	:	COSTO EQ FLOAT;

azione	:	ID OPT lista_variabili CPT;

lista_variabili
	:	VARIABILE (COMMA | VARIABILE)*;

applicazione_azione
	:	ID OPT lista_oggetti CPT;

lista_oggetti
	:	 OGGETTO (COMMA | OGGETTO)*;

/*
command 
	:(COM x=IDM {System.out.println("\nCommand " + $x.getText()); sem.registerState(x);} EQ OP (attr[$x.getText()])+ PV)
	;
statedef 
	: STATE  x=IDm {
	System.out.println("\nStatedef " + $x.getText());
	sem.registerState(x);
	} EQ OP (attr[$x.getText()])+ PV 
	;

attr [String s]
	: x=IDM EQ v=(TRUE | FALSE) (COMMA | CP) {
	sem.registerAttr(s, x, v);
	System.out.println(s + " | " +$x.getText() + "=" + $v.getText());}
	;
	
action	:	
	x=IDm ARROW y=IDM{
	System.out.println("\nAction " + $y.getText()+ " on " + $x.getText());
	System.out.println(getVariables());
	sem.applyCommand($x.getText(), $y.getText());
	System.out.println(getVariables());
	sem.checkObj();
	}
	PV
	;
objective_def 
	: x=OBJ {
	sem.registerState(x);
	System.out.println("Objdef");} EQ OP (attr[$x.getText()])+ PV 
	;
*/
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
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
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

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
