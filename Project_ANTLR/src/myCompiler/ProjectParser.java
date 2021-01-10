// $ANTLR 3.5.1 C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g 2021-01-11 00:17:00

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
	@Override public String getGrammarFileName() { return "C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g"; }


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



	// $ANTLR start "start"
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:34:1: start : ( statement )+ ;
	public final void start() throws RecognitionException {
		 init(); 
		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:36:2: ( ( statement )+ )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:36:4: ( statement )+
			{
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:36:4: ( statement )+
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
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:36:5: statement
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:39:1: statement : ( definizione_stato | definizione_operatore | applicazione_azione ) ;
	public final void statement() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:40:2: ( ( definizione_stato | definizione_operatore | applicazione_azione ) )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:40:4: ( definizione_stato | definizione_operatore | applicazione_azione )
			{
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:40:4: ( definizione_stato | definizione_operatore | applicazione_azione )
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
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:40:5: definizione_stato
					{
					pushFollow(FOLLOW_definizione_stato_in_statement78);
					definizione_stato();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:40:25: definizione_operatore
					{
					pushFollow(FOLLOW_definizione_operatore_in_statement82);
					definizione_operatore();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:40:49: applicazione_azione
					{
					pushFollow(FOLLOW_applicazione_azione_in_statement86);
					applicazione_azione();
					state._fsp--;

					}
					break;

			}

			 System.out.println(env.getAllSymbols());
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:44:1: definizione_stato : nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG lista_attributi[nomeStato] CPG ;
	public final void definizione_stato() throws RecognitionException {
		Token nomeStato=null;

		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:45:2: (nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG lista_attributi[nomeStato] CPG )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:45:4: nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG lista_attributi[nomeStato] CPG
			{
			nomeStato=input.LT(1);
			if ( (input.LA(1) >= STATOFINALE && input.LA(1) <= STATOINIZIALE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 sem.registraStato(nomeStato); 
			match(input,OPG,FOLLOW_OPG_in_definizione_stato117); 
			pushFollow(FOLLOW_lista_attributi_in_definizione_stato119);
			lista_attributi(nomeStato);
			state._fsp--;

			match(input,CPG,FOLLOW_CPG_in_definizione_stato122); 
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:51:1: lista_attributi[Token nomeStato] : ( attributo[nomeStato] )* ;
	public final void lista_attributi(Token nomeStato) throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:52:2: ( ( attributo[nomeStato] )* )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:52:5: ( attributo[nomeStato] )*
			{
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:52:5: ( attributo[nomeStato] )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:52:5: attributo[nomeStato]
					{
					pushFollow(FOLLOW_attributo_in_lista_attributi139);
					attributo(nomeStato);
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:54:1: attributo[Token nomeStato] : nomeAttributo= ID OPT nomeOggetto= OGGETTO CPT ( COMMA attributo[nomeStato] )* ;
	public final void attributo(Token nomeStato) throws RecognitionException {
		Token nomeAttributo=null;
		Token nomeOggetto=null;

		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:55:2: (nomeAttributo= ID OPT nomeOggetto= OGGETTO CPT ( COMMA attributo[nomeStato] )* )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:55:4: nomeAttributo= ID OPT nomeOggetto= OGGETTO CPT ( COMMA attributo[nomeStato] )*
			{
			nomeAttributo=(Token)match(input,ID,FOLLOW_ID_in_attributo154); 
			match(input,OPT,FOLLOW_OPT_in_attributo156); 
			nomeOggetto=(Token)match(input,OGGETTO,FOLLOW_OGGETTO_in_attributo160); 
			sem.registraAttributo(nomeStato, nomeAttributo, nomeOggetto);
			match(input,CPT,FOLLOW_CPT_in_attributo168); 
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:57:6: ( COMMA attributo[nomeStato] )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:57:7: COMMA attributo[nomeStato]
					{
					match(input,COMMA,FOLLOW_COMMA_in_attributo171); 
					pushFollow(FOLLOW_attributo_in_attributo173);
					attributo(nomeStato);
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:59:1: definizione_operatore : OPERATORE OPG azione COMMA precondizioni COMMA effetti COMMA costo CPG ;
	public final void definizione_operatore() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:60:2: ( OPERATORE OPG azione COMMA precondizioni COMMA effetti COMMA costo CPG )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:60:4: OPERATORE OPG azione COMMA precondizioni COMMA effetti COMMA costo CPG
			{
			match(input,OPERATORE,FOLLOW_OPERATORE_in_definizione_operatore186); 
			sem.registraOperatore();
			match(input,OPG,FOLLOW_OPG_in_definizione_operatore190); 
			pushFollow(FOLLOW_azione_in_definizione_operatore192);
			azione();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore194); 
			pushFollow(FOLLOW_precondizioni_in_definizione_operatore196);
			precondizioni();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore198); 
			pushFollow(FOLLOW_effetti_in_definizione_operatore200);
			effetti();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore202); 
			pushFollow(FOLLOW_costo_in_definizione_operatore204);
			costo();
			state._fsp--;

			match(input,CPG,FOLLOW_CPG_in_definizione_operatore206); 
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:62:1: precondizioni : preconditions= PRECONDIZIONI EQ OPG lista_attributi_variabili[preconditions] CPG ;
	public final void precondizioni() throws RecognitionException {
		Token preconditions=null;

		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:63:2: (preconditions= PRECONDIZIONI EQ OPG lista_attributi_variabili[preconditions] CPG )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:63:4: preconditions= PRECONDIZIONI EQ OPG lista_attributi_variabili[preconditions] CPG
			{
			preconditions=(Token)match(input,PRECONDIZIONI,FOLLOW_PRECONDIZIONI_in_precondizioni217); 
			match(input,EQ,FOLLOW_EQ_in_precondizioni219); 
			match(input,OPG,FOLLOW_OPG_in_precondizioni221); 
			pushFollow(FOLLOW_lista_attributi_variabili_in_precondizioni223);
			lista_attributi_variabili(preconditions);
			state._fsp--;

			match(input,CPG,FOLLOW_CPG_in_precondizioni226); 
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:66:1: lista_attributi_variabili[Token PrecondOrEffects] : ( attributo_variabile[PrecondOrEffects] )* ;
	public final void lista_attributi_variabili(Token PrecondOrEffects) throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:67:2: ( ( attributo_variabile[PrecondOrEffects] )* )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:67:5: ( attributo_variabile[PrecondOrEffects] )*
			{
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:67:5: ( attributo_variabile[PrecondOrEffects] )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:67:5: attributo_variabile[PrecondOrEffects]
					{
					pushFollow(FOLLOW_attributo_variabile_in_lista_attributi_variabili239);
					attributo_variabile(PrecondOrEffects);
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:69:1: attributo_variabile[Token PrecondOrEffects] : nomeAttributoVariabile= ID OPT nomeVariabile= VARIABILE CPT ( COMMA attributo_variabile[PrecondOrEffects] )* ;
	public final void attributo_variabile(Token PrecondOrEffects) throws RecognitionException {
		Token nomeAttributoVariabile=null;
		Token nomeVariabile=null;

		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:70:2: (nomeAttributoVariabile= ID OPT nomeVariabile= VARIABILE CPT ( COMMA attributo_variabile[PrecondOrEffects] )* )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:70:4: nomeAttributoVariabile= ID OPT nomeVariabile= VARIABILE CPT ( COMMA attributo_variabile[PrecondOrEffects] )*
			{
			nomeAttributoVariabile=(Token)match(input,ID,FOLLOW_ID_in_attributo_variabile254); 
			match(input,OPT,FOLLOW_OPT_in_attributo_variabile256); 
			nomeVariabile=(Token)match(input,VARIABILE,FOLLOW_VARIABILE_in_attributo_variabile260); 
			match(input,CPT,FOLLOW_CPT_in_attributo_variabile262); 
			 sem.registraAttributoVariabile(nomeAttributoVariabile, nomeVariabile, PrecondOrEffects); 
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:72:4: ( COMMA attributo_variabile[PrecondOrEffects] )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:72:5: COMMA attributo_variabile[PrecondOrEffects]
					{
					match(input,COMMA,FOLLOW_COMMA_in_attributo_variabile272); 
					pushFollow(FOLLOW_attributo_variabile_in_attributo_variabile274);
					attributo_variabile(PrecondOrEffects);
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:74:1: effetti : effects= EFFETTI EQ OPG lista_attributi_variabili[effects] CPG ;
	public final void effetti() throws RecognitionException {
		Token effects=null;

		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:75:2: (effects= EFFETTI EQ OPG lista_attributi_variabili[effects] CPG )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:75:4: effects= EFFETTI EQ OPG lista_attributi_variabili[effects] CPG
			{
			effects=(Token)match(input,EFFETTI,FOLLOW_EFFETTI_in_effetti289); 
			match(input,EQ,FOLLOW_EQ_in_effetti291); 
			match(input,OPG,FOLLOW_OPG_in_effetti293); 
			pushFollow(FOLLOW_lista_attributi_variabili_in_effetti295);
			lista_attributi_variabili(effects);
			state._fsp--;

			match(input,CPG,FOLLOW_CPG_in_effetti298); 
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:77:1: costo : COSTO EQ FLOAT ;
	public final void costo() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:77:7: ( COSTO EQ FLOAT )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:77:9: COSTO EQ FLOAT
			{
			match(input,COSTO,FOLLOW_COSTO_in_costo307); 
			match(input,EQ,FOLLOW_EQ_in_costo309); 
			match(input,FLOAT,FOLLOW_FLOAT_in_costo311); 
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:79:1: azione : ID OPT lista_variabili CPT ;
	public final void azione() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:79:8: ( ID OPT lista_variabili CPT )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:79:10: ID OPT lista_variabili CPT
			{
			match(input,ID,FOLLOW_ID_in_azione319); 
			match(input,OPT,FOLLOW_OPT_in_azione321); 
			pushFollow(FOLLOW_lista_variabili_in_azione323);
			lista_variabili();
			state._fsp--;

			match(input,CPT,FOLLOW_CPT_in_azione325); 
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:81:1: lista_variabili : VARIABILE ( COMMA | VARIABILE )* ;
	public final void lista_variabili() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:82:2: ( VARIABILE ( COMMA | VARIABILE )* )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:82:4: VARIABILE ( COMMA | VARIABILE )*
			{
			match(input,VARIABILE,FOLLOW_VARIABILE_in_lista_variabili334); 
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:82:14: ( COMMA | VARIABILE )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA||LA7_0==VARIABILE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:84:1: applicazione_azione : ID OPT lista_oggetti CPT ;
	public final void applicazione_azione() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:85:2: ( ID OPT lista_oggetti CPT )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:85:4: ID OPT lista_oggetti CPT
			{
			match(input,ID,FOLLOW_ID_in_applicazione_azione352); 
			match(input,OPT,FOLLOW_OPT_in_applicazione_azione354); 
			pushFollow(FOLLOW_lista_oggetti_in_applicazione_azione356);
			lista_oggetti();
			state._fsp--;

			match(input,CPT,FOLLOW_CPT_in_applicazione_azione358); 
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
	// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:87:1: lista_oggetti : OGGETTO ( COMMA | OGGETTO )* ;
	public final void lista_oggetti() throws RecognitionException {
		try {
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:88:2: ( OGGETTO ( COMMA | OGGETTO )* )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:88:5: OGGETTO ( COMMA | OGGETTO )*
			{
			match(input,OGGETTO,FOLLOW_OGGETTO_in_lista_oggetti368); 
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:88:13: ( COMMA | OGGETTO )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA||LA8_0==OGGETTO) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\Project.g:
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
	public static final BitSet FOLLOW_set_in_definizione_stato105 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_definizione_stato117 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_lista_attributi_in_definizione_stato119 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPG_in_definizione_stato122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributo_in_lista_attributi139 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ID_in_attributo154 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_attributo156 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_OGGETTO_in_attributo160 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_attributo168 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_attributo171 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_attributo_in_attributo173 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_OPERATORE_in_definizione_operatore186 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_definizione_operatore190 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_azione_in_definizione_operatore192 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore194 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_precondizioni_in_definizione_operatore196 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore198 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_effetti_in_definizione_operatore200 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore202 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_costo_in_definizione_operatore204 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPG_in_definizione_operatore206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRECONDIZIONI_in_precondizioni217 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_precondizioni219 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_precondizioni221 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_lista_attributi_variabili_in_precondizioni223 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPG_in_precondizioni226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributo_variabile_in_lista_attributi_variabili239 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ID_in_attributo_variabile254 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_attributo_variabile256 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_VARIABILE_in_attributo_variabile260 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_attributo_variabile262 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_attributo_variabile272 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_attributo_variabile_in_attributo_variabile274 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_EFFETTI_in_effetti289 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_effetti291 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_effetti293 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_lista_attributi_variabili_in_effetti295 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPG_in_effetti298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COSTO_in_costo307 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_costo309 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_FLOAT_in_costo311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_azione319 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_azione321 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_lista_variabili_in_azione323 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_azione325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABILE_in_lista_variabili334 = new BitSet(new long[]{0x0000000080000022L});
	public static final BitSet FOLLOW_ID_in_applicazione_azione352 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_applicazione_azione354 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_lista_oggetti_in_applicazione_azione356 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_applicazione_azione358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OGGETTO_in_lista_oggetti368 = new BitSet(new long[]{0x0000000000100022L});
}
