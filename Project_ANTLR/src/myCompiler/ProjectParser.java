// $ANTLR 3.5.1 C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g 2021-01-14 23:49:47

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
	@Override public String getGrammarFileName() { return "C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g"; }


	ParserEnvironment env;
	 ParserSemantic sem;
	 
	  void init () {
	    System.out.println("Inizio l'analisi!\n");
	    env = new ParserEnvironment ();
	    sem = new ParserSemantic (env);
	   }
	  
	  public Hashtable<String, Symbol> getVariables() {
	    return env.symbolTable;
	  }



	// $ANTLR start "start"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:34:1: start : ( definizione_stato | definizione_operatore | applicazione_azione )+ ;
	public final void start() throws RecognitionException {
		 init(); 
		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:36:2: ( ( definizione_stato | definizione_operatore | applicazione_azione )+ )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:36:4: ( definizione_stato | definizione_operatore | applicazione_azione )+
			{
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:36:4: ( definizione_stato | definizione_operatore | applicazione_azione )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=4;
				switch ( input.LA(1) ) {
				case STATOFINALE:
				case STATOINIZIALE:
					{
					alt1=1;
					}
					break;
				case OPERATORE:
					{
					alt1=2;
					}
					break;
				case ID:
					{
					alt1=3;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:36:5: definizione_stato
					{
					pushFollow(FOLLOW_definizione_stato_in_start63);
					definizione_stato();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:36:25: definizione_operatore
					{
					pushFollow(FOLLOW_definizione_operatore_in_start67);
					definizione_operatore();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:36:49: applicazione_azione
					{
					pushFollow(FOLLOW_applicazione_azione_in_start71);
					applicazione_azione();
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



	// $ANTLR start "definizione_stato"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:40:1: definizione_stato : nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG (a1= attributo ( COMMA a2= attributo )* )? CPG ;
	public final void definizione_stato() throws RecognitionException {
		Token nomeStato=null;
		Attributo a1 =null;
		Attributo a2 =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:41:2: (nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG (a1= attributo ( COMMA a2= attributo )* )? CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:41:4: nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG (a1= attributo ( COMMA a2= attributo )* )? CPG
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
			Stato x = new Stato(nomeStato.getText()); 
			match(input,OPG,FOLLOW_OPG_in_definizione_stato103); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:44:5: (a1= attributo ( COMMA a2= attributo )* )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:44:6: a1= attributo ( COMMA a2= attributo )*
					{
					pushFollow(FOLLOW_attributo_in_definizione_stato113);
					a1=attributo();
					state._fsp--;

					x.addAttributo(a1);
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:45:5: ( COMMA a2= attributo )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==COMMA) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:45:7: COMMA a2= attributo
							{
							match(input,COMMA,FOLLOW_COMMA_in_definizione_stato123); 
							pushFollow(FOLLOW_attributo_in_definizione_stato127);
							a2=attributo();
							state._fsp--;

							x.addAttributo(a2);
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;

			}

			match(input,CPG,FOLLOW_CPG_in_definizione_stato138); 
			sem.registraStato(x);
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



	// $ANTLR start "attributo"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:50:1: attributo returns [Attributo a] : nomeAttributo= ID OPT nomeOggetto= OGGETTO CPT ;
	public final Attributo attributo() throws RecognitionException {
		Attributo a = null;


		Token nomeAttributo=null;
		Token nomeOggetto=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:51:2: (nomeAttributo= ID OPT nomeOggetto= OGGETTO CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:51:4: nomeAttributo= ID OPT nomeOggetto= OGGETTO CPT
			{
			nomeAttributo=(Token)match(input,ID,FOLLOW_ID_in_attributo163); 
			match(input,OPT,FOLLOW_OPT_in_attributo168); 
			nomeOggetto=(Token)match(input,OGGETTO,FOLLOW_OGGETTO_in_attributo176); 
			match(input,CPT,FOLLOW_CPT_in_attributo181); 
			a = new Attributo(nomeAttributo.getText(), nomeOggetto.getText());
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return a;
	}
	// $ANTLR end "attributo"



	// $ANTLR start "definizione_operatore"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:60:1: definizione_operatore : OPERATORE OPG a= azione COMMA p= precondizioni COMMA e= effetti COMMA c= costo CPG ;
	public final void definizione_operatore() throws RecognitionException {
		Azione a =null;
		Precondizioni p =null;
		Effetti e =null;
		Costo c =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:61:2: ( OPERATORE OPG a= azione COMMA p= precondizioni COMMA e= effetti COMMA c= costo CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:61:4: OPERATORE OPG a= azione COMMA p= precondizioni COMMA e= effetti COMMA c= costo CPG
			{
			match(input,OPERATORE,FOLLOW_OPERATORE_in_definizione_operatore200); 
			match(input,OPG,FOLLOW_OPG_in_definizione_operatore206); 
			pushFollow(FOLLOW_azione_in_definizione_operatore215);
			a=azione();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore217); 
			pushFollow(FOLLOW_precondizioni_in_definizione_operatore228);
			p=precondizioni();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore230); 
			pushFollow(FOLLOW_effetti_in_definizione_operatore240);
			e=effetti();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore242); 
			pushFollow(FOLLOW_costo_in_definizione_operatore252);
			c=costo();
			state._fsp--;

			match(input,CPG,FOLLOW_CPG_in_definizione_operatore260); 
			sem.registraOperatore(a,p,e,c);
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



	// $ANTLR start "azione"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:71:1: azione returns [Azione a] : x= ID OPT v1= VARIABILE ( COMMA v2= VARIABILE )* CPT ;
	public final Azione azione() throws RecognitionException {
		Azione a = null;


		Token x=null;
		Token v1=null;
		Token v2=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:71:27: (x= ID OPT v1= VARIABILE ( COMMA v2= VARIABILE )* CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:71:29: x= ID OPT v1= VARIABILE ( COMMA v2= VARIABILE )* CPT
			{
			x=(Token)match(input,ID,FOLLOW_ID_in_azione283); 
			Azione y = new Azione(x.getText());
			match(input,OPT,FOLLOW_OPT_in_azione291); 
			v1=(Token)match(input,VARIABILE,FOLLOW_VARIABILE_in_azione301); 
			y.addVariabile(v1.getText());
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:74:6: ( COMMA v2= VARIABILE )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:74:8: COMMA v2= VARIABILE
					{
					match(input,COMMA,FOLLOW_COMMA_in_azione312); 
					v2=(Token)match(input,VARIABILE,FOLLOW_VARIABILE_in_azione316); 
					y.addVariabile(v2.getText());
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,CPT,FOLLOW_CPT_in_azione328); 
			a = y;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return a;
	}
	// $ANTLR end "azione"



	// $ANTLR start "precondizioni"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:79:1: precondizioni returns [Precondizioni p] : PRECONDIZIONI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG ;
	public final Precondizioni precondizioni() throws RecognitionException {
		Precondizioni p = null;


		AttributoVariabile av1 =null;
		AttributoVariabile av2 =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:80:2: ( PRECONDIZIONI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:80:4: PRECONDIZIONI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG
			{
			match(input,PRECONDIZIONI,FOLLOW_PRECONDIZIONI_in_precondizioni352); 
			Precondizioni pr = new Precondizioni();
			match(input,EQ,FOLLOW_EQ_in_precondizioni359); 
			match(input,OPG,FOLLOW_OPG_in_precondizioni364); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:83:5: (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:83:6: av1= attributo_variabile ( COMMA av2= attributo_variabile )*
					{
					pushFollow(FOLLOW_attributo_variabile_in_precondizioni373);
					av1=attributo_variabile();
					state._fsp--;

					pr.addAttrVariabile(av1);
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:84:5: ( COMMA av2= attributo_variabile )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMA) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:84:6: COMMA av2= attributo_variabile
							{
							match(input,COMMA,FOLLOW_COMMA_in_precondizioni382); 
							pushFollow(FOLLOW_attributo_variabile_in_precondizioni386);
							av2=attributo_variabile();
							state._fsp--;

							pr.addAttrVariabile(av2);
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			match(input,CPG,FOLLOW_CPG_in_precondizioni396); 
			p = pr;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "precondizioni"



	// $ANTLR start "effetti"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:89:1: effetti returns [Effetti e] : effects= EFFETTI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG ;
	public final Effetti effetti() throws RecognitionException {
		Effetti e = null;


		Token effects=null;
		AttributoVariabile av1 =null;
		AttributoVariabile av2 =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:90:2: (effects= EFFETTI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:90:4: effects= EFFETTI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG
			{
			effects=(Token)match(input,EFFETTI,FOLLOW_EFFETTI_in_effetti418); 
			Effetti ef = new Effetti();
			match(input,EQ,FOLLOW_EQ_in_effetti424); 
			match(input,OPG,FOLLOW_OPG_in_effetti429); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:93:4: (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:93:5: av1= attributo_variabile ( COMMA av2= attributo_variabile )*
					{
					pushFollow(FOLLOW_attributo_variabile_in_effetti438);
					av1=attributo_variabile();
					state._fsp--;

					ef.addAttrVariabile(av1);
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:94:4: ( COMMA av2= attributo_variabile )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==COMMA) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:94:5: COMMA av2= attributo_variabile
							{
							match(input,COMMA,FOLLOW_COMMA_in_effetti446); 
							pushFollow(FOLLOW_attributo_variabile_in_effetti450);
							av2=attributo_variabile();
							state._fsp--;

							ef.addAttrVariabile(av2);
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}

			match(input,CPG,FOLLOW_CPG_in_effetti460); 
			e = ef;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "effetti"



	// $ANTLR start "attributo_variabile"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:99:1: attributo_variabile returns [AttributoVariabile x] : nomeAV= ID OPT nomeVar= VARIABILE CPT ;
	public final AttributoVariabile attributo_variabile() throws RecognitionException {
		AttributoVariabile x = null;


		Token nomeAV=null;
		Token nomeVar=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:100:2: (nomeAV= ID OPT nomeVar= VARIABILE CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:100:4: nomeAV= ID OPT nomeVar= VARIABILE CPT
			{
			nomeAV=(Token)match(input,ID,FOLLOW_ID_in_attributo_variabile482); 
			match(input,OPT,FOLLOW_OPT_in_attributo_variabile486); 
			nomeVar=(Token)match(input,VARIABILE,FOLLOW_VARIABILE_in_attributo_variabile494); 
			match(input,CPT,FOLLOW_CPT_in_attributo_variabile499); 
			x = new AttributoVariabile(nomeAV.getText(), nomeVar.getText());
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return x;
	}
	// $ANTLR end "attributo_variabile"



	// $ANTLR start "costo"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:109:1: costo returns [Costo c] : COSTO EQ x= FLOAT ;
	public final Costo costo() throws RecognitionException {
		Costo c = null;


		Token x=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:109:24: ( COSTO EQ x= FLOAT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:109:26: COSTO EQ x= FLOAT
			{
			match(input,COSTO,FOLLOW_COSTO_in_costo519); 
			match(input,EQ,FOLLOW_EQ_in_costo525); 
			x=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_costo533); 
			c = new Costo(x.getText());
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "costo"



	// $ANTLR start "applicazione_azione"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:117:1: applicazione_azione : x= ID OPT o1= OGGETTO ( COMMA o2= OGGETTO )* CPT ;
	public final void applicazione_azione() throws RecognitionException {
		Token x=null;
		Token o1=null;
		Token o2=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:118:2: (x= ID OPT o1= OGGETTO ( COMMA o2= OGGETTO )* CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:118:4: x= ID OPT o1= OGGETTO ( COMMA o2= OGGETTO )* CPT
			{
			x=(Token)match(input,ID,FOLLOW_ID_in_applicazione_azione557); 
			Applicazione a = new Applicazione(x.getText());
			match(input,OPT,FOLLOW_OPT_in_applicazione_azione563); 
			o1=(Token)match(input,OGGETTO,FOLLOW_OGGETTO_in_applicazione_azione571); 
			a.addOggetto(o1.getText());
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:121:4: ( COMMA o2= OGGETTO )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:121:5: COMMA o2= OGGETTO
					{
					match(input,COMMA,FOLLOW_COMMA_in_applicazione_azione579); 
					o2=(Token)match(input,OGGETTO,FOLLOW_OGGETTO_in_applicazione_azione583); 
					a.addOggetto(o2.getText());
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,CPT,FOLLOW_CPT_in_applicazione_azione591); 
			a.esegui();
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

	// Delegated rules



	public static final BitSet FOLLOW_definizione_stato_in_start63 = new BitSet(new long[]{0x000000000C220002L});
	public static final BitSet FOLLOW_definizione_operatore_in_start67 = new BitSet(new long[]{0x000000000C220002L});
	public static final BitSet FOLLOW_applicazione_azione_in_start71 = new BitSet(new long[]{0x000000000C220002L});
	public static final BitSet FOLLOW_set_in_definizione_stato88 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_definizione_stato103 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_attributo_in_definizione_stato113 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_COMMA_in_definizione_stato123 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_attributo_in_definizione_stato127 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_CPG_in_definizione_stato138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attributo163 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_attributo168 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_OGGETTO_in_attributo176 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_attributo181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPERATORE_in_definizione_operatore200 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_definizione_operatore206 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_azione_in_definizione_operatore215 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore217 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_precondizioni_in_definizione_operatore228 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore230 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_effetti_in_definizione_operatore240 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore242 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_costo_in_definizione_operatore252 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPG_in_definizione_operatore260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_azione283 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_azione291 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_VARIABILE_in_azione301 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_COMMA_in_azione312 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_VARIABILE_in_azione316 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_CPT_in_azione328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRECONDIZIONI_in_precondizioni352 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_precondizioni359 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_precondizioni364 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_attributo_variabile_in_precondizioni373 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_COMMA_in_precondizioni382 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_attributo_variabile_in_precondizioni386 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_CPG_in_precondizioni396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EFFETTI_in_effetti418 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_effetti424 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OPG_in_effetti429 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_attributo_variabile_in_effetti438 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_COMMA_in_effetti446 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_attributo_variabile_in_effetti450 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_CPG_in_effetti460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attributo_variabile482 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_attributo_variabile486 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_VARIABILE_in_attributo_variabile494 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_attributo_variabile499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COSTO_in_costo519 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_costo525 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_FLOAT_in_costo533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_applicazione_azione557 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OPT_in_applicazione_azione563 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_OGGETTO_in_applicazione_azione571 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_COMMA_in_applicazione_azione579 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_OGGETTO_in_applicazione_azione583 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_CPT_in_applicazione_azione591 = new BitSet(new long[]{0x0000000000000002L});
}
