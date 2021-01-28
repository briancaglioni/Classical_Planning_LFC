// $ANTLR 3.5.1 C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g 2021-01-28 22:25:32

	package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjectLexer extends Lexer {
	public static final int EOF=-1;
	public static final int COMMA=4;
	public static final int COMMENT=5;
	public static final int COSTO=6;
	public static final int CPG=7;
	public static final int CPT=8;
	public static final int EFFETTI=9;
	public static final int EQ=10;
	public static final int ERROR=11;
	public static final int FALSE=12;
	public static final int FLOAT=13;
	public static final int ID=14;
	public static final int INT=15;
	public static final int NOT=16;
	public static final int OGGETTO=17;
	public static final int OPERATORE=18;
	public static final int OPG=19;
	public static final int OPT=20;
	public static final int PRECONDIZIONI=21;
	public static final int PV=22;
	public static final int STATOFINALE=23;
	public static final int STATOINIZIALE=24;
	public static final int TRUE=25;
	public static final int VARIABILE=26;
	public static final int WS=27;



	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjectLexer() {} 
	public ProjectLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjectLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g"; }

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:142:5: ( '=' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:142:7: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "OPT"
	public final void mOPT() throws RecognitionException {
		try {
			int _type = OPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:143:5: ( '(' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:143:7: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPT"

	// $ANTLR start "CPT"
	public final void mCPT() throws RecognitionException {
		try {
			int _type = CPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:144:5: ( ')' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:144:7: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CPT"

	// $ANTLR start "OPG"
	public final void mOPG() throws RecognitionException {
		try {
			int _type = OPG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:145:5: ( '{' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:145:7: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPG"

	// $ANTLR start "CPG"
	public final void mCPG() throws RecognitionException {
		try {
			int _type = CPG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:146:5: ( '}' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:146:7: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CPG"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:147:7: ( ',' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:147:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "PV"
	public final void mPV() throws RecognitionException {
		try {
			int _type = PV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:148:4: ( ';' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:148:6: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PV"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:149:6: ( 'T' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:149:8: 'T'
			{
			match('T'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:150:8: ( 'F' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:150:10: 'F'
			{
			match('F'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:151:5: ( '!' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:151:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "STATOINIZIALE"
	public final void mSTATOINIZIALE() throws RecognitionException {
		try {
			int _type = STATOINIZIALE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:153:15: ( 'statoIniziale' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:153:18: 'statoIniziale'
			{
			match("statoIniziale"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATOINIZIALE"

	// $ANTLR start "STATOFINALE"
	public final void mSTATOFINALE() throws RecognitionException {
		try {
			int _type = STATOFINALE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:154:13: ( 'statoFinale' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:154:16: 'statoFinale'
			{
			match("statoFinale"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATOFINALE"

	// $ANTLR start "OPERATORE"
	public final void mOPERATORE() throws RecognitionException {
		try {
			int _type = OPERATORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:156:2: ( 'operatore' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:156:4: 'operatore'
			{
			match("operatore"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPERATORE"

	// $ANTLR start "PRECONDIZIONI"
	public final void mPRECONDIZIONI() throws RecognitionException {
		try {
			int _type = PRECONDIZIONI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:159:2: ( 'precondizioni' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:159:4: 'precondizioni'
			{
			match("precondizioni"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRECONDIZIONI"

	// $ANTLR start "EFFETTI"
	public final void mEFFETTI() throws RecognitionException {
		try {
			int _type = EFFETTI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:160:9: ( 'effetti' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:160:11: 'effetti'
			{
			match("effetti"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EFFETTI"

	// $ANTLR start "COSTO"
	public final void mCOSTO() throws RecognitionException {
		try {
			int _type = COSTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:161:7: ( 'costo' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:161:9: 'costo'
			{
			match("costo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COSTO"

	// $ANTLR start "OGGETTO"
	public final void mOGGETTO() throws RecognitionException {
		try {
			int _type = OGGETTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:164:10: ( ( 'O_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:164:12: ( 'O_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
			{
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:164:12: ( 'O_' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:164:13: 'O_'
			{
			match("O_"); 

			}

			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:164:19: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OGGETTO"

	// $ANTLR start "VARIABILE"
	public final void mVARIABILE() throws RecognitionException {
		try {
			int _type = VARIABILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:165:12: ( ( 'V_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:165:14: ( 'V_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
			{
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:165:14: ( 'V_' )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:165:15: 'V_'
			{
			match("V_"); 

			}

			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:165:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABILE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:166:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:166:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:166:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:168:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:168:7: ( '0' .. '9' )+
			{
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:168:7: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:171:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )? | '.' ( '0' .. '9' )? | ( '0' .. '9' ) )
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='.'||(LA8_1 >= '0' && LA8_1 <= '9')) ) {
					alt8=1;
				}

				else {
					alt8=3;
				}

			}
			else if ( (LA8_0=='.') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:171:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )?
					{
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:171:9: ( '0' .. '9' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					match('.'); 
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:171:25: ( '0' .. '9' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:172:9: '.' ( '0' .. '9' )?
					{
					match('.'); 
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:172:13: ( '0' .. '9' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:173:9: ( '0' .. '9' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:177:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='/') ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1=='/') ) {
					alt12=1;
				}
				else if ( (LA12_1=='*') ) {
					alt12=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:177:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:177:14: (~ ( '\\n' | '\\r' ) )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:177:28: ( '\\r' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='\r') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:177:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:178:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:178:14: ( options {greedy=false; } : . )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0=='*') ) {
							int LA11_1 = input.LA(2);
							if ( (LA11_1=='/') ) {
								alt11=2;
							}
							else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
								alt11=1;
							}

						}
						else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:178:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop11;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:181:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:181:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ERROR"
	public final void mERROR() throws RecognitionException {
		try {
			int _type = ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:187:7: ( . )
			// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:188:2: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:8: ( EQ | OPT | CPT | OPG | CPG | COMMA | PV | TRUE | FALSE | NOT | STATOINIZIALE | STATOFINALE | OPERATORE | PRECONDIZIONI | EFFETTI | COSTO | OGGETTO | VARIABILE | ID | INT | FLOAT | COMMENT | WS | ERROR )
		int alt13=24;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:10: EQ
				{
				mEQ(); 

				}
				break;
			case 2 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:13: OPT
				{
				mOPT(); 

				}
				break;
			case 3 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:17: CPT
				{
				mCPT(); 

				}
				break;
			case 4 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:21: OPG
				{
				mOPG(); 

				}
				break;
			case 5 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:25: CPG
				{
				mCPG(); 

				}
				break;
			case 6 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:29: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 7 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:35: PV
				{
				mPV(); 

				}
				break;
			case 8 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:38: TRUE
				{
				mTRUE(); 

				}
				break;
			case 9 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:43: FALSE
				{
				mFALSE(); 

				}
				break;
			case 10 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:49: NOT
				{
				mNOT(); 

				}
				break;
			case 11 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:53: STATOINIZIALE
				{
				mSTATOINIZIALE(); 

				}
				break;
			case 12 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:67: STATOFINALE
				{
				mSTATOFINALE(); 

				}
				break;
			case 13 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:79: OPERATORE
				{
				mOPERATORE(); 

				}
				break;
			case 14 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:89: PRECONDIZIONI
				{
				mPRECONDIZIONI(); 

				}
				break;
			case 15 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:103: EFFETTI
				{
				mEFFETTI(); 

				}
				break;
			case 16 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:111: COSTO
				{
				mCOSTO(); 

				}
				break;
			case 17 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:117: OGGETTO
				{
				mOGGETTO(); 

				}
				break;
			case 18 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:125: VARIABILE
				{
				mVARIABILE(); 

				}
				break;
			case 19 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:135: ID
				{
				mID(); 

				}
				break;
			case 20 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:138: INT
				{
				mINT(); 

				}
				break;
			case 21 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:142: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 22 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:148: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 23 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:156: WS
				{
				mWS(); 

				}
				break;
			case 24 :
				// C:\\Users\\MorBri\\Documents\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:159: ERROR
				{
				mERROR(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA13_eotS =
		"\10\uffff\1\37\1\41\1\uffff\7\40\1\uffff\1\52\1\uffff\1\27\15\uffff\7"+
		"\40\1\uffff\1\52\3\uffff\5\40\1\73\1\74\5\40\2\uffff\4\40\1\107\5\40\1"+
		"\uffff\4\40\1\121\4\40\1\uffff\2\40\1\130\3\40\1\uffff\2\40\1\136\2\40"+
		"\1\uffff\1\40\1\142\1\143\2\uffff";
	static final String DFA13_eofS =
		"\144\uffff";
	static final String DFA13_minS =
		"\1\0\7\uffff\2\60\1\uffff\1\164\1\160\1\162\1\146\1\157\2\137\1\uffff"+
		"\1\56\1\uffff\1\52\15\uffff\1\141\2\145\1\146\1\163\2\60\1\uffff\1\56"+
		"\3\uffff\1\164\1\162\1\143\1\145\1\164\2\60\1\157\1\141\1\157\1\164\1"+
		"\157\2\uffff\1\106\1\164\1\156\1\164\1\60\1\156\1\151\1\157\1\144\1\151"+
		"\1\uffff\1\151\1\156\1\162\1\151\1\60\1\172\1\141\1\145\1\172\1\uffff"+
		"\1\151\1\154\1\60\1\151\1\141\1\145\1\uffff\1\157\1\154\1\60\1\156\1\145"+
		"\1\uffff\1\151\2\60\2\uffff";
	static final String DFA13_maxS =
		"\1\uffff\7\uffff\2\172\1\uffff\1\164\1\160\1\162\1\146\1\157\2\137\1\uffff"+
		"\1\71\1\uffff\1\57\15\uffff\1\141\2\145\1\146\1\163\2\172\1\uffff\1\71"+
		"\3\uffff\1\164\1\162\1\143\1\145\1\164\2\172\1\157\1\141\1\157\1\164\1"+
		"\157\2\uffff\1\111\1\164\1\156\1\164\1\172\1\156\1\151\1\157\1\144\1\151"+
		"\1\uffff\1\151\1\156\1\162\1\151\2\172\1\141\1\145\1\172\1\uffff\1\151"+
		"\1\154\1\172\1\151\1\141\1\145\1\uffff\1\157\1\154\1\172\1\156\1\145\1"+
		"\uffff\1\151\2\172\2\uffff";
	static final String DFA13_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\12\7\uffff\1\23\1\uffff"+
		"\1\25\1\uffff\1\27\1\30\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\23\1\11\1\12"+
		"\7\uffff\1\24\1\uffff\1\25\1\26\1\27\14\uffff\1\21\1\22\12\uffff\1\20"+
		"\11\uffff\1\17\6\uffff\1\15\5\uffff\1\14\3\uffff\1\13\1\16";
	static final String DFA13_specialS =
		"\1\0\143\uffff}>";
	static final String[] DFA13_transitionS = {
			"\11\27\2\26\2\27\1\26\22\27\1\26\1\12\6\27\1\2\1\3\2\27\1\6\1\27\1\24"+
			"\1\25\12\23\1\27\1\7\1\27\1\1\3\27\5\22\1\11\10\22\1\20\4\22\1\10\1\22"+
			"\1\21\4\22\4\27\1\22\1\27\2\22\1\17\1\22\1\16\11\22\1\14\1\15\2\22\1"+
			"\13\7\22\1\4\1\27\1\5\uff82\27",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"",
			"\1\54\1\uffff\12\53",
			"",
			"\1\55\4\uffff\1\55",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\54\1\uffff\12\53",
			"",
			"",
			"",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"",
			"",
			"\1\103\2\uffff\1\102",
			"\1\104",
			"\1\105",
			"\1\106",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"",
			"\1\126",
			"\1\127",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\131",
			"\1\132",
			"\1\133",
			"",
			"\1\134",
			"\1\135",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\137",
			"\1\140",
			"",
			"\1\141",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( EQ | OPT | CPT | OPG | CPG | COMMA | PV | TRUE | FALSE | NOT | STATOINIZIALE | STATOFINALE | OPERATORE | PRECONDIZIONI | EFFETTI | COSTO | OGGETTO | VARIABILE | ID | INT | FLOAT | COMMENT | WS | ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_0 = input.LA(1);
						s = -1;
						if ( (LA13_0=='=') ) {s = 1;}
						else if ( (LA13_0=='(') ) {s = 2;}
						else if ( (LA13_0==')') ) {s = 3;}
						else if ( (LA13_0=='{') ) {s = 4;}
						else if ( (LA13_0=='}') ) {s = 5;}
						else if ( (LA13_0==',') ) {s = 6;}
						else if ( (LA13_0==';') ) {s = 7;}
						else if ( (LA13_0=='T') ) {s = 8;}
						else if ( (LA13_0=='F') ) {s = 9;}
						else if ( (LA13_0=='!') ) {s = 10;}
						else if ( (LA13_0=='s') ) {s = 11;}
						else if ( (LA13_0=='o') ) {s = 12;}
						else if ( (LA13_0=='p') ) {s = 13;}
						else if ( (LA13_0=='e') ) {s = 14;}
						else if ( (LA13_0=='c') ) {s = 15;}
						else if ( (LA13_0=='O') ) {s = 16;}
						else if ( (LA13_0=='V') ) {s = 17;}
						else if ( ((LA13_0 >= 'A' && LA13_0 <= 'E')||(LA13_0 >= 'G' && LA13_0 <= 'N')||(LA13_0 >= 'P' && LA13_0 <= 'S')||LA13_0=='U'||(LA13_0 >= 'W' && LA13_0 <= 'Z')||LA13_0=='_'||(LA13_0 >= 'a' && LA13_0 <= 'b')||LA13_0=='d'||(LA13_0 >= 'f' && LA13_0 <= 'n')||(LA13_0 >= 'q' && LA13_0 <= 'r')||(LA13_0 >= 't' && LA13_0 <= 'z')) ) {s = 18;}
						else if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {s = 19;}
						else if ( (LA13_0=='.') ) {s = 20;}
						else if ( (LA13_0=='/') ) {s = 21;}
						else if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 22;}
						else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\b')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\u001F')||(LA13_0 >= '\"' && LA13_0 <= '\'')||(LA13_0 >= '*' && LA13_0 <= '+')||LA13_0=='-'||LA13_0==':'||LA13_0=='<'||(LA13_0 >= '>' && LA13_0 <= '@')||(LA13_0 >= '[' && LA13_0 <= '^')||LA13_0=='`'||LA13_0=='|'||(LA13_0 >= '~' && LA13_0 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
