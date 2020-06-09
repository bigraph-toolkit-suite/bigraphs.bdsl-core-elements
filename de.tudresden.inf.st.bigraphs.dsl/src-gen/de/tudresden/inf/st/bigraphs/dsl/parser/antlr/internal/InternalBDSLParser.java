package de.tudresden.inf.st.bigraphs.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.tudresden.inf.st.bigraphs.dsl.services.BDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'.*'", "'$'", "'-'", "'main'", "'='", "'{'", "'}'", "';'", "'signature'", "'ctrl'", "'arity'", "','", "'id'", "'('", "')'", "'val'", "':'", "'['", "']'", "'println'", "'UNSET'", "'|'", "'||'", "'UNSET2'", "'*'", "'atomic'", "'active'", "'passive'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBDSL.g"; }



     	private BDSLGrammarAccess grammarAccess;

        public InternalBDSLParser(TokenStream input, BDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BRSModel";
       	}

       	@Override
       	protected BDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBRSModel"
    // InternalBDSL.g:65:1: entryRuleBRSModel returns [EObject current=null] : iv_ruleBRSModel= ruleBRSModel EOF ;
    public final EObject entryRuleBRSModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBRSModel = null;


        try {
            // InternalBDSL.g:65:49: (iv_ruleBRSModel= ruleBRSModel EOF )
            // InternalBDSL.g:66:2: iv_ruleBRSModel= ruleBRSModel EOF
            {
             newCompositeNode(grammarAccess.getBRSModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBRSModel=ruleBRSModel();

            state._fsp--;

             current =iv_ruleBRSModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBRSModel"


    // $ANTLR start "ruleBRSModel"
    // InternalBDSL.g:72:1: ruleBRSModel returns [EObject current=null] : ( ( (lv_signature_0_0= ruleSignature ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleBRSModel() throws RecognitionException {
        EObject current = null;

        EObject lv_signature_0_0 = null;

        EObject lv_statements_2_0 = null;

        EObject lv_main_3_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:78:2: ( ( ( (lv_signature_0_0= ruleSignature ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalBDSL.g:79:2: ( ( (lv_signature_0_0= ruleSignature ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalBDSL.g:79:2: ( ( (lv_signature_0_0= ruleSignature ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+ {...}?) ) ) )
            // InternalBDSL.g:80:3: ( (lv_signature_0_0= ruleSignature ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalBDSL.g:80:3: ( (lv_signature_0_0= ruleSignature ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBDSL.g:81:4: (lv_signature_0_0= ruleSignature )
            	    {
            	    // InternalBDSL.g:81:4: (lv_signature_0_0= ruleSignature )
            	    // InternalBDSL.g:82:5: lv_signature_0_0= ruleSignature
            	    {

            	    					newCompositeNode(grammarAccess.getBRSModelAccess().getSignatureSignatureParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_signature_0_0=ruleSignature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBRSModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"signature",
            	    						lv_signature_0_0,
            	    						"de.tudresden.inf.st.bigraphs.dsl.BDSL.Signature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalBDSL.g:99:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+ {...}?) ) )
            // InternalBDSL.g:100:4: ( ( ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+ {...}?) )
            {
            // InternalBDSL.g:100:4: ( ( ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+ {...}?) )
            // InternalBDSL.g:101:5: ( ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getBRSModelAccess().getUnorderedGroup_1());
            				
            // InternalBDSL.g:104:5: ( ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+ {...}?)
            // InternalBDSL.g:105:6: ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+ {...}?
            {
            // InternalBDSL.g:105:6: ( ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBDSL.g:106:4: ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) )
            	    {
            	    // InternalBDSL.g:106:4: ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ ) )
            	    // InternalBDSL.g:107:5: {...}? => ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBRSModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalBDSL.g:107:105: ( ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+ )
            	    // InternalBDSL.g:108:6: ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalBDSL.g:111:9: ({...}? => ( (lv_statements_2_0= ruleAbstractElement ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==27) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalBDSL.g:111:10: {...}? => ( (lv_statements_2_0= ruleAbstractElement ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleBRSModel", "true");
            	    	    }
            	    	    // InternalBDSL.g:111:19: ( (lv_statements_2_0= ruleAbstractElement ) )
            	    	    // InternalBDSL.g:111:20: (lv_statements_2_0= ruleAbstractElement )
            	    	    {
            	    	    // InternalBDSL.g:111:20: (lv_statements_2_0= ruleAbstractElement )
            	    	    // InternalBDSL.g:112:10: lv_statements_2_0= ruleAbstractElement
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getBRSModelAccess().getStatementsAbstractElementParserRuleCall_1_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_statements_2_0=ruleAbstractElement();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getBRSModelRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"statements",
            	    	    											lv_statements_2_0,
            	    	    											"de.tudresden.inf.st.bigraphs.dsl.BDSL.AbstractElement");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBRSModelAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBDSL.g:134:4: ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) )
            	    {
            	    // InternalBDSL.g:134:4: ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) ) )
            	    // InternalBDSL.g:135:5: {...}? => ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBRSModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalBDSL.g:135:105: ( ({...}? => ( (lv_main_3_0= ruleMainElement ) ) ) )
            	    // InternalBDSL.g:136:6: ({...}? => ( (lv_main_3_0= ruleMainElement ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalBDSL.g:139:9: ({...}? => ( (lv_main_3_0= ruleMainElement ) ) )
            	    // InternalBDSL.g:139:10: {...}? => ( (lv_main_3_0= ruleMainElement ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBRSModel", "true");
            	    }
            	    // InternalBDSL.g:139:19: ( (lv_main_3_0= ruleMainElement ) )
            	    // InternalBDSL.g:139:20: (lv_main_3_0= ruleMainElement )
            	    {
            	    // InternalBDSL.g:139:20: (lv_main_3_0= ruleMainElement )
            	    // InternalBDSL.g:140:10: lv_main_3_0= ruleMainElement
            	    {

            	    										newCompositeNode(grammarAccess.getBRSModelAccess().getMainMainElementParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_main_3_0=ruleMainElement();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getBRSModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"main",
            	    											lv_main_3_0,
            	    											"de.tudresden.inf.st.bigraphs.dsl.BDSL.MainElement");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBRSModelAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBRSModelAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleBRSModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getBRSModelAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getBRSModelAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBRSModel"


    // $ANTLR start "entryRuleFQN"
    // InternalBDSL.g:174:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalBDSL.g:174:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalBDSL.g:175:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalBDSL.g:181:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBDSL.g:187:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBDSL.g:188:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBDSL.g:188:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBDSL.g:189:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalBDSL.g:196:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBDSL.g:197:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFqnWithWildCard"
    // InternalBDSL.g:214:1: entryRuleFqnWithWildCard returns [String current=null] : iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF ;
    public final String entryRuleFqnWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqnWithWildCard = null;


        try {
            // InternalBDSL.g:214:55: (iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF )
            // InternalBDSL.g:215:2: iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFqnWithWildCard=ruleFqnWithWildCard();

            state._fsp--;

             current =iv_ruleFqnWithWildCard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFqnWithWildCard"


    // $ANTLR start "ruleFqnWithWildCard"
    // InternalBDSL.g:221:1: ruleFqnWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFqnWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:227:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalBDSL.g:228:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalBDSL.g:228:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalBDSL.g:229:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalBDSL.g:239:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBDSL.g:240:4: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFqnWithWildCard"


    // $ANTLR start "entryRuleBigraphVarReferenceID"
    // InternalBDSL.g:250:1: entryRuleBigraphVarReferenceID returns [String current=null] : iv_ruleBigraphVarReferenceID= ruleBigraphVarReferenceID EOF ;
    public final String entryRuleBigraphVarReferenceID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBigraphVarReferenceID = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalBDSL.g:252:2: (iv_ruleBigraphVarReferenceID= ruleBigraphVarReferenceID EOF )
            // InternalBDSL.g:253:2: iv_ruleBigraphVarReferenceID= ruleBigraphVarReferenceID EOF
            {
             newCompositeNode(grammarAccess.getBigraphVarReferenceIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBigraphVarReferenceID=ruleBigraphVarReferenceID();

            state._fsp--;

             current =iv_ruleBigraphVarReferenceID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBigraphVarReferenceID"


    // $ANTLR start "ruleBigraphVarReferenceID"
    // InternalBDSL.g:262:1: ruleBigraphVarReferenceID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' this_FQN_1= ruleFQN ) ;
    public final AntlrDatatypeRuleToken ruleBigraphVarReferenceID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalBDSL.g:269:2: ( (kw= '$' this_FQN_1= ruleFQN ) )
            // InternalBDSL.g:270:2: (kw= '$' this_FQN_1= ruleFQN )
            {
            // InternalBDSL.g:270:2: (kw= '$' this_FQN_1= ruleFQN )
            // InternalBDSL.g:271:3: kw= '$' this_FQN_1= ruleFQN
            {
            kw=(Token)match(input,13,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBigraphVarReferenceIDAccess().getDollarSignKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBigraphVarReferenceIDAccess().getFQNParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_FQN_1=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_1);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBigraphVarReferenceID"


    // $ANTLR start "entryRuleEInt"
    // InternalBDSL.g:293:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBDSL.g:293:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBDSL.g:294:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBDSL.g:300:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBDSL.g:306:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBDSL.g:307:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBDSL.g:307:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBDSL.g:308:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBDSL.g:308:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBDSL.g:309:4: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalBDSL.g:326:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBDSL.g:326:47: (iv_ruleEString= ruleEString EOF )
            // InternalBDSL.g:327:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBDSL.g:333:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBDSL.g:339:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBDSL.g:340:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBDSL.g:340:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBDSL.g:341:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBDSL.g:349:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalBDSL.g:360:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalBDSL.g:360:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalBDSL.g:361:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalBDSL.g:367:1: ruleAbstractElement returns [EObject current=null] : this_LocalVarDecl_0= ruleLocalVarDecl ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_LocalVarDecl_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:373:2: (this_LocalVarDecl_0= ruleLocalVarDecl )
            // InternalBDSL.g:374:2: this_LocalVarDecl_0= ruleLocalVarDecl
            {

            		newCompositeNode(grammarAccess.getAbstractElementAccess().getLocalVarDeclParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_LocalVarDecl_0=ruleLocalVarDecl();

            state._fsp--;


            		current = this_LocalVarDecl_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleMainElement"
    // InternalBDSL.g:385:1: entryRuleMainElement returns [EObject current=null] : iv_ruleMainElement= ruleMainElement EOF ;
    public final EObject entryRuleMainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainElement = null;


        try {
            // InternalBDSL.g:385:52: (iv_ruleMainElement= ruleMainElement EOF )
            // InternalBDSL.g:386:2: iv_ruleMainElement= ruleMainElement EOF
            {
             newCompositeNode(grammarAccess.getMainElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainElement=ruleMainElement();

            state._fsp--;

             current =iv_ruleMainElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainElement"


    // $ANTLR start "ruleMainElement"
    // InternalBDSL.g:392:1: ruleMainElement returns [EObject current=null] : (otherlv_0= 'main' otherlv_1= '=' otherlv_2= '{' () ( (lv_value_4_0= ruleMainDeclaration ) )* otherlv_5= '}' otherlv_6= ';' ) ;
    public final EObject ruleMainElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:398:2: ( (otherlv_0= 'main' otherlv_1= '=' otherlv_2= '{' () ( (lv_value_4_0= ruleMainDeclaration ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // InternalBDSL.g:399:2: (otherlv_0= 'main' otherlv_1= '=' otherlv_2= '{' () ( (lv_value_4_0= ruleMainDeclaration ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // InternalBDSL.g:399:2: (otherlv_0= 'main' otherlv_1= '=' otherlv_2= '{' () ( (lv_value_4_0= ruleMainDeclaration ) )* otherlv_5= '}' otherlv_6= ';' )
            // InternalBDSL.g:400:3: otherlv_0= 'main' otherlv_1= '=' otherlv_2= '{' () ( (lv_value_4_0= ruleMainDeclaration ) )* otherlv_5= '}' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMainElementAccess().getMainKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMainElementAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMainElementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBDSL.g:412:3: ()
            // InternalBDSL.g:413:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainElementAccess().getMainElementAction_3(),
            					current);
            			

            }

            // InternalBDSL.g:419:3: ( (lv_value_4_0= ruleMainDeclaration ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13||LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBDSL.g:420:4: (lv_value_4_0= ruleMainDeclaration )
            	    {
            	    // InternalBDSL.g:420:4: (lv_value_4_0= ruleMainDeclaration )
            	    // InternalBDSL.g:421:5: lv_value_4_0= ruleMainDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getMainElementAccess().getValueMainDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_value_4_0=ruleMainDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainElementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"value",
            	    						lv_value_4_0,
            	    						"de.tudresden.inf.st.bigraphs.dsl.BDSL.MainDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getMainElementAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMainElementAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainElement"


    // $ANTLR start "entryRuleSignature"
    // InternalBDSL.g:450:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalBDSL.g:450:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalBDSL.g:451:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalBDSL.g:457:1: ruleSignature returns [EObject current=null] : ( () otherlv_1= 'signature' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_controls_4_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:463:2: ( ( () otherlv_1= 'signature' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )? ) )
            // InternalBDSL.g:464:2: ( () otherlv_1= 'signature' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )? )
            {
            // InternalBDSL.g:464:2: ( () otherlv_1= 'signature' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )? )
            // InternalBDSL.g:465:3: () otherlv_1= 'signature' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )?
            {
            // InternalBDSL.g:465:3: ()
            // InternalBDSL.g:466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSignatureAccess().getSignatureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSignatureAccess().getSignatureKeyword_1());
            		
            // InternalBDSL.g:476:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBDSL.g:477:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBDSL.g:477:4: (lv_name_2_0= RULE_ID )
            // InternalBDSL.g:478:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSignatureAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBDSL.g:494:3: (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBDSL.g:495:4: otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalBDSL.g:499:4: ( (lv_controls_4_0= ruleControlDef ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21||(LA9_0>=37 && LA9_0<=39)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBDSL.g:500:5: (lv_controls_4_0= ruleControlDef )
                    	    {
                    	    // InternalBDSL.g:500:5: (lv_controls_4_0= ruleControlDef )
                    	    // InternalBDSL.g:501:6: lv_controls_4_0= ruleControlDef
                    	    {

                    	    						newCompositeNode(grammarAccess.getSignatureAccess().getControlsControlDefParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_controls_4_0=ruleControlDef();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"controls",
                    	    							lv_controls_4_0,
                    	    							"de.tudresden.inf.st.bigraphs.dsl.BDSL.ControlDef");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleControlDef"
    // InternalBDSL.g:527:1: entryRuleControlDef returns [EObject current=null] : iv_ruleControlDef= ruleControlDef EOF ;
    public final EObject entryRuleControlDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlDef = null;


        try {
            // InternalBDSL.g:527:51: (iv_ruleControlDef= ruleControlDef EOF )
            // InternalBDSL.g:528:2: iv_ruleControlDef= ruleControlDef EOF
            {
             newCompositeNode(grammarAccess.getControlDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlDef=ruleControlDef();

            state._fsp--;

             current =iv_ruleControlDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControlDef"


    // $ANTLR start "ruleControlDef"
    // InternalBDSL.g:534:1: ruleControlDef returns [EObject current=null] : ( () ( (lv_type_1_0= ruleControlType ) )? otherlv_2= 'ctrl' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'arity' ( (lv_arity_5_0= ruleArityValue ) ) otherlv_6= ';' ) ;
    public final EObject ruleControlDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_arity_5_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:540:2: ( ( () ( (lv_type_1_0= ruleControlType ) )? otherlv_2= 'ctrl' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'arity' ( (lv_arity_5_0= ruleArityValue ) ) otherlv_6= ';' ) )
            // InternalBDSL.g:541:2: ( () ( (lv_type_1_0= ruleControlType ) )? otherlv_2= 'ctrl' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'arity' ( (lv_arity_5_0= ruleArityValue ) ) otherlv_6= ';' )
            {
            // InternalBDSL.g:541:2: ( () ( (lv_type_1_0= ruleControlType ) )? otherlv_2= 'ctrl' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'arity' ( (lv_arity_5_0= ruleArityValue ) ) otherlv_6= ';' )
            // InternalBDSL.g:542:3: () ( (lv_type_1_0= ruleControlType ) )? otherlv_2= 'ctrl' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'arity' ( (lv_arity_5_0= ruleArityValue ) ) otherlv_6= ';'
            {
            // InternalBDSL.g:542:3: ()
            // InternalBDSL.g:543:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getControlDefAccess().getControlVariableAction_0(),
            					current);
            			

            }

            // InternalBDSL.g:549:3: ( (lv_type_1_0= ruleControlType ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=37 && LA11_0<=39)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBDSL.g:550:4: (lv_type_1_0= ruleControlType )
                    {
                    // InternalBDSL.g:550:4: (lv_type_1_0= ruleControlType )
                    // InternalBDSL.g:551:5: lv_type_1_0= ruleControlType
                    {

                    					newCompositeNode(grammarAccess.getControlDefAccess().getTypeControlTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_type_1_0=ruleControlType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getControlDefRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"de.tudresden.inf.st.bigraphs.dsl.BDSL.ControlType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getControlDefAccess().getCtrlKeyword_2());
            		
            // InternalBDSL.g:572:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBDSL.g:573:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBDSL.g:573:4: (lv_name_3_0= RULE_ID )
            // InternalBDSL.g:574:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_3_0, grammarAccess.getControlDefAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControlDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getControlDefAccess().getArityKeyword_4());
            		
            // InternalBDSL.g:594:3: ( (lv_arity_5_0= ruleArityValue ) )
            // InternalBDSL.g:595:4: (lv_arity_5_0= ruleArityValue )
            {
            // InternalBDSL.g:595:4: (lv_arity_5_0= ruleArityValue )
            // InternalBDSL.g:596:5: lv_arity_5_0= ruleArityValue
            {

            					newCompositeNode(grammarAccess.getControlDefAccess().getArityArityValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_arity_5_0=ruleArityValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControlDefRule());
            					}
            					set(
            						current,
            						"arity",
            						lv_arity_5_0,
            						"de.tudresden.inf.st.bigraphs.dsl.BDSL.ArityValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getControlDefAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControlDef"


    // $ANTLR start "entryRuleArityValue"
    // InternalBDSL.g:621:1: entryRuleArityValue returns [EObject current=null] : iv_ruleArityValue= ruleArityValue EOF ;
    public final EObject entryRuleArityValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArityValue = null;


        try {
            // InternalBDSL.g:621:51: (iv_ruleArityValue= ruleArityValue EOF )
            // InternalBDSL.g:622:2: iv_ruleArityValue= ruleArityValue EOF
            {
             newCompositeNode(grammarAccess.getArityValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArityValue=ruleArityValue();

            state._fsp--;

             current =iv_ruleArityValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArityValue"


    // $ANTLR start "ruleArityValue"
    // InternalBDSL.g:628:1: ruleArityValue returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleArityValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:634:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalBDSL.g:635:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalBDSL.g:635:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalBDSL.g:636:3: (lv_value_0_0= ruleEInt )
            {
            // InternalBDSL.g:636:3: (lv_value_0_0= ruleEInt )
            // InternalBDSL.g:637:4: lv_value_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getArityValueAccess().getValueEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getArityValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.tudresden.inf.st.bigraphs.dsl.BDSL.EInt");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArityValue"


    // $ANTLR start "entryRuleNameConstant"
    // InternalBDSL.g:657:1: entryRuleNameConstant returns [EObject current=null] : iv_ruleNameConstant= ruleNameConstant EOF ;
    public final EObject entryRuleNameConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameConstant = null;


        try {
            // InternalBDSL.g:657:53: (iv_ruleNameConstant= ruleNameConstant EOF )
            // InternalBDSL.g:658:2: iv_ruleNameConstant= ruleNameConstant EOF
            {
             newCompositeNode(grammarAccess.getNameConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameConstant=ruleNameConstant();

            state._fsp--;

             current =iv_ruleNameConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameConstant"


    // $ANTLR start "ruleNameConstant"
    // InternalBDSL.g:664:1: ruleNameConstant returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleNameConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:670:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalBDSL.g:671:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalBDSL.g:671:2: ( (lv_value_0_0= ruleEString ) )
            // InternalBDSL.g:672:3: (lv_value_0_0= ruleEString )
            {
            // InternalBDSL.g:672:3: (lv_value_0_0= ruleEString )
            // InternalBDSL.g:673:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getNameConstantAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNameConstantRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.tudresden.inf.st.bigraphs.dsl.BDSL.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameConstant"


    // $ANTLR start "entryRuleLinkNames"
    // InternalBDSL.g:693:1: entryRuleLinkNames returns [EObject current=null] : iv_ruleLinkNames= ruleLinkNames EOF ;
    public final EObject entryRuleLinkNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkNames = null;


        try {
            // InternalBDSL.g:693:50: (iv_ruleLinkNames= ruleLinkNames EOF )
            // InternalBDSL.g:694:2: iv_ruleLinkNames= ruleLinkNames EOF
            {
             newCompositeNode(grammarAccess.getLinkNamesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkNames=ruleLinkNames();

            state._fsp--;

             current =iv_ruleLinkNames; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkNames"


    // $ANTLR start "ruleLinkNames"
    // InternalBDSL.g:700:1: ruleLinkNames returns [EObject current=null] : (this_NameConstant_0= ruleNameConstant | (this_NameConstant_1= ruleNameConstant otherlv_2= ',' ) ) ;
    public final EObject ruleLinkNames() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NameConstant_0 = null;

        EObject this_NameConstant_1 = null;



        	enterRule();

        try {
            // InternalBDSL.g:706:2: ( (this_NameConstant_0= ruleNameConstant | (this_NameConstant_1= ruleNameConstant otherlv_2= ',' ) ) )
            // InternalBDSL.g:707:2: (this_NameConstant_0= ruleNameConstant | (this_NameConstant_1= ruleNameConstant otherlv_2= ',' ) )
            {
            // InternalBDSL.g:707:2: (this_NameConstant_0= ruleNameConstant | (this_NameConstant_1= ruleNameConstant otherlv_2= ',' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==23) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||LA12_1==RULE_ID||LA12_1==RULE_STRING||LA12_1==30) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_ID) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==23) ) {
                    alt12=2;
                }
                else if ( (LA12_2==EOF||LA12_2==RULE_ID||LA12_2==RULE_STRING||LA12_2==30) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBDSL.g:708:3: this_NameConstant_0= ruleNameConstant
                    {

                    			newCompositeNode(grammarAccess.getLinkNamesAccess().getNameConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameConstant_0=ruleNameConstant();

                    state._fsp--;


                    			current = this_NameConstant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBDSL.g:717:3: (this_NameConstant_1= ruleNameConstant otherlv_2= ',' )
                    {
                    // InternalBDSL.g:717:3: (this_NameConstant_1= ruleNameConstant otherlv_2= ',' )
                    // InternalBDSL.g:718:4: this_NameConstant_1= ruleNameConstant otherlv_2= ','
                    {

                    				newCompositeNode(grammarAccess.getLinkNamesAccess().getNameConstantParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_19);
                    this_NameConstant_1=ruleNameConstant();

                    state._fsp--;


                    				current = this_NameConstant_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getLinkNamesAccess().getCommaKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkNames"


    // $ANTLR start "entryRuleSiteVars"
    // InternalBDSL.g:735:1: entryRuleSiteVars returns [EObject current=null] : iv_ruleSiteVars= ruleSiteVars EOF ;
    public final EObject entryRuleSiteVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteVars = null;


        try {
            // InternalBDSL.g:735:49: (iv_ruleSiteVars= ruleSiteVars EOF )
            // InternalBDSL.g:736:2: iv_ruleSiteVars= ruleSiteVars EOF
            {
             newCompositeNode(grammarAccess.getSiteVarsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiteVars=ruleSiteVars();

            state._fsp--;

             current =iv_ruleSiteVars; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiteVars"


    // $ANTLR start "ruleSiteVars"
    // InternalBDSL.g:742:1: ruleSiteVars returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSiteVars() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBDSL.g:748:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBDSL.g:749:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBDSL.g:749:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBDSL.g:750:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBDSL.g:750:3: (lv_name_0_0= RULE_ID )
            // InternalBDSL.g:751:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSiteVarsAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSiteVarsRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiteVars"


    // $ANTLR start "entryRuleSite"
    // InternalBDSL.g:770:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalBDSL.g:770:45: (iv_ruleSite= ruleSite EOF )
            // InternalBDSL.g:771:2: iv_ruleSite= ruleSite EOF
            {
             newCompositeNode(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSite=ruleSite();

            state._fsp--;

             current =iv_ruleSite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // InternalBDSL.g:777:1: ruleSite returns [EObject current=null] : (otherlv_0= 'id' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBDSL.g:783:2: ( (otherlv_0= 'id' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalBDSL.g:784:2: (otherlv_0= 'id' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalBDSL.g:784:2: (otherlv_0= 'id' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalBDSL.g:785:3: otherlv_0= 'id' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getSiteAccess().getIdKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSiteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBDSL.g:793:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalBDSL.g:794:4: (lv_index_2_0= RULE_INT )
            {
            // InternalBDSL.g:794:4: (lv_index_2_0= RULE_INT )
            // InternalBDSL.g:795:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_index_2_0, grammarAccess.getSiteAccess().getIndexINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSiteAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleLVD2"
    // InternalBDSL.g:819:1: entryRuleLVD2 returns [EObject current=null] : iv_ruleLVD2= ruleLVD2 EOF ;
    public final EObject entryRuleLVD2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLVD2 = null;


        try {
            // InternalBDSL.g:819:45: (iv_ruleLVD2= ruleLVD2 EOF )
            // InternalBDSL.g:820:2: iv_ruleLVD2= ruleLVD2 EOF
            {
             newCompositeNode(grammarAccess.getLVD2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLVD2=ruleLVD2();

            state._fsp--;

             current =iv_ruleLVD2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLVD2"


    // $ANTLR start "ruleLVD2"
    // InternalBDSL.g:826:1: ruleLVD2 returns [EObject current=null] : ( () otherlv_1= 'val' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) otherlv_5= '=' otherlv_6= '{' ( (lv_definition_7_0= ruleBigraphExpression ) )* otherlv_8= '}' ) ;
    public final EObject ruleLVD2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_definition_7_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:832:2: ( ( () otherlv_1= 'val' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) otherlv_5= '=' otherlv_6= '{' ( (lv_definition_7_0= ruleBigraphExpression ) )* otherlv_8= '}' ) )
            // InternalBDSL.g:833:2: ( () otherlv_1= 'val' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) otherlv_5= '=' otherlv_6= '{' ( (lv_definition_7_0= ruleBigraphExpression ) )* otherlv_8= '}' )
            {
            // InternalBDSL.g:833:2: ( () otherlv_1= 'val' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) otherlv_5= '=' otherlv_6= '{' ( (lv_definition_7_0= ruleBigraphExpression ) )* otherlv_8= '}' )
            // InternalBDSL.g:834:3: () otherlv_1= 'val' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) otherlv_5= '=' otherlv_6= '{' ( (lv_definition_7_0= ruleBigraphExpression ) )* otherlv_8= '}'
            {
            // InternalBDSL.g:834:3: ()
            // InternalBDSL.g:835:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLVD2Access().getLocalVarDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLVD2Access().getValKeyword_1());
            		
            // InternalBDSL.g:845:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBDSL.g:846:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBDSL.g:846:4: (lv_name_2_0= RULE_ID )
            // InternalBDSL.g:847:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLVD2Access().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLVD2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLVD2Access().getColonKeyword_3());
            		
            // InternalBDSL.g:867:3: ( ( ruleFQN ) )
            // InternalBDSL.g:868:4: ( ruleFQN )
            {
            // InternalBDSL.g:868:4: ( ruleFQN )
            // InternalBDSL.g:869:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLVD2Rule());
            					}
            				

            					newCompositeNode(grammarAccess.getLVD2Access().getTypeControlVariableCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getLVD2Access().getEqualsSignKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getLVD2Access().getLeftCurlyBracketKeyword_6());
            		
            // InternalBDSL.g:891:3: ( (lv_definition_7_0= ruleBigraphExpression ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==13||(LA13_0>=24 && LA13_0<=25)||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBDSL.g:892:4: (lv_definition_7_0= ruleBigraphExpression )
            	    {
            	    // InternalBDSL.g:892:4: (lv_definition_7_0= ruleBigraphExpression )
            	    // InternalBDSL.g:893:5: lv_definition_7_0= ruleBigraphExpression
            	    {

            	    					newCompositeNode(grammarAccess.getLVD2Access().getDefinitionBigraphExpressionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_definition_7_0=ruleBigraphExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLVD2Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"definition",
            	    						lv_definition_7_0,
            	    						"de.tudresden.inf.st.bigraphs.dsl.BDSL.BigraphExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLVD2Access().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLVD2"


    // $ANTLR start "entryRuleLocalVarDecl"
    // InternalBDSL.g:918:1: entryRuleLocalVarDecl returns [EObject current=null] : iv_ruleLocalVarDecl= ruleLocalVarDecl EOF ;
    public final EObject entryRuleLocalVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVarDecl = null;


        try {
            // InternalBDSL.g:918:53: (iv_ruleLocalVarDecl= ruleLocalVarDecl EOF )
            // InternalBDSL.g:919:2: iv_ruleLocalVarDecl= ruleLocalVarDecl EOF
            {
             newCompositeNode(grammarAccess.getLocalVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalVarDecl=ruleLocalVarDecl();

            state._fsp--;

             current =iv_ruleLocalVarDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVarDecl"


    // $ANTLR start "ruleLocalVarDecl"
    // InternalBDSL.g:925:1: ruleLocalVarDecl returns [EObject current=null] : (otherlv_0= 'val' () ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) ) ) ;
    public final EObject ruleLocalVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_siteArgs_7_0 = null;

        EObject lv_siteArgs_9_0 = null;

        EObject lv_definition_15_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:931:2: ( (otherlv_0= 'val' () ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) ) ) )
            // InternalBDSL.g:932:2: (otherlv_0= 'val' () ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) ) )
            {
            // InternalBDSL.g:932:2: (otherlv_0= 'val' () ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) ) )
            // InternalBDSL.g:933:3: otherlv_0= 'val' () ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalVarDeclAccess().getValKeyword_0());
            		
            // InternalBDSL.g:937:3: ()
            // InternalBDSL.g:938:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocalVarDeclAccess().getLocalVarDeclAction_1(),
            					current);
            			

            }

            // InternalBDSL.g:944:3: ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) )
            // InternalBDSL.g:945:4: ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' )
            {
            // InternalBDSL.g:945:4: ( (lv_name_2_0= RULE_ID ) )
            // InternalBDSL.g:946:5: (lv_name_2_0= RULE_ID )
            {
            // InternalBDSL.g:946:5: (lv_name_2_0= RULE_ID )
            // InternalBDSL.g:947:6: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            						newLeafNode(lv_name_2_0, grammarAccess.getLocalVarDeclAccess().getNameIDTerminalRuleCall_2_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getLocalVarDeclRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_2_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }

            // InternalBDSL.g:963:4: (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBDSL.g:964:5: otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getLocalVarDeclAccess().getLeftParenthesisKeyword_2_1_0());
                    				
                    // InternalBDSL.g:968:5: ( (otherlv_4= RULE_ID ) )
                    // InternalBDSL.g:969:6: (otherlv_4= RULE_ID )
                    {
                    // InternalBDSL.g:969:6: (otherlv_4= RULE_ID )
                    // InternalBDSL.g:970:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLocalVarDeclRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

                    							newLeafNode(otherlv_4, grammarAccess.getLocalVarDeclAccess().getSigSignatureCrossReference_2_1_1_0());
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_25); 

                    					newLeafNode(otherlv_5, grammarAccess.getLocalVarDeclAccess().getRightParenthesisKeyword_2_1_2());
                    				

                    }
                    break;

            }

            // InternalBDSL.g:986:4: ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=28 && LA17_0<=29)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBDSL.g:987:5: (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) )
                    {
                    // InternalBDSL.g:987:5: (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==29) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalBDSL.g:988:6: otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']'
                            {
                            otherlv_6=(Token)match(input,29,FOLLOW_6); 

                            						newLeafNode(otherlv_6, grammarAccess.getLocalVarDeclAccess().getLeftSquareBracketKeyword_2_2_0_0());
                            					
                            // InternalBDSL.g:992:6: ( (lv_siteArgs_7_0= ruleSiteVars ) )
                            // InternalBDSL.g:993:7: (lv_siteArgs_7_0= ruleSiteVars )
                            {
                            // InternalBDSL.g:993:7: (lv_siteArgs_7_0= ruleSiteVars )
                            // InternalBDSL.g:994:8: lv_siteArgs_7_0= ruleSiteVars
                            {

                            								newCompositeNode(grammarAccess.getLocalVarDeclAccess().getSiteArgsSiteVarsParserRuleCall_2_2_0_1_0());
                            							
                            pushFollow(FOLLOW_26);
                            lv_siteArgs_7_0=ruleSiteVars();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                            								}
                            								add(
                            									current,
                            									"siteArgs",
                            									lv_siteArgs_7_0,
                            									"de.tudresden.inf.st.bigraphs.dsl.BDSL.SiteVars");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalBDSL.g:1011:6: (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==23) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalBDSL.g:1012:7: otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) )
                            	    {
                            	    otherlv_8=(Token)match(input,23,FOLLOW_6); 

                            	    							newLeafNode(otherlv_8, grammarAccess.getLocalVarDeclAccess().getCommaKeyword_2_2_0_2_0());
                            	    						
                            	    // InternalBDSL.g:1016:7: ( (lv_siteArgs_9_0= ruleSiteVars ) )
                            	    // InternalBDSL.g:1017:8: (lv_siteArgs_9_0= ruleSiteVars )
                            	    {
                            	    // InternalBDSL.g:1017:8: (lv_siteArgs_9_0= ruleSiteVars )
                            	    // InternalBDSL.g:1018:9: lv_siteArgs_9_0= ruleSiteVars
                            	    {

                            	    									newCompositeNode(grammarAccess.getLocalVarDeclAccess().getSiteArgsSiteVarsParserRuleCall_2_2_0_2_1_0());
                            	    								
                            	    pushFollow(FOLLOW_26);
                            	    lv_siteArgs_9_0=ruleSiteVars();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"siteArgs",
                            	    										lv_siteArgs_9_0,
                            	    										"de.tudresden.inf.st.bigraphs.dsl.BDSL.SiteVars");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,30,FOLLOW_22); 

                            						newLeafNode(otherlv_10, grammarAccess.getLocalVarDeclAccess().getRightSquareBracketKeyword_2_2_0_3());
                            					

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,28,FOLLOW_6); 

                    					newLeafNode(otherlv_11, grammarAccess.getLocalVarDeclAccess().getColonKeyword_2_2_1());
                    				
                    // InternalBDSL.g:1045:5: ( ( ruleFQN ) )
                    // InternalBDSL.g:1046:6: ( ruleFQN )
                    {
                    // InternalBDSL.g:1046:6: ( ruleFQN )
                    // InternalBDSL.g:1047:7: ruleFQN
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLocalVarDeclRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLocalVarDeclAccess().getTypeControlVariableCrossReference_2_2_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleFQN();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalBDSL.g:1062:4: (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' )
            // InternalBDSL.g:1063:5: otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}'
            {
            otherlv_13=(Token)match(input,16,FOLLOW_10); 

            					newLeafNode(otherlv_13, grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_2_3_0());
            				
            otherlv_14=(Token)match(input,17,FOLLOW_23); 

            					newLeafNode(otherlv_14, grammarAccess.getLocalVarDeclAccess().getLeftCurlyBracketKeyword_2_3_1());
            				
            // InternalBDSL.g:1071:5: ( (lv_definition_15_0= ruleBigraphExpression ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==13||(LA18_0>=24 && LA18_0<=25)||LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBDSL.g:1072:6: (lv_definition_15_0= ruleBigraphExpression )
            	    {
            	    // InternalBDSL.g:1072:6: (lv_definition_15_0= ruleBigraphExpression )
            	    // InternalBDSL.g:1073:7: lv_definition_15_0= ruleBigraphExpression
            	    {

            	    							newCompositeNode(grammarAccess.getLocalVarDeclAccess().getDefinitionBigraphExpressionParserRuleCall_2_3_2_0());
            	    						
            	    pushFollow(FOLLOW_23);
            	    lv_definition_15_0=ruleBigraphExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
            	    							}
            	    							add(
            	    								current,
            	    								"definition",
            	    								lv_definition_15_0,
            	    								"de.tudresden.inf.st.bigraphs.dsl.BDSL.BigraphExpression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            					newLeafNode(otherlv_16, grammarAccess.getLocalVarDeclAccess().getRightCurlyBracketKeyword_2_3_3());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVarDecl"


    // $ANTLR start "entryRuleBigraphVarReference"
    // InternalBDSL.g:1100:1: entryRuleBigraphVarReference returns [EObject current=null] : iv_ruleBigraphVarReference= ruleBigraphVarReference EOF ;
    public final EObject entryRuleBigraphVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigraphVarReference = null;


        try {
            // InternalBDSL.g:1100:60: (iv_ruleBigraphVarReference= ruleBigraphVarReference EOF )
            // InternalBDSL.g:1101:2: iv_ruleBigraphVarReference= ruleBigraphVarReference EOF
            {
             newCompositeNode(grammarAccess.getBigraphVarReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBigraphVarReference=ruleBigraphVarReference();

            state._fsp--;

             current =iv_ruleBigraphVarReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBigraphVarReference"


    // $ANTLR start "ruleBigraphVarReference"
    // InternalBDSL.g:1107:1: ruleBigraphVarReference returns [EObject current=null] : ( ( ruleBigraphVarReferenceID ) ) ;
    public final EObject ruleBigraphVarReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalBDSL.g:1113:2: ( ( ( ruleBigraphVarReferenceID ) ) )
            // InternalBDSL.g:1114:2: ( ( ruleBigraphVarReferenceID ) )
            {
            // InternalBDSL.g:1114:2: ( ( ruleBigraphVarReferenceID ) )
            // InternalBDSL.g:1115:3: ( ruleBigraphVarReferenceID )
            {
            // InternalBDSL.g:1115:3: ( ruleBigraphVarReferenceID )
            // InternalBDSL.g:1116:4: ruleBigraphVarReferenceID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBigraphVarReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getBigraphVarReferenceAccess().getValueLocalVarDeclCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleBigraphVarReferenceID();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBigraphVarReference"


    // $ANTLR start "entryRuleAbstractBigraphDeclaration"
    // InternalBDSL.g:1133:1: entryRuleAbstractBigraphDeclaration returns [EObject current=null] : iv_ruleAbstractBigraphDeclaration= ruleAbstractBigraphDeclaration EOF ;
    public final EObject entryRuleAbstractBigraphDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBigraphDeclaration = null;


        try {
            // InternalBDSL.g:1133:67: (iv_ruleAbstractBigraphDeclaration= ruleAbstractBigraphDeclaration EOF )
            // InternalBDSL.g:1134:2: iv_ruleAbstractBigraphDeclaration= ruleAbstractBigraphDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAbstractBigraphDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractBigraphDeclaration=ruleAbstractBigraphDeclaration();

            state._fsp--;

             current =iv_ruleAbstractBigraphDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractBigraphDeclaration"


    // $ANTLR start "ruleAbstractBigraphDeclaration"
    // InternalBDSL.g:1140:1: ruleAbstractBigraphDeclaration returns [EObject current=null] : (this_BigraphVarReference_0= ruleBigraphVarReference | this_NodeExpressionCall_1= ruleNodeExpressionCall | this_LVD2_2= ruleLVD2 | this_Site_3= ruleSite ) ;
    public final EObject ruleAbstractBigraphDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_BigraphVarReference_0 = null;

        EObject this_NodeExpressionCall_1 = null;

        EObject this_LVD2_2 = null;

        EObject this_Site_3 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1146:2: ( (this_BigraphVarReference_0= ruleBigraphVarReference | this_NodeExpressionCall_1= ruleNodeExpressionCall | this_LVD2_2= ruleLVD2 | this_Site_3= ruleSite ) )
            // InternalBDSL.g:1147:2: (this_BigraphVarReference_0= ruleBigraphVarReference | this_NodeExpressionCall_1= ruleNodeExpressionCall | this_LVD2_2= ruleLVD2 | this_Site_3= ruleSite )
            {
            // InternalBDSL.g:1147:2: (this_BigraphVarReference_0= ruleBigraphVarReference | this_NodeExpressionCall_1= ruleNodeExpressionCall | this_LVD2_2= ruleLVD2 | this_Site_3= ruleSite )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
                {
                alt19=2;
                }
                break;
            case 27:
                {
                alt19=3;
                }
                break;
            case 24:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalBDSL.g:1148:3: this_BigraphVarReference_0= ruleBigraphVarReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractBigraphDeclarationAccess().getBigraphVarReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BigraphVarReference_0=ruleBigraphVarReference();

                    state._fsp--;


                    			current = this_BigraphVarReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1157:3: this_NodeExpressionCall_1= ruleNodeExpressionCall
                    {

                    			newCompositeNode(grammarAccess.getAbstractBigraphDeclarationAccess().getNodeExpressionCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NodeExpressionCall_1=ruleNodeExpressionCall();

                    state._fsp--;


                    			current = this_NodeExpressionCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1166:3: this_LVD2_2= ruleLVD2
                    {

                    			newCompositeNode(grammarAccess.getAbstractBigraphDeclarationAccess().getLVD2ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LVD2_2=ruleLVD2();

                    state._fsp--;


                    			current = this_LVD2_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBDSL.g:1175:3: this_Site_3= ruleSite
                    {

                    			newCompositeNode(grammarAccess.getAbstractBigraphDeclarationAccess().getSiteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Site_3=ruleSite();

                    state._fsp--;


                    			current = this_Site_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractBigraphDeclaration"


    // $ANTLR start "entryRuleNodeExpressionCall"
    // InternalBDSL.g:1187:1: entryRuleNodeExpressionCall returns [EObject current=null] : iv_ruleNodeExpressionCall= ruleNodeExpressionCall EOF ;
    public final EObject entryRuleNodeExpressionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeExpressionCall = null;


        try {
            // InternalBDSL.g:1187:59: (iv_ruleNodeExpressionCall= ruleNodeExpressionCall EOF )
            // InternalBDSL.g:1188:2: iv_ruleNodeExpressionCall= ruleNodeExpressionCall EOF
            {
             newCompositeNode(grammarAccess.getNodeExpressionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeExpressionCall=ruleNodeExpressionCall();

            state._fsp--;

             current =iv_ruleNodeExpressionCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeExpressionCall"


    // $ANTLR start "ruleNodeExpressionCall"
    // InternalBDSL.g:1194:1: ruleNodeExpressionCall returns [EObject current=null] : ( ( ( ruleFQN ) ) (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )? ) ;
    public final EObject ruleNodeExpressionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_links_2_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1200:2: ( ( ( ( ruleFQN ) ) (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )? ) )
            // InternalBDSL.g:1201:2: ( ( ( ruleFQN ) ) (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )? )
            {
            // InternalBDSL.g:1201:2: ( ( ( ruleFQN ) ) (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )? )
            // InternalBDSL.g:1202:3: ( ( ruleFQN ) ) (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )?
            {
            // InternalBDSL.g:1202:3: ( ( ruleFQN ) )
            // InternalBDSL.g:1203:4: ( ruleFQN )
            {
            // InternalBDSL.g:1203:4: ( ruleFQN )
            // InternalBDSL.g:1204:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeExpressionCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNodeExpressionCallAccess().getValueControlVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBDSL.g:1218:3: (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBDSL.g:1219:4: otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getNodeExpressionCallAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalBDSL.g:1223:4: ( (lv_links_2_0= ruleLinkNames ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID||LA20_0==RULE_STRING) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalBDSL.g:1224:5: (lv_links_2_0= ruleLinkNames )
                    	    {
                    	    // InternalBDSL.g:1224:5: (lv_links_2_0= ruleLinkNames )
                    	    // InternalBDSL.g:1225:6: lv_links_2_0= ruleLinkNames
                    	    {

                    	    						newCompositeNode(grammarAccess.getNodeExpressionCallAccess().getLinksLinkNamesParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_links_2_0=ruleLinkNames();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNodeExpressionCallRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"links",
                    	    							lv_links_2_0,
                    	    							"de.tudresden.inf.st.bigraphs.dsl.BDSL.LinkNames");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getNodeExpressionCallAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeExpressionCall"


    // $ANTLR start "entryRuleBigraphExpression"
    // InternalBDSL.g:1251:1: entryRuleBigraphExpression returns [EObject current=null] : iv_ruleBigraphExpression= ruleBigraphExpression EOF ;
    public final EObject entryRuleBigraphExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigraphExpression = null;


        try {
            // InternalBDSL.g:1251:58: (iv_ruleBigraphExpression= ruleBigraphExpression EOF )
            // InternalBDSL.g:1252:2: iv_ruleBigraphExpression= ruleBigraphExpression EOF
            {
             newCompositeNode(grammarAccess.getBigraphExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBigraphExpression=ruleBigraphExpression();

            state._fsp--;

             current =iv_ruleBigraphExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBigraphExpression"


    // $ANTLR start "ruleBigraphExpression"
    // InternalBDSL.g:1258:1: ruleBigraphExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleBigraphExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1264:2: (this_Addition_0= ruleAddition )
            // InternalBDSL.g:1265:2: this_Addition_0= ruleAddition
            {

            		newCompositeNode(grammarAccess.getBigraphExpressionAccess().getAdditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;


            		current = this_Addition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBigraphExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalBDSL.g:1276:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalBDSL.g:1276:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalBDSL.g:1277:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalBDSL.g:1283:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1289:2: ( (this_Multiplication_0= ruleMultiplication ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalBDSL.g:1290:2: (this_Multiplication_0= ruleMultiplication ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalBDSL.g:1290:2: (this_Multiplication_0= ruleMultiplication ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalBDSL.g:1291:3: this_Multiplication_0= ruleMultiplication ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBDSL.g:1299:3: ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=32 && LA22_0<=34)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBDSL.g:1300:4: ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalBDSL.g:1300:4: ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) )
            	    // InternalBDSL.g:1301:5: () ( (lv_operator_2_0= ruleBinaryParallelOperator ) )
            	    {
            	    // InternalBDSL.g:1301:5: ()
            	    // InternalBDSL.g:1302:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalBDSL.g:1308:5: ( (lv_operator_2_0= ruleBinaryParallelOperator ) )
            	    // InternalBDSL.g:1309:6: (lv_operator_2_0= ruleBinaryParallelOperator )
            	    {
            	    // InternalBDSL.g:1309:6: (lv_operator_2_0= ruleBinaryParallelOperator )
            	    // InternalBDSL.g:1310:7: lv_operator_2_0= ruleBinaryParallelOperator
            	    {

            	    							newCompositeNode(grammarAccess.getAdditionAccess().getOperatorBinaryParallelOperatorEnumRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_30);
            	    lv_operator_2_0=ruleBinaryParallelOperator();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operator",
            	    								lv_operator_2_0,
            	    								"de.tudresden.inf.st.bigraphs.dsl.BDSL.BinaryParallelOperator");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalBDSL.g:1328:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalBDSL.g:1329:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalBDSL.g:1329:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalBDSL.g:1330:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.tudresden.inf.st.bigraphs.dsl.BDSL.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalBDSL.g:1352:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalBDSL.g:1352:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalBDSL.g:1353:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalBDSL.g:1359:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1365:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalBDSL.g:1366:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalBDSL.g:1366:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalBDSL.g:1367:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBDSL.g:1375:3: ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14||(LA23_0>=35 && LA23_0<=36)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBDSL.g:1376:4: ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalBDSL.g:1376:4: ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) )
            	    // InternalBDSL.g:1377:5: () ( (lv_operator_2_0= ruleBinaryNestingOperator ) )
            	    {
            	    // InternalBDSL.g:1377:5: ()
            	    // InternalBDSL.g:1378:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalBDSL.g:1384:5: ( (lv_operator_2_0= ruleBinaryNestingOperator ) )
            	    // InternalBDSL.g:1385:6: (lv_operator_2_0= ruleBinaryNestingOperator )
            	    {
            	    // InternalBDSL.g:1385:6: (lv_operator_2_0= ruleBinaryNestingOperator )
            	    // InternalBDSL.g:1386:7: lv_operator_2_0= ruleBinaryNestingOperator
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationAccess().getOperatorBinaryNestingOperatorEnumRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_30);
            	    lv_operator_2_0=ruleBinaryNestingOperator();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operator",
            	    								lv_operator_2_0,
            	    								"de.tudresden.inf.st.bigraphs.dsl.BDSL.BinaryNestingOperator");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalBDSL.g:1404:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalBDSL.g:1405:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalBDSL.g:1405:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalBDSL.g:1406:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.tudresden.inf.st.bigraphs.dsl.BDSL.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalBDSL.g:1428:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalBDSL.g:1428:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalBDSL.g:1429:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalBDSL.g:1435:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' ) | this_AbstractBigraphDeclaration_3= ruleAbstractBigraphDeclaration ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_BigraphExpression_1 = null;

        EObject this_AbstractBigraphDeclaration_3 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1441:2: ( ( (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' ) | this_AbstractBigraphDeclaration_3= ruleAbstractBigraphDeclaration ) )
            // InternalBDSL.g:1442:2: ( (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' ) | this_AbstractBigraphDeclaration_3= ruleAbstractBigraphDeclaration )
            {
            // InternalBDSL.g:1442:2: ( (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' ) | this_AbstractBigraphDeclaration_3= ruleAbstractBigraphDeclaration )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID||LA24_0==13||LA24_0==24||LA24_0==27) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalBDSL.g:1443:3: (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' )
                    {
                    // InternalBDSL.g:1443:3: (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' )
                    // InternalBDSL.g:1444:4: otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_30); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBigraphExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_21);
                    this_BigraphExpression_1=ruleBigraphExpression();

                    state._fsp--;


                    				current = this_BigraphExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1462:3: this_AbstractBigraphDeclaration_3= ruleAbstractBigraphDeclaration
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAbstractBigraphDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractBigraphDeclaration_3=ruleAbstractBigraphDeclaration();

                    state._fsp--;


                    			current = this_AbstractBigraphDeclaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleMainDeclaration"
    // InternalBDSL.g:1474:1: entryRuleMainDeclaration returns [EObject current=null] : iv_ruleMainDeclaration= ruleMainDeclaration EOF ;
    public final EObject entryRuleMainDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainDeclaration = null;


        try {
            // InternalBDSL.g:1474:56: (iv_ruleMainDeclaration= ruleMainDeclaration EOF )
            // InternalBDSL.g:1475:2: iv_ruleMainDeclaration= ruleMainDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMainDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainDeclaration=ruleMainDeclaration();

            state._fsp--;

             current =iv_ruleMainDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainDeclaration"


    // $ANTLR start "ruleMainDeclaration"
    // InternalBDSL.g:1481:1: ruleMainDeclaration returns [EObject current=null] : ( () ( (lv_definition_1_0= ruleAbstractMainStatements ) ) otherlv_2= ';' ) ;
    public final EObject ruleMainDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_definition_1_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1487:2: ( ( () ( (lv_definition_1_0= ruleAbstractMainStatements ) ) otherlv_2= ';' ) )
            // InternalBDSL.g:1488:2: ( () ( (lv_definition_1_0= ruleAbstractMainStatements ) ) otherlv_2= ';' )
            {
            // InternalBDSL.g:1488:2: ( () ( (lv_definition_1_0= ruleAbstractMainStatements ) ) otherlv_2= ';' )
            // InternalBDSL.g:1489:3: () ( (lv_definition_1_0= ruleAbstractMainStatements ) ) otherlv_2= ';'
            {
            // InternalBDSL.g:1489:3: ()
            // InternalBDSL.g:1490:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainDeclarationAccess().getMainDeclarationAction_0(),
            					current);
            			

            }

            // InternalBDSL.g:1496:3: ( (lv_definition_1_0= ruleAbstractMainStatements ) )
            // InternalBDSL.g:1497:4: (lv_definition_1_0= ruleAbstractMainStatements )
            {
            // InternalBDSL.g:1497:4: (lv_definition_1_0= ruleAbstractMainStatements )
            // InternalBDSL.g:1498:5: lv_definition_1_0= ruleAbstractMainStatements
            {

            					newCompositeNode(grammarAccess.getMainDeclarationAccess().getDefinitionAbstractMainStatementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_definition_1_0=ruleAbstractMainStatements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainDeclarationRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_1_0,
            						"de.tudresden.inf.st.bigraphs.dsl.BDSL.AbstractMainStatements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMainDeclarationAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainDeclaration"


    // $ANTLR start "entryRuleAbstractMainStatements"
    // InternalBDSL.g:1523:1: entryRuleAbstractMainStatements returns [EObject current=null] : iv_ruleAbstractMainStatements= ruleAbstractMainStatements EOF ;
    public final EObject entryRuleAbstractMainStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMainStatements = null;


        try {
            // InternalBDSL.g:1523:63: (iv_ruleAbstractMainStatements= ruleAbstractMainStatements EOF )
            // InternalBDSL.g:1524:2: iv_ruleAbstractMainStatements= ruleAbstractMainStatements EOF
            {
             newCompositeNode(grammarAccess.getAbstractMainStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMainStatements=ruleAbstractMainStatements();

            state._fsp--;

             current =iv_ruleAbstractMainStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractMainStatements"


    // $ANTLR start "ruleAbstractMainStatements"
    // InternalBDSL.g:1530:1: ruleAbstractMainStatements returns [EObject current=null] : (this_BigraphVarReference_0= ruleBigraphVarReference | this_PrintLn_1= rulePrintLn ) ;
    public final EObject ruleAbstractMainStatements() throws RecognitionException {
        EObject current = null;

        EObject this_BigraphVarReference_0 = null;

        EObject this_PrintLn_1 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1536:2: ( (this_BigraphVarReference_0= ruleBigraphVarReference | this_PrintLn_1= rulePrintLn ) )
            // InternalBDSL.g:1537:2: (this_BigraphVarReference_0= ruleBigraphVarReference | this_PrintLn_1= rulePrintLn )
            {
            // InternalBDSL.g:1537:2: (this_BigraphVarReference_0= ruleBigraphVarReference | this_PrintLn_1= rulePrintLn )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            else if ( (LA25_0==31) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalBDSL.g:1538:3: this_BigraphVarReference_0= ruleBigraphVarReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractMainStatementsAccess().getBigraphVarReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BigraphVarReference_0=ruleBigraphVarReference();

                    state._fsp--;


                    			current = this_BigraphVarReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1547:3: this_PrintLn_1= rulePrintLn
                    {

                    			newCompositeNode(grammarAccess.getAbstractMainStatementsAccess().getPrintLnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintLn_1=rulePrintLn();

                    state._fsp--;


                    			current = this_PrintLn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractMainStatements"


    // $ANTLR start "entryRulePrintLn"
    // InternalBDSL.g:1559:1: entryRulePrintLn returns [EObject current=null] : iv_rulePrintLn= rulePrintLn EOF ;
    public final EObject entryRulePrintLn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintLn = null;


        try {
            // InternalBDSL.g:1559:48: (iv_rulePrintLn= rulePrintLn EOF )
            // InternalBDSL.g:1560:2: iv_rulePrintLn= rulePrintLn EOF
            {
             newCompositeNode(grammarAccess.getPrintLnRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintLn=rulePrintLn();

            state._fsp--;

             current =iv_rulePrintLn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintLn"


    // $ANTLR start "rulePrintLn"
    // InternalBDSL.g:1566:1: rulePrintLn returns [EObject current=null] : ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_text_3_0= rulePrintableExpression ) ) otherlv_4= ')' ) ;
    public final EObject rulePrintLn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1572:2: ( ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_text_3_0= rulePrintableExpression ) ) otherlv_4= ')' ) )
            // InternalBDSL.g:1573:2: ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_text_3_0= rulePrintableExpression ) ) otherlv_4= ')' )
            {
            // InternalBDSL.g:1573:2: ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_text_3_0= rulePrintableExpression ) ) otherlv_4= ')' )
            // InternalBDSL.g:1574:3: () otherlv_1= 'println' otherlv_2= '(' ( (lv_text_3_0= rulePrintableExpression ) ) otherlv_4= ')'
            {
            // InternalBDSL.g:1574:3: ()
            // InternalBDSL.g:1575:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintLnAccess().getPrintLnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintLnAccess().getPrintlnKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintLnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBDSL.g:1589:3: ( (lv_text_3_0= rulePrintableExpression ) )
            // InternalBDSL.g:1590:4: (lv_text_3_0= rulePrintableExpression )
            {
            // InternalBDSL.g:1590:4: (lv_text_3_0= rulePrintableExpression )
            // InternalBDSL.g:1591:5: lv_text_3_0= rulePrintableExpression
            {

            					newCompositeNode(grammarAccess.getPrintLnAccess().getTextPrintableExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_text_3_0=rulePrintableExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintLnRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_3_0,
            						"de.tudresden.inf.st.bigraphs.dsl.BDSL.PrintableExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPrintLnAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintLn"


    // $ANTLR start "entryRulePrintableExpression"
    // InternalBDSL.g:1616:1: entryRulePrintableExpression returns [EObject current=null] : iv_rulePrintableExpression= rulePrintableExpression EOF ;
    public final EObject entryRulePrintableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintableExpression = null;


        try {
            // InternalBDSL.g:1616:60: (iv_rulePrintableExpression= rulePrintableExpression EOF )
            // InternalBDSL.g:1617:2: iv_rulePrintableExpression= rulePrintableExpression EOF
            {
             newCompositeNode(grammarAccess.getPrintableExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintableExpression=rulePrintableExpression();

            state._fsp--;

             current =iv_rulePrintableExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintableExpression"


    // $ANTLR start "rulePrintableExpression"
    // InternalBDSL.g:1623:1: rulePrintableExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | this_BigraphVarReference_2= ruleBigraphVarReference ) ;
    public final EObject rulePrintableExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject this_BigraphVarReference_2 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1629:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | this_BigraphVarReference_2= ruleBigraphVarReference ) )
            // InternalBDSL.g:1630:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | this_BigraphVarReference_2= ruleBigraphVarReference )
            {
            // InternalBDSL.g:1630:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | this_BigraphVarReference_2= ruleBigraphVarReference )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==13) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalBDSL.g:1631:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalBDSL.g:1631:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalBDSL.g:1632:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalBDSL.g:1632:4: ()
                    // InternalBDSL.g:1633:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrintableExpressionAccess().getStringLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalBDSL.g:1639:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalBDSL.g:1640:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalBDSL.g:1640:5: (lv_value_1_0= RULE_STRING )
                    // InternalBDSL.g:1641:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrintableExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrintableExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1659:3: this_BigraphVarReference_2= ruleBigraphVarReference
                    {

                    			newCompositeNode(grammarAccess.getPrintableExpressionAccess().getBigraphVarReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BigraphVarReference_2=ruleBigraphVarReference();

                    state._fsp--;


                    			current = this_BigraphVarReference_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintableExpression"


    // $ANTLR start "ruleBinaryParallelOperator"
    // InternalBDSL.g:1671:1: ruleBinaryParallelOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '||' ) ) ;
    public final Enumerator ruleBinaryParallelOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBDSL.g:1677:2: ( ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '||' ) ) )
            // InternalBDSL.g:1678:2: ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '||' ) )
            {
            // InternalBDSL.g:1678:2: ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '||' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt27=1;
                }
                break;
            case 33:
                {
                alt27=2;
                }
                break;
            case 34:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalBDSL.g:1679:3: (enumLiteral_0= 'UNSET' )
                    {
                    // InternalBDSL.g:1679:3: (enumLiteral_0= 'UNSET' )
                    // InternalBDSL.g:1680:4: enumLiteral_0= 'UNSET'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBinaryParallelOperatorAccess().getUNSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryParallelOperatorAccess().getUNSETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1687:3: (enumLiteral_1= '|' )
                    {
                    // InternalBDSL.g:1687:3: (enumLiteral_1= '|' )
                    // InternalBDSL.g:1688:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getBinaryParallelOperatorAccess().getMERGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryParallelOperatorAccess().getMERGEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1695:3: (enumLiteral_2= '||' )
                    {
                    // InternalBDSL.g:1695:3: (enumLiteral_2= '||' )
                    // InternalBDSL.g:1696:4: enumLiteral_2= '||'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getBinaryParallelOperatorAccess().getPARALLELEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBinaryParallelOperatorAccess().getPARALLELEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryParallelOperator"


    // $ANTLR start "ruleBinaryNestingOperator"
    // InternalBDSL.g:1706:1: ruleBinaryNestingOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'UNSET2' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleBinaryNestingOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBDSL.g:1712:2: ( ( (enumLiteral_0= 'UNSET2' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) ) )
            // InternalBDSL.g:1713:2: ( (enumLiteral_0= 'UNSET2' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) )
            {
            // InternalBDSL.g:1713:2: ( (enumLiteral_0= 'UNSET2' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt28=1;
                }
                break;
            case 14:
                {
                alt28=2;
                }
                break;
            case 36:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalBDSL.g:1714:3: (enumLiteral_0= 'UNSET2' )
                    {
                    // InternalBDSL.g:1714:3: (enumLiteral_0= 'UNSET2' )
                    // InternalBDSL.g:1715:4: enumLiteral_0= 'UNSET2'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBinaryNestingOperatorAccess().getUNSET2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryNestingOperatorAccess().getUNSET2EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1722:3: (enumLiteral_1= '-' )
                    {
                    // InternalBDSL.g:1722:3: (enumLiteral_1= '-' )
                    // InternalBDSL.g:1723:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getBinaryNestingOperatorAccess().getNESTINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryNestingOperatorAccess().getNESTINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1730:3: (enumLiteral_2= '*' )
                    {
                    // InternalBDSL.g:1730:3: (enumLiteral_2= '*' )
                    // InternalBDSL.g:1731:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBinaryNestingOperatorAccess().getCOMPOSITIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBinaryNestingOperatorAccess().getCOMPOSITIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryNestingOperator"


    // $ANTLR start "ruleControlType"
    // InternalBDSL.g:1741:1: ruleControlType returns [Enumerator current=null] : ( (enumLiteral_0= 'atomic' ) | (enumLiteral_1= 'active' ) | (enumLiteral_2= 'passive' ) ) ;
    public final Enumerator ruleControlType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBDSL.g:1747:2: ( ( (enumLiteral_0= 'atomic' ) | (enumLiteral_1= 'active' ) | (enumLiteral_2= 'passive' ) ) )
            // InternalBDSL.g:1748:2: ( (enumLiteral_0= 'atomic' ) | (enumLiteral_1= 'active' ) | (enumLiteral_2= 'passive' ) )
            {
            // InternalBDSL.g:1748:2: ( (enumLiteral_0= 'atomic' ) | (enumLiteral_1= 'active' ) | (enumLiteral_2= 'passive' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt29=1;
                }
                break;
            case 38:
                {
                alt29=2;
                }
                break;
            case 39:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalBDSL.g:1749:3: (enumLiteral_0= 'atomic' )
                    {
                    // InternalBDSL.g:1749:3: (enumLiteral_0= 'atomic' )
                    // InternalBDSL.g:1750:4: enumLiteral_0= 'atomic'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getControlTypeAccess().getATOMICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getControlTypeAccess().getATOMICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1757:3: (enumLiteral_1= 'active' )
                    {
                    // InternalBDSL.g:1757:3: (enumLiteral_1= 'active' )
                    // InternalBDSL.g:1758:4: enumLiteral_1= 'active'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getControlTypeAccess().getACTIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getControlTypeAccess().getACTIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1765:3: (enumLiteral_2= 'passive' )
                    {
                    // InternalBDSL.g:1765:3: (enumLiteral_2= 'passive' )
                    // InternalBDSL.g:1766:4: enumLiteral_2= 'passive'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getControlTypeAccess().getPASSIVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getControlTypeAccess().getPASSIVEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControlType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008108000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000E000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000E000240000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000B042010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000032010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000050L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000B002010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001800004002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002040L});

}
