// $ANTLR 3.5.1 C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g 2021-01-14 23:49:47

	package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjectLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g"; }

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:163:5: ( '=' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:163:7: '='
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:164:5: ( '(' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:164:7: '('
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:165:5: ( ')' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:165:7: ')'
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:166:5: ( '{' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:166:7: '{'
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:167:5: ( '}' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:167:7: '}'
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:168:7: ( ',' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:168:9: ','
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:169:4: ( ';' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:169:6: ';'
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:170:6: ( 'T' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:170:8: 'T'
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:171:8: ( 'F' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:171:10: 'F'
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

	// $ANTLR start "STATOINIZIALE"
	public final void mSTATOINIZIALE() throws RecognitionException {
		try {
			int _type = STATOINIZIALE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:173:15: ( 'statoIniziale' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:173:18: 'statoIniziale'
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:174:13: ( 'statoFinale' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:174:16: 'statoFinale'
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:176:2: ( 'operatore' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:176:4: 'operatore'
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:179:2: ( 'precondizioni' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:179:4: 'precondizioni'
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:180:9: ( 'effetti' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:180:11: 'effetti'
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:181:7: ( 'costo' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:181:9: 'costo'
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:184:10: ( ( 'O_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:184:12: ( 'O_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
			{
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:184:12: ( 'O_' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:184:13: 'O_'
			{
			match("O_"); 

			}

			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:184:19: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
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
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:185:12: ( ( 'V_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:185:14: ( 'V_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
			{
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:185:14: ( 'V_' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:185:15: 'V_'
			{
			match("V_"); 

			}

			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:185:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
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
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:186:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:186:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:186:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:188:5: ( ( '0' .. '9' )+ )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:188:7: ( '0' .. '9' )+
			{
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:188:7: ( '0' .. '9' )+
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
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:191:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:191:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:191:9: ( '0' .. '9' )+
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
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
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
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:191:25: ( '0' .. '9' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
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
							break loop6;
						}
					}

					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:191:37: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:191:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:192:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:192:13: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
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
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:192:25: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:192:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:193:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:193:9: ( '0' .. '9' )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
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
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					mEXPONENT(); 

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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:197:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='/') ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1=='/') ) {
					alt15=1;
				}
				else if ( (LA15_1=='*') ) {
					alt15=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:197:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:197:14: (~ ( '\\n' | '\\r' ) )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
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
							break loop12;
						}
					}

					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:197:28: ( '\\r' )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='\r') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:197:28: '\\r'
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
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:198:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:198:14: ( options {greedy=false; } : . )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0=='*') ) {
							int LA14_1 = input.LA(2);
							if ( (LA14_1=='/') ) {
								alt14=2;
							}
							else if ( ((LA14_1 >= '\u0000' && LA14_1 <= '.')||(LA14_1 >= '0' && LA14_1 <= '\uFFFF')) ) {
								alt14=1;
							}

						}
						else if ( ((LA14_0 >= '\u0000' && LA14_0 <= ')')||(LA14_0 >= '+' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:198:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop14;
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
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:201:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:201:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:209:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:209:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:209:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\\') ) {
					alt16=1;
				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:209:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:209:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
					break loop16;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:212:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:212:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:212:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\\') ) {
				alt17=1;
			}
			else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:212:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:212:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:217:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:217:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:217:22: ( '+' | '-' )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='+'||LA18_0=='-') ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
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

			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:217:33: ( '0' .. '9' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
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
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:220:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:224:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt20=3;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt20=1;
					}
					break;
				case 'u':
					{
					alt20=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt20=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:224:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:225:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:226:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:231:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\\') ) {
				int LA21_1 = input.LA(2);
				if ( ((LA21_1 >= '0' && LA21_1 <= '3')) ) {
					int LA21_2 = input.LA(3);
					if ( ((LA21_2 >= '0' && LA21_2 <= '7')) ) {
						int LA21_4 = input.LA(4);
						if ( ((LA21_4 >= '0' && LA21_4 <= '7')) ) {
							alt21=1;
						}

						else {
							alt21=2;
						}

					}

					else {
						alt21=3;
					}

				}
				else if ( ((LA21_1 >= '4' && LA21_1 <= '7')) ) {
					int LA21_3 = input.LA(3);
					if ( ((LA21_3 >= '0' && LA21_3 <= '7')) ) {
						alt21=2;
					}

					else {
						alt21=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:231:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:232:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:233:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:238:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:238:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:8: ( EQ | OPT | CPT | OPG | CPG | COMMA | PV | TRUE | FALSE | STATOINIZIALE | STATOFINALE | OPERATORE | PRECONDIZIONI | EFFETTI | COSTO | OGGETTO | VARIABILE | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt22=24;
		alt22 = dfa22.predict(input);
		switch (alt22) {
			case 1 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:10: EQ
				{
				mEQ(); 

				}
				break;
			case 2 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:13: OPT
				{
				mOPT(); 

				}
				break;
			case 3 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:17: CPT
				{
				mCPT(); 

				}
				break;
			case 4 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:21: OPG
				{
				mOPG(); 

				}
				break;
			case 5 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:25: CPG
				{
				mCPG(); 

				}
				break;
			case 6 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:29: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 7 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:35: PV
				{
				mPV(); 

				}
				break;
			case 8 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:38: TRUE
				{
				mTRUE(); 

				}
				break;
			case 9 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:43: FALSE
				{
				mFALSE(); 

				}
				break;
			case 10 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:49: STATOINIZIALE
				{
				mSTATOINIZIALE(); 

				}
				break;
			case 11 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:63: STATOFINALE
				{
				mSTATOFINALE(); 

				}
				break;
			case 12 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:75: OPERATORE
				{
				mOPERATORE(); 

				}
				break;
			case 13 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:85: PRECONDIZIONI
				{
				mPRECONDIZIONI(); 

				}
				break;
			case 14 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:99: EFFETTI
				{
				mEFFETTI(); 

				}
				break;
			case 15 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:107: COSTO
				{
				mCOSTO(); 

				}
				break;
			case 16 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:113: OGGETTO
				{
				mOGGETTO(); 

				}
				break;
			case 17 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:121: VARIABILE
				{
				mVARIABILE(); 

				}
				break;
			case 18 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:131: ID
				{
				mID(); 

				}
				break;
			case 19 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:134: INT
				{
				mINT(); 

				}
				break;
			case 20 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:138: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 21 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:144: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 22 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:152: WS
				{
				mWS(); 

				}
				break;
			case 23 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:155: STRING
				{
				mSTRING(); 

				}
				break;
			case 24 :
				// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:1:162: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA22 dfa22 = new DFA22(this);
	static final String DFA11_eotS =
		"\5\uffff";
	static final String DFA11_eofS =
		"\5\uffff";
	static final String DFA11_minS =
		"\2\56\3\uffff";
	static final String DFA11_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA11_specialS =
		"\5\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "190:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA22_eotS =
		"\10\uffff\1\30\1\31\7\21\1\uffff\1\41\7\uffff\7\21\1\uffff\5\21\1\56\1"+
		"\57\5\21\2\uffff\4\21\1\72\5\21\1\uffff\4\21\1\104\4\21\1\uffff\2\21\1"+
		"\113\3\21\1\uffff\2\21\1\121\2\21\1\uffff\1\21\1\125\1\126\2\uffff";
	static final String DFA22_eofS =
		"\127\uffff";
	static final String DFA22_minS =
		"\1\11\7\uffff\2\60\1\164\1\160\1\162\1\146\1\157\2\137\1\uffff\1\56\7"+
		"\uffff\1\141\2\145\1\146\1\163\2\60\1\uffff\1\164\1\162\1\143\1\145\1"+
		"\164\2\60\1\157\1\141\1\157\1\164\1\157\2\uffff\1\106\1\164\1\156\1\164"+
		"\1\60\1\156\1\151\1\157\1\144\1\151\1\uffff\1\151\1\156\1\162\1\151\1"+
		"\60\1\172\1\141\1\145\1\172\1\uffff\1\151\1\154\1\60\1\151\1\141\1\145"+
		"\1\uffff\1\157\1\154\1\60\1\156\1\145\1\uffff\1\151\2\60\2\uffff";
	static final String DFA22_maxS =
		"\1\175\7\uffff\2\172\1\164\1\160\1\162\1\146\1\157\2\137\1\uffff\1\145"+
		"\7\uffff\1\141\2\145\1\146\1\163\2\172\1\uffff\1\164\1\162\1\143\1\145"+
		"\1\164\2\172\1\157\1\141\1\157\1\164\1\157\2\uffff\1\111\1\164\1\156\1"+
		"\164\1\172\1\156\1\151\1\157\1\144\1\151\1\uffff\1\151\1\156\1\162\1\151"+
		"\2\172\1\141\1\145\1\172\1\uffff\1\151\1\154\1\172\1\151\1\141\1\145\1"+
		"\uffff\1\157\1\154\1\172\1\156\1\145\1\uffff\1\151\2\172\2\uffff";
	static final String DFA22_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\11\uffff\1\22\1\uffff\1\24\1\25\1"+
		"\26\1\27\1\30\1\10\1\11\7\uffff\1\23\14\uffff\1\20\1\21\12\uffff\1\17"+
		"\11\uffff\1\16\6\uffff\1\14\5\uffff\1\13\3\uffff\1\12\1\15";
	static final String DFA22_specialS =
		"\127\uffff}>";
	static final String[] DFA22_transitionS = {
			"\2\25\2\uffff\1\25\22\uffff\1\25\1\uffff\1\26\4\uffff\1\27\1\2\1\3\2"+
			"\uffff\1\6\1\uffff\1\23\1\24\12\22\1\uffff\1\7\1\uffff\1\1\3\uffff\5"+
			"\21\1\11\10\21\1\17\4\21\1\10\1\21\1\20\4\21\4\uffff\1\21\1\uffff\2\21"+
			"\1\16\1\21\1\15\11\21\1\13\1\14\2\21\1\12\7\21\1\4\1\uffff\1\5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"",
			"\1\23\1\uffff\12\22\13\uffff\1\23\37\uffff\1\23",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"",
			"",
			"\1\66\2\uffff\1\65",
			"\1\67",
			"\1\70",
			"\1\71",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"\1\111",
			"\1\112",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\114",
			"\1\115",
			"\1\116",
			"",
			"\1\117",
			"\1\120",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\122",
			"\1\123",
			"",
			"\1\124",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( EQ | OPT | CPT | OPG | CPG | COMMA | PV | TRUE | FALSE | STATOINIZIALE | STATOFINALE | OPERATORE | PRECONDIZIONI | EFFETTI | COSTO | OGGETTO | VARIABILE | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
