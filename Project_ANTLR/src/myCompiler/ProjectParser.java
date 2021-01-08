// $ANTLR 3.5.1 C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g 2021-01-08 22:44:51

package myCompiler;
import util.*;
import java.util.Hashtable;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjectParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMA", "COMMENT", "COSTO", 
		"CPG", "CPT", "EFFETTI", "EQ", "ESC_SEQ", "EXPONENT", "FALSE", "FLOAT", 
		"HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "OGGETTO", "OPERATORE", "OPG", 
		"OPT", "PRECONDIZIONI", "PV", "STATOFINALE", "STATOINIZIALE", "STRING", 
		"TRUE", "UNICODE_ESC", "VARIABILE", "WS"
	};
	public static final int EOF=-1;
	public static final int CHAR=4;
	public static final int COMMA=5;
	public static final int COMMENT=6;
	public static final int COSTO=7;
	public static final int CPG=8;
	public static final int CPT=9;
	public static final int EFFETTI=10;
	public static final int EQ=11;
	public static final int ESC_SEQ=12;
	public static final int EXPONENT=13;
	public static final int FALSE=14;
	public static final int FLOAT=15;
	public static final int HEX_DIGIT=16;
	public static final int ID=17;
	public static final int INT=18;
	public static final int OCTAL_ESC=19;
	public static final int OGGETTO=20;
	public static final int OPERATORE=21;
	public static final int OPG=22;
	public static final int OPT=23;
	public static final int PRECONDIZIONI=24;
	public static final int PV=25;
	public static final int STATOFINALE=26;
	public static final int STATOINIZIALE=27;
	public static final int STRING=28;
	public static final int TRUE=29;
	public static final int UNICODE_ESC=30;
	public static final int VARIABILE=31;
	public static final int WS=32;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjectParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjectParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjectParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g"; }


	ParserEnvironment env;
	 ParserSemantic sem;
	 
	  void init () {
	    System.out.println("Inizio l'analisi\n");
	    env = new ParserEnvironment ();
	    sem = new ParserSemantic (env);
	   }
	  
	  public Hashtable<String, Hashtable<String, String>> getVariables() {
	    return env.symbolTable;
	  }
	  
	




	// $ANTLR start "start"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:34:1: start : ( statement )+ ;
	public final void start() throws RecognitionException {
		 init(); 
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:36:2: ( ( statement )+ )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:36:4: ( statement )+
			{
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:36:4: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==OPERATORE||(LA1_0 >= STATOFINALE && LA1_0 <= STATOINIZIALE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:36:5: statement
					{
					pushFollow(FOLLOW_statement_in_start63);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"



	// $ANTLR start "statement"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:39:1: statement : ( definizione_stato | definizione_operatore | applicazione_azione ) ;
	public final void statement() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:40:2: ( ( definizione_stato | definizione_operatore | applicazione_azione ) )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:40:4: ( definizione_stato | definizione_operatore | applicazione_azione )
			{
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:40:4: ( definizione_stato | definizione_operatore | applicazione_azione )
			int alt2=3;
			switch ( input.LA(1) ) {
			case STATOFINALE:
			case STATOINIZIALE:
				{
				alt2=1;
				}
				break;
			case OPERATORE:
				{
				alt2=2;
				}
				break;
			case ID:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:40:5: definizione_stato
					{
					pushFollow(FOLLOW_definizione_stato_in_statement78);
					definizione_stato();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:40:25: definizione_operatore
					{
					pushFollow(FOLLOW_definizione_operatore_in_statement82);
					definizione_operatore();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:40:49: applicazione_azione
					{
					pushFollow(FOLLOW_applicazione_azione_in_statement86);
					applicazione_azione();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "definizione_stato"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:43:1: definizione_stato : ( STATOINIZIALE | STATOFINALE ) OPG lista_attributi CPG ;
	public final void definizione_stato() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:44:2: ( ( STATOINIZIALE | STATOFINALE ) OPG lista_attributi CPG )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:44:4: ( STATOINIZIALE | STATOFINALE ) OPG lista_attributi CPG
			{
			if ( (input.LA(1) >= STATOFINALE && input.LA(1) <= STATOINIZIALE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,OPG,FOLLOW_OPG_in_definizione_stato107); 
			pushFollow(FOLLOW_lista_attributi_in_definizione_stato109);
			lista_attributi();
			state._fsp--;

			match(input,CPG,FOLLOW_CPG_in_definizione_stato111); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "definizione_stato"



	// $ANTLR start "lista_attributi"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:46:1: lista_attributi : ( attributo )* ;
	public final void lista_attributi() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:47:2: ( ( attributo )* )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:47:5: ( attributo )*
			{
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:47:5: ( attributo )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:47:5: attributo
					{
					pushFollow(FOLLOW_attributo_in_lista_attributi121);
					attributo();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lista_attributi"



	// $ANTLR start "attributo"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:49:1: attributo : ID OPT OGGETTO CPT ( COMMA attributo )* ;
	public final void attributo() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:50:2: ( ID OPT OGGETTO CPT ( COMMA attributo )* )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:50:4: ID OPT OGGETTO CPT ( COMMA attributo )*
			{
			match(input,ID,FOLLOW_ID_in_attributo131); 
			match(input,OPT,FOLLOW_OPT_in_attributo133); 
			match(input,OGGETTO,FOLLOW_OGGETTO_in_attributo135); 
			match(input,CPT,FOLLOW_CPT_in_attributo137); 
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:50:23: ( COMMA attributo )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:50:24: COMMA attributo
					{
					match(input,COMMA,FOLLOW_COMMA_in_attributo140); 
					pushFollow(FOLLOW_attributo_in_attributo142);
					attributo();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "attributo"



	// $ANTLR start "definizione_operatore"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:52:1: definizione_operatore : OPERATORE OPG azione COMMA precondizioni COMMA effetti COMMA costo CPG ;
	public final void definizione_operatore() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:53:2: ( OPERATORE OPG azione COMMA precondizioni COMMA effetti COMMA costo CPG )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:53:4: OPERATORE OPG azione COMMA precondizioni COMMA effetti COMMA costo CPG
			{
			match(input,OPERATORE,FOLLOW_OPERATORE_in_definizione_operatore154); 
			match(input,OPG,FOLLOW_OPG_in_definizione_operatore156); 
			pushFollow(FOLLOW_azione_in_definizione_operatore158);
			azione();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore160); 
			pushFollow(FOLLOW_precondizioni_in_definizione_operatore162);
			precondizioni();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore164); 
			pushFollow(FOLLOW_effetti_in_definizione_operatore166);
			effetti();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore168); 
			pushFollow(FOLLOW_costo_in_definizione_operatore170);
			costo();
			state._fsp--;

			match(input,CPG,FOLLOW_CPG_in_definizione_operatore172); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "definizione_operatore"



	// $ANTLR start "precondizioni"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:55:1: precondizioni : PRECONDIZIONI EQ OPG lista_attributi_variabili CPG ;
	public final void precondizioni() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:56:2: ( PRECONDIZIONI EQ OPG lista_attributi_variabili CPG )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:56:4: PRECONDIZIONI EQ OPG lista_attributi_variabili CPG
			{
			match(input,PRECONDIZIONI,FOLLOW_PRECONDIZIONI_in_precondizioni181); 
			match(input,EQ,FOLLOW_EQ_in_precondizioni183); 
			match(input,OPG,FOLLOW_OPG_in_precondizioni185); 
			pushFollow(FOLLOW_lista_attributi_variabili_in_precondizioni187);
			lista_attributi_variabili();
			state._fsp--;

			match(input,CPG,FOLLOW_CPG_in_precondizioni189); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "precondizioni"



	// $ANTLR start "lista_attributi_variabili"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:59:1: lista_attributi_variabili : ( attributo_variabile )* ;
	public final void lista_attributi_variabili() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:60:2: ( ( attributo_variabile )* )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:60:5: ( attributo_variabile )*
			{
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:60:5: ( attributo_variabile )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:60:5: attributo_variabile
					{
					pushFollow(FOLLOW_attributo_variabile_in_lista_attributi_variabili200);
					attributo_variabile();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lista_attributi_variabili"



	// $ANTLR start "attributo_variabile"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:62:1: attributo_variabile : ID OPT VARIABILE CPT ( COMMA attributo_variabile )* ;
	public final void attributo_variabile() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:63:2: ( ID OPT VARIABILE CPT ( COMMA attributo_variabile )* )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:63:4: ID OPT VARIABILE CPT ( COMMA attributo_variabile )*
			{
			match(input,ID,FOLLOW_ID_in_attributo_variabile210); 
			match(input,OPT,FOLLOW_OPT_in_attributo_variabile212); 
			match(input,VARIABILE,FOLLOW_VARIABILE_in_attributo_variabile214); 
			match(input,CPT,FOLLOW_CPT_in_attributo_variabile216); 
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:63:25: ( COMMA attributo_variabile )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:63:26: COMMA attributo_variabile
					{
					match(input,COMMA,FOLLOW_COMMA_in_attributo_variabile219); 
					pushFollow(FOLLOW_attributo_variabile_in_attributo_variabile221);
					attributo_variabile();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "attributo_variabile"



	// $ANTLR start "effetti"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:65:1: effetti : EFFETTI EQ OPG lista_attributi_variabili CPG ;
	public final void effetti() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:66:2: ( EFFETTI EQ OPG lista_attributi_variabili CPG )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:66:4: EFFETTI EQ OPG lista_attributi_variabili CPG
			{
			match(input,EFFETTI,FOLLOW_EFFETTI_in_effetti233); 
			match(input,EQ,FOLLOW_EQ_in_effetti235); 
			match(input,OPG,FOLLOW_OPG_in_effetti237); 
			pushFollow(FOLLOW_lista_attributi_variabili_in_effetti239);
			lista_attributi_variabili();
			state._fsp--;

			match(input,CPG,FOLLOW_CPG_in_effetti241); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "effetti"



	// $ANTLR start "costo"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:68:1: costo : COSTO EQ FLOAT ;
	public final void costo() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:68:7: ( COSTO EQ FLOAT )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:68:9: COSTO EQ FLOAT
			{
			match(input,COSTO,FOLLOW_COSTO_in_costo250); 
			match(input,EQ,FOLLOW_EQ_in_costo252); 
			match(input,FLOAT,FOLLOW_FLOAT_in_costo254); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "costo"



	// $ANTLR start "azione"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:70:1: azione : ID OPT lista_variabili CPT ;
	public final void azione() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:70:8: ( ID OPT lista_variabili CPT )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:70:10: ID OPT lista_variabili CPT
			{
			match(input,ID,FOLLOW_ID_in_azione262); 
			match(input,OPT,FOLLOW_OPT_in_azione264); 
			pushFollow(FOLLOW_lista_variabili_in_azione266);
			lista_variabili();
			state._fsp--;

			match(input,CPT,FOLLOW_CPT_in_azione268); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "azione"



	// $ANTLR start "lista_variabili"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:72:1: lista_variabili : VARIABILE ( COMMA | VARIABILE )* ;
	public final void lista_variabili() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:73:2: ( VARIABILE ( COMMA | VARIABILE )* )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:73:4: VARIABILE ( COMMA | VARIABILE )*
			{
			match(input,VARIABILE,FOLLOW_VARIABILE_in_lista_variabili277); 
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:73:14: ( COMMA | VARIABILE )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA||LA7_0==VARIABILE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:
					{
					if ( input.LA(1)==COMMA||input.LA(1)==VARIABILE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lista_variabili"



	// $ANTLR start "applicazione_azione"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:75:1: applicazione_azione : ID OPT lista_oggetti CPT ;
	public final void applicazione_azione() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:76:2: ( ID OPT lista_oggetti CPT )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:76:4: ID OPT lista_oggetti CPT
			{
			match(input,ID,FOLLOW_ID_in_applicazione_azione295); 
			match(input,OPT,FOLLOW_OPT_in_applicazione_azione297); 
			pushFollow(FOLLOW_lista_oggetti_in_applicazione_azione299);
			lista_oggetti();
			state._fsp--;

			match(input,CPT,FOLLOW_CPT_in_applicazione_azione301); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "applicazione_azione"



	// $ANTLR start "lista_oggetti"
	// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:78:1: lista_oggetti : OGGETTO ( COMMA | OGGETTO )* ;
	public final void lista_oggetti() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:79:2: ( OGGETTO ( COMMA | OGGETTO )* )
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:79:5: OGGETTO ( COMMA | OGGETTO )*
			{
			match(input,OGGETTO,FOLLOW_OGGETTO_in_lista_oggetti311); 
			// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:79:13: ( COMMA | OGGETTO )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA||LA8_0==OGGETTO) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\MorBri\\eclipse-workspace\\Project_ANTLR\\src\\Project.g:
					{
					if ( input.LA(1)==COMMA||input.LA(1)==OGGETTO ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lista_oggetti"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_start63 = new BitSet(new long[]{0x000000000C220002L});
	public static final BitSet FOLLOW_definizione_stato_in_statement78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definizione_operatore_in_statement82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_applicazione_azione_in_statement86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_definizione_stato99 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_definizione_stato107 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_lista_attributi_in_definizione_stato109 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPG_in_definizione_stato111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributo_in_lista_attributi121 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ID_in_attributo131 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_attributo133 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_OGGETTO_in_attributo135 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_attributo137 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_attributo140 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_attributo_in_attributo142 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_OPERATORE_in_definizione_operatore154 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_definizione_operatore156 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_azione_in_definizione_operatore158 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore160 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_precondizioni_in_definizione_operatore162 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore164 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_effetti_in_definizione_operatore166 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore168 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_costo_in_definizione_operatore170 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPG_in_definizione_operatore172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRECONDIZIONI_in_precondizioni181 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_precondizioni183 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_precondizioni185 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_lista_attributi_variabili_in_precondizioni187 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPG_in_precondizioni189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributo_variabile_in_lista_attributi_variabili200 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ID_in_attributo_variabile210 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_attributo_variabile212 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_VARIABILE_in_attributo_variabile214 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_attributo_variabile216 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_attributo_variabile219 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_attributo_variabile_in_attributo_variabile221 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_EFFETTI_in_effetti233 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_effetti235 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_effetti237 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_lista_attributi_variabili_in_effetti239 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPG_in_effetti241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COSTO_in_costo250 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_costo252 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_FLOAT_in_costo254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_azione262 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_azione264 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_lista_variabili_in_azione266 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_azione268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABILE_in_lista_variabili277 = new BitSet(new long[]{0x0000000080000022L});
	public static final BitSet FOLLOW_ID_in_applicazione_azione295 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_applicazione_azione297 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_lista_oggetti_in_applicazione_azione299 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_applicazione_azione301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OGGETTO_in_lista_oggetti311 = new BitSet(new long[]{0x0000000000100022L});
}
