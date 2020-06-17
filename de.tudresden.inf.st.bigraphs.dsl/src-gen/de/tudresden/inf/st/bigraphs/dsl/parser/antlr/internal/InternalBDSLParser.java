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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'.*'", "'$'", "'main'", "'='", "'{'", "'}'", "';'", "'signature'", "'ctrl'", "'arity'", "','", "'id'", "'('", "')'", "'val'", "':'", "'['", "']'", "'react'", "'brs'", "'agents'", "'rules'", "'println'", "'UNSET'", "'|'", "'||'", "'UNSET2'", "'-'", "'*'", "'atomic'", "'active'", "'passive'", "'xmi'", "'ecore'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( (LA1_0==19) ) {
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

                if ( ( LA3_0 == 26 || LA3_0 == 30 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
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

            	        if ( (LA2_0==26) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }
            	        else if ( (LA2_0==30) ) {
            	            int LA2_3 = input.LA(2);

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


    // $ANTLR start "entryRuleEString"
    // InternalBDSL.g:293:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBDSL.g:293:47: (iv_ruleEString= ruleEString EOF )
            // InternalBDSL.g:294:2: iv_ruleEString= ruleEString EOF
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
    // InternalBDSL.g:300:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBDSL.g:306:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBDSL.g:307:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBDSL.g:307:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBDSL.g:308:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBDSL.g:316:3: this_ID_1= RULE_ID
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
    // InternalBDSL.g:327:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalBDSL.g:327:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalBDSL.g:328:2: iv_ruleAbstractElement= ruleAbstractElement EOF
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
    // InternalBDSL.g:334:1: ruleAbstractElement returns [EObject current=null] : (this_LocalVarDecl_0= ruleLocalVarDecl | this_LocalRuleDecl_1= ruleLocalRuleDecl ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_LocalVarDecl_0 = null;

        EObject this_LocalRuleDecl_1 = null;



        	enterRule();

        try {
            // InternalBDSL.g:340:2: ( (this_LocalVarDecl_0= ruleLocalVarDecl | this_LocalRuleDecl_1= ruleLocalRuleDecl ) )
            // InternalBDSL.g:341:2: (this_LocalVarDecl_0= ruleLocalVarDecl | this_LocalRuleDecl_1= ruleLocalRuleDecl )
            {
            // InternalBDSL.g:341:2: (this_LocalVarDecl_0= ruleLocalVarDecl | this_LocalRuleDecl_1= ruleLocalRuleDecl )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBDSL.g:342:3: this_LocalVarDecl_0= ruleLocalVarDecl
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getLocalVarDeclParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalVarDecl_0=ruleLocalVarDecl();

                    state._fsp--;


                    			current = this_LocalVarDecl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBDSL.g:351:3: this_LocalRuleDecl_1= ruleLocalRuleDecl
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getLocalRuleDeclParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalRuleDecl_1=ruleLocalRuleDecl();

                    state._fsp--;


                    			current = this_LocalRuleDecl_1;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleMainElement"
    // InternalBDSL.g:363:1: entryRuleMainElement returns [EObject current=null] : iv_ruleMainElement= ruleMainElement EOF ;
    public final EObject entryRuleMainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainElement = null;


        try {
            // InternalBDSL.g:363:52: (iv_ruleMainElement= ruleMainElement EOF )
            // InternalBDSL.g:364:2: iv_ruleMainElement= ruleMainElement EOF
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
    // InternalBDSL.g:370:1: ruleMainElement returns [EObject current=null] : (otherlv_0= 'main' otherlv_1= '=' otherlv_2= '{' () ( (lv_value_4_0= ruleMainDeclaration ) )* otherlv_5= '}' otherlv_6= ';' ) ;
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
            // InternalBDSL.g:376:2: ( (otherlv_0= 'main' otherlv_1= '=' otherlv_2= '{' () ( (lv_value_4_0= ruleMainDeclaration ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // InternalBDSL.g:377:2: (otherlv_0= 'main' otherlv_1= '=' otherlv_2= '{' () ( (lv_value_4_0= ruleMainDeclaration ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // InternalBDSL.g:377:2: (otherlv_0= 'main' otherlv_1= '=' otherlv_2= '{' () ( (lv_value_4_0= ruleMainDeclaration ) )* otherlv_5= '}' otherlv_6= ';' )
            // InternalBDSL.g:378:3: otherlv_0= 'main' otherlv_1= '=' otherlv_2= '{' () ( (lv_value_4_0= ruleMainDeclaration ) )* otherlv_5= '}' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMainElementAccess().getMainKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMainElementAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMainElementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBDSL.g:390:3: ()
            // InternalBDSL.g:391:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainElementAccess().getMainElementAction_3(),
            					current);
            			

            }

            // InternalBDSL.g:397:3: ( (lv_value_4_0= ruleMainDeclaration ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13||LA8_0==31||LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBDSL.g:398:4: (lv_value_4_0= ruleMainDeclaration )
            	    {
            	    // InternalBDSL.g:398:4: (lv_value_4_0= ruleMainDeclaration )
            	    // InternalBDSL.g:399:5: lv_value_4_0= ruleMainDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getMainElementAccess().getValueMainDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
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

            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getMainElementAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalBDSL.g:428:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalBDSL.g:428:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalBDSL.g:429:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalBDSL.g:435:1: ruleSignature returns [EObject current=null] : ( () otherlv_1= 'signature' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_controls_4_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:441:2: ( ( () otherlv_1= 'signature' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )? ) )
            // InternalBDSL.g:442:2: ( () otherlv_1= 'signature' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )? )
            {
            // InternalBDSL.g:442:2: ( () otherlv_1= 'signature' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )? )
            // InternalBDSL.g:443:3: () otherlv_1= 'signature' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )?
            {
            // InternalBDSL.g:443:3: ()
            // InternalBDSL.g:444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSignatureAccess().getSignatureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSignatureAccess().getSignatureKeyword_1());
            		
            // InternalBDSL.g:454:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBDSL.g:455:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBDSL.g:455:4: (lv_name_2_0= RULE_ID )
            // InternalBDSL.g:456:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalBDSL.g:472:3: (otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBDSL.g:473:4: otherlv_3= '{' ( (lv_controls_4_0= ruleControlDef ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalBDSL.g:477:4: ( (lv_controls_4_0= ruleControlDef ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==20||(LA9_0>=41 && LA9_0<=43)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBDSL.g:478:5: (lv_controls_4_0= ruleControlDef )
                    	    {
                    	    // InternalBDSL.g:478:5: (lv_controls_4_0= ruleControlDef )
                    	    // InternalBDSL.g:479:6: lv_controls_4_0= ruleControlDef
                    	    {

                    	    						newCompositeNode(grammarAccess.getSignatureAccess().getControlsControlDefParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
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

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalBDSL.g:505:1: entryRuleControlDef returns [EObject current=null] : iv_ruleControlDef= ruleControlDef EOF ;
    public final EObject entryRuleControlDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlDef = null;


        try {
            // InternalBDSL.g:505:51: (iv_ruleControlDef= ruleControlDef EOF )
            // InternalBDSL.g:506:2: iv_ruleControlDef= ruleControlDef EOF
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
    // InternalBDSL.g:512:1: ruleControlDef returns [EObject current=null] : ( () ( (lv_type_1_0= ruleControlType ) )? otherlv_2= 'ctrl' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'arity' ( (lv_arity_5_0= RULE_INT ) ) otherlv_6= ';' ) ;
    public final EObject ruleControlDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_arity_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:518:2: ( ( () ( (lv_type_1_0= ruleControlType ) )? otherlv_2= 'ctrl' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'arity' ( (lv_arity_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            // InternalBDSL.g:519:2: ( () ( (lv_type_1_0= ruleControlType ) )? otherlv_2= 'ctrl' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'arity' ( (lv_arity_5_0= RULE_INT ) ) otherlv_6= ';' )
            {
            // InternalBDSL.g:519:2: ( () ( (lv_type_1_0= ruleControlType ) )? otherlv_2= 'ctrl' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'arity' ( (lv_arity_5_0= RULE_INT ) ) otherlv_6= ';' )
            // InternalBDSL.g:520:3: () ( (lv_type_1_0= ruleControlType ) )? otherlv_2= 'ctrl' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'arity' ( (lv_arity_5_0= RULE_INT ) ) otherlv_6= ';'
            {
            // InternalBDSL.g:520:3: ()
            // InternalBDSL.g:521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getControlDefAccess().getControlVariableAction_0(),
            					current);
            			

            }

            // InternalBDSL.g:527:3: ( (lv_type_1_0= ruleControlType ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=41 && LA11_0<=43)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBDSL.g:528:4: (lv_type_1_0= ruleControlType )
                    {
                    // InternalBDSL.g:528:4: (lv_type_1_0= ruleControlType )
                    // InternalBDSL.g:529:5: lv_type_1_0= ruleControlType
                    {

                    					newCompositeNode(grammarAccess.getControlDefAccess().getTypeControlTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getControlDefAccess().getCtrlKeyword_2());
            		
            // InternalBDSL.g:550:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBDSL.g:551:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBDSL.g:551:4: (lv_name_3_0= RULE_ID )
            // InternalBDSL.g:552:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_4=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getControlDefAccess().getArityKeyword_4());
            		
            // InternalBDSL.g:572:3: ( (lv_arity_5_0= RULE_INT ) )
            // InternalBDSL.g:573:4: (lv_arity_5_0= RULE_INT )
            {
            // InternalBDSL.g:573:4: (lv_arity_5_0= RULE_INT )
            // InternalBDSL.g:574:5: lv_arity_5_0= RULE_INT
            {
            lv_arity_5_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_arity_5_0, grammarAccess.getControlDefAccess().getArityINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControlDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"arity",
            						lv_arity_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleNameConstant"
    // InternalBDSL.g:598:1: entryRuleNameConstant returns [EObject current=null] : iv_ruleNameConstant= ruleNameConstant EOF ;
    public final EObject entryRuleNameConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameConstant = null;


        try {
            // InternalBDSL.g:598:53: (iv_ruleNameConstant= ruleNameConstant EOF )
            // InternalBDSL.g:599:2: iv_ruleNameConstant= ruleNameConstant EOF
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
    // InternalBDSL.g:605:1: ruleNameConstant returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleNameConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:611:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalBDSL.g:612:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalBDSL.g:612:2: ( (lv_value_0_0= ruleEString ) )
            // InternalBDSL.g:613:3: (lv_value_0_0= ruleEString )
            {
            // InternalBDSL.g:613:3: (lv_value_0_0= ruleEString )
            // InternalBDSL.g:614:4: lv_value_0_0= ruleEString
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
    // InternalBDSL.g:634:1: entryRuleLinkNames returns [EObject current=null] : iv_ruleLinkNames= ruleLinkNames EOF ;
    public final EObject entryRuleLinkNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkNames = null;


        try {
            // InternalBDSL.g:634:50: (iv_ruleLinkNames= ruleLinkNames EOF )
            // InternalBDSL.g:635:2: iv_ruleLinkNames= ruleLinkNames EOF
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
    // InternalBDSL.g:641:1: ruleLinkNames returns [EObject current=null] : (this_NameConstant_0= ruleNameConstant | (this_NameConstant_1= ruleNameConstant otherlv_2= ',' ) ) ;
    public final EObject ruleLinkNames() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NameConstant_0 = null;

        EObject this_NameConstant_1 = null;



        	enterRule();

        try {
            // InternalBDSL.g:647:2: ( (this_NameConstant_0= ruleNameConstant | (this_NameConstant_1= ruleNameConstant otherlv_2= ',' ) ) )
            // InternalBDSL.g:648:2: (this_NameConstant_0= ruleNameConstant | (this_NameConstant_1= ruleNameConstant otherlv_2= ',' ) )
            {
            // InternalBDSL.g:648:2: (this_NameConstant_0= ruleNameConstant | (this_NameConstant_1= ruleNameConstant otherlv_2= ',' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==22) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||(LA12_1>=RULE_ID && LA12_1<=RULE_STRING)||LA12_1==29) ) {
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

                if ( (LA12_2==EOF||(LA12_2>=RULE_ID && LA12_2<=RULE_STRING)||LA12_2==29) ) {
                    alt12=1;
                }
                else if ( (LA12_2==22) ) {
                    alt12=2;
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
                    // InternalBDSL.g:649:3: this_NameConstant_0= ruleNameConstant
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
                    // InternalBDSL.g:658:3: (this_NameConstant_1= ruleNameConstant otherlv_2= ',' )
                    {
                    // InternalBDSL.g:658:3: (this_NameConstant_1= ruleNameConstant otherlv_2= ',' )
                    // InternalBDSL.g:659:4: this_NameConstant_1= ruleNameConstant otherlv_2= ','
                    {

                    				newCompositeNode(grammarAccess.getLinkNamesAccess().getNameConstantParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_18);
                    this_NameConstant_1=ruleNameConstant();

                    state._fsp--;


                    				current = this_NameConstant_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalBDSL.g:676:1: entryRuleSiteVars returns [EObject current=null] : iv_ruleSiteVars= ruleSiteVars EOF ;
    public final EObject entryRuleSiteVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteVars = null;


        try {
            // InternalBDSL.g:676:49: (iv_ruleSiteVars= ruleSiteVars EOF )
            // InternalBDSL.g:677:2: iv_ruleSiteVars= ruleSiteVars EOF
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
    // InternalBDSL.g:683:1: ruleSiteVars returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSiteVars() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBDSL.g:689:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBDSL.g:690:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBDSL.g:690:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBDSL.g:691:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBDSL.g:691:3: (lv_name_0_0= RULE_ID )
            // InternalBDSL.g:692:4: lv_name_0_0= RULE_ID
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
    // InternalBDSL.g:711:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalBDSL.g:711:45: (iv_ruleSite= ruleSite EOF )
            // InternalBDSL.g:712:2: iv_ruleSite= ruleSite EOF
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
    // InternalBDSL.g:718:1: ruleSite returns [EObject current=null] : (otherlv_0= 'id' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBDSL.g:724:2: ( (otherlv_0= 'id' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalBDSL.g:725:2: (otherlv_0= 'id' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalBDSL.g:725:2: (otherlv_0= 'id' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalBDSL.g:726:3: otherlv_0= 'id' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSiteAccess().getIdKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSiteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBDSL.g:734:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalBDSL.g:735:4: (lv_index_2_0= RULE_INT )
            {
            // InternalBDSL.g:735:4: (lv_index_2_0= RULE_INT )
            // InternalBDSL.g:736:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

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
    // InternalBDSL.g:760:1: entryRuleLVD2 returns [EObject current=null] : iv_ruleLVD2= ruleLVD2 EOF ;
    public final EObject entryRuleLVD2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLVD2 = null;


        try {
            // InternalBDSL.g:760:45: (iv_ruleLVD2= ruleLVD2 EOF )
            // InternalBDSL.g:761:2: iv_ruleLVD2= ruleLVD2 EOF
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
    // InternalBDSL.g:767:1: ruleLVD2 returns [EObject current=null] : ( () otherlv_1= 'val' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) otherlv_5= '=' otherlv_6= '{' ( (lv_definition_7_0= ruleBigraphExpression ) )* otherlv_8= '}' ) ;
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
            // InternalBDSL.g:773:2: ( ( () otherlv_1= 'val' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) otherlv_5= '=' otherlv_6= '{' ( (lv_definition_7_0= ruleBigraphExpression ) )* otherlv_8= '}' ) )
            // InternalBDSL.g:774:2: ( () otherlv_1= 'val' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) otherlv_5= '=' otherlv_6= '{' ( (lv_definition_7_0= ruleBigraphExpression ) )* otherlv_8= '}' )
            {
            // InternalBDSL.g:774:2: ( () otherlv_1= 'val' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) otherlv_5= '=' otherlv_6= '{' ( (lv_definition_7_0= ruleBigraphExpression ) )* otherlv_8= '}' )
            // InternalBDSL.g:775:3: () otherlv_1= 'val' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) otherlv_5= '=' otherlv_6= '{' ( (lv_definition_7_0= ruleBigraphExpression ) )* otherlv_8= '}'
            {
            // InternalBDSL.g:775:3: ()
            // InternalBDSL.g:776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLVD2Access().getLocalVarDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLVD2Access().getValKeyword_1());
            		
            // InternalBDSL.g:786:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBDSL.g:787:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBDSL.g:787:4: (lv_name_2_0= RULE_ID )
            // InternalBDSL.g:788:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLVD2Access().getColonKeyword_3());
            		
            // InternalBDSL.g:808:3: ( ( ruleFQN ) )
            // InternalBDSL.g:809:4: ( ruleFQN )
            {
            // InternalBDSL.g:809:4: ( ruleFQN )
            // InternalBDSL.g:810:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLVD2Rule());
            					}
            				

            					newCompositeNode(grammarAccess.getLVD2Access().getTypeControlVariableCrossReference_4_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getLVD2Access().getEqualsSignKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getLVD2Access().getLeftCurlyBracketKeyword_6());
            		
            // InternalBDSL.g:832:3: ( (lv_definition_7_0= ruleBigraphExpression ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==13||(LA13_0>=23 && LA13_0<=24)||LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBDSL.g:833:4: (lv_definition_7_0= ruleBigraphExpression )
            	    {
            	    // InternalBDSL.g:833:4: (lv_definition_7_0= ruleBigraphExpression )
            	    // InternalBDSL.g:834:5: lv_definition_7_0= ruleBigraphExpression
            	    {

            	    					newCompositeNode(grammarAccess.getLVD2Access().getDefinitionBigraphExpressionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_22);
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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalBDSL.g:859:1: entryRuleLocalVarDecl returns [EObject current=null] : iv_ruleLocalVarDecl= ruleLocalVarDecl EOF ;
    public final EObject entryRuleLocalVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVarDecl = null;


        try {
            // InternalBDSL.g:859:53: (iv_ruleLocalVarDecl= ruleLocalVarDecl EOF )
            // InternalBDSL.g:860:2: iv_ruleLocalVarDecl= ruleLocalVarDecl EOF
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
    // InternalBDSL.g:866:1: ruleLocalVarDecl returns [EObject current=null] : (otherlv_0= 'val' () ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) ) ) ;
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
            // InternalBDSL.g:872:2: ( (otherlv_0= 'val' () ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) ) ) )
            // InternalBDSL.g:873:2: (otherlv_0= 'val' () ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) ) )
            {
            // InternalBDSL.g:873:2: (otherlv_0= 'val' () ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) ) )
            // InternalBDSL.g:874:3: otherlv_0= 'val' () ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalVarDeclAccess().getValKeyword_0());
            		
            // InternalBDSL.g:878:3: ()
            // InternalBDSL.g:879:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocalVarDeclAccess().getLocalVarDeclAction_1(),
            					current);
            			

            }

            // InternalBDSL.g:885:3: ( ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' ) )
            // InternalBDSL.g:886:4: ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )? (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' )
            {
            // InternalBDSL.g:886:4: ( (lv_name_2_0= RULE_ID ) )
            // InternalBDSL.g:887:5: (lv_name_2_0= RULE_ID )
            {
            // InternalBDSL.g:887:5: (lv_name_2_0= RULE_ID )
            // InternalBDSL.g:888:6: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            // InternalBDSL.g:904:4: (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBDSL.g:905:5: otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getLocalVarDeclAccess().getLeftParenthesisKeyword_2_1_0());
                    				
                    // InternalBDSL.g:909:5: ( (otherlv_4= RULE_ID ) )
                    // InternalBDSL.g:910:6: (otherlv_4= RULE_ID )
                    {
                    // InternalBDSL.g:910:6: (otherlv_4= RULE_ID )
                    // InternalBDSL.g:911:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLocalVarDeclRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_20); 

                    							newLeafNode(otherlv_4, grammarAccess.getLocalVarDeclAccess().getSigSignatureCrossReference_2_1_1_0());
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_24); 

                    					newLeafNode(otherlv_5, grammarAccess.getLocalVarDeclAccess().getRightParenthesisKeyword_2_1_2());
                    				

                    }
                    break;

            }

            // InternalBDSL.g:927:4: ( (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=27 && LA17_0<=28)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBDSL.g:928:5: (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )? otherlv_11= ':' ( ( ruleFQN ) )
                    {
                    // InternalBDSL.g:928:5: (otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==28) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalBDSL.g:929:6: otherlv_6= '[' ( (lv_siteArgs_7_0= ruleSiteVars ) ) (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )* otherlv_10= ']'
                            {
                            otherlv_6=(Token)match(input,28,FOLLOW_6); 

                            						newLeafNode(otherlv_6, grammarAccess.getLocalVarDeclAccess().getLeftSquareBracketKeyword_2_2_0_0());
                            					
                            // InternalBDSL.g:933:6: ( (lv_siteArgs_7_0= ruleSiteVars ) )
                            // InternalBDSL.g:934:7: (lv_siteArgs_7_0= ruleSiteVars )
                            {
                            // InternalBDSL.g:934:7: (lv_siteArgs_7_0= ruleSiteVars )
                            // InternalBDSL.g:935:8: lv_siteArgs_7_0= ruleSiteVars
                            {

                            								newCompositeNode(grammarAccess.getLocalVarDeclAccess().getSiteArgsSiteVarsParserRuleCall_2_2_0_1_0());
                            							
                            pushFollow(FOLLOW_25);
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

                            // InternalBDSL.g:952:6: (otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==22) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalBDSL.g:953:7: otherlv_8= ',' ( (lv_siteArgs_9_0= ruleSiteVars ) )
                            	    {
                            	    otherlv_8=(Token)match(input,22,FOLLOW_6); 

                            	    							newLeafNode(otherlv_8, grammarAccess.getLocalVarDeclAccess().getCommaKeyword_2_2_0_2_0());
                            	    						
                            	    // InternalBDSL.g:957:7: ( (lv_siteArgs_9_0= ruleSiteVars ) )
                            	    // InternalBDSL.g:958:8: (lv_siteArgs_9_0= ruleSiteVars )
                            	    {
                            	    // InternalBDSL.g:958:8: (lv_siteArgs_9_0= ruleSiteVars )
                            	    // InternalBDSL.g:959:9: lv_siteArgs_9_0= ruleSiteVars
                            	    {

                            	    									newCompositeNode(grammarAccess.getLocalVarDeclAccess().getSiteArgsSiteVarsParserRuleCall_2_2_0_2_1_0());
                            	    								
                            	    pushFollow(FOLLOW_25);
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

                            otherlv_10=(Token)match(input,29,FOLLOW_21); 

                            						newLeafNode(otherlv_10, grammarAccess.getLocalVarDeclAccess().getRightSquareBracketKeyword_2_2_0_3());
                            					

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,27,FOLLOW_6); 

                    					newLeafNode(otherlv_11, grammarAccess.getLocalVarDeclAccess().getColonKeyword_2_2_1());
                    				
                    // InternalBDSL.g:986:5: ( ( ruleFQN ) )
                    // InternalBDSL.g:987:6: ( ruleFQN )
                    {
                    // InternalBDSL.g:987:6: ( ruleFQN )
                    // InternalBDSL.g:988:7: ruleFQN
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLocalVarDeclRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLocalVarDeclAccess().getTypeControlVariableCrossReference_2_2_2_0());
                    						
                    pushFollow(FOLLOW_8);
                    ruleFQN();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalBDSL.g:1003:4: (otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}' )
            // InternalBDSL.g:1004:5: otherlv_13= '=' otherlv_14= '{' ( (lv_definition_15_0= ruleBigraphExpression ) )* otherlv_16= '}'
            {
            otherlv_13=(Token)match(input,15,FOLLOW_9); 

            					newLeafNode(otherlv_13, grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_2_3_0());
            				
            otherlv_14=(Token)match(input,16,FOLLOW_22); 

            					newLeafNode(otherlv_14, grammarAccess.getLocalVarDeclAccess().getLeftCurlyBracketKeyword_2_3_1());
            				
            // InternalBDSL.g:1012:5: ( (lv_definition_15_0= ruleBigraphExpression ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==13||(LA18_0>=23 && LA18_0<=24)||LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBDSL.g:1013:6: (lv_definition_15_0= ruleBigraphExpression )
            	    {
            	    // InternalBDSL.g:1013:6: (lv_definition_15_0= ruleBigraphExpression )
            	    // InternalBDSL.g:1014:7: lv_definition_15_0= ruleBigraphExpression
            	    {

            	    							newCompositeNode(grammarAccess.getLocalVarDeclAccess().getDefinitionBigraphExpressionParserRuleCall_2_3_2_0());
            	    						
            	    pushFollow(FOLLOW_22);
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

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleLocalRuleDecl"
    // InternalBDSL.g:1041:1: entryRuleLocalRuleDecl returns [EObject current=null] : iv_ruleLocalRuleDecl= ruleLocalRuleDecl EOF ;
    public final EObject entryRuleLocalRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalRuleDecl = null;


        try {
            // InternalBDSL.g:1041:54: (iv_ruleLocalRuleDecl= ruleLocalRuleDecl EOF )
            // InternalBDSL.g:1042:2: iv_ruleLocalRuleDecl= ruleLocalRuleDecl EOF
            {
             newCompositeNode(grammarAccess.getLocalRuleDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalRuleDecl=ruleLocalRuleDecl();

            state._fsp--;

             current =iv_ruleLocalRuleDecl; 
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
    // $ANTLR end "entryRuleLocalRuleDecl"


    // $ANTLR start "ruleLocalRuleDecl"
    // InternalBDSL.g:1048:1: ruleLocalRuleDecl returns [EObject current=null] : (otherlv_0= 'react' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? (otherlv_6= '=' otherlv_7= '{' ( (lv_redex_8_0= ruleBigraphExpression ) ) otherlv_9= '}' otherlv_10= ',' otherlv_11= '{' ( (lv_reactum_12_0= ruleBigraphExpression ) ) otherlv_13= '}' ) ) ;
    public final EObject ruleLocalRuleDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_redex_8_0 = null;

        EObject lv_reactum_12_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1054:2: ( (otherlv_0= 'react' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? (otherlv_6= '=' otherlv_7= '{' ( (lv_redex_8_0= ruleBigraphExpression ) ) otherlv_9= '}' otherlv_10= ',' otherlv_11= '{' ( (lv_reactum_12_0= ruleBigraphExpression ) ) otherlv_13= '}' ) ) )
            // InternalBDSL.g:1055:2: (otherlv_0= 'react' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? (otherlv_6= '=' otherlv_7= '{' ( (lv_redex_8_0= ruleBigraphExpression ) ) otherlv_9= '}' otherlv_10= ',' otherlv_11= '{' ( (lv_reactum_12_0= ruleBigraphExpression ) ) otherlv_13= '}' ) )
            {
            // InternalBDSL.g:1055:2: (otherlv_0= 'react' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? (otherlv_6= '=' otherlv_7= '{' ( (lv_redex_8_0= ruleBigraphExpression ) ) otherlv_9= '}' otherlv_10= ',' otherlv_11= '{' ( (lv_reactum_12_0= ruleBigraphExpression ) ) otherlv_13= '}' ) )
            // InternalBDSL.g:1056:3: otherlv_0= 'react' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )? (otherlv_6= '=' otherlv_7= '{' ( (lv_redex_8_0= ruleBigraphExpression ) ) otherlv_9= '}' otherlv_10= ',' otherlv_11= '{' ( (lv_reactum_12_0= ruleBigraphExpression ) ) otherlv_13= '}' )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalRuleDeclAccess().getReactKeyword_0());
            		
            // InternalBDSL.g:1060:3: ()
            // InternalBDSL.g:1061:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocalRuleDeclAccess().getLocalRuleDeclAction_1(),
            					current);
            			

            }

            // InternalBDSL.g:1067:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBDSL.g:1068:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBDSL.g:1068:4: (lv_name_2_0= RULE_ID )
            // InternalBDSL.g:1069:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLocalRuleDeclAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalRuleDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBDSL.g:1085:3: (otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBDSL.g:1086:4: otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocalRuleDeclAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalBDSL.g:1090:4: ( (otherlv_4= RULE_ID ) )
                    // InternalBDSL.g:1091:5: (otherlv_4= RULE_ID )
                    {
                    // InternalBDSL.g:1091:5: (otherlv_4= RULE_ID )
                    // InternalBDSL.g:1092:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocalRuleDeclRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_4, grammarAccess.getLocalRuleDeclAccess().getSigSignatureCrossReference_3_1_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getLocalRuleDeclAccess().getRightParenthesisKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalBDSL.g:1108:3: (otherlv_6= '=' otherlv_7= '{' ( (lv_redex_8_0= ruleBigraphExpression ) ) otherlv_9= '}' otherlv_10= ',' otherlv_11= '{' ( (lv_reactum_12_0= ruleBigraphExpression ) ) otherlv_13= '}' )
            // InternalBDSL.g:1109:4: otherlv_6= '=' otherlv_7= '{' ( (lv_redex_8_0= ruleBigraphExpression ) ) otherlv_9= '}' otherlv_10= ',' otherlv_11= '{' ( (lv_reactum_12_0= ruleBigraphExpression ) ) otherlv_13= '}'
            {
            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            				newLeafNode(otherlv_6, grammarAccess.getLocalRuleDeclAccess().getEqualsSignKeyword_4_0());
            			
            otherlv_7=(Token)match(input,16,FOLLOW_27); 

            				newLeafNode(otherlv_7, grammarAccess.getLocalRuleDeclAccess().getLeftCurlyBracketKeyword_4_1());
            			
            // InternalBDSL.g:1117:4: ( (lv_redex_8_0= ruleBigraphExpression ) )
            // InternalBDSL.g:1118:5: (lv_redex_8_0= ruleBigraphExpression )
            {
            // InternalBDSL.g:1118:5: (lv_redex_8_0= ruleBigraphExpression )
            // InternalBDSL.g:1119:6: lv_redex_8_0= ruleBigraphExpression
            {

            						newCompositeNode(grammarAccess.getLocalRuleDeclAccess().getRedexBigraphExpressionParserRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_28);
            lv_redex_8_0=ruleBigraphExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getLocalRuleDeclRule());
            						}
            						set(
            							current,
            							"redex",
            							lv_redex_8_0,
            							"de.tudresden.inf.st.bigraphs.dsl.BDSL.BigraphExpression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_18); 

            				newLeafNode(otherlv_9, grammarAccess.getLocalRuleDeclAccess().getRightCurlyBracketKeyword_4_3());
            			
            otherlv_10=(Token)match(input,22,FOLLOW_9); 

            				newLeafNode(otherlv_10, grammarAccess.getLocalRuleDeclAccess().getCommaKeyword_4_4());
            			
            otherlv_11=(Token)match(input,16,FOLLOW_27); 

            				newLeafNode(otherlv_11, grammarAccess.getLocalRuleDeclAccess().getLeftCurlyBracketKeyword_4_5());
            			
            // InternalBDSL.g:1148:4: ( (lv_reactum_12_0= ruleBigraphExpression ) )
            // InternalBDSL.g:1149:5: (lv_reactum_12_0= ruleBigraphExpression )
            {
            // InternalBDSL.g:1149:5: (lv_reactum_12_0= ruleBigraphExpression )
            // InternalBDSL.g:1150:6: lv_reactum_12_0= ruleBigraphExpression
            {

            						newCompositeNode(grammarAccess.getLocalRuleDeclAccess().getReactumBigraphExpressionParserRuleCall_4_6_0());
            					
            pushFollow(FOLLOW_28);
            lv_reactum_12_0=ruleBigraphExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getLocalRuleDeclRule());
            						}
            						set(
            							current,
            							"reactum",
            							lv_reactum_12_0,
            							"de.tudresden.inf.st.bigraphs.dsl.BDSL.BigraphExpression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            				newLeafNode(otherlv_13, grammarAccess.getLocalRuleDeclAccess().getRightCurlyBracketKeyword_4_7());
            			

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
    // $ANTLR end "ruleLocalRuleDecl"


    // $ANTLR start "entryRuleBigraphVarReference"
    // InternalBDSL.g:1176:1: entryRuleBigraphVarReference returns [EObject current=null] : iv_ruleBigraphVarReference= ruleBigraphVarReference EOF ;
    public final EObject entryRuleBigraphVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigraphVarReference = null;


        try {
            // InternalBDSL.g:1176:60: (iv_ruleBigraphVarReference= ruleBigraphVarReference EOF )
            // InternalBDSL.g:1177:2: iv_ruleBigraphVarReference= ruleBigraphVarReference EOF
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
    // InternalBDSL.g:1183:1: ruleBigraphVarReference returns [EObject current=null] : ( ( ruleBigraphVarReferenceID ) ) ;
    public final EObject ruleBigraphVarReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalBDSL.g:1189:2: ( ( ( ruleBigraphVarReferenceID ) ) )
            // InternalBDSL.g:1190:2: ( ( ruleBigraphVarReferenceID ) )
            {
            // InternalBDSL.g:1190:2: ( ( ruleBigraphVarReferenceID ) )
            // InternalBDSL.g:1191:3: ( ruleBigraphVarReferenceID )
            {
            // InternalBDSL.g:1191:3: ( ruleBigraphVarReferenceID )
            // InternalBDSL.g:1192:4: ruleBigraphVarReferenceID
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


    // $ANTLR start "entryRuleRuleVarReference"
    // InternalBDSL.g:1209:1: entryRuleRuleVarReference returns [EObject current=null] : iv_ruleRuleVarReference= ruleRuleVarReference EOF ;
    public final EObject entryRuleRuleVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleVarReference = null;


        try {
            // InternalBDSL.g:1209:57: (iv_ruleRuleVarReference= ruleRuleVarReference EOF )
            // InternalBDSL.g:1210:2: iv_ruleRuleVarReference= ruleRuleVarReference EOF
            {
             newCompositeNode(grammarAccess.getRuleVarReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleVarReference=ruleRuleVarReference();

            state._fsp--;

             current =iv_ruleRuleVarReference; 
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
    // $ANTLR end "entryRuleRuleVarReference"


    // $ANTLR start "ruleRuleVarReference"
    // InternalBDSL.g:1216:1: ruleRuleVarReference returns [EObject current=null] : ( ( ruleBigraphVarReferenceID ) ) ;
    public final EObject ruleRuleVarReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalBDSL.g:1222:2: ( ( ( ruleBigraphVarReferenceID ) ) )
            // InternalBDSL.g:1223:2: ( ( ruleBigraphVarReferenceID ) )
            {
            // InternalBDSL.g:1223:2: ( ( ruleBigraphVarReferenceID ) )
            // InternalBDSL.g:1224:3: ( ruleBigraphVarReferenceID )
            {
            // InternalBDSL.g:1224:3: ( ruleBigraphVarReferenceID )
            // InternalBDSL.g:1225:4: ruleBigraphVarReferenceID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRuleVarReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getRuleVarReferenceAccess().getValueLocalRuleDeclCrossReference_0());
            			
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
    // $ANTLR end "ruleRuleVarReference"


    // $ANTLR start "entryRuleAbstractBigraphDeclaration"
    // InternalBDSL.g:1242:1: entryRuleAbstractBigraphDeclaration returns [EObject current=null] : iv_ruleAbstractBigraphDeclaration= ruleAbstractBigraphDeclaration EOF ;
    public final EObject entryRuleAbstractBigraphDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBigraphDeclaration = null;


        try {
            // InternalBDSL.g:1242:67: (iv_ruleAbstractBigraphDeclaration= ruleAbstractBigraphDeclaration EOF )
            // InternalBDSL.g:1243:2: iv_ruleAbstractBigraphDeclaration= ruleAbstractBigraphDeclaration EOF
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
    // InternalBDSL.g:1249:1: ruleAbstractBigraphDeclaration returns [EObject current=null] : (this_BigraphVarReference_0= ruleBigraphVarReference | this_NodeExpressionCall_1= ruleNodeExpressionCall | this_LVD2_2= ruleLVD2 | this_Site_3= ruleSite ) ;
    public final EObject ruleAbstractBigraphDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_BigraphVarReference_0 = null;

        EObject this_NodeExpressionCall_1 = null;

        EObject this_LVD2_2 = null;

        EObject this_Site_3 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1255:2: ( (this_BigraphVarReference_0= ruleBigraphVarReference | this_NodeExpressionCall_1= ruleNodeExpressionCall | this_LVD2_2= ruleLVD2 | this_Site_3= ruleSite ) )
            // InternalBDSL.g:1256:2: (this_BigraphVarReference_0= ruleBigraphVarReference | this_NodeExpressionCall_1= ruleNodeExpressionCall | this_LVD2_2= ruleLVD2 | this_Site_3= ruleSite )
            {
            // InternalBDSL.g:1256:2: (this_BigraphVarReference_0= ruleBigraphVarReference | this_NodeExpressionCall_1= ruleNodeExpressionCall | this_LVD2_2= ruleLVD2 | this_Site_3= ruleSite )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                alt20=2;
                }
                break;
            case 26:
                {
                alt20=3;
                }
                break;
            case 23:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalBDSL.g:1257:3: this_BigraphVarReference_0= ruleBigraphVarReference
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
                    // InternalBDSL.g:1266:3: this_NodeExpressionCall_1= ruleNodeExpressionCall
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
                    // InternalBDSL.g:1275:3: this_LVD2_2= ruleLVD2
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
                    // InternalBDSL.g:1284:3: this_Site_3= ruleSite
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
    // InternalBDSL.g:1296:1: entryRuleNodeExpressionCall returns [EObject current=null] : iv_ruleNodeExpressionCall= ruleNodeExpressionCall EOF ;
    public final EObject entryRuleNodeExpressionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeExpressionCall = null;


        try {
            // InternalBDSL.g:1296:59: (iv_ruleNodeExpressionCall= ruleNodeExpressionCall EOF )
            // InternalBDSL.g:1297:2: iv_ruleNodeExpressionCall= ruleNodeExpressionCall EOF
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
    // InternalBDSL.g:1303:1: ruleNodeExpressionCall returns [EObject current=null] : ( ( ( ruleFQN ) ) (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )? ) ;
    public final EObject ruleNodeExpressionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_links_2_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1309:2: ( ( ( ( ruleFQN ) ) (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )? ) )
            // InternalBDSL.g:1310:2: ( ( ( ruleFQN ) ) (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )? )
            {
            // InternalBDSL.g:1310:2: ( ( ( ruleFQN ) ) (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )? )
            // InternalBDSL.g:1311:3: ( ( ruleFQN ) ) (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )?
            {
            // InternalBDSL.g:1311:3: ( ( ruleFQN ) )
            // InternalBDSL.g:1312:4: ( ruleFQN )
            {
            // InternalBDSL.g:1312:4: ( ruleFQN )
            // InternalBDSL.g:1313:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeExpressionCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNodeExpressionCallAccess().getValueControlVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_29);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBDSL.g:1327:3: (otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBDSL.g:1328:4: otherlv_1= '[' ( (lv_links_2_0= ruleLinkNames ) )* otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getNodeExpressionCallAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalBDSL.g:1332:4: ( (lv_links_2_0= ruleLinkNames ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalBDSL.g:1333:5: (lv_links_2_0= ruleLinkNames )
                    	    {
                    	    // InternalBDSL.g:1333:5: (lv_links_2_0= ruleLinkNames )
                    	    // InternalBDSL.g:1334:6: lv_links_2_0= ruleLinkNames
                    	    {

                    	    						newCompositeNode(grammarAccess.getNodeExpressionCallAccess().getLinksLinkNamesParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalBDSL.g:1360:1: entryRuleBigraphExpression returns [EObject current=null] : iv_ruleBigraphExpression= ruleBigraphExpression EOF ;
    public final EObject entryRuleBigraphExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigraphExpression = null;


        try {
            // InternalBDSL.g:1360:58: (iv_ruleBigraphExpression= ruleBigraphExpression EOF )
            // InternalBDSL.g:1361:2: iv_ruleBigraphExpression= ruleBigraphExpression EOF
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
    // InternalBDSL.g:1367:1: ruleBigraphExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleBigraphExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1373:2: (this_Addition_0= ruleAddition )
            // InternalBDSL.g:1374:2: this_Addition_0= ruleAddition
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
    // InternalBDSL.g:1385:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalBDSL.g:1385:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalBDSL.g:1386:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalBDSL.g:1392:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1398:2: ( (this_Multiplication_0= ruleMultiplication ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalBDSL.g:1399:2: (this_Multiplication_0= ruleMultiplication ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalBDSL.g:1399:2: (this_Multiplication_0= ruleMultiplication ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalBDSL.g:1400:3: this_Multiplication_0= ruleMultiplication ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBDSL.g:1408:3: ( ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=35 && LA23_0<=37)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBDSL.g:1409:4: ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalBDSL.g:1409:4: ( () ( (lv_operator_2_0= ruleBinaryParallelOperator ) ) )
            	    // InternalBDSL.g:1410:5: () ( (lv_operator_2_0= ruleBinaryParallelOperator ) )
            	    {
            	    // InternalBDSL.g:1410:5: ()
            	    // InternalBDSL.g:1411:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalBDSL.g:1417:5: ( (lv_operator_2_0= ruleBinaryParallelOperator ) )
            	    // InternalBDSL.g:1418:6: (lv_operator_2_0= ruleBinaryParallelOperator )
            	    {
            	    // InternalBDSL.g:1418:6: (lv_operator_2_0= ruleBinaryParallelOperator )
            	    // InternalBDSL.g:1419:7: lv_operator_2_0= ruleBinaryParallelOperator
            	    {

            	    							newCompositeNode(grammarAccess.getAdditionAccess().getOperatorBinaryParallelOperatorEnumRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_27);
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

            	    // InternalBDSL.g:1437:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalBDSL.g:1438:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalBDSL.g:1438:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalBDSL.g:1439:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalBDSL.g:1461:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalBDSL.g:1461:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalBDSL.g:1462:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalBDSL.g:1468:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1474:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalBDSL.g:1475:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalBDSL.g:1475:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalBDSL.g:1476:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBDSL.g:1484:3: ( ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=38 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBDSL.g:1485:4: ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalBDSL.g:1485:4: ( () ( (lv_operator_2_0= ruleBinaryNestingOperator ) ) )
            	    // InternalBDSL.g:1486:5: () ( (lv_operator_2_0= ruleBinaryNestingOperator ) )
            	    {
            	    // InternalBDSL.g:1486:5: ()
            	    // InternalBDSL.g:1487:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalBDSL.g:1493:5: ( (lv_operator_2_0= ruleBinaryNestingOperator ) )
            	    // InternalBDSL.g:1494:6: (lv_operator_2_0= ruleBinaryNestingOperator )
            	    {
            	    // InternalBDSL.g:1494:6: (lv_operator_2_0= ruleBinaryNestingOperator )
            	    // InternalBDSL.g:1495:7: lv_operator_2_0= ruleBinaryNestingOperator
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplicationAccess().getOperatorBinaryNestingOperatorEnumRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_27);
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

            	    // InternalBDSL.g:1513:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalBDSL.g:1514:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalBDSL.g:1514:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalBDSL.g:1515:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop24;
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
    // InternalBDSL.g:1537:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalBDSL.g:1537:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalBDSL.g:1538:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalBDSL.g:1544:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' ) | this_AbstractBigraphDeclaration_3= ruleAbstractBigraphDeclaration ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_BigraphExpression_1 = null;

        EObject this_AbstractBigraphDeclaration_3 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1550:2: ( ( (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' ) | this_AbstractBigraphDeclaration_3= ruleAbstractBigraphDeclaration ) )
            // InternalBDSL.g:1551:2: ( (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' ) | this_AbstractBigraphDeclaration_3= ruleAbstractBigraphDeclaration )
            {
            // InternalBDSL.g:1551:2: ( (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' ) | this_AbstractBigraphDeclaration_3= ruleAbstractBigraphDeclaration )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID||LA25_0==13||LA25_0==23||LA25_0==26) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalBDSL.g:1552:3: (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' )
                    {
                    // InternalBDSL.g:1552:3: (otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')' )
                    // InternalBDSL.g:1553:4: otherlv_0= '(' this_BigraphExpression_1= ruleBigraphExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBigraphExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_20);
                    this_BigraphExpression_1=ruleBigraphExpression();

                    state._fsp--;


                    				current = this_BigraphExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1571:3: this_AbstractBigraphDeclaration_3= ruleAbstractBigraphDeclaration
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
    // InternalBDSL.g:1583:1: entryRuleMainDeclaration returns [EObject current=null] : iv_ruleMainDeclaration= ruleMainDeclaration EOF ;
    public final EObject entryRuleMainDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainDeclaration = null;


        try {
            // InternalBDSL.g:1583:56: (iv_ruleMainDeclaration= ruleMainDeclaration EOF )
            // InternalBDSL.g:1584:2: iv_ruleMainDeclaration= ruleMainDeclaration EOF
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
    // InternalBDSL.g:1590:1: ruleMainDeclaration returns [EObject current=null] : ( () ( (lv_definition_1_0= ruleAbstractMainStatements ) ) otherlv_2= ';' ) ;
    public final EObject ruleMainDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_definition_1_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1596:2: ( ( () ( (lv_definition_1_0= ruleAbstractMainStatements ) ) otherlv_2= ';' ) )
            // InternalBDSL.g:1597:2: ( () ( (lv_definition_1_0= ruleAbstractMainStatements ) ) otherlv_2= ';' )
            {
            // InternalBDSL.g:1597:2: ( () ( (lv_definition_1_0= ruleAbstractMainStatements ) ) otherlv_2= ';' )
            // InternalBDSL.g:1598:3: () ( (lv_definition_1_0= ruleAbstractMainStatements ) ) otherlv_2= ';'
            {
            // InternalBDSL.g:1598:3: ()
            // InternalBDSL.g:1599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainDeclarationAccess().getMainDeclarationAction_0(),
            					current);
            			

            }

            // InternalBDSL.g:1605:3: ( (lv_definition_1_0= ruleAbstractMainStatements ) )
            // InternalBDSL.g:1606:4: (lv_definition_1_0= ruleAbstractMainStatements )
            {
            // InternalBDSL.g:1606:4: (lv_definition_1_0= ruleAbstractMainStatements )
            // InternalBDSL.g:1607:5: lv_definition_1_0= ruleAbstractMainStatements
            {

            					newCompositeNode(grammarAccess.getMainDeclarationAccess().getDefinitionAbstractMainStatementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

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
    // InternalBDSL.g:1632:1: entryRuleAbstractMainStatements returns [EObject current=null] : iv_ruleAbstractMainStatements= ruleAbstractMainStatements EOF ;
    public final EObject entryRuleAbstractMainStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMainStatements = null;


        try {
            // InternalBDSL.g:1632:63: (iv_ruleAbstractMainStatements= ruleAbstractMainStatements EOF )
            // InternalBDSL.g:1633:2: iv_ruleAbstractMainStatements= ruleAbstractMainStatements EOF
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
    // InternalBDSL.g:1639:1: ruleAbstractMainStatements returns [EObject current=null] : (this_BigraphVarReference_0= ruleBigraphVarReference | this_BRSDefinition_1= ruleBRSDefinition | this_PrintLn_2= rulePrintLn ) ;
    public final EObject ruleAbstractMainStatements() throws RecognitionException {
        EObject current = null;

        EObject this_BigraphVarReference_0 = null;

        EObject this_BRSDefinition_1 = null;

        EObject this_PrintLn_2 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1645:2: ( (this_BigraphVarReference_0= ruleBigraphVarReference | this_BRSDefinition_1= ruleBRSDefinition | this_PrintLn_2= rulePrintLn ) )
            // InternalBDSL.g:1646:2: (this_BigraphVarReference_0= ruleBigraphVarReference | this_BRSDefinition_1= ruleBRSDefinition | this_PrintLn_2= rulePrintLn )
            {
            // InternalBDSL.g:1646:2: (this_BigraphVarReference_0= ruleBigraphVarReference | this_BRSDefinition_1= ruleBRSDefinition | this_PrintLn_2= rulePrintLn )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt26=1;
                }
                break;
            case 31:
                {
                alt26=2;
                }
                break;
            case 34:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalBDSL.g:1647:3: this_BigraphVarReference_0= ruleBigraphVarReference
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
                    // InternalBDSL.g:1656:3: this_BRSDefinition_1= ruleBRSDefinition
                    {

                    			newCompositeNode(grammarAccess.getAbstractMainStatementsAccess().getBRSDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BRSDefinition_1=ruleBRSDefinition();

                    state._fsp--;


                    			current = this_BRSDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1665:3: this_PrintLn_2= rulePrintLn
                    {

                    			newCompositeNode(grammarAccess.getAbstractMainStatementsAccess().getPrintLnParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintLn_2=rulePrintLn();

                    state._fsp--;


                    			current = this_PrintLn_2;
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


    // $ANTLR start "entryRuleBRSDefinition"
    // InternalBDSL.g:1677:1: entryRuleBRSDefinition returns [EObject current=null] : iv_ruleBRSDefinition= ruleBRSDefinition EOF ;
    public final EObject entryRuleBRSDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBRSDefinition = null;


        try {
            // InternalBDSL.g:1677:54: (iv_ruleBRSDefinition= ruleBRSDefinition EOF )
            // InternalBDSL.g:1678:2: iv_ruleBRSDefinition= ruleBRSDefinition EOF
            {
             newCompositeNode(grammarAccess.getBRSDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBRSDefinition=ruleBRSDefinition();

            state._fsp--;

             current =iv_ruleBRSDefinition; 
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
    // $ANTLR end "entryRuleBRSDefinition"


    // $ANTLR start "ruleBRSDefinition"
    // InternalBDSL.g:1684:1: ruleBRSDefinition returns [EObject current=null] : ( () otherlv_1= 'brs' otherlv_2= '{' (otherlv_3= 'agents' otherlv_4= '=' (otherlv_5= '[' ( (lv_agents_6_0= ruleBigraphVarReference ) )? (otherlv_7= ',' ( (lv_agents_8_0= ruleBigraphVarReference ) ) )* otherlv_9= ']' )? ) otherlv_10= ',' (otherlv_11= 'rules' otherlv_12= '=' (otherlv_13= '[' ( (lv_rules_14_0= ruleRuleVarReference ) )? (otherlv_15= ',' ( (lv_agents_16_0= ruleRuleVarReference ) ) )* otherlv_17= ']' )? ) otherlv_18= '}' ) ;
    public final EObject ruleBRSDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_agents_6_0 = null;

        EObject lv_agents_8_0 = null;

        EObject lv_rules_14_0 = null;

        EObject lv_agents_16_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1690:2: ( ( () otherlv_1= 'brs' otherlv_2= '{' (otherlv_3= 'agents' otherlv_4= '=' (otherlv_5= '[' ( (lv_agents_6_0= ruleBigraphVarReference ) )? (otherlv_7= ',' ( (lv_agents_8_0= ruleBigraphVarReference ) ) )* otherlv_9= ']' )? ) otherlv_10= ',' (otherlv_11= 'rules' otherlv_12= '=' (otherlv_13= '[' ( (lv_rules_14_0= ruleRuleVarReference ) )? (otherlv_15= ',' ( (lv_agents_16_0= ruleRuleVarReference ) ) )* otherlv_17= ']' )? ) otherlv_18= '}' ) )
            // InternalBDSL.g:1691:2: ( () otherlv_1= 'brs' otherlv_2= '{' (otherlv_3= 'agents' otherlv_4= '=' (otherlv_5= '[' ( (lv_agents_6_0= ruleBigraphVarReference ) )? (otherlv_7= ',' ( (lv_agents_8_0= ruleBigraphVarReference ) ) )* otherlv_9= ']' )? ) otherlv_10= ',' (otherlv_11= 'rules' otherlv_12= '=' (otherlv_13= '[' ( (lv_rules_14_0= ruleRuleVarReference ) )? (otherlv_15= ',' ( (lv_agents_16_0= ruleRuleVarReference ) ) )* otherlv_17= ']' )? ) otherlv_18= '}' )
            {
            // InternalBDSL.g:1691:2: ( () otherlv_1= 'brs' otherlv_2= '{' (otherlv_3= 'agents' otherlv_4= '=' (otherlv_5= '[' ( (lv_agents_6_0= ruleBigraphVarReference ) )? (otherlv_7= ',' ( (lv_agents_8_0= ruleBigraphVarReference ) ) )* otherlv_9= ']' )? ) otherlv_10= ',' (otherlv_11= 'rules' otherlv_12= '=' (otherlv_13= '[' ( (lv_rules_14_0= ruleRuleVarReference ) )? (otherlv_15= ',' ( (lv_agents_16_0= ruleRuleVarReference ) ) )* otherlv_17= ']' )? ) otherlv_18= '}' )
            // InternalBDSL.g:1692:3: () otherlv_1= 'brs' otherlv_2= '{' (otherlv_3= 'agents' otherlv_4= '=' (otherlv_5= '[' ( (lv_agents_6_0= ruleBigraphVarReference ) )? (otherlv_7= ',' ( (lv_agents_8_0= ruleBigraphVarReference ) ) )* otherlv_9= ']' )? ) otherlv_10= ',' (otherlv_11= 'rules' otherlv_12= '=' (otherlv_13= '[' ( (lv_rules_14_0= ruleRuleVarReference ) )? (otherlv_15= ',' ( (lv_agents_16_0= ruleRuleVarReference ) ) )* otherlv_17= ']' )? ) otherlv_18= '}'
            {
            // InternalBDSL.g:1692:3: ()
            // InternalBDSL.g:1693:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBRSDefinitionAccess().getBRSDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBRSDefinitionAccess().getBrsKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getBRSDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBDSL.g:1707:3: (otherlv_3= 'agents' otherlv_4= '=' (otherlv_5= '[' ( (lv_agents_6_0= ruleBigraphVarReference ) )? (otherlv_7= ',' ( (lv_agents_8_0= ruleBigraphVarReference ) ) )* otherlv_9= ']' )? )
            // InternalBDSL.g:1708:4: otherlv_3= 'agents' otherlv_4= '=' (otherlv_5= '[' ( (lv_agents_6_0= ruleBigraphVarReference ) )? (otherlv_7= ',' ( (lv_agents_8_0= ruleBigraphVarReference ) ) )* otherlv_9= ']' )?
            {
            otherlv_3=(Token)match(input,32,FOLLOW_8); 

            				newLeafNode(otherlv_3, grammarAccess.getBRSDefinitionAccess().getAgentsKeyword_3_0());
            			
            otherlv_4=(Token)match(input,15,FOLLOW_34); 

            				newLeafNode(otherlv_4, grammarAccess.getBRSDefinitionAccess().getEqualsSignKeyword_3_1());
            			
            // InternalBDSL.g:1716:4: (otherlv_5= '[' ( (lv_agents_6_0= ruleBigraphVarReference ) )? (otherlv_7= ',' ( (lv_agents_8_0= ruleBigraphVarReference ) ) )* otherlv_9= ']' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBDSL.g:1717:5: otherlv_5= '[' ( (lv_agents_6_0= ruleBigraphVarReference ) )? (otherlv_7= ',' ( (lv_agents_8_0= ruleBigraphVarReference ) ) )* otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_35); 

                    					newLeafNode(otherlv_5, grammarAccess.getBRSDefinitionAccess().getLeftSquareBracketKeyword_3_2_0());
                    				
                    // InternalBDSL.g:1721:5: ( (lv_agents_6_0= ruleBigraphVarReference ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==13) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalBDSL.g:1722:6: (lv_agents_6_0= ruleBigraphVarReference )
                            {
                            // InternalBDSL.g:1722:6: (lv_agents_6_0= ruleBigraphVarReference )
                            // InternalBDSL.g:1723:7: lv_agents_6_0= ruleBigraphVarReference
                            {

                            							newCompositeNode(grammarAccess.getBRSDefinitionAccess().getAgentsBigraphVarReferenceParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_agents_6_0=ruleBigraphVarReference();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBRSDefinitionRule());
                            							}
                            							add(
                            								current,
                            								"agents",
                            								lv_agents_6_0,
                            								"de.tudresden.inf.st.bigraphs.dsl.BDSL.BigraphVarReference");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalBDSL.g:1740:5: (otherlv_7= ',' ( (lv_agents_8_0= ruleBigraphVarReference ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==22) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalBDSL.g:1741:6: otherlv_7= ',' ( (lv_agents_8_0= ruleBigraphVarReference ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FOLLOW_36); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getBRSDefinitionAccess().getCommaKeyword_3_2_2_0());
                    	    					
                    	    // InternalBDSL.g:1745:6: ( (lv_agents_8_0= ruleBigraphVarReference ) )
                    	    // InternalBDSL.g:1746:7: (lv_agents_8_0= ruleBigraphVarReference )
                    	    {
                    	    // InternalBDSL.g:1746:7: (lv_agents_8_0= ruleBigraphVarReference )
                    	    // InternalBDSL.g:1747:8: lv_agents_8_0= ruleBigraphVarReference
                    	    {

                    	    								newCompositeNode(grammarAccess.getBRSDefinitionAccess().getAgentsBigraphVarReferenceParserRuleCall_3_2_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_25);
                    	    lv_agents_8_0=ruleBigraphVarReference();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getBRSDefinitionRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"agents",
                    	    									lv_agents_8_0,
                    	    									"de.tudresden.inf.st.bigraphs.dsl.BDSL.BigraphVarReference");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_18); 

                    					newLeafNode(otherlv_9, grammarAccess.getBRSDefinitionAccess().getRightSquareBracketKeyword_3_2_3());
                    				

                    }
                    break;

            }


            }

            otherlv_10=(Token)match(input,22,FOLLOW_37); 

            			newLeafNode(otherlv_10, grammarAccess.getBRSDefinitionAccess().getCommaKeyword_4());
            		
            // InternalBDSL.g:1775:3: (otherlv_11= 'rules' otherlv_12= '=' (otherlv_13= '[' ( (lv_rules_14_0= ruleRuleVarReference ) )? (otherlv_15= ',' ( (lv_agents_16_0= ruleRuleVarReference ) ) )* otherlv_17= ']' )? )
            // InternalBDSL.g:1776:4: otherlv_11= 'rules' otherlv_12= '=' (otherlv_13= '[' ( (lv_rules_14_0= ruleRuleVarReference ) )? (otherlv_15= ',' ( (lv_agents_16_0= ruleRuleVarReference ) ) )* otherlv_17= ']' )?
            {
            otherlv_11=(Token)match(input,33,FOLLOW_8); 

            				newLeafNode(otherlv_11, grammarAccess.getBRSDefinitionAccess().getRulesKeyword_5_0());
            			
            otherlv_12=(Token)match(input,15,FOLLOW_38); 

            				newLeafNode(otherlv_12, grammarAccess.getBRSDefinitionAccess().getEqualsSignKeyword_5_1());
            			
            // InternalBDSL.g:1784:4: (otherlv_13= '[' ( (lv_rules_14_0= ruleRuleVarReference ) )? (otherlv_15= ',' ( (lv_agents_16_0= ruleRuleVarReference ) ) )* otherlv_17= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBDSL.g:1785:5: otherlv_13= '[' ( (lv_rules_14_0= ruleRuleVarReference ) )? (otherlv_15= ',' ( (lv_agents_16_0= ruleRuleVarReference ) ) )* otherlv_17= ']'
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_35); 

                    					newLeafNode(otherlv_13, grammarAccess.getBRSDefinitionAccess().getLeftSquareBracketKeyword_5_2_0());
                    				
                    // InternalBDSL.g:1789:5: ( (lv_rules_14_0= ruleRuleVarReference ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==13) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalBDSL.g:1790:6: (lv_rules_14_0= ruleRuleVarReference )
                            {
                            // InternalBDSL.g:1790:6: (lv_rules_14_0= ruleRuleVarReference )
                            // InternalBDSL.g:1791:7: lv_rules_14_0= ruleRuleVarReference
                            {

                            							newCompositeNode(grammarAccess.getBRSDefinitionAccess().getRulesRuleVarReferenceParserRuleCall_5_2_1_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_rules_14_0=ruleRuleVarReference();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBRSDefinitionRule());
                            							}
                            							add(
                            								current,
                            								"rules",
                            								lv_rules_14_0,
                            								"de.tudresden.inf.st.bigraphs.dsl.BDSL.RuleVarReference");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalBDSL.g:1808:5: (otherlv_15= ',' ( (lv_agents_16_0= ruleRuleVarReference ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==22) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalBDSL.g:1809:6: otherlv_15= ',' ( (lv_agents_16_0= ruleRuleVarReference ) )
                    	    {
                    	    otherlv_15=(Token)match(input,22,FOLLOW_36); 

                    	    						newLeafNode(otherlv_15, grammarAccess.getBRSDefinitionAccess().getCommaKeyword_5_2_2_0());
                    	    					
                    	    // InternalBDSL.g:1813:6: ( (lv_agents_16_0= ruleRuleVarReference ) )
                    	    // InternalBDSL.g:1814:7: (lv_agents_16_0= ruleRuleVarReference )
                    	    {
                    	    // InternalBDSL.g:1814:7: (lv_agents_16_0= ruleRuleVarReference )
                    	    // InternalBDSL.g:1815:8: lv_agents_16_0= ruleRuleVarReference
                    	    {

                    	    								newCompositeNode(grammarAccess.getBRSDefinitionAccess().getAgentsRuleVarReferenceParserRuleCall_5_2_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_25);
                    	    lv_agents_16_0=ruleRuleVarReference();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getBRSDefinitionRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"agents",
                    	    									lv_agents_16_0,
                    	    									"de.tudresden.inf.st.bigraphs.dsl.BDSL.RuleVarReference");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,29,FOLLOW_28); 

                    					newLeafNode(otherlv_17, grammarAccess.getBRSDefinitionAccess().getRightSquareBracketKeyword_5_2_3());
                    				

                    }
                    break;

            }


            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getBRSDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleBRSDefinition"


    // $ANTLR start "entryRulePrintLn"
    // InternalBDSL.g:1847:1: entryRulePrintLn returns [EObject current=null] : iv_rulePrintLn= rulePrintLn EOF ;
    public final EObject entryRulePrintLn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintLn = null;


        try {
            // InternalBDSL.g:1847:48: (iv_rulePrintLn= rulePrintLn EOF )
            // InternalBDSL.g:1848:2: iv_rulePrintLn= rulePrintLn EOF
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
    // InternalBDSL.g:1854:1: rulePrintLn returns [EObject current=null] : ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_text_3_0= rulePrintableExpression ) ) (otherlv_4= ',' ( (lv_mode_5_0= ruleOutputModeModel ) ) )? otherlv_6= ')' ) ;
    public final EObject rulePrintLn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_text_3_0 = null;

        Enumerator lv_mode_5_0 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1860:2: ( ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_text_3_0= rulePrintableExpression ) ) (otherlv_4= ',' ( (lv_mode_5_0= ruleOutputModeModel ) ) )? otherlv_6= ')' ) )
            // InternalBDSL.g:1861:2: ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_text_3_0= rulePrintableExpression ) ) (otherlv_4= ',' ( (lv_mode_5_0= ruleOutputModeModel ) ) )? otherlv_6= ')' )
            {
            // InternalBDSL.g:1861:2: ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_text_3_0= rulePrintableExpression ) ) (otherlv_4= ',' ( (lv_mode_5_0= ruleOutputModeModel ) ) )? otherlv_6= ')' )
            // InternalBDSL.g:1862:3: () otherlv_1= 'println' otherlv_2= '(' ( (lv_text_3_0= rulePrintableExpression ) ) (otherlv_4= ',' ( (lv_mode_5_0= ruleOutputModeModel ) ) )? otherlv_6= ')'
            {
            // InternalBDSL.g:1862:3: ()
            // InternalBDSL.g:1863:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintLnAccess().getPrintLnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintLnAccess().getPrintlnKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintLnAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBDSL.g:1877:3: ( (lv_text_3_0= rulePrintableExpression ) )
            // InternalBDSL.g:1878:4: (lv_text_3_0= rulePrintableExpression )
            {
            // InternalBDSL.g:1878:4: (lv_text_3_0= rulePrintableExpression )
            // InternalBDSL.g:1879:5: lv_text_3_0= rulePrintableExpression
            {

            					newCompositeNode(grammarAccess.getPrintLnAccess().getTextPrintableExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalBDSL.g:1896:3: (otherlv_4= ',' ( (lv_mode_5_0= ruleOutputModeModel ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBDSL.g:1897:4: otherlv_4= ',' ( (lv_mode_5_0= ruleOutputModeModel ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrintLnAccess().getCommaKeyword_4_0());
                    			
                    // InternalBDSL.g:1901:4: ( (lv_mode_5_0= ruleOutputModeModel ) )
                    // InternalBDSL.g:1902:5: (lv_mode_5_0= ruleOutputModeModel )
                    {
                    // InternalBDSL.g:1902:5: (lv_mode_5_0= ruleOutputModeModel )
                    // InternalBDSL.g:1903:6: lv_mode_5_0= ruleOutputModeModel
                    {

                    						newCompositeNode(grammarAccess.getPrintLnAccess().getModeOutputModeModelEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_mode_5_0=ruleOutputModeModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrintLnRule());
                    						}
                    						set(
                    							current,
                    							"mode",
                    							lv_mode_5_0,
                    							"de.tudresden.inf.st.bigraphs.dsl.BDSL.OutputModeModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPrintLnAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalBDSL.g:1929:1: entryRulePrintableExpression returns [EObject current=null] : iv_rulePrintableExpression= rulePrintableExpression EOF ;
    public final EObject entryRulePrintableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintableExpression = null;


        try {
            // InternalBDSL.g:1929:60: (iv_rulePrintableExpression= rulePrintableExpression EOF )
            // InternalBDSL.g:1930:2: iv_rulePrintableExpression= rulePrintableExpression EOF
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
    // InternalBDSL.g:1936:1: rulePrintableExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | this_BigraphVarReference_2= ruleBigraphVarReference ) ;
    public final EObject rulePrintableExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject this_BigraphVarReference_2 = null;



        	enterRule();

        try {
            // InternalBDSL.g:1942:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | this_BigraphVarReference_2= ruleBigraphVarReference ) )
            // InternalBDSL.g:1943:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | this_BigraphVarReference_2= ruleBigraphVarReference )
            {
            // InternalBDSL.g:1943:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | this_BigraphVarReference_2= ruleBigraphVarReference )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==13) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalBDSL.g:1944:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalBDSL.g:1944:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalBDSL.g:1945:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalBDSL.g:1945:4: ()
                    // InternalBDSL.g:1946:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrintableExpressionAccess().getStringLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalBDSL.g:1952:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalBDSL.g:1953:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalBDSL.g:1953:5: (lv_value_1_0= RULE_STRING )
                    // InternalBDSL.g:1954:6: lv_value_1_0= RULE_STRING
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
                    // InternalBDSL.g:1972:3: this_BigraphVarReference_2= ruleBigraphVarReference
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
    // InternalBDSL.g:1984:1: ruleBinaryParallelOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '||' ) ) ;
    public final Enumerator ruleBinaryParallelOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBDSL.g:1990:2: ( ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '||' ) ) )
            // InternalBDSL.g:1991:2: ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '||' ) )
            {
            // InternalBDSL.g:1991:2: ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '||' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt35=1;
                }
                break;
            case 36:
                {
                alt35=2;
                }
                break;
            case 37:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalBDSL.g:1992:3: (enumLiteral_0= 'UNSET' )
                    {
                    // InternalBDSL.g:1992:3: (enumLiteral_0= 'UNSET' )
                    // InternalBDSL.g:1993:4: enumLiteral_0= 'UNSET'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBinaryParallelOperatorAccess().getUNSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryParallelOperatorAccess().getUNSETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:2000:3: (enumLiteral_1= '|' )
                    {
                    // InternalBDSL.g:2000:3: (enumLiteral_1= '|' )
                    // InternalBDSL.g:2001:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBinaryParallelOperatorAccess().getMERGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryParallelOperatorAccess().getMERGEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:2008:3: (enumLiteral_2= '||' )
                    {
                    // InternalBDSL.g:2008:3: (enumLiteral_2= '||' )
                    // InternalBDSL.g:2009:4: enumLiteral_2= '||'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

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
    // InternalBDSL.g:2019:1: ruleBinaryNestingOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'UNSET2' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleBinaryNestingOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBDSL.g:2025:2: ( ( (enumLiteral_0= 'UNSET2' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) ) )
            // InternalBDSL.g:2026:2: ( (enumLiteral_0= 'UNSET2' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) )
            {
            // InternalBDSL.g:2026:2: ( (enumLiteral_0= 'UNSET2' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt36=1;
                }
                break;
            case 39:
                {
                alt36=2;
                }
                break;
            case 40:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalBDSL.g:2027:3: (enumLiteral_0= 'UNSET2' )
                    {
                    // InternalBDSL.g:2027:3: (enumLiteral_0= 'UNSET2' )
                    // InternalBDSL.g:2028:4: enumLiteral_0= 'UNSET2'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getBinaryNestingOperatorAccess().getUNSET2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryNestingOperatorAccess().getUNSET2EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:2035:3: (enumLiteral_1= '-' )
                    {
                    // InternalBDSL.g:2035:3: (enumLiteral_1= '-' )
                    // InternalBDSL.g:2036:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getBinaryNestingOperatorAccess().getNESTINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryNestingOperatorAccess().getNESTINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:2043:3: (enumLiteral_2= '*' )
                    {
                    // InternalBDSL.g:2043:3: (enumLiteral_2= '*' )
                    // InternalBDSL.g:2044:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

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
    // InternalBDSL.g:2054:1: ruleControlType returns [Enumerator current=null] : ( (enumLiteral_0= 'atomic' ) | (enumLiteral_1= 'active' ) | (enumLiteral_2= 'passive' ) ) ;
    public final Enumerator ruleControlType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBDSL.g:2060:2: ( ( (enumLiteral_0= 'atomic' ) | (enumLiteral_1= 'active' ) | (enumLiteral_2= 'passive' ) ) )
            // InternalBDSL.g:2061:2: ( (enumLiteral_0= 'atomic' ) | (enumLiteral_1= 'active' ) | (enumLiteral_2= 'passive' ) )
            {
            // InternalBDSL.g:2061:2: ( (enumLiteral_0= 'atomic' ) | (enumLiteral_1= 'active' ) | (enumLiteral_2= 'passive' ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt37=1;
                }
                break;
            case 42:
                {
                alt37=2;
                }
                break;
            case 43:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalBDSL.g:2062:3: (enumLiteral_0= 'atomic' )
                    {
                    // InternalBDSL.g:2062:3: (enumLiteral_0= 'atomic' )
                    // InternalBDSL.g:2063:4: enumLiteral_0= 'atomic'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getControlTypeAccess().getATOMICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getControlTypeAccess().getATOMICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:2070:3: (enumLiteral_1= 'active' )
                    {
                    // InternalBDSL.g:2070:3: (enumLiteral_1= 'active' )
                    // InternalBDSL.g:2071:4: enumLiteral_1= 'active'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getControlTypeAccess().getACTIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getControlTypeAccess().getACTIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:2078:3: (enumLiteral_2= 'passive' )
                    {
                    // InternalBDSL.g:2078:3: (enumLiteral_2= 'passive' )
                    // InternalBDSL.g:2079:4: enumLiteral_2= 'passive'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

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


    // $ANTLR start "ruleOutputModeModel"
    // InternalBDSL.g:2089:1: ruleOutputModeModel returns [Enumerator current=null] : ( (enumLiteral_0= 'xmi' ) | (enumLiteral_1= 'ecore' ) ) ;
    public final Enumerator ruleOutputModeModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBDSL.g:2095:2: ( ( (enumLiteral_0= 'xmi' ) | (enumLiteral_1= 'ecore' ) ) )
            // InternalBDSL.g:2096:2: ( (enumLiteral_0= 'xmi' ) | (enumLiteral_1= 'ecore' ) )
            {
            // InternalBDSL.g:2096:2: ( (enumLiteral_0= 'xmi' ) | (enumLiteral_1= 'ecore' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            else if ( (LA38_0==45) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalBDSL.g:2097:3: (enumLiteral_0= 'xmi' )
                    {
                    // InternalBDSL.g:2097:3: (enumLiteral_0= 'xmi' )
                    // InternalBDSL.g:2098:4: enumLiteral_0= 'xmi'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOutputModeModelAccess().getINSTANCE_MODELEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOutputModeModelAccess().getINSTANCE_MODELEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:2105:3: (enumLiteral_1= 'ecore' )
                    {
                    // InternalBDSL.g:2105:3: (enumLiteral_1= 'ecore' )
                    // InternalBDSL.g:2106:4: enumLiteral_1= 'ecore'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOutputModeModelAccess().getMETA_MODELEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOutputModeModelAccess().getMETA_MODELEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOutputModeModel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000044084000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000044004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000480022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000E0000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000E0000120000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000005822010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000019008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000018008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000005802010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020402000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000300000000000L});

}
