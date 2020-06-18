package de.tudresden.inf.st.bigraphs.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.tudresden.inf.st.bigraphs.dsl.services.BDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UNSET'", "'|'", "'||'", "'UNSET2'", "'-'", "'*'", "'atomic'", "'active'", "'passive'", "'partial'", "'iso'", "'xmi'", "'ecore'", "'.'", "'.*'", "'$'", "'main'", "'='", "'{'", "'}'", "'signature'", "'ctrl'", "'arity'", "','", "'id'", "'('", "')'", "'val'", "':'", "'['", "']'", "'react'", "'pred'", "'1'", "'brs'", "'agents'", "'rules'", "'preds'", "'println'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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

    	public void setGrammarAccess(BDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleBRSModel"
    // InternalBDSL.g:53:1: entryRuleBRSModel : ruleBRSModel EOF ;
    public final void entryRuleBRSModel() throws RecognitionException {
        try {
            // InternalBDSL.g:54:1: ( ruleBRSModel EOF )
            // InternalBDSL.g:55:1: ruleBRSModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBRSModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBRSModel"


    // $ANTLR start "ruleBRSModel"
    // InternalBDSL.g:62:1: ruleBRSModel : ( ( rule__BRSModel__Group__0 ) ) ;
    public final void ruleBRSModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:66:2: ( ( ( rule__BRSModel__Group__0 ) ) )
            // InternalBDSL.g:67:2: ( ( rule__BRSModel__Group__0 ) )
            {
            // InternalBDSL.g:67:2: ( ( rule__BRSModel__Group__0 ) )
            // InternalBDSL.g:68:3: ( rule__BRSModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSModelAccess().getGroup()); 
            }
            // InternalBDSL.g:69:3: ( rule__BRSModel__Group__0 )
            // InternalBDSL.g:69:4: rule__BRSModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BRSModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBRSModel"


    // $ANTLR start "entryRuleFQN"
    // InternalBDSL.g:78:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalBDSL.g:79:1: ( ruleFQN EOF )
            // InternalBDSL.g:80:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalBDSL.g:87:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:91:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalBDSL.g:92:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalBDSL.g:92:2: ( ( rule__FQN__Group__0 ) )
            // InternalBDSL.g:93:3: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalBDSL.g:94:3: ( rule__FQN__Group__0 )
            // InternalBDSL.g:94:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFqnWithWildCard"
    // InternalBDSL.g:103:1: entryRuleFqnWithWildCard : ruleFqnWithWildCard EOF ;
    public final void entryRuleFqnWithWildCard() throws RecognitionException {
        try {
            // InternalBDSL.g:104:1: ( ruleFqnWithWildCard EOF )
            // InternalBDSL.g:105:1: ruleFqnWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFqnWithWildCardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFqnWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFqnWithWildCardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFqnWithWildCard"


    // $ANTLR start "ruleFqnWithWildCard"
    // InternalBDSL.g:112:1: ruleFqnWithWildCard : ( ( rule__FqnWithWildCard__Group__0 ) ) ;
    public final void ruleFqnWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:116:2: ( ( ( rule__FqnWithWildCard__Group__0 ) ) )
            // InternalBDSL.g:117:2: ( ( rule__FqnWithWildCard__Group__0 ) )
            {
            // InternalBDSL.g:117:2: ( ( rule__FqnWithWildCard__Group__0 ) )
            // InternalBDSL.g:118:3: ( rule__FqnWithWildCard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFqnWithWildCardAccess().getGroup()); 
            }
            // InternalBDSL.g:119:3: ( rule__FqnWithWildCard__Group__0 )
            // InternalBDSL.g:119:4: rule__FqnWithWildCard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FqnWithWildCard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFqnWithWildCardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFqnWithWildCard"


    // $ANTLR start "entryRuleBigraphVarReferenceID"
    // InternalBDSL.g:128:1: entryRuleBigraphVarReferenceID : ruleBigraphVarReferenceID EOF ;
    public final void entryRuleBigraphVarReferenceID() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalBDSL.g:132:1: ( ruleBigraphVarReferenceID EOF )
            // InternalBDSL.g:133:1: ruleBigraphVarReferenceID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBigraphVarReferenceID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigraphVarReferenceIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleBigraphVarReferenceID"


    // $ANTLR start "ruleBigraphVarReferenceID"
    // InternalBDSL.g:143:1: ruleBigraphVarReferenceID : ( ( rule__BigraphVarReferenceID__Group__0 ) ) ;
    public final void ruleBigraphVarReferenceID() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:148:2: ( ( ( rule__BigraphVarReferenceID__Group__0 ) ) )
            // InternalBDSL.g:149:2: ( ( rule__BigraphVarReferenceID__Group__0 ) )
            {
            // InternalBDSL.g:149:2: ( ( rule__BigraphVarReferenceID__Group__0 ) )
            // InternalBDSL.g:150:3: ( rule__BigraphVarReferenceID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceIDAccess().getGroup()); 
            }
            // InternalBDSL.g:151:3: ( rule__BigraphVarReferenceID__Group__0 )
            // InternalBDSL.g:151:4: rule__BigraphVarReferenceID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BigraphVarReferenceID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigraphVarReferenceIDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleBigraphVarReferenceID"


    // $ANTLR start "entryRuleEString"
    // InternalBDSL.g:161:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBDSL.g:162:1: ( ruleEString EOF )
            // InternalBDSL.g:163:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBDSL.g:170:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:174:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBDSL.g:175:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBDSL.g:175:2: ( ( rule__EString__Alternatives ) )
            // InternalBDSL.g:176:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalBDSL.g:177:3: ( rule__EString__Alternatives )
            // InternalBDSL.g:177:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalBDSL.g:186:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalBDSL.g:187:1: ( ruleAbstractElement EOF )
            // InternalBDSL.g:188:1: ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalBDSL.g:195:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:199:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalBDSL.g:200:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalBDSL.g:200:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalBDSL.g:201:3: ( rule__AbstractElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            }
            // InternalBDSL.g:202:3: ( rule__AbstractElement__Alternatives )
            // InternalBDSL.g:202:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleMainElement"
    // InternalBDSL.g:211:1: entryRuleMainElement : ruleMainElement EOF ;
    public final void entryRuleMainElement() throws RecognitionException {
        try {
            // InternalBDSL.g:212:1: ( ruleMainElement EOF )
            // InternalBDSL.g:213:1: ruleMainElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMainElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMainElement"


    // $ANTLR start "ruleMainElement"
    // InternalBDSL.g:220:1: ruleMainElement : ( ( rule__MainElement__Group__0 ) ) ;
    public final void ruleMainElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:224:2: ( ( ( rule__MainElement__Group__0 ) ) )
            // InternalBDSL.g:225:2: ( ( rule__MainElement__Group__0 ) )
            {
            // InternalBDSL.g:225:2: ( ( rule__MainElement__Group__0 ) )
            // InternalBDSL.g:226:3: ( rule__MainElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getGroup()); 
            }
            // InternalBDSL.g:227:3: ( rule__MainElement__Group__0 )
            // InternalBDSL.g:227:4: rule__MainElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainElement"


    // $ANTLR start "entryRuleSignature"
    // InternalBDSL.g:236:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalBDSL.g:237:1: ( ruleSignature EOF )
            // InternalBDSL.g:238:1: ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalBDSL.g:245:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:249:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalBDSL.g:250:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalBDSL.g:250:2: ( ( rule__Signature__Group__0 ) )
            // InternalBDSL.g:251:3: ( rule__Signature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup()); 
            }
            // InternalBDSL.g:252:3: ( rule__Signature__Group__0 )
            // InternalBDSL.g:252:4: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleControlDef"
    // InternalBDSL.g:261:1: entryRuleControlDef : ruleControlDef EOF ;
    public final void entryRuleControlDef() throws RecognitionException {
        try {
            // InternalBDSL.g:262:1: ( ruleControlDef EOF )
            // InternalBDSL.g:263:1: ruleControlDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleControlDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleControlDef"


    // $ANTLR start "ruleControlDef"
    // InternalBDSL.g:270:1: ruleControlDef : ( ( rule__ControlDef__Group__0 ) ) ;
    public final void ruleControlDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:274:2: ( ( ( rule__ControlDef__Group__0 ) ) )
            // InternalBDSL.g:275:2: ( ( rule__ControlDef__Group__0 ) )
            {
            // InternalBDSL.g:275:2: ( ( rule__ControlDef__Group__0 ) )
            // InternalBDSL.g:276:3: ( rule__ControlDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getGroup()); 
            }
            // InternalBDSL.g:277:3: ( rule__ControlDef__Group__0 )
            // InternalBDSL.g:277:4: rule__ControlDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ControlDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleControlDef"


    // $ANTLR start "entryRuleNameConstant"
    // InternalBDSL.g:286:1: entryRuleNameConstant : ruleNameConstant EOF ;
    public final void entryRuleNameConstant() throws RecognitionException {
        try {
            // InternalBDSL.g:287:1: ( ruleNameConstant EOF )
            // InternalBDSL.g:288:1: ruleNameConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNameConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameConstantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNameConstant"


    // $ANTLR start "ruleNameConstant"
    // InternalBDSL.g:295:1: ruleNameConstant : ( ( rule__NameConstant__ValueAssignment ) ) ;
    public final void ruleNameConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:299:2: ( ( ( rule__NameConstant__ValueAssignment ) ) )
            // InternalBDSL.g:300:2: ( ( rule__NameConstant__ValueAssignment ) )
            {
            // InternalBDSL.g:300:2: ( ( rule__NameConstant__ValueAssignment ) )
            // InternalBDSL.g:301:3: ( rule__NameConstant__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameConstantAccess().getValueAssignment()); 
            }
            // InternalBDSL.g:302:3: ( rule__NameConstant__ValueAssignment )
            // InternalBDSL.g:302:4: rule__NameConstant__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NameConstant__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameConstantAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameConstant"


    // $ANTLR start "entryRuleLinkNames"
    // InternalBDSL.g:311:1: entryRuleLinkNames : ruleLinkNames EOF ;
    public final void entryRuleLinkNames() throws RecognitionException {
        try {
            // InternalBDSL.g:312:1: ( ruleLinkNames EOF )
            // InternalBDSL.g:313:1: ruleLinkNames EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkNamesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLinkNames();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkNamesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinkNames"


    // $ANTLR start "ruleLinkNames"
    // InternalBDSL.g:320:1: ruleLinkNames : ( ( rule__LinkNames__Alternatives ) ) ;
    public final void ruleLinkNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:324:2: ( ( ( rule__LinkNames__Alternatives ) ) )
            // InternalBDSL.g:325:2: ( ( rule__LinkNames__Alternatives ) )
            {
            // InternalBDSL.g:325:2: ( ( rule__LinkNames__Alternatives ) )
            // InternalBDSL.g:326:3: ( rule__LinkNames__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkNamesAccess().getAlternatives()); 
            }
            // InternalBDSL.g:327:3: ( rule__LinkNames__Alternatives )
            // InternalBDSL.g:327:4: rule__LinkNames__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LinkNames__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkNamesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkNames"


    // $ANTLR start "entryRuleSiteVars"
    // InternalBDSL.g:336:1: entryRuleSiteVars : ruleSiteVars EOF ;
    public final void entryRuleSiteVars() throws RecognitionException {
        try {
            // InternalBDSL.g:337:1: ( ruleSiteVars EOF )
            // InternalBDSL.g:338:1: ruleSiteVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSiteVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSiteVarsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiteVars"


    // $ANTLR start "ruleSiteVars"
    // InternalBDSL.g:345:1: ruleSiteVars : ( ( rule__SiteVars__NameAssignment ) ) ;
    public final void ruleSiteVars() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:349:2: ( ( ( rule__SiteVars__NameAssignment ) ) )
            // InternalBDSL.g:350:2: ( ( rule__SiteVars__NameAssignment ) )
            {
            // InternalBDSL.g:350:2: ( ( rule__SiteVars__NameAssignment ) )
            // InternalBDSL.g:351:3: ( rule__SiteVars__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteVarsAccess().getNameAssignment()); 
            }
            // InternalBDSL.g:352:3: ( rule__SiteVars__NameAssignment )
            // InternalBDSL.g:352:4: rule__SiteVars__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SiteVars__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSiteVarsAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiteVars"


    // $ANTLR start "entryRuleSite"
    // InternalBDSL.g:361:1: entryRuleSite : ruleSite EOF ;
    public final void entryRuleSite() throws RecognitionException {
        try {
            // InternalBDSL.g:362:1: ( ruleSite EOF )
            // InternalBDSL.g:363:1: ruleSite EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSiteRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // InternalBDSL.g:370:1: ruleSite : ( ( rule__Site__Group__0 ) ) ;
    public final void ruleSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:374:2: ( ( ( rule__Site__Group__0 ) ) )
            // InternalBDSL.g:375:2: ( ( rule__Site__Group__0 ) )
            {
            // InternalBDSL.g:375:2: ( ( rule__Site__Group__0 ) )
            // InternalBDSL.g:376:3: ( rule__Site__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteAccess().getGroup()); 
            }
            // InternalBDSL.g:377:3: ( rule__Site__Group__0 )
            // InternalBDSL.g:377:4: rule__Site__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Site__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSiteAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleLVD2"
    // InternalBDSL.g:386:1: entryRuleLVD2 : ruleLVD2 EOF ;
    public final void entryRuleLVD2() throws RecognitionException {
        try {
            // InternalBDSL.g:387:1: ( ruleLVD2 EOF )
            // InternalBDSL.g:388:1: ruleLVD2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLVD2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLVD2"


    // $ANTLR start "ruleLVD2"
    // InternalBDSL.g:395:1: ruleLVD2 : ( ( rule__LVD2__Group__0 ) ) ;
    public final void ruleLVD2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:399:2: ( ( ( rule__LVD2__Group__0 ) ) )
            // InternalBDSL.g:400:2: ( ( rule__LVD2__Group__0 ) )
            {
            // InternalBDSL.g:400:2: ( ( rule__LVD2__Group__0 ) )
            // InternalBDSL.g:401:3: ( rule__LVD2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getGroup()); 
            }
            // InternalBDSL.g:402:3: ( rule__LVD2__Group__0 )
            // InternalBDSL.g:402:4: rule__LVD2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LVD2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLVD2"


    // $ANTLR start "entryRuleLocalVarDecl"
    // InternalBDSL.g:411:1: entryRuleLocalVarDecl : ruleLocalVarDecl EOF ;
    public final void entryRuleLocalVarDecl() throws RecognitionException {
        try {
            // InternalBDSL.g:412:1: ( ruleLocalVarDecl EOF )
            // InternalBDSL.g:413:1: ruleLocalVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLocalVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalVarDecl"


    // $ANTLR start "ruleLocalVarDecl"
    // InternalBDSL.g:420:1: ruleLocalVarDecl : ( ( rule__LocalVarDecl__Group__0 ) ) ;
    public final void ruleLocalVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:424:2: ( ( ( rule__LocalVarDecl__Group__0 ) ) )
            // InternalBDSL.g:425:2: ( ( rule__LocalVarDecl__Group__0 ) )
            {
            // InternalBDSL.g:425:2: ( ( rule__LocalVarDecl__Group__0 ) )
            // InternalBDSL.g:426:3: ( rule__LocalVarDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup()); 
            }
            // InternalBDSL.g:427:3: ( rule__LocalVarDecl__Group__0 )
            // InternalBDSL.g:427:4: rule__LocalVarDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalVarDecl"


    // $ANTLR start "entryRuleLocalRuleDecl"
    // InternalBDSL.g:436:1: entryRuleLocalRuleDecl : ruleLocalRuleDecl EOF ;
    public final void entryRuleLocalRuleDecl() throws RecognitionException {
        try {
            // InternalBDSL.g:437:1: ( ruleLocalRuleDecl EOF )
            // InternalBDSL.g:438:1: ruleLocalRuleDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLocalRuleDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalRuleDecl"


    // $ANTLR start "ruleLocalRuleDecl"
    // InternalBDSL.g:445:1: ruleLocalRuleDecl : ( ( rule__LocalRuleDecl__Group__0 ) ) ;
    public final void ruleLocalRuleDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:449:2: ( ( ( rule__LocalRuleDecl__Group__0 ) ) )
            // InternalBDSL.g:450:2: ( ( rule__LocalRuleDecl__Group__0 ) )
            {
            // InternalBDSL.g:450:2: ( ( rule__LocalRuleDecl__Group__0 ) )
            // InternalBDSL.g:451:3: ( rule__LocalRuleDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getGroup()); 
            }
            // InternalBDSL.g:452:3: ( rule__LocalRuleDecl__Group__0 )
            // InternalBDSL.g:452:4: rule__LocalRuleDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalRuleDecl"


    // $ANTLR start "entryRuleLocalPredicateDeclaration"
    // InternalBDSL.g:461:1: entryRuleLocalPredicateDeclaration : ruleLocalPredicateDeclaration EOF ;
    public final void entryRuleLocalPredicateDeclaration() throws RecognitionException {
        try {
            // InternalBDSL.g:462:1: ( ruleLocalPredicateDeclaration EOF )
            // InternalBDSL.g:463:1: ruleLocalPredicateDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLocalPredicateDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalPredicateDeclaration"


    // $ANTLR start "ruleLocalPredicateDeclaration"
    // InternalBDSL.g:470:1: ruleLocalPredicateDeclaration : ( ( rule__LocalPredicateDeclaration__Group__0 ) ) ;
    public final void ruleLocalPredicateDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:474:2: ( ( ( rule__LocalPredicateDeclaration__Group__0 ) ) )
            // InternalBDSL.g:475:2: ( ( rule__LocalPredicateDeclaration__Group__0 ) )
            {
            // InternalBDSL.g:475:2: ( ( rule__LocalPredicateDeclaration__Group__0 ) )
            // InternalBDSL.g:476:3: ( rule__LocalPredicateDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getGroup()); 
            }
            // InternalBDSL.g:477:3: ( rule__LocalPredicateDeclaration__Group__0 )
            // InternalBDSL.g:477:4: rule__LocalPredicateDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalPredicateDeclaration"


    // $ANTLR start "entryRuleElementaryBigraphs"
    // InternalBDSL.g:486:1: entryRuleElementaryBigraphs : ruleElementaryBigraphs EOF ;
    public final void entryRuleElementaryBigraphs() throws RecognitionException {
        try {
            // InternalBDSL.g:487:1: ( ruleElementaryBigraphs EOF )
            // InternalBDSL.g:488:1: ruleElementaryBigraphs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementaryBigraphsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElementaryBigraphs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementaryBigraphsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementaryBigraphs"


    // $ANTLR start "ruleElementaryBigraphs"
    // InternalBDSL.g:495:1: ruleElementaryBigraphs : ( ruleBarren ) ;
    public final void ruleElementaryBigraphs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:499:2: ( ( ruleBarren ) )
            // InternalBDSL.g:500:2: ( ruleBarren )
            {
            // InternalBDSL.g:500:2: ( ruleBarren )
            // InternalBDSL.g:501:3: ruleBarren
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementaryBigraphsAccess().getBarrenParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleBarren();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementaryBigraphsAccess().getBarrenParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementaryBigraphs"


    // $ANTLR start "entryRuleBarren"
    // InternalBDSL.g:511:1: entryRuleBarren : ruleBarren EOF ;
    public final void entryRuleBarren() throws RecognitionException {
        try {
            // InternalBDSL.g:512:1: ( ruleBarren EOF )
            // InternalBDSL.g:513:1: ruleBarren EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBarrenRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBarren();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBarrenRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBarren"


    // $ANTLR start "ruleBarren"
    // InternalBDSL.g:520:1: ruleBarren : ( ( rule__Barren__Group__0 ) ) ;
    public final void ruleBarren() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:524:2: ( ( ( rule__Barren__Group__0 ) ) )
            // InternalBDSL.g:525:2: ( ( rule__Barren__Group__0 ) )
            {
            // InternalBDSL.g:525:2: ( ( rule__Barren__Group__0 ) )
            // InternalBDSL.g:526:3: ( rule__Barren__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBarrenAccess().getGroup()); 
            }
            // InternalBDSL.g:527:3: ( rule__Barren__Group__0 )
            // InternalBDSL.g:527:4: rule__Barren__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Barren__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBarrenAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBarren"


    // $ANTLR start "entryRuleBigraphVarReference"
    // InternalBDSL.g:536:1: entryRuleBigraphVarReference : ruleBigraphVarReference EOF ;
    public final void entryRuleBigraphVarReference() throws RecognitionException {
        try {
            // InternalBDSL.g:537:1: ( ruleBigraphVarReference EOF )
            // InternalBDSL.g:538:1: ruleBigraphVarReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBigraphVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigraphVarReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBigraphVarReference"


    // $ANTLR start "ruleBigraphVarReference"
    // InternalBDSL.g:545:1: ruleBigraphVarReference : ( ( rule__BigraphVarReference__ValueAssignment ) ) ;
    public final void ruleBigraphVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:549:2: ( ( ( rule__BigraphVarReference__ValueAssignment ) ) )
            // InternalBDSL.g:550:2: ( ( rule__BigraphVarReference__ValueAssignment ) )
            {
            // InternalBDSL.g:550:2: ( ( rule__BigraphVarReference__ValueAssignment ) )
            // InternalBDSL.g:551:3: ( rule__BigraphVarReference__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceAccess().getValueAssignment()); 
            }
            // InternalBDSL.g:552:3: ( rule__BigraphVarReference__ValueAssignment )
            // InternalBDSL.g:552:4: rule__BigraphVarReference__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BigraphVarReference__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigraphVarReferenceAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBigraphVarReference"


    // $ANTLR start "entryRuleRuleVarReference"
    // InternalBDSL.g:561:1: entryRuleRuleVarReference : ruleRuleVarReference EOF ;
    public final void entryRuleRuleVarReference() throws RecognitionException {
        try {
            // InternalBDSL.g:562:1: ( ruleRuleVarReference EOF )
            // InternalBDSL.g:563:1: ruleRuleVarReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleVarReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRuleVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleVarReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleVarReference"


    // $ANTLR start "ruleRuleVarReference"
    // InternalBDSL.g:570:1: ruleRuleVarReference : ( ( rule__RuleVarReference__ValueAssignment ) ) ;
    public final void ruleRuleVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:574:2: ( ( ( rule__RuleVarReference__ValueAssignment ) ) )
            // InternalBDSL.g:575:2: ( ( rule__RuleVarReference__ValueAssignment ) )
            {
            // InternalBDSL.g:575:2: ( ( rule__RuleVarReference__ValueAssignment ) )
            // InternalBDSL.g:576:3: ( rule__RuleVarReference__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleVarReferenceAccess().getValueAssignment()); 
            }
            // InternalBDSL.g:577:3: ( rule__RuleVarReference__ValueAssignment )
            // InternalBDSL.g:577:4: rule__RuleVarReference__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RuleVarReference__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleVarReferenceAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleVarReference"


    // $ANTLR start "entryRulePredicateVarReference"
    // InternalBDSL.g:586:1: entryRulePredicateVarReference : rulePredicateVarReference EOF ;
    public final void entryRulePredicateVarReference() throws RecognitionException {
        try {
            // InternalBDSL.g:587:1: ( rulePredicateVarReference EOF )
            // InternalBDSL.g:588:1: rulePredicateVarReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateVarReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePredicateVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateVarReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicateVarReference"


    // $ANTLR start "rulePredicateVarReference"
    // InternalBDSL.g:595:1: rulePredicateVarReference : ( ( rule__PredicateVarReference__ValueAssignment ) ) ;
    public final void rulePredicateVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:599:2: ( ( ( rule__PredicateVarReference__ValueAssignment ) ) )
            // InternalBDSL.g:600:2: ( ( rule__PredicateVarReference__ValueAssignment ) )
            {
            // InternalBDSL.g:600:2: ( ( rule__PredicateVarReference__ValueAssignment ) )
            // InternalBDSL.g:601:3: ( rule__PredicateVarReference__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateVarReferenceAccess().getValueAssignment()); 
            }
            // InternalBDSL.g:602:3: ( rule__PredicateVarReference__ValueAssignment )
            // InternalBDSL.g:602:4: rule__PredicateVarReference__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PredicateVarReference__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateVarReferenceAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateVarReference"


    // $ANTLR start "entryRuleAbstractBigraphDeclaration"
    // InternalBDSL.g:611:1: entryRuleAbstractBigraphDeclaration : ruleAbstractBigraphDeclaration EOF ;
    public final void entryRuleAbstractBigraphDeclaration() throws RecognitionException {
        try {
            // InternalBDSL.g:612:1: ( ruleAbstractBigraphDeclaration EOF )
            // InternalBDSL.g:613:1: ruleAbstractBigraphDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractBigraphDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAbstractBigraphDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractBigraphDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractBigraphDeclaration"


    // $ANTLR start "ruleAbstractBigraphDeclaration"
    // InternalBDSL.g:620:1: ruleAbstractBigraphDeclaration : ( ( rule__AbstractBigraphDeclaration__Alternatives ) ) ;
    public final void ruleAbstractBigraphDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:624:2: ( ( ( rule__AbstractBigraphDeclaration__Alternatives ) ) )
            // InternalBDSL.g:625:2: ( ( rule__AbstractBigraphDeclaration__Alternatives ) )
            {
            // InternalBDSL.g:625:2: ( ( rule__AbstractBigraphDeclaration__Alternatives ) )
            // InternalBDSL.g:626:3: ( rule__AbstractBigraphDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractBigraphDeclarationAccess().getAlternatives()); 
            }
            // InternalBDSL.g:627:3: ( rule__AbstractBigraphDeclaration__Alternatives )
            // InternalBDSL.g:627:4: rule__AbstractBigraphDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBigraphDeclaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractBigraphDeclarationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractBigraphDeclaration"


    // $ANTLR start "entryRuleNodeExpressionCall"
    // InternalBDSL.g:636:1: entryRuleNodeExpressionCall : ruleNodeExpressionCall EOF ;
    public final void entryRuleNodeExpressionCall() throws RecognitionException {
        try {
            // InternalBDSL.g:637:1: ( ruleNodeExpressionCall EOF )
            // InternalBDSL.g:638:1: ruleNodeExpressionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNodeExpressionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeExpressionCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeExpressionCall"


    // $ANTLR start "ruleNodeExpressionCall"
    // InternalBDSL.g:645:1: ruleNodeExpressionCall : ( ( rule__NodeExpressionCall__Group__0 ) ) ;
    public final void ruleNodeExpressionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:649:2: ( ( ( rule__NodeExpressionCall__Group__0 ) ) )
            // InternalBDSL.g:650:2: ( ( rule__NodeExpressionCall__Group__0 ) )
            {
            // InternalBDSL.g:650:2: ( ( rule__NodeExpressionCall__Group__0 ) )
            // InternalBDSL.g:651:3: ( rule__NodeExpressionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getGroup()); 
            }
            // InternalBDSL.g:652:3: ( rule__NodeExpressionCall__Group__0 )
            // InternalBDSL.g:652:4: rule__NodeExpressionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeExpressionCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeExpressionCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeExpressionCall"


    // $ANTLR start "entryRuleBigraphExpression"
    // InternalBDSL.g:661:1: entryRuleBigraphExpression : ruleBigraphExpression EOF ;
    public final void entryRuleBigraphExpression() throws RecognitionException {
        try {
            // InternalBDSL.g:662:1: ( ruleBigraphExpression EOF )
            // InternalBDSL.g:663:1: ruleBigraphExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBigraphExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigraphExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBigraphExpression"


    // $ANTLR start "ruleBigraphExpression"
    // InternalBDSL.g:670:1: ruleBigraphExpression : ( ruleAddition ) ;
    public final void ruleBigraphExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:674:2: ( ( ruleAddition ) )
            // InternalBDSL.g:675:2: ( ruleAddition )
            {
            // InternalBDSL.g:675:2: ( ruleAddition )
            // InternalBDSL.g:676:3: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphExpressionAccess().getAdditionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigraphExpressionAccess().getAdditionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBigraphExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalBDSL.g:686:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalBDSL.g:687:1: ( ruleAddition EOF )
            // InternalBDSL.g:688:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalBDSL.g:695:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:699:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalBDSL.g:700:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalBDSL.g:700:2: ( ( rule__Addition__Group__0 ) )
            // InternalBDSL.g:701:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalBDSL.g:702:3: ( rule__Addition__Group__0 )
            // InternalBDSL.g:702:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalBDSL.g:711:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalBDSL.g:712:1: ( ruleMultiplication EOF )
            // InternalBDSL.g:713:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalBDSL.g:720:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:724:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalBDSL.g:725:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalBDSL.g:725:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalBDSL.g:726:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalBDSL.g:727:3: ( rule__Multiplication__Group__0 )
            // InternalBDSL.g:727:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalBDSL.g:736:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalBDSL.g:737:1: ( rulePrimaryExpression EOF )
            // InternalBDSL.g:738:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalBDSL.g:745:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:749:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalBDSL.g:750:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalBDSL.g:750:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalBDSL.g:751:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalBDSL.g:752:3: ( rule__PrimaryExpression__Alternatives )
            // InternalBDSL.g:752:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleAbstractMainStatements"
    // InternalBDSL.g:761:1: entryRuleAbstractMainStatements : ruleAbstractMainStatements EOF ;
    public final void entryRuleAbstractMainStatements() throws RecognitionException {
        try {
            // InternalBDSL.g:762:1: ( ruleAbstractMainStatements EOF )
            // InternalBDSL.g:763:1: ruleAbstractMainStatements EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractMainStatementsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAbstractMainStatements();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractMainStatementsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractMainStatements"


    // $ANTLR start "ruleAbstractMainStatements"
    // InternalBDSL.g:770:1: ruleAbstractMainStatements : ( ( rule__AbstractMainStatements__Alternatives ) ) ;
    public final void ruleAbstractMainStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:774:2: ( ( ( rule__AbstractMainStatements__Alternatives ) ) )
            // InternalBDSL.g:775:2: ( ( rule__AbstractMainStatements__Alternatives ) )
            {
            // InternalBDSL.g:775:2: ( ( rule__AbstractMainStatements__Alternatives ) )
            // InternalBDSL.g:776:3: ( rule__AbstractMainStatements__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractMainStatementsAccess().getAlternatives()); 
            }
            // InternalBDSL.g:777:3: ( rule__AbstractMainStatements__Alternatives )
            // InternalBDSL.g:777:4: rule__AbstractMainStatements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractMainStatements__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractMainStatementsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractMainStatements"


    // $ANTLR start "entryRuleBRSDefinition"
    // InternalBDSL.g:786:1: entryRuleBRSDefinition : ruleBRSDefinition EOF ;
    public final void entryRuleBRSDefinition() throws RecognitionException {
        try {
            // InternalBDSL.g:787:1: ( ruleBRSDefinition EOF )
            // InternalBDSL.g:788:1: ruleBRSDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBRSDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBRSDefinition"


    // $ANTLR start "ruleBRSDefinition"
    // InternalBDSL.g:795:1: ruleBRSDefinition : ( ( rule__BRSDefinition__Group__0 ) ) ;
    public final void ruleBRSDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:799:2: ( ( ( rule__BRSDefinition__Group__0 ) ) )
            // InternalBDSL.g:800:2: ( ( rule__BRSDefinition__Group__0 ) )
            {
            // InternalBDSL.g:800:2: ( ( rule__BRSDefinition__Group__0 ) )
            // InternalBDSL.g:801:3: ( rule__BRSDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getGroup()); 
            }
            // InternalBDSL.g:802:3: ( rule__BRSDefinition__Group__0 )
            // InternalBDSL.g:802:4: rule__BRSDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBRSDefinition"


    // $ANTLR start "entryRulePrintLn"
    // InternalBDSL.g:811:1: entryRulePrintLn : rulePrintLn EOF ;
    public final void entryRulePrintLn() throws RecognitionException {
        try {
            // InternalBDSL.g:812:1: ( rulePrintLn EOF )
            // InternalBDSL.g:813:1: rulePrintLn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrintLn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrintLn"


    // $ANTLR start "rulePrintLn"
    // InternalBDSL.g:820:1: rulePrintLn : ( ( rule__PrintLn__Group__0 ) ) ;
    public final void rulePrintLn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:824:2: ( ( ( rule__PrintLn__Group__0 ) ) )
            // InternalBDSL.g:825:2: ( ( rule__PrintLn__Group__0 ) )
            {
            // InternalBDSL.g:825:2: ( ( rule__PrintLn__Group__0 ) )
            // InternalBDSL.g:826:3: ( rule__PrintLn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getGroup()); 
            }
            // InternalBDSL.g:827:3: ( rule__PrintLn__Group__0 )
            // InternalBDSL.g:827:4: rule__PrintLn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrintLn__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintLn"


    // $ANTLR start "entryRulePrintableExpression"
    // InternalBDSL.g:836:1: entryRulePrintableExpression : rulePrintableExpression EOF ;
    public final void entryRulePrintableExpression() throws RecognitionException {
        try {
            // InternalBDSL.g:837:1: ( rulePrintableExpression EOF )
            // InternalBDSL.g:838:1: rulePrintableExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintableExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrintableExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintableExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrintableExpression"


    // $ANTLR start "rulePrintableExpression"
    // InternalBDSL.g:845:1: rulePrintableExpression : ( ( rule__PrintableExpression__Alternatives ) ) ;
    public final void rulePrintableExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:849:2: ( ( ( rule__PrintableExpression__Alternatives ) ) )
            // InternalBDSL.g:850:2: ( ( rule__PrintableExpression__Alternatives ) )
            {
            // InternalBDSL.g:850:2: ( ( rule__PrintableExpression__Alternatives ) )
            // InternalBDSL.g:851:3: ( rule__PrintableExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintableExpressionAccess().getAlternatives()); 
            }
            // InternalBDSL.g:852:3: ( rule__PrintableExpression__Alternatives )
            // InternalBDSL.g:852:4: rule__PrintableExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrintableExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintableExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintableExpression"


    // $ANTLR start "ruleBinaryParallelOperator"
    // InternalBDSL.g:861:1: ruleBinaryParallelOperator : ( ( rule__BinaryParallelOperator__Alternatives ) ) ;
    public final void ruleBinaryParallelOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:865:1: ( ( ( rule__BinaryParallelOperator__Alternatives ) ) )
            // InternalBDSL.g:866:2: ( ( rule__BinaryParallelOperator__Alternatives ) )
            {
            // InternalBDSL.g:866:2: ( ( rule__BinaryParallelOperator__Alternatives ) )
            // InternalBDSL.g:867:3: ( rule__BinaryParallelOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryParallelOperatorAccess().getAlternatives()); 
            }
            // InternalBDSL.g:868:3: ( rule__BinaryParallelOperator__Alternatives )
            // InternalBDSL.g:868:4: rule__BinaryParallelOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryParallelOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryParallelOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryParallelOperator"


    // $ANTLR start "ruleBinaryNestingOperator"
    // InternalBDSL.g:877:1: ruleBinaryNestingOperator : ( ( rule__BinaryNestingOperator__Alternatives ) ) ;
    public final void ruleBinaryNestingOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:881:1: ( ( ( rule__BinaryNestingOperator__Alternatives ) ) )
            // InternalBDSL.g:882:2: ( ( rule__BinaryNestingOperator__Alternatives ) )
            {
            // InternalBDSL.g:882:2: ( ( rule__BinaryNestingOperator__Alternatives ) )
            // InternalBDSL.g:883:3: ( rule__BinaryNestingOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryNestingOperatorAccess().getAlternatives()); 
            }
            // InternalBDSL.g:884:3: ( rule__BinaryNestingOperator__Alternatives )
            // InternalBDSL.g:884:4: rule__BinaryNestingOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryNestingOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryNestingOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryNestingOperator"


    // $ANTLR start "ruleControlType"
    // InternalBDSL.g:893:1: ruleControlType : ( ( rule__ControlType__Alternatives ) ) ;
    public final void ruleControlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:897:1: ( ( ( rule__ControlType__Alternatives ) ) )
            // InternalBDSL.g:898:2: ( ( rule__ControlType__Alternatives ) )
            {
            // InternalBDSL.g:898:2: ( ( rule__ControlType__Alternatives ) )
            // InternalBDSL.g:899:3: ( rule__ControlType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlTypeAccess().getAlternatives()); 
            }
            // InternalBDSL.g:900:3: ( rule__ControlType__Alternatives )
            // InternalBDSL.g:900:4: rule__ControlType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ControlType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleControlType"


    // $ANTLR start "rulePredicateType"
    // InternalBDSL.g:909:1: rulePredicateType : ( ( rule__PredicateType__Alternatives ) ) ;
    public final void rulePredicateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:913:1: ( ( ( rule__PredicateType__Alternatives ) ) )
            // InternalBDSL.g:914:2: ( ( rule__PredicateType__Alternatives ) )
            {
            // InternalBDSL.g:914:2: ( ( rule__PredicateType__Alternatives ) )
            // InternalBDSL.g:915:3: ( rule__PredicateType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateTypeAccess().getAlternatives()); 
            }
            // InternalBDSL.g:916:3: ( rule__PredicateType__Alternatives )
            // InternalBDSL.g:916:4: rule__PredicateType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PredicateType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateType"


    // $ANTLR start "ruleOutputModeModel"
    // InternalBDSL.g:925:1: ruleOutputModeModel : ( ( rule__OutputModeModel__Alternatives ) ) ;
    public final void ruleOutputModeModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:929:1: ( ( ( rule__OutputModeModel__Alternatives ) ) )
            // InternalBDSL.g:930:2: ( ( rule__OutputModeModel__Alternatives ) )
            {
            // InternalBDSL.g:930:2: ( ( rule__OutputModeModel__Alternatives ) )
            // InternalBDSL.g:931:3: ( rule__OutputModeModel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputModeModelAccess().getAlternatives()); 
            }
            // InternalBDSL.g:932:3: ( rule__OutputModeModel__Alternatives )
            // InternalBDSL.g:932:4: rule__OutputModeModel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OutputModeModel__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputModeModelAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputModeModel"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBDSL.g:940:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:944:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBDSL.g:945:2: ( RULE_STRING )
                    {
                    // InternalBDSL.g:945:2: ( RULE_STRING )
                    // InternalBDSL.g:946:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:951:2: ( RULE_ID )
                    {
                    // InternalBDSL.g:951:2: ( RULE_ID )
                    // InternalBDSL.g:952:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalBDSL.g:961:1: rule__AbstractElement__Alternatives : ( ( ruleLocalVarDecl ) | ( ruleLocalRuleDecl ) | ( ruleLocalPredicateDeclaration ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:965:1: ( ( ruleLocalVarDecl ) | ( ruleLocalRuleDecl ) | ( ruleLocalPredicateDeclaration ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 42:
                {
                alt2=2;
                }
                break;
            case 43:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBDSL.g:966:2: ( ruleLocalVarDecl )
                    {
                    // InternalBDSL.g:966:2: ( ruleLocalVarDecl )
                    // InternalBDSL.g:967:3: ruleLocalVarDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractElementAccess().getLocalVarDeclParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLocalVarDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractElementAccess().getLocalVarDeclParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:972:2: ( ruleLocalRuleDecl )
                    {
                    // InternalBDSL.g:972:2: ( ruleLocalRuleDecl )
                    // InternalBDSL.g:973:3: ruleLocalRuleDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractElementAccess().getLocalRuleDeclParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLocalRuleDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractElementAccess().getLocalRuleDeclParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:978:2: ( ruleLocalPredicateDeclaration )
                    {
                    // InternalBDSL.g:978:2: ( ruleLocalPredicateDeclaration )
                    // InternalBDSL.g:979:3: ruleLocalPredicateDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractElementAccess().getLocalPredicateDeclarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLocalPredicateDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractElementAccess().getLocalPredicateDeclarationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__LinkNames__Alternatives"
    // InternalBDSL.g:988:1: rule__LinkNames__Alternatives : ( ( ruleNameConstant ) | ( ( rule__LinkNames__Group_1__0 ) ) );
    public final void rule__LinkNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:992:1: ( ( ruleNameConstant ) | ( ( rule__LinkNames__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==34) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||(LA3_1>=RULE_STRING && LA3_1<=RULE_ID)||LA3_1==41) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ID) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==34) ) {
                    alt3=2;
                }
                else if ( (LA3_2==EOF||(LA3_2>=RULE_STRING && LA3_2<=RULE_ID)||LA3_2==41) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBDSL.g:993:2: ( ruleNameConstant )
                    {
                    // InternalBDSL.g:993:2: ( ruleNameConstant )
                    // InternalBDSL.g:994:3: ruleNameConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLinkNamesAccess().getNameConstantParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNameConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLinkNamesAccess().getNameConstantParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:999:2: ( ( rule__LinkNames__Group_1__0 ) )
                    {
                    // InternalBDSL.g:999:2: ( ( rule__LinkNames__Group_1__0 ) )
                    // InternalBDSL.g:1000:3: ( rule__LinkNames__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLinkNamesAccess().getGroup_1()); 
                    }
                    // InternalBDSL.g:1001:3: ( rule__LinkNames__Group_1__0 )
                    // InternalBDSL.g:1001:4: rule__LinkNames__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkNames__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLinkNamesAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkNames__Alternatives"


    // $ANTLR start "rule__AbstractBigraphDeclaration__Alternatives"
    // InternalBDSL.g:1009:1: rule__AbstractBigraphDeclaration__Alternatives : ( ( ruleBigraphVarReference ) | ( ruleNodeExpressionCall ) | ( ruleLVD2 ) | ( ruleSite ) | ( ruleElementaryBigraphs ) );
    public final void rule__AbstractBigraphDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1013:1: ( ( ruleBigraphVarReference ) | ( ruleNodeExpressionCall ) | ( ruleLVD2 ) | ( ruleSite ) | ( ruleElementaryBigraphs ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 38:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 44:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBDSL.g:1014:2: ( ruleBigraphVarReference )
                    {
                    // InternalBDSL.g:1014:2: ( ruleBigraphVarReference )
                    // InternalBDSL.g:1015:3: ruleBigraphVarReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractBigraphDeclarationAccess().getBigraphVarReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBigraphVarReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractBigraphDeclarationAccess().getBigraphVarReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1020:2: ( ruleNodeExpressionCall )
                    {
                    // InternalBDSL.g:1020:2: ( ruleNodeExpressionCall )
                    // InternalBDSL.g:1021:3: ruleNodeExpressionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractBigraphDeclarationAccess().getNodeExpressionCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNodeExpressionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractBigraphDeclarationAccess().getNodeExpressionCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1026:2: ( ruleLVD2 )
                    {
                    // InternalBDSL.g:1026:2: ( ruleLVD2 )
                    // InternalBDSL.g:1027:3: ruleLVD2
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractBigraphDeclarationAccess().getLVD2ParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLVD2();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractBigraphDeclarationAccess().getLVD2ParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBDSL.g:1032:2: ( ruleSite )
                    {
                    // InternalBDSL.g:1032:2: ( ruleSite )
                    // InternalBDSL.g:1033:3: ruleSite
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractBigraphDeclarationAccess().getSiteParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSite();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractBigraphDeclarationAccess().getSiteParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBDSL.g:1038:2: ( ruleElementaryBigraphs )
                    {
                    // InternalBDSL.g:1038:2: ( ruleElementaryBigraphs )
                    // InternalBDSL.g:1039:3: ruleElementaryBigraphs
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractBigraphDeclarationAccess().getElementaryBigraphsParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleElementaryBigraphs();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractBigraphDeclarationAccess().getElementaryBigraphsParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBigraphDeclaration__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalBDSL.g:1048:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleAbstractBigraphDeclaration ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1052:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleAbstractBigraphDeclaration ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==26||LA5_0==35||LA5_0==38||LA5_0==44) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBDSL.g:1053:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalBDSL.g:1053:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalBDSL.g:1054:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalBDSL.g:1055:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalBDSL.g:1055:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1059:2: ( ruleAbstractBigraphDeclaration )
                    {
                    // InternalBDSL.g:1059:2: ( ruleAbstractBigraphDeclaration )
                    // InternalBDSL.g:1060:3: ruleAbstractBigraphDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getAbstractBigraphDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAbstractBigraphDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getAbstractBigraphDeclarationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__AbstractMainStatements__Alternatives"
    // InternalBDSL.g:1069:1: rule__AbstractMainStatements__Alternatives : ( ( ruleBigraphVarReference ) | ( ruleBRSDefinition ) | ( rulePrintLn ) );
    public final void rule__AbstractMainStatements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1073:1: ( ( ruleBigraphVarReference ) | ( ruleBRSDefinition ) | ( rulePrintLn ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 45:
                {
                alt6=2;
                }
                break;
            case 49:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBDSL.g:1074:2: ( ruleBigraphVarReference )
                    {
                    // InternalBDSL.g:1074:2: ( ruleBigraphVarReference )
                    // InternalBDSL.g:1075:3: ruleBigraphVarReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractMainStatementsAccess().getBigraphVarReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBigraphVarReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractMainStatementsAccess().getBigraphVarReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1080:2: ( ruleBRSDefinition )
                    {
                    // InternalBDSL.g:1080:2: ( ruleBRSDefinition )
                    // InternalBDSL.g:1081:3: ruleBRSDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractMainStatementsAccess().getBRSDefinitionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBRSDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractMainStatementsAccess().getBRSDefinitionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1086:2: ( rulePrintLn )
                    {
                    // InternalBDSL.g:1086:2: ( rulePrintLn )
                    // InternalBDSL.g:1087:3: rulePrintLn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractMainStatementsAccess().getPrintLnParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrintLn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractMainStatementsAccess().getPrintLnParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractMainStatements__Alternatives"


    // $ANTLR start "rule__PrintableExpression__Alternatives"
    // InternalBDSL.g:1096:1: rule__PrintableExpression__Alternatives : ( ( ( rule__PrintableExpression__Group_0__0 ) ) | ( ruleBigraphVarReference ) );
    public final void rule__PrintableExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1100:1: ( ( ( rule__PrintableExpression__Group_0__0 ) ) | ( ruleBigraphVarReference ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBDSL.g:1101:2: ( ( rule__PrintableExpression__Group_0__0 ) )
                    {
                    // InternalBDSL.g:1101:2: ( ( rule__PrintableExpression__Group_0__0 ) )
                    // InternalBDSL.g:1102:3: ( rule__PrintableExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrintableExpressionAccess().getGroup_0()); 
                    }
                    // InternalBDSL.g:1103:3: ( rule__PrintableExpression__Group_0__0 )
                    // InternalBDSL.g:1103:4: rule__PrintableExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrintableExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrintableExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1107:2: ( ruleBigraphVarReference )
                    {
                    // InternalBDSL.g:1107:2: ( ruleBigraphVarReference )
                    // InternalBDSL.g:1108:3: ruleBigraphVarReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrintableExpressionAccess().getBigraphVarReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBigraphVarReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrintableExpressionAccess().getBigraphVarReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintableExpression__Alternatives"


    // $ANTLR start "rule__BinaryParallelOperator__Alternatives"
    // InternalBDSL.g:1117:1: rule__BinaryParallelOperator__Alternatives : ( ( ( 'UNSET' ) ) | ( ( '|' ) ) | ( ( '||' ) ) );
    public final void rule__BinaryParallelOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1121:1: ( ( ( 'UNSET' ) ) | ( ( '|' ) ) | ( ( '||' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBDSL.g:1122:2: ( ( 'UNSET' ) )
                    {
                    // InternalBDSL.g:1122:2: ( ( 'UNSET' ) )
                    // InternalBDSL.g:1123:3: ( 'UNSET' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryParallelOperatorAccess().getUNSETEnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:1124:3: ( 'UNSET' )
                    // InternalBDSL.g:1124:4: 'UNSET'
                    {
                    match(input,11,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryParallelOperatorAccess().getUNSETEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1128:2: ( ( '|' ) )
                    {
                    // InternalBDSL.g:1128:2: ( ( '|' ) )
                    // InternalBDSL.g:1129:3: ( '|' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryParallelOperatorAccess().getMERGEEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:1130:3: ( '|' )
                    // InternalBDSL.g:1130:4: '|'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryParallelOperatorAccess().getMERGEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1134:2: ( ( '||' ) )
                    {
                    // InternalBDSL.g:1134:2: ( ( '||' ) )
                    // InternalBDSL.g:1135:3: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryParallelOperatorAccess().getPARALLELEnumLiteralDeclaration_2()); 
                    }
                    // InternalBDSL.g:1136:3: ( '||' )
                    // InternalBDSL.g:1136:4: '||'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryParallelOperatorAccess().getPARALLELEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryParallelOperator__Alternatives"


    // $ANTLR start "rule__BinaryNestingOperator__Alternatives"
    // InternalBDSL.g:1144:1: rule__BinaryNestingOperator__Alternatives : ( ( ( 'UNSET2' ) ) | ( ( '-' ) ) | ( ( '*' ) ) );
    public final void rule__BinaryNestingOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1148:1: ( ( ( 'UNSET2' ) ) | ( ( '-' ) ) | ( ( '*' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBDSL.g:1149:2: ( ( 'UNSET2' ) )
                    {
                    // InternalBDSL.g:1149:2: ( ( 'UNSET2' ) )
                    // InternalBDSL.g:1150:3: ( 'UNSET2' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryNestingOperatorAccess().getUNSET2EnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:1151:3: ( 'UNSET2' )
                    // InternalBDSL.g:1151:4: 'UNSET2'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryNestingOperatorAccess().getUNSET2EnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1155:2: ( ( '-' ) )
                    {
                    // InternalBDSL.g:1155:2: ( ( '-' ) )
                    // InternalBDSL.g:1156:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryNestingOperatorAccess().getNESTINGEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:1157:3: ( '-' )
                    // InternalBDSL.g:1157:4: '-'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryNestingOperatorAccess().getNESTINGEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1161:2: ( ( '*' ) )
                    {
                    // InternalBDSL.g:1161:2: ( ( '*' ) )
                    // InternalBDSL.g:1162:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryNestingOperatorAccess().getCOMPOSITIONEnumLiteralDeclaration_2()); 
                    }
                    // InternalBDSL.g:1163:3: ( '*' )
                    // InternalBDSL.g:1163:4: '*'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryNestingOperatorAccess().getCOMPOSITIONEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryNestingOperator__Alternatives"


    // $ANTLR start "rule__ControlType__Alternatives"
    // InternalBDSL.g:1171:1: rule__ControlType__Alternatives : ( ( ( 'atomic' ) ) | ( ( 'active' ) ) | ( ( 'passive' ) ) );
    public final void rule__ControlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1175:1: ( ( ( 'atomic' ) ) | ( ( 'active' ) ) | ( ( 'passive' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBDSL.g:1176:2: ( ( 'atomic' ) )
                    {
                    // InternalBDSL.g:1176:2: ( ( 'atomic' ) )
                    // InternalBDSL.g:1177:3: ( 'atomic' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlTypeAccess().getATOMICEnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:1178:3: ( 'atomic' )
                    // InternalBDSL.g:1178:4: 'atomic'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getControlTypeAccess().getATOMICEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1182:2: ( ( 'active' ) )
                    {
                    // InternalBDSL.g:1182:2: ( ( 'active' ) )
                    // InternalBDSL.g:1183:3: ( 'active' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlTypeAccess().getACTIVEEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:1184:3: ( 'active' )
                    // InternalBDSL.g:1184:4: 'active'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getControlTypeAccess().getACTIVEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1188:2: ( ( 'passive' ) )
                    {
                    // InternalBDSL.g:1188:2: ( ( 'passive' ) )
                    // InternalBDSL.g:1189:3: ( 'passive' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlTypeAccess().getPASSIVEEnumLiteralDeclaration_2()); 
                    }
                    // InternalBDSL.g:1190:3: ( 'passive' )
                    // InternalBDSL.g:1190:4: 'passive'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getControlTypeAccess().getPASSIVEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlType__Alternatives"


    // $ANTLR start "rule__PredicateType__Alternatives"
    // InternalBDSL.g:1198:1: rule__PredicateType__Alternatives : ( ( ( 'partial' ) ) | ( ( 'iso' ) ) );
    public final void rule__PredicateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1202:1: ( ( ( 'partial' ) ) | ( ( 'iso' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBDSL.g:1203:2: ( ( 'partial' ) )
                    {
                    // InternalBDSL.g:1203:2: ( ( 'partial' ) )
                    // InternalBDSL.g:1204:3: ( 'partial' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredicateTypeAccess().getPARTIALEnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:1205:3: ( 'partial' )
                    // InternalBDSL.g:1205:4: 'partial'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredicateTypeAccess().getPARTIALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1209:2: ( ( 'iso' ) )
                    {
                    // InternalBDSL.g:1209:2: ( ( 'iso' ) )
                    // InternalBDSL.g:1210:3: ( 'iso' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredicateTypeAccess().getISOEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:1211:3: ( 'iso' )
                    // InternalBDSL.g:1211:4: 'iso'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredicateTypeAccess().getISOEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateType__Alternatives"


    // $ANTLR start "rule__OutputModeModel__Alternatives"
    // InternalBDSL.g:1219:1: rule__OutputModeModel__Alternatives : ( ( ( 'xmi' ) ) | ( ( 'ecore' ) ) );
    public final void rule__OutputModeModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1223:1: ( ( ( 'xmi' ) ) | ( ( 'ecore' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBDSL.g:1224:2: ( ( 'xmi' ) )
                    {
                    // InternalBDSL.g:1224:2: ( ( 'xmi' ) )
                    // InternalBDSL.g:1225:3: ( 'xmi' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputModeModelAccess().getINSTANCE_MODELEnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:1226:3: ( 'xmi' )
                    // InternalBDSL.g:1226:4: 'xmi'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOutputModeModelAccess().getINSTANCE_MODELEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1230:2: ( ( 'ecore' ) )
                    {
                    // InternalBDSL.g:1230:2: ( ( 'ecore' ) )
                    // InternalBDSL.g:1231:3: ( 'ecore' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputModeModelAccess().getMETA_MODELEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:1232:3: ( 'ecore' )
                    // InternalBDSL.g:1232:4: 'ecore'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOutputModeModelAccess().getMETA_MODELEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputModeModel__Alternatives"


    // $ANTLR start "rule__BRSModel__Group__0"
    // InternalBDSL.g:1240:1: rule__BRSModel__Group__0 : rule__BRSModel__Group__0__Impl rule__BRSModel__Group__1 ;
    public final void rule__BRSModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1244:1: ( rule__BRSModel__Group__0__Impl rule__BRSModel__Group__1 )
            // InternalBDSL.g:1245:2: rule__BRSModel__Group__0__Impl rule__BRSModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BRSModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSModel__Group__0"


    // $ANTLR start "rule__BRSModel__Group__0__Impl"
    // InternalBDSL.g:1252:1: rule__BRSModel__Group__0__Impl : ( ( rule__BRSModel__SignatureAssignment_0 )* ) ;
    public final void rule__BRSModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1256:1: ( ( ( rule__BRSModel__SignatureAssignment_0 )* ) )
            // InternalBDSL.g:1257:1: ( ( rule__BRSModel__SignatureAssignment_0 )* )
            {
            // InternalBDSL.g:1257:1: ( ( rule__BRSModel__SignatureAssignment_0 )* )
            // InternalBDSL.g:1258:2: ( rule__BRSModel__SignatureAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSModelAccess().getSignatureAssignment_0()); 
            }
            // InternalBDSL.g:1259:2: ( rule__BRSModel__SignatureAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBDSL.g:1259:3: rule__BRSModel__SignatureAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__BRSModel__SignatureAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSModelAccess().getSignatureAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSModel__Group__0__Impl"


    // $ANTLR start "rule__BRSModel__Group__1"
    // InternalBDSL.g:1267:1: rule__BRSModel__Group__1 : rule__BRSModel__Group__1__Impl ;
    public final void rule__BRSModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1271:1: ( rule__BRSModel__Group__1__Impl )
            // InternalBDSL.g:1272:2: rule__BRSModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSModel__Group__1"


    // $ANTLR start "rule__BRSModel__Group__1__Impl"
    // InternalBDSL.g:1278:1: rule__BRSModel__Group__1__Impl : ( ( rule__BRSModel__UnorderedGroup_1 ) ) ;
    public final void rule__BRSModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1282:1: ( ( ( rule__BRSModel__UnorderedGroup_1 ) ) )
            // InternalBDSL.g:1283:1: ( ( rule__BRSModel__UnorderedGroup_1 ) )
            {
            // InternalBDSL.g:1283:1: ( ( rule__BRSModel__UnorderedGroup_1 ) )
            // InternalBDSL.g:1284:2: ( rule__BRSModel__UnorderedGroup_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSModelAccess().getUnorderedGroup_1()); 
            }
            // InternalBDSL.g:1285:2: ( rule__BRSModel__UnorderedGroup_1 )
            // InternalBDSL.g:1285:3: rule__BRSModel__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__BRSModel__UnorderedGroup_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSModelAccess().getUnorderedGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSModel__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalBDSL.g:1294:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1298:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalBDSL.g:1299:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalBDSL.g:1306:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1310:1: ( ( RULE_ID ) )
            // InternalBDSL.g:1311:1: ( RULE_ID )
            {
            // InternalBDSL.g:1311:1: ( RULE_ID )
            // InternalBDSL.g:1312:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalBDSL.g:1321:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1325:1: ( rule__FQN__Group__1__Impl )
            // InternalBDSL.g:1326:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalBDSL.g:1332:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1336:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalBDSL.g:1337:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalBDSL.g:1337:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalBDSL.g:1338:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalBDSL.g:1339:2: ( rule__FQN__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBDSL.g:1339:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalBDSL.g:1348:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1352:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalBDSL.g:1353:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalBDSL.g:1360:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1364:1: ( ( '.' ) )
            // InternalBDSL.g:1365:1: ( '.' )
            {
            // InternalBDSL.g:1365:1: ( '.' )
            // InternalBDSL.g:1366:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalBDSL.g:1375:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1379:1: ( rule__FQN__Group_1__1__Impl )
            // InternalBDSL.g:1380:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalBDSL.g:1386:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1390:1: ( ( RULE_ID ) )
            // InternalBDSL.g:1391:1: ( RULE_ID )
            {
            // InternalBDSL.g:1391:1: ( RULE_ID )
            // InternalBDSL.g:1392:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__0"
    // InternalBDSL.g:1402:1: rule__FqnWithWildCard__Group__0 : rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 ;
    public final void rule__FqnWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1406:1: ( rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 )
            // InternalBDSL.g:1407:2: rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FqnWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FqnWithWildCard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWithWildCard__Group__0"


    // $ANTLR start "rule__FqnWithWildCard__Group__0__Impl"
    // InternalBDSL.g:1414:1: rule__FqnWithWildCard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1418:1: ( ( ruleFQN ) )
            // InternalBDSL.g:1419:1: ( ruleFQN )
            {
            // InternalBDSL.g:1419:1: ( ruleFQN )
            // InternalBDSL.g:1420:2: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__1"
    // InternalBDSL.g:1429:1: rule__FqnWithWildCard__Group__1 : rule__FqnWithWildCard__Group__1__Impl ;
    public final void rule__FqnWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1433:1: ( rule__FqnWithWildCard__Group__1__Impl )
            // InternalBDSL.g:1434:2: rule__FqnWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FqnWithWildCard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWithWildCard__Group__1"


    // $ANTLR start "rule__FqnWithWildCard__Group__1__Impl"
    // InternalBDSL.g:1440:1: rule__FqnWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1444:1: ( ( ( '.*' )? ) )
            // InternalBDSL.g:1445:1: ( ( '.*' )? )
            {
            // InternalBDSL.g:1445:1: ( ( '.*' )? )
            // InternalBDSL.g:1446:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalBDSL.g:1447:2: ( '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBDSL.g:1447:3: '.*'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__BigraphVarReferenceID__Group__0"
    // InternalBDSL.g:1456:1: rule__BigraphVarReferenceID__Group__0 : rule__BigraphVarReferenceID__Group__0__Impl rule__BigraphVarReferenceID__Group__1 ;
    public final void rule__BigraphVarReferenceID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1460:1: ( rule__BigraphVarReferenceID__Group__0__Impl rule__BigraphVarReferenceID__Group__1 )
            // InternalBDSL.g:1461:2: rule__BigraphVarReferenceID__Group__0__Impl rule__BigraphVarReferenceID__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__BigraphVarReferenceID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BigraphVarReferenceID__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigraphVarReferenceID__Group__0"


    // $ANTLR start "rule__BigraphVarReferenceID__Group__0__Impl"
    // InternalBDSL.g:1468:1: rule__BigraphVarReferenceID__Group__0__Impl : ( '$' ) ;
    public final void rule__BigraphVarReferenceID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1472:1: ( ( '$' ) )
            // InternalBDSL.g:1473:1: ( '$' )
            {
            // InternalBDSL.g:1473:1: ( '$' )
            // InternalBDSL.g:1474:2: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceIDAccess().getDollarSignKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigraphVarReferenceIDAccess().getDollarSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigraphVarReferenceID__Group__0__Impl"


    // $ANTLR start "rule__BigraphVarReferenceID__Group__1"
    // InternalBDSL.g:1483:1: rule__BigraphVarReferenceID__Group__1 : rule__BigraphVarReferenceID__Group__1__Impl ;
    public final void rule__BigraphVarReferenceID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1487:1: ( rule__BigraphVarReferenceID__Group__1__Impl )
            // InternalBDSL.g:1488:2: rule__BigraphVarReferenceID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BigraphVarReferenceID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigraphVarReferenceID__Group__1"


    // $ANTLR start "rule__BigraphVarReferenceID__Group__1__Impl"
    // InternalBDSL.g:1494:1: rule__BigraphVarReferenceID__Group__1__Impl : ( ruleFQN ) ;
    public final void rule__BigraphVarReferenceID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1498:1: ( ( ruleFQN ) )
            // InternalBDSL.g:1499:1: ( ruleFQN )
            {
            // InternalBDSL.g:1499:1: ( ruleFQN )
            // InternalBDSL.g:1500:2: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceIDAccess().getFQNParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigraphVarReferenceIDAccess().getFQNParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigraphVarReferenceID__Group__1__Impl"


    // $ANTLR start "rule__MainElement__Group__0"
    // InternalBDSL.g:1510:1: rule__MainElement__Group__0 : rule__MainElement__Group__0__Impl rule__MainElement__Group__1 ;
    public final void rule__MainElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1514:1: ( rule__MainElement__Group__0__Impl rule__MainElement__Group__1 )
            // InternalBDSL.g:1515:2: rule__MainElement__Group__0__Impl rule__MainElement__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MainElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__0"


    // $ANTLR start "rule__MainElement__Group__0__Impl"
    // InternalBDSL.g:1522:1: rule__MainElement__Group__0__Impl : ( 'main' ) ;
    public final void rule__MainElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1526:1: ( ( 'main' ) )
            // InternalBDSL.g:1527:1: ( 'main' )
            {
            // InternalBDSL.g:1527:1: ( 'main' )
            // InternalBDSL.g:1528:2: 'main'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getMainKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementAccess().getMainKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__0__Impl"


    // $ANTLR start "rule__MainElement__Group__1"
    // InternalBDSL.g:1537:1: rule__MainElement__Group__1 : rule__MainElement__Group__1__Impl rule__MainElement__Group__2 ;
    public final void rule__MainElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1541:1: ( rule__MainElement__Group__1__Impl rule__MainElement__Group__2 )
            // InternalBDSL.g:1542:2: rule__MainElement__Group__1__Impl rule__MainElement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MainElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__1"


    // $ANTLR start "rule__MainElement__Group__1__Impl"
    // InternalBDSL.g:1549:1: rule__MainElement__Group__1__Impl : ( '=' ) ;
    public final void rule__MainElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1553:1: ( ( '=' ) )
            // InternalBDSL.g:1554:1: ( '=' )
            {
            // InternalBDSL.g:1554:1: ( '=' )
            // InternalBDSL.g:1555:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getEqualsSignKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__1__Impl"


    // $ANTLR start "rule__MainElement__Group__2"
    // InternalBDSL.g:1564:1: rule__MainElement__Group__2 : rule__MainElement__Group__2__Impl rule__MainElement__Group__3 ;
    public final void rule__MainElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1568:1: ( rule__MainElement__Group__2__Impl rule__MainElement__Group__3 )
            // InternalBDSL.g:1569:2: rule__MainElement__Group__2__Impl rule__MainElement__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__MainElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainElement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__2"


    // $ANTLR start "rule__MainElement__Group__2__Impl"
    // InternalBDSL.g:1576:1: rule__MainElement__Group__2__Impl : ( '{' ) ;
    public final void rule__MainElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1580:1: ( ( '{' ) )
            // InternalBDSL.g:1581:1: ( '{' )
            {
            // InternalBDSL.g:1581:1: ( '{' )
            // InternalBDSL.g:1582:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__2__Impl"


    // $ANTLR start "rule__MainElement__Group__3"
    // InternalBDSL.g:1591:1: rule__MainElement__Group__3 : rule__MainElement__Group__3__Impl rule__MainElement__Group__4 ;
    public final void rule__MainElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1595:1: ( rule__MainElement__Group__3__Impl rule__MainElement__Group__4 )
            // InternalBDSL.g:1596:2: rule__MainElement__Group__3__Impl rule__MainElement__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__MainElement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainElement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__3"


    // $ANTLR start "rule__MainElement__Group__3__Impl"
    // InternalBDSL.g:1603:1: rule__MainElement__Group__3__Impl : ( () ) ;
    public final void rule__MainElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1607:1: ( ( () ) )
            // InternalBDSL.g:1608:1: ( () )
            {
            // InternalBDSL.g:1608:1: ( () )
            // InternalBDSL.g:1609:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getMainElementAction_3()); 
            }
            // InternalBDSL.g:1610:2: ()
            // InternalBDSL.g:1610:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementAccess().getMainElementAction_3()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__3__Impl"


    // $ANTLR start "rule__MainElement__Group__4"
    // InternalBDSL.g:1618:1: rule__MainElement__Group__4 : rule__MainElement__Group__4__Impl rule__MainElement__Group__5 ;
    public final void rule__MainElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1622:1: ( rule__MainElement__Group__4__Impl rule__MainElement__Group__5 )
            // InternalBDSL.g:1623:2: rule__MainElement__Group__4__Impl rule__MainElement__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__MainElement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainElement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__4"


    // $ANTLR start "rule__MainElement__Group__4__Impl"
    // InternalBDSL.g:1630:1: rule__MainElement__Group__4__Impl : ( ( rule__MainElement__ValueAssignment_4 )* ) ;
    public final void rule__MainElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1634:1: ( ( ( rule__MainElement__ValueAssignment_4 )* ) )
            // InternalBDSL.g:1635:1: ( ( rule__MainElement__ValueAssignment_4 )* )
            {
            // InternalBDSL.g:1635:1: ( ( rule__MainElement__ValueAssignment_4 )* )
            // InternalBDSL.g:1636:2: ( rule__MainElement__ValueAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getValueAssignment_4()); 
            }
            // InternalBDSL.g:1637:2: ( rule__MainElement__ValueAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26||LA16_0==45||LA16_0==49) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBDSL.g:1637:3: rule__MainElement__ValueAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MainElement__ValueAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementAccess().getValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__4__Impl"


    // $ANTLR start "rule__MainElement__Group__5"
    // InternalBDSL.g:1645:1: rule__MainElement__Group__5 : rule__MainElement__Group__5__Impl ;
    public final void rule__MainElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1649:1: ( rule__MainElement__Group__5__Impl )
            // InternalBDSL.g:1650:2: rule__MainElement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainElement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__5"


    // $ANTLR start "rule__MainElement__Group__5__Impl"
    // InternalBDSL.g:1656:1: rule__MainElement__Group__5__Impl : ( '}' ) ;
    public final void rule__MainElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1660:1: ( ( '}' ) )
            // InternalBDSL.g:1661:1: ( '}' )
            {
            // InternalBDSL.g:1661:1: ( '}' )
            // InternalBDSL.g:1662:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__Group__5__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalBDSL.g:1672:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1676:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalBDSL.g:1677:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Signature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signature__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // InternalBDSL.g:1684:1: rule__Signature__Group__0__Impl : ( () ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1688:1: ( ( () ) )
            // InternalBDSL.g:1689:1: ( () )
            {
            // InternalBDSL.g:1689:1: ( () )
            // InternalBDSL.g:1690:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSignatureAction_0()); 
            }
            // InternalBDSL.g:1691:2: ()
            // InternalBDSL.g:1691:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getSignatureAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // InternalBDSL.g:1699:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1703:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalBDSL.g:1704:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Signature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signature__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // InternalBDSL.g:1711:1: rule__Signature__Group__1__Impl : ( 'signature' ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1715:1: ( ( 'signature' ) )
            // InternalBDSL.g:1716:1: ( 'signature' )
            {
            // InternalBDSL.g:1716:1: ( 'signature' )
            // InternalBDSL.g:1717:2: 'signature'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSignatureKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getSignatureKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group__2"
    // InternalBDSL.g:1726:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1730:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalBDSL.g:1731:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Signature__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signature__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2"


    // $ANTLR start "rule__Signature__Group__2__Impl"
    // InternalBDSL.g:1738:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__NameAssignment_2 ) ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1742:1: ( ( ( rule__Signature__NameAssignment_2 ) ) )
            // InternalBDSL.g:1743:1: ( ( rule__Signature__NameAssignment_2 ) )
            {
            // InternalBDSL.g:1743:1: ( ( rule__Signature__NameAssignment_2 ) )
            // InternalBDSL.g:1744:2: ( rule__Signature__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getNameAssignment_2()); 
            }
            // InternalBDSL.g:1745:2: ( rule__Signature__NameAssignment_2 )
            // InternalBDSL.g:1745:3: rule__Signature__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Signature__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2__Impl"


    // $ANTLR start "rule__Signature__Group__3"
    // InternalBDSL.g:1753:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1757:1: ( rule__Signature__Group__3__Impl )
            // InternalBDSL.g:1758:2: rule__Signature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3"


    // $ANTLR start "rule__Signature__Group__3__Impl"
    // InternalBDSL.g:1764:1: rule__Signature__Group__3__Impl : ( ( rule__Signature__Group_3__0 )? ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1768:1: ( ( ( rule__Signature__Group_3__0 )? ) )
            // InternalBDSL.g:1769:1: ( ( rule__Signature__Group_3__0 )? )
            {
            // InternalBDSL.g:1769:1: ( ( rule__Signature__Group_3__0 )? )
            // InternalBDSL.g:1770:2: ( rule__Signature__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_3()); 
            }
            // InternalBDSL.g:1771:2: ( rule__Signature__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBDSL.g:1771:3: rule__Signature__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3__Impl"


    // $ANTLR start "rule__Signature__Group_3__0"
    // InternalBDSL.g:1780:1: rule__Signature__Group_3__0 : rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 ;
    public final void rule__Signature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1784:1: ( rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 )
            // InternalBDSL.g:1785:2: rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Signature__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signature__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__0"


    // $ANTLR start "rule__Signature__Group_3__0__Impl"
    // InternalBDSL.g:1792:1: rule__Signature__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Signature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1796:1: ( ( '{' ) )
            // InternalBDSL.g:1797:1: ( '{' )
            {
            // InternalBDSL.g:1797:1: ( '{' )
            // InternalBDSL.g:1798:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__0__Impl"


    // $ANTLR start "rule__Signature__Group_3__1"
    // InternalBDSL.g:1807:1: rule__Signature__Group_3__1 : rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 ;
    public final void rule__Signature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1811:1: ( rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 )
            // InternalBDSL.g:1812:2: rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2
            {
            pushFollow(FOLLOW_15);
            rule__Signature__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signature__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__1"


    // $ANTLR start "rule__Signature__Group_3__1__Impl"
    // InternalBDSL.g:1819:1: rule__Signature__Group_3__1__Impl : ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) ) ;
    public final void rule__Signature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1823:1: ( ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) ) )
            // InternalBDSL.g:1824:1: ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) )
            {
            // InternalBDSL.g:1824:1: ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) )
            // InternalBDSL.g:1825:2: ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* )
            {
            // InternalBDSL.g:1825:2: ( ( rule__Signature__ControlsAssignment_3_1 ) )
            // InternalBDSL.g:1826:3: ( rule__Signature__ControlsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getControlsAssignment_3_1()); 
            }
            // InternalBDSL.g:1827:3: ( rule__Signature__ControlsAssignment_3_1 )
            // InternalBDSL.g:1827:4: rule__Signature__ControlsAssignment_3_1
            {
            pushFollow(FOLLOW_16);
            rule__Signature__ControlsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getControlsAssignment_3_1()); 
            }

            }

            // InternalBDSL.g:1830:2: ( ( rule__Signature__ControlsAssignment_3_1 )* )
            // InternalBDSL.g:1831:3: ( rule__Signature__ControlsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getControlsAssignment_3_1()); 
            }
            // InternalBDSL.g:1832:3: ( rule__Signature__ControlsAssignment_3_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=17 && LA18_0<=19)||LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBDSL.g:1832:4: rule__Signature__ControlsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Signature__ControlsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getControlsAssignment_3_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__1__Impl"


    // $ANTLR start "rule__Signature__Group_3__2"
    // InternalBDSL.g:1841:1: rule__Signature__Group_3__2 : rule__Signature__Group_3__2__Impl ;
    public final void rule__Signature__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1845:1: ( rule__Signature__Group_3__2__Impl )
            // InternalBDSL.g:1846:2: rule__Signature__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__2"


    // $ANTLR start "rule__Signature__Group_3__2__Impl"
    // InternalBDSL.g:1852:1: rule__Signature__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Signature__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1856:1: ( ( '}' ) )
            // InternalBDSL.g:1857:1: ( '}' )
            {
            // InternalBDSL.g:1857:1: ( '}' )
            // InternalBDSL.g:1858:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_3_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__2__Impl"


    // $ANTLR start "rule__ControlDef__Group__0"
    // InternalBDSL.g:1868:1: rule__ControlDef__Group__0 : rule__ControlDef__Group__0__Impl rule__ControlDef__Group__1 ;
    public final void rule__ControlDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1872:1: ( rule__ControlDef__Group__0__Impl rule__ControlDef__Group__1 )
            // InternalBDSL.g:1873:2: rule__ControlDef__Group__0__Impl rule__ControlDef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ControlDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ControlDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__0"


    // $ANTLR start "rule__ControlDef__Group__0__Impl"
    // InternalBDSL.g:1880:1: rule__ControlDef__Group__0__Impl : ( () ) ;
    public final void rule__ControlDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1884:1: ( ( () ) )
            // InternalBDSL.g:1885:1: ( () )
            {
            // InternalBDSL.g:1885:1: ( () )
            // InternalBDSL.g:1886:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getControlVariableAction_0()); 
            }
            // InternalBDSL.g:1887:2: ()
            // InternalBDSL.g:1887:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getControlVariableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__0__Impl"


    // $ANTLR start "rule__ControlDef__Group__1"
    // InternalBDSL.g:1895:1: rule__ControlDef__Group__1 : rule__ControlDef__Group__1__Impl rule__ControlDef__Group__2 ;
    public final void rule__ControlDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1899:1: ( rule__ControlDef__Group__1__Impl rule__ControlDef__Group__2 )
            // InternalBDSL.g:1900:2: rule__ControlDef__Group__1__Impl rule__ControlDef__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ControlDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ControlDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__1"


    // $ANTLR start "rule__ControlDef__Group__1__Impl"
    // InternalBDSL.g:1907:1: rule__ControlDef__Group__1__Impl : ( ( rule__ControlDef__TypeAssignment_1 )? ) ;
    public final void rule__ControlDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1911:1: ( ( ( rule__ControlDef__TypeAssignment_1 )? ) )
            // InternalBDSL.g:1912:1: ( ( rule__ControlDef__TypeAssignment_1 )? )
            {
            // InternalBDSL.g:1912:1: ( ( rule__ControlDef__TypeAssignment_1 )? )
            // InternalBDSL.g:1913:2: ( rule__ControlDef__TypeAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getTypeAssignment_1()); 
            }
            // InternalBDSL.g:1914:2: ( rule__ControlDef__TypeAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=17 && LA19_0<=19)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBDSL.g:1914:3: rule__ControlDef__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ControlDef__TypeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__1__Impl"


    // $ANTLR start "rule__ControlDef__Group__2"
    // InternalBDSL.g:1922:1: rule__ControlDef__Group__2 : rule__ControlDef__Group__2__Impl rule__ControlDef__Group__3 ;
    public final void rule__ControlDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1926:1: ( rule__ControlDef__Group__2__Impl rule__ControlDef__Group__3 )
            // InternalBDSL.g:1927:2: rule__ControlDef__Group__2__Impl rule__ControlDef__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ControlDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ControlDef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__2"


    // $ANTLR start "rule__ControlDef__Group__2__Impl"
    // InternalBDSL.g:1934:1: rule__ControlDef__Group__2__Impl : ( 'ctrl' ) ;
    public final void rule__ControlDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1938:1: ( ( 'ctrl' ) )
            // InternalBDSL.g:1939:1: ( 'ctrl' )
            {
            // InternalBDSL.g:1939:1: ( 'ctrl' )
            // InternalBDSL.g:1940:2: 'ctrl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getCtrlKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getCtrlKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__2__Impl"


    // $ANTLR start "rule__ControlDef__Group__3"
    // InternalBDSL.g:1949:1: rule__ControlDef__Group__3 : rule__ControlDef__Group__3__Impl rule__ControlDef__Group__4 ;
    public final void rule__ControlDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1953:1: ( rule__ControlDef__Group__3__Impl rule__ControlDef__Group__4 )
            // InternalBDSL.g:1954:2: rule__ControlDef__Group__3__Impl rule__ControlDef__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ControlDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ControlDef__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__3"


    // $ANTLR start "rule__ControlDef__Group__3__Impl"
    // InternalBDSL.g:1961:1: rule__ControlDef__Group__3__Impl : ( ( rule__ControlDef__NameAssignment_3 ) ) ;
    public final void rule__ControlDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1965:1: ( ( ( rule__ControlDef__NameAssignment_3 ) ) )
            // InternalBDSL.g:1966:1: ( ( rule__ControlDef__NameAssignment_3 ) )
            {
            // InternalBDSL.g:1966:1: ( ( rule__ControlDef__NameAssignment_3 ) )
            // InternalBDSL.g:1967:2: ( rule__ControlDef__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getNameAssignment_3()); 
            }
            // InternalBDSL.g:1968:2: ( rule__ControlDef__NameAssignment_3 )
            // InternalBDSL.g:1968:3: rule__ControlDef__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ControlDef__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__3__Impl"


    // $ANTLR start "rule__ControlDef__Group__4"
    // InternalBDSL.g:1976:1: rule__ControlDef__Group__4 : rule__ControlDef__Group__4__Impl rule__ControlDef__Group__5 ;
    public final void rule__ControlDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1980:1: ( rule__ControlDef__Group__4__Impl rule__ControlDef__Group__5 )
            // InternalBDSL.g:1981:2: rule__ControlDef__Group__4__Impl rule__ControlDef__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__ControlDef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ControlDef__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__4"


    // $ANTLR start "rule__ControlDef__Group__4__Impl"
    // InternalBDSL.g:1988:1: rule__ControlDef__Group__4__Impl : ( 'arity' ) ;
    public final void rule__ControlDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1992:1: ( ( 'arity' ) )
            // InternalBDSL.g:1993:1: ( 'arity' )
            {
            // InternalBDSL.g:1993:1: ( 'arity' )
            // InternalBDSL.g:1994:2: 'arity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getArityKeyword_4()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getArityKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__4__Impl"


    // $ANTLR start "rule__ControlDef__Group__5"
    // InternalBDSL.g:2003:1: rule__ControlDef__Group__5 : rule__ControlDef__Group__5__Impl ;
    public final void rule__ControlDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2007:1: ( rule__ControlDef__Group__5__Impl )
            // InternalBDSL.g:2008:2: rule__ControlDef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ControlDef__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__5"


    // $ANTLR start "rule__ControlDef__Group__5__Impl"
    // InternalBDSL.g:2014:1: rule__ControlDef__Group__5__Impl : ( ( rule__ControlDef__ArityAssignment_5 ) ) ;
    public final void rule__ControlDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2018:1: ( ( ( rule__ControlDef__ArityAssignment_5 ) ) )
            // InternalBDSL.g:2019:1: ( ( rule__ControlDef__ArityAssignment_5 ) )
            {
            // InternalBDSL.g:2019:1: ( ( rule__ControlDef__ArityAssignment_5 ) )
            // InternalBDSL.g:2020:2: ( rule__ControlDef__ArityAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getArityAssignment_5()); 
            }
            // InternalBDSL.g:2021:2: ( rule__ControlDef__ArityAssignment_5 )
            // InternalBDSL.g:2021:3: rule__ControlDef__ArityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ControlDef__ArityAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getArityAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__Group__5__Impl"


    // $ANTLR start "rule__LinkNames__Group_1__0"
    // InternalBDSL.g:2030:1: rule__LinkNames__Group_1__0 : rule__LinkNames__Group_1__0__Impl rule__LinkNames__Group_1__1 ;
    public final void rule__LinkNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2034:1: ( rule__LinkNames__Group_1__0__Impl rule__LinkNames__Group_1__1 )
            // InternalBDSL.g:2035:2: rule__LinkNames__Group_1__0__Impl rule__LinkNames__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__LinkNames__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkNames__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkNames__Group_1__0"


    // $ANTLR start "rule__LinkNames__Group_1__0__Impl"
    // InternalBDSL.g:2042:1: rule__LinkNames__Group_1__0__Impl : ( ruleNameConstant ) ;
    public final void rule__LinkNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2046:1: ( ( ruleNameConstant ) )
            // InternalBDSL.g:2047:1: ( ruleNameConstant )
            {
            // InternalBDSL.g:2047:1: ( ruleNameConstant )
            // InternalBDSL.g:2048:2: ruleNameConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkNamesAccess().getNameConstantParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNameConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkNamesAccess().getNameConstantParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkNames__Group_1__0__Impl"


    // $ANTLR start "rule__LinkNames__Group_1__1"
    // InternalBDSL.g:2057:1: rule__LinkNames__Group_1__1 : rule__LinkNames__Group_1__1__Impl ;
    public final void rule__LinkNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2061:1: ( rule__LinkNames__Group_1__1__Impl )
            // InternalBDSL.g:2062:2: rule__LinkNames__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkNames__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkNames__Group_1__1"


    // $ANTLR start "rule__LinkNames__Group_1__1__Impl"
    // InternalBDSL.g:2068:1: rule__LinkNames__Group_1__1__Impl : ( ',' ) ;
    public final void rule__LinkNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2072:1: ( ( ',' ) )
            // InternalBDSL.g:2073:1: ( ',' )
            {
            // InternalBDSL.g:2073:1: ( ',' )
            // InternalBDSL.g:2074:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkNamesAccess().getCommaKeyword_1_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkNamesAccess().getCommaKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkNames__Group_1__1__Impl"


    // $ANTLR start "rule__Site__Group__0"
    // InternalBDSL.g:2084:1: rule__Site__Group__0 : rule__Site__Group__0__Impl rule__Site__Group__1 ;
    public final void rule__Site__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2088:1: ( rule__Site__Group__0__Impl rule__Site__Group__1 )
            // InternalBDSL.g:2089:2: rule__Site__Group__0__Impl rule__Site__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Site__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Site__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__0"


    // $ANTLR start "rule__Site__Group__0__Impl"
    // InternalBDSL.g:2096:1: rule__Site__Group__0__Impl : ( 'id' ) ;
    public final void rule__Site__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2100:1: ( ( 'id' ) )
            // InternalBDSL.g:2101:1: ( 'id' )
            {
            // InternalBDSL.g:2101:1: ( 'id' )
            // InternalBDSL.g:2102:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteAccess().getIdKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSiteAccess().getIdKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__0__Impl"


    // $ANTLR start "rule__Site__Group__1"
    // InternalBDSL.g:2111:1: rule__Site__Group__1 : rule__Site__Group__1__Impl rule__Site__Group__2 ;
    public final void rule__Site__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2115:1: ( rule__Site__Group__1__Impl rule__Site__Group__2 )
            // InternalBDSL.g:2116:2: rule__Site__Group__1__Impl rule__Site__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Site__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Site__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__1"


    // $ANTLR start "rule__Site__Group__1__Impl"
    // InternalBDSL.g:2123:1: rule__Site__Group__1__Impl : ( '(' ) ;
    public final void rule__Site__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2127:1: ( ( '(' ) )
            // InternalBDSL.g:2128:1: ( '(' )
            {
            // InternalBDSL.g:2128:1: ( '(' )
            // InternalBDSL.g:2129:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSiteAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__1__Impl"


    // $ANTLR start "rule__Site__Group__2"
    // InternalBDSL.g:2138:1: rule__Site__Group__2 : rule__Site__Group__2__Impl rule__Site__Group__3 ;
    public final void rule__Site__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2142:1: ( rule__Site__Group__2__Impl rule__Site__Group__3 )
            // InternalBDSL.g:2143:2: rule__Site__Group__2__Impl rule__Site__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Site__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Site__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__2"


    // $ANTLR start "rule__Site__Group__2__Impl"
    // InternalBDSL.g:2150:1: rule__Site__Group__2__Impl : ( ( rule__Site__IndexAssignment_2 ) ) ;
    public final void rule__Site__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2154:1: ( ( ( rule__Site__IndexAssignment_2 ) ) )
            // InternalBDSL.g:2155:1: ( ( rule__Site__IndexAssignment_2 ) )
            {
            // InternalBDSL.g:2155:1: ( ( rule__Site__IndexAssignment_2 ) )
            // InternalBDSL.g:2156:2: ( rule__Site__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteAccess().getIndexAssignment_2()); 
            }
            // InternalBDSL.g:2157:2: ( rule__Site__IndexAssignment_2 )
            // InternalBDSL.g:2157:3: rule__Site__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Site__IndexAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSiteAccess().getIndexAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__2__Impl"


    // $ANTLR start "rule__Site__Group__3"
    // InternalBDSL.g:2165:1: rule__Site__Group__3 : rule__Site__Group__3__Impl ;
    public final void rule__Site__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2169:1: ( rule__Site__Group__3__Impl )
            // InternalBDSL.g:2170:2: rule__Site__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Site__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__3"


    // $ANTLR start "rule__Site__Group__3__Impl"
    // InternalBDSL.g:2176:1: rule__Site__Group__3__Impl : ( ')' ) ;
    public final void rule__Site__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2180:1: ( ( ')' ) )
            // InternalBDSL.g:2181:1: ( ')' )
            {
            // InternalBDSL.g:2181:1: ( ')' )
            // InternalBDSL.g:2182:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSiteAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__3__Impl"


    // $ANTLR start "rule__LVD2__Group__0"
    // InternalBDSL.g:2192:1: rule__LVD2__Group__0 : rule__LVD2__Group__0__Impl rule__LVD2__Group__1 ;
    public final void rule__LVD2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2196:1: ( rule__LVD2__Group__0__Impl rule__LVD2__Group__1 )
            // InternalBDSL.g:2197:2: rule__LVD2__Group__0__Impl rule__LVD2__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__LVD2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LVD2__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__0"


    // $ANTLR start "rule__LVD2__Group__0__Impl"
    // InternalBDSL.g:2204:1: rule__LVD2__Group__0__Impl : ( () ) ;
    public final void rule__LVD2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2208:1: ( ( () ) )
            // InternalBDSL.g:2209:1: ( () )
            {
            // InternalBDSL.g:2209:1: ( () )
            // InternalBDSL.g:2210:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getLocalVarDeclAction_0()); 
            }
            // InternalBDSL.g:2211:2: ()
            // InternalBDSL.g:2211:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getLocalVarDeclAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__0__Impl"


    // $ANTLR start "rule__LVD2__Group__1"
    // InternalBDSL.g:2219:1: rule__LVD2__Group__1 : rule__LVD2__Group__1__Impl rule__LVD2__Group__2 ;
    public final void rule__LVD2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2223:1: ( rule__LVD2__Group__1__Impl rule__LVD2__Group__2 )
            // InternalBDSL.g:2224:2: rule__LVD2__Group__1__Impl rule__LVD2__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__LVD2__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LVD2__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__1"


    // $ANTLR start "rule__LVD2__Group__1__Impl"
    // InternalBDSL.g:2231:1: rule__LVD2__Group__1__Impl : ( 'val' ) ;
    public final void rule__LVD2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2235:1: ( ( 'val' ) )
            // InternalBDSL.g:2236:1: ( 'val' )
            {
            // InternalBDSL.g:2236:1: ( 'val' )
            // InternalBDSL.g:2237:2: 'val'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getValKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getValKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__1__Impl"


    // $ANTLR start "rule__LVD2__Group__2"
    // InternalBDSL.g:2246:1: rule__LVD2__Group__2 : rule__LVD2__Group__2__Impl rule__LVD2__Group__3 ;
    public final void rule__LVD2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2250:1: ( rule__LVD2__Group__2__Impl rule__LVD2__Group__3 )
            // InternalBDSL.g:2251:2: rule__LVD2__Group__2__Impl rule__LVD2__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__LVD2__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LVD2__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__2"


    // $ANTLR start "rule__LVD2__Group__2__Impl"
    // InternalBDSL.g:2258:1: rule__LVD2__Group__2__Impl : ( ( rule__LVD2__NameAssignment_2 ) ) ;
    public final void rule__LVD2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2262:1: ( ( ( rule__LVD2__NameAssignment_2 ) ) )
            // InternalBDSL.g:2263:1: ( ( rule__LVD2__NameAssignment_2 ) )
            {
            // InternalBDSL.g:2263:1: ( ( rule__LVD2__NameAssignment_2 ) )
            // InternalBDSL.g:2264:2: ( rule__LVD2__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getNameAssignment_2()); 
            }
            // InternalBDSL.g:2265:2: ( rule__LVD2__NameAssignment_2 )
            // InternalBDSL.g:2265:3: rule__LVD2__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LVD2__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__2__Impl"


    // $ANTLR start "rule__LVD2__Group__3"
    // InternalBDSL.g:2273:1: rule__LVD2__Group__3 : rule__LVD2__Group__3__Impl rule__LVD2__Group__4 ;
    public final void rule__LVD2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2277:1: ( rule__LVD2__Group__3__Impl rule__LVD2__Group__4 )
            // InternalBDSL.g:2278:2: rule__LVD2__Group__3__Impl rule__LVD2__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__LVD2__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LVD2__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__3"


    // $ANTLR start "rule__LVD2__Group__3__Impl"
    // InternalBDSL.g:2285:1: rule__LVD2__Group__3__Impl : ( ':' ) ;
    public final void rule__LVD2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2289:1: ( ( ':' ) )
            // InternalBDSL.g:2290:1: ( ':' )
            {
            // InternalBDSL.g:2290:1: ( ':' )
            // InternalBDSL.g:2291:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getColonKeyword_3()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__3__Impl"


    // $ANTLR start "rule__LVD2__Group__4"
    // InternalBDSL.g:2300:1: rule__LVD2__Group__4 : rule__LVD2__Group__4__Impl rule__LVD2__Group__5 ;
    public final void rule__LVD2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2304:1: ( rule__LVD2__Group__4__Impl rule__LVD2__Group__5 )
            // InternalBDSL.g:2305:2: rule__LVD2__Group__4__Impl rule__LVD2__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__LVD2__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LVD2__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__4"


    // $ANTLR start "rule__LVD2__Group__4__Impl"
    // InternalBDSL.g:2312:1: rule__LVD2__Group__4__Impl : ( ( rule__LVD2__TypeAssignment_4 ) ) ;
    public final void rule__LVD2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2316:1: ( ( ( rule__LVD2__TypeAssignment_4 ) ) )
            // InternalBDSL.g:2317:1: ( ( rule__LVD2__TypeAssignment_4 ) )
            {
            // InternalBDSL.g:2317:1: ( ( rule__LVD2__TypeAssignment_4 ) )
            // InternalBDSL.g:2318:2: ( rule__LVD2__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getTypeAssignment_4()); 
            }
            // InternalBDSL.g:2319:2: ( rule__LVD2__TypeAssignment_4 )
            // InternalBDSL.g:2319:3: rule__LVD2__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LVD2__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__4__Impl"


    // $ANTLR start "rule__LVD2__Group__5"
    // InternalBDSL.g:2327:1: rule__LVD2__Group__5 : rule__LVD2__Group__5__Impl rule__LVD2__Group__6 ;
    public final void rule__LVD2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2331:1: ( rule__LVD2__Group__5__Impl rule__LVD2__Group__6 )
            // InternalBDSL.g:2332:2: rule__LVD2__Group__5__Impl rule__LVD2__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__LVD2__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LVD2__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__5"


    // $ANTLR start "rule__LVD2__Group__5__Impl"
    // InternalBDSL.g:2339:1: rule__LVD2__Group__5__Impl : ( '=' ) ;
    public final void rule__LVD2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2343:1: ( ( '=' ) )
            // InternalBDSL.g:2344:1: ( '=' )
            {
            // InternalBDSL.g:2344:1: ( '=' )
            // InternalBDSL.g:2345:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getEqualsSignKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getEqualsSignKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__5__Impl"


    // $ANTLR start "rule__LVD2__Group__6"
    // InternalBDSL.g:2354:1: rule__LVD2__Group__6 : rule__LVD2__Group__6__Impl rule__LVD2__Group__7 ;
    public final void rule__LVD2__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2358:1: ( rule__LVD2__Group__6__Impl rule__LVD2__Group__7 )
            // InternalBDSL.g:2359:2: rule__LVD2__Group__6__Impl rule__LVD2__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__LVD2__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LVD2__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__6"


    // $ANTLR start "rule__LVD2__Group__6__Impl"
    // InternalBDSL.g:2366:1: rule__LVD2__Group__6__Impl : ( '{' ) ;
    public final void rule__LVD2__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2370:1: ( ( '{' ) )
            // InternalBDSL.g:2371:1: ( '{' )
            {
            // InternalBDSL.g:2371:1: ( '{' )
            // InternalBDSL.g:2372:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getLeftCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__6__Impl"


    // $ANTLR start "rule__LVD2__Group__7"
    // InternalBDSL.g:2381:1: rule__LVD2__Group__7 : rule__LVD2__Group__7__Impl rule__LVD2__Group__8 ;
    public final void rule__LVD2__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2385:1: ( rule__LVD2__Group__7__Impl rule__LVD2__Group__8 )
            // InternalBDSL.g:2386:2: rule__LVD2__Group__7__Impl rule__LVD2__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__LVD2__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LVD2__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__7"


    // $ANTLR start "rule__LVD2__Group__7__Impl"
    // InternalBDSL.g:2393:1: rule__LVD2__Group__7__Impl : ( ( rule__LVD2__DefinitionAssignment_7 )* ) ;
    public final void rule__LVD2__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2397:1: ( ( ( rule__LVD2__DefinitionAssignment_7 )* ) )
            // InternalBDSL.g:2398:1: ( ( rule__LVD2__DefinitionAssignment_7 )* )
            {
            // InternalBDSL.g:2398:1: ( ( rule__LVD2__DefinitionAssignment_7 )* )
            // InternalBDSL.g:2399:2: ( rule__LVD2__DefinitionAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getDefinitionAssignment_7()); 
            }
            // InternalBDSL.g:2400:2: ( rule__LVD2__DefinitionAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==26||(LA20_0>=35 && LA20_0<=36)||LA20_0==38||LA20_0==44) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBDSL.g:2400:3: rule__LVD2__DefinitionAssignment_7
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__LVD2__DefinitionAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getDefinitionAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__7__Impl"


    // $ANTLR start "rule__LVD2__Group__8"
    // InternalBDSL.g:2408:1: rule__LVD2__Group__8 : rule__LVD2__Group__8__Impl ;
    public final void rule__LVD2__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2412:1: ( rule__LVD2__Group__8__Impl )
            // InternalBDSL.g:2413:2: rule__LVD2__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LVD2__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__8"


    // $ANTLR start "rule__LVD2__Group__8__Impl"
    // InternalBDSL.g:2419:1: rule__LVD2__Group__8__Impl : ( '}' ) ;
    public final void rule__LVD2__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2423:1: ( ( '}' ) )
            // InternalBDSL.g:2424:1: ( '}' )
            {
            // InternalBDSL.g:2424:1: ( '}' )
            // InternalBDSL.g:2425:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getRightCurlyBracketKeyword_8()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__Group__8__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group__0"
    // InternalBDSL.g:2435:1: rule__LocalVarDecl__Group__0 : rule__LocalVarDecl__Group__0__Impl rule__LocalVarDecl__Group__1 ;
    public final void rule__LocalVarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2439:1: ( rule__LocalVarDecl__Group__0__Impl rule__LocalVarDecl__Group__1 )
            // InternalBDSL.g:2440:2: rule__LocalVarDecl__Group__0__Impl rule__LocalVarDecl__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalVarDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group__0"


    // $ANTLR start "rule__LocalVarDecl__Group__0__Impl"
    // InternalBDSL.g:2447:1: rule__LocalVarDecl__Group__0__Impl : ( 'val' ) ;
    public final void rule__LocalVarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2451:1: ( ( 'val' ) )
            // InternalBDSL.g:2452:1: ( 'val' )
            {
            // InternalBDSL.g:2452:1: ( 'val' )
            // InternalBDSL.g:2453:2: 'val'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getValKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getValKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group__0__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group__1"
    // InternalBDSL.g:2462:1: rule__LocalVarDecl__Group__1 : rule__LocalVarDecl__Group__1__Impl rule__LocalVarDecl__Group__2 ;
    public final void rule__LocalVarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2466:1: ( rule__LocalVarDecl__Group__1__Impl rule__LocalVarDecl__Group__2 )
            // InternalBDSL.g:2467:2: rule__LocalVarDecl__Group__1__Impl rule__LocalVarDecl__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__LocalVarDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group__1"


    // $ANTLR start "rule__LocalVarDecl__Group__1__Impl"
    // InternalBDSL.g:2474:1: rule__LocalVarDecl__Group__1__Impl : ( () ) ;
    public final void rule__LocalVarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2478:1: ( ( () ) )
            // InternalBDSL.g:2479:1: ( () )
            {
            // InternalBDSL.g:2479:1: ( () )
            // InternalBDSL.g:2480:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getLocalVarDeclAction_1()); 
            }
            // InternalBDSL.g:2481:2: ()
            // InternalBDSL.g:2481:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getLocalVarDeclAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group__1__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group__2"
    // InternalBDSL.g:2489:1: rule__LocalVarDecl__Group__2 : rule__LocalVarDecl__Group__2__Impl ;
    public final void rule__LocalVarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2493:1: ( rule__LocalVarDecl__Group__2__Impl )
            // InternalBDSL.g:2494:2: rule__LocalVarDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group__2"


    // $ANTLR start "rule__LocalVarDecl__Group__2__Impl"
    // InternalBDSL.g:2500:1: rule__LocalVarDecl__Group__2__Impl : ( ( rule__LocalVarDecl__Group_2__0 ) ) ;
    public final void rule__LocalVarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2504:1: ( ( ( rule__LocalVarDecl__Group_2__0 ) ) )
            // InternalBDSL.g:2505:1: ( ( rule__LocalVarDecl__Group_2__0 ) )
            {
            // InternalBDSL.g:2505:1: ( ( rule__LocalVarDecl__Group_2__0 ) )
            // InternalBDSL.g:2506:2: ( rule__LocalVarDecl__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2()); 
            }
            // InternalBDSL.g:2507:2: ( rule__LocalVarDecl__Group_2__0 )
            // InternalBDSL.g:2507:3: rule__LocalVarDecl__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group__2__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2__0"
    // InternalBDSL.g:2516:1: rule__LocalVarDecl__Group_2__0 : rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1 ;
    public final void rule__LocalVarDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2520:1: ( rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1 )
            // InternalBDSL.g:2521:2: rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__LocalVarDecl__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__0"


    // $ANTLR start "rule__LocalVarDecl__Group_2__0__Impl"
    // InternalBDSL.g:2528:1: rule__LocalVarDecl__Group_2__0__Impl : ( ( rule__LocalVarDecl__NameAssignment_2_0 ) ) ;
    public final void rule__LocalVarDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2532:1: ( ( ( rule__LocalVarDecl__NameAssignment_2_0 ) ) )
            // InternalBDSL.g:2533:1: ( ( rule__LocalVarDecl__NameAssignment_2_0 ) )
            {
            // InternalBDSL.g:2533:1: ( ( rule__LocalVarDecl__NameAssignment_2_0 ) )
            // InternalBDSL.g:2534:2: ( rule__LocalVarDecl__NameAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getNameAssignment_2_0()); 
            }
            // InternalBDSL.g:2535:2: ( rule__LocalVarDecl__NameAssignment_2_0 )
            // InternalBDSL.g:2535:3: rule__LocalVarDecl__NameAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__NameAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getNameAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__0__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2__1"
    // InternalBDSL.g:2543:1: rule__LocalVarDecl__Group_2__1 : rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2 ;
    public final void rule__LocalVarDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2547:1: ( rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2 )
            // InternalBDSL.g:2548:2: rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__LocalVarDecl__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__1"


    // $ANTLR start "rule__LocalVarDecl__Group_2__1__Impl"
    // InternalBDSL.g:2555:1: rule__LocalVarDecl__Group_2__1__Impl : ( ( rule__LocalVarDecl__Group_2_1__0 )? ) ;
    public final void rule__LocalVarDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2559:1: ( ( ( rule__LocalVarDecl__Group_2_1__0 )? ) )
            // InternalBDSL.g:2560:1: ( ( rule__LocalVarDecl__Group_2_1__0 )? )
            {
            // InternalBDSL.g:2560:1: ( ( rule__LocalVarDecl__Group_2_1__0 )? )
            // InternalBDSL.g:2561:2: ( rule__LocalVarDecl__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_1()); 
            }
            // InternalBDSL.g:2562:2: ( rule__LocalVarDecl__Group_2_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBDSL.g:2562:3: rule__LocalVarDecl__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalVarDecl__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__1__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2__2"
    // InternalBDSL.g:2570:1: rule__LocalVarDecl__Group_2__2 : rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3 ;
    public final void rule__LocalVarDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2574:1: ( rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3 )
            // InternalBDSL.g:2575:2: rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3
            {
            pushFollow(FOLLOW_26);
            rule__LocalVarDecl__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__2"


    // $ANTLR start "rule__LocalVarDecl__Group_2__2__Impl"
    // InternalBDSL.g:2582:1: rule__LocalVarDecl__Group_2__2__Impl : ( ( rule__LocalVarDecl__Group_2_2__0 )? ) ;
    public final void rule__LocalVarDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2586:1: ( ( ( rule__LocalVarDecl__Group_2_2__0 )? ) )
            // InternalBDSL.g:2587:1: ( ( rule__LocalVarDecl__Group_2_2__0 )? )
            {
            // InternalBDSL.g:2587:1: ( ( rule__LocalVarDecl__Group_2_2__0 )? )
            // InternalBDSL.g:2588:2: ( rule__LocalVarDecl__Group_2_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_2()); 
            }
            // InternalBDSL.g:2589:2: ( rule__LocalVarDecl__Group_2_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=39 && LA22_0<=40)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBDSL.g:2589:3: rule__LocalVarDecl__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalVarDecl__Group_2_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__2__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2__3"
    // InternalBDSL.g:2597:1: rule__LocalVarDecl__Group_2__3 : rule__LocalVarDecl__Group_2__3__Impl ;
    public final void rule__LocalVarDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2601:1: ( rule__LocalVarDecl__Group_2__3__Impl )
            // InternalBDSL.g:2602:2: rule__LocalVarDecl__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__3"


    // $ANTLR start "rule__LocalVarDecl__Group_2__3__Impl"
    // InternalBDSL.g:2608:1: rule__LocalVarDecl__Group_2__3__Impl : ( ( rule__LocalVarDecl__Group_2_3__0 ) ) ;
    public final void rule__LocalVarDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2612:1: ( ( ( rule__LocalVarDecl__Group_2_3__0 ) ) )
            // InternalBDSL.g:2613:1: ( ( rule__LocalVarDecl__Group_2_3__0 ) )
            {
            // InternalBDSL.g:2613:1: ( ( rule__LocalVarDecl__Group_2_3__0 ) )
            // InternalBDSL.g:2614:2: ( rule__LocalVarDecl__Group_2_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_3()); 
            }
            // InternalBDSL.g:2615:2: ( rule__LocalVarDecl__Group_2_3__0 )
            // InternalBDSL.g:2615:3: rule__LocalVarDecl__Group_2_3__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getGroup_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__3__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_1__0"
    // InternalBDSL.g:2624:1: rule__LocalVarDecl__Group_2_1__0 : rule__LocalVarDecl__Group_2_1__0__Impl rule__LocalVarDecl__Group_2_1__1 ;
    public final void rule__LocalVarDecl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2628:1: ( rule__LocalVarDecl__Group_2_1__0__Impl rule__LocalVarDecl__Group_2_1__1 )
            // InternalBDSL.g:2629:2: rule__LocalVarDecl__Group_2_1__0__Impl rule__LocalVarDecl__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalVarDecl__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_1__0"


    // $ANTLR start "rule__LocalVarDecl__Group_2_1__0__Impl"
    // InternalBDSL.g:2636:1: rule__LocalVarDecl__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__LocalVarDecl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2640:1: ( ( '(' ) )
            // InternalBDSL.g:2641:1: ( '(' )
            {
            // InternalBDSL.g:2641:1: ( '(' )
            // InternalBDSL.g:2642:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getLeftParenthesisKeyword_2_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getLeftParenthesisKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_1__0__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_1__1"
    // InternalBDSL.g:2651:1: rule__LocalVarDecl__Group_2_1__1 : rule__LocalVarDecl__Group_2_1__1__Impl rule__LocalVarDecl__Group_2_1__2 ;
    public final void rule__LocalVarDecl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2655:1: ( rule__LocalVarDecl__Group_2_1__1__Impl rule__LocalVarDecl__Group_2_1__2 )
            // InternalBDSL.g:2656:2: rule__LocalVarDecl__Group_2_1__1__Impl rule__LocalVarDecl__Group_2_1__2
            {
            pushFollow(FOLLOW_21);
            rule__LocalVarDecl__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_1__1"


    // $ANTLR start "rule__LocalVarDecl__Group_2_1__1__Impl"
    // InternalBDSL.g:2663:1: rule__LocalVarDecl__Group_2_1__1__Impl : ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) ) ;
    public final void rule__LocalVarDecl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2667:1: ( ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) ) )
            // InternalBDSL.g:2668:1: ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) )
            {
            // InternalBDSL.g:2668:1: ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) )
            // InternalBDSL.g:2669:2: ( rule__LocalVarDecl__SigAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSigAssignment_2_1_1()); 
            }
            // InternalBDSL.g:2670:2: ( rule__LocalVarDecl__SigAssignment_2_1_1 )
            // InternalBDSL.g:2670:3: rule__LocalVarDecl__SigAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__SigAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getSigAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_1__1__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_1__2"
    // InternalBDSL.g:2678:1: rule__LocalVarDecl__Group_2_1__2 : rule__LocalVarDecl__Group_2_1__2__Impl ;
    public final void rule__LocalVarDecl__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2682:1: ( rule__LocalVarDecl__Group_2_1__2__Impl )
            // InternalBDSL.g:2683:2: rule__LocalVarDecl__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_1__2"


    // $ANTLR start "rule__LocalVarDecl__Group_2_1__2__Impl"
    // InternalBDSL.g:2689:1: rule__LocalVarDecl__Group_2_1__2__Impl : ( ')' ) ;
    public final void rule__LocalVarDecl__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2693:1: ( ( ')' ) )
            // InternalBDSL.g:2694:1: ( ')' )
            {
            // InternalBDSL.g:2694:1: ( ')' )
            // InternalBDSL.g:2695:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getRightParenthesisKeyword_2_1_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getRightParenthesisKeyword_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_1__2__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2__0"
    // InternalBDSL.g:2705:1: rule__LocalVarDecl__Group_2_2__0 : rule__LocalVarDecl__Group_2_2__0__Impl rule__LocalVarDecl__Group_2_2__1 ;
    public final void rule__LocalVarDecl__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2709:1: ( rule__LocalVarDecl__Group_2_2__0__Impl rule__LocalVarDecl__Group_2_2__1 )
            // InternalBDSL.g:2710:2: rule__LocalVarDecl__Group_2_2__0__Impl rule__LocalVarDecl__Group_2_2__1
            {
            pushFollow(FOLLOW_27);
            rule__LocalVarDecl__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2__0"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2__0__Impl"
    // InternalBDSL.g:2717:1: rule__LocalVarDecl__Group_2_2__0__Impl : ( ( rule__LocalVarDecl__Group_2_2_0__0 )? ) ;
    public final void rule__LocalVarDecl__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2721:1: ( ( ( rule__LocalVarDecl__Group_2_2_0__0 )? ) )
            // InternalBDSL.g:2722:1: ( ( rule__LocalVarDecl__Group_2_2_0__0 )? )
            {
            // InternalBDSL.g:2722:1: ( ( rule__LocalVarDecl__Group_2_2_0__0 )? )
            // InternalBDSL.g:2723:2: ( rule__LocalVarDecl__Group_2_2_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_2_0()); 
            }
            // InternalBDSL.g:2724:2: ( rule__LocalVarDecl__Group_2_2_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBDSL.g:2724:3: rule__LocalVarDecl__Group_2_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalVarDecl__Group_2_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getGroup_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2__0__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2__1"
    // InternalBDSL.g:2732:1: rule__LocalVarDecl__Group_2_2__1 : rule__LocalVarDecl__Group_2_2__1__Impl rule__LocalVarDecl__Group_2_2__2 ;
    public final void rule__LocalVarDecl__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2736:1: ( rule__LocalVarDecl__Group_2_2__1__Impl rule__LocalVarDecl__Group_2_2__2 )
            // InternalBDSL.g:2737:2: rule__LocalVarDecl__Group_2_2__1__Impl rule__LocalVarDecl__Group_2_2__2
            {
            pushFollow(FOLLOW_7);
            rule__LocalVarDecl__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2__1"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2__1__Impl"
    // InternalBDSL.g:2744:1: rule__LocalVarDecl__Group_2_2__1__Impl : ( ':' ) ;
    public final void rule__LocalVarDecl__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2748:1: ( ( ':' ) )
            // InternalBDSL.g:2749:1: ( ':' )
            {
            // InternalBDSL.g:2749:1: ( ':' )
            // InternalBDSL.g:2750:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getColonKeyword_2_2_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getColonKeyword_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2__1__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2__2"
    // InternalBDSL.g:2759:1: rule__LocalVarDecl__Group_2_2__2 : rule__LocalVarDecl__Group_2_2__2__Impl ;
    public final void rule__LocalVarDecl__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2763:1: ( rule__LocalVarDecl__Group_2_2__2__Impl )
            // InternalBDSL.g:2764:2: rule__LocalVarDecl__Group_2_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2__2"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2__2__Impl"
    // InternalBDSL.g:2770:1: rule__LocalVarDecl__Group_2_2__2__Impl : ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) ) ;
    public final void rule__LocalVarDecl__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2774:1: ( ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) ) )
            // InternalBDSL.g:2775:1: ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) )
            {
            // InternalBDSL.g:2775:1: ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) )
            // InternalBDSL.g:2776:2: ( rule__LocalVarDecl__TypeAssignment_2_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getTypeAssignment_2_2_2()); 
            }
            // InternalBDSL.g:2777:2: ( rule__LocalVarDecl__TypeAssignment_2_2_2 )
            // InternalBDSL.g:2777:3: rule__LocalVarDecl__TypeAssignment_2_2_2
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__TypeAssignment_2_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getTypeAssignment_2_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2__2__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0__0"
    // InternalBDSL.g:2786:1: rule__LocalVarDecl__Group_2_2_0__0 : rule__LocalVarDecl__Group_2_2_0__0__Impl rule__LocalVarDecl__Group_2_2_0__1 ;
    public final void rule__LocalVarDecl__Group_2_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2790:1: ( rule__LocalVarDecl__Group_2_2_0__0__Impl rule__LocalVarDecl__Group_2_2_0__1 )
            // InternalBDSL.g:2791:2: rule__LocalVarDecl__Group_2_2_0__0__Impl rule__LocalVarDecl__Group_2_2_0__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalVarDecl__Group_2_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0__0"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0__0__Impl"
    // InternalBDSL.g:2798:1: rule__LocalVarDecl__Group_2_2_0__0__Impl : ( '[' ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2802:1: ( ( '[' ) )
            // InternalBDSL.g:2803:1: ( '[' )
            {
            // InternalBDSL.g:2803:1: ( '[' )
            // InternalBDSL.g:2804:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getLeftSquareBracketKeyword_2_2_0_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getLeftSquareBracketKeyword_2_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0__0__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0__1"
    // InternalBDSL.g:2813:1: rule__LocalVarDecl__Group_2_2_0__1 : rule__LocalVarDecl__Group_2_2_0__1__Impl rule__LocalVarDecl__Group_2_2_0__2 ;
    public final void rule__LocalVarDecl__Group_2_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2817:1: ( rule__LocalVarDecl__Group_2_2_0__1__Impl rule__LocalVarDecl__Group_2_2_0__2 )
            // InternalBDSL.g:2818:2: rule__LocalVarDecl__Group_2_2_0__1__Impl rule__LocalVarDecl__Group_2_2_0__2
            {
            pushFollow(FOLLOW_28);
            rule__LocalVarDecl__Group_2_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0__1"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0__1__Impl"
    // InternalBDSL.g:2825:1: rule__LocalVarDecl__Group_2_2_0__1__Impl : ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2829:1: ( ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) ) )
            // InternalBDSL.g:2830:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) )
            {
            // InternalBDSL.g:2830:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) )
            // InternalBDSL.g:2831:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSiteArgsAssignment_2_2_0_1()); 
            }
            // InternalBDSL.g:2832:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 )
            // InternalBDSL.g:2832:3: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getSiteArgsAssignment_2_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0__1__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0__2"
    // InternalBDSL.g:2840:1: rule__LocalVarDecl__Group_2_2_0__2 : rule__LocalVarDecl__Group_2_2_0__2__Impl rule__LocalVarDecl__Group_2_2_0__3 ;
    public final void rule__LocalVarDecl__Group_2_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2844:1: ( rule__LocalVarDecl__Group_2_2_0__2__Impl rule__LocalVarDecl__Group_2_2_0__3 )
            // InternalBDSL.g:2845:2: rule__LocalVarDecl__Group_2_2_0__2__Impl rule__LocalVarDecl__Group_2_2_0__3
            {
            pushFollow(FOLLOW_28);
            rule__LocalVarDecl__Group_2_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_2_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0__2"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0__2__Impl"
    // InternalBDSL.g:2852:1: rule__LocalVarDecl__Group_2_2_0__2__Impl : ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2856:1: ( ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* ) )
            // InternalBDSL.g:2857:1: ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* )
            {
            // InternalBDSL.g:2857:1: ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* )
            // InternalBDSL.g:2858:2: ( rule__LocalVarDecl__Group_2_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_2_0_2()); 
            }
            // InternalBDSL.g:2859:2: ( rule__LocalVarDecl__Group_2_2_0_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBDSL.g:2859:3: rule__LocalVarDecl__Group_2_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__LocalVarDecl__Group_2_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getGroup_2_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0__2__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0__3"
    // InternalBDSL.g:2867:1: rule__LocalVarDecl__Group_2_2_0__3 : rule__LocalVarDecl__Group_2_2_0__3__Impl ;
    public final void rule__LocalVarDecl__Group_2_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2871:1: ( rule__LocalVarDecl__Group_2_2_0__3__Impl )
            // InternalBDSL.g:2872:2: rule__LocalVarDecl__Group_2_2_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0__3"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0__3__Impl"
    // InternalBDSL.g:2878:1: rule__LocalVarDecl__Group_2_2_0__3__Impl : ( ']' ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2882:1: ( ( ']' ) )
            // InternalBDSL.g:2883:1: ( ']' )
            {
            // InternalBDSL.g:2883:1: ( ']' )
            // InternalBDSL.g:2884:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getRightSquareBracketKeyword_2_2_0_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getRightSquareBracketKeyword_2_2_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0__3__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0_2__0"
    // InternalBDSL.g:2894:1: rule__LocalVarDecl__Group_2_2_0_2__0 : rule__LocalVarDecl__Group_2_2_0_2__0__Impl rule__LocalVarDecl__Group_2_2_0_2__1 ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2898:1: ( rule__LocalVarDecl__Group_2_2_0_2__0__Impl rule__LocalVarDecl__Group_2_2_0_2__1 )
            // InternalBDSL.g:2899:2: rule__LocalVarDecl__Group_2_2_0_2__0__Impl rule__LocalVarDecl__Group_2_2_0_2__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalVarDecl__Group_2_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_2_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0_2__0"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0_2__0__Impl"
    // InternalBDSL.g:2906:1: rule__LocalVarDecl__Group_2_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2910:1: ( ( ',' ) )
            // InternalBDSL.g:2911:1: ( ',' )
            {
            // InternalBDSL.g:2911:1: ( ',' )
            // InternalBDSL.g:2912:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getCommaKeyword_2_2_0_2_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getCommaKeyword_2_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0_2__0__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0_2__1"
    // InternalBDSL.g:2921:1: rule__LocalVarDecl__Group_2_2_0_2__1 : rule__LocalVarDecl__Group_2_2_0_2__1__Impl ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2925:1: ( rule__LocalVarDecl__Group_2_2_0_2__1__Impl )
            // InternalBDSL.g:2926:2: rule__LocalVarDecl__Group_2_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_2_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0_2__1"


    // $ANTLR start "rule__LocalVarDecl__Group_2_2_0_2__1__Impl"
    // InternalBDSL.g:2932:1: rule__LocalVarDecl__Group_2_2_0_2__1__Impl : ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) ) ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2936:1: ( ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) ) )
            // InternalBDSL.g:2937:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) )
            {
            // InternalBDSL.g:2937:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) )
            // InternalBDSL.g:2938:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSiteArgsAssignment_2_2_0_2_1()); 
            }
            // InternalBDSL.g:2939:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 )
            // InternalBDSL.g:2939:3: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getSiteArgsAssignment_2_2_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_2_0_2__1__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_3__0"
    // InternalBDSL.g:2948:1: rule__LocalVarDecl__Group_2_3__0 : rule__LocalVarDecl__Group_2_3__0__Impl rule__LocalVarDecl__Group_2_3__1 ;
    public final void rule__LocalVarDecl__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2952:1: ( rule__LocalVarDecl__Group_2_3__0__Impl rule__LocalVarDecl__Group_2_3__1 )
            // InternalBDSL.g:2953:2: rule__LocalVarDecl__Group_2_3__0__Impl rule__LocalVarDecl__Group_2_3__1
            {
            pushFollow(FOLLOW_10);
            rule__LocalVarDecl__Group_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_3__0"


    // $ANTLR start "rule__LocalVarDecl__Group_2_3__0__Impl"
    // InternalBDSL.g:2960:1: rule__LocalVarDecl__Group_2_3__0__Impl : ( '=' ) ;
    public final void rule__LocalVarDecl__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2964:1: ( ( '=' ) )
            // InternalBDSL.g:2965:1: ( '=' )
            {
            // InternalBDSL.g:2965:1: ( '=' )
            // InternalBDSL.g:2966:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_2_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_3__0__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_3__1"
    // InternalBDSL.g:2975:1: rule__LocalVarDecl__Group_2_3__1 : rule__LocalVarDecl__Group_2_3__1__Impl rule__LocalVarDecl__Group_2_3__2 ;
    public final void rule__LocalVarDecl__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2979:1: ( rule__LocalVarDecl__Group_2_3__1__Impl rule__LocalVarDecl__Group_2_3__2 )
            // InternalBDSL.g:2980:2: rule__LocalVarDecl__Group_2_3__1__Impl rule__LocalVarDecl__Group_2_3__2
            {
            pushFollow(FOLLOW_24);
            rule__LocalVarDecl__Group_2_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_3__1"


    // $ANTLR start "rule__LocalVarDecl__Group_2_3__1__Impl"
    // InternalBDSL.g:2987:1: rule__LocalVarDecl__Group_2_3__1__Impl : ( '{' ) ;
    public final void rule__LocalVarDecl__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2991:1: ( ( '{' ) )
            // InternalBDSL.g:2992:1: ( '{' )
            {
            // InternalBDSL.g:2992:1: ( '{' )
            // InternalBDSL.g:2993:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getLeftCurlyBracketKeyword_2_3_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getLeftCurlyBracketKeyword_2_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_3__1__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_3__2"
    // InternalBDSL.g:3002:1: rule__LocalVarDecl__Group_2_3__2 : rule__LocalVarDecl__Group_2_3__2__Impl rule__LocalVarDecl__Group_2_3__3 ;
    public final void rule__LocalVarDecl__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3006:1: ( rule__LocalVarDecl__Group_2_3__2__Impl rule__LocalVarDecl__Group_2_3__3 )
            // InternalBDSL.g:3007:2: rule__LocalVarDecl__Group_2_3__2__Impl rule__LocalVarDecl__Group_2_3__3
            {
            pushFollow(FOLLOW_24);
            rule__LocalVarDecl__Group_2_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_3__2"


    // $ANTLR start "rule__LocalVarDecl__Group_2_3__2__Impl"
    // InternalBDSL.g:3014:1: rule__LocalVarDecl__Group_2_3__2__Impl : ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* ) ;
    public final void rule__LocalVarDecl__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3018:1: ( ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* ) )
            // InternalBDSL.g:3019:1: ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* )
            {
            // InternalBDSL.g:3019:1: ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* )
            // InternalBDSL.g:3020:2: ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getDefinitionAssignment_2_3_2()); 
            }
            // InternalBDSL.g:3021:2: ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==26||(LA25_0>=35 && LA25_0<=36)||LA25_0==38||LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBDSL.g:3021:3: rule__LocalVarDecl__DefinitionAssignment_2_3_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__LocalVarDecl__DefinitionAssignment_2_3_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getDefinitionAssignment_2_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_3__2__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2_3__3"
    // InternalBDSL.g:3029:1: rule__LocalVarDecl__Group_2_3__3 : rule__LocalVarDecl__Group_2_3__3__Impl ;
    public final void rule__LocalVarDecl__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3033:1: ( rule__LocalVarDecl__Group_2_3__3__Impl )
            // InternalBDSL.g:3034:2: rule__LocalVarDecl__Group_2_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_3__3"


    // $ANTLR start "rule__LocalVarDecl__Group_2_3__3__Impl"
    // InternalBDSL.g:3040:1: rule__LocalVarDecl__Group_2_3__3__Impl : ( '}' ) ;
    public final void rule__LocalVarDecl__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3044:1: ( ( '}' ) )
            // InternalBDSL.g:3045:1: ( '}' )
            {
            // InternalBDSL.g:3045:1: ( '}' )
            // InternalBDSL.g:3046:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getRightCurlyBracketKeyword_2_3_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getRightCurlyBracketKeyword_2_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2_3__3__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group__0"
    // InternalBDSL.g:3056:1: rule__LocalRuleDecl__Group__0 : rule__LocalRuleDecl__Group__0__Impl rule__LocalRuleDecl__Group__1 ;
    public final void rule__LocalRuleDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3060:1: ( rule__LocalRuleDecl__Group__0__Impl rule__LocalRuleDecl__Group__1 )
            // InternalBDSL.g:3061:2: rule__LocalRuleDecl__Group__0__Impl rule__LocalRuleDecl__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalRuleDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group__0"


    // $ANTLR start "rule__LocalRuleDecl__Group__0__Impl"
    // InternalBDSL.g:3068:1: rule__LocalRuleDecl__Group__0__Impl : ( 'react' ) ;
    public final void rule__LocalRuleDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3072:1: ( ( 'react' ) )
            // InternalBDSL.g:3073:1: ( 'react' )
            {
            // InternalBDSL.g:3073:1: ( 'react' )
            // InternalBDSL.g:3074:2: 'react'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getReactKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getReactKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group__0__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group__1"
    // InternalBDSL.g:3083:1: rule__LocalRuleDecl__Group__1 : rule__LocalRuleDecl__Group__1__Impl rule__LocalRuleDecl__Group__2 ;
    public final void rule__LocalRuleDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3087:1: ( rule__LocalRuleDecl__Group__1__Impl rule__LocalRuleDecl__Group__2 )
            // InternalBDSL.g:3088:2: rule__LocalRuleDecl__Group__1__Impl rule__LocalRuleDecl__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__LocalRuleDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group__1"


    // $ANTLR start "rule__LocalRuleDecl__Group__1__Impl"
    // InternalBDSL.g:3095:1: rule__LocalRuleDecl__Group__1__Impl : ( () ) ;
    public final void rule__LocalRuleDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3099:1: ( ( () ) )
            // InternalBDSL.g:3100:1: ( () )
            {
            // InternalBDSL.g:3100:1: ( () )
            // InternalBDSL.g:3101:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getLocalRuleDeclAction_1()); 
            }
            // InternalBDSL.g:3102:2: ()
            // InternalBDSL.g:3102:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getLocalRuleDeclAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group__1__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group__2"
    // InternalBDSL.g:3110:1: rule__LocalRuleDecl__Group__2 : rule__LocalRuleDecl__Group__2__Impl rule__LocalRuleDecl__Group__3 ;
    public final void rule__LocalRuleDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3114:1: ( rule__LocalRuleDecl__Group__2__Impl rule__LocalRuleDecl__Group__3 )
            // InternalBDSL.g:3115:2: rule__LocalRuleDecl__Group__2__Impl rule__LocalRuleDecl__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__LocalRuleDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group__2"


    // $ANTLR start "rule__LocalRuleDecl__Group__2__Impl"
    // InternalBDSL.g:3122:1: rule__LocalRuleDecl__Group__2__Impl : ( ( rule__LocalRuleDecl__NameAssignment_2 ) ) ;
    public final void rule__LocalRuleDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3126:1: ( ( ( rule__LocalRuleDecl__NameAssignment_2 ) ) )
            // InternalBDSL.g:3127:1: ( ( rule__LocalRuleDecl__NameAssignment_2 ) )
            {
            // InternalBDSL.g:3127:1: ( ( rule__LocalRuleDecl__NameAssignment_2 ) )
            // InternalBDSL.g:3128:2: ( rule__LocalRuleDecl__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getNameAssignment_2()); 
            }
            // InternalBDSL.g:3129:2: ( rule__LocalRuleDecl__NameAssignment_2 )
            // InternalBDSL.g:3129:3: rule__LocalRuleDecl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group__2__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group__3"
    // InternalBDSL.g:3137:1: rule__LocalRuleDecl__Group__3 : rule__LocalRuleDecl__Group__3__Impl rule__LocalRuleDecl__Group__4 ;
    public final void rule__LocalRuleDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3141:1: ( rule__LocalRuleDecl__Group__3__Impl rule__LocalRuleDecl__Group__4 )
            // InternalBDSL.g:3142:2: rule__LocalRuleDecl__Group__3__Impl rule__LocalRuleDecl__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__LocalRuleDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group__3"


    // $ANTLR start "rule__LocalRuleDecl__Group__3__Impl"
    // InternalBDSL.g:3149:1: rule__LocalRuleDecl__Group__3__Impl : ( ( rule__LocalRuleDecl__Group_3__0 )? ) ;
    public final void rule__LocalRuleDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3153:1: ( ( ( rule__LocalRuleDecl__Group_3__0 )? ) )
            // InternalBDSL.g:3154:1: ( ( rule__LocalRuleDecl__Group_3__0 )? )
            {
            // InternalBDSL.g:3154:1: ( ( rule__LocalRuleDecl__Group_3__0 )? )
            // InternalBDSL.g:3155:2: ( rule__LocalRuleDecl__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getGroup_3()); 
            }
            // InternalBDSL.g:3156:2: ( rule__LocalRuleDecl__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBDSL.g:3156:3: rule__LocalRuleDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalRuleDecl__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group__3__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group__4"
    // InternalBDSL.g:3164:1: rule__LocalRuleDecl__Group__4 : rule__LocalRuleDecl__Group__4__Impl ;
    public final void rule__LocalRuleDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3168:1: ( rule__LocalRuleDecl__Group__4__Impl )
            // InternalBDSL.g:3169:2: rule__LocalRuleDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group__4"


    // $ANTLR start "rule__LocalRuleDecl__Group__4__Impl"
    // InternalBDSL.g:3175:1: rule__LocalRuleDecl__Group__4__Impl : ( ( rule__LocalRuleDecl__Group_4__0 ) ) ;
    public final void rule__LocalRuleDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3179:1: ( ( ( rule__LocalRuleDecl__Group_4__0 ) ) )
            // InternalBDSL.g:3180:1: ( ( rule__LocalRuleDecl__Group_4__0 ) )
            {
            // InternalBDSL.g:3180:1: ( ( rule__LocalRuleDecl__Group_4__0 ) )
            // InternalBDSL.g:3181:2: ( rule__LocalRuleDecl__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getGroup_4()); 
            }
            // InternalBDSL.g:3182:2: ( rule__LocalRuleDecl__Group_4__0 )
            // InternalBDSL.g:3182:3: rule__LocalRuleDecl__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group__4__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group_3__0"
    // InternalBDSL.g:3191:1: rule__LocalRuleDecl__Group_3__0 : rule__LocalRuleDecl__Group_3__0__Impl rule__LocalRuleDecl__Group_3__1 ;
    public final void rule__LocalRuleDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3195:1: ( rule__LocalRuleDecl__Group_3__0__Impl rule__LocalRuleDecl__Group_3__1 )
            // InternalBDSL.g:3196:2: rule__LocalRuleDecl__Group_3__0__Impl rule__LocalRuleDecl__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalRuleDecl__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_3__0"


    // $ANTLR start "rule__LocalRuleDecl__Group_3__0__Impl"
    // InternalBDSL.g:3203:1: rule__LocalRuleDecl__Group_3__0__Impl : ( '(' ) ;
    public final void rule__LocalRuleDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3207:1: ( ( '(' ) )
            // InternalBDSL.g:3208:1: ( '(' )
            {
            // InternalBDSL.g:3208:1: ( '(' )
            // InternalBDSL.g:3209:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_3__0__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group_3__1"
    // InternalBDSL.g:3218:1: rule__LocalRuleDecl__Group_3__1 : rule__LocalRuleDecl__Group_3__1__Impl rule__LocalRuleDecl__Group_3__2 ;
    public final void rule__LocalRuleDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3222:1: ( rule__LocalRuleDecl__Group_3__1__Impl rule__LocalRuleDecl__Group_3__2 )
            // InternalBDSL.g:3223:2: rule__LocalRuleDecl__Group_3__1__Impl rule__LocalRuleDecl__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__LocalRuleDecl__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_3__1"


    // $ANTLR start "rule__LocalRuleDecl__Group_3__1__Impl"
    // InternalBDSL.g:3230:1: rule__LocalRuleDecl__Group_3__1__Impl : ( ( rule__LocalRuleDecl__SigAssignment_3_1 ) ) ;
    public final void rule__LocalRuleDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3234:1: ( ( ( rule__LocalRuleDecl__SigAssignment_3_1 ) ) )
            // InternalBDSL.g:3235:1: ( ( rule__LocalRuleDecl__SigAssignment_3_1 ) )
            {
            // InternalBDSL.g:3235:1: ( ( rule__LocalRuleDecl__SigAssignment_3_1 ) )
            // InternalBDSL.g:3236:2: ( rule__LocalRuleDecl__SigAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getSigAssignment_3_1()); 
            }
            // InternalBDSL.g:3237:2: ( rule__LocalRuleDecl__SigAssignment_3_1 )
            // InternalBDSL.g:3237:3: rule__LocalRuleDecl__SigAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__SigAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getSigAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_3__1__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group_3__2"
    // InternalBDSL.g:3245:1: rule__LocalRuleDecl__Group_3__2 : rule__LocalRuleDecl__Group_3__2__Impl ;
    public final void rule__LocalRuleDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3249:1: ( rule__LocalRuleDecl__Group_3__2__Impl )
            // InternalBDSL.g:3250:2: rule__LocalRuleDecl__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_3__2"


    // $ANTLR start "rule__LocalRuleDecl__Group_3__2__Impl"
    // InternalBDSL.g:3256:1: rule__LocalRuleDecl__Group_3__2__Impl : ( ')' ) ;
    public final void rule__LocalRuleDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3260:1: ( ( ')' ) )
            // InternalBDSL.g:3261:1: ( ')' )
            {
            // InternalBDSL.g:3261:1: ( ')' )
            // InternalBDSL.g:3262:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_3__2__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__0"
    // InternalBDSL.g:3272:1: rule__LocalRuleDecl__Group_4__0 : rule__LocalRuleDecl__Group_4__0__Impl rule__LocalRuleDecl__Group_4__1 ;
    public final void rule__LocalRuleDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3276:1: ( rule__LocalRuleDecl__Group_4__0__Impl rule__LocalRuleDecl__Group_4__1 )
            // InternalBDSL.g:3277:2: rule__LocalRuleDecl__Group_4__0__Impl rule__LocalRuleDecl__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__LocalRuleDecl__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__0"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__0__Impl"
    // InternalBDSL.g:3284:1: rule__LocalRuleDecl__Group_4__0__Impl : ( '=' ) ;
    public final void rule__LocalRuleDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3288:1: ( ( '=' ) )
            // InternalBDSL.g:3289:1: ( '=' )
            {
            // InternalBDSL.g:3289:1: ( '=' )
            // InternalBDSL.g:3290:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getEqualsSignKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__0__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__1"
    // InternalBDSL.g:3299:1: rule__LocalRuleDecl__Group_4__1 : rule__LocalRuleDecl__Group_4__1__Impl rule__LocalRuleDecl__Group_4__2 ;
    public final void rule__LocalRuleDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3303:1: ( rule__LocalRuleDecl__Group_4__1__Impl rule__LocalRuleDecl__Group_4__2 )
            // InternalBDSL.g:3304:2: rule__LocalRuleDecl__Group_4__1__Impl rule__LocalRuleDecl__Group_4__2
            {
            pushFollow(FOLLOW_31);
            rule__LocalRuleDecl__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__1"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__1__Impl"
    // InternalBDSL.g:3311:1: rule__LocalRuleDecl__Group_4__1__Impl : ( '{' ) ;
    public final void rule__LocalRuleDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3315:1: ( ( '{' ) )
            // InternalBDSL.g:3316:1: ( '{' )
            {
            // InternalBDSL.g:3316:1: ( '{' )
            // InternalBDSL.g:3317:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getLeftCurlyBracketKeyword_4_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getLeftCurlyBracketKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__1__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__2"
    // InternalBDSL.g:3326:1: rule__LocalRuleDecl__Group_4__2 : rule__LocalRuleDecl__Group_4__2__Impl rule__LocalRuleDecl__Group_4__3 ;
    public final void rule__LocalRuleDecl__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3330:1: ( rule__LocalRuleDecl__Group_4__2__Impl rule__LocalRuleDecl__Group_4__3 )
            // InternalBDSL.g:3331:2: rule__LocalRuleDecl__Group_4__2__Impl rule__LocalRuleDecl__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__LocalRuleDecl__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__2"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__2__Impl"
    // InternalBDSL.g:3338:1: rule__LocalRuleDecl__Group_4__2__Impl : ( ( rule__LocalRuleDecl__RedexAssignment_4_2 ) ) ;
    public final void rule__LocalRuleDecl__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3342:1: ( ( ( rule__LocalRuleDecl__RedexAssignment_4_2 ) ) )
            // InternalBDSL.g:3343:1: ( ( rule__LocalRuleDecl__RedexAssignment_4_2 ) )
            {
            // InternalBDSL.g:3343:1: ( ( rule__LocalRuleDecl__RedexAssignment_4_2 ) )
            // InternalBDSL.g:3344:2: ( rule__LocalRuleDecl__RedexAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getRedexAssignment_4_2()); 
            }
            // InternalBDSL.g:3345:2: ( rule__LocalRuleDecl__RedexAssignment_4_2 )
            // InternalBDSL.g:3345:3: rule__LocalRuleDecl__RedexAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__RedexAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getRedexAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__2__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__3"
    // InternalBDSL.g:3353:1: rule__LocalRuleDecl__Group_4__3 : rule__LocalRuleDecl__Group_4__3__Impl rule__LocalRuleDecl__Group_4__4 ;
    public final void rule__LocalRuleDecl__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3357:1: ( rule__LocalRuleDecl__Group_4__3__Impl rule__LocalRuleDecl__Group_4__4 )
            // InternalBDSL.g:3358:2: rule__LocalRuleDecl__Group_4__3__Impl rule__LocalRuleDecl__Group_4__4
            {
            pushFollow(FOLLOW_19);
            rule__LocalRuleDecl__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__3"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__3__Impl"
    // InternalBDSL.g:3365:1: rule__LocalRuleDecl__Group_4__3__Impl : ( '}' ) ;
    public final void rule__LocalRuleDecl__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3369:1: ( ( '}' ) )
            // InternalBDSL.g:3370:1: ( '}' )
            {
            // InternalBDSL.g:3370:1: ( '}' )
            // InternalBDSL.g:3371:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getRightCurlyBracketKeyword_4_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getRightCurlyBracketKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__3__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__4"
    // InternalBDSL.g:3380:1: rule__LocalRuleDecl__Group_4__4 : rule__LocalRuleDecl__Group_4__4__Impl rule__LocalRuleDecl__Group_4__5 ;
    public final void rule__LocalRuleDecl__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3384:1: ( rule__LocalRuleDecl__Group_4__4__Impl rule__LocalRuleDecl__Group_4__5 )
            // InternalBDSL.g:3385:2: rule__LocalRuleDecl__Group_4__4__Impl rule__LocalRuleDecl__Group_4__5
            {
            pushFollow(FOLLOW_10);
            rule__LocalRuleDecl__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_4__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__4"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__4__Impl"
    // InternalBDSL.g:3392:1: rule__LocalRuleDecl__Group_4__4__Impl : ( ',' ) ;
    public final void rule__LocalRuleDecl__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3396:1: ( ( ',' ) )
            // InternalBDSL.g:3397:1: ( ',' )
            {
            // InternalBDSL.g:3397:1: ( ',' )
            // InternalBDSL.g:3398:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getCommaKeyword_4_4()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getCommaKeyword_4_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__4__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__5"
    // InternalBDSL.g:3407:1: rule__LocalRuleDecl__Group_4__5 : rule__LocalRuleDecl__Group_4__5__Impl rule__LocalRuleDecl__Group_4__6 ;
    public final void rule__LocalRuleDecl__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3411:1: ( rule__LocalRuleDecl__Group_4__5__Impl rule__LocalRuleDecl__Group_4__6 )
            // InternalBDSL.g:3412:2: rule__LocalRuleDecl__Group_4__5__Impl rule__LocalRuleDecl__Group_4__6
            {
            pushFollow(FOLLOW_31);
            rule__LocalRuleDecl__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_4__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__5"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__5__Impl"
    // InternalBDSL.g:3419:1: rule__LocalRuleDecl__Group_4__5__Impl : ( '{' ) ;
    public final void rule__LocalRuleDecl__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3423:1: ( ( '{' ) )
            // InternalBDSL.g:3424:1: ( '{' )
            {
            // InternalBDSL.g:3424:1: ( '{' )
            // InternalBDSL.g:3425:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getLeftCurlyBracketKeyword_4_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getLeftCurlyBracketKeyword_4_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__5__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__6"
    // InternalBDSL.g:3434:1: rule__LocalRuleDecl__Group_4__6 : rule__LocalRuleDecl__Group_4__6__Impl rule__LocalRuleDecl__Group_4__7 ;
    public final void rule__LocalRuleDecl__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3438:1: ( rule__LocalRuleDecl__Group_4__6__Impl rule__LocalRuleDecl__Group_4__7 )
            // InternalBDSL.g:3439:2: rule__LocalRuleDecl__Group_4__6__Impl rule__LocalRuleDecl__Group_4__7
            {
            pushFollow(FOLLOW_15);
            rule__LocalRuleDecl__Group_4__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_4__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__6"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__6__Impl"
    // InternalBDSL.g:3446:1: rule__LocalRuleDecl__Group_4__6__Impl : ( ( rule__LocalRuleDecl__ReactumAssignment_4_6 ) ) ;
    public final void rule__LocalRuleDecl__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3450:1: ( ( ( rule__LocalRuleDecl__ReactumAssignment_4_6 ) ) )
            // InternalBDSL.g:3451:1: ( ( rule__LocalRuleDecl__ReactumAssignment_4_6 ) )
            {
            // InternalBDSL.g:3451:1: ( ( rule__LocalRuleDecl__ReactumAssignment_4_6 ) )
            // InternalBDSL.g:3452:2: ( rule__LocalRuleDecl__ReactumAssignment_4_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getReactumAssignment_4_6()); 
            }
            // InternalBDSL.g:3453:2: ( rule__LocalRuleDecl__ReactumAssignment_4_6 )
            // InternalBDSL.g:3453:3: rule__LocalRuleDecl__ReactumAssignment_4_6
            {
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__ReactumAssignment_4_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getReactumAssignment_4_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__6__Impl"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__7"
    // InternalBDSL.g:3461:1: rule__LocalRuleDecl__Group_4__7 : rule__LocalRuleDecl__Group_4__7__Impl ;
    public final void rule__LocalRuleDecl__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3465:1: ( rule__LocalRuleDecl__Group_4__7__Impl )
            // InternalBDSL.g:3466:2: rule__LocalRuleDecl__Group_4__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalRuleDecl__Group_4__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__7"


    // $ANTLR start "rule__LocalRuleDecl__Group_4__7__Impl"
    // InternalBDSL.g:3472:1: rule__LocalRuleDecl__Group_4__7__Impl : ( '}' ) ;
    public final void rule__LocalRuleDecl__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3476:1: ( ( '}' ) )
            // InternalBDSL.g:3477:1: ( '}' )
            {
            // InternalBDSL.g:3477:1: ( '}' )
            // InternalBDSL.g:3478:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getRightCurlyBracketKeyword_4_7()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getRightCurlyBracketKeyword_4_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__Group_4__7__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__0"
    // InternalBDSL.g:3488:1: rule__LocalPredicateDeclaration__Group__0 : rule__LocalPredicateDeclaration__Group__0__Impl rule__LocalPredicateDeclaration__Group__1 ;
    public final void rule__LocalPredicateDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3492:1: ( rule__LocalPredicateDeclaration__Group__0__Impl rule__LocalPredicateDeclaration__Group__1 )
            // InternalBDSL.g:3493:2: rule__LocalPredicateDeclaration__Group__0__Impl rule__LocalPredicateDeclaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalPredicateDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__0"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__0__Impl"
    // InternalBDSL.g:3500:1: rule__LocalPredicateDeclaration__Group__0__Impl : ( 'pred' ) ;
    public final void rule__LocalPredicateDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3504:1: ( ( 'pred' ) )
            // InternalBDSL.g:3505:1: ( 'pred' )
            {
            // InternalBDSL.g:3505:1: ( 'pred' )
            // InternalBDSL.g:3506:2: 'pred'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getPredKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getPredKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__0__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__1"
    // InternalBDSL.g:3515:1: rule__LocalPredicateDeclaration__Group__1 : rule__LocalPredicateDeclaration__Group__1__Impl rule__LocalPredicateDeclaration__Group__2 ;
    public final void rule__LocalPredicateDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3519:1: ( rule__LocalPredicateDeclaration__Group__1__Impl rule__LocalPredicateDeclaration__Group__2 )
            // InternalBDSL.g:3520:2: rule__LocalPredicateDeclaration__Group__1__Impl rule__LocalPredicateDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__LocalPredicateDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__1"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__1__Impl"
    // InternalBDSL.g:3527:1: rule__LocalPredicateDeclaration__Group__1__Impl : ( () ) ;
    public final void rule__LocalPredicateDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3531:1: ( ( () ) )
            // InternalBDSL.g:3532:1: ( () )
            {
            // InternalBDSL.g:3532:1: ( () )
            // InternalBDSL.g:3533:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getLocalPredicateDeclarationAction_1()); 
            }
            // InternalBDSL.g:3534:2: ()
            // InternalBDSL.g:3534:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getLocalPredicateDeclarationAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__1__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__2"
    // InternalBDSL.g:3542:1: rule__LocalPredicateDeclaration__Group__2 : rule__LocalPredicateDeclaration__Group__2__Impl rule__LocalPredicateDeclaration__Group__3 ;
    public final void rule__LocalPredicateDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3546:1: ( rule__LocalPredicateDeclaration__Group__2__Impl rule__LocalPredicateDeclaration__Group__3 )
            // InternalBDSL.g:3547:2: rule__LocalPredicateDeclaration__Group__2__Impl rule__LocalPredicateDeclaration__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__LocalPredicateDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__2"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__2__Impl"
    // InternalBDSL.g:3554:1: rule__LocalPredicateDeclaration__Group__2__Impl : ( ( rule__LocalPredicateDeclaration__NameAssignment_2 ) ) ;
    public final void rule__LocalPredicateDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3558:1: ( ( ( rule__LocalPredicateDeclaration__NameAssignment_2 ) ) )
            // InternalBDSL.g:3559:1: ( ( rule__LocalPredicateDeclaration__NameAssignment_2 ) )
            {
            // InternalBDSL.g:3559:1: ( ( rule__LocalPredicateDeclaration__NameAssignment_2 ) )
            // InternalBDSL.g:3560:2: ( rule__LocalPredicateDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getNameAssignment_2()); 
            }
            // InternalBDSL.g:3561:2: ( rule__LocalPredicateDeclaration__NameAssignment_2 )
            // InternalBDSL.g:3561:3: rule__LocalPredicateDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__2__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__3"
    // InternalBDSL.g:3569:1: rule__LocalPredicateDeclaration__Group__3 : rule__LocalPredicateDeclaration__Group__3__Impl rule__LocalPredicateDeclaration__Group__4 ;
    public final void rule__LocalPredicateDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3573:1: ( rule__LocalPredicateDeclaration__Group__3__Impl rule__LocalPredicateDeclaration__Group__4 )
            // InternalBDSL.g:3574:2: rule__LocalPredicateDeclaration__Group__3__Impl rule__LocalPredicateDeclaration__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__LocalPredicateDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__3"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__3__Impl"
    // InternalBDSL.g:3581:1: rule__LocalPredicateDeclaration__Group__3__Impl : ( ( rule__LocalPredicateDeclaration__Group_3__0 )? ) ;
    public final void rule__LocalPredicateDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3585:1: ( ( ( rule__LocalPredicateDeclaration__Group_3__0 )? ) )
            // InternalBDSL.g:3586:1: ( ( rule__LocalPredicateDeclaration__Group_3__0 )? )
            {
            // InternalBDSL.g:3586:1: ( ( rule__LocalPredicateDeclaration__Group_3__0 )? )
            // InternalBDSL.g:3587:2: ( rule__LocalPredicateDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getGroup_3()); 
            }
            // InternalBDSL.g:3588:2: ( rule__LocalPredicateDeclaration__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBDSL.g:3588:3: rule__LocalPredicateDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalPredicateDeclaration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__3__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__4"
    // InternalBDSL.g:3596:1: rule__LocalPredicateDeclaration__Group__4 : rule__LocalPredicateDeclaration__Group__4__Impl rule__LocalPredicateDeclaration__Group__5 ;
    public final void rule__LocalPredicateDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3600:1: ( rule__LocalPredicateDeclaration__Group__4__Impl rule__LocalPredicateDeclaration__Group__5 )
            // InternalBDSL.g:3601:2: rule__LocalPredicateDeclaration__Group__4__Impl rule__LocalPredicateDeclaration__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__LocalPredicateDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__4"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__4__Impl"
    // InternalBDSL.g:3608:1: rule__LocalPredicateDeclaration__Group__4__Impl : ( ( rule__LocalPredicateDeclaration__Group_4__0 )? ) ;
    public final void rule__LocalPredicateDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3612:1: ( ( ( rule__LocalPredicateDeclaration__Group_4__0 )? ) )
            // InternalBDSL.g:3613:1: ( ( rule__LocalPredicateDeclaration__Group_4__0 )? )
            {
            // InternalBDSL.g:3613:1: ( ( rule__LocalPredicateDeclaration__Group_4__0 )? )
            // InternalBDSL.g:3614:2: ( rule__LocalPredicateDeclaration__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getGroup_4()); 
            }
            // InternalBDSL.g:3615:2: ( rule__LocalPredicateDeclaration__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBDSL.g:3615:3: rule__LocalPredicateDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalPredicateDeclaration__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__4__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__5"
    // InternalBDSL.g:3623:1: rule__LocalPredicateDeclaration__Group__5 : rule__LocalPredicateDeclaration__Group__5__Impl rule__LocalPredicateDeclaration__Group__6 ;
    public final void rule__LocalPredicateDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3627:1: ( rule__LocalPredicateDeclaration__Group__5__Impl rule__LocalPredicateDeclaration__Group__6 )
            // InternalBDSL.g:3628:2: rule__LocalPredicateDeclaration__Group__5__Impl rule__LocalPredicateDeclaration__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__LocalPredicateDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__5"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__5__Impl"
    // InternalBDSL.g:3635:1: rule__LocalPredicateDeclaration__Group__5__Impl : ( '=' ) ;
    public final void rule__LocalPredicateDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3639:1: ( ( '=' ) )
            // InternalBDSL.g:3640:1: ( '=' )
            {
            // InternalBDSL.g:3640:1: ( '=' )
            // InternalBDSL.g:3641:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getEqualsSignKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getEqualsSignKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__5__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__6"
    // InternalBDSL.g:3650:1: rule__LocalPredicateDeclaration__Group__6 : rule__LocalPredicateDeclaration__Group__6__Impl rule__LocalPredicateDeclaration__Group__7 ;
    public final void rule__LocalPredicateDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3654:1: ( rule__LocalPredicateDeclaration__Group__6__Impl rule__LocalPredicateDeclaration__Group__7 )
            // InternalBDSL.g:3655:2: rule__LocalPredicateDeclaration__Group__6__Impl rule__LocalPredicateDeclaration__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__LocalPredicateDeclaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__6"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__6__Impl"
    // InternalBDSL.g:3662:1: rule__LocalPredicateDeclaration__Group__6__Impl : ( '{' ) ;
    public final void rule__LocalPredicateDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3666:1: ( ( '{' ) )
            // InternalBDSL.g:3667:1: ( '{' )
            {
            // InternalBDSL.g:3667:1: ( '{' )
            // InternalBDSL.g:3668:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getLeftCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__6__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__7"
    // InternalBDSL.g:3677:1: rule__LocalPredicateDeclaration__Group__7 : rule__LocalPredicateDeclaration__Group__7__Impl rule__LocalPredicateDeclaration__Group__8 ;
    public final void rule__LocalPredicateDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3681:1: ( rule__LocalPredicateDeclaration__Group__7__Impl rule__LocalPredicateDeclaration__Group__8 )
            // InternalBDSL.g:3682:2: rule__LocalPredicateDeclaration__Group__7__Impl rule__LocalPredicateDeclaration__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__LocalPredicateDeclaration__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__7"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__7__Impl"
    // InternalBDSL.g:3689:1: rule__LocalPredicateDeclaration__Group__7__Impl : ( ( rule__LocalPredicateDeclaration__DefinitionAssignment_7 ) ) ;
    public final void rule__LocalPredicateDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3693:1: ( ( ( rule__LocalPredicateDeclaration__DefinitionAssignment_7 ) ) )
            // InternalBDSL.g:3694:1: ( ( rule__LocalPredicateDeclaration__DefinitionAssignment_7 ) )
            {
            // InternalBDSL.g:3694:1: ( ( rule__LocalPredicateDeclaration__DefinitionAssignment_7 ) )
            // InternalBDSL.g:3695:2: ( rule__LocalPredicateDeclaration__DefinitionAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getDefinitionAssignment_7()); 
            }
            // InternalBDSL.g:3696:2: ( rule__LocalPredicateDeclaration__DefinitionAssignment_7 )
            // InternalBDSL.g:3696:3: rule__LocalPredicateDeclaration__DefinitionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__DefinitionAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getDefinitionAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__7__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__8"
    // InternalBDSL.g:3704:1: rule__LocalPredicateDeclaration__Group__8 : rule__LocalPredicateDeclaration__Group__8__Impl ;
    public final void rule__LocalPredicateDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3708:1: ( rule__LocalPredicateDeclaration__Group__8__Impl )
            // InternalBDSL.g:3709:2: rule__LocalPredicateDeclaration__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__8"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group__8__Impl"
    // InternalBDSL.g:3715:1: rule__LocalPredicateDeclaration__Group__8__Impl : ( '}' ) ;
    public final void rule__LocalPredicateDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3719:1: ( ( '}' ) )
            // InternalBDSL.g:3720:1: ( '}' )
            {
            // InternalBDSL.g:3720:1: ( '}' )
            // InternalBDSL.g:3721:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group__8__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group_3__0"
    // InternalBDSL.g:3731:1: rule__LocalPredicateDeclaration__Group_3__0 : rule__LocalPredicateDeclaration__Group_3__0__Impl rule__LocalPredicateDeclaration__Group_3__1 ;
    public final void rule__LocalPredicateDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3735:1: ( rule__LocalPredicateDeclaration__Group_3__0__Impl rule__LocalPredicateDeclaration__Group_3__1 )
            // InternalBDSL.g:3736:2: rule__LocalPredicateDeclaration__Group_3__0__Impl rule__LocalPredicateDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalPredicateDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group_3__0"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group_3__0__Impl"
    // InternalBDSL.g:3743:1: rule__LocalPredicateDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__LocalPredicateDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3747:1: ( ( '(' ) )
            // InternalBDSL.g:3748:1: ( '(' )
            {
            // InternalBDSL.g:3748:1: ( '(' )
            // InternalBDSL.g:3749:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group_3__1"
    // InternalBDSL.g:3758:1: rule__LocalPredicateDeclaration__Group_3__1 : rule__LocalPredicateDeclaration__Group_3__1__Impl rule__LocalPredicateDeclaration__Group_3__2 ;
    public final void rule__LocalPredicateDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3762:1: ( rule__LocalPredicateDeclaration__Group_3__1__Impl rule__LocalPredicateDeclaration__Group_3__2 )
            // InternalBDSL.g:3763:2: rule__LocalPredicateDeclaration__Group_3__1__Impl rule__LocalPredicateDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__LocalPredicateDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group_3__1"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group_3__1__Impl"
    // InternalBDSL.g:3770:1: rule__LocalPredicateDeclaration__Group_3__1__Impl : ( ( rule__LocalPredicateDeclaration__SigAssignment_3_1 ) ) ;
    public final void rule__LocalPredicateDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3774:1: ( ( ( rule__LocalPredicateDeclaration__SigAssignment_3_1 ) ) )
            // InternalBDSL.g:3775:1: ( ( rule__LocalPredicateDeclaration__SigAssignment_3_1 ) )
            {
            // InternalBDSL.g:3775:1: ( ( rule__LocalPredicateDeclaration__SigAssignment_3_1 ) )
            // InternalBDSL.g:3776:2: ( rule__LocalPredicateDeclaration__SigAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getSigAssignment_3_1()); 
            }
            // InternalBDSL.g:3777:2: ( rule__LocalPredicateDeclaration__SigAssignment_3_1 )
            // InternalBDSL.g:3777:3: rule__LocalPredicateDeclaration__SigAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__SigAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getSigAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group_3__2"
    // InternalBDSL.g:3785:1: rule__LocalPredicateDeclaration__Group_3__2 : rule__LocalPredicateDeclaration__Group_3__2__Impl ;
    public final void rule__LocalPredicateDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3789:1: ( rule__LocalPredicateDeclaration__Group_3__2__Impl )
            // InternalBDSL.g:3790:2: rule__LocalPredicateDeclaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group_3__2"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group_3__2__Impl"
    // InternalBDSL.g:3796:1: rule__LocalPredicateDeclaration__Group_3__2__Impl : ( ')' ) ;
    public final void rule__LocalPredicateDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3800:1: ( ( ')' ) )
            // InternalBDSL.g:3801:1: ( ')' )
            {
            // InternalBDSL.g:3801:1: ( ')' )
            // InternalBDSL.g:3802:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group_3__2__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group_4__0"
    // InternalBDSL.g:3812:1: rule__LocalPredicateDeclaration__Group_4__0 : rule__LocalPredicateDeclaration__Group_4__0__Impl rule__LocalPredicateDeclaration__Group_4__1 ;
    public final void rule__LocalPredicateDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3816:1: ( rule__LocalPredicateDeclaration__Group_4__0__Impl rule__LocalPredicateDeclaration__Group_4__1 )
            // InternalBDSL.g:3817:2: rule__LocalPredicateDeclaration__Group_4__0__Impl rule__LocalPredicateDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__LocalPredicateDeclaration__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group_4__0"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group_4__0__Impl"
    // InternalBDSL.g:3824:1: rule__LocalPredicateDeclaration__Group_4__0__Impl : ( ':' ) ;
    public final void rule__LocalPredicateDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3828:1: ( ( ':' ) )
            // InternalBDSL.g:3829:1: ( ':' )
            {
            // InternalBDSL.g:3829:1: ( ':' )
            // InternalBDSL.g:3830:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getColonKeyword_4_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getColonKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group_4__1"
    // InternalBDSL.g:3839:1: rule__LocalPredicateDeclaration__Group_4__1 : rule__LocalPredicateDeclaration__Group_4__1__Impl ;
    public final void rule__LocalPredicateDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3843:1: ( rule__LocalPredicateDeclaration__Group_4__1__Impl )
            // InternalBDSL.g:3844:2: rule__LocalPredicateDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group_4__1"


    // $ANTLR start "rule__LocalPredicateDeclaration__Group_4__1__Impl"
    // InternalBDSL.g:3850:1: rule__LocalPredicateDeclaration__Group_4__1__Impl : ( ( rule__LocalPredicateDeclaration__TypeAssignment_4_1 ) ) ;
    public final void rule__LocalPredicateDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3854:1: ( ( ( rule__LocalPredicateDeclaration__TypeAssignment_4_1 ) ) )
            // InternalBDSL.g:3855:1: ( ( rule__LocalPredicateDeclaration__TypeAssignment_4_1 ) )
            {
            // InternalBDSL.g:3855:1: ( ( rule__LocalPredicateDeclaration__TypeAssignment_4_1 ) )
            // InternalBDSL.g:3856:2: ( rule__LocalPredicateDeclaration__TypeAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getTypeAssignment_4_1()); 
            }
            // InternalBDSL.g:3857:2: ( rule__LocalPredicateDeclaration__TypeAssignment_4_1 )
            // InternalBDSL.g:3857:3: rule__LocalPredicateDeclaration__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalPredicateDeclaration__TypeAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getTypeAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__Barren__Group__0"
    // InternalBDSL.g:3866:1: rule__Barren__Group__0 : rule__Barren__Group__0__Impl rule__Barren__Group__1 ;
    public final void rule__Barren__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3870:1: ( rule__Barren__Group__0__Impl rule__Barren__Group__1 )
            // InternalBDSL.g:3871:2: rule__Barren__Group__0__Impl rule__Barren__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Barren__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Barren__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barren__Group__0"


    // $ANTLR start "rule__Barren__Group__0__Impl"
    // InternalBDSL.g:3878:1: rule__Barren__Group__0__Impl : ( () ) ;
    public final void rule__Barren__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3882:1: ( ( () ) )
            // InternalBDSL.g:3883:1: ( () )
            {
            // InternalBDSL.g:3883:1: ( () )
            // InternalBDSL.g:3884:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBarrenAccess().getBarrenAction_0()); 
            }
            // InternalBDSL.g:3885:2: ()
            // InternalBDSL.g:3885:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBarrenAccess().getBarrenAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barren__Group__0__Impl"


    // $ANTLR start "rule__Barren__Group__1"
    // InternalBDSL.g:3893:1: rule__Barren__Group__1 : rule__Barren__Group__1__Impl ;
    public final void rule__Barren__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3897:1: ( rule__Barren__Group__1__Impl )
            // InternalBDSL.g:3898:2: rule__Barren__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Barren__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barren__Group__1"


    // $ANTLR start "rule__Barren__Group__1__Impl"
    // InternalBDSL.g:3904:1: rule__Barren__Group__1__Impl : ( '1' ) ;
    public final void rule__Barren__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3908:1: ( ( '1' ) )
            // InternalBDSL.g:3909:1: ( '1' )
            {
            // InternalBDSL.g:3909:1: ( '1' )
            // InternalBDSL.g:3910:2: '1'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBarrenAccess().getDigitOneKeyword_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBarrenAccess().getDigitOneKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barren__Group__1__Impl"


    // $ANTLR start "rule__NodeExpressionCall__Group__0"
    // InternalBDSL.g:3920:1: rule__NodeExpressionCall__Group__0 : rule__NodeExpressionCall__Group__0__Impl rule__NodeExpressionCall__Group__1 ;
    public final void rule__NodeExpressionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3924:1: ( rule__NodeExpressionCall__Group__0__Impl rule__NodeExpressionCall__Group__1 )
            // InternalBDSL.g:3925:2: rule__NodeExpressionCall__Group__0__Impl rule__NodeExpressionCall__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__NodeExpressionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeExpressionCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__Group__0"


    // $ANTLR start "rule__NodeExpressionCall__Group__0__Impl"
    // InternalBDSL.g:3932:1: rule__NodeExpressionCall__Group__0__Impl : ( ( rule__NodeExpressionCall__ValueAssignment_0 ) ) ;
    public final void rule__NodeExpressionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3936:1: ( ( ( rule__NodeExpressionCall__ValueAssignment_0 ) ) )
            // InternalBDSL.g:3937:1: ( ( rule__NodeExpressionCall__ValueAssignment_0 ) )
            {
            // InternalBDSL.g:3937:1: ( ( rule__NodeExpressionCall__ValueAssignment_0 ) )
            // InternalBDSL.g:3938:2: ( rule__NodeExpressionCall__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getValueAssignment_0()); 
            }
            // InternalBDSL.g:3939:2: ( rule__NodeExpressionCall__ValueAssignment_0 )
            // InternalBDSL.g:3939:3: rule__NodeExpressionCall__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeExpressionCall__ValueAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeExpressionCallAccess().getValueAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__Group__0__Impl"


    // $ANTLR start "rule__NodeExpressionCall__Group__1"
    // InternalBDSL.g:3947:1: rule__NodeExpressionCall__Group__1 : rule__NodeExpressionCall__Group__1__Impl ;
    public final void rule__NodeExpressionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3951:1: ( rule__NodeExpressionCall__Group__1__Impl )
            // InternalBDSL.g:3952:2: rule__NodeExpressionCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeExpressionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__Group__1"


    // $ANTLR start "rule__NodeExpressionCall__Group__1__Impl"
    // InternalBDSL.g:3958:1: rule__NodeExpressionCall__Group__1__Impl : ( ( rule__NodeExpressionCall__Group_1__0 )? ) ;
    public final void rule__NodeExpressionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3962:1: ( ( ( rule__NodeExpressionCall__Group_1__0 )? ) )
            // InternalBDSL.g:3963:1: ( ( rule__NodeExpressionCall__Group_1__0 )? )
            {
            // InternalBDSL.g:3963:1: ( ( rule__NodeExpressionCall__Group_1__0 )? )
            // InternalBDSL.g:3964:2: ( rule__NodeExpressionCall__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getGroup_1()); 
            }
            // InternalBDSL.g:3965:2: ( rule__NodeExpressionCall__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBDSL.g:3965:3: rule__NodeExpressionCall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeExpressionCall__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeExpressionCallAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__Group__1__Impl"


    // $ANTLR start "rule__NodeExpressionCall__Group_1__0"
    // InternalBDSL.g:3974:1: rule__NodeExpressionCall__Group_1__0 : rule__NodeExpressionCall__Group_1__0__Impl rule__NodeExpressionCall__Group_1__1 ;
    public final void rule__NodeExpressionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3978:1: ( rule__NodeExpressionCall__Group_1__0__Impl rule__NodeExpressionCall__Group_1__1 )
            // InternalBDSL.g:3979:2: rule__NodeExpressionCall__Group_1__0__Impl rule__NodeExpressionCall__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__NodeExpressionCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeExpressionCall__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__Group_1__0"


    // $ANTLR start "rule__NodeExpressionCall__Group_1__0__Impl"
    // InternalBDSL.g:3986:1: rule__NodeExpressionCall__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeExpressionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3990:1: ( ( '[' ) )
            // InternalBDSL.g:3991:1: ( '[' )
            {
            // InternalBDSL.g:3991:1: ( '[' )
            // InternalBDSL.g:3992:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeExpressionCallAccess().getLeftSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__Group_1__0__Impl"


    // $ANTLR start "rule__NodeExpressionCall__Group_1__1"
    // InternalBDSL.g:4001:1: rule__NodeExpressionCall__Group_1__1 : rule__NodeExpressionCall__Group_1__1__Impl rule__NodeExpressionCall__Group_1__2 ;
    public final void rule__NodeExpressionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4005:1: ( rule__NodeExpressionCall__Group_1__1__Impl rule__NodeExpressionCall__Group_1__2 )
            // InternalBDSL.g:4006:2: rule__NodeExpressionCall__Group_1__1__Impl rule__NodeExpressionCall__Group_1__2
            {
            pushFollow(FOLLOW_35);
            rule__NodeExpressionCall__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeExpressionCall__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__Group_1__1"


    // $ANTLR start "rule__NodeExpressionCall__Group_1__1__Impl"
    // InternalBDSL.g:4013:1: rule__NodeExpressionCall__Group_1__1__Impl : ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* ) ;
    public final void rule__NodeExpressionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4017:1: ( ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* ) )
            // InternalBDSL.g:4018:1: ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* )
            {
            // InternalBDSL.g:4018:1: ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* )
            // InternalBDSL.g:4019:2: ( rule__NodeExpressionCall__LinksAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getLinksAssignment_1_1()); 
            }
            // InternalBDSL.g:4020:2: ( rule__NodeExpressionCall__LinksAssignment_1_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBDSL.g:4020:3: rule__NodeExpressionCall__LinksAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__NodeExpressionCall__LinksAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeExpressionCallAccess().getLinksAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__Group_1__1__Impl"


    // $ANTLR start "rule__NodeExpressionCall__Group_1__2"
    // InternalBDSL.g:4028:1: rule__NodeExpressionCall__Group_1__2 : rule__NodeExpressionCall__Group_1__2__Impl ;
    public final void rule__NodeExpressionCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4032:1: ( rule__NodeExpressionCall__Group_1__2__Impl )
            // InternalBDSL.g:4033:2: rule__NodeExpressionCall__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeExpressionCall__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__Group_1__2"


    // $ANTLR start "rule__NodeExpressionCall__Group_1__2__Impl"
    // InternalBDSL.g:4039:1: rule__NodeExpressionCall__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeExpressionCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4043:1: ( ( ']' ) )
            // InternalBDSL.g:4044:1: ( ']' )
            {
            // InternalBDSL.g:4044:1: ( ']' )
            // InternalBDSL.g:4045:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeExpressionCallAccess().getRightSquareBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__Group_1__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalBDSL.g:4055:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4059:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalBDSL.g:4060:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalBDSL.g:4067:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4071:1: ( ( ruleMultiplication ) )
            // InternalBDSL.g:4072:1: ( ruleMultiplication )
            {
            // InternalBDSL.g:4072:1: ( ruleMultiplication )
            // InternalBDSL.g:4073:2: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalBDSL.g:4082:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4086:1: ( rule__Addition__Group__1__Impl )
            // InternalBDSL.g:4087:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalBDSL.g:4093:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4097:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalBDSL.g:4098:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalBDSL.g:4098:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalBDSL.g:4099:2: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // InternalBDSL.g:4100:2: ( rule__Addition__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=11 && LA31_0<=13)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBDSL.g:4100:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalBDSL.g:4109:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4113:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalBDSL.g:4114:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalBDSL.g:4121:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Group_1_0__0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4125:1: ( ( ( rule__Addition__Group_1_0__0 ) ) )
            // InternalBDSL.g:4126:1: ( ( rule__Addition__Group_1_0__0 ) )
            {
            // InternalBDSL.g:4126:1: ( ( rule__Addition__Group_1_0__0 ) )
            // InternalBDSL.g:4127:2: ( rule__Addition__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }
            // InternalBDSL.g:4128:2: ( rule__Addition__Group_1_0__0 )
            // InternalBDSL.g:4128:3: rule__Addition__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalBDSL.g:4136:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4140:1: ( rule__Addition__Group_1__1__Impl )
            // InternalBDSL.g:4141:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalBDSL.g:4147:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4151:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalBDSL.g:4152:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalBDSL.g:4152:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalBDSL.g:4153:2: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // InternalBDSL.g:4154:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalBDSL.g:4154:3: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0__0"
    // InternalBDSL.g:4163:1: rule__Addition__Group_1_0__0 : rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 ;
    public final void rule__Addition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4167:1: ( rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 )
            // InternalBDSL.g:4168:2: rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1
            {
            pushFollow(FOLLOW_37);
            rule__Addition__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__0"


    // $ANTLR start "rule__Addition__Group_1_0__0__Impl"
    // InternalBDSL.g:4175:1: rule__Addition__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4179:1: ( ( () ) )
            // InternalBDSL.g:4180:1: ( () )
            {
            // InternalBDSL.g:4180:1: ( () )
            // InternalBDSL.g:4181:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0()); 
            }
            // InternalBDSL.g:4182:2: ()
            // InternalBDSL.g:4182:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0__1"
    // InternalBDSL.g:4190:1: rule__Addition__Group_1_0__1 : rule__Addition__Group_1_0__1__Impl ;
    public final void rule__Addition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4194:1: ( rule__Addition__Group_1_0__1__Impl )
            // InternalBDSL.g:4195:2: rule__Addition__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__1"


    // $ANTLR start "rule__Addition__Group_1_0__1__Impl"
    // InternalBDSL.g:4201:1: rule__Addition__Group_1_0__1__Impl : ( ( rule__Addition__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__Addition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4205:1: ( ( ( rule__Addition__OperatorAssignment_1_0_1 ) ) )
            // InternalBDSL.g:4206:1: ( ( rule__Addition__OperatorAssignment_1_0_1 ) )
            {
            // InternalBDSL.g:4206:1: ( ( rule__Addition__OperatorAssignment_1_0_1 ) )
            // InternalBDSL.g:4207:2: ( rule__Addition__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_0_1()); 
            }
            // InternalBDSL.g:4208:2: ( rule__Addition__OperatorAssignment_1_0_1 )
            // InternalBDSL.g:4208:3: rule__Addition__OperatorAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalBDSL.g:4217:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4221:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalBDSL.g:4222:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalBDSL.g:4229:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4233:1: ( ( rulePrimaryExpression ) )
            // InternalBDSL.g:4234:1: ( rulePrimaryExpression )
            {
            // InternalBDSL.g:4234:1: ( rulePrimaryExpression )
            // InternalBDSL.g:4235:2: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalBDSL.g:4244:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4248:1: ( rule__Multiplication__Group__1__Impl )
            // InternalBDSL.g:4249:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalBDSL.g:4255:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4259:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalBDSL.g:4260:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalBDSL.g:4260:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalBDSL.g:4261:2: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // InternalBDSL.g:4262:2: ( rule__Multiplication__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=14 && LA32_0<=16)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBDSL.g:4262:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalBDSL.g:4271:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4275:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalBDSL.g:4276:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalBDSL.g:4283:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Group_1_0__0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4287:1: ( ( ( rule__Multiplication__Group_1_0__0 ) ) )
            // InternalBDSL.g:4288:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            {
            // InternalBDSL.g:4288:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            // InternalBDSL.g:4289:2: ( rule__Multiplication__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }
            // InternalBDSL.g:4290:2: ( rule__Multiplication__Group_1_0__0 )
            // InternalBDSL.g:4290:3: rule__Multiplication__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalBDSL.g:4298:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4302:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalBDSL.g:4303:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalBDSL.g:4309:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4313:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalBDSL.g:4314:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalBDSL.g:4314:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalBDSL.g:4315:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // InternalBDSL.g:4316:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalBDSL.g:4316:3: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0__0"
    // InternalBDSL.g:4325:1: rule__Multiplication__Group_1_0__0 : rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 ;
    public final void rule__Multiplication__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4329:1: ( rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 )
            // InternalBDSL.g:4330:2: rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1
            {
            pushFollow(FOLLOW_39);
            rule__Multiplication__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0__0__Impl"
    // InternalBDSL.g:4337:1: rule__Multiplication__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4341:1: ( ( () ) )
            // InternalBDSL.g:4342:1: ( () )
            {
            // InternalBDSL.g:4342:1: ( () )
            // InternalBDSL.g:4343:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0()); 
            }
            // InternalBDSL.g:4344:2: ()
            // InternalBDSL.g:4344:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0__1"
    // InternalBDSL.g:4352:1: rule__Multiplication__Group_1_0__1 : rule__Multiplication__Group_1_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4356:1: ( rule__Multiplication__Group_1_0__1__Impl )
            // InternalBDSL.g:4357:2: rule__Multiplication__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0__1__Impl"
    // InternalBDSL.g:4363:1: rule__Multiplication__Group_1_0__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4367:1: ( ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) ) )
            // InternalBDSL.g:4368:1: ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) )
            {
            // InternalBDSL.g:4368:1: ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) )
            // InternalBDSL.g:4369:2: ( rule__Multiplication__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_0_1()); 
            }
            // InternalBDSL.g:4370:2: ( rule__Multiplication__OperatorAssignment_1_0_1 )
            // InternalBDSL.g:4370:3: rule__Multiplication__OperatorAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalBDSL.g:4379:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4383:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalBDSL.g:4384:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalBDSL.g:4391:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4395:1: ( ( '(' ) )
            // InternalBDSL.g:4396:1: ( '(' )
            {
            // InternalBDSL.g:4396:1: ( '(' )
            // InternalBDSL.g:4397:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalBDSL.g:4406:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4410:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalBDSL.g:4411:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalBDSL.g:4418:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleBigraphExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4422:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:4423:1: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:4423:1: ( ruleBigraphExpression )
            // InternalBDSL.g:4424:2: ruleBigraphExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getBigraphExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleBigraphExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getBigraphExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // InternalBDSL.g:4433:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4437:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalBDSL.g:4438:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // InternalBDSL.g:4444:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4448:1: ( ( ')' ) )
            // InternalBDSL.g:4449:1: ( ')' )
            {
            // InternalBDSL.g:4449:1: ( ')' )
            // InternalBDSL.g:4450:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__BRSDefinition__Group__0"
    // InternalBDSL.g:4460:1: rule__BRSDefinition__Group__0 : rule__BRSDefinition__Group__0__Impl rule__BRSDefinition__Group__1 ;
    public final void rule__BRSDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4464:1: ( rule__BRSDefinition__Group__0__Impl rule__BRSDefinition__Group__1 )
            // InternalBDSL.g:4465:2: rule__BRSDefinition__Group__0__Impl rule__BRSDefinition__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__BRSDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__0"


    // $ANTLR start "rule__BRSDefinition__Group__0__Impl"
    // InternalBDSL.g:4472:1: rule__BRSDefinition__Group__0__Impl : ( () ) ;
    public final void rule__BRSDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4476:1: ( ( () ) )
            // InternalBDSL.g:4477:1: ( () )
            {
            // InternalBDSL.g:4477:1: ( () )
            // InternalBDSL.g:4478:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getBRSDefinitionAction_0()); 
            }
            // InternalBDSL.g:4479:2: ()
            // InternalBDSL.g:4479:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getBRSDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__0__Impl"


    // $ANTLR start "rule__BRSDefinition__Group__1"
    // InternalBDSL.g:4487:1: rule__BRSDefinition__Group__1 : rule__BRSDefinition__Group__1__Impl rule__BRSDefinition__Group__2 ;
    public final void rule__BRSDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4491:1: ( rule__BRSDefinition__Group__1__Impl rule__BRSDefinition__Group__2 )
            // InternalBDSL.g:4492:2: rule__BRSDefinition__Group__1__Impl rule__BRSDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__BRSDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__1"


    // $ANTLR start "rule__BRSDefinition__Group__1__Impl"
    // InternalBDSL.g:4499:1: rule__BRSDefinition__Group__1__Impl : ( 'brs' ) ;
    public final void rule__BRSDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4503:1: ( ( 'brs' ) )
            // InternalBDSL.g:4504:1: ( 'brs' )
            {
            // InternalBDSL.g:4504:1: ( 'brs' )
            // InternalBDSL.g:4505:2: 'brs'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getBrsKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getBrsKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__1__Impl"


    // $ANTLR start "rule__BRSDefinition__Group__2"
    // InternalBDSL.g:4514:1: rule__BRSDefinition__Group__2 : rule__BRSDefinition__Group__2__Impl rule__BRSDefinition__Group__3 ;
    public final void rule__BRSDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4518:1: ( rule__BRSDefinition__Group__2__Impl rule__BRSDefinition__Group__3 )
            // InternalBDSL.g:4519:2: rule__BRSDefinition__Group__2__Impl rule__BRSDefinition__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__BRSDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__2"


    // $ANTLR start "rule__BRSDefinition__Group__2__Impl"
    // InternalBDSL.g:4526:1: rule__BRSDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__BRSDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4530:1: ( ( '{' ) )
            // InternalBDSL.g:4531:1: ( '{' )
            {
            // InternalBDSL.g:4531:1: ( '{' )
            // InternalBDSL.g:4532:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__2__Impl"


    // $ANTLR start "rule__BRSDefinition__Group__3"
    // InternalBDSL.g:4541:1: rule__BRSDefinition__Group__3 : rule__BRSDefinition__Group__3__Impl rule__BRSDefinition__Group__4 ;
    public final void rule__BRSDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4545:1: ( rule__BRSDefinition__Group__3__Impl rule__BRSDefinition__Group__4 )
            // InternalBDSL.g:4546:2: rule__BRSDefinition__Group__3__Impl rule__BRSDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__BRSDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__3"


    // $ANTLR start "rule__BRSDefinition__Group__3__Impl"
    // InternalBDSL.g:4553:1: rule__BRSDefinition__Group__3__Impl : ( ( rule__BRSDefinition__Group_3__0 ) ) ;
    public final void rule__BRSDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4557:1: ( ( ( rule__BRSDefinition__Group_3__0 ) ) )
            // InternalBDSL.g:4558:1: ( ( rule__BRSDefinition__Group_3__0 ) )
            {
            // InternalBDSL.g:4558:1: ( ( rule__BRSDefinition__Group_3__0 ) )
            // InternalBDSL.g:4559:2: ( rule__BRSDefinition__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getGroup_3()); 
            }
            // InternalBDSL.g:4560:2: ( rule__BRSDefinition__Group_3__0 )
            // InternalBDSL.g:4560:3: rule__BRSDefinition__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__3__Impl"


    // $ANTLR start "rule__BRSDefinition__Group__4"
    // InternalBDSL.g:4568:1: rule__BRSDefinition__Group__4 : rule__BRSDefinition__Group__4__Impl rule__BRSDefinition__Group__5 ;
    public final void rule__BRSDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4572:1: ( rule__BRSDefinition__Group__4__Impl rule__BRSDefinition__Group__5 )
            // InternalBDSL.g:4573:2: rule__BRSDefinition__Group__4__Impl rule__BRSDefinition__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__BRSDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__4"


    // $ANTLR start "rule__BRSDefinition__Group__4__Impl"
    // InternalBDSL.g:4580:1: rule__BRSDefinition__Group__4__Impl : ( ',' ) ;
    public final void rule__BRSDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4584:1: ( ( ',' ) )
            // InternalBDSL.g:4585:1: ( ',' )
            {
            // InternalBDSL.g:4585:1: ( ',' )
            // InternalBDSL.g:4586:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getCommaKeyword_4()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getCommaKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__4__Impl"


    // $ANTLR start "rule__BRSDefinition__Group__5"
    // InternalBDSL.g:4595:1: rule__BRSDefinition__Group__5 : rule__BRSDefinition__Group__5__Impl rule__BRSDefinition__Group__6 ;
    public final void rule__BRSDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4599:1: ( rule__BRSDefinition__Group__5__Impl rule__BRSDefinition__Group__6 )
            // InternalBDSL.g:4600:2: rule__BRSDefinition__Group__5__Impl rule__BRSDefinition__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__BRSDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__5"


    // $ANTLR start "rule__BRSDefinition__Group__5__Impl"
    // InternalBDSL.g:4607:1: rule__BRSDefinition__Group__5__Impl : ( ( rule__BRSDefinition__Group_5__0 ) ) ;
    public final void rule__BRSDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4611:1: ( ( ( rule__BRSDefinition__Group_5__0 ) ) )
            // InternalBDSL.g:4612:1: ( ( rule__BRSDefinition__Group_5__0 ) )
            {
            // InternalBDSL.g:4612:1: ( ( rule__BRSDefinition__Group_5__0 ) )
            // InternalBDSL.g:4613:2: ( rule__BRSDefinition__Group_5__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getGroup_5()); 
            }
            // InternalBDSL.g:4614:2: ( rule__BRSDefinition__Group_5__0 )
            // InternalBDSL.g:4614:3: rule__BRSDefinition__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_5__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__5__Impl"


    // $ANTLR start "rule__BRSDefinition__Group__6"
    // InternalBDSL.g:4622:1: rule__BRSDefinition__Group__6 : rule__BRSDefinition__Group__6__Impl rule__BRSDefinition__Group__7 ;
    public final void rule__BRSDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4626:1: ( rule__BRSDefinition__Group__6__Impl rule__BRSDefinition__Group__7 )
            // InternalBDSL.g:4627:2: rule__BRSDefinition__Group__6__Impl rule__BRSDefinition__Group__7
            {
            pushFollow(FOLLOW_44);
            rule__BRSDefinition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__6"


    // $ANTLR start "rule__BRSDefinition__Group__6__Impl"
    // InternalBDSL.g:4634:1: rule__BRSDefinition__Group__6__Impl : ( ',' ) ;
    public final void rule__BRSDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4638:1: ( ( ',' ) )
            // InternalBDSL.g:4639:1: ( ',' )
            {
            // InternalBDSL.g:4639:1: ( ',' )
            // InternalBDSL.g:4640:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getCommaKeyword_6()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getCommaKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__6__Impl"


    // $ANTLR start "rule__BRSDefinition__Group__7"
    // InternalBDSL.g:4649:1: rule__BRSDefinition__Group__7 : rule__BRSDefinition__Group__7__Impl rule__BRSDefinition__Group__8 ;
    public final void rule__BRSDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4653:1: ( rule__BRSDefinition__Group__7__Impl rule__BRSDefinition__Group__8 )
            // InternalBDSL.g:4654:2: rule__BRSDefinition__Group__7__Impl rule__BRSDefinition__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__BRSDefinition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__7"


    // $ANTLR start "rule__BRSDefinition__Group__7__Impl"
    // InternalBDSL.g:4661:1: rule__BRSDefinition__Group__7__Impl : ( ( rule__BRSDefinition__Group_7__0 ) ) ;
    public final void rule__BRSDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4665:1: ( ( ( rule__BRSDefinition__Group_7__0 ) ) )
            // InternalBDSL.g:4666:1: ( ( rule__BRSDefinition__Group_7__0 ) )
            {
            // InternalBDSL.g:4666:1: ( ( rule__BRSDefinition__Group_7__0 ) )
            // InternalBDSL.g:4667:2: ( rule__BRSDefinition__Group_7__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getGroup_7()); 
            }
            // InternalBDSL.g:4668:2: ( rule__BRSDefinition__Group_7__0 )
            // InternalBDSL.g:4668:3: rule__BRSDefinition__Group_7__0
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_7__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__7__Impl"


    // $ANTLR start "rule__BRSDefinition__Group__8"
    // InternalBDSL.g:4676:1: rule__BRSDefinition__Group__8 : rule__BRSDefinition__Group__8__Impl ;
    public final void rule__BRSDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4680:1: ( rule__BRSDefinition__Group__8__Impl )
            // InternalBDSL.g:4681:2: rule__BRSDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__8"


    // $ANTLR start "rule__BRSDefinition__Group__8__Impl"
    // InternalBDSL.g:4687:1: rule__BRSDefinition__Group__8__Impl : ( '}' ) ;
    public final void rule__BRSDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4691:1: ( ( '}' ) )
            // InternalBDSL.g:4692:1: ( '}' )
            {
            // InternalBDSL.g:4692:1: ( '}' )
            // InternalBDSL.g:4693:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group__8__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_3__0"
    // InternalBDSL.g:4703:1: rule__BRSDefinition__Group_3__0 : rule__BRSDefinition__Group_3__0__Impl rule__BRSDefinition__Group_3__1 ;
    public final void rule__BRSDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4707:1: ( rule__BRSDefinition__Group_3__0__Impl rule__BRSDefinition__Group_3__1 )
            // InternalBDSL.g:4708:2: rule__BRSDefinition__Group_3__0__Impl rule__BRSDefinition__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__BRSDefinition__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3__0"


    // $ANTLR start "rule__BRSDefinition__Group_3__0__Impl"
    // InternalBDSL.g:4715:1: rule__BRSDefinition__Group_3__0__Impl : ( 'agents' ) ;
    public final void rule__BRSDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4719:1: ( ( 'agents' ) )
            // InternalBDSL.g:4720:1: ( 'agents' )
            {
            // InternalBDSL.g:4720:1: ( 'agents' )
            // InternalBDSL.g:4721:2: 'agents'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getAgentsKeyword_3_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getAgentsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_3__1"
    // InternalBDSL.g:4730:1: rule__BRSDefinition__Group_3__1 : rule__BRSDefinition__Group_3__1__Impl rule__BRSDefinition__Group_3__2 ;
    public final void rule__BRSDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4734:1: ( rule__BRSDefinition__Group_3__1__Impl rule__BRSDefinition__Group_3__2 )
            // InternalBDSL.g:4735:2: rule__BRSDefinition__Group_3__1__Impl rule__BRSDefinition__Group_3__2
            {
            pushFollow(FOLLOW_34);
            rule__BRSDefinition__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3__1"


    // $ANTLR start "rule__BRSDefinition__Group_3__1__Impl"
    // InternalBDSL.g:4742:1: rule__BRSDefinition__Group_3__1__Impl : ( '=' ) ;
    public final void rule__BRSDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4746:1: ( ( '=' ) )
            // InternalBDSL.g:4747:1: ( '=' )
            {
            // InternalBDSL.g:4747:1: ( '=' )
            // InternalBDSL.g:4748:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getEqualsSignKeyword_3_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getEqualsSignKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_3__2"
    // InternalBDSL.g:4757:1: rule__BRSDefinition__Group_3__2 : rule__BRSDefinition__Group_3__2__Impl ;
    public final void rule__BRSDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4761:1: ( rule__BRSDefinition__Group_3__2__Impl )
            // InternalBDSL.g:4762:2: rule__BRSDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3__2"


    // $ANTLR start "rule__BRSDefinition__Group_3__2__Impl"
    // InternalBDSL.g:4768:1: rule__BRSDefinition__Group_3__2__Impl : ( ( rule__BRSDefinition__Group_3_2__0 )? ) ;
    public final void rule__BRSDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4772:1: ( ( ( rule__BRSDefinition__Group_3_2__0 )? ) )
            // InternalBDSL.g:4773:1: ( ( rule__BRSDefinition__Group_3_2__0 )? )
            {
            // InternalBDSL.g:4773:1: ( ( rule__BRSDefinition__Group_3_2__0 )? )
            // InternalBDSL.g:4774:2: ( rule__BRSDefinition__Group_3_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getGroup_3_2()); 
            }
            // InternalBDSL.g:4775:2: ( rule__BRSDefinition__Group_3_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBDSL.g:4775:3: rule__BRSDefinition__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BRSDefinition__Group_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_3_2__0"
    // InternalBDSL.g:4784:1: rule__BRSDefinition__Group_3_2__0 : rule__BRSDefinition__Group_3_2__0__Impl rule__BRSDefinition__Group_3_2__1 ;
    public final void rule__BRSDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4788:1: ( rule__BRSDefinition__Group_3_2__0__Impl rule__BRSDefinition__Group_3_2__1 )
            // InternalBDSL.g:4789:2: rule__BRSDefinition__Group_3_2__0__Impl rule__BRSDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_45);
            rule__BRSDefinition__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2__0"


    // $ANTLR start "rule__BRSDefinition__Group_3_2__0__Impl"
    // InternalBDSL.g:4796:1: rule__BRSDefinition__Group_3_2__0__Impl : ( '[' ) ;
    public final void rule__BRSDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4800:1: ( ( '[' ) )
            // InternalBDSL.g:4801:1: ( '[' )
            {
            // InternalBDSL.g:4801:1: ( '[' )
            // InternalBDSL.g:4802:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getLeftSquareBracketKeyword_3_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getLeftSquareBracketKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_3_2__1"
    // InternalBDSL.g:4811:1: rule__BRSDefinition__Group_3_2__1 : rule__BRSDefinition__Group_3_2__1__Impl rule__BRSDefinition__Group_3_2__2 ;
    public final void rule__BRSDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4815:1: ( rule__BRSDefinition__Group_3_2__1__Impl rule__BRSDefinition__Group_3_2__2 )
            // InternalBDSL.g:4816:2: rule__BRSDefinition__Group_3_2__1__Impl rule__BRSDefinition__Group_3_2__2
            {
            pushFollow(FOLLOW_45);
            rule__BRSDefinition__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_3_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2__1"


    // $ANTLR start "rule__BRSDefinition__Group_3_2__1__Impl"
    // InternalBDSL.g:4823:1: rule__BRSDefinition__Group_3_2__1__Impl : ( ( rule__BRSDefinition__AgentsAssignment_3_2_1 )? ) ;
    public final void rule__BRSDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4827:1: ( ( ( rule__BRSDefinition__AgentsAssignment_3_2_1 )? ) )
            // InternalBDSL.g:4828:1: ( ( rule__BRSDefinition__AgentsAssignment_3_2_1 )? )
            {
            // InternalBDSL.g:4828:1: ( ( rule__BRSDefinition__AgentsAssignment_3_2_1 )? )
            // InternalBDSL.g:4829:2: ( rule__BRSDefinition__AgentsAssignment_3_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getAgentsAssignment_3_2_1()); 
            }
            // InternalBDSL.g:4830:2: ( rule__BRSDefinition__AgentsAssignment_3_2_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBDSL.g:4830:3: rule__BRSDefinition__AgentsAssignment_3_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BRSDefinition__AgentsAssignment_3_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getAgentsAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_3_2__2"
    // InternalBDSL.g:4838:1: rule__BRSDefinition__Group_3_2__2 : rule__BRSDefinition__Group_3_2__2__Impl rule__BRSDefinition__Group_3_2__3 ;
    public final void rule__BRSDefinition__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4842:1: ( rule__BRSDefinition__Group_3_2__2__Impl rule__BRSDefinition__Group_3_2__3 )
            // InternalBDSL.g:4843:2: rule__BRSDefinition__Group_3_2__2__Impl rule__BRSDefinition__Group_3_2__3
            {
            pushFollow(FOLLOW_45);
            rule__BRSDefinition__Group_3_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_3_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2__2"


    // $ANTLR start "rule__BRSDefinition__Group_3_2__2__Impl"
    // InternalBDSL.g:4850:1: rule__BRSDefinition__Group_3_2__2__Impl : ( ( rule__BRSDefinition__Group_3_2_2__0 )* ) ;
    public final void rule__BRSDefinition__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4854:1: ( ( ( rule__BRSDefinition__Group_3_2_2__0 )* ) )
            // InternalBDSL.g:4855:1: ( ( rule__BRSDefinition__Group_3_2_2__0 )* )
            {
            // InternalBDSL.g:4855:1: ( ( rule__BRSDefinition__Group_3_2_2__0 )* )
            // InternalBDSL.g:4856:2: ( rule__BRSDefinition__Group_3_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getGroup_3_2_2()); 
            }
            // InternalBDSL.g:4857:2: ( rule__BRSDefinition__Group_3_2_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBDSL.g:4857:3: rule__BRSDefinition__Group_3_2_2__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__BRSDefinition__Group_3_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getGroup_3_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2__2__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_3_2__3"
    // InternalBDSL.g:4865:1: rule__BRSDefinition__Group_3_2__3 : rule__BRSDefinition__Group_3_2__3__Impl ;
    public final void rule__BRSDefinition__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4869:1: ( rule__BRSDefinition__Group_3_2__3__Impl )
            // InternalBDSL.g:4870:2: rule__BRSDefinition__Group_3_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_3_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2__3"


    // $ANTLR start "rule__BRSDefinition__Group_3_2__3__Impl"
    // InternalBDSL.g:4876:1: rule__BRSDefinition__Group_3_2__3__Impl : ( ']' ) ;
    public final void rule__BRSDefinition__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4880:1: ( ( ']' ) )
            // InternalBDSL.g:4881:1: ( ']' )
            {
            // InternalBDSL.g:4881:1: ( ']' )
            // InternalBDSL.g:4882:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getRightSquareBracketKeyword_3_2_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getRightSquareBracketKeyword_3_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2__3__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_3_2_2__0"
    // InternalBDSL.g:4892:1: rule__BRSDefinition__Group_3_2_2__0 : rule__BRSDefinition__Group_3_2_2__0__Impl rule__BRSDefinition__Group_3_2_2__1 ;
    public final void rule__BRSDefinition__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4896:1: ( rule__BRSDefinition__Group_3_2_2__0__Impl rule__BRSDefinition__Group_3_2_2__1 )
            // InternalBDSL.g:4897:2: rule__BRSDefinition__Group_3_2_2__0__Impl rule__BRSDefinition__Group_3_2_2__1
            {
            pushFollow(FOLLOW_46);
            rule__BRSDefinition__Group_3_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_3_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2_2__0"


    // $ANTLR start "rule__BRSDefinition__Group_3_2_2__0__Impl"
    // InternalBDSL.g:4904:1: rule__BRSDefinition__Group_3_2_2__0__Impl : ( ',' ) ;
    public final void rule__BRSDefinition__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4908:1: ( ( ',' ) )
            // InternalBDSL.g:4909:1: ( ',' )
            {
            // InternalBDSL.g:4909:1: ( ',' )
            // InternalBDSL.g:4910:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getCommaKeyword_3_2_2_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getCommaKeyword_3_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2_2__0__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_3_2_2__1"
    // InternalBDSL.g:4919:1: rule__BRSDefinition__Group_3_2_2__1 : rule__BRSDefinition__Group_3_2_2__1__Impl ;
    public final void rule__BRSDefinition__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4923:1: ( rule__BRSDefinition__Group_3_2_2__1__Impl )
            // InternalBDSL.g:4924:2: rule__BRSDefinition__Group_3_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_3_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2_2__1"


    // $ANTLR start "rule__BRSDefinition__Group_3_2_2__1__Impl"
    // InternalBDSL.g:4930:1: rule__BRSDefinition__Group_3_2_2__1__Impl : ( ( rule__BRSDefinition__AgentsAssignment_3_2_2_1 ) ) ;
    public final void rule__BRSDefinition__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4934:1: ( ( ( rule__BRSDefinition__AgentsAssignment_3_2_2_1 ) ) )
            // InternalBDSL.g:4935:1: ( ( rule__BRSDefinition__AgentsAssignment_3_2_2_1 ) )
            {
            // InternalBDSL.g:4935:1: ( ( rule__BRSDefinition__AgentsAssignment_3_2_2_1 ) )
            // InternalBDSL.g:4936:2: ( rule__BRSDefinition__AgentsAssignment_3_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getAgentsAssignment_3_2_2_1()); 
            }
            // InternalBDSL.g:4937:2: ( rule__BRSDefinition__AgentsAssignment_3_2_2_1 )
            // InternalBDSL.g:4937:3: rule__BRSDefinition__AgentsAssignment_3_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__AgentsAssignment_3_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getAgentsAssignment_3_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_3_2_2__1__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_5__0"
    // InternalBDSL.g:4946:1: rule__BRSDefinition__Group_5__0 : rule__BRSDefinition__Group_5__0__Impl rule__BRSDefinition__Group_5__1 ;
    public final void rule__BRSDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4950:1: ( rule__BRSDefinition__Group_5__0__Impl rule__BRSDefinition__Group_5__1 )
            // InternalBDSL.g:4951:2: rule__BRSDefinition__Group_5__0__Impl rule__BRSDefinition__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__BRSDefinition__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5__0"


    // $ANTLR start "rule__BRSDefinition__Group_5__0__Impl"
    // InternalBDSL.g:4958:1: rule__BRSDefinition__Group_5__0__Impl : ( 'rules' ) ;
    public final void rule__BRSDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4962:1: ( ( 'rules' ) )
            // InternalBDSL.g:4963:1: ( 'rules' )
            {
            // InternalBDSL.g:4963:1: ( 'rules' )
            // InternalBDSL.g:4964:2: 'rules'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getRulesKeyword_5_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getRulesKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_5__1"
    // InternalBDSL.g:4973:1: rule__BRSDefinition__Group_5__1 : rule__BRSDefinition__Group_5__1__Impl rule__BRSDefinition__Group_5__2 ;
    public final void rule__BRSDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4977:1: ( rule__BRSDefinition__Group_5__1__Impl rule__BRSDefinition__Group_5__2 )
            // InternalBDSL.g:4978:2: rule__BRSDefinition__Group_5__1__Impl rule__BRSDefinition__Group_5__2
            {
            pushFollow(FOLLOW_34);
            rule__BRSDefinition__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5__1"


    // $ANTLR start "rule__BRSDefinition__Group_5__1__Impl"
    // InternalBDSL.g:4985:1: rule__BRSDefinition__Group_5__1__Impl : ( '=' ) ;
    public final void rule__BRSDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4989:1: ( ( '=' ) )
            // InternalBDSL.g:4990:1: ( '=' )
            {
            // InternalBDSL.g:4990:1: ( '=' )
            // InternalBDSL.g:4991:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getEqualsSignKeyword_5_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getEqualsSignKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_5__2"
    // InternalBDSL.g:5000:1: rule__BRSDefinition__Group_5__2 : rule__BRSDefinition__Group_5__2__Impl ;
    public final void rule__BRSDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5004:1: ( rule__BRSDefinition__Group_5__2__Impl )
            // InternalBDSL.g:5005:2: rule__BRSDefinition__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5__2"


    // $ANTLR start "rule__BRSDefinition__Group_5__2__Impl"
    // InternalBDSL.g:5011:1: rule__BRSDefinition__Group_5__2__Impl : ( ( rule__BRSDefinition__Group_5_2__0 )? ) ;
    public final void rule__BRSDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5015:1: ( ( ( rule__BRSDefinition__Group_5_2__0 )? ) )
            // InternalBDSL.g:5016:1: ( ( rule__BRSDefinition__Group_5_2__0 )? )
            {
            // InternalBDSL.g:5016:1: ( ( rule__BRSDefinition__Group_5_2__0 )? )
            // InternalBDSL.g:5017:2: ( rule__BRSDefinition__Group_5_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getGroup_5_2()); 
            }
            // InternalBDSL.g:5018:2: ( rule__BRSDefinition__Group_5_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBDSL.g:5018:3: rule__BRSDefinition__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BRSDefinition__Group_5_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getGroup_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5__2__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_5_2__0"
    // InternalBDSL.g:5027:1: rule__BRSDefinition__Group_5_2__0 : rule__BRSDefinition__Group_5_2__0__Impl rule__BRSDefinition__Group_5_2__1 ;
    public final void rule__BRSDefinition__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5031:1: ( rule__BRSDefinition__Group_5_2__0__Impl rule__BRSDefinition__Group_5_2__1 )
            // InternalBDSL.g:5032:2: rule__BRSDefinition__Group_5_2__0__Impl rule__BRSDefinition__Group_5_2__1
            {
            pushFollow(FOLLOW_45);
            rule__BRSDefinition__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_5_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2__0"


    // $ANTLR start "rule__BRSDefinition__Group_5_2__0__Impl"
    // InternalBDSL.g:5039:1: rule__BRSDefinition__Group_5_2__0__Impl : ( '[' ) ;
    public final void rule__BRSDefinition__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5043:1: ( ( '[' ) )
            // InternalBDSL.g:5044:1: ( '[' )
            {
            // InternalBDSL.g:5044:1: ( '[' )
            // InternalBDSL.g:5045:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getLeftSquareBracketKeyword_5_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getLeftSquareBracketKeyword_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2__0__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_5_2__1"
    // InternalBDSL.g:5054:1: rule__BRSDefinition__Group_5_2__1 : rule__BRSDefinition__Group_5_2__1__Impl rule__BRSDefinition__Group_5_2__2 ;
    public final void rule__BRSDefinition__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5058:1: ( rule__BRSDefinition__Group_5_2__1__Impl rule__BRSDefinition__Group_5_2__2 )
            // InternalBDSL.g:5059:2: rule__BRSDefinition__Group_5_2__1__Impl rule__BRSDefinition__Group_5_2__2
            {
            pushFollow(FOLLOW_45);
            rule__BRSDefinition__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_5_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2__1"


    // $ANTLR start "rule__BRSDefinition__Group_5_2__1__Impl"
    // InternalBDSL.g:5066:1: rule__BRSDefinition__Group_5_2__1__Impl : ( ( rule__BRSDefinition__RulesAssignment_5_2_1 )? ) ;
    public final void rule__BRSDefinition__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5070:1: ( ( ( rule__BRSDefinition__RulesAssignment_5_2_1 )? ) )
            // InternalBDSL.g:5071:1: ( ( rule__BRSDefinition__RulesAssignment_5_2_1 )? )
            {
            // InternalBDSL.g:5071:1: ( ( rule__BRSDefinition__RulesAssignment_5_2_1 )? )
            // InternalBDSL.g:5072:2: ( rule__BRSDefinition__RulesAssignment_5_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getRulesAssignment_5_2_1()); 
            }
            // InternalBDSL.g:5073:2: ( rule__BRSDefinition__RulesAssignment_5_2_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBDSL.g:5073:3: rule__BRSDefinition__RulesAssignment_5_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BRSDefinition__RulesAssignment_5_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getRulesAssignment_5_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2__1__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_5_2__2"
    // InternalBDSL.g:5081:1: rule__BRSDefinition__Group_5_2__2 : rule__BRSDefinition__Group_5_2__2__Impl rule__BRSDefinition__Group_5_2__3 ;
    public final void rule__BRSDefinition__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5085:1: ( rule__BRSDefinition__Group_5_2__2__Impl rule__BRSDefinition__Group_5_2__3 )
            // InternalBDSL.g:5086:2: rule__BRSDefinition__Group_5_2__2__Impl rule__BRSDefinition__Group_5_2__3
            {
            pushFollow(FOLLOW_45);
            rule__BRSDefinition__Group_5_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_5_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2__2"


    // $ANTLR start "rule__BRSDefinition__Group_5_2__2__Impl"
    // InternalBDSL.g:5093:1: rule__BRSDefinition__Group_5_2__2__Impl : ( ( rule__BRSDefinition__Group_5_2_2__0 )* ) ;
    public final void rule__BRSDefinition__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5097:1: ( ( ( rule__BRSDefinition__Group_5_2_2__0 )* ) )
            // InternalBDSL.g:5098:1: ( ( rule__BRSDefinition__Group_5_2_2__0 )* )
            {
            // InternalBDSL.g:5098:1: ( ( rule__BRSDefinition__Group_5_2_2__0 )* )
            // InternalBDSL.g:5099:2: ( rule__BRSDefinition__Group_5_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getGroup_5_2_2()); 
            }
            // InternalBDSL.g:5100:2: ( rule__BRSDefinition__Group_5_2_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==34) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBDSL.g:5100:3: rule__BRSDefinition__Group_5_2_2__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__BRSDefinition__Group_5_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getGroup_5_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2__2__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_5_2__3"
    // InternalBDSL.g:5108:1: rule__BRSDefinition__Group_5_2__3 : rule__BRSDefinition__Group_5_2__3__Impl ;
    public final void rule__BRSDefinition__Group_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5112:1: ( rule__BRSDefinition__Group_5_2__3__Impl )
            // InternalBDSL.g:5113:2: rule__BRSDefinition__Group_5_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_5_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2__3"


    // $ANTLR start "rule__BRSDefinition__Group_5_2__3__Impl"
    // InternalBDSL.g:5119:1: rule__BRSDefinition__Group_5_2__3__Impl : ( ']' ) ;
    public final void rule__BRSDefinition__Group_5_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5123:1: ( ( ']' ) )
            // InternalBDSL.g:5124:1: ( ']' )
            {
            // InternalBDSL.g:5124:1: ( ']' )
            // InternalBDSL.g:5125:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getRightSquareBracketKeyword_5_2_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getRightSquareBracketKeyword_5_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2__3__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_5_2_2__0"
    // InternalBDSL.g:5135:1: rule__BRSDefinition__Group_5_2_2__0 : rule__BRSDefinition__Group_5_2_2__0__Impl rule__BRSDefinition__Group_5_2_2__1 ;
    public final void rule__BRSDefinition__Group_5_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5139:1: ( rule__BRSDefinition__Group_5_2_2__0__Impl rule__BRSDefinition__Group_5_2_2__1 )
            // InternalBDSL.g:5140:2: rule__BRSDefinition__Group_5_2_2__0__Impl rule__BRSDefinition__Group_5_2_2__1
            {
            pushFollow(FOLLOW_46);
            rule__BRSDefinition__Group_5_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_5_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2_2__0"


    // $ANTLR start "rule__BRSDefinition__Group_5_2_2__0__Impl"
    // InternalBDSL.g:5147:1: rule__BRSDefinition__Group_5_2_2__0__Impl : ( ',' ) ;
    public final void rule__BRSDefinition__Group_5_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5151:1: ( ( ',' ) )
            // InternalBDSL.g:5152:1: ( ',' )
            {
            // InternalBDSL.g:5152:1: ( ',' )
            // InternalBDSL.g:5153:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getCommaKeyword_5_2_2_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getCommaKeyword_5_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2_2__0__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_5_2_2__1"
    // InternalBDSL.g:5162:1: rule__BRSDefinition__Group_5_2_2__1 : rule__BRSDefinition__Group_5_2_2__1__Impl ;
    public final void rule__BRSDefinition__Group_5_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5166:1: ( rule__BRSDefinition__Group_5_2_2__1__Impl )
            // InternalBDSL.g:5167:2: rule__BRSDefinition__Group_5_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_5_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2_2__1"


    // $ANTLR start "rule__BRSDefinition__Group_5_2_2__1__Impl"
    // InternalBDSL.g:5173:1: rule__BRSDefinition__Group_5_2_2__1__Impl : ( ( rule__BRSDefinition__AgentsAssignment_5_2_2_1 ) ) ;
    public final void rule__BRSDefinition__Group_5_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5177:1: ( ( ( rule__BRSDefinition__AgentsAssignment_5_2_2_1 ) ) )
            // InternalBDSL.g:5178:1: ( ( rule__BRSDefinition__AgentsAssignment_5_2_2_1 ) )
            {
            // InternalBDSL.g:5178:1: ( ( rule__BRSDefinition__AgentsAssignment_5_2_2_1 ) )
            // InternalBDSL.g:5179:2: ( rule__BRSDefinition__AgentsAssignment_5_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getAgentsAssignment_5_2_2_1()); 
            }
            // InternalBDSL.g:5180:2: ( rule__BRSDefinition__AgentsAssignment_5_2_2_1 )
            // InternalBDSL.g:5180:3: rule__BRSDefinition__AgentsAssignment_5_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__AgentsAssignment_5_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getAgentsAssignment_5_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_5_2_2__1__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_7__0"
    // InternalBDSL.g:5189:1: rule__BRSDefinition__Group_7__0 : rule__BRSDefinition__Group_7__0__Impl rule__BRSDefinition__Group_7__1 ;
    public final void rule__BRSDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5193:1: ( rule__BRSDefinition__Group_7__0__Impl rule__BRSDefinition__Group_7__1 )
            // InternalBDSL.g:5194:2: rule__BRSDefinition__Group_7__0__Impl rule__BRSDefinition__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__BRSDefinition__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7__0"


    // $ANTLR start "rule__BRSDefinition__Group_7__0__Impl"
    // InternalBDSL.g:5201:1: rule__BRSDefinition__Group_7__0__Impl : ( 'preds' ) ;
    public final void rule__BRSDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5205:1: ( ( 'preds' ) )
            // InternalBDSL.g:5206:1: ( 'preds' )
            {
            // InternalBDSL.g:5206:1: ( 'preds' )
            // InternalBDSL.g:5207:2: 'preds'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getPredsKeyword_7_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getPredsKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_7__1"
    // InternalBDSL.g:5216:1: rule__BRSDefinition__Group_7__1 : rule__BRSDefinition__Group_7__1__Impl rule__BRSDefinition__Group_7__2 ;
    public final void rule__BRSDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5220:1: ( rule__BRSDefinition__Group_7__1__Impl rule__BRSDefinition__Group_7__2 )
            // InternalBDSL.g:5221:2: rule__BRSDefinition__Group_7__1__Impl rule__BRSDefinition__Group_7__2
            {
            pushFollow(FOLLOW_34);
            rule__BRSDefinition__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7__1"


    // $ANTLR start "rule__BRSDefinition__Group_7__1__Impl"
    // InternalBDSL.g:5228:1: rule__BRSDefinition__Group_7__1__Impl : ( '=' ) ;
    public final void rule__BRSDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5232:1: ( ( '=' ) )
            // InternalBDSL.g:5233:1: ( '=' )
            {
            // InternalBDSL.g:5233:1: ( '=' )
            // InternalBDSL.g:5234:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getEqualsSignKeyword_7_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getEqualsSignKeyword_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_7__2"
    // InternalBDSL.g:5243:1: rule__BRSDefinition__Group_7__2 : rule__BRSDefinition__Group_7__2__Impl ;
    public final void rule__BRSDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5247:1: ( rule__BRSDefinition__Group_7__2__Impl )
            // InternalBDSL.g:5248:2: rule__BRSDefinition__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7__2"


    // $ANTLR start "rule__BRSDefinition__Group_7__2__Impl"
    // InternalBDSL.g:5254:1: rule__BRSDefinition__Group_7__2__Impl : ( ( rule__BRSDefinition__Group_7_2__0 )? ) ;
    public final void rule__BRSDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5258:1: ( ( ( rule__BRSDefinition__Group_7_2__0 )? ) )
            // InternalBDSL.g:5259:1: ( ( rule__BRSDefinition__Group_7_2__0 )? )
            {
            // InternalBDSL.g:5259:1: ( ( rule__BRSDefinition__Group_7_2__0 )? )
            // InternalBDSL.g:5260:2: ( rule__BRSDefinition__Group_7_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getGroup_7_2()); 
            }
            // InternalBDSL.g:5261:2: ( rule__BRSDefinition__Group_7_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBDSL.g:5261:3: rule__BRSDefinition__Group_7_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BRSDefinition__Group_7_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getGroup_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7__2__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_7_2__0"
    // InternalBDSL.g:5270:1: rule__BRSDefinition__Group_7_2__0 : rule__BRSDefinition__Group_7_2__0__Impl rule__BRSDefinition__Group_7_2__1 ;
    public final void rule__BRSDefinition__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5274:1: ( rule__BRSDefinition__Group_7_2__0__Impl rule__BRSDefinition__Group_7_2__1 )
            // InternalBDSL.g:5275:2: rule__BRSDefinition__Group_7_2__0__Impl rule__BRSDefinition__Group_7_2__1
            {
            pushFollow(FOLLOW_45);
            rule__BRSDefinition__Group_7_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_7_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2__0"


    // $ANTLR start "rule__BRSDefinition__Group_7_2__0__Impl"
    // InternalBDSL.g:5282:1: rule__BRSDefinition__Group_7_2__0__Impl : ( '[' ) ;
    public final void rule__BRSDefinition__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5286:1: ( ( '[' ) )
            // InternalBDSL.g:5287:1: ( '[' )
            {
            // InternalBDSL.g:5287:1: ( '[' )
            // InternalBDSL.g:5288:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getLeftSquareBracketKeyword_7_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getLeftSquareBracketKeyword_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2__0__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_7_2__1"
    // InternalBDSL.g:5297:1: rule__BRSDefinition__Group_7_2__1 : rule__BRSDefinition__Group_7_2__1__Impl rule__BRSDefinition__Group_7_2__2 ;
    public final void rule__BRSDefinition__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5301:1: ( rule__BRSDefinition__Group_7_2__1__Impl rule__BRSDefinition__Group_7_2__2 )
            // InternalBDSL.g:5302:2: rule__BRSDefinition__Group_7_2__1__Impl rule__BRSDefinition__Group_7_2__2
            {
            pushFollow(FOLLOW_45);
            rule__BRSDefinition__Group_7_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_7_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2__1"


    // $ANTLR start "rule__BRSDefinition__Group_7_2__1__Impl"
    // InternalBDSL.g:5309:1: rule__BRSDefinition__Group_7_2__1__Impl : ( ( rule__BRSDefinition__PredicatesAssignment_7_2_1 )? ) ;
    public final void rule__BRSDefinition__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5313:1: ( ( ( rule__BRSDefinition__PredicatesAssignment_7_2_1 )? ) )
            // InternalBDSL.g:5314:1: ( ( rule__BRSDefinition__PredicatesAssignment_7_2_1 )? )
            {
            // InternalBDSL.g:5314:1: ( ( rule__BRSDefinition__PredicatesAssignment_7_2_1 )? )
            // InternalBDSL.g:5315:2: ( rule__BRSDefinition__PredicatesAssignment_7_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getPredicatesAssignment_7_2_1()); 
            }
            // InternalBDSL.g:5316:2: ( rule__BRSDefinition__PredicatesAssignment_7_2_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBDSL.g:5316:3: rule__BRSDefinition__PredicatesAssignment_7_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BRSDefinition__PredicatesAssignment_7_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getPredicatesAssignment_7_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2__1__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_7_2__2"
    // InternalBDSL.g:5324:1: rule__BRSDefinition__Group_7_2__2 : rule__BRSDefinition__Group_7_2__2__Impl rule__BRSDefinition__Group_7_2__3 ;
    public final void rule__BRSDefinition__Group_7_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5328:1: ( rule__BRSDefinition__Group_7_2__2__Impl rule__BRSDefinition__Group_7_2__3 )
            // InternalBDSL.g:5329:2: rule__BRSDefinition__Group_7_2__2__Impl rule__BRSDefinition__Group_7_2__3
            {
            pushFollow(FOLLOW_45);
            rule__BRSDefinition__Group_7_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_7_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2__2"


    // $ANTLR start "rule__BRSDefinition__Group_7_2__2__Impl"
    // InternalBDSL.g:5336:1: rule__BRSDefinition__Group_7_2__2__Impl : ( ( rule__BRSDefinition__Group_7_2_2__0 )* ) ;
    public final void rule__BRSDefinition__Group_7_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5340:1: ( ( ( rule__BRSDefinition__Group_7_2_2__0 )* ) )
            // InternalBDSL.g:5341:1: ( ( rule__BRSDefinition__Group_7_2_2__0 )* )
            {
            // InternalBDSL.g:5341:1: ( ( rule__BRSDefinition__Group_7_2_2__0 )* )
            // InternalBDSL.g:5342:2: ( rule__BRSDefinition__Group_7_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getGroup_7_2_2()); 
            }
            // InternalBDSL.g:5343:2: ( rule__BRSDefinition__Group_7_2_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==34) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBDSL.g:5343:3: rule__BRSDefinition__Group_7_2_2__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__BRSDefinition__Group_7_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getGroup_7_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2__2__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_7_2__3"
    // InternalBDSL.g:5351:1: rule__BRSDefinition__Group_7_2__3 : rule__BRSDefinition__Group_7_2__3__Impl ;
    public final void rule__BRSDefinition__Group_7_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5355:1: ( rule__BRSDefinition__Group_7_2__3__Impl )
            // InternalBDSL.g:5356:2: rule__BRSDefinition__Group_7_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_7_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2__3"


    // $ANTLR start "rule__BRSDefinition__Group_7_2__3__Impl"
    // InternalBDSL.g:5362:1: rule__BRSDefinition__Group_7_2__3__Impl : ( ']' ) ;
    public final void rule__BRSDefinition__Group_7_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5366:1: ( ( ']' ) )
            // InternalBDSL.g:5367:1: ( ']' )
            {
            // InternalBDSL.g:5367:1: ( ']' )
            // InternalBDSL.g:5368:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getRightSquareBracketKeyword_7_2_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getRightSquareBracketKeyword_7_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2__3__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_7_2_2__0"
    // InternalBDSL.g:5378:1: rule__BRSDefinition__Group_7_2_2__0 : rule__BRSDefinition__Group_7_2_2__0__Impl rule__BRSDefinition__Group_7_2_2__1 ;
    public final void rule__BRSDefinition__Group_7_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5382:1: ( rule__BRSDefinition__Group_7_2_2__0__Impl rule__BRSDefinition__Group_7_2_2__1 )
            // InternalBDSL.g:5383:2: rule__BRSDefinition__Group_7_2_2__0__Impl rule__BRSDefinition__Group_7_2_2__1
            {
            pushFollow(FOLLOW_46);
            rule__BRSDefinition__Group_7_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_7_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2_2__0"


    // $ANTLR start "rule__BRSDefinition__Group_7_2_2__0__Impl"
    // InternalBDSL.g:5390:1: rule__BRSDefinition__Group_7_2_2__0__Impl : ( ',' ) ;
    public final void rule__BRSDefinition__Group_7_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5394:1: ( ( ',' ) )
            // InternalBDSL.g:5395:1: ( ',' )
            {
            // InternalBDSL.g:5395:1: ( ',' )
            // InternalBDSL.g:5396:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getCommaKeyword_7_2_2_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getCommaKeyword_7_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2_2__0__Impl"


    // $ANTLR start "rule__BRSDefinition__Group_7_2_2__1"
    // InternalBDSL.g:5405:1: rule__BRSDefinition__Group_7_2_2__1 : rule__BRSDefinition__Group_7_2_2__1__Impl ;
    public final void rule__BRSDefinition__Group_7_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5409:1: ( rule__BRSDefinition__Group_7_2_2__1__Impl )
            // InternalBDSL.g:5410:2: rule__BRSDefinition__Group_7_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__Group_7_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2_2__1"


    // $ANTLR start "rule__BRSDefinition__Group_7_2_2__1__Impl"
    // InternalBDSL.g:5416:1: rule__BRSDefinition__Group_7_2_2__1__Impl : ( ( rule__BRSDefinition__PredicatesAssignment_7_2_2_1 ) ) ;
    public final void rule__BRSDefinition__Group_7_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5420:1: ( ( ( rule__BRSDefinition__PredicatesAssignment_7_2_2_1 ) ) )
            // InternalBDSL.g:5421:1: ( ( rule__BRSDefinition__PredicatesAssignment_7_2_2_1 ) )
            {
            // InternalBDSL.g:5421:1: ( ( rule__BRSDefinition__PredicatesAssignment_7_2_2_1 ) )
            // InternalBDSL.g:5422:2: ( rule__BRSDefinition__PredicatesAssignment_7_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getPredicatesAssignment_7_2_2_1()); 
            }
            // InternalBDSL.g:5423:2: ( rule__BRSDefinition__PredicatesAssignment_7_2_2_1 )
            // InternalBDSL.g:5423:3: rule__BRSDefinition__PredicatesAssignment_7_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BRSDefinition__PredicatesAssignment_7_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getPredicatesAssignment_7_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__Group_7_2_2__1__Impl"


    // $ANTLR start "rule__PrintLn__Group__0"
    // InternalBDSL.g:5432:1: rule__PrintLn__Group__0 : rule__PrintLn__Group__0__Impl rule__PrintLn__Group__1 ;
    public final void rule__PrintLn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5436:1: ( rule__PrintLn__Group__0__Impl rule__PrintLn__Group__1 )
            // InternalBDSL.g:5437:2: rule__PrintLn__Group__0__Impl rule__PrintLn__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__PrintLn__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintLn__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__0"


    // $ANTLR start "rule__PrintLn__Group__0__Impl"
    // InternalBDSL.g:5444:1: rule__PrintLn__Group__0__Impl : ( () ) ;
    public final void rule__PrintLn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5448:1: ( ( () ) )
            // InternalBDSL.g:5449:1: ( () )
            {
            // InternalBDSL.g:5449:1: ( () )
            // InternalBDSL.g:5450:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getPrintLnAction_0()); 
            }
            // InternalBDSL.g:5451:2: ()
            // InternalBDSL.g:5451:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getPrintLnAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__0__Impl"


    // $ANTLR start "rule__PrintLn__Group__1"
    // InternalBDSL.g:5459:1: rule__PrintLn__Group__1 : rule__PrintLn__Group__1__Impl rule__PrintLn__Group__2 ;
    public final void rule__PrintLn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5463:1: ( rule__PrintLn__Group__1__Impl rule__PrintLn__Group__2 )
            // InternalBDSL.g:5464:2: rule__PrintLn__Group__1__Impl rule__PrintLn__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__PrintLn__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintLn__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__1"


    // $ANTLR start "rule__PrintLn__Group__1__Impl"
    // InternalBDSL.g:5471:1: rule__PrintLn__Group__1__Impl : ( 'println' ) ;
    public final void rule__PrintLn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5475:1: ( ( 'println' ) )
            // InternalBDSL.g:5476:1: ( 'println' )
            {
            // InternalBDSL.g:5476:1: ( 'println' )
            // InternalBDSL.g:5477:2: 'println'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getPrintlnKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getPrintlnKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__1__Impl"


    // $ANTLR start "rule__PrintLn__Group__2"
    // InternalBDSL.g:5486:1: rule__PrintLn__Group__2 : rule__PrintLn__Group__2__Impl rule__PrintLn__Group__3 ;
    public final void rule__PrintLn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5490:1: ( rule__PrintLn__Group__2__Impl rule__PrintLn__Group__3 )
            // InternalBDSL.g:5491:2: rule__PrintLn__Group__2__Impl rule__PrintLn__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__PrintLn__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintLn__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__2"


    // $ANTLR start "rule__PrintLn__Group__2__Impl"
    // InternalBDSL.g:5498:1: rule__PrintLn__Group__2__Impl : ( '(' ) ;
    public final void rule__PrintLn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5502:1: ( ( '(' ) )
            // InternalBDSL.g:5503:1: ( '(' )
            {
            // InternalBDSL.g:5503:1: ( '(' )
            // InternalBDSL.g:5504:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__2__Impl"


    // $ANTLR start "rule__PrintLn__Group__3"
    // InternalBDSL.g:5513:1: rule__PrintLn__Group__3 : rule__PrintLn__Group__3__Impl rule__PrintLn__Group__4 ;
    public final void rule__PrintLn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5517:1: ( rule__PrintLn__Group__3__Impl rule__PrintLn__Group__4 )
            // InternalBDSL.g:5518:2: rule__PrintLn__Group__3__Impl rule__PrintLn__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__PrintLn__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintLn__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__3"


    // $ANTLR start "rule__PrintLn__Group__3__Impl"
    // InternalBDSL.g:5525:1: rule__PrintLn__Group__3__Impl : ( ( rule__PrintLn__TextAssignment_3 ) ) ;
    public final void rule__PrintLn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5529:1: ( ( ( rule__PrintLn__TextAssignment_3 ) ) )
            // InternalBDSL.g:5530:1: ( ( rule__PrintLn__TextAssignment_3 ) )
            {
            // InternalBDSL.g:5530:1: ( ( rule__PrintLn__TextAssignment_3 ) )
            // InternalBDSL.g:5531:2: ( rule__PrintLn__TextAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getTextAssignment_3()); 
            }
            // InternalBDSL.g:5532:2: ( rule__PrintLn__TextAssignment_3 )
            // InternalBDSL.g:5532:3: rule__PrintLn__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PrintLn__TextAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getTextAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__3__Impl"


    // $ANTLR start "rule__PrintLn__Group__4"
    // InternalBDSL.g:5540:1: rule__PrintLn__Group__4 : rule__PrintLn__Group__4__Impl rule__PrintLn__Group__5 ;
    public final void rule__PrintLn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5544:1: ( rule__PrintLn__Group__4__Impl rule__PrintLn__Group__5 )
            // InternalBDSL.g:5545:2: rule__PrintLn__Group__4__Impl rule__PrintLn__Group__5
            {
            pushFollow(FOLLOW_49);
            rule__PrintLn__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintLn__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__4"


    // $ANTLR start "rule__PrintLn__Group__4__Impl"
    // InternalBDSL.g:5552:1: rule__PrintLn__Group__4__Impl : ( ( rule__PrintLn__Group_4__0 )? ) ;
    public final void rule__PrintLn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5556:1: ( ( ( rule__PrintLn__Group_4__0 )? ) )
            // InternalBDSL.g:5557:1: ( ( rule__PrintLn__Group_4__0 )? )
            {
            // InternalBDSL.g:5557:1: ( ( rule__PrintLn__Group_4__0 )? )
            // InternalBDSL.g:5558:2: ( rule__PrintLn__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getGroup_4()); 
            }
            // InternalBDSL.g:5559:2: ( rule__PrintLn__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBDSL.g:5559:3: rule__PrintLn__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrintLn__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__4__Impl"


    // $ANTLR start "rule__PrintLn__Group__5"
    // InternalBDSL.g:5567:1: rule__PrintLn__Group__5 : rule__PrintLn__Group__5__Impl ;
    public final void rule__PrintLn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5571:1: ( rule__PrintLn__Group__5__Impl )
            // InternalBDSL.g:5572:2: rule__PrintLn__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintLn__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__5"


    // $ANTLR start "rule__PrintLn__Group__5__Impl"
    // InternalBDSL.g:5578:1: rule__PrintLn__Group__5__Impl : ( ')' ) ;
    public final void rule__PrintLn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5582:1: ( ( ')' ) )
            // InternalBDSL.g:5583:1: ( ')' )
            {
            // InternalBDSL.g:5583:1: ( ')' )
            // InternalBDSL.g:5584:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__5__Impl"


    // $ANTLR start "rule__PrintLn__Group_4__0"
    // InternalBDSL.g:5594:1: rule__PrintLn__Group_4__0 : rule__PrintLn__Group_4__0__Impl rule__PrintLn__Group_4__1 ;
    public final void rule__PrintLn__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5598:1: ( rule__PrintLn__Group_4__0__Impl rule__PrintLn__Group_4__1 )
            // InternalBDSL.g:5599:2: rule__PrintLn__Group_4__0__Impl rule__PrintLn__Group_4__1
            {
            pushFollow(FOLLOW_50);
            rule__PrintLn__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintLn__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group_4__0"


    // $ANTLR start "rule__PrintLn__Group_4__0__Impl"
    // InternalBDSL.g:5606:1: rule__PrintLn__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PrintLn__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5610:1: ( ( ',' ) )
            // InternalBDSL.g:5611:1: ( ',' )
            {
            // InternalBDSL.g:5611:1: ( ',' )
            // InternalBDSL.g:5612:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getCommaKeyword_4_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group_4__0__Impl"


    // $ANTLR start "rule__PrintLn__Group_4__1"
    // InternalBDSL.g:5621:1: rule__PrintLn__Group_4__1 : rule__PrintLn__Group_4__1__Impl ;
    public final void rule__PrintLn__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5625:1: ( rule__PrintLn__Group_4__1__Impl )
            // InternalBDSL.g:5626:2: rule__PrintLn__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintLn__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group_4__1"


    // $ANTLR start "rule__PrintLn__Group_4__1__Impl"
    // InternalBDSL.g:5632:1: rule__PrintLn__Group_4__1__Impl : ( ( rule__PrintLn__ModeAssignment_4_1 ) ) ;
    public final void rule__PrintLn__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5636:1: ( ( ( rule__PrintLn__ModeAssignment_4_1 ) ) )
            // InternalBDSL.g:5637:1: ( ( rule__PrintLn__ModeAssignment_4_1 ) )
            {
            // InternalBDSL.g:5637:1: ( ( rule__PrintLn__ModeAssignment_4_1 ) )
            // InternalBDSL.g:5638:2: ( rule__PrintLn__ModeAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getModeAssignment_4_1()); 
            }
            // InternalBDSL.g:5639:2: ( rule__PrintLn__ModeAssignment_4_1 )
            // InternalBDSL.g:5639:3: rule__PrintLn__ModeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PrintLn__ModeAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getModeAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group_4__1__Impl"


    // $ANTLR start "rule__PrintableExpression__Group_0__0"
    // InternalBDSL.g:5648:1: rule__PrintableExpression__Group_0__0 : rule__PrintableExpression__Group_0__0__Impl rule__PrintableExpression__Group_0__1 ;
    public final void rule__PrintableExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5652:1: ( rule__PrintableExpression__Group_0__0__Impl rule__PrintableExpression__Group_0__1 )
            // InternalBDSL.g:5653:2: rule__PrintableExpression__Group_0__0__Impl rule__PrintableExpression__Group_0__1
            {
            pushFollow(FOLLOW_51);
            rule__PrintableExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintableExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintableExpression__Group_0__0"


    // $ANTLR start "rule__PrintableExpression__Group_0__0__Impl"
    // InternalBDSL.g:5660:1: rule__PrintableExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__PrintableExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5664:1: ( ( () ) )
            // InternalBDSL.g:5665:1: ( () )
            {
            // InternalBDSL.g:5665:1: ( () )
            // InternalBDSL.g:5666:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintableExpressionAccess().getStringLiteralAction_0_0()); 
            }
            // InternalBDSL.g:5667:2: ()
            // InternalBDSL.g:5667:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintableExpressionAccess().getStringLiteralAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintableExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrintableExpression__Group_0__1"
    // InternalBDSL.g:5675:1: rule__PrintableExpression__Group_0__1 : rule__PrintableExpression__Group_0__1__Impl ;
    public final void rule__PrintableExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5679:1: ( rule__PrintableExpression__Group_0__1__Impl )
            // InternalBDSL.g:5680:2: rule__PrintableExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintableExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintableExpression__Group_0__1"


    // $ANTLR start "rule__PrintableExpression__Group_0__1__Impl"
    // InternalBDSL.g:5686:1: rule__PrintableExpression__Group_0__1__Impl : ( ( rule__PrintableExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__PrintableExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5690:1: ( ( ( rule__PrintableExpression__ValueAssignment_0_1 ) ) )
            // InternalBDSL.g:5691:1: ( ( rule__PrintableExpression__ValueAssignment_0_1 ) )
            {
            // InternalBDSL.g:5691:1: ( ( rule__PrintableExpression__ValueAssignment_0_1 ) )
            // InternalBDSL.g:5692:2: ( rule__PrintableExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintableExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalBDSL.g:5693:2: ( rule__PrintableExpression__ValueAssignment_0_1 )
            // InternalBDSL.g:5693:3: rule__PrintableExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PrintableExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintableExpressionAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintableExpression__Group_0__1__Impl"


    // $ANTLR start "rule__BRSModel__UnorderedGroup_1"
    // InternalBDSL.g:5702:1: rule__BRSModel__UnorderedGroup_1 : rule__BRSModel__UnorderedGroup_1__0 {...}?;
    public final void rule__BRSModel__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBRSModelAccess().getUnorderedGroup_1());
        	
        try {
            // InternalBDSL.g:5707:1: ( rule__BRSModel__UnorderedGroup_1__0 {...}?)
            // InternalBDSL.g:5708:2: rule__BRSModel__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__BRSModel__UnorderedGroup_1__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBRSModelAccess().getUnorderedGroup_1()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__BRSModel__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getBRSModelAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getBRSModelAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSModel__UnorderedGroup_1"


    // $ANTLR start "rule__BRSModel__UnorderedGroup_1__Impl"
    // InternalBDSL.g:5716:1: rule__BRSModel__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) ) ;
    public final void rule__BRSModel__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalBDSL.g:5721:1: ( ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) ) )
            // InternalBDSL.g:5722:3: ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) )
            {
            // InternalBDSL.g:5722:3: ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ( LA44_0 == 38 || LA44_0 >= 42 && LA44_0 <= 43 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalBDSL.g:5723:3: ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) )
                    {
                    // InternalBDSL.g:5723:3: ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) )
                    // InternalBDSL.g:5724:4: {...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BRSModel__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalBDSL.g:5724:104: ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) )
                    // InternalBDSL.g:5725:5: ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0);
                    selected = true;
                    // InternalBDSL.g:5731:5: ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) )
                    // InternalBDSL.g:5732:6: ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* )
                    {
                    // InternalBDSL.g:5732:6: ( ( rule__BRSModel__StatementsAssignment_1_0 ) )
                    // InternalBDSL.g:5733:7: ( rule__BRSModel__StatementsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRSModelAccess().getStatementsAssignment_1_0()); 
                    }
                    // InternalBDSL.g:5734:7: ( rule__BRSModel__StatementsAssignment_1_0 )
                    // InternalBDSL.g:5734:8: rule__BRSModel__StatementsAssignment_1_0
                    {
                    pushFollow(FOLLOW_52);
                    rule__BRSModel__StatementsAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBRSModelAccess().getStatementsAssignment_1_0()); 
                    }

                    }

                    // InternalBDSL.g:5737:6: ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* )
                    // InternalBDSL.g:5738:7: ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRSModelAccess().getStatementsAssignment_1_0()); 
                    }
                    // InternalBDSL.g:5739:7: ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )*
                    loop43:
                    do {
                        int alt43=2;
                        switch ( input.LA(1) ) {
                        case 38:
                            {
                            int LA43_1 = input.LA(2);

                            if ( (synpred1_InternalBDSL()) ) {
                                alt43=1;
                            }


                            }
                            break;
                        case 42:
                            {
                            int LA43_2 = input.LA(2);

                            if ( (synpred1_InternalBDSL()) ) {
                                alt43=1;
                            }


                            }
                            break;
                        case 43:
                            {
                            int LA43_3 = input.LA(2);

                            if ( (synpred1_InternalBDSL()) ) {
                                alt43=1;
                            }


                            }
                            break;

                        }

                        switch (alt43) {
                    	case 1 :
                    	    // InternalBDSL.g:5739:8: ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0
                    	    {
                    	    pushFollow(FOLLOW_52);
                    	    rule__BRSModel__StatementsAssignment_1_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBRSModelAccess().getStatementsAssignment_1_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:5745:3: ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) )
                    {
                    // InternalBDSL.g:5745:3: ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) )
                    // InternalBDSL.g:5746:4: {...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BRSModel__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalBDSL.g:5746:104: ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) )
                    // InternalBDSL.g:5747:5: ( ( rule__BRSModel__MainAssignment_1_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1);
                    selected = true;
                    // InternalBDSL.g:5753:5: ( ( rule__BRSModel__MainAssignment_1_1 ) )
                    // InternalBDSL.g:5754:6: ( rule__BRSModel__MainAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRSModelAccess().getMainAssignment_1_1()); 
                    }
                    // InternalBDSL.g:5755:6: ( rule__BRSModel__MainAssignment_1_1 )
                    // InternalBDSL.g:5755:7: rule__BRSModel__MainAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BRSModel__MainAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBRSModelAccess().getMainAssignment_1_1()); 
                    }

                    }


                    }


                    }


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

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBRSModelAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSModel__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__BRSModel__UnorderedGroup_1__0"
    // InternalBDSL.g:5768:1: rule__BRSModel__UnorderedGroup_1__0 : rule__BRSModel__UnorderedGroup_1__Impl ( rule__BRSModel__UnorderedGroup_1__1 )? ;
    public final void rule__BRSModel__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5772:1: ( rule__BRSModel__UnorderedGroup_1__Impl ( rule__BRSModel__UnorderedGroup_1__1 )? )
            // InternalBDSL.g:5773:2: rule__BRSModel__UnorderedGroup_1__Impl ( rule__BRSModel__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_53);
            rule__BRSModel__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBDSL.g:5774:2: ( rule__BRSModel__UnorderedGroup_1__1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ( LA45_0 == 38 || LA45_0 >= 42 && LA45_0 <= 43 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBDSL.g:5774:2: rule__BRSModel__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BRSModel__UnorderedGroup_1__1();

                    state._fsp--;
                    if (state.failed) return ;

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSModel__UnorderedGroup_1__0"


    // $ANTLR start "rule__BRSModel__UnorderedGroup_1__1"
    // InternalBDSL.g:5780:1: rule__BRSModel__UnorderedGroup_1__1 : rule__BRSModel__UnorderedGroup_1__Impl ;
    public final void rule__BRSModel__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5784:1: ( rule__BRSModel__UnorderedGroup_1__Impl )
            // InternalBDSL.g:5785:2: rule__BRSModel__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRSModel__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSModel__UnorderedGroup_1__1"


    // $ANTLR start "rule__BRSModel__SignatureAssignment_0"
    // InternalBDSL.g:5792:1: rule__BRSModel__SignatureAssignment_0 : ( ruleSignature ) ;
    public final void rule__BRSModel__SignatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5796:1: ( ( ruleSignature ) )
            // InternalBDSL.g:5797:2: ( ruleSignature )
            {
            // InternalBDSL.g:5797:2: ( ruleSignature )
            // InternalBDSL.g:5798:3: ruleSignature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSModelAccess().getSignatureSignatureParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSModelAccess().getSignatureSignatureParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSModel__SignatureAssignment_0"


    // $ANTLR start "rule__BRSModel__StatementsAssignment_1_0"
    // InternalBDSL.g:5807:1: rule__BRSModel__StatementsAssignment_1_0 : ( ruleAbstractElement ) ;
    public final void rule__BRSModel__StatementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5811:1: ( ( ruleAbstractElement ) )
            // InternalBDSL.g:5812:2: ( ruleAbstractElement )
            {
            // InternalBDSL.g:5812:2: ( ruleAbstractElement )
            // InternalBDSL.g:5813:3: ruleAbstractElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSModelAccess().getStatementsAbstractElementParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSModelAccess().getStatementsAbstractElementParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSModel__StatementsAssignment_1_0"


    // $ANTLR start "rule__BRSModel__MainAssignment_1_1"
    // InternalBDSL.g:5822:1: rule__BRSModel__MainAssignment_1_1 : ( ruleMainElement ) ;
    public final void rule__BRSModel__MainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5826:1: ( ( ruleMainElement ) )
            // InternalBDSL.g:5827:2: ( ruleMainElement )
            {
            // InternalBDSL.g:5827:2: ( ruleMainElement )
            // InternalBDSL.g:5828:3: ruleMainElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSModelAccess().getMainMainElementParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMainElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSModelAccess().getMainMainElementParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSModel__MainAssignment_1_1"


    // $ANTLR start "rule__MainElement__ValueAssignment_4"
    // InternalBDSL.g:5837:1: rule__MainElement__ValueAssignment_4 : ( ruleAbstractMainStatements ) ;
    public final void rule__MainElement__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5841:1: ( ( ruleAbstractMainStatements ) )
            // InternalBDSL.g:5842:2: ( ruleAbstractMainStatements )
            {
            // InternalBDSL.g:5842:2: ( ruleAbstractMainStatements )
            // InternalBDSL.g:5843:3: ruleAbstractMainStatements
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getValueAbstractMainStatementsParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractMainStatements();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementAccess().getValueAbstractMainStatementsParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainElement__ValueAssignment_4"


    // $ANTLR start "rule__Signature__NameAssignment_2"
    // InternalBDSL.g:5852:1: rule__Signature__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Signature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5856:1: ( ( RULE_ID ) )
            // InternalBDSL.g:5857:2: ( RULE_ID )
            {
            // InternalBDSL.g:5857:2: ( RULE_ID )
            // InternalBDSL.g:5858:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__NameAssignment_2"


    // $ANTLR start "rule__Signature__ControlsAssignment_3_1"
    // InternalBDSL.g:5867:1: rule__Signature__ControlsAssignment_3_1 : ( ruleControlDef ) ;
    public final void rule__Signature__ControlsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5871:1: ( ( ruleControlDef ) )
            // InternalBDSL.g:5872:2: ( ruleControlDef )
            {
            // InternalBDSL.g:5872:2: ( ruleControlDef )
            // InternalBDSL.g:5873:3: ruleControlDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getControlsControlDefParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleControlDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getControlsControlDefParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ControlsAssignment_3_1"


    // $ANTLR start "rule__ControlDef__TypeAssignment_1"
    // InternalBDSL.g:5882:1: rule__ControlDef__TypeAssignment_1 : ( ruleControlType ) ;
    public final void rule__ControlDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5886:1: ( ( ruleControlType ) )
            // InternalBDSL.g:5887:2: ( ruleControlType )
            {
            // InternalBDSL.g:5887:2: ( ruleControlType )
            // InternalBDSL.g:5888:3: ruleControlType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getTypeControlTypeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleControlType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getTypeControlTypeEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__TypeAssignment_1"


    // $ANTLR start "rule__ControlDef__NameAssignment_3"
    // InternalBDSL.g:5897:1: rule__ControlDef__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ControlDef__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5901:1: ( ( RULE_ID ) )
            // InternalBDSL.g:5902:2: ( RULE_ID )
            {
            // InternalBDSL.g:5902:2: ( RULE_ID )
            // InternalBDSL.g:5903:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__NameAssignment_3"


    // $ANTLR start "rule__ControlDef__ArityAssignment_5"
    // InternalBDSL.g:5912:1: rule__ControlDef__ArityAssignment_5 : ( RULE_INT ) ;
    public final void rule__ControlDef__ArityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5916:1: ( ( RULE_INT ) )
            // InternalBDSL.g:5917:2: ( RULE_INT )
            {
            // InternalBDSL.g:5917:2: ( RULE_INT )
            // InternalBDSL.g:5918:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getArityINTTerminalRuleCall_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getArityINTTerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlDef__ArityAssignment_5"


    // $ANTLR start "rule__NameConstant__ValueAssignment"
    // InternalBDSL.g:5927:1: rule__NameConstant__ValueAssignment : ( ruleEString ) ;
    public final void rule__NameConstant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5931:1: ( ( ruleEString ) )
            // InternalBDSL.g:5932:2: ( ruleEString )
            {
            // InternalBDSL.g:5932:2: ( ruleEString )
            // InternalBDSL.g:5933:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameConstantAccess().getValueEStringParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameConstantAccess().getValueEStringParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameConstant__ValueAssignment"


    // $ANTLR start "rule__SiteVars__NameAssignment"
    // InternalBDSL.g:5942:1: rule__SiteVars__NameAssignment : ( RULE_ID ) ;
    public final void rule__SiteVars__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5946:1: ( ( RULE_ID ) )
            // InternalBDSL.g:5947:2: ( RULE_ID )
            {
            // InternalBDSL.g:5947:2: ( RULE_ID )
            // InternalBDSL.g:5948:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteVarsAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSiteVarsAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteVars__NameAssignment"


    // $ANTLR start "rule__Site__IndexAssignment_2"
    // InternalBDSL.g:5957:1: rule__Site__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__Site__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5961:1: ( ( RULE_INT ) )
            // InternalBDSL.g:5962:2: ( RULE_INT )
            {
            // InternalBDSL.g:5962:2: ( RULE_INT )
            // InternalBDSL.g:5963:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteAccess().getIndexINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSiteAccess().getIndexINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__IndexAssignment_2"


    // $ANTLR start "rule__LVD2__NameAssignment_2"
    // InternalBDSL.g:5972:1: rule__LVD2__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LVD2__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5976:1: ( ( RULE_ID ) )
            // InternalBDSL.g:5977:2: ( RULE_ID )
            {
            // InternalBDSL.g:5977:2: ( RULE_ID )
            // InternalBDSL.g:5978:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__NameAssignment_2"


    // $ANTLR start "rule__LVD2__TypeAssignment_4"
    // InternalBDSL.g:5987:1: rule__LVD2__TypeAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__LVD2__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:5991:1: ( ( ( ruleFQN ) ) )
            // InternalBDSL.g:5992:2: ( ( ruleFQN ) )
            {
            // InternalBDSL.g:5992:2: ( ( ruleFQN ) )
            // InternalBDSL.g:5993:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getTypeControlVariableCrossReference_4_0()); 
            }
            // InternalBDSL.g:5994:3: ( ruleFQN )
            // InternalBDSL.g:5995:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getTypeControlVariableFQNParserRuleCall_4_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getTypeControlVariableFQNParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getTypeControlVariableCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__TypeAssignment_4"


    // $ANTLR start "rule__LVD2__DefinitionAssignment_7"
    // InternalBDSL.g:6006:1: rule__LVD2__DefinitionAssignment_7 : ( ruleBigraphExpression ) ;
    public final void rule__LVD2__DefinitionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6010:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:6011:2: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:6011:2: ( ruleBigraphExpression )
            // InternalBDSL.g:6012:3: ruleBigraphExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getDefinitionBigraphExpressionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBigraphExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLVD2Access().getDefinitionBigraphExpressionParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LVD2__DefinitionAssignment_7"


    // $ANTLR start "rule__LocalVarDecl__NameAssignment_2_0"
    // InternalBDSL.g:6021:1: rule__LocalVarDecl__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__LocalVarDecl__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6025:1: ( ( RULE_ID ) )
            // InternalBDSL.g:6026:2: ( RULE_ID )
            {
            // InternalBDSL.g:6026:2: ( RULE_ID )
            // InternalBDSL.g:6027:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getNameIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getNameIDTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__NameAssignment_2_0"


    // $ANTLR start "rule__LocalVarDecl__SigAssignment_2_1_1"
    // InternalBDSL.g:6036:1: rule__LocalVarDecl__SigAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__LocalVarDecl__SigAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6040:1: ( ( ( RULE_ID ) ) )
            // InternalBDSL.g:6041:2: ( ( RULE_ID ) )
            {
            // InternalBDSL.g:6041:2: ( ( RULE_ID ) )
            // InternalBDSL.g:6042:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSigSignatureCrossReference_2_1_1_0()); 
            }
            // InternalBDSL.g:6043:3: ( RULE_ID )
            // InternalBDSL.g:6044:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSigSignatureIDTerminalRuleCall_2_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getSigSignatureIDTerminalRuleCall_2_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getSigSignatureCrossReference_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__SigAssignment_2_1_1"


    // $ANTLR start "rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1"
    // InternalBDSL.g:6055:1: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 : ( ruleSiteVars ) ;
    public final void rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6059:1: ( ( ruleSiteVars ) )
            // InternalBDSL.g:6060:2: ( ruleSiteVars )
            {
            // InternalBDSL.g:6060:2: ( ruleSiteVars )
            // InternalBDSL.g:6061:3: ruleSiteVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSiteArgsSiteVarsParserRuleCall_2_2_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSiteVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getSiteArgsSiteVarsParserRuleCall_2_2_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1"


    // $ANTLR start "rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1"
    // InternalBDSL.g:6070:1: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 : ( ruleSiteVars ) ;
    public final void rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6074:1: ( ( ruleSiteVars ) )
            // InternalBDSL.g:6075:2: ( ruleSiteVars )
            {
            // InternalBDSL.g:6075:2: ( ruleSiteVars )
            // InternalBDSL.g:6076:3: ruleSiteVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSiteArgsSiteVarsParserRuleCall_2_2_0_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSiteVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getSiteArgsSiteVarsParserRuleCall_2_2_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1"


    // $ANTLR start "rule__LocalVarDecl__TypeAssignment_2_2_2"
    // InternalBDSL.g:6085:1: rule__LocalVarDecl__TypeAssignment_2_2_2 : ( ( ruleFQN ) ) ;
    public final void rule__LocalVarDecl__TypeAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6089:1: ( ( ( ruleFQN ) ) )
            // InternalBDSL.g:6090:2: ( ( ruleFQN ) )
            {
            // InternalBDSL.g:6090:2: ( ( ruleFQN ) )
            // InternalBDSL.g:6091:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getTypeControlVariableCrossReference_2_2_2_0()); 
            }
            // InternalBDSL.g:6092:3: ( ruleFQN )
            // InternalBDSL.g:6093:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getTypeControlVariableFQNParserRuleCall_2_2_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getTypeControlVariableFQNParserRuleCall_2_2_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getTypeControlVariableCrossReference_2_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__TypeAssignment_2_2_2"


    // $ANTLR start "rule__LocalVarDecl__DefinitionAssignment_2_3_2"
    // InternalBDSL.g:6104:1: rule__LocalVarDecl__DefinitionAssignment_2_3_2 : ( ruleBigraphExpression ) ;
    public final void rule__LocalVarDecl__DefinitionAssignment_2_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6108:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:6109:2: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:6109:2: ( ruleBigraphExpression )
            // InternalBDSL.g:6110:3: ruleBigraphExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getDefinitionBigraphExpressionParserRuleCall_2_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBigraphExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalVarDeclAccess().getDefinitionBigraphExpressionParserRuleCall_2_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__DefinitionAssignment_2_3_2"


    // $ANTLR start "rule__LocalRuleDecl__NameAssignment_2"
    // InternalBDSL.g:6119:1: rule__LocalRuleDecl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalRuleDecl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6123:1: ( ( RULE_ID ) )
            // InternalBDSL.g:6124:2: ( RULE_ID )
            {
            // InternalBDSL.g:6124:2: ( RULE_ID )
            // InternalBDSL.g:6125:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__NameAssignment_2"


    // $ANTLR start "rule__LocalRuleDecl__SigAssignment_3_1"
    // InternalBDSL.g:6134:1: rule__LocalRuleDecl__SigAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__LocalRuleDecl__SigAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6138:1: ( ( ( RULE_ID ) ) )
            // InternalBDSL.g:6139:2: ( ( RULE_ID ) )
            {
            // InternalBDSL.g:6139:2: ( ( RULE_ID ) )
            // InternalBDSL.g:6140:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getSigSignatureCrossReference_3_1_0()); 
            }
            // InternalBDSL.g:6141:3: ( RULE_ID )
            // InternalBDSL.g:6142:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getSigSignatureIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getSigSignatureIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getSigSignatureCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__SigAssignment_3_1"


    // $ANTLR start "rule__LocalRuleDecl__RedexAssignment_4_2"
    // InternalBDSL.g:6153:1: rule__LocalRuleDecl__RedexAssignment_4_2 : ( ruleBigraphExpression ) ;
    public final void rule__LocalRuleDecl__RedexAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6157:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:6158:2: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:6158:2: ( ruleBigraphExpression )
            // InternalBDSL.g:6159:3: ruleBigraphExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getRedexBigraphExpressionParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBigraphExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getRedexBigraphExpressionParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__RedexAssignment_4_2"


    // $ANTLR start "rule__LocalRuleDecl__ReactumAssignment_4_6"
    // InternalBDSL.g:6168:1: rule__LocalRuleDecl__ReactumAssignment_4_6 : ( ruleBigraphExpression ) ;
    public final void rule__LocalRuleDecl__ReactumAssignment_4_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6172:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:6173:2: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:6173:2: ( ruleBigraphExpression )
            // InternalBDSL.g:6174:3: ruleBigraphExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalRuleDeclAccess().getReactumBigraphExpressionParserRuleCall_4_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBigraphExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalRuleDeclAccess().getReactumBigraphExpressionParserRuleCall_4_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalRuleDecl__ReactumAssignment_4_6"


    // $ANTLR start "rule__LocalPredicateDeclaration__NameAssignment_2"
    // InternalBDSL.g:6183:1: rule__LocalPredicateDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalPredicateDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6187:1: ( ( RULE_ID ) )
            // InternalBDSL.g:6188:2: ( RULE_ID )
            {
            // InternalBDSL.g:6188:2: ( RULE_ID )
            // InternalBDSL.g:6189:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__NameAssignment_2"


    // $ANTLR start "rule__LocalPredicateDeclaration__SigAssignment_3_1"
    // InternalBDSL.g:6198:1: rule__LocalPredicateDeclaration__SigAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__LocalPredicateDeclaration__SigAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6202:1: ( ( ( RULE_ID ) ) )
            // InternalBDSL.g:6203:2: ( ( RULE_ID ) )
            {
            // InternalBDSL.g:6203:2: ( ( RULE_ID ) )
            // InternalBDSL.g:6204:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getSigSignatureCrossReference_3_1_0()); 
            }
            // InternalBDSL.g:6205:3: ( RULE_ID )
            // InternalBDSL.g:6206:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getSigSignatureIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getSigSignatureIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getSigSignatureCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__SigAssignment_3_1"


    // $ANTLR start "rule__LocalPredicateDeclaration__TypeAssignment_4_1"
    // InternalBDSL.g:6217:1: rule__LocalPredicateDeclaration__TypeAssignment_4_1 : ( rulePredicateType ) ;
    public final void rule__LocalPredicateDeclaration__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6221:1: ( ( rulePredicateType ) )
            // InternalBDSL.g:6222:2: ( rulePredicateType )
            {
            // InternalBDSL.g:6222:2: ( rulePredicateType )
            // InternalBDSL.g:6223:3: rulePredicateType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getTypePredicateTypeEnumRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredicateType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getTypePredicateTypeEnumRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__TypeAssignment_4_1"


    // $ANTLR start "rule__LocalPredicateDeclaration__DefinitionAssignment_7"
    // InternalBDSL.g:6232:1: rule__LocalPredicateDeclaration__DefinitionAssignment_7 : ( ruleBigraphExpression ) ;
    public final void rule__LocalPredicateDeclaration__DefinitionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6236:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:6237:2: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:6237:2: ( ruleBigraphExpression )
            // InternalBDSL.g:6238:3: ruleBigraphExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalPredicateDeclarationAccess().getDefinitionBigraphExpressionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBigraphExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalPredicateDeclarationAccess().getDefinitionBigraphExpressionParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPredicateDeclaration__DefinitionAssignment_7"


    // $ANTLR start "rule__BigraphVarReference__ValueAssignment"
    // InternalBDSL.g:6247:1: rule__BigraphVarReference__ValueAssignment : ( ( ruleBigraphVarReferenceID ) ) ;
    public final void rule__BigraphVarReference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6251:1: ( ( ( ruleBigraphVarReferenceID ) ) )
            // InternalBDSL.g:6252:2: ( ( ruleBigraphVarReferenceID ) )
            {
            // InternalBDSL.g:6252:2: ( ( ruleBigraphVarReferenceID ) )
            // InternalBDSL.g:6253:3: ( ruleBigraphVarReferenceID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceAccess().getValueLocalVarDeclCrossReference_0()); 
            }
            // InternalBDSL.g:6254:3: ( ruleBigraphVarReferenceID )
            // InternalBDSL.g:6255:4: ruleBigraphVarReferenceID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceAccess().getValueLocalVarDeclBigraphVarReferenceIDParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleBigraphVarReferenceID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigraphVarReferenceAccess().getValueLocalVarDeclBigraphVarReferenceIDParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigraphVarReferenceAccess().getValueLocalVarDeclCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigraphVarReference__ValueAssignment"


    // $ANTLR start "rule__RuleVarReference__ValueAssignment"
    // InternalBDSL.g:6266:1: rule__RuleVarReference__ValueAssignment : ( ( ruleBigraphVarReferenceID ) ) ;
    public final void rule__RuleVarReference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6270:1: ( ( ( ruleBigraphVarReferenceID ) ) )
            // InternalBDSL.g:6271:2: ( ( ruleBigraphVarReferenceID ) )
            {
            // InternalBDSL.g:6271:2: ( ( ruleBigraphVarReferenceID ) )
            // InternalBDSL.g:6272:3: ( ruleBigraphVarReferenceID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleVarReferenceAccess().getValueLocalRuleDeclCrossReference_0()); 
            }
            // InternalBDSL.g:6273:3: ( ruleBigraphVarReferenceID )
            // InternalBDSL.g:6274:4: ruleBigraphVarReferenceID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleVarReferenceAccess().getValueLocalRuleDeclBigraphVarReferenceIDParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleBigraphVarReferenceID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleVarReferenceAccess().getValueLocalRuleDeclBigraphVarReferenceIDParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleVarReferenceAccess().getValueLocalRuleDeclCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVarReference__ValueAssignment"


    // $ANTLR start "rule__PredicateVarReference__ValueAssignment"
    // InternalBDSL.g:6285:1: rule__PredicateVarReference__ValueAssignment : ( ( ruleBigraphVarReferenceID ) ) ;
    public final void rule__PredicateVarReference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6289:1: ( ( ( ruleBigraphVarReferenceID ) ) )
            // InternalBDSL.g:6290:2: ( ( ruleBigraphVarReferenceID ) )
            {
            // InternalBDSL.g:6290:2: ( ( ruleBigraphVarReferenceID ) )
            // InternalBDSL.g:6291:3: ( ruleBigraphVarReferenceID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateVarReferenceAccess().getValueLocalPredicateDeclarationCrossReference_0()); 
            }
            // InternalBDSL.g:6292:3: ( ruleBigraphVarReferenceID )
            // InternalBDSL.g:6293:4: ruleBigraphVarReferenceID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateVarReferenceAccess().getValueLocalPredicateDeclarationBigraphVarReferenceIDParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleBigraphVarReferenceID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateVarReferenceAccess().getValueLocalPredicateDeclarationBigraphVarReferenceIDParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateVarReferenceAccess().getValueLocalPredicateDeclarationCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateVarReference__ValueAssignment"


    // $ANTLR start "rule__NodeExpressionCall__ValueAssignment_0"
    // InternalBDSL.g:6304:1: rule__NodeExpressionCall__ValueAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__NodeExpressionCall__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6308:1: ( ( ( ruleFQN ) ) )
            // InternalBDSL.g:6309:2: ( ( ruleFQN ) )
            {
            // InternalBDSL.g:6309:2: ( ( ruleFQN ) )
            // InternalBDSL.g:6310:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getValueControlVariableCrossReference_0_0()); 
            }
            // InternalBDSL.g:6311:3: ( ruleFQN )
            // InternalBDSL.g:6312:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getValueControlVariableFQNParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeExpressionCallAccess().getValueControlVariableFQNParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeExpressionCallAccess().getValueControlVariableCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__ValueAssignment_0"


    // $ANTLR start "rule__NodeExpressionCall__LinksAssignment_1_1"
    // InternalBDSL.g:6323:1: rule__NodeExpressionCall__LinksAssignment_1_1 : ( ruleLinkNames ) ;
    public final void rule__NodeExpressionCall__LinksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6327:1: ( ( ruleLinkNames ) )
            // InternalBDSL.g:6328:2: ( ruleLinkNames )
            {
            // InternalBDSL.g:6328:2: ( ruleLinkNames )
            // InternalBDSL.g:6329:3: ruleLinkNames
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getLinksLinkNamesParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLinkNames();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeExpressionCallAccess().getLinksLinkNamesParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeExpressionCall__LinksAssignment_1_1"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_0_1"
    // InternalBDSL.g:6338:1: rule__Addition__OperatorAssignment_1_0_1 : ( ruleBinaryParallelOperator ) ;
    public final void rule__Addition__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6342:1: ( ( ruleBinaryParallelOperator ) )
            // InternalBDSL.g:6343:2: ( ruleBinaryParallelOperator )
            {
            // InternalBDSL.g:6343:2: ( ruleBinaryParallelOperator )
            // InternalBDSL.g:6344:3: ruleBinaryParallelOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOperatorBinaryParallelOperatorEnumRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryParallelOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getOperatorBinaryParallelOperatorEnumRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAssignment_1_0_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // InternalBDSL.g:6353:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6357:1: ( ( ruleMultiplication ) )
            // InternalBDSL.g:6358:2: ( ruleMultiplication )
            {
            // InternalBDSL.g:6358:2: ( ruleMultiplication )
            // InternalBDSL.g:6359:3: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_0_1"
    // InternalBDSL.g:6368:1: rule__Multiplication__OperatorAssignment_1_0_1 : ( ruleBinaryNestingOperator ) ;
    public final void rule__Multiplication__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6372:1: ( ( ruleBinaryNestingOperator ) )
            // InternalBDSL.g:6373:2: ( ruleBinaryNestingOperator )
            {
            // InternalBDSL.g:6373:2: ( ruleBinaryNestingOperator )
            // InternalBDSL.g:6374:3: ruleBinaryNestingOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOperatorBinaryNestingOperatorEnumRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryNestingOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOperatorBinaryNestingOperatorEnumRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_0_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // InternalBDSL.g:6383:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6387:1: ( ( rulePrimaryExpression ) )
            // InternalBDSL.g:6388:2: ( rulePrimaryExpression )
            {
            // InternalBDSL.g:6388:2: ( rulePrimaryExpression )
            // InternalBDSL.g:6389:3: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__BRSDefinition__AgentsAssignment_3_2_1"
    // InternalBDSL.g:6398:1: rule__BRSDefinition__AgentsAssignment_3_2_1 : ( ruleBigraphVarReference ) ;
    public final void rule__BRSDefinition__AgentsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6402:1: ( ( ruleBigraphVarReference ) )
            // InternalBDSL.g:6403:2: ( ruleBigraphVarReference )
            {
            // InternalBDSL.g:6403:2: ( ruleBigraphVarReference )
            // InternalBDSL.g:6404:3: ruleBigraphVarReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getAgentsBigraphVarReferenceParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBigraphVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getAgentsBigraphVarReferenceParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__AgentsAssignment_3_2_1"


    // $ANTLR start "rule__BRSDefinition__AgentsAssignment_3_2_2_1"
    // InternalBDSL.g:6413:1: rule__BRSDefinition__AgentsAssignment_3_2_2_1 : ( ruleBigraphVarReference ) ;
    public final void rule__BRSDefinition__AgentsAssignment_3_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6417:1: ( ( ruleBigraphVarReference ) )
            // InternalBDSL.g:6418:2: ( ruleBigraphVarReference )
            {
            // InternalBDSL.g:6418:2: ( ruleBigraphVarReference )
            // InternalBDSL.g:6419:3: ruleBigraphVarReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getAgentsBigraphVarReferenceParserRuleCall_3_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBigraphVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getAgentsBigraphVarReferenceParserRuleCall_3_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__AgentsAssignment_3_2_2_1"


    // $ANTLR start "rule__BRSDefinition__RulesAssignment_5_2_1"
    // InternalBDSL.g:6428:1: rule__BRSDefinition__RulesAssignment_5_2_1 : ( ruleRuleVarReference ) ;
    public final void rule__BRSDefinition__RulesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6432:1: ( ( ruleRuleVarReference ) )
            // InternalBDSL.g:6433:2: ( ruleRuleVarReference )
            {
            // InternalBDSL.g:6433:2: ( ruleRuleVarReference )
            // InternalBDSL.g:6434:3: ruleRuleVarReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getRulesRuleVarReferenceParserRuleCall_5_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRuleVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getRulesRuleVarReferenceParserRuleCall_5_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__RulesAssignment_5_2_1"


    // $ANTLR start "rule__BRSDefinition__AgentsAssignment_5_2_2_1"
    // InternalBDSL.g:6443:1: rule__BRSDefinition__AgentsAssignment_5_2_2_1 : ( ruleRuleVarReference ) ;
    public final void rule__BRSDefinition__AgentsAssignment_5_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6447:1: ( ( ruleRuleVarReference ) )
            // InternalBDSL.g:6448:2: ( ruleRuleVarReference )
            {
            // InternalBDSL.g:6448:2: ( ruleRuleVarReference )
            // InternalBDSL.g:6449:3: ruleRuleVarReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getAgentsRuleVarReferenceParserRuleCall_5_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRuleVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getAgentsRuleVarReferenceParserRuleCall_5_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__AgentsAssignment_5_2_2_1"


    // $ANTLR start "rule__BRSDefinition__PredicatesAssignment_7_2_1"
    // InternalBDSL.g:6458:1: rule__BRSDefinition__PredicatesAssignment_7_2_1 : ( rulePredicateVarReference ) ;
    public final void rule__BRSDefinition__PredicatesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6462:1: ( ( rulePredicateVarReference ) )
            // InternalBDSL.g:6463:2: ( rulePredicateVarReference )
            {
            // InternalBDSL.g:6463:2: ( rulePredicateVarReference )
            // InternalBDSL.g:6464:3: rulePredicateVarReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getPredicatesPredicateVarReferenceParserRuleCall_7_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredicateVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getPredicatesPredicateVarReferenceParserRuleCall_7_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__PredicatesAssignment_7_2_1"


    // $ANTLR start "rule__BRSDefinition__PredicatesAssignment_7_2_2_1"
    // InternalBDSL.g:6473:1: rule__BRSDefinition__PredicatesAssignment_7_2_2_1 : ( rulePredicateVarReference ) ;
    public final void rule__BRSDefinition__PredicatesAssignment_7_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6477:1: ( ( rulePredicateVarReference ) )
            // InternalBDSL.g:6478:2: ( rulePredicateVarReference )
            {
            // InternalBDSL.g:6478:2: ( rulePredicateVarReference )
            // InternalBDSL.g:6479:3: rulePredicateVarReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSDefinitionAccess().getPredicatesPredicateVarReferenceParserRuleCall_7_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredicateVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRSDefinitionAccess().getPredicatesPredicateVarReferenceParserRuleCall_7_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRSDefinition__PredicatesAssignment_7_2_2_1"


    // $ANTLR start "rule__PrintLn__TextAssignment_3"
    // InternalBDSL.g:6488:1: rule__PrintLn__TextAssignment_3 : ( rulePrintableExpression ) ;
    public final void rule__PrintLn__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6492:1: ( ( rulePrintableExpression ) )
            // InternalBDSL.g:6493:2: ( rulePrintableExpression )
            {
            // InternalBDSL.g:6493:2: ( rulePrintableExpression )
            // InternalBDSL.g:6494:3: rulePrintableExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getTextPrintableExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrintableExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getTextPrintableExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__TextAssignment_3"


    // $ANTLR start "rule__PrintLn__ModeAssignment_4_1"
    // InternalBDSL.g:6503:1: rule__PrintLn__ModeAssignment_4_1 : ( ruleOutputModeModel ) ;
    public final void rule__PrintLn__ModeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6507:1: ( ( ruleOutputModeModel ) )
            // InternalBDSL.g:6508:2: ( ruleOutputModeModel )
            {
            // InternalBDSL.g:6508:2: ( ruleOutputModeModel )
            // InternalBDSL.g:6509:3: ruleOutputModeModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getModeOutputModeModelEnumRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOutputModeModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getModeOutputModeModelEnumRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__ModeAssignment_4_1"


    // $ANTLR start "rule__PrintableExpression__ValueAssignment_0_1"
    // InternalBDSL.g:6518:1: rule__PrintableExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__PrintableExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:6522:1: ( ( RULE_STRING ) )
            // InternalBDSL.g:6523:2: ( RULE_STRING )
            {
            // InternalBDSL.g:6523:2: ( RULE_STRING )
            // InternalBDSL.g:6524:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintableExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintableExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintableExpression__ValueAssignment_0_1"

    // $ANTLR start synpred1_InternalBDSL
    public final void synpred1_InternalBDSL_fragment() throws RecognitionException {   
        // InternalBDSL.g:5739:8: ( rule__BRSModel__StatementsAssignment_1_0 )
        // InternalBDSL.g:5739:9: rule__BRSModel__StatementsAssignment_1_0
        {
        pushFollow(FOLLOW_2);
        rule__BRSModel__StatementsAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalBDSL

    // Delegated rules

    public final boolean synpred1_InternalBDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000C4008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0002200044000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0002200004000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001000E0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001000E0002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000105844000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000105804000022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000019010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000105804000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000009010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020404000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002200004000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00000C4000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000C4008000002L});

}
