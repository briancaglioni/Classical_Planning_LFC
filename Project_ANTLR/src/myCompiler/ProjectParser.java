// $ANTLR 3.5.1 C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g 2021-01-23 22:59:47

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
		"CPG", "CPT", "EFFETTI", "EQ", "ERROR", "ESC_SEQ", "EXPONENT", "FALSE", 
		"FLOAT", "HEX_DIGIT", "ID", "INT", "NOT", "OCTAL_ESC", "OGGETTO", "OPERATORE", 
		"OPG", "OPT", "PRECONDIZIONI", "PV", "STATOFINALE", "STATOINIZIALE", "STRING", 
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
	public static final int ERROR=12;
	public static final int ESC_SEQ=13;
	public static final int EXPONENT=14;
	public static final int FALSE=15;
	public static final int FLOAT=16;
	public static final int HEX_DIGIT=17;
	public static final int ID=18;
	public static final int INT=19;
	public static final int NOT=20;
	public static final int OCTAL_ESC=21;
	public static final int OGGETTO=22;
	public static final int OPERATORE=23;
	public static final int OPG=24;
	public static final int OPT=25;
	public static final int PRECONDIZIONI=26;
	public static final int PV=27;
	public static final int STATOFINALE=28;
	public static final int STATOINIZIALE=29;
	public static final int STRING=30;
	public static final int TRUE=31;
	public static final int UNICODE_ESC=32;
	public static final int VARIABILE=33;
	public static final int WS=34;

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
	  
	  public void displayRecognitionError(String[] tokenNames,
	                                     RecognitionException e) {
	     String hdr = getErrorHeader(e);
	     String msg = getErrorMessage(e, tokenNames);
	     Token tk = input.LT(1);
	     
	     env.handleError(tokenNames,e,hdr,msg);
	  }
	  



	// $ANTLR start "start"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:44:1: start : ( definizione_stato | definizione_operatore |c= applicazione_azione[c] )+ ;
	public final void start() throws RecognitionException {
		Costo c =null;

		 init(); c = new Costo("0.0"); 
		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:46:2: ( ( definizione_stato | definizione_operatore |c= applicazione_azione[c] )+ )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:46:4: ( definizione_stato | definizione_operatore |c= applicazione_azione[c] )+
			{
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:46:4: ( definizione_stato | definizione_operatore |c= applicazione_azione[c] )+
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
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:46:5: definizione_stato
					{
					pushFollow(FOLLOW_definizione_stato_in_start63);
					definizione_stato();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:46:25: definizione_operatore
					{
					pushFollow(FOLLOW_definizione_operatore_in_start67);
					definizione_operatore();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:46:49: c= applicazione_azione[c]
					{
					pushFollow(FOLLOW_applicazione_azione_in_start73);
					c=applicazione_azione(c);
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

			System.out.println(getVariables()); System.out.println(c);
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:51:1: definizione_stato : nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG (a1= attributo ( COMMA a2= attributo )* )? CPG ;
	public final void definizione_stato() throws RecognitionException {
		Token nomeStato=null;
		Attributo a1 =null;
		Attributo a2 =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:52:2: (nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG (a1= attributo ( COMMA a2= attributo )* )? CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:52:4: nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG (a1= attributo ( COMMA a2= attributo )* )? CPG
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
			match(input,OPG,FOLLOW_OPG_in_definizione_stato110); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:55:5: (a1= attributo ( COMMA a2= attributo )* )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:55:6: a1= attributo ( COMMA a2= attributo )*
					{
					pushFollow(FOLLOW_attributo_in_definizione_stato120);
					a1=attributo();
					state._fsp--;

					x.addAttributo(a1);
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:56:5: ( COMMA a2= attributo )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==COMMA) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:56:7: COMMA a2= attributo
							{
							match(input,COMMA,FOLLOW_COMMA_in_definizione_stato130); 
							pushFollow(FOLLOW_attributo_in_definizione_stato134);
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

			match(input,CPG,FOLLOW_CPG_in_definizione_stato145); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:61:1: attributo returns [Attributo a] : nomeAttributo= ID OPT nomeOggetto= OGGETTO CPT ;
	public final Attributo attributo() throws RecognitionException {
		Attributo a = null;


		Token nomeAttributo=null;
		Token nomeOggetto=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:62:2: (nomeAttributo= ID OPT nomeOggetto= OGGETTO CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:62:4: nomeAttributo= ID OPT nomeOggetto= OGGETTO CPT
			{
			nomeAttributo=(Token)match(input,ID,FOLLOW_ID_in_attributo170); 
			match(input,OPT,FOLLOW_OPT_in_attributo175); 
			nomeOggetto=(Token)match(input,OGGETTO,FOLLOW_OGGETTO_in_attributo183); 
			match(input,CPT,FOLLOW_CPT_in_attributo188); 
			a = new Attributo(nomeAttributo.getText(), new Oggetto(nomeOggetto.getText()));
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:71:1: definizione_operatore : o= OPERATORE OPG a= azione COMMA p= precondizioni COMMA e= effetti COMMA c= costo CPG ;
	public final void definizione_operatore() throws RecognitionException {
		Token o=null;
		Azione a =null;
		Precondizioni p =null;
		Effetti e =null;
		Costo c =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:72:2: (o= OPERATORE OPG a= azione COMMA p= precondizioni COMMA e= effetti COMMA c= costo CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:72:4: o= OPERATORE OPG a= azione COMMA p= precondizioni COMMA e= effetti COMMA c= costo CPG
			{
			o=(Token)match(input,OPERATORE,FOLLOW_OPERATORE_in_definizione_operatore209); 
			match(input,OPG,FOLLOW_OPG_in_definizione_operatore215); 
			pushFollow(FOLLOW_azione_in_definizione_operatore224);
			a=azione();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore226); 
			pushFollow(FOLLOW_precondizioni_in_definizione_operatore237);
			p=precondizioni();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore239); 
			pushFollow(FOLLOW_effetti_in_definizione_operatore249);
			e=effetti();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore251); 
			pushFollow(FOLLOW_costo_in_definizione_operatore261);
			c=costo();
			state._fsp--;

			match(input,CPG,FOLLOW_CPG_in_definizione_operatore269); 
			sem.registraOperatore(a,p,e,c,o);
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:82:1: azione returns [Azione a] : x= ID OPT v1= VARIABILE ( COMMA v2= VARIABILE )* CPT ;
	public final Azione azione() throws RecognitionException {
		Azione a = null;


		Token x=null;
		Token v1=null;
		Token v2=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:82:27: (x= ID OPT v1= VARIABILE ( COMMA v2= VARIABILE )* CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:82:29: x= ID OPT v1= VARIABILE ( COMMA v2= VARIABILE )* CPT
			{
			x=(Token)match(input,ID,FOLLOW_ID_in_azione292); 
			Azione y = new Azione(x.getText());
			match(input,OPT,FOLLOW_OPT_in_azione300); 
			v1=(Token)match(input,VARIABILE,FOLLOW_VARIABILE_in_azione310); 
			y.addVariabile(v1.getText());
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:85:6: ( COMMA v2= VARIABILE )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:85:8: COMMA v2= VARIABILE
					{
					match(input,COMMA,FOLLOW_COMMA_in_azione321); 
					v2=(Token)match(input,VARIABILE,FOLLOW_VARIABILE_in_azione325); 
					y.addVariabile(v2.getText());
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,CPT,FOLLOW_CPT_in_azione337); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:90:1: precondizioni returns [Precondizioni p] : PRECONDIZIONI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG ;
	public final Precondizioni precondizioni() throws RecognitionException {
		Precondizioni p = null;


		AttributoVariabile av1 =null;
		AttributoVariabile av2 =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:91:2: ( PRECONDIZIONI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:91:4: PRECONDIZIONI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG
			{
			match(input,PRECONDIZIONI,FOLLOW_PRECONDIZIONI_in_precondizioni361); 
			Precondizioni pr = new Precondizioni();
			match(input,EQ,FOLLOW_EQ_in_precondizioni368); 
			match(input,OPG,FOLLOW_OPG_in_precondizioni373); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:94:5: (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID||LA6_0==NOT) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:94:6: av1= attributo_variabile ( COMMA av2= attributo_variabile )*
					{
					pushFollow(FOLLOW_attributo_variabile_in_precondizioni382);
					av1=attributo_variabile();
					state._fsp--;

					pr.addAttrVariabile(av1);
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:95:5: ( COMMA av2= attributo_variabile )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMA) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:95:6: COMMA av2= attributo_variabile
							{
							match(input,COMMA,FOLLOW_COMMA_in_precondizioni391); 
							pushFollow(FOLLOW_attributo_variabile_in_precondizioni395);
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

			match(input,CPG,FOLLOW_CPG_in_precondizioni405); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:100:1: effetti returns [Effetti e] : effects= EFFETTI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG ;
	public final Effetti effetti() throws RecognitionException {
		Effetti e = null;


		Token effects=null;
		AttributoVariabile av1 =null;
		AttributoVariabile av2 =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:101:2: (effects= EFFETTI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:101:4: effects= EFFETTI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG
			{
			effects=(Token)match(input,EFFETTI,FOLLOW_EFFETTI_in_effetti427); 
			Effetti ef = new Effetti();
			match(input,EQ,FOLLOW_EQ_in_effetti433); 
			match(input,OPG,FOLLOW_OPG_in_effetti438); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:104:4: (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID||LA8_0==NOT) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:104:5: av1= attributo_variabile ( COMMA av2= attributo_variabile )*
					{
					pushFollow(FOLLOW_attributo_variabile_in_effetti447);
					av1=attributo_variabile();
					state._fsp--;

					ef.addAttrVariabile(av1);
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:105:4: ( COMMA av2= attributo_variabile )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==COMMA) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:105:5: COMMA av2= attributo_variabile
							{
							match(input,COMMA,FOLLOW_COMMA_in_effetti455); 
							pushFollow(FOLLOW_attributo_variabile_in_effetti459);
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

			match(input,CPG,FOLLOW_CPG_in_effetti469); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:110:1: attributo_variabile returns [AttributoVariabile x] : (n= NOT )? nomeAV= ID OPT nomeVar= VARIABILE CPT ;
	public final AttributoVariabile attributo_variabile() throws RecognitionException {
		AttributoVariabile x = null;


		Token n=null;
		Token nomeAV=null;
		Token nomeVar=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:111:2: ( (n= NOT )? nomeAV= ID OPT nomeVar= VARIABILE CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:111:4: (n= NOT )? nomeAV= ID OPT nomeVar= VARIABILE CPT
			{
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:111:5: (n= NOT )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==NOT) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:111:5: n= NOT
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_attributo_variabile491); 
					}
					break;

			}

			nomeAV=(Token)match(input,ID,FOLLOW_ID_in_attributo_variabile498); 
			match(input,OPT,FOLLOW_OPT_in_attributo_variabile502); 
			nomeVar=(Token)match(input,VARIABILE,FOLLOW_VARIABILE_in_attributo_variabile510); 
			match(input,CPT,FOLLOW_CPT_in_attributo_variabile515); 
			x = new AttributoVariabile(nomeAV.getText(), new Variabile(nomeVar.getText()),n);
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:121:1: costo returns [Costo c] : COSTO EQ x= FLOAT ;
	public final Costo costo() throws RecognitionException {
		Costo c = null;


		Token x=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:121:24: ( COSTO EQ x= FLOAT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:121:26: COSTO EQ x= FLOAT
			{
			match(input,COSTO,FOLLOW_COSTO_in_costo535); 
			match(input,EQ,FOLLOW_EQ_in_costo541); 
			x=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_costo549); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:129:1: applicazione_azione[Costo c] returns [Costo c1] : x= ID OPT o1= OGGETTO ( COMMA o2= OGGETTO )* CPT ;
	public final Costo applicazione_azione(Costo c) throws RecognitionException {
		Costo c1 = null;


		Token x=null;
		Token o1=null;
		Token o2=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:130:2: (x= ID OPT o1= OGGETTO ( COMMA o2= OGGETTO )* CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:130:4: x= ID OPT o1= OGGETTO ( COMMA o2= OGGETTO )* CPT
			{
			x=(Token)match(input,ID,FOLLOW_ID_in_applicazione_azione579); 
			Applicazione a = new Applicazione(x.getText());
			match(input,OPT,FOLLOW_OPT_in_applicazione_azione585); 
			o1=(Token)match(input,OGGETTO,FOLLOW_OGGETTO_in_applicazione_azione593); 
			a.addOggetto(o1.getText());
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:133:4: ( COMMA o2= OGGETTO )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:133:5: COMMA o2= OGGETTO
					{
					match(input,COMMA,FOLLOW_COMMA_in_applicazione_azione601); 
					o2=(Token)match(input,OGGETTO,FOLLOW_OGGETTO_in_applicazione_azione605); 
					a.addOggetto(o2.getText());
					}
					break;

				default :
					break loop10;
				}
			}

			match(input,CPT,FOLLOW_CPT_in_applicazione_azione613); 
			 c1 = sem.applicaAzione(a, c);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c1;
	}
	// $ANTLR end "applicazione_azione"

	// Delegated rules



	public static final BitSet FOLLOW_definizione_stato_in_start63 = new BitSet(new long[]{0x0000000030840002L});
	public static final BitSet FOLLOW_definizione_operatore_in_start67 = new BitSet(new long[]{0x0000000030840002L});
	public static final BitSet FOLLOW_applicazione_azione_in_start73 = new BitSet(new long[]{0x0000000030840002L});
	public static final BitSet FOLLOW_set_in_definizione_stato95 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OPG_in_definizione_stato110 = new BitSet(new long[]{0x0000000000040100L});
	public static final BitSet FOLLOW_attributo_in_definizione_stato120 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_COMMA_in_definizione_stato130 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_attributo_in_definizione_stato134 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_CPG_in_definizione_stato145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attributo170 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_OPT_in_attributo175 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OGGETTO_in_attributo183 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_attributo188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPERATORE_in_definizione_operatore209 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OPG_in_definizione_operatore215 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_azione_in_definizione_operatore224 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore226 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_precondizioni_in_definizione_operatore237 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore239 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_effetti_in_definizione_operatore249 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore251 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_costo_in_definizione_operatore261 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPG_in_definizione_operatore269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_azione292 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_OPT_in_azione300 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VARIABILE_in_azione310 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_COMMA_in_azione321 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VARIABILE_in_azione325 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_CPT_in_azione337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRECONDIZIONI_in_precondizioni361 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_precondizioni368 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OPG_in_precondizioni373 = new BitSet(new long[]{0x0000000000140100L});
	public static final BitSet FOLLOW_attributo_variabile_in_precondizioni382 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_COMMA_in_precondizioni391 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_attributo_variabile_in_precondizioni395 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_CPG_in_precondizioni405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EFFETTI_in_effetti427 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_effetti433 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OPG_in_effetti438 = new BitSet(new long[]{0x0000000000140100L});
	public static final BitSet FOLLOW_attributo_variabile_in_effetti447 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_COMMA_in_effetti455 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_attributo_variabile_in_effetti459 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_CPG_in_effetti469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_attributo_variabile491 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ID_in_attributo_variabile498 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_OPT_in_attributo_variabile502 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VARIABILE_in_attributo_variabile510 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CPT_in_attributo_variabile515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COSTO_in_costo535 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_costo541 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_FLOAT_in_costo549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_applicazione_azione579 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_OPT_in_applicazione_azione585 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OGGETTO_in_applicazione_azione593 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_COMMA_in_applicazione_azione601 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_OGGETTO_in_applicazione_azione605 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_CPT_in_applicazione_azione613 = new BitSet(new long[]{0x0000000000000002L});
}
