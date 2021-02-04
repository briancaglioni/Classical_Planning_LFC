// $ANTLR 3.5.1 C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g 2021-02-04 15:00:04

package myCompiler;
import util.*;
import java.util.Hashtable;
import java.util.Scanner;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjectParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "COMMENT", "COSTO", "CPG", 
		"CPT", "EFFETTI", "EQ", "ERROR", "FALSE", "FLOAT", "ID", "INT", "NOT", 
		"OGGETTO", "OPERATORE", "OPG", "OPT", "PRECONDIZIONI", "PV", "STATOFINALE", 
		"STATOINIZIALE", "TRUE", "VARIABILE", "WS"
	};
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
	    //env = new ParserEnvironment (GestioneInput.getInput("console"), GestioneInput.getInput("file"));
	    env = new ParserEnvironment (true, true);
	    sem = new ParserSemantic (env);
	    
	   }
	  
	  public Hashtable<String, Symbol> getVariables() {
	    return env.symbolTable;
	  }
	  
	  public void displayRecognitionError(String[] tokenNames,
	                                     RecognitionException e) {
	     System.err.println("ERROREEE");
	     String hdr = getErrorHeader(e);
	     String msg = getErrorMessage(e, tokenNames);
	     Token tk = input.LT(1);
	     
	    env.handleError(tokenNames,e,hdr,msg);
	 }
	  



	// $ANTLR start "start"
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:48:1: start : ( definizione_stato | definizione_operatore |c= applicazione_azione[c] )+ EOF ;
	public final void start() throws RecognitionException {
		Costo c =null;

		 init(); c = new Costo("0.0"); 
		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:50:2: ( ( definizione_stato | definizione_operatore |c= applicazione_azione[c] )+ EOF )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:50:4: ( definizione_stato | definizione_operatore |c= applicazione_azione[c] )+ EOF
			{
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:50:4: ( definizione_stato | definizione_operatore |c= applicazione_azione[c] )+
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
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:50:5: definizione_stato
					{
					pushFollow(FOLLOW_definizione_stato_in_start63);
					definizione_stato();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:50:25: definizione_operatore
					{
					pushFollow(FOLLOW_definizione_operatore_in_start67);
					definizione_operatore();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:50:49: c= applicazione_azione[c]
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

			env.printStatiPercorsi();
			match(input,EOF,FOLLOW_EOF_in_start84); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:56:1: definizione_stato : nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG (a1= attributo ( COMMA a2= attributo )* )? CPG ;
	public final void definizione_stato() throws RecognitionException {
		Token nomeStato=null;
		Attributo a1 =null;
		Attributo a2 =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:57:2: (nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG (a1= attributo ( COMMA a2= attributo )* )? CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:57:4: nomeStato= ( STATOINIZIALE | STATOFINALE ) OPG (a1= attributo ( COMMA a2= attributo )* )? CPG
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
			match(input,OPG,FOLLOW_OPG_in_definizione_stato114); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:60:5: (a1= attributo ( COMMA a2= attributo )* )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:60:6: a1= attributo ( COMMA a2= attributo )*
					{
					pushFollow(FOLLOW_attributo_in_definizione_stato124);
					a1=attributo();
					state._fsp--;

					x.addAttributo(a1);
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:61:5: ( COMMA a2= attributo )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==COMMA) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:61:7: COMMA a2= attributo
							{
							match(input,COMMA,FOLLOW_COMMA_in_definizione_stato134); 
							pushFollow(FOLLOW_attributo_in_definizione_stato138);
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

			match(input,CPG,FOLLOW_CPG_in_definizione_stato149); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:66:1: attributo returns [Attributo a] : nomeAttributo= ID OPT (o1= OGGETTO ( COMMA o2= OGGETTO )* )? CPT ;
	public final Attributo attributo() throws RecognitionException {
		Attributo a = null;


		Token nomeAttributo=null;
		Token o1=null;
		Token o2=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:67:2: (nomeAttributo= ID OPT (o1= OGGETTO ( COMMA o2= OGGETTO )* )? CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:67:4: nomeAttributo= ID OPT (o1= OGGETTO ( COMMA o2= OGGETTO )* )? CPT
			{
			nomeAttributo=(Token)match(input,ID,FOLLOW_ID_in_attributo174); 
			a = new Attributo(nomeAttributo.getText());
			match(input,OPT,FOLLOW_OPT_in_attributo183); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:70:4: (o1= OGGETTO ( COMMA o2= OGGETTO )* )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==OGGETTO) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:70:5: o1= OGGETTO ( COMMA o2= OGGETTO )*
					{
					o1=(Token)match(input,OGGETTO,FOLLOW_OGGETTO_in_attributo192); 
					a.addOggetto(o1.getText());
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:71:4: ( COMMA o2= OGGETTO )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:71:6: COMMA o2= OGGETTO
							{
							match(input,COMMA,FOLLOW_COMMA_in_attributo201); 
							o2=(Token)match(input,OGGETTO,FOLLOW_OGGETTO_in_attributo205); 
							a.addOggetto(o2.getText());
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;

			}

			match(input,CPT,FOLLOW_CPT_in_attributo215); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:77:1: definizione_operatore : o= OPERATORE OPG a= azione COMMA p= precondizioni COMMA e= effetti COMMA c= costo CPG ;
	public final void definizione_operatore() throws RecognitionException {
		Token o=null;
		Azione a =null;
		Precondizioni p =null;
		Effetti e =null;
		Costo c =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:78:2: (o= OPERATORE OPG a= azione COMMA p= precondizioni COMMA e= effetti COMMA c= costo CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:78:4: o= OPERATORE OPG a= azione COMMA p= precondizioni COMMA e= effetti COMMA c= costo CPG
			{
			o=(Token)match(input,OPERATORE,FOLLOW_OPERATORE_in_definizione_operatore232); 
			match(input,OPG,FOLLOW_OPG_in_definizione_operatore238); 
			pushFollow(FOLLOW_azione_in_definizione_operatore247);
			a=azione();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore249); 
			pushFollow(FOLLOW_precondizioni_in_definizione_operatore260);
			p=precondizioni();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore262); 
			pushFollow(FOLLOW_effetti_in_definizione_operatore272);
			e=effetti();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_definizione_operatore274); 
			pushFollow(FOLLOW_costo_in_definizione_operatore284);
			c=costo();
			state._fsp--;

			match(input,CPG,FOLLOW_CPG_in_definizione_operatore292); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:88:1: azione returns [Azione a] : x= ID OPT v1= VARIABILE ( COMMA v2= VARIABILE )* CPT ;
	public final Azione azione() throws RecognitionException {
		Azione a = null;


		Token x=null;
		Token v1=null;
		Token v2=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:88:27: (x= ID OPT v1= VARIABILE ( COMMA v2= VARIABILE )* CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:88:29: x= ID OPT v1= VARIABILE ( COMMA v2= VARIABILE )* CPT
			{
			x=(Token)match(input,ID,FOLLOW_ID_in_azione315); 
			Azione y = new Azione(x.getText());
			match(input,OPT,FOLLOW_OPT_in_azione323); 
			v1=(Token)match(input,VARIABILE,FOLLOW_VARIABILE_in_azione333); 
			y.addVariabile(v1.getText());
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:91:6: ( COMMA v2= VARIABILE )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:91:8: COMMA v2= VARIABILE
					{
					match(input,COMMA,FOLLOW_COMMA_in_azione344); 
					v2=(Token)match(input,VARIABILE,FOLLOW_VARIABILE_in_azione348); 
					y.addVariabile(v2.getText());
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,CPT,FOLLOW_CPT_in_azione360); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:96:1: precondizioni returns [Precondizioni p] : PRECONDIZIONI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG ;
	public final Precondizioni precondizioni() throws RecognitionException {
		Precondizioni p = null;


		AttributoVariabile av1 =null;
		AttributoVariabile av2 =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:97:2: ( PRECONDIZIONI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:97:4: PRECONDIZIONI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG
			{
			match(input,PRECONDIZIONI,FOLLOW_PRECONDIZIONI_in_precondizioni384); 
			Precondizioni pr = new Precondizioni();
			match(input,EQ,FOLLOW_EQ_in_precondizioni391); 
			match(input,OPG,FOLLOW_OPG_in_precondizioni396); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:100:5: (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID||LA8_0==NOT) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:100:6: av1= attributo_variabile ( COMMA av2= attributo_variabile )*
					{
					pushFollow(FOLLOW_attributo_variabile_in_precondizioni405);
					av1=attributo_variabile();
					state._fsp--;

					pr.addAttrVariabile(av1);
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:101:5: ( COMMA av2= attributo_variabile )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==COMMA) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:101:6: COMMA av2= attributo_variabile
							{
							match(input,COMMA,FOLLOW_COMMA_in_precondizioni414); 
							pushFollow(FOLLOW_attributo_variabile_in_precondizioni418);
							av2=attributo_variabile();
							state._fsp--;

							pr.addAttrVariabile(av2);
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}

			match(input,CPG,FOLLOW_CPG_in_precondizioni428); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:106:1: effetti returns [Effetti e] : effects= EFFETTI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG ;
	public final Effetti effetti() throws RecognitionException {
		Effetti e = null;


		Token effects=null;
		AttributoVariabile av1 =null;
		AttributoVariabile av2 =null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:107:2: (effects= EFFETTI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:107:4: effects= EFFETTI EQ OPG (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )? CPG
			{
			effects=(Token)match(input,EFFETTI,FOLLOW_EFFETTI_in_effetti450); 
			Effetti ef = new Effetti();
			match(input,EQ,FOLLOW_EQ_in_effetti456); 
			match(input,OPG,FOLLOW_OPG_in_effetti461); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:110:4: (av1= attributo_variabile ( COMMA av2= attributo_variabile )* )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID||LA10_0==NOT) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:110:5: av1= attributo_variabile ( COMMA av2= attributo_variabile )*
					{
					pushFollow(FOLLOW_attributo_variabile_in_effetti470);
					av1=attributo_variabile();
					state._fsp--;

					ef.addAttrVariabile(av1);
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:111:4: ( COMMA av2= attributo_variabile )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:111:5: COMMA av2= attributo_variabile
							{
							match(input,COMMA,FOLLOW_COMMA_in_effetti478); 
							pushFollow(FOLLOW_attributo_variabile_in_effetti482);
							av2=attributo_variabile();
							state._fsp--;

							ef.addAttrVariabile(av2);
							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;

			}

			match(input,CPG,FOLLOW_CPG_in_effetti492); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:116:1: attributo_variabile returns [AttributoVariabile x] : (n= NOT )? nomeAV= ID OPT (v1= VARIABILE ( COMMA v2= VARIABILE )* )? CPT ;
	public final AttributoVariabile attributo_variabile() throws RecognitionException {
		AttributoVariabile x = null;


		Token n=null;
		Token nomeAV=null;
		Token v1=null;
		Token v2=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:117:2: ( (n= NOT )? nomeAV= ID OPT (v1= VARIABILE ( COMMA v2= VARIABILE )* )? CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:117:4: (n= NOT )? nomeAV= ID OPT (v1= VARIABILE ( COMMA v2= VARIABILE )* )? CPT
			{
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:117:5: (n= NOT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==NOT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:117:5: n= NOT
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_attributo_variabile514); 
					}
					break;

			}

			nomeAV=(Token)match(input,ID,FOLLOW_ID_in_attributo_variabile521); 
			x = new AttributoVariabile(nomeAV.getText(),n);
			match(input,OPT,FOLLOW_OPT_in_attributo_variabile529); 
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:121:4: (v1= VARIABILE ( COMMA v2= VARIABILE )* )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==VARIABILE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:121:5: v1= VARIABILE ( COMMA v2= VARIABILE )*
					{
					v1=(Token)match(input,VARIABILE,FOLLOW_VARIABILE_in_attributo_variabile538); 
					x.addVariabile(v1.getText());
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:122:4: ( COMMA v2= VARIABILE )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==COMMA) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:122:6: COMMA v2= VARIABILE
							{
							match(input,COMMA,FOLLOW_COMMA_in_attributo_variabile547); 
							v2=(Token)match(input,VARIABILE,FOLLOW_VARIABILE_in_attributo_variabile551); 
							x.addVariabile(v2.getText());
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			match(input,CPT,FOLLOW_CPT_in_attributo_variabile561); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:128:1: costo returns [Costo c] : COSTO EQ x= FLOAT ;
	public final Costo costo() throws RecognitionException {
		Costo c = null;


		Token x=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:128:24: ( COSTO EQ x= FLOAT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:128:26: COSTO EQ x= FLOAT
			{
			match(input,COSTO,FOLLOW_COSTO_in_costo578); 
			match(input,EQ,FOLLOW_EQ_in_costo584); 
			x=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_costo592); 
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
	// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:136:1: applicazione_azione[Costo c] returns [Costo c1] : x= ID OPT o1= OGGETTO ( COMMA o2= OGGETTO )* CPT ;
	public final Costo applicazione_azione(Costo c) throws RecognitionException {
		Costo c1 = null;


		Token x=null;
		Token o1=null;
		Token o2=null;

		try {
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:137:2: (x= ID OPT o1= OGGETTO ( COMMA o2= OGGETTO )* CPT )
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:137:4: x= ID OPT o1= OGGETTO ( COMMA o2= OGGETTO )* CPT
			{
			x=(Token)match(input,ID,FOLLOW_ID_in_applicazione_azione622); 
			Applicazione a = new Applicazione(x.getText());
			match(input,OPT,FOLLOW_OPT_in_applicazione_azione628); 
			o1=(Token)match(input,OGGETTO,FOLLOW_OGGETTO_in_applicazione_azione636); 
			a.addOggetto(o1.getText());
			// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:140:4: ( COMMA o2= OGGETTO )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\GitHub\\Classical_Planning_LFC\\Project_ANTLR\\src\\myPackage\\Project.g:140:5: COMMA o2= OGGETTO
					{
					match(input,COMMA,FOLLOW_COMMA_in_applicazione_azione644); 
					o2=(Token)match(input,OGGETTO,FOLLOW_OGGETTO_in_applicazione_azione648); 
					a.addOggetto(o2.getText());
					}
					break;

				default :
					break loop14;
				}
			}

			match(input,CPT,FOLLOW_CPT_in_applicazione_azione656); 
			 c1 = sem.applicaAzione(a, c, x);
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



	public static final BitSet FOLLOW_definizione_stato_in_start63 = new BitSet(new long[]{0x0000000001844000L});
	public static final BitSet FOLLOW_definizione_operatore_in_start67 = new BitSet(new long[]{0x0000000001844000L});
	public static final BitSet FOLLOW_applicazione_azione_in_start73 = new BitSet(new long[]{0x0000000001844000L});
	public static final BitSet FOLLOW_EOF_in_start84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_definizione_stato99 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_OPG_in_definizione_stato114 = new BitSet(new long[]{0x0000000000004080L});
	public static final BitSet FOLLOW_attributo_in_definizione_stato124 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_COMMA_in_definizione_stato134 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_attributo_in_definizione_stato138 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_CPG_in_definizione_stato149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attributo174 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_OPT_in_attributo183 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_OGGETTO_in_attributo192 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_COMMA_in_attributo201 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_OGGETTO_in_attributo205 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_CPT_in_attributo215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPERATORE_in_definizione_operatore232 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_OPG_in_definizione_operatore238 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_azione_in_definizione_operatore247 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore249 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_precondizioni_in_definizione_operatore260 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore262 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_effetti_in_definizione_operatore272 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_definizione_operatore274 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_costo_in_definizione_operatore284 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CPG_in_definizione_operatore292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_azione315 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_OPT_in_azione323 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VARIABILE_in_azione333 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_COMMA_in_azione344 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VARIABILE_in_azione348 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_CPT_in_azione360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRECONDIZIONI_in_precondizioni384 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_in_precondizioni391 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_OPG_in_precondizioni396 = new BitSet(new long[]{0x0000000000014080L});
	public static final BitSet FOLLOW_attributo_variabile_in_precondizioni405 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_COMMA_in_precondizioni414 = new BitSet(new long[]{0x0000000000014000L});
	public static final BitSet FOLLOW_attributo_variabile_in_precondizioni418 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_CPG_in_precondizioni428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EFFETTI_in_effetti450 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_in_effetti456 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_OPG_in_effetti461 = new BitSet(new long[]{0x0000000000014080L});
	public static final BitSet FOLLOW_attributo_variabile_in_effetti470 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_COMMA_in_effetti478 = new BitSet(new long[]{0x0000000000014000L});
	public static final BitSet FOLLOW_attributo_variabile_in_effetti482 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_CPG_in_effetti492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_attributo_variabile514 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_attributo_variabile521 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_OPT_in_attributo_variabile529 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_VARIABILE_in_attributo_variabile538 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_COMMA_in_attributo_variabile547 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VARIABILE_in_attributo_variabile551 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_CPT_in_attributo_variabile561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COSTO_in_costo578 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_in_costo584 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FLOAT_in_costo592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_applicazione_azione622 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_OPT_in_applicazione_azione628 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_OGGETTO_in_applicazione_azione636 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_COMMA_in_applicazione_azione644 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_OGGETTO_in_applicazione_azione648 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_CPT_in_applicazione_azione656 = new BitSet(new long[]{0x0000000000000002L});
}
