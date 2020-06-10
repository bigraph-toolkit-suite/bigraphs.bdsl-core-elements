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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_INT_SITE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UNSET'", "'|'", "'||'", "'UNSET2'", "'-'", "'*'", "'atomic'", "'active'", "'passive'", "'xmi'", "'ecore'", "'.'", "'.*'", "'$'", "'main'", "'='", "'{'", "'}'", "';'", "'signature'", "'ctrl'", "'arity'", "','", "'id'", "'('", "')'", "'val'", "':'", "'['", "']'", "'println'"
    };
    public static final int RULE_INT_SITE=7;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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


    // $ANTLR start "entryRuleEInt"
    // InternalBDSL.g:161:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBDSL.g:162:1: ( ruleEInt EOF )
            // InternalBDSL.g:163:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBDSL.g:170:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:174:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBDSL.g:175:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBDSL.g:175:2: ( ( rule__EInt__Group__0 ) )
            // InternalBDSL.g:176:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalBDSL.g:177:3: ( rule__EInt__Group__0 )
            // InternalBDSL.g:177:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getGroup()); 
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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalBDSL.g:186:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBDSL.g:187:1: ( ruleEString EOF )
            // InternalBDSL.g:188:1: ruleEString EOF
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
    // InternalBDSL.g:195:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:199:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBDSL.g:200:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBDSL.g:200:2: ( ( rule__EString__Alternatives ) )
            // InternalBDSL.g:201:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalBDSL.g:202:3: ( rule__EString__Alternatives )
            // InternalBDSL.g:202:4: rule__EString__Alternatives
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
    // InternalBDSL.g:211:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalBDSL.g:212:1: ( ruleAbstractElement EOF )
            // InternalBDSL.g:213:1: ruleAbstractElement EOF
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
    // InternalBDSL.g:220:1: ruleAbstractElement : ( ruleLocalVarDecl ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:224:2: ( ( ruleLocalVarDecl ) )
            // InternalBDSL.g:225:2: ( ruleLocalVarDecl )
            {
            // InternalBDSL.g:225:2: ( ruleLocalVarDecl )
            // InternalBDSL.g:226:3: ruleLocalVarDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractElementAccess().getLocalVarDeclParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleLocalVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractElementAccess().getLocalVarDeclParserRuleCall()); 
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
    // InternalBDSL.g:236:1: entryRuleMainElement : ruleMainElement EOF ;
    public final void entryRuleMainElement() throws RecognitionException {
        try {
            // InternalBDSL.g:237:1: ( ruleMainElement EOF )
            // InternalBDSL.g:238:1: ruleMainElement EOF
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
    // InternalBDSL.g:245:1: ruleMainElement : ( ( rule__MainElement__Group__0 ) ) ;
    public final void ruleMainElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:249:2: ( ( ( rule__MainElement__Group__0 ) ) )
            // InternalBDSL.g:250:2: ( ( rule__MainElement__Group__0 ) )
            {
            // InternalBDSL.g:250:2: ( ( rule__MainElement__Group__0 ) )
            // InternalBDSL.g:251:3: ( rule__MainElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getGroup()); 
            }
            // InternalBDSL.g:252:3: ( rule__MainElement__Group__0 )
            // InternalBDSL.g:252:4: rule__MainElement__Group__0
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
    // InternalBDSL.g:261:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalBDSL.g:262:1: ( ruleSignature EOF )
            // InternalBDSL.g:263:1: ruleSignature EOF
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
    // InternalBDSL.g:270:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:274:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalBDSL.g:275:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalBDSL.g:275:2: ( ( rule__Signature__Group__0 ) )
            // InternalBDSL.g:276:3: ( rule__Signature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup()); 
            }
            // InternalBDSL.g:277:3: ( rule__Signature__Group__0 )
            // InternalBDSL.g:277:4: rule__Signature__Group__0
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
    // InternalBDSL.g:286:1: entryRuleControlDef : ruleControlDef EOF ;
    public final void entryRuleControlDef() throws RecognitionException {
        try {
            // InternalBDSL.g:287:1: ( ruleControlDef EOF )
            // InternalBDSL.g:288:1: ruleControlDef EOF
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
    // InternalBDSL.g:295:1: ruleControlDef : ( ( rule__ControlDef__Group__0 ) ) ;
    public final void ruleControlDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:299:2: ( ( ( rule__ControlDef__Group__0 ) ) )
            // InternalBDSL.g:300:2: ( ( rule__ControlDef__Group__0 ) )
            {
            // InternalBDSL.g:300:2: ( ( rule__ControlDef__Group__0 ) )
            // InternalBDSL.g:301:3: ( rule__ControlDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getGroup()); 
            }
            // InternalBDSL.g:302:3: ( rule__ControlDef__Group__0 )
            // InternalBDSL.g:302:4: rule__ControlDef__Group__0
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


    // $ANTLR start "entryRuleArityValue"
    // InternalBDSL.g:311:1: entryRuleArityValue : ruleArityValue EOF ;
    public final void entryRuleArityValue() throws RecognitionException {
        try {
            // InternalBDSL.g:312:1: ( ruleArityValue EOF )
            // InternalBDSL.g:313:1: ruleArityValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArityValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArityValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArityValueRule()); 
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
    // $ANTLR end "entryRuleArityValue"


    // $ANTLR start "ruleArityValue"
    // InternalBDSL.g:320:1: ruleArityValue : ( ( rule__ArityValue__ValueAssignment ) ) ;
    public final void ruleArityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:324:2: ( ( ( rule__ArityValue__ValueAssignment ) ) )
            // InternalBDSL.g:325:2: ( ( rule__ArityValue__ValueAssignment ) )
            {
            // InternalBDSL.g:325:2: ( ( rule__ArityValue__ValueAssignment ) )
            // InternalBDSL.g:326:3: ( rule__ArityValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArityValueAccess().getValueAssignment()); 
            }
            // InternalBDSL.g:327:3: ( rule__ArityValue__ValueAssignment )
            // InternalBDSL.g:327:4: rule__ArityValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ArityValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArityValueAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleArityValue"


    // $ANTLR start "entryRuleNameConstant"
    // InternalBDSL.g:336:1: entryRuleNameConstant : ruleNameConstant EOF ;
    public final void entryRuleNameConstant() throws RecognitionException {
        try {
            // InternalBDSL.g:337:1: ( ruleNameConstant EOF )
            // InternalBDSL.g:338:1: ruleNameConstant EOF
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
    // InternalBDSL.g:345:1: ruleNameConstant : ( ( rule__NameConstant__ValueAssignment ) ) ;
    public final void ruleNameConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:349:2: ( ( ( rule__NameConstant__ValueAssignment ) ) )
            // InternalBDSL.g:350:2: ( ( rule__NameConstant__ValueAssignment ) )
            {
            // InternalBDSL.g:350:2: ( ( rule__NameConstant__ValueAssignment ) )
            // InternalBDSL.g:351:3: ( rule__NameConstant__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameConstantAccess().getValueAssignment()); 
            }
            // InternalBDSL.g:352:3: ( rule__NameConstant__ValueAssignment )
            // InternalBDSL.g:352:4: rule__NameConstant__ValueAssignment
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
    // InternalBDSL.g:361:1: entryRuleLinkNames : ruleLinkNames EOF ;
    public final void entryRuleLinkNames() throws RecognitionException {
        try {
            // InternalBDSL.g:362:1: ( ruleLinkNames EOF )
            // InternalBDSL.g:363:1: ruleLinkNames EOF
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
    // InternalBDSL.g:370:1: ruleLinkNames : ( ( rule__LinkNames__Alternatives ) ) ;
    public final void ruleLinkNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:374:2: ( ( ( rule__LinkNames__Alternatives ) ) )
            // InternalBDSL.g:375:2: ( ( rule__LinkNames__Alternatives ) )
            {
            // InternalBDSL.g:375:2: ( ( rule__LinkNames__Alternatives ) )
            // InternalBDSL.g:376:3: ( rule__LinkNames__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkNamesAccess().getAlternatives()); 
            }
            // InternalBDSL.g:377:3: ( rule__LinkNames__Alternatives )
            // InternalBDSL.g:377:4: rule__LinkNames__Alternatives
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
    // InternalBDSL.g:386:1: entryRuleSiteVars : ruleSiteVars EOF ;
    public final void entryRuleSiteVars() throws RecognitionException {
        try {
            // InternalBDSL.g:387:1: ( ruleSiteVars EOF )
            // InternalBDSL.g:388:1: ruleSiteVars EOF
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
    // InternalBDSL.g:395:1: ruleSiteVars : ( ( rule__SiteVars__NameAssignment ) ) ;
    public final void ruleSiteVars() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:399:2: ( ( ( rule__SiteVars__NameAssignment ) ) )
            // InternalBDSL.g:400:2: ( ( rule__SiteVars__NameAssignment ) )
            {
            // InternalBDSL.g:400:2: ( ( rule__SiteVars__NameAssignment ) )
            // InternalBDSL.g:401:3: ( rule__SiteVars__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteVarsAccess().getNameAssignment()); 
            }
            // InternalBDSL.g:402:3: ( rule__SiteVars__NameAssignment )
            // InternalBDSL.g:402:4: rule__SiteVars__NameAssignment
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
    // InternalBDSL.g:411:1: entryRuleSite : ruleSite EOF ;
    public final void entryRuleSite() throws RecognitionException {
        try {
            // InternalBDSL.g:412:1: ( ruleSite EOF )
            // InternalBDSL.g:413:1: ruleSite EOF
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
    // InternalBDSL.g:420:1: ruleSite : ( ( rule__Site__Group__0 ) ) ;
    public final void ruleSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:424:2: ( ( ( rule__Site__Group__0 ) ) )
            // InternalBDSL.g:425:2: ( ( rule__Site__Group__0 ) )
            {
            // InternalBDSL.g:425:2: ( ( rule__Site__Group__0 ) )
            // InternalBDSL.g:426:3: ( rule__Site__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteAccess().getGroup()); 
            }
            // InternalBDSL.g:427:3: ( rule__Site__Group__0 )
            // InternalBDSL.g:427:4: rule__Site__Group__0
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
    // InternalBDSL.g:436:1: entryRuleLVD2 : ruleLVD2 EOF ;
    public final void entryRuleLVD2() throws RecognitionException {
        try {
            // InternalBDSL.g:437:1: ( ruleLVD2 EOF )
            // InternalBDSL.g:438:1: ruleLVD2 EOF
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
    // InternalBDSL.g:445:1: ruleLVD2 : ( ( rule__LVD2__Group__0 ) ) ;
    public final void ruleLVD2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:449:2: ( ( ( rule__LVD2__Group__0 ) ) )
            // InternalBDSL.g:450:2: ( ( rule__LVD2__Group__0 ) )
            {
            // InternalBDSL.g:450:2: ( ( rule__LVD2__Group__0 ) )
            // InternalBDSL.g:451:3: ( rule__LVD2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getGroup()); 
            }
            // InternalBDSL.g:452:3: ( rule__LVD2__Group__0 )
            // InternalBDSL.g:452:4: rule__LVD2__Group__0
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
    // InternalBDSL.g:461:1: entryRuleLocalVarDecl : ruleLocalVarDecl EOF ;
    public final void entryRuleLocalVarDecl() throws RecognitionException {
        try {
            // InternalBDSL.g:462:1: ( ruleLocalVarDecl EOF )
            // InternalBDSL.g:463:1: ruleLocalVarDecl EOF
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
    // InternalBDSL.g:470:1: ruleLocalVarDecl : ( ( rule__LocalVarDecl__Group__0 ) ) ;
    public final void ruleLocalVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:474:2: ( ( ( rule__LocalVarDecl__Group__0 ) ) )
            // InternalBDSL.g:475:2: ( ( rule__LocalVarDecl__Group__0 ) )
            {
            // InternalBDSL.g:475:2: ( ( rule__LocalVarDecl__Group__0 ) )
            // InternalBDSL.g:476:3: ( rule__LocalVarDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup()); 
            }
            // InternalBDSL.g:477:3: ( rule__LocalVarDecl__Group__0 )
            // InternalBDSL.g:477:4: rule__LocalVarDecl__Group__0
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


    // $ANTLR start "entryRuleBigraphVarReference"
    // InternalBDSL.g:486:1: entryRuleBigraphVarReference : ruleBigraphVarReference EOF ;
    public final void entryRuleBigraphVarReference() throws RecognitionException {
        try {
            // InternalBDSL.g:487:1: ( ruleBigraphVarReference EOF )
            // InternalBDSL.g:488:1: ruleBigraphVarReference EOF
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
    // InternalBDSL.g:495:1: ruleBigraphVarReference : ( ( rule__BigraphVarReference__ValueAssignment ) ) ;
    public final void ruleBigraphVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:499:2: ( ( ( rule__BigraphVarReference__ValueAssignment ) ) )
            // InternalBDSL.g:500:2: ( ( rule__BigraphVarReference__ValueAssignment ) )
            {
            // InternalBDSL.g:500:2: ( ( rule__BigraphVarReference__ValueAssignment ) )
            // InternalBDSL.g:501:3: ( rule__BigraphVarReference__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceAccess().getValueAssignment()); 
            }
            // InternalBDSL.g:502:3: ( rule__BigraphVarReference__ValueAssignment )
            // InternalBDSL.g:502:4: rule__BigraphVarReference__ValueAssignment
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


    // $ANTLR start "entryRuleAbstractBigraphDeclaration"
    // InternalBDSL.g:511:1: entryRuleAbstractBigraphDeclaration : ruleAbstractBigraphDeclaration EOF ;
    public final void entryRuleAbstractBigraphDeclaration() throws RecognitionException {
        try {
            // InternalBDSL.g:512:1: ( ruleAbstractBigraphDeclaration EOF )
            // InternalBDSL.g:513:1: ruleAbstractBigraphDeclaration EOF
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
    // InternalBDSL.g:520:1: ruleAbstractBigraphDeclaration : ( ( rule__AbstractBigraphDeclaration__Alternatives ) ) ;
    public final void ruleAbstractBigraphDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:524:2: ( ( ( rule__AbstractBigraphDeclaration__Alternatives ) ) )
            // InternalBDSL.g:525:2: ( ( rule__AbstractBigraphDeclaration__Alternatives ) )
            {
            // InternalBDSL.g:525:2: ( ( rule__AbstractBigraphDeclaration__Alternatives ) )
            // InternalBDSL.g:526:3: ( rule__AbstractBigraphDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractBigraphDeclarationAccess().getAlternatives()); 
            }
            // InternalBDSL.g:527:3: ( rule__AbstractBigraphDeclaration__Alternatives )
            // InternalBDSL.g:527:4: rule__AbstractBigraphDeclaration__Alternatives
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
    // InternalBDSL.g:536:1: entryRuleNodeExpressionCall : ruleNodeExpressionCall EOF ;
    public final void entryRuleNodeExpressionCall() throws RecognitionException {
        try {
            // InternalBDSL.g:537:1: ( ruleNodeExpressionCall EOF )
            // InternalBDSL.g:538:1: ruleNodeExpressionCall EOF
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
    // InternalBDSL.g:545:1: ruleNodeExpressionCall : ( ( rule__NodeExpressionCall__Group__0 ) ) ;
    public final void ruleNodeExpressionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:549:2: ( ( ( rule__NodeExpressionCall__Group__0 ) ) )
            // InternalBDSL.g:550:2: ( ( rule__NodeExpressionCall__Group__0 ) )
            {
            // InternalBDSL.g:550:2: ( ( rule__NodeExpressionCall__Group__0 ) )
            // InternalBDSL.g:551:3: ( rule__NodeExpressionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getGroup()); 
            }
            // InternalBDSL.g:552:3: ( rule__NodeExpressionCall__Group__0 )
            // InternalBDSL.g:552:4: rule__NodeExpressionCall__Group__0
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
    // InternalBDSL.g:561:1: entryRuleBigraphExpression : ruleBigraphExpression EOF ;
    public final void entryRuleBigraphExpression() throws RecognitionException {
        try {
            // InternalBDSL.g:562:1: ( ruleBigraphExpression EOF )
            // InternalBDSL.g:563:1: ruleBigraphExpression EOF
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
    // InternalBDSL.g:570:1: ruleBigraphExpression : ( ruleAddition ) ;
    public final void ruleBigraphExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:574:2: ( ( ruleAddition ) )
            // InternalBDSL.g:575:2: ( ruleAddition )
            {
            // InternalBDSL.g:575:2: ( ruleAddition )
            // InternalBDSL.g:576:3: ruleAddition
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
    // InternalBDSL.g:586:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalBDSL.g:587:1: ( ruleAddition EOF )
            // InternalBDSL.g:588:1: ruleAddition EOF
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
    // InternalBDSL.g:595:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:599:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalBDSL.g:600:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalBDSL.g:600:2: ( ( rule__Addition__Group__0 ) )
            // InternalBDSL.g:601:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalBDSL.g:602:3: ( rule__Addition__Group__0 )
            // InternalBDSL.g:602:4: rule__Addition__Group__0
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
    // InternalBDSL.g:611:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalBDSL.g:612:1: ( ruleMultiplication EOF )
            // InternalBDSL.g:613:1: ruleMultiplication EOF
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
    // InternalBDSL.g:620:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:624:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalBDSL.g:625:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalBDSL.g:625:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalBDSL.g:626:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalBDSL.g:627:3: ( rule__Multiplication__Group__0 )
            // InternalBDSL.g:627:4: rule__Multiplication__Group__0
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
    // InternalBDSL.g:636:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalBDSL.g:637:1: ( rulePrimaryExpression EOF )
            // InternalBDSL.g:638:1: rulePrimaryExpression EOF
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
    // InternalBDSL.g:645:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:649:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalBDSL.g:650:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalBDSL.g:650:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalBDSL.g:651:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalBDSL.g:652:3: ( rule__PrimaryExpression__Alternatives )
            // InternalBDSL.g:652:4: rule__PrimaryExpression__Alternatives
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


    // $ANTLR start "entryRuleMainDeclaration"
    // InternalBDSL.g:661:1: entryRuleMainDeclaration : ruleMainDeclaration EOF ;
    public final void entryRuleMainDeclaration() throws RecognitionException {
        try {
            // InternalBDSL.g:662:1: ( ruleMainDeclaration EOF )
            // InternalBDSL.g:663:1: ruleMainDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMainDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclarationRule()); 
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
    // $ANTLR end "entryRuleMainDeclaration"


    // $ANTLR start "ruleMainDeclaration"
    // InternalBDSL.g:670:1: ruleMainDeclaration : ( ( rule__MainDeclaration__Group__0 ) ) ;
    public final void ruleMainDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:674:2: ( ( ( rule__MainDeclaration__Group__0 ) ) )
            // InternalBDSL.g:675:2: ( ( rule__MainDeclaration__Group__0 ) )
            {
            // InternalBDSL.g:675:2: ( ( rule__MainDeclaration__Group__0 ) )
            // InternalBDSL.g:676:3: ( rule__MainDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclarationAccess().getGroup()); 
            }
            // InternalBDSL.g:677:3: ( rule__MainDeclaration__Group__0 )
            // InternalBDSL.g:677:4: rule__MainDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleMainDeclaration"


    // $ANTLR start "entryRuleAbstractMainStatements"
    // InternalBDSL.g:686:1: entryRuleAbstractMainStatements : ruleAbstractMainStatements EOF ;
    public final void entryRuleAbstractMainStatements() throws RecognitionException {
        try {
            // InternalBDSL.g:687:1: ( ruleAbstractMainStatements EOF )
            // InternalBDSL.g:688:1: ruleAbstractMainStatements EOF
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
    // InternalBDSL.g:695:1: ruleAbstractMainStatements : ( ( rule__AbstractMainStatements__Alternatives ) ) ;
    public final void ruleAbstractMainStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:699:2: ( ( ( rule__AbstractMainStatements__Alternatives ) ) )
            // InternalBDSL.g:700:2: ( ( rule__AbstractMainStatements__Alternatives ) )
            {
            // InternalBDSL.g:700:2: ( ( rule__AbstractMainStatements__Alternatives ) )
            // InternalBDSL.g:701:3: ( rule__AbstractMainStatements__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractMainStatementsAccess().getAlternatives()); 
            }
            // InternalBDSL.g:702:3: ( rule__AbstractMainStatements__Alternatives )
            // InternalBDSL.g:702:4: rule__AbstractMainStatements__Alternatives
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


    // $ANTLR start "entryRulePrintLn"
    // InternalBDSL.g:711:1: entryRulePrintLn : rulePrintLn EOF ;
    public final void entryRulePrintLn() throws RecognitionException {
        try {
            // InternalBDSL.g:712:1: ( rulePrintLn EOF )
            // InternalBDSL.g:713:1: rulePrintLn EOF
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
    // InternalBDSL.g:720:1: rulePrintLn : ( ( rule__PrintLn__Group__0 ) ) ;
    public final void rulePrintLn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:724:2: ( ( ( rule__PrintLn__Group__0 ) ) )
            // InternalBDSL.g:725:2: ( ( rule__PrintLn__Group__0 ) )
            {
            // InternalBDSL.g:725:2: ( ( rule__PrintLn__Group__0 ) )
            // InternalBDSL.g:726:3: ( rule__PrintLn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getGroup()); 
            }
            // InternalBDSL.g:727:3: ( rule__PrintLn__Group__0 )
            // InternalBDSL.g:727:4: rule__PrintLn__Group__0
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
    // InternalBDSL.g:736:1: entryRulePrintableExpression : rulePrintableExpression EOF ;
    public final void entryRulePrintableExpression() throws RecognitionException {
        try {
            // InternalBDSL.g:737:1: ( rulePrintableExpression EOF )
            // InternalBDSL.g:738:1: rulePrintableExpression EOF
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
    // InternalBDSL.g:745:1: rulePrintableExpression : ( ( rule__PrintableExpression__Alternatives ) ) ;
    public final void rulePrintableExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:749:2: ( ( ( rule__PrintableExpression__Alternatives ) ) )
            // InternalBDSL.g:750:2: ( ( rule__PrintableExpression__Alternatives ) )
            {
            // InternalBDSL.g:750:2: ( ( rule__PrintableExpression__Alternatives ) )
            // InternalBDSL.g:751:3: ( rule__PrintableExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintableExpressionAccess().getAlternatives()); 
            }
            // InternalBDSL.g:752:3: ( rule__PrintableExpression__Alternatives )
            // InternalBDSL.g:752:4: rule__PrintableExpression__Alternatives
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
    // InternalBDSL.g:761:1: ruleBinaryParallelOperator : ( ( rule__BinaryParallelOperator__Alternatives ) ) ;
    public final void ruleBinaryParallelOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:765:1: ( ( ( rule__BinaryParallelOperator__Alternatives ) ) )
            // InternalBDSL.g:766:2: ( ( rule__BinaryParallelOperator__Alternatives ) )
            {
            // InternalBDSL.g:766:2: ( ( rule__BinaryParallelOperator__Alternatives ) )
            // InternalBDSL.g:767:3: ( rule__BinaryParallelOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryParallelOperatorAccess().getAlternatives()); 
            }
            // InternalBDSL.g:768:3: ( rule__BinaryParallelOperator__Alternatives )
            // InternalBDSL.g:768:4: rule__BinaryParallelOperator__Alternatives
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
    // InternalBDSL.g:777:1: ruleBinaryNestingOperator : ( ( rule__BinaryNestingOperator__Alternatives ) ) ;
    public final void ruleBinaryNestingOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:781:1: ( ( ( rule__BinaryNestingOperator__Alternatives ) ) )
            // InternalBDSL.g:782:2: ( ( rule__BinaryNestingOperator__Alternatives ) )
            {
            // InternalBDSL.g:782:2: ( ( rule__BinaryNestingOperator__Alternatives ) )
            // InternalBDSL.g:783:3: ( rule__BinaryNestingOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryNestingOperatorAccess().getAlternatives()); 
            }
            // InternalBDSL.g:784:3: ( rule__BinaryNestingOperator__Alternatives )
            // InternalBDSL.g:784:4: rule__BinaryNestingOperator__Alternatives
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
    // InternalBDSL.g:793:1: ruleControlType : ( ( rule__ControlType__Alternatives ) ) ;
    public final void ruleControlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:797:1: ( ( ( rule__ControlType__Alternatives ) ) )
            // InternalBDSL.g:798:2: ( ( rule__ControlType__Alternatives ) )
            {
            // InternalBDSL.g:798:2: ( ( rule__ControlType__Alternatives ) )
            // InternalBDSL.g:799:3: ( rule__ControlType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlTypeAccess().getAlternatives()); 
            }
            // InternalBDSL.g:800:3: ( rule__ControlType__Alternatives )
            // InternalBDSL.g:800:4: rule__ControlType__Alternatives
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


    // $ANTLR start "ruleOutputModeModel"
    // InternalBDSL.g:809:1: ruleOutputModeModel : ( ( rule__OutputModeModel__Alternatives ) ) ;
    public final void ruleOutputModeModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:813:1: ( ( ( rule__OutputModeModel__Alternatives ) ) )
            // InternalBDSL.g:814:2: ( ( rule__OutputModeModel__Alternatives ) )
            {
            // InternalBDSL.g:814:2: ( ( rule__OutputModeModel__Alternatives ) )
            // InternalBDSL.g:815:3: ( rule__OutputModeModel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputModeModelAccess().getAlternatives()); 
            }
            // InternalBDSL.g:816:3: ( rule__OutputModeModel__Alternatives )
            // InternalBDSL.g:816:4: rule__OutputModeModel__Alternatives
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
    // InternalBDSL.g:824:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:828:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBDSL.g:829:2: ( RULE_STRING )
                    {
                    // InternalBDSL.g:829:2: ( RULE_STRING )
                    // InternalBDSL.g:830:3: RULE_STRING
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
                    // InternalBDSL.g:835:2: ( RULE_ID )
                    {
                    // InternalBDSL.g:835:2: ( RULE_ID )
                    // InternalBDSL.g:836:3: RULE_ID
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


    // $ANTLR start "rule__LinkNames__Alternatives"
    // InternalBDSL.g:845:1: rule__LinkNames__Alternatives : ( ( ruleNameConstant ) | ( ( rule__LinkNames__Group_1__0 ) ) );
    public final void rule__LinkNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:849:1: ( ( ruleNameConstant ) | ( ( rule__LinkNames__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_STRING && LA2_1<=RULE_ID)||LA2_1==41) ) {
                    alt2=1;
                }
                else if ( (LA2_1==34) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==34) ) {
                    alt2=2;
                }
                else if ( (LA2_2==EOF||(LA2_2>=RULE_STRING && LA2_2<=RULE_ID)||LA2_2==41) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBDSL.g:850:2: ( ruleNameConstant )
                    {
                    // InternalBDSL.g:850:2: ( ruleNameConstant )
                    // InternalBDSL.g:851:3: ruleNameConstant
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
                    // InternalBDSL.g:856:2: ( ( rule__LinkNames__Group_1__0 ) )
                    {
                    // InternalBDSL.g:856:2: ( ( rule__LinkNames__Group_1__0 ) )
                    // InternalBDSL.g:857:3: ( rule__LinkNames__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLinkNamesAccess().getGroup_1()); 
                    }
                    // InternalBDSL.g:858:3: ( rule__LinkNames__Group_1__0 )
                    // InternalBDSL.g:858:4: rule__LinkNames__Group_1__0
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
    // InternalBDSL.g:866:1: rule__AbstractBigraphDeclaration__Alternatives : ( ( ruleBigraphVarReference ) | ( ruleNodeExpressionCall ) | ( ruleLVD2 ) | ( ruleSite ) );
    public final void rule__AbstractBigraphDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:870:1: ( ( ruleBigraphVarReference ) | ( ruleNodeExpressionCall ) | ( ruleLVD2 ) | ( ruleSite ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            case 35:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBDSL.g:871:2: ( ruleBigraphVarReference )
                    {
                    // InternalBDSL.g:871:2: ( ruleBigraphVarReference )
                    // InternalBDSL.g:872:3: ruleBigraphVarReference
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
                    // InternalBDSL.g:877:2: ( ruleNodeExpressionCall )
                    {
                    // InternalBDSL.g:877:2: ( ruleNodeExpressionCall )
                    // InternalBDSL.g:878:3: ruleNodeExpressionCall
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
                    // InternalBDSL.g:883:2: ( ruleLVD2 )
                    {
                    // InternalBDSL.g:883:2: ( ruleLVD2 )
                    // InternalBDSL.g:884:3: ruleLVD2
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
                    // InternalBDSL.g:889:2: ( ruleSite )
                    {
                    // InternalBDSL.g:889:2: ( ruleSite )
                    // InternalBDSL.g:890:3: ruleSite
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

            }
        }
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
    // InternalBDSL.g:899:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleAbstractBigraphDeclaration ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:903:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleAbstractBigraphDeclaration ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==25||LA4_0==35||LA4_0==38) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBDSL.g:904:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalBDSL.g:904:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalBDSL.g:905:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalBDSL.g:906:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalBDSL.g:906:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalBDSL.g:910:2: ( ruleAbstractBigraphDeclaration )
                    {
                    // InternalBDSL.g:910:2: ( ruleAbstractBigraphDeclaration )
                    // InternalBDSL.g:911:3: ruleAbstractBigraphDeclaration
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
    // InternalBDSL.g:920:1: rule__AbstractMainStatements__Alternatives : ( ( ruleBigraphVarReference ) | ( rulePrintLn ) );
    public final void rule__AbstractMainStatements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:924:1: ( ( ruleBigraphVarReference ) | ( rulePrintLn ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==42) ) {
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
                    // InternalBDSL.g:925:2: ( ruleBigraphVarReference )
                    {
                    // InternalBDSL.g:925:2: ( ruleBigraphVarReference )
                    // InternalBDSL.g:926:3: ruleBigraphVarReference
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
                    // InternalBDSL.g:931:2: ( rulePrintLn )
                    {
                    // InternalBDSL.g:931:2: ( rulePrintLn )
                    // InternalBDSL.g:932:3: rulePrintLn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractMainStatementsAccess().getPrintLnParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrintLn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractMainStatementsAccess().getPrintLnParserRuleCall_1()); 
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
    // InternalBDSL.g:941:1: rule__PrintableExpression__Alternatives : ( ( ( rule__PrintableExpression__Group_0__0 ) ) | ( ruleBigraphVarReference ) );
    public final void rule__PrintableExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:945:1: ( ( ( rule__PrintableExpression__Group_0__0 ) ) | ( ruleBigraphVarReference ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBDSL.g:946:2: ( ( rule__PrintableExpression__Group_0__0 ) )
                    {
                    // InternalBDSL.g:946:2: ( ( rule__PrintableExpression__Group_0__0 ) )
                    // InternalBDSL.g:947:3: ( rule__PrintableExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrintableExpressionAccess().getGroup_0()); 
                    }
                    // InternalBDSL.g:948:3: ( rule__PrintableExpression__Group_0__0 )
                    // InternalBDSL.g:948:4: rule__PrintableExpression__Group_0__0
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
                    // InternalBDSL.g:952:2: ( ruleBigraphVarReference )
                    {
                    // InternalBDSL.g:952:2: ( ruleBigraphVarReference )
                    // InternalBDSL.g:953:3: ruleBigraphVarReference
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
    // InternalBDSL.g:962:1: rule__BinaryParallelOperator__Alternatives : ( ( ( 'UNSET' ) ) | ( ( '|' ) ) | ( ( '||' ) ) );
    public final void rule__BinaryParallelOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:966:1: ( ( ( 'UNSET' ) ) | ( ( '|' ) ) | ( ( '||' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBDSL.g:967:2: ( ( 'UNSET' ) )
                    {
                    // InternalBDSL.g:967:2: ( ( 'UNSET' ) )
                    // InternalBDSL.g:968:3: ( 'UNSET' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryParallelOperatorAccess().getUNSETEnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:969:3: ( 'UNSET' )
                    // InternalBDSL.g:969:4: 'UNSET'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryParallelOperatorAccess().getUNSETEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:973:2: ( ( '|' ) )
                    {
                    // InternalBDSL.g:973:2: ( ( '|' ) )
                    // InternalBDSL.g:974:3: ( '|' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryParallelOperatorAccess().getMERGEEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:975:3: ( '|' )
                    // InternalBDSL.g:975:4: '|'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryParallelOperatorAccess().getMERGEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:979:2: ( ( '||' ) )
                    {
                    // InternalBDSL.g:979:2: ( ( '||' ) )
                    // InternalBDSL.g:980:3: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryParallelOperatorAccess().getPARALLELEnumLiteralDeclaration_2()); 
                    }
                    // InternalBDSL.g:981:3: ( '||' )
                    // InternalBDSL.g:981:4: '||'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

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
    // InternalBDSL.g:989:1: rule__BinaryNestingOperator__Alternatives : ( ( ( 'UNSET2' ) ) | ( ( '-' ) ) | ( ( '*' ) ) );
    public final void rule__BinaryNestingOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:993:1: ( ( ( 'UNSET2' ) ) | ( ( '-' ) ) | ( ( '*' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
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
                    // InternalBDSL.g:994:2: ( ( 'UNSET2' ) )
                    {
                    // InternalBDSL.g:994:2: ( ( 'UNSET2' ) )
                    // InternalBDSL.g:995:3: ( 'UNSET2' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryNestingOperatorAccess().getUNSET2EnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:996:3: ( 'UNSET2' )
                    // InternalBDSL.g:996:4: 'UNSET2'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryNestingOperatorAccess().getUNSET2EnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1000:2: ( ( '-' ) )
                    {
                    // InternalBDSL.g:1000:2: ( ( '-' ) )
                    // InternalBDSL.g:1001:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryNestingOperatorAccess().getNESTINGEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:1002:3: ( '-' )
                    // InternalBDSL.g:1002:4: '-'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryNestingOperatorAccess().getNESTINGEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1006:2: ( ( '*' ) )
                    {
                    // InternalBDSL.g:1006:2: ( ( '*' ) )
                    // InternalBDSL.g:1007:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryNestingOperatorAccess().getCOMPOSITIONEnumLiteralDeclaration_2()); 
                    }
                    // InternalBDSL.g:1008:3: ( '*' )
                    // InternalBDSL.g:1008:4: '*'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

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
    // InternalBDSL.g:1016:1: rule__ControlType__Alternatives : ( ( ( 'atomic' ) ) | ( ( 'active' ) ) | ( ( 'passive' ) ) );
    public final void rule__ControlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1020:1: ( ( ( 'atomic' ) ) | ( ( 'active' ) ) | ( ( 'passive' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
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
                    // InternalBDSL.g:1021:2: ( ( 'atomic' ) )
                    {
                    // InternalBDSL.g:1021:2: ( ( 'atomic' ) )
                    // InternalBDSL.g:1022:3: ( 'atomic' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlTypeAccess().getATOMICEnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:1023:3: ( 'atomic' )
                    // InternalBDSL.g:1023:4: 'atomic'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getControlTypeAccess().getATOMICEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1027:2: ( ( 'active' ) )
                    {
                    // InternalBDSL.g:1027:2: ( ( 'active' ) )
                    // InternalBDSL.g:1028:3: ( 'active' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlTypeAccess().getACTIVEEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:1029:3: ( 'active' )
                    // InternalBDSL.g:1029:4: 'active'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getControlTypeAccess().getACTIVEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:1033:2: ( ( 'passive' ) )
                    {
                    // InternalBDSL.g:1033:2: ( ( 'passive' ) )
                    // InternalBDSL.g:1034:3: ( 'passive' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlTypeAccess().getPASSIVEEnumLiteralDeclaration_2()); 
                    }
                    // InternalBDSL.g:1035:3: ( 'passive' )
                    // InternalBDSL.g:1035:4: 'passive'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__OutputModeModel__Alternatives"
    // InternalBDSL.g:1043:1: rule__OutputModeModel__Alternatives : ( ( ( 'xmi' ) ) | ( ( 'ecore' ) ) );
    public final void rule__OutputModeModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1047:1: ( ( ( 'xmi' ) ) | ( ( 'ecore' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBDSL.g:1048:2: ( ( 'xmi' ) )
                    {
                    // InternalBDSL.g:1048:2: ( ( 'xmi' ) )
                    // InternalBDSL.g:1049:3: ( 'xmi' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputModeModelAccess().getINSTANCE_MODELEnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:1050:3: ( 'xmi' )
                    // InternalBDSL.g:1050:4: 'xmi'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOutputModeModelAccess().getINSTANCE_MODELEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:1054:2: ( ( 'ecore' ) )
                    {
                    // InternalBDSL.g:1054:2: ( ( 'ecore' ) )
                    // InternalBDSL.g:1055:3: ( 'ecore' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputModeModelAccess().getMETA_MODELEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:1056:3: ( 'ecore' )
                    // InternalBDSL.g:1056:4: 'ecore'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

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
    // InternalBDSL.g:1064:1: rule__BRSModel__Group__0 : rule__BRSModel__Group__0__Impl rule__BRSModel__Group__1 ;
    public final void rule__BRSModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1068:1: ( rule__BRSModel__Group__0__Impl rule__BRSModel__Group__1 )
            // InternalBDSL.g:1069:2: rule__BRSModel__Group__0__Impl rule__BRSModel__Group__1
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
    // InternalBDSL.g:1076:1: rule__BRSModel__Group__0__Impl : ( ( rule__BRSModel__SignatureAssignment_0 )* ) ;
    public final void rule__BRSModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1080:1: ( ( ( rule__BRSModel__SignatureAssignment_0 )* ) )
            // InternalBDSL.g:1081:1: ( ( rule__BRSModel__SignatureAssignment_0 )* )
            {
            // InternalBDSL.g:1081:1: ( ( rule__BRSModel__SignatureAssignment_0 )* )
            // InternalBDSL.g:1082:2: ( rule__BRSModel__SignatureAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSModelAccess().getSignatureAssignment_0()); 
            }
            // InternalBDSL.g:1083:2: ( rule__BRSModel__SignatureAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBDSL.g:1083:3: rule__BRSModel__SignatureAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__BRSModel__SignatureAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalBDSL.g:1091:1: rule__BRSModel__Group__1 : rule__BRSModel__Group__1__Impl ;
    public final void rule__BRSModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1095:1: ( rule__BRSModel__Group__1__Impl )
            // InternalBDSL.g:1096:2: rule__BRSModel__Group__1__Impl
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
    // InternalBDSL.g:1102:1: rule__BRSModel__Group__1__Impl : ( ( rule__BRSModel__UnorderedGroup_1 ) ) ;
    public final void rule__BRSModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1106:1: ( ( ( rule__BRSModel__UnorderedGroup_1 ) ) )
            // InternalBDSL.g:1107:1: ( ( rule__BRSModel__UnorderedGroup_1 ) )
            {
            // InternalBDSL.g:1107:1: ( ( rule__BRSModel__UnorderedGroup_1 ) )
            // InternalBDSL.g:1108:2: ( rule__BRSModel__UnorderedGroup_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSModelAccess().getUnorderedGroup_1()); 
            }
            // InternalBDSL.g:1109:2: ( rule__BRSModel__UnorderedGroup_1 )
            // InternalBDSL.g:1109:3: rule__BRSModel__UnorderedGroup_1
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
    // InternalBDSL.g:1118:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1122:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalBDSL.g:1123:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalBDSL.g:1130:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1134:1: ( ( RULE_ID ) )
            // InternalBDSL.g:1135:1: ( RULE_ID )
            {
            // InternalBDSL.g:1135:1: ( RULE_ID )
            // InternalBDSL.g:1136:2: RULE_ID
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
    // InternalBDSL.g:1145:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1149:1: ( rule__FQN__Group__1__Impl )
            // InternalBDSL.g:1150:2: rule__FQN__Group__1__Impl
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
    // InternalBDSL.g:1156:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1160:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalBDSL.g:1161:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalBDSL.g:1161:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalBDSL.g:1162:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalBDSL.g:1163:2: ( rule__FQN__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBDSL.g:1163:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalBDSL.g:1172:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1176:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalBDSL.g:1177:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalBDSL.g:1184:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1188:1: ( ( '.' ) )
            // InternalBDSL.g:1189:1: ( '.' )
            {
            // InternalBDSL.g:1189:1: ( '.' )
            // InternalBDSL.g:1190:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1199:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1203:1: ( rule__FQN__Group_1__1__Impl )
            // InternalBDSL.g:1204:2: rule__FQN__Group_1__1__Impl
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
    // InternalBDSL.g:1210:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1214:1: ( ( RULE_ID ) )
            // InternalBDSL.g:1215:1: ( RULE_ID )
            {
            // InternalBDSL.g:1215:1: ( RULE_ID )
            // InternalBDSL.g:1216:2: RULE_ID
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
    // InternalBDSL.g:1226:1: rule__FqnWithWildCard__Group__0 : rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 ;
    public final void rule__FqnWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1230:1: ( rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 )
            // InternalBDSL.g:1231:2: rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1
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
    // InternalBDSL.g:1238:1: rule__FqnWithWildCard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1242:1: ( ( ruleFQN ) )
            // InternalBDSL.g:1243:1: ( ruleFQN )
            {
            // InternalBDSL.g:1243:1: ( ruleFQN )
            // InternalBDSL.g:1244:2: ruleFQN
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
    // InternalBDSL.g:1253:1: rule__FqnWithWildCard__Group__1 : rule__FqnWithWildCard__Group__1__Impl ;
    public final void rule__FqnWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1257:1: ( rule__FqnWithWildCard__Group__1__Impl )
            // InternalBDSL.g:1258:2: rule__FqnWithWildCard__Group__1__Impl
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
    // InternalBDSL.g:1264:1: rule__FqnWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1268:1: ( ( ( '.*' )? ) )
            // InternalBDSL.g:1269:1: ( ( '.*' )? )
            {
            // InternalBDSL.g:1269:1: ( ( '.*' )? )
            // InternalBDSL.g:1270:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalBDSL.g:1271:2: ( '.*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBDSL.g:1271:3: '.*'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

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
    // InternalBDSL.g:1280:1: rule__BigraphVarReferenceID__Group__0 : rule__BigraphVarReferenceID__Group__0__Impl rule__BigraphVarReferenceID__Group__1 ;
    public final void rule__BigraphVarReferenceID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1284:1: ( rule__BigraphVarReferenceID__Group__0__Impl rule__BigraphVarReferenceID__Group__1 )
            // InternalBDSL.g:1285:2: rule__BigraphVarReferenceID__Group__0__Impl rule__BigraphVarReferenceID__Group__1
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
    // InternalBDSL.g:1292:1: rule__BigraphVarReferenceID__Group__0__Impl : ( '$' ) ;
    public final void rule__BigraphVarReferenceID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1296:1: ( ( '$' ) )
            // InternalBDSL.g:1297:1: ( '$' )
            {
            // InternalBDSL.g:1297:1: ( '$' )
            // InternalBDSL.g:1298:2: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceIDAccess().getDollarSignKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1307:1: rule__BigraphVarReferenceID__Group__1 : rule__BigraphVarReferenceID__Group__1__Impl ;
    public final void rule__BigraphVarReferenceID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1311:1: ( rule__BigraphVarReferenceID__Group__1__Impl )
            // InternalBDSL.g:1312:2: rule__BigraphVarReferenceID__Group__1__Impl
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
    // InternalBDSL.g:1318:1: rule__BigraphVarReferenceID__Group__1__Impl : ( ruleFQN ) ;
    public final void rule__BigraphVarReferenceID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1322:1: ( ( ruleFQN ) )
            // InternalBDSL.g:1323:1: ( ruleFQN )
            {
            // InternalBDSL.g:1323:1: ( ruleFQN )
            // InternalBDSL.g:1324:2: ruleFQN
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBDSL.g:1334:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1338:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBDSL.g:1339:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalBDSL.g:1346:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1350:1: ( ( ( '-' )? ) )
            // InternalBDSL.g:1351:1: ( ( '-' )? )
            {
            // InternalBDSL.g:1351:1: ( ( '-' )? )
            // InternalBDSL.g:1352:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalBDSL.g:1353:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBDSL.g:1353:3: '-'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalBDSL.g:1361:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1365:1: ( rule__EInt__Group__1__Impl )
            // InternalBDSL.g:1366:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalBDSL.g:1372:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1376:1: ( ( RULE_INT ) )
            // InternalBDSL.g:1377:1: ( RULE_INT )
            {
            // InternalBDSL.g:1377:1: ( RULE_INT )
            // InternalBDSL.g:1378:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__MainElement__Group__0"
    // InternalBDSL.g:1388:1: rule__MainElement__Group__0 : rule__MainElement__Group__0__Impl rule__MainElement__Group__1 ;
    public final void rule__MainElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1392:1: ( rule__MainElement__Group__0__Impl rule__MainElement__Group__1 )
            // InternalBDSL.g:1393:2: rule__MainElement__Group__0__Impl rule__MainElement__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBDSL.g:1400:1: rule__MainElement__Group__0__Impl : ( 'main' ) ;
    public final void rule__MainElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1404:1: ( ( 'main' ) )
            // InternalBDSL.g:1405:1: ( 'main' )
            {
            // InternalBDSL.g:1405:1: ( 'main' )
            // InternalBDSL.g:1406:2: 'main'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getMainKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1415:1: rule__MainElement__Group__1 : rule__MainElement__Group__1__Impl rule__MainElement__Group__2 ;
    public final void rule__MainElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1419:1: ( rule__MainElement__Group__1__Impl rule__MainElement__Group__2 )
            // InternalBDSL.g:1420:2: rule__MainElement__Group__1__Impl rule__MainElement__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBDSL.g:1427:1: rule__MainElement__Group__1__Impl : ( '=' ) ;
    public final void rule__MainElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1431:1: ( ( '=' ) )
            // InternalBDSL.g:1432:1: ( '=' )
            {
            // InternalBDSL.g:1432:1: ( '=' )
            // InternalBDSL.g:1433:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getEqualsSignKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1442:1: rule__MainElement__Group__2 : rule__MainElement__Group__2__Impl rule__MainElement__Group__3 ;
    public final void rule__MainElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1446:1: ( rule__MainElement__Group__2__Impl rule__MainElement__Group__3 )
            // InternalBDSL.g:1447:2: rule__MainElement__Group__2__Impl rule__MainElement__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalBDSL.g:1454:1: rule__MainElement__Group__2__Impl : ( '{' ) ;
    public final void rule__MainElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1458:1: ( ( '{' ) )
            // InternalBDSL.g:1459:1: ( '{' )
            {
            // InternalBDSL.g:1459:1: ( '{' )
            // InternalBDSL.g:1460:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1469:1: rule__MainElement__Group__3 : rule__MainElement__Group__3__Impl rule__MainElement__Group__4 ;
    public final void rule__MainElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1473:1: ( rule__MainElement__Group__3__Impl rule__MainElement__Group__4 )
            // InternalBDSL.g:1474:2: rule__MainElement__Group__3__Impl rule__MainElement__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalBDSL.g:1481:1: rule__MainElement__Group__3__Impl : ( () ) ;
    public final void rule__MainElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1485:1: ( ( () ) )
            // InternalBDSL.g:1486:1: ( () )
            {
            // InternalBDSL.g:1486:1: ( () )
            // InternalBDSL.g:1487:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getMainElementAction_3()); 
            }
            // InternalBDSL.g:1488:2: ()
            // InternalBDSL.g:1488:3: 
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
    // InternalBDSL.g:1496:1: rule__MainElement__Group__4 : rule__MainElement__Group__4__Impl rule__MainElement__Group__5 ;
    public final void rule__MainElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1500:1: ( rule__MainElement__Group__4__Impl rule__MainElement__Group__5 )
            // InternalBDSL.g:1501:2: rule__MainElement__Group__4__Impl rule__MainElement__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalBDSL.g:1508:1: rule__MainElement__Group__4__Impl : ( ( rule__MainElement__ValueAssignment_4 )* ) ;
    public final void rule__MainElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1512:1: ( ( ( rule__MainElement__ValueAssignment_4 )* ) )
            // InternalBDSL.g:1513:1: ( ( rule__MainElement__ValueAssignment_4 )* )
            {
            // InternalBDSL.g:1513:1: ( ( rule__MainElement__ValueAssignment_4 )* )
            // InternalBDSL.g:1514:2: ( rule__MainElement__ValueAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getValueAssignment_4()); 
            }
            // InternalBDSL.g:1515:2: ( rule__MainElement__ValueAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25||LA15_0==42) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBDSL.g:1515:3: rule__MainElement__ValueAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MainElement__ValueAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalBDSL.g:1523:1: rule__MainElement__Group__5 : rule__MainElement__Group__5__Impl rule__MainElement__Group__6 ;
    public final void rule__MainElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1527:1: ( rule__MainElement__Group__5__Impl rule__MainElement__Group__6 )
            // InternalBDSL.g:1528:2: rule__MainElement__Group__5__Impl rule__MainElement__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__MainElement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainElement__Group__6();

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
    // InternalBDSL.g:1535:1: rule__MainElement__Group__5__Impl : ( '}' ) ;
    public final void rule__MainElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1539:1: ( ( '}' ) )
            // InternalBDSL.g:1540:1: ( '}' )
            {
            // InternalBDSL.g:1540:1: ( '}' )
            // InternalBDSL.g:1541:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__MainElement__Group__6"
    // InternalBDSL.g:1550:1: rule__MainElement__Group__6 : rule__MainElement__Group__6__Impl ;
    public final void rule__MainElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1554:1: ( rule__MainElement__Group__6__Impl )
            // InternalBDSL.g:1555:2: rule__MainElement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainElement__Group__6__Impl();

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
    // $ANTLR end "rule__MainElement__Group__6"


    // $ANTLR start "rule__MainElement__Group__6__Impl"
    // InternalBDSL.g:1561:1: rule__MainElement__Group__6__Impl : ( ';' ) ;
    public final void rule__MainElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1565:1: ( ( ';' ) )
            // InternalBDSL.g:1566:1: ( ';' )
            {
            // InternalBDSL.g:1566:1: ( ';' )
            // InternalBDSL.g:1567:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getSemicolonKeyword_6()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementAccess().getSemicolonKeyword_6()); 
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
    // $ANTLR end "rule__MainElement__Group__6__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalBDSL.g:1577:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1581:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalBDSL.g:1582:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBDSL.g:1589:1: rule__Signature__Group__0__Impl : ( () ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1593:1: ( ( () ) )
            // InternalBDSL.g:1594:1: ( () )
            {
            // InternalBDSL.g:1594:1: ( () )
            // InternalBDSL.g:1595:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSignatureAction_0()); 
            }
            // InternalBDSL.g:1596:2: ()
            // InternalBDSL.g:1596:3: 
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
    // InternalBDSL.g:1604:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1608:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalBDSL.g:1609:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
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
    // InternalBDSL.g:1616:1: rule__Signature__Group__1__Impl : ( 'signature' ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1620:1: ( ( 'signature' ) )
            // InternalBDSL.g:1621:1: ( 'signature' )
            {
            // InternalBDSL.g:1621:1: ( 'signature' )
            // InternalBDSL.g:1622:2: 'signature'
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
    // InternalBDSL.g:1631:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1635:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalBDSL.g:1636:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBDSL.g:1643:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__NameAssignment_2 ) ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1647:1: ( ( ( rule__Signature__NameAssignment_2 ) ) )
            // InternalBDSL.g:1648:1: ( ( rule__Signature__NameAssignment_2 ) )
            {
            // InternalBDSL.g:1648:1: ( ( rule__Signature__NameAssignment_2 ) )
            // InternalBDSL.g:1649:2: ( rule__Signature__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getNameAssignment_2()); 
            }
            // InternalBDSL.g:1650:2: ( rule__Signature__NameAssignment_2 )
            // InternalBDSL.g:1650:3: rule__Signature__NameAssignment_2
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
    // InternalBDSL.g:1658:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1662:1: ( rule__Signature__Group__3__Impl )
            // InternalBDSL.g:1663:2: rule__Signature__Group__3__Impl
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
    // InternalBDSL.g:1669:1: rule__Signature__Group__3__Impl : ( ( rule__Signature__Group_3__0 )? ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1673:1: ( ( ( rule__Signature__Group_3__0 )? ) )
            // InternalBDSL.g:1674:1: ( ( rule__Signature__Group_3__0 )? )
            {
            // InternalBDSL.g:1674:1: ( ( rule__Signature__Group_3__0 )? )
            // InternalBDSL.g:1675:2: ( rule__Signature__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_3()); 
            }
            // InternalBDSL.g:1676:2: ( rule__Signature__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBDSL.g:1676:3: rule__Signature__Group_3__0
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
    // InternalBDSL.g:1685:1: rule__Signature__Group_3__0 : rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 ;
    public final void rule__Signature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1689:1: ( rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 )
            // InternalBDSL.g:1690:2: rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBDSL.g:1697:1: rule__Signature__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Signature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1701:1: ( ( '{' ) )
            // InternalBDSL.g:1702:1: ( '{' )
            {
            // InternalBDSL.g:1702:1: ( '{' )
            // InternalBDSL.g:1703:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1712:1: rule__Signature__Group_3__1 : rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 ;
    public final void rule__Signature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1716:1: ( rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 )
            // InternalBDSL.g:1717:2: rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalBDSL.g:1724:1: rule__Signature__Group_3__1__Impl : ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) ) ;
    public final void rule__Signature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1728:1: ( ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) ) )
            // InternalBDSL.g:1729:1: ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) )
            {
            // InternalBDSL.g:1729:1: ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) )
            // InternalBDSL.g:1730:2: ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* )
            {
            // InternalBDSL.g:1730:2: ( ( rule__Signature__ControlsAssignment_3_1 ) )
            // InternalBDSL.g:1731:3: ( rule__Signature__ControlsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getControlsAssignment_3_1()); 
            }
            // InternalBDSL.g:1732:3: ( rule__Signature__ControlsAssignment_3_1 )
            // InternalBDSL.g:1732:4: rule__Signature__ControlsAssignment_3_1
            {
            pushFollow(FOLLOW_18);
            rule__Signature__ControlsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getControlsAssignment_3_1()); 
            }

            }

            // InternalBDSL.g:1735:2: ( ( rule__Signature__ControlsAssignment_3_1 )* )
            // InternalBDSL.g:1736:3: ( rule__Signature__ControlsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getControlsAssignment_3_1()); 
            }
            // InternalBDSL.g:1737:3: ( rule__Signature__ControlsAssignment_3_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=18 && LA17_0<=20)||LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBDSL.g:1737:4: rule__Signature__ControlsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Signature__ControlsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBDSL.g:1746:1: rule__Signature__Group_3__2 : rule__Signature__Group_3__2__Impl ;
    public final void rule__Signature__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1750:1: ( rule__Signature__Group_3__2__Impl )
            // InternalBDSL.g:1751:2: rule__Signature__Group_3__2__Impl
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
    // InternalBDSL.g:1757:1: rule__Signature__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Signature__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1761:1: ( ( '}' ) )
            // InternalBDSL.g:1762:1: ( '}' )
            {
            // InternalBDSL.g:1762:1: ( '}' )
            // InternalBDSL.g:1763:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_3_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1773:1: rule__ControlDef__Group__0 : rule__ControlDef__Group__0__Impl rule__ControlDef__Group__1 ;
    public final void rule__ControlDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1777:1: ( rule__ControlDef__Group__0__Impl rule__ControlDef__Group__1 )
            // InternalBDSL.g:1778:2: rule__ControlDef__Group__0__Impl rule__ControlDef__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBDSL.g:1785:1: rule__ControlDef__Group__0__Impl : ( () ) ;
    public final void rule__ControlDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1789:1: ( ( () ) )
            // InternalBDSL.g:1790:1: ( () )
            {
            // InternalBDSL.g:1790:1: ( () )
            // InternalBDSL.g:1791:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getControlVariableAction_0()); 
            }
            // InternalBDSL.g:1792:2: ()
            // InternalBDSL.g:1792:3: 
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
    // InternalBDSL.g:1800:1: rule__ControlDef__Group__1 : rule__ControlDef__Group__1__Impl rule__ControlDef__Group__2 ;
    public final void rule__ControlDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1804:1: ( rule__ControlDef__Group__1__Impl rule__ControlDef__Group__2 )
            // InternalBDSL.g:1805:2: rule__ControlDef__Group__1__Impl rule__ControlDef__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBDSL.g:1812:1: rule__ControlDef__Group__1__Impl : ( ( rule__ControlDef__TypeAssignment_1 )? ) ;
    public final void rule__ControlDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1816:1: ( ( ( rule__ControlDef__TypeAssignment_1 )? ) )
            // InternalBDSL.g:1817:1: ( ( rule__ControlDef__TypeAssignment_1 )? )
            {
            // InternalBDSL.g:1817:1: ( ( rule__ControlDef__TypeAssignment_1 )? )
            // InternalBDSL.g:1818:2: ( rule__ControlDef__TypeAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getTypeAssignment_1()); 
            }
            // InternalBDSL.g:1819:2: ( rule__ControlDef__TypeAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=18 && LA18_0<=20)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBDSL.g:1819:3: rule__ControlDef__TypeAssignment_1
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
    // InternalBDSL.g:1827:1: rule__ControlDef__Group__2 : rule__ControlDef__Group__2__Impl rule__ControlDef__Group__3 ;
    public final void rule__ControlDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1831:1: ( rule__ControlDef__Group__2__Impl rule__ControlDef__Group__3 )
            // InternalBDSL.g:1832:2: rule__ControlDef__Group__2__Impl rule__ControlDef__Group__3
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
    // InternalBDSL.g:1839:1: rule__ControlDef__Group__2__Impl : ( 'ctrl' ) ;
    public final void rule__ControlDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1843:1: ( ( 'ctrl' ) )
            // InternalBDSL.g:1844:1: ( 'ctrl' )
            {
            // InternalBDSL.g:1844:1: ( 'ctrl' )
            // InternalBDSL.g:1845:2: 'ctrl'
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
    // InternalBDSL.g:1854:1: rule__ControlDef__Group__3 : rule__ControlDef__Group__3__Impl rule__ControlDef__Group__4 ;
    public final void rule__ControlDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1858:1: ( rule__ControlDef__Group__3__Impl rule__ControlDef__Group__4 )
            // InternalBDSL.g:1859:2: rule__ControlDef__Group__3__Impl rule__ControlDef__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalBDSL.g:1866:1: rule__ControlDef__Group__3__Impl : ( ( rule__ControlDef__NameAssignment_3 ) ) ;
    public final void rule__ControlDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1870:1: ( ( ( rule__ControlDef__NameAssignment_3 ) ) )
            // InternalBDSL.g:1871:1: ( ( rule__ControlDef__NameAssignment_3 ) )
            {
            // InternalBDSL.g:1871:1: ( ( rule__ControlDef__NameAssignment_3 ) )
            // InternalBDSL.g:1872:2: ( rule__ControlDef__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getNameAssignment_3()); 
            }
            // InternalBDSL.g:1873:2: ( rule__ControlDef__NameAssignment_3 )
            // InternalBDSL.g:1873:3: rule__ControlDef__NameAssignment_3
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
    // InternalBDSL.g:1881:1: rule__ControlDef__Group__4 : rule__ControlDef__Group__4__Impl rule__ControlDef__Group__5 ;
    public final void rule__ControlDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1885:1: ( rule__ControlDef__Group__4__Impl rule__ControlDef__Group__5 )
            // InternalBDSL.g:1886:2: rule__ControlDef__Group__4__Impl rule__ControlDef__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalBDSL.g:1893:1: rule__ControlDef__Group__4__Impl : ( 'arity' ) ;
    public final void rule__ControlDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1897:1: ( ( 'arity' ) )
            // InternalBDSL.g:1898:1: ( 'arity' )
            {
            // InternalBDSL.g:1898:1: ( 'arity' )
            // InternalBDSL.g:1899:2: 'arity'
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
    // InternalBDSL.g:1908:1: rule__ControlDef__Group__5 : rule__ControlDef__Group__5__Impl rule__ControlDef__Group__6 ;
    public final void rule__ControlDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1912:1: ( rule__ControlDef__Group__5__Impl rule__ControlDef__Group__6 )
            // InternalBDSL.g:1913:2: rule__ControlDef__Group__5__Impl rule__ControlDef__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ControlDef__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ControlDef__Group__6();

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
    // InternalBDSL.g:1920:1: rule__ControlDef__Group__5__Impl : ( ( rule__ControlDef__ArityAssignment_5 ) ) ;
    public final void rule__ControlDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1924:1: ( ( ( rule__ControlDef__ArityAssignment_5 ) ) )
            // InternalBDSL.g:1925:1: ( ( rule__ControlDef__ArityAssignment_5 ) )
            {
            // InternalBDSL.g:1925:1: ( ( rule__ControlDef__ArityAssignment_5 ) )
            // InternalBDSL.g:1926:2: ( rule__ControlDef__ArityAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getArityAssignment_5()); 
            }
            // InternalBDSL.g:1927:2: ( rule__ControlDef__ArityAssignment_5 )
            // InternalBDSL.g:1927:3: rule__ControlDef__ArityAssignment_5
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


    // $ANTLR start "rule__ControlDef__Group__6"
    // InternalBDSL.g:1935:1: rule__ControlDef__Group__6 : rule__ControlDef__Group__6__Impl ;
    public final void rule__ControlDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1939:1: ( rule__ControlDef__Group__6__Impl )
            // InternalBDSL.g:1940:2: rule__ControlDef__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ControlDef__Group__6__Impl();

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
    // $ANTLR end "rule__ControlDef__Group__6"


    // $ANTLR start "rule__ControlDef__Group__6__Impl"
    // InternalBDSL.g:1946:1: rule__ControlDef__Group__6__Impl : ( ';' ) ;
    public final void rule__ControlDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1950:1: ( ( ';' ) )
            // InternalBDSL.g:1951:1: ( ';' )
            {
            // InternalBDSL.g:1951:1: ( ';' )
            // InternalBDSL.g:1952:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getSemicolonKeyword_6()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getSemicolonKeyword_6()); 
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
    // $ANTLR end "rule__ControlDef__Group__6__Impl"


    // $ANTLR start "rule__LinkNames__Group_1__0"
    // InternalBDSL.g:1962:1: rule__LinkNames__Group_1__0 : rule__LinkNames__Group_1__0__Impl rule__LinkNames__Group_1__1 ;
    public final void rule__LinkNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1966:1: ( rule__LinkNames__Group_1__0__Impl rule__LinkNames__Group_1__1 )
            // InternalBDSL.g:1967:2: rule__LinkNames__Group_1__0__Impl rule__LinkNames__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalBDSL.g:1974:1: rule__LinkNames__Group_1__0__Impl : ( ruleNameConstant ) ;
    public final void rule__LinkNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1978:1: ( ( ruleNameConstant ) )
            // InternalBDSL.g:1979:1: ( ruleNameConstant )
            {
            // InternalBDSL.g:1979:1: ( ruleNameConstant )
            // InternalBDSL.g:1980:2: ruleNameConstant
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
    // InternalBDSL.g:1989:1: rule__LinkNames__Group_1__1 : rule__LinkNames__Group_1__1__Impl ;
    public final void rule__LinkNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1993:1: ( rule__LinkNames__Group_1__1__Impl )
            // InternalBDSL.g:1994:2: rule__LinkNames__Group_1__1__Impl
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
    // InternalBDSL.g:2000:1: rule__LinkNames__Group_1__1__Impl : ( ',' ) ;
    public final void rule__LinkNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2004:1: ( ( ',' ) )
            // InternalBDSL.g:2005:1: ( ',' )
            {
            // InternalBDSL.g:2005:1: ( ',' )
            // InternalBDSL.g:2006:2: ','
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
    // InternalBDSL.g:2016:1: rule__Site__Group__0 : rule__Site__Group__0__Impl rule__Site__Group__1 ;
    public final void rule__Site__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2020:1: ( rule__Site__Group__0__Impl rule__Site__Group__1 )
            // InternalBDSL.g:2021:2: rule__Site__Group__0__Impl rule__Site__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBDSL.g:2028:1: rule__Site__Group__0__Impl : ( 'id' ) ;
    public final void rule__Site__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2032:1: ( ( 'id' ) )
            // InternalBDSL.g:2033:1: ( 'id' )
            {
            // InternalBDSL.g:2033:1: ( 'id' )
            // InternalBDSL.g:2034:2: 'id'
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
    // InternalBDSL.g:2043:1: rule__Site__Group__1 : rule__Site__Group__1__Impl rule__Site__Group__2 ;
    public final void rule__Site__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2047:1: ( rule__Site__Group__1__Impl rule__Site__Group__2 )
            // InternalBDSL.g:2048:2: rule__Site__Group__1__Impl rule__Site__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalBDSL.g:2055:1: rule__Site__Group__1__Impl : ( '(' ) ;
    public final void rule__Site__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2059:1: ( ( '(' ) )
            // InternalBDSL.g:2060:1: ( '(' )
            {
            // InternalBDSL.g:2060:1: ( '(' )
            // InternalBDSL.g:2061:2: '('
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
    // InternalBDSL.g:2070:1: rule__Site__Group__2 : rule__Site__Group__2__Impl rule__Site__Group__3 ;
    public final void rule__Site__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2074:1: ( rule__Site__Group__2__Impl rule__Site__Group__3 )
            // InternalBDSL.g:2075:2: rule__Site__Group__2__Impl rule__Site__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalBDSL.g:2082:1: rule__Site__Group__2__Impl : ( ( rule__Site__IndexAssignment_2 ) ) ;
    public final void rule__Site__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2086:1: ( ( ( rule__Site__IndexAssignment_2 ) ) )
            // InternalBDSL.g:2087:1: ( ( rule__Site__IndexAssignment_2 ) )
            {
            // InternalBDSL.g:2087:1: ( ( rule__Site__IndexAssignment_2 ) )
            // InternalBDSL.g:2088:2: ( rule__Site__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteAccess().getIndexAssignment_2()); 
            }
            // InternalBDSL.g:2089:2: ( rule__Site__IndexAssignment_2 )
            // InternalBDSL.g:2089:3: rule__Site__IndexAssignment_2
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
    // InternalBDSL.g:2097:1: rule__Site__Group__3 : rule__Site__Group__3__Impl ;
    public final void rule__Site__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2101:1: ( rule__Site__Group__3__Impl )
            // InternalBDSL.g:2102:2: rule__Site__Group__3__Impl
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
    // InternalBDSL.g:2108:1: rule__Site__Group__3__Impl : ( ')' ) ;
    public final void rule__Site__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2112:1: ( ( ')' ) )
            // InternalBDSL.g:2113:1: ( ')' )
            {
            // InternalBDSL.g:2113:1: ( ')' )
            // InternalBDSL.g:2114:2: ')'
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
    // InternalBDSL.g:2124:1: rule__LVD2__Group__0 : rule__LVD2__Group__0__Impl rule__LVD2__Group__1 ;
    public final void rule__LVD2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2128:1: ( rule__LVD2__Group__0__Impl rule__LVD2__Group__1 )
            // InternalBDSL.g:2129:2: rule__LVD2__Group__0__Impl rule__LVD2__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBDSL.g:2136:1: rule__LVD2__Group__0__Impl : ( () ) ;
    public final void rule__LVD2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2140:1: ( ( () ) )
            // InternalBDSL.g:2141:1: ( () )
            {
            // InternalBDSL.g:2141:1: ( () )
            // InternalBDSL.g:2142:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getLocalVarDeclAction_0()); 
            }
            // InternalBDSL.g:2143:2: ()
            // InternalBDSL.g:2143:3: 
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
    // InternalBDSL.g:2151:1: rule__LVD2__Group__1 : rule__LVD2__Group__1__Impl rule__LVD2__Group__2 ;
    public final void rule__LVD2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2155:1: ( rule__LVD2__Group__1__Impl rule__LVD2__Group__2 )
            // InternalBDSL.g:2156:2: rule__LVD2__Group__1__Impl rule__LVD2__Group__2
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
    // InternalBDSL.g:2163:1: rule__LVD2__Group__1__Impl : ( 'val' ) ;
    public final void rule__LVD2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2167:1: ( ( 'val' ) )
            // InternalBDSL.g:2168:1: ( 'val' )
            {
            // InternalBDSL.g:2168:1: ( 'val' )
            // InternalBDSL.g:2169:2: 'val'
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
    // InternalBDSL.g:2178:1: rule__LVD2__Group__2 : rule__LVD2__Group__2__Impl rule__LVD2__Group__3 ;
    public final void rule__LVD2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2182:1: ( rule__LVD2__Group__2__Impl rule__LVD2__Group__3 )
            // InternalBDSL.g:2183:2: rule__LVD2__Group__2__Impl rule__LVD2__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalBDSL.g:2190:1: rule__LVD2__Group__2__Impl : ( ( rule__LVD2__NameAssignment_2 ) ) ;
    public final void rule__LVD2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2194:1: ( ( ( rule__LVD2__NameAssignment_2 ) ) )
            // InternalBDSL.g:2195:1: ( ( rule__LVD2__NameAssignment_2 ) )
            {
            // InternalBDSL.g:2195:1: ( ( rule__LVD2__NameAssignment_2 ) )
            // InternalBDSL.g:2196:2: ( rule__LVD2__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getNameAssignment_2()); 
            }
            // InternalBDSL.g:2197:2: ( rule__LVD2__NameAssignment_2 )
            // InternalBDSL.g:2197:3: rule__LVD2__NameAssignment_2
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
    // InternalBDSL.g:2205:1: rule__LVD2__Group__3 : rule__LVD2__Group__3__Impl rule__LVD2__Group__4 ;
    public final void rule__LVD2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2209:1: ( rule__LVD2__Group__3__Impl rule__LVD2__Group__4 )
            // InternalBDSL.g:2210:2: rule__LVD2__Group__3__Impl rule__LVD2__Group__4
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
    // InternalBDSL.g:2217:1: rule__LVD2__Group__3__Impl : ( ':' ) ;
    public final void rule__LVD2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2221:1: ( ( ':' ) )
            // InternalBDSL.g:2222:1: ( ':' )
            {
            // InternalBDSL.g:2222:1: ( ':' )
            // InternalBDSL.g:2223:2: ':'
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
    // InternalBDSL.g:2232:1: rule__LVD2__Group__4 : rule__LVD2__Group__4__Impl rule__LVD2__Group__5 ;
    public final void rule__LVD2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2236:1: ( rule__LVD2__Group__4__Impl rule__LVD2__Group__5 )
            // InternalBDSL.g:2237:2: rule__LVD2__Group__4__Impl rule__LVD2__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalBDSL.g:2244:1: rule__LVD2__Group__4__Impl : ( ( rule__LVD2__TypeAssignment_4 ) ) ;
    public final void rule__LVD2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2248:1: ( ( ( rule__LVD2__TypeAssignment_4 ) ) )
            // InternalBDSL.g:2249:1: ( ( rule__LVD2__TypeAssignment_4 ) )
            {
            // InternalBDSL.g:2249:1: ( ( rule__LVD2__TypeAssignment_4 ) )
            // InternalBDSL.g:2250:2: ( rule__LVD2__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getTypeAssignment_4()); 
            }
            // InternalBDSL.g:2251:2: ( rule__LVD2__TypeAssignment_4 )
            // InternalBDSL.g:2251:3: rule__LVD2__TypeAssignment_4
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
    // InternalBDSL.g:2259:1: rule__LVD2__Group__5 : rule__LVD2__Group__5__Impl rule__LVD2__Group__6 ;
    public final void rule__LVD2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2263:1: ( rule__LVD2__Group__5__Impl rule__LVD2__Group__6 )
            // InternalBDSL.g:2264:2: rule__LVD2__Group__5__Impl rule__LVD2__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalBDSL.g:2271:1: rule__LVD2__Group__5__Impl : ( '=' ) ;
    public final void rule__LVD2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2275:1: ( ( '=' ) )
            // InternalBDSL.g:2276:1: ( '=' )
            {
            // InternalBDSL.g:2276:1: ( '=' )
            // InternalBDSL.g:2277:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getEqualsSignKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2286:1: rule__LVD2__Group__6 : rule__LVD2__Group__6__Impl rule__LVD2__Group__7 ;
    public final void rule__LVD2__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2290:1: ( rule__LVD2__Group__6__Impl rule__LVD2__Group__7 )
            // InternalBDSL.g:2291:2: rule__LVD2__Group__6__Impl rule__LVD2__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalBDSL.g:2298:1: rule__LVD2__Group__6__Impl : ( '{' ) ;
    public final void rule__LVD2__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2302:1: ( ( '{' ) )
            // InternalBDSL.g:2303:1: ( '{' )
            {
            // InternalBDSL.g:2303:1: ( '{' )
            // InternalBDSL.g:2304:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2313:1: rule__LVD2__Group__7 : rule__LVD2__Group__7__Impl rule__LVD2__Group__8 ;
    public final void rule__LVD2__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2317:1: ( rule__LVD2__Group__7__Impl rule__LVD2__Group__8 )
            // InternalBDSL.g:2318:2: rule__LVD2__Group__7__Impl rule__LVD2__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalBDSL.g:2325:1: rule__LVD2__Group__7__Impl : ( ( rule__LVD2__DefinitionAssignment_7 )* ) ;
    public final void rule__LVD2__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2329:1: ( ( ( rule__LVD2__DefinitionAssignment_7 )* ) )
            // InternalBDSL.g:2330:1: ( ( rule__LVD2__DefinitionAssignment_7 )* )
            {
            // InternalBDSL.g:2330:1: ( ( rule__LVD2__DefinitionAssignment_7 )* )
            // InternalBDSL.g:2331:2: ( rule__LVD2__DefinitionAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getDefinitionAssignment_7()); 
            }
            // InternalBDSL.g:2332:2: ( rule__LVD2__DefinitionAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==25||(LA19_0>=35 && LA19_0<=36)||LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBDSL.g:2332:3: rule__LVD2__DefinitionAssignment_7
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__LVD2__DefinitionAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalBDSL.g:2340:1: rule__LVD2__Group__8 : rule__LVD2__Group__8__Impl ;
    public final void rule__LVD2__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2344:1: ( rule__LVD2__Group__8__Impl )
            // InternalBDSL.g:2345:2: rule__LVD2__Group__8__Impl
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
    // InternalBDSL.g:2351:1: rule__LVD2__Group__8__Impl : ( '}' ) ;
    public final void rule__LVD2__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2355:1: ( ( '}' ) )
            // InternalBDSL.g:2356:1: ( '}' )
            {
            // InternalBDSL.g:2356:1: ( '}' )
            // InternalBDSL.g:2357:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getRightCurlyBracketKeyword_8()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2367:1: rule__LocalVarDecl__Group__0 : rule__LocalVarDecl__Group__0__Impl rule__LocalVarDecl__Group__1 ;
    public final void rule__LocalVarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2371:1: ( rule__LocalVarDecl__Group__0__Impl rule__LocalVarDecl__Group__1 )
            // InternalBDSL.g:2372:2: rule__LocalVarDecl__Group__0__Impl rule__LocalVarDecl__Group__1
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
    // InternalBDSL.g:2379:1: rule__LocalVarDecl__Group__0__Impl : ( 'val' ) ;
    public final void rule__LocalVarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2383:1: ( ( 'val' ) )
            // InternalBDSL.g:2384:1: ( 'val' )
            {
            // InternalBDSL.g:2384:1: ( 'val' )
            // InternalBDSL.g:2385:2: 'val'
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
    // InternalBDSL.g:2394:1: rule__LocalVarDecl__Group__1 : rule__LocalVarDecl__Group__1__Impl rule__LocalVarDecl__Group__2 ;
    public final void rule__LocalVarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2398:1: ( rule__LocalVarDecl__Group__1__Impl rule__LocalVarDecl__Group__2 )
            // InternalBDSL.g:2399:2: rule__LocalVarDecl__Group__1__Impl rule__LocalVarDecl__Group__2
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
    // InternalBDSL.g:2406:1: rule__LocalVarDecl__Group__1__Impl : ( () ) ;
    public final void rule__LocalVarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2410:1: ( ( () ) )
            // InternalBDSL.g:2411:1: ( () )
            {
            // InternalBDSL.g:2411:1: ( () )
            // InternalBDSL.g:2412:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getLocalVarDeclAction_1()); 
            }
            // InternalBDSL.g:2413:2: ()
            // InternalBDSL.g:2413:3: 
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
    // InternalBDSL.g:2421:1: rule__LocalVarDecl__Group__2 : rule__LocalVarDecl__Group__2__Impl ;
    public final void rule__LocalVarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2425:1: ( rule__LocalVarDecl__Group__2__Impl )
            // InternalBDSL.g:2426:2: rule__LocalVarDecl__Group__2__Impl
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
    // InternalBDSL.g:2432:1: rule__LocalVarDecl__Group__2__Impl : ( ( rule__LocalVarDecl__Group_2__0 ) ) ;
    public final void rule__LocalVarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2436:1: ( ( ( rule__LocalVarDecl__Group_2__0 ) ) )
            // InternalBDSL.g:2437:1: ( ( rule__LocalVarDecl__Group_2__0 ) )
            {
            // InternalBDSL.g:2437:1: ( ( rule__LocalVarDecl__Group_2__0 ) )
            // InternalBDSL.g:2438:2: ( rule__LocalVarDecl__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2()); 
            }
            // InternalBDSL.g:2439:2: ( rule__LocalVarDecl__Group_2__0 )
            // InternalBDSL.g:2439:3: rule__LocalVarDecl__Group_2__0
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
    // InternalBDSL.g:2448:1: rule__LocalVarDecl__Group_2__0 : rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1 ;
    public final void rule__LocalVarDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2452:1: ( rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1 )
            // InternalBDSL.g:2453:2: rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalBDSL.g:2460:1: rule__LocalVarDecl__Group_2__0__Impl : ( ( rule__LocalVarDecl__NameAssignment_2_0 ) ) ;
    public final void rule__LocalVarDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2464:1: ( ( ( rule__LocalVarDecl__NameAssignment_2_0 ) ) )
            // InternalBDSL.g:2465:1: ( ( rule__LocalVarDecl__NameAssignment_2_0 ) )
            {
            // InternalBDSL.g:2465:1: ( ( rule__LocalVarDecl__NameAssignment_2_0 ) )
            // InternalBDSL.g:2466:2: ( rule__LocalVarDecl__NameAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getNameAssignment_2_0()); 
            }
            // InternalBDSL.g:2467:2: ( rule__LocalVarDecl__NameAssignment_2_0 )
            // InternalBDSL.g:2467:3: rule__LocalVarDecl__NameAssignment_2_0
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
    // InternalBDSL.g:2475:1: rule__LocalVarDecl__Group_2__1 : rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2 ;
    public final void rule__LocalVarDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2479:1: ( rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2 )
            // InternalBDSL.g:2480:2: rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalBDSL.g:2487:1: rule__LocalVarDecl__Group_2__1__Impl : ( ( rule__LocalVarDecl__Group_2_1__0 )? ) ;
    public final void rule__LocalVarDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2491:1: ( ( ( rule__LocalVarDecl__Group_2_1__0 )? ) )
            // InternalBDSL.g:2492:1: ( ( rule__LocalVarDecl__Group_2_1__0 )? )
            {
            // InternalBDSL.g:2492:1: ( ( rule__LocalVarDecl__Group_2_1__0 )? )
            // InternalBDSL.g:2493:2: ( rule__LocalVarDecl__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_1()); 
            }
            // InternalBDSL.g:2494:2: ( rule__LocalVarDecl__Group_2_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBDSL.g:2494:3: rule__LocalVarDecl__Group_2_1__0
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
    // InternalBDSL.g:2502:1: rule__LocalVarDecl__Group_2__2 : rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3 ;
    public final void rule__LocalVarDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2506:1: ( rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3 )
            // InternalBDSL.g:2507:2: rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalBDSL.g:2514:1: rule__LocalVarDecl__Group_2__2__Impl : ( ( rule__LocalVarDecl__Group_2_2__0 )? ) ;
    public final void rule__LocalVarDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2518:1: ( ( ( rule__LocalVarDecl__Group_2_2__0 )? ) )
            // InternalBDSL.g:2519:1: ( ( rule__LocalVarDecl__Group_2_2__0 )? )
            {
            // InternalBDSL.g:2519:1: ( ( rule__LocalVarDecl__Group_2_2__0 )? )
            // InternalBDSL.g:2520:2: ( rule__LocalVarDecl__Group_2_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_2()); 
            }
            // InternalBDSL.g:2521:2: ( rule__LocalVarDecl__Group_2_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=39 && LA21_0<=40)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBDSL.g:2521:3: rule__LocalVarDecl__Group_2_2__0
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
    // InternalBDSL.g:2529:1: rule__LocalVarDecl__Group_2__3 : rule__LocalVarDecl__Group_2__3__Impl ;
    public final void rule__LocalVarDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2533:1: ( rule__LocalVarDecl__Group_2__3__Impl )
            // InternalBDSL.g:2534:2: rule__LocalVarDecl__Group_2__3__Impl
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
    // InternalBDSL.g:2540:1: rule__LocalVarDecl__Group_2__3__Impl : ( ( rule__LocalVarDecl__Group_2_3__0 ) ) ;
    public final void rule__LocalVarDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2544:1: ( ( ( rule__LocalVarDecl__Group_2_3__0 ) ) )
            // InternalBDSL.g:2545:1: ( ( rule__LocalVarDecl__Group_2_3__0 ) )
            {
            // InternalBDSL.g:2545:1: ( ( rule__LocalVarDecl__Group_2_3__0 ) )
            // InternalBDSL.g:2546:2: ( rule__LocalVarDecl__Group_2_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_3()); 
            }
            // InternalBDSL.g:2547:2: ( rule__LocalVarDecl__Group_2_3__0 )
            // InternalBDSL.g:2547:3: rule__LocalVarDecl__Group_2_3__0
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
    // InternalBDSL.g:2556:1: rule__LocalVarDecl__Group_2_1__0 : rule__LocalVarDecl__Group_2_1__0__Impl rule__LocalVarDecl__Group_2_1__1 ;
    public final void rule__LocalVarDecl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2560:1: ( rule__LocalVarDecl__Group_2_1__0__Impl rule__LocalVarDecl__Group_2_1__1 )
            // InternalBDSL.g:2561:2: rule__LocalVarDecl__Group_2_1__0__Impl rule__LocalVarDecl__Group_2_1__1
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
    // InternalBDSL.g:2568:1: rule__LocalVarDecl__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__LocalVarDecl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2572:1: ( ( '(' ) )
            // InternalBDSL.g:2573:1: ( '(' )
            {
            // InternalBDSL.g:2573:1: ( '(' )
            // InternalBDSL.g:2574:2: '('
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
    // InternalBDSL.g:2583:1: rule__LocalVarDecl__Group_2_1__1 : rule__LocalVarDecl__Group_2_1__1__Impl rule__LocalVarDecl__Group_2_1__2 ;
    public final void rule__LocalVarDecl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2587:1: ( rule__LocalVarDecl__Group_2_1__1__Impl rule__LocalVarDecl__Group_2_1__2 )
            // InternalBDSL.g:2588:2: rule__LocalVarDecl__Group_2_1__1__Impl rule__LocalVarDecl__Group_2_1__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBDSL.g:2595:1: rule__LocalVarDecl__Group_2_1__1__Impl : ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) ) ;
    public final void rule__LocalVarDecl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2599:1: ( ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) ) )
            // InternalBDSL.g:2600:1: ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) )
            {
            // InternalBDSL.g:2600:1: ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) )
            // InternalBDSL.g:2601:2: ( rule__LocalVarDecl__SigAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSigAssignment_2_1_1()); 
            }
            // InternalBDSL.g:2602:2: ( rule__LocalVarDecl__SigAssignment_2_1_1 )
            // InternalBDSL.g:2602:3: rule__LocalVarDecl__SigAssignment_2_1_1
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
    // InternalBDSL.g:2610:1: rule__LocalVarDecl__Group_2_1__2 : rule__LocalVarDecl__Group_2_1__2__Impl ;
    public final void rule__LocalVarDecl__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2614:1: ( rule__LocalVarDecl__Group_2_1__2__Impl )
            // InternalBDSL.g:2615:2: rule__LocalVarDecl__Group_2_1__2__Impl
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
    // InternalBDSL.g:2621:1: rule__LocalVarDecl__Group_2_1__2__Impl : ( ')' ) ;
    public final void rule__LocalVarDecl__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2625:1: ( ( ')' ) )
            // InternalBDSL.g:2626:1: ( ')' )
            {
            // InternalBDSL.g:2626:1: ( ')' )
            // InternalBDSL.g:2627:2: ')'
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
    // InternalBDSL.g:2637:1: rule__LocalVarDecl__Group_2_2__0 : rule__LocalVarDecl__Group_2_2__0__Impl rule__LocalVarDecl__Group_2_2__1 ;
    public final void rule__LocalVarDecl__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2641:1: ( rule__LocalVarDecl__Group_2_2__0__Impl rule__LocalVarDecl__Group_2_2__1 )
            // InternalBDSL.g:2642:2: rule__LocalVarDecl__Group_2_2__0__Impl rule__LocalVarDecl__Group_2_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalBDSL.g:2649:1: rule__LocalVarDecl__Group_2_2__0__Impl : ( ( rule__LocalVarDecl__Group_2_2_0__0 )? ) ;
    public final void rule__LocalVarDecl__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2653:1: ( ( ( rule__LocalVarDecl__Group_2_2_0__0 )? ) )
            // InternalBDSL.g:2654:1: ( ( rule__LocalVarDecl__Group_2_2_0__0 )? )
            {
            // InternalBDSL.g:2654:1: ( ( rule__LocalVarDecl__Group_2_2_0__0 )? )
            // InternalBDSL.g:2655:2: ( rule__LocalVarDecl__Group_2_2_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_2_0()); 
            }
            // InternalBDSL.g:2656:2: ( rule__LocalVarDecl__Group_2_2_0__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBDSL.g:2656:3: rule__LocalVarDecl__Group_2_2_0__0
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
    // InternalBDSL.g:2664:1: rule__LocalVarDecl__Group_2_2__1 : rule__LocalVarDecl__Group_2_2__1__Impl rule__LocalVarDecl__Group_2_2__2 ;
    public final void rule__LocalVarDecl__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2668:1: ( rule__LocalVarDecl__Group_2_2__1__Impl rule__LocalVarDecl__Group_2_2__2 )
            // InternalBDSL.g:2669:2: rule__LocalVarDecl__Group_2_2__1__Impl rule__LocalVarDecl__Group_2_2__2
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
    // InternalBDSL.g:2676:1: rule__LocalVarDecl__Group_2_2__1__Impl : ( ':' ) ;
    public final void rule__LocalVarDecl__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2680:1: ( ( ':' ) )
            // InternalBDSL.g:2681:1: ( ':' )
            {
            // InternalBDSL.g:2681:1: ( ':' )
            // InternalBDSL.g:2682:2: ':'
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
    // InternalBDSL.g:2691:1: rule__LocalVarDecl__Group_2_2__2 : rule__LocalVarDecl__Group_2_2__2__Impl ;
    public final void rule__LocalVarDecl__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2695:1: ( rule__LocalVarDecl__Group_2_2__2__Impl )
            // InternalBDSL.g:2696:2: rule__LocalVarDecl__Group_2_2__2__Impl
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
    // InternalBDSL.g:2702:1: rule__LocalVarDecl__Group_2_2__2__Impl : ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) ) ;
    public final void rule__LocalVarDecl__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2706:1: ( ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) ) )
            // InternalBDSL.g:2707:1: ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) )
            {
            // InternalBDSL.g:2707:1: ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) )
            // InternalBDSL.g:2708:2: ( rule__LocalVarDecl__TypeAssignment_2_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getTypeAssignment_2_2_2()); 
            }
            // InternalBDSL.g:2709:2: ( rule__LocalVarDecl__TypeAssignment_2_2_2 )
            // InternalBDSL.g:2709:3: rule__LocalVarDecl__TypeAssignment_2_2_2
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
    // InternalBDSL.g:2718:1: rule__LocalVarDecl__Group_2_2_0__0 : rule__LocalVarDecl__Group_2_2_0__0__Impl rule__LocalVarDecl__Group_2_2_0__1 ;
    public final void rule__LocalVarDecl__Group_2_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2722:1: ( rule__LocalVarDecl__Group_2_2_0__0__Impl rule__LocalVarDecl__Group_2_2_0__1 )
            // InternalBDSL.g:2723:2: rule__LocalVarDecl__Group_2_2_0__0__Impl rule__LocalVarDecl__Group_2_2_0__1
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
    // InternalBDSL.g:2730:1: rule__LocalVarDecl__Group_2_2_0__0__Impl : ( '[' ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2734:1: ( ( '[' ) )
            // InternalBDSL.g:2735:1: ( '[' )
            {
            // InternalBDSL.g:2735:1: ( '[' )
            // InternalBDSL.g:2736:2: '['
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
    // InternalBDSL.g:2745:1: rule__LocalVarDecl__Group_2_2_0__1 : rule__LocalVarDecl__Group_2_2_0__1__Impl rule__LocalVarDecl__Group_2_2_0__2 ;
    public final void rule__LocalVarDecl__Group_2_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2749:1: ( rule__LocalVarDecl__Group_2_2_0__1__Impl rule__LocalVarDecl__Group_2_2_0__2 )
            // InternalBDSL.g:2750:2: rule__LocalVarDecl__Group_2_2_0__1__Impl rule__LocalVarDecl__Group_2_2_0__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBDSL.g:2757:1: rule__LocalVarDecl__Group_2_2_0__1__Impl : ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2761:1: ( ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) ) )
            // InternalBDSL.g:2762:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) )
            {
            // InternalBDSL.g:2762:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) )
            // InternalBDSL.g:2763:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSiteArgsAssignment_2_2_0_1()); 
            }
            // InternalBDSL.g:2764:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 )
            // InternalBDSL.g:2764:3: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1
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
    // InternalBDSL.g:2772:1: rule__LocalVarDecl__Group_2_2_0__2 : rule__LocalVarDecl__Group_2_2_0__2__Impl rule__LocalVarDecl__Group_2_2_0__3 ;
    public final void rule__LocalVarDecl__Group_2_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2776:1: ( rule__LocalVarDecl__Group_2_2_0__2__Impl rule__LocalVarDecl__Group_2_2_0__3 )
            // InternalBDSL.g:2777:2: rule__LocalVarDecl__Group_2_2_0__2__Impl rule__LocalVarDecl__Group_2_2_0__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalBDSL.g:2784:1: rule__LocalVarDecl__Group_2_2_0__2__Impl : ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2788:1: ( ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* ) )
            // InternalBDSL.g:2789:1: ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* )
            {
            // InternalBDSL.g:2789:1: ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* )
            // InternalBDSL.g:2790:2: ( rule__LocalVarDecl__Group_2_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_2_0_2()); 
            }
            // InternalBDSL.g:2791:2: ( rule__LocalVarDecl__Group_2_2_0_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==34) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBDSL.g:2791:3: rule__LocalVarDecl__Group_2_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__LocalVarDecl__Group_2_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalBDSL.g:2799:1: rule__LocalVarDecl__Group_2_2_0__3 : rule__LocalVarDecl__Group_2_2_0__3__Impl ;
    public final void rule__LocalVarDecl__Group_2_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2803:1: ( rule__LocalVarDecl__Group_2_2_0__3__Impl )
            // InternalBDSL.g:2804:2: rule__LocalVarDecl__Group_2_2_0__3__Impl
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
    // InternalBDSL.g:2810:1: rule__LocalVarDecl__Group_2_2_0__3__Impl : ( ']' ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2814:1: ( ( ']' ) )
            // InternalBDSL.g:2815:1: ( ']' )
            {
            // InternalBDSL.g:2815:1: ( ']' )
            // InternalBDSL.g:2816:2: ']'
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
    // InternalBDSL.g:2826:1: rule__LocalVarDecl__Group_2_2_0_2__0 : rule__LocalVarDecl__Group_2_2_0_2__0__Impl rule__LocalVarDecl__Group_2_2_0_2__1 ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2830:1: ( rule__LocalVarDecl__Group_2_2_0_2__0__Impl rule__LocalVarDecl__Group_2_2_0_2__1 )
            // InternalBDSL.g:2831:2: rule__LocalVarDecl__Group_2_2_0_2__0__Impl rule__LocalVarDecl__Group_2_2_0_2__1
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
    // InternalBDSL.g:2838:1: rule__LocalVarDecl__Group_2_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2842:1: ( ( ',' ) )
            // InternalBDSL.g:2843:1: ( ',' )
            {
            // InternalBDSL.g:2843:1: ( ',' )
            // InternalBDSL.g:2844:2: ','
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
    // InternalBDSL.g:2853:1: rule__LocalVarDecl__Group_2_2_0_2__1 : rule__LocalVarDecl__Group_2_2_0_2__1__Impl ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2857:1: ( rule__LocalVarDecl__Group_2_2_0_2__1__Impl )
            // InternalBDSL.g:2858:2: rule__LocalVarDecl__Group_2_2_0_2__1__Impl
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
    // InternalBDSL.g:2864:1: rule__LocalVarDecl__Group_2_2_0_2__1__Impl : ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) ) ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2868:1: ( ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) ) )
            // InternalBDSL.g:2869:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) )
            {
            // InternalBDSL.g:2869:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) )
            // InternalBDSL.g:2870:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSiteArgsAssignment_2_2_0_2_1()); 
            }
            // InternalBDSL.g:2871:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 )
            // InternalBDSL.g:2871:3: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1
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
    // InternalBDSL.g:2880:1: rule__LocalVarDecl__Group_2_3__0 : rule__LocalVarDecl__Group_2_3__0__Impl rule__LocalVarDecl__Group_2_3__1 ;
    public final void rule__LocalVarDecl__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2884:1: ( rule__LocalVarDecl__Group_2_3__0__Impl rule__LocalVarDecl__Group_2_3__1 )
            // InternalBDSL.g:2885:2: rule__LocalVarDecl__Group_2_3__0__Impl rule__LocalVarDecl__Group_2_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBDSL.g:2892:1: rule__LocalVarDecl__Group_2_3__0__Impl : ( '=' ) ;
    public final void rule__LocalVarDecl__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2896:1: ( ( '=' ) )
            // InternalBDSL.g:2897:1: ( '=' )
            {
            // InternalBDSL.g:2897:1: ( '=' )
            // InternalBDSL.g:2898:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_2_3_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2907:1: rule__LocalVarDecl__Group_2_3__1 : rule__LocalVarDecl__Group_2_3__1__Impl rule__LocalVarDecl__Group_2_3__2 ;
    public final void rule__LocalVarDecl__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2911:1: ( rule__LocalVarDecl__Group_2_3__1__Impl rule__LocalVarDecl__Group_2_3__2 )
            // InternalBDSL.g:2912:2: rule__LocalVarDecl__Group_2_3__1__Impl rule__LocalVarDecl__Group_2_3__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalBDSL.g:2919:1: rule__LocalVarDecl__Group_2_3__1__Impl : ( '{' ) ;
    public final void rule__LocalVarDecl__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2923:1: ( ( '{' ) )
            // InternalBDSL.g:2924:1: ( '{' )
            {
            // InternalBDSL.g:2924:1: ( '{' )
            // InternalBDSL.g:2925:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getLeftCurlyBracketKeyword_2_3_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2934:1: rule__LocalVarDecl__Group_2_3__2 : rule__LocalVarDecl__Group_2_3__2__Impl rule__LocalVarDecl__Group_2_3__3 ;
    public final void rule__LocalVarDecl__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2938:1: ( rule__LocalVarDecl__Group_2_3__2__Impl rule__LocalVarDecl__Group_2_3__3 )
            // InternalBDSL.g:2939:2: rule__LocalVarDecl__Group_2_3__2__Impl rule__LocalVarDecl__Group_2_3__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalBDSL.g:2946:1: rule__LocalVarDecl__Group_2_3__2__Impl : ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* ) ;
    public final void rule__LocalVarDecl__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2950:1: ( ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* ) )
            // InternalBDSL.g:2951:1: ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* )
            {
            // InternalBDSL.g:2951:1: ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* )
            // InternalBDSL.g:2952:2: ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getDefinitionAssignment_2_3_2()); 
            }
            // InternalBDSL.g:2953:2: ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==25||(LA24_0>=35 && LA24_0<=36)||LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBDSL.g:2953:3: rule__LocalVarDecl__DefinitionAssignment_2_3_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__LocalVarDecl__DefinitionAssignment_2_3_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalBDSL.g:2961:1: rule__LocalVarDecl__Group_2_3__3 : rule__LocalVarDecl__Group_2_3__3__Impl ;
    public final void rule__LocalVarDecl__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2965:1: ( rule__LocalVarDecl__Group_2_3__3__Impl )
            // InternalBDSL.g:2966:2: rule__LocalVarDecl__Group_2_3__3__Impl
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
    // InternalBDSL.g:2972:1: rule__LocalVarDecl__Group_2_3__3__Impl : ( '}' ) ;
    public final void rule__LocalVarDecl__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2976:1: ( ( '}' ) )
            // InternalBDSL.g:2977:1: ( '}' )
            {
            // InternalBDSL.g:2977:1: ( '}' )
            // InternalBDSL.g:2978:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getRightCurlyBracketKeyword_2_3_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__NodeExpressionCall__Group__0"
    // InternalBDSL.g:2988:1: rule__NodeExpressionCall__Group__0 : rule__NodeExpressionCall__Group__0__Impl rule__NodeExpressionCall__Group__1 ;
    public final void rule__NodeExpressionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2992:1: ( rule__NodeExpressionCall__Group__0__Impl rule__NodeExpressionCall__Group__1 )
            // InternalBDSL.g:2993:2: rule__NodeExpressionCall__Group__0__Impl rule__NodeExpressionCall__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBDSL.g:3000:1: rule__NodeExpressionCall__Group__0__Impl : ( ( rule__NodeExpressionCall__ValueAssignment_0 ) ) ;
    public final void rule__NodeExpressionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3004:1: ( ( ( rule__NodeExpressionCall__ValueAssignment_0 ) ) )
            // InternalBDSL.g:3005:1: ( ( rule__NodeExpressionCall__ValueAssignment_0 ) )
            {
            // InternalBDSL.g:3005:1: ( ( rule__NodeExpressionCall__ValueAssignment_0 ) )
            // InternalBDSL.g:3006:2: ( rule__NodeExpressionCall__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getValueAssignment_0()); 
            }
            // InternalBDSL.g:3007:2: ( rule__NodeExpressionCall__ValueAssignment_0 )
            // InternalBDSL.g:3007:3: rule__NodeExpressionCall__ValueAssignment_0
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
    // InternalBDSL.g:3015:1: rule__NodeExpressionCall__Group__1 : rule__NodeExpressionCall__Group__1__Impl ;
    public final void rule__NodeExpressionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3019:1: ( rule__NodeExpressionCall__Group__1__Impl )
            // InternalBDSL.g:3020:2: rule__NodeExpressionCall__Group__1__Impl
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
    // InternalBDSL.g:3026:1: rule__NodeExpressionCall__Group__1__Impl : ( ( rule__NodeExpressionCall__Group_1__0 )? ) ;
    public final void rule__NodeExpressionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3030:1: ( ( ( rule__NodeExpressionCall__Group_1__0 )? ) )
            // InternalBDSL.g:3031:1: ( ( rule__NodeExpressionCall__Group_1__0 )? )
            {
            // InternalBDSL.g:3031:1: ( ( rule__NodeExpressionCall__Group_1__0 )? )
            // InternalBDSL.g:3032:2: ( rule__NodeExpressionCall__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getGroup_1()); 
            }
            // InternalBDSL.g:3033:2: ( rule__NodeExpressionCall__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBDSL.g:3033:3: rule__NodeExpressionCall__Group_1__0
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
    // InternalBDSL.g:3042:1: rule__NodeExpressionCall__Group_1__0 : rule__NodeExpressionCall__Group_1__0__Impl rule__NodeExpressionCall__Group_1__1 ;
    public final void rule__NodeExpressionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3046:1: ( rule__NodeExpressionCall__Group_1__0__Impl rule__NodeExpressionCall__Group_1__1 )
            // InternalBDSL.g:3047:2: rule__NodeExpressionCall__Group_1__0__Impl rule__NodeExpressionCall__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBDSL.g:3054:1: rule__NodeExpressionCall__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeExpressionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3058:1: ( ( '[' ) )
            // InternalBDSL.g:3059:1: ( '[' )
            {
            // InternalBDSL.g:3059:1: ( '[' )
            // InternalBDSL.g:3060:2: '['
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
    // InternalBDSL.g:3069:1: rule__NodeExpressionCall__Group_1__1 : rule__NodeExpressionCall__Group_1__1__Impl rule__NodeExpressionCall__Group_1__2 ;
    public final void rule__NodeExpressionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3073:1: ( rule__NodeExpressionCall__Group_1__1__Impl rule__NodeExpressionCall__Group_1__2 )
            // InternalBDSL.g:3074:2: rule__NodeExpressionCall__Group_1__1__Impl rule__NodeExpressionCall__Group_1__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalBDSL.g:3081:1: rule__NodeExpressionCall__Group_1__1__Impl : ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* ) ;
    public final void rule__NodeExpressionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3085:1: ( ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* ) )
            // InternalBDSL.g:3086:1: ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* )
            {
            // InternalBDSL.g:3086:1: ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* )
            // InternalBDSL.g:3087:2: ( rule__NodeExpressionCall__LinksAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getLinksAssignment_1_1()); 
            }
            // InternalBDSL.g:3088:2: ( rule__NodeExpressionCall__LinksAssignment_1_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBDSL.g:3088:3: rule__NodeExpressionCall__LinksAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__NodeExpressionCall__LinksAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalBDSL.g:3096:1: rule__NodeExpressionCall__Group_1__2 : rule__NodeExpressionCall__Group_1__2__Impl ;
    public final void rule__NodeExpressionCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3100:1: ( rule__NodeExpressionCall__Group_1__2__Impl )
            // InternalBDSL.g:3101:2: rule__NodeExpressionCall__Group_1__2__Impl
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
    // InternalBDSL.g:3107:1: rule__NodeExpressionCall__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeExpressionCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3111:1: ( ( ']' ) )
            // InternalBDSL.g:3112:1: ( ']' )
            {
            // InternalBDSL.g:3112:1: ( ']' )
            // InternalBDSL.g:3113:2: ']'
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
    // InternalBDSL.g:3123:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3127:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalBDSL.g:3128:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBDSL.g:3135:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3139:1: ( ( ruleMultiplication ) )
            // InternalBDSL.g:3140:1: ( ruleMultiplication )
            {
            // InternalBDSL.g:3140:1: ( ruleMultiplication )
            // InternalBDSL.g:3141:2: ruleMultiplication
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
    // InternalBDSL.g:3150:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3154:1: ( rule__Addition__Group__1__Impl )
            // InternalBDSL.g:3155:2: rule__Addition__Group__1__Impl
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
    // InternalBDSL.g:3161:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3165:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalBDSL.g:3166:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalBDSL.g:3166:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalBDSL.g:3167:2: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // InternalBDSL.g:3168:2: ( rule__Addition__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=12 && LA27_0<=14)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBDSL.g:3168:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalBDSL.g:3177:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3181:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalBDSL.g:3182:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBDSL.g:3189:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Group_1_0__0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3193:1: ( ( ( rule__Addition__Group_1_0__0 ) ) )
            // InternalBDSL.g:3194:1: ( ( rule__Addition__Group_1_0__0 ) )
            {
            // InternalBDSL.g:3194:1: ( ( rule__Addition__Group_1_0__0 ) )
            // InternalBDSL.g:3195:2: ( rule__Addition__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }
            // InternalBDSL.g:3196:2: ( rule__Addition__Group_1_0__0 )
            // InternalBDSL.g:3196:3: rule__Addition__Group_1_0__0
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
    // InternalBDSL.g:3204:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3208:1: ( rule__Addition__Group_1__1__Impl )
            // InternalBDSL.g:3209:2: rule__Addition__Group_1__1__Impl
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
    // InternalBDSL.g:3215:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3219:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalBDSL.g:3220:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalBDSL.g:3220:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalBDSL.g:3221:2: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // InternalBDSL.g:3222:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalBDSL.g:3222:3: rule__Addition__RightAssignment_1_1
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
    // InternalBDSL.g:3231:1: rule__Addition__Group_1_0__0 : rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 ;
    public final void rule__Addition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3235:1: ( rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 )
            // InternalBDSL.g:3236:2: rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBDSL.g:3243:1: rule__Addition__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3247:1: ( ( () ) )
            // InternalBDSL.g:3248:1: ( () )
            {
            // InternalBDSL.g:3248:1: ( () )
            // InternalBDSL.g:3249:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0()); 
            }
            // InternalBDSL.g:3250:2: ()
            // InternalBDSL.g:3250:3: 
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
    // InternalBDSL.g:3258:1: rule__Addition__Group_1_0__1 : rule__Addition__Group_1_0__1__Impl ;
    public final void rule__Addition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3262:1: ( rule__Addition__Group_1_0__1__Impl )
            // InternalBDSL.g:3263:2: rule__Addition__Group_1_0__1__Impl
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
    // InternalBDSL.g:3269:1: rule__Addition__Group_1_0__1__Impl : ( ( rule__Addition__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__Addition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3273:1: ( ( ( rule__Addition__OperatorAssignment_1_0_1 ) ) )
            // InternalBDSL.g:3274:1: ( ( rule__Addition__OperatorAssignment_1_0_1 ) )
            {
            // InternalBDSL.g:3274:1: ( ( rule__Addition__OperatorAssignment_1_0_1 ) )
            // InternalBDSL.g:3275:2: ( rule__Addition__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_0_1()); 
            }
            // InternalBDSL.g:3276:2: ( rule__Addition__OperatorAssignment_1_0_1 )
            // InternalBDSL.g:3276:3: rule__Addition__OperatorAssignment_1_0_1
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
    // InternalBDSL.g:3285:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3289:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalBDSL.g:3290:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
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
    // InternalBDSL.g:3297:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3301:1: ( ( rulePrimaryExpression ) )
            // InternalBDSL.g:3302:1: ( rulePrimaryExpression )
            {
            // InternalBDSL.g:3302:1: ( rulePrimaryExpression )
            // InternalBDSL.g:3303:2: rulePrimaryExpression
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
    // InternalBDSL.g:3312:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3316:1: ( rule__Multiplication__Group__1__Impl )
            // InternalBDSL.g:3317:2: rule__Multiplication__Group__1__Impl
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
    // InternalBDSL.g:3323:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3327:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalBDSL.g:3328:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalBDSL.g:3328:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalBDSL.g:3329:2: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // InternalBDSL.g:3330:2: ( rule__Multiplication__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=15 && LA28_0<=17)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBDSL.g:3330:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalBDSL.g:3339:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3343:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalBDSL.g:3344:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBDSL.g:3351:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Group_1_0__0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3355:1: ( ( ( rule__Multiplication__Group_1_0__0 ) ) )
            // InternalBDSL.g:3356:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            {
            // InternalBDSL.g:3356:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            // InternalBDSL.g:3357:2: ( rule__Multiplication__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }
            // InternalBDSL.g:3358:2: ( rule__Multiplication__Group_1_0__0 )
            // InternalBDSL.g:3358:3: rule__Multiplication__Group_1_0__0
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
    // InternalBDSL.g:3366:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3370:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalBDSL.g:3371:2: rule__Multiplication__Group_1__1__Impl
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
    // InternalBDSL.g:3377:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3381:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalBDSL.g:3382:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalBDSL.g:3382:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalBDSL.g:3383:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // InternalBDSL.g:3384:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalBDSL.g:3384:3: rule__Multiplication__RightAssignment_1_1
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
    // InternalBDSL.g:3393:1: rule__Multiplication__Group_1_0__0 : rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 ;
    public final void rule__Multiplication__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3397:1: ( rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 )
            // InternalBDSL.g:3398:2: rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1
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
    // InternalBDSL.g:3405:1: rule__Multiplication__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3409:1: ( ( () ) )
            // InternalBDSL.g:3410:1: ( () )
            {
            // InternalBDSL.g:3410:1: ( () )
            // InternalBDSL.g:3411:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0()); 
            }
            // InternalBDSL.g:3412:2: ()
            // InternalBDSL.g:3412:3: 
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
    // InternalBDSL.g:3420:1: rule__Multiplication__Group_1_0__1 : rule__Multiplication__Group_1_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3424:1: ( rule__Multiplication__Group_1_0__1__Impl )
            // InternalBDSL.g:3425:2: rule__Multiplication__Group_1_0__1__Impl
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
    // InternalBDSL.g:3431:1: rule__Multiplication__Group_1_0__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3435:1: ( ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) ) )
            // InternalBDSL.g:3436:1: ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) )
            {
            // InternalBDSL.g:3436:1: ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) )
            // InternalBDSL.g:3437:2: ( rule__Multiplication__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_0_1()); 
            }
            // InternalBDSL.g:3438:2: ( rule__Multiplication__OperatorAssignment_1_0_1 )
            // InternalBDSL.g:3438:3: rule__Multiplication__OperatorAssignment_1_0_1
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
    // InternalBDSL.g:3447:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3451:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalBDSL.g:3452:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBDSL.g:3459:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3463:1: ( ( '(' ) )
            // InternalBDSL.g:3464:1: ( '(' )
            {
            // InternalBDSL.g:3464:1: ( '(' )
            // InternalBDSL.g:3465:2: '('
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
    // InternalBDSL.g:3474:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3478:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalBDSL.g:3479:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBDSL.g:3486:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleBigraphExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3490:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:3491:1: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:3491:1: ( ruleBigraphExpression )
            // InternalBDSL.g:3492:2: ruleBigraphExpression
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
    // InternalBDSL.g:3501:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3505:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalBDSL.g:3506:2: rule__PrimaryExpression__Group_0__2__Impl
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
    // InternalBDSL.g:3512:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3516:1: ( ( ')' ) )
            // InternalBDSL.g:3517:1: ( ')' )
            {
            // InternalBDSL.g:3517:1: ( ')' )
            // InternalBDSL.g:3518:2: ')'
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


    // $ANTLR start "rule__MainDeclaration__Group__0"
    // InternalBDSL.g:3528:1: rule__MainDeclaration__Group__0 : rule__MainDeclaration__Group__0__Impl rule__MainDeclaration__Group__1 ;
    public final void rule__MainDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3532:1: ( rule__MainDeclaration__Group__0__Impl rule__MainDeclaration__Group__1 )
            // InternalBDSL.g:3533:2: rule__MainDeclaration__Group__0__Impl rule__MainDeclaration__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__MainDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainDeclaration__Group__1();

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
    // $ANTLR end "rule__MainDeclaration__Group__0"


    // $ANTLR start "rule__MainDeclaration__Group__0__Impl"
    // InternalBDSL.g:3540:1: rule__MainDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__MainDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3544:1: ( ( () ) )
            // InternalBDSL.g:3545:1: ( () )
            {
            // InternalBDSL.g:3545:1: ( () )
            // InternalBDSL.g:3546:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclarationAccess().getMainDeclarationAction_0()); 
            }
            // InternalBDSL.g:3547:2: ()
            // InternalBDSL.g:3547:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclarationAccess().getMainDeclarationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainDeclaration__Group__0__Impl"


    // $ANTLR start "rule__MainDeclaration__Group__1"
    // InternalBDSL.g:3555:1: rule__MainDeclaration__Group__1 : rule__MainDeclaration__Group__1__Impl rule__MainDeclaration__Group__2 ;
    public final void rule__MainDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3559:1: ( rule__MainDeclaration__Group__1__Impl rule__MainDeclaration__Group__2 )
            // InternalBDSL.g:3560:2: rule__MainDeclaration__Group__1__Impl rule__MainDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__MainDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainDeclaration__Group__2();

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
    // $ANTLR end "rule__MainDeclaration__Group__1"


    // $ANTLR start "rule__MainDeclaration__Group__1__Impl"
    // InternalBDSL.g:3567:1: rule__MainDeclaration__Group__1__Impl : ( ( rule__MainDeclaration__DefinitionAssignment_1 ) ) ;
    public final void rule__MainDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3571:1: ( ( ( rule__MainDeclaration__DefinitionAssignment_1 ) ) )
            // InternalBDSL.g:3572:1: ( ( rule__MainDeclaration__DefinitionAssignment_1 ) )
            {
            // InternalBDSL.g:3572:1: ( ( rule__MainDeclaration__DefinitionAssignment_1 ) )
            // InternalBDSL.g:3573:2: ( rule__MainDeclaration__DefinitionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclarationAccess().getDefinitionAssignment_1()); 
            }
            // InternalBDSL.g:3574:2: ( rule__MainDeclaration__DefinitionAssignment_1 )
            // InternalBDSL.g:3574:3: rule__MainDeclaration__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MainDeclaration__DefinitionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclarationAccess().getDefinitionAssignment_1()); 
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
    // $ANTLR end "rule__MainDeclaration__Group__1__Impl"


    // $ANTLR start "rule__MainDeclaration__Group__2"
    // InternalBDSL.g:3582:1: rule__MainDeclaration__Group__2 : rule__MainDeclaration__Group__2__Impl ;
    public final void rule__MainDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3586:1: ( rule__MainDeclaration__Group__2__Impl )
            // InternalBDSL.g:3587:2: rule__MainDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__MainDeclaration__Group__2"


    // $ANTLR start "rule__MainDeclaration__Group__2__Impl"
    // InternalBDSL.g:3593:1: rule__MainDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__MainDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3597:1: ( ( ';' ) )
            // InternalBDSL.g:3598:1: ( ';' )
            {
            // InternalBDSL.g:3598:1: ( ';' )
            // InternalBDSL.g:3599:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclarationAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__MainDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PrintLn__Group__0"
    // InternalBDSL.g:3609:1: rule__PrintLn__Group__0 : rule__PrintLn__Group__0__Impl rule__PrintLn__Group__1 ;
    public final void rule__PrintLn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3613:1: ( rule__PrintLn__Group__0__Impl rule__PrintLn__Group__1 )
            // InternalBDSL.g:3614:2: rule__PrintLn__Group__0__Impl rule__PrintLn__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalBDSL.g:3621:1: rule__PrintLn__Group__0__Impl : ( () ) ;
    public final void rule__PrintLn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3625:1: ( ( () ) )
            // InternalBDSL.g:3626:1: ( () )
            {
            // InternalBDSL.g:3626:1: ( () )
            // InternalBDSL.g:3627:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getPrintLnAction_0()); 
            }
            // InternalBDSL.g:3628:2: ()
            // InternalBDSL.g:3628:3: 
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
    // InternalBDSL.g:3636:1: rule__PrintLn__Group__1 : rule__PrintLn__Group__1__Impl rule__PrintLn__Group__2 ;
    public final void rule__PrintLn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3640:1: ( rule__PrintLn__Group__1__Impl rule__PrintLn__Group__2 )
            // InternalBDSL.g:3641:2: rule__PrintLn__Group__1__Impl rule__PrintLn__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalBDSL.g:3648:1: rule__PrintLn__Group__1__Impl : ( 'println' ) ;
    public final void rule__PrintLn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3652:1: ( ( 'println' ) )
            // InternalBDSL.g:3653:1: ( 'println' )
            {
            // InternalBDSL.g:3653:1: ( 'println' )
            // InternalBDSL.g:3654:2: 'println'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getPrintlnKeyword_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:3663:1: rule__PrintLn__Group__2 : rule__PrintLn__Group__2__Impl rule__PrintLn__Group__3 ;
    public final void rule__PrintLn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3667:1: ( rule__PrintLn__Group__2__Impl rule__PrintLn__Group__3 )
            // InternalBDSL.g:3668:2: rule__PrintLn__Group__2__Impl rule__PrintLn__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalBDSL.g:3675:1: rule__PrintLn__Group__2__Impl : ( '(' ) ;
    public final void rule__PrintLn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3679:1: ( ( '(' ) )
            // InternalBDSL.g:3680:1: ( '(' )
            {
            // InternalBDSL.g:3680:1: ( '(' )
            // InternalBDSL.g:3681:2: '('
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
    // InternalBDSL.g:3690:1: rule__PrintLn__Group__3 : rule__PrintLn__Group__3__Impl rule__PrintLn__Group__4 ;
    public final void rule__PrintLn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3694:1: ( rule__PrintLn__Group__3__Impl rule__PrintLn__Group__4 )
            // InternalBDSL.g:3695:2: rule__PrintLn__Group__3__Impl rule__PrintLn__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalBDSL.g:3702:1: rule__PrintLn__Group__3__Impl : ( ( rule__PrintLn__TextAssignment_3 ) ) ;
    public final void rule__PrintLn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3706:1: ( ( ( rule__PrintLn__TextAssignment_3 ) ) )
            // InternalBDSL.g:3707:1: ( ( rule__PrintLn__TextAssignment_3 ) )
            {
            // InternalBDSL.g:3707:1: ( ( rule__PrintLn__TextAssignment_3 ) )
            // InternalBDSL.g:3708:2: ( rule__PrintLn__TextAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getTextAssignment_3()); 
            }
            // InternalBDSL.g:3709:2: ( rule__PrintLn__TextAssignment_3 )
            // InternalBDSL.g:3709:3: rule__PrintLn__TextAssignment_3
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
    // InternalBDSL.g:3717:1: rule__PrintLn__Group__4 : rule__PrintLn__Group__4__Impl rule__PrintLn__Group__5 ;
    public final void rule__PrintLn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3721:1: ( rule__PrintLn__Group__4__Impl rule__PrintLn__Group__5 )
            // InternalBDSL.g:3722:2: rule__PrintLn__Group__4__Impl rule__PrintLn__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalBDSL.g:3729:1: rule__PrintLn__Group__4__Impl : ( ( rule__PrintLn__Group_4__0 )? ) ;
    public final void rule__PrintLn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3733:1: ( ( ( rule__PrintLn__Group_4__0 )? ) )
            // InternalBDSL.g:3734:1: ( ( rule__PrintLn__Group_4__0 )? )
            {
            // InternalBDSL.g:3734:1: ( ( rule__PrintLn__Group_4__0 )? )
            // InternalBDSL.g:3735:2: ( rule__PrintLn__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getGroup_4()); 
            }
            // InternalBDSL.g:3736:2: ( rule__PrintLn__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBDSL.g:3736:3: rule__PrintLn__Group_4__0
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
    // InternalBDSL.g:3744:1: rule__PrintLn__Group__5 : rule__PrintLn__Group__5__Impl ;
    public final void rule__PrintLn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3748:1: ( rule__PrintLn__Group__5__Impl )
            // InternalBDSL.g:3749:2: rule__PrintLn__Group__5__Impl
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
    // InternalBDSL.g:3755:1: rule__PrintLn__Group__5__Impl : ( ')' ) ;
    public final void rule__PrintLn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3759:1: ( ( ')' ) )
            // InternalBDSL.g:3760:1: ( ')' )
            {
            // InternalBDSL.g:3760:1: ( ')' )
            // InternalBDSL.g:3761:2: ')'
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
    // InternalBDSL.g:3771:1: rule__PrintLn__Group_4__0 : rule__PrintLn__Group_4__0__Impl rule__PrintLn__Group_4__1 ;
    public final void rule__PrintLn__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3775:1: ( rule__PrintLn__Group_4__0__Impl rule__PrintLn__Group_4__1 )
            // InternalBDSL.g:3776:2: rule__PrintLn__Group_4__0__Impl rule__PrintLn__Group_4__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalBDSL.g:3783:1: rule__PrintLn__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PrintLn__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3787:1: ( ( ',' ) )
            // InternalBDSL.g:3788:1: ( ',' )
            {
            // InternalBDSL.g:3788:1: ( ',' )
            // InternalBDSL.g:3789:2: ','
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
    // InternalBDSL.g:3798:1: rule__PrintLn__Group_4__1 : rule__PrintLn__Group_4__1__Impl ;
    public final void rule__PrintLn__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3802:1: ( rule__PrintLn__Group_4__1__Impl )
            // InternalBDSL.g:3803:2: rule__PrintLn__Group_4__1__Impl
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
    // InternalBDSL.g:3809:1: rule__PrintLn__Group_4__1__Impl : ( ( rule__PrintLn__ModeAssignment_4_1 ) ) ;
    public final void rule__PrintLn__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3813:1: ( ( ( rule__PrintLn__ModeAssignment_4_1 ) ) )
            // InternalBDSL.g:3814:1: ( ( rule__PrintLn__ModeAssignment_4_1 ) )
            {
            // InternalBDSL.g:3814:1: ( ( rule__PrintLn__ModeAssignment_4_1 ) )
            // InternalBDSL.g:3815:2: ( rule__PrintLn__ModeAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getModeAssignment_4_1()); 
            }
            // InternalBDSL.g:3816:2: ( rule__PrintLn__ModeAssignment_4_1 )
            // InternalBDSL.g:3816:3: rule__PrintLn__ModeAssignment_4_1
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
    // InternalBDSL.g:3825:1: rule__PrintableExpression__Group_0__0 : rule__PrintableExpression__Group_0__0__Impl rule__PrintableExpression__Group_0__1 ;
    public final void rule__PrintableExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3829:1: ( rule__PrintableExpression__Group_0__0__Impl rule__PrintableExpression__Group_0__1 )
            // InternalBDSL.g:3830:2: rule__PrintableExpression__Group_0__0__Impl rule__PrintableExpression__Group_0__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalBDSL.g:3837:1: rule__PrintableExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__PrintableExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3841:1: ( ( () ) )
            // InternalBDSL.g:3842:1: ( () )
            {
            // InternalBDSL.g:3842:1: ( () )
            // InternalBDSL.g:3843:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintableExpressionAccess().getStringLiteralAction_0_0()); 
            }
            // InternalBDSL.g:3844:2: ()
            // InternalBDSL.g:3844:3: 
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
    // InternalBDSL.g:3852:1: rule__PrintableExpression__Group_0__1 : rule__PrintableExpression__Group_0__1__Impl ;
    public final void rule__PrintableExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3856:1: ( rule__PrintableExpression__Group_0__1__Impl )
            // InternalBDSL.g:3857:2: rule__PrintableExpression__Group_0__1__Impl
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
    // InternalBDSL.g:3863:1: rule__PrintableExpression__Group_0__1__Impl : ( ( rule__PrintableExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__PrintableExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3867:1: ( ( ( rule__PrintableExpression__ValueAssignment_0_1 ) ) )
            // InternalBDSL.g:3868:1: ( ( rule__PrintableExpression__ValueAssignment_0_1 ) )
            {
            // InternalBDSL.g:3868:1: ( ( rule__PrintableExpression__ValueAssignment_0_1 ) )
            // InternalBDSL.g:3869:2: ( rule__PrintableExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintableExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalBDSL.g:3870:2: ( rule__PrintableExpression__ValueAssignment_0_1 )
            // InternalBDSL.g:3870:3: rule__PrintableExpression__ValueAssignment_0_1
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
    // InternalBDSL.g:3879:1: rule__BRSModel__UnorderedGroup_1 : rule__BRSModel__UnorderedGroup_1__0 {...}?;
    public final void rule__BRSModel__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBRSModelAccess().getUnorderedGroup_1());
        	
        try {
            // InternalBDSL.g:3884:1: ( rule__BRSModel__UnorderedGroup_1__0 {...}?)
            // InternalBDSL.g:3885:2: rule__BRSModel__UnorderedGroup_1__0 {...}?
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
    // InternalBDSL.g:3893:1: rule__BRSModel__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) ) ;
    public final void rule__BRSModel__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalBDSL.g:3898:1: ( ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) ) )
            // InternalBDSL.g:3899:3: ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) )
            {
            // InternalBDSL.g:3899:3: ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalBDSL.g:3900:3: ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) )
                    {
                    // InternalBDSL.g:3900:3: ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) )
                    // InternalBDSL.g:3901:4: {...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BRSModel__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalBDSL.g:3901:104: ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) )
                    // InternalBDSL.g:3902:5: ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0);
                    selected = true;
                    // InternalBDSL.g:3908:5: ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) )
                    // InternalBDSL.g:3909:6: ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* )
                    {
                    // InternalBDSL.g:3909:6: ( ( rule__BRSModel__StatementsAssignment_1_0 ) )
                    // InternalBDSL.g:3910:7: ( rule__BRSModel__StatementsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRSModelAccess().getStatementsAssignment_1_0()); 
                    }
                    // InternalBDSL.g:3911:7: ( rule__BRSModel__StatementsAssignment_1_0 )
                    // InternalBDSL.g:3911:8: rule__BRSModel__StatementsAssignment_1_0
                    {
                    pushFollow(FOLLOW_46);
                    rule__BRSModel__StatementsAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBRSModelAccess().getStatementsAssignment_1_0()); 
                    }

                    }

                    // InternalBDSL.g:3914:6: ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* )
                    // InternalBDSL.g:3915:7: ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRSModelAccess().getStatementsAssignment_1_0()); 
                    }
                    // InternalBDSL.g:3916:7: ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==38) ) {
                            int LA30_1 = input.LA(2);

                            if ( (synpred1_InternalBDSL()) ) {
                                alt30=1;
                            }


                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalBDSL.g:3916:8: ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0
                    	    {
                    	    pushFollow(FOLLOW_46);
                    	    rule__BRSModel__StatementsAssignment_1_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
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
                    // InternalBDSL.g:3922:3: ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) )
                    {
                    // InternalBDSL.g:3922:3: ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) )
                    // InternalBDSL.g:3923:4: {...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BRSModel__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalBDSL.g:3923:104: ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) )
                    // InternalBDSL.g:3924:5: ( ( rule__BRSModel__MainAssignment_1_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1);
                    selected = true;
                    // InternalBDSL.g:3930:5: ( ( rule__BRSModel__MainAssignment_1_1 ) )
                    // InternalBDSL.g:3931:6: ( rule__BRSModel__MainAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRSModelAccess().getMainAssignment_1_1()); 
                    }
                    // InternalBDSL.g:3932:6: ( rule__BRSModel__MainAssignment_1_1 )
                    // InternalBDSL.g:3932:7: rule__BRSModel__MainAssignment_1_1
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
    // InternalBDSL.g:3945:1: rule__BRSModel__UnorderedGroup_1__0 : rule__BRSModel__UnorderedGroup_1__Impl ( rule__BRSModel__UnorderedGroup_1__1 )? ;
    public final void rule__BRSModel__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3949:1: ( rule__BRSModel__UnorderedGroup_1__Impl ( rule__BRSModel__UnorderedGroup_1__1 )? )
            // InternalBDSL.g:3950:2: rule__BRSModel__UnorderedGroup_1__Impl ( rule__BRSModel__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_47);
            rule__BRSModel__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBDSL.g:3951:2: ( rule__BRSModel__UnorderedGroup_1__1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBDSL.g:3951:2: rule__BRSModel__UnorderedGroup_1__1
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
    // InternalBDSL.g:3957:1: rule__BRSModel__UnorderedGroup_1__1 : rule__BRSModel__UnorderedGroup_1__Impl ;
    public final void rule__BRSModel__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3961:1: ( rule__BRSModel__UnorderedGroup_1__Impl )
            // InternalBDSL.g:3962:2: rule__BRSModel__UnorderedGroup_1__Impl
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
    // InternalBDSL.g:3969:1: rule__BRSModel__SignatureAssignment_0 : ( ruleSignature ) ;
    public final void rule__BRSModel__SignatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3973:1: ( ( ruleSignature ) )
            // InternalBDSL.g:3974:2: ( ruleSignature )
            {
            // InternalBDSL.g:3974:2: ( ruleSignature )
            // InternalBDSL.g:3975:3: ruleSignature
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
    // InternalBDSL.g:3984:1: rule__BRSModel__StatementsAssignment_1_0 : ( ruleAbstractElement ) ;
    public final void rule__BRSModel__StatementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3988:1: ( ( ruleAbstractElement ) )
            // InternalBDSL.g:3989:2: ( ruleAbstractElement )
            {
            // InternalBDSL.g:3989:2: ( ruleAbstractElement )
            // InternalBDSL.g:3990:3: ruleAbstractElement
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
    // InternalBDSL.g:3999:1: rule__BRSModel__MainAssignment_1_1 : ( ruleMainElement ) ;
    public final void rule__BRSModel__MainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4003:1: ( ( ruleMainElement ) )
            // InternalBDSL.g:4004:2: ( ruleMainElement )
            {
            // InternalBDSL.g:4004:2: ( ruleMainElement )
            // InternalBDSL.g:4005:3: ruleMainElement
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
    // InternalBDSL.g:4014:1: rule__MainElement__ValueAssignment_4 : ( ruleMainDeclaration ) ;
    public final void rule__MainElement__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4018:1: ( ( ruleMainDeclaration ) )
            // InternalBDSL.g:4019:2: ( ruleMainDeclaration )
            {
            // InternalBDSL.g:4019:2: ( ruleMainDeclaration )
            // InternalBDSL.g:4020:3: ruleMainDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getValueMainDeclarationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMainDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementAccess().getValueMainDeclarationParserRuleCall_4_0()); 
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
    // InternalBDSL.g:4029:1: rule__Signature__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Signature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4033:1: ( ( RULE_ID ) )
            // InternalBDSL.g:4034:2: ( RULE_ID )
            {
            // InternalBDSL.g:4034:2: ( RULE_ID )
            // InternalBDSL.g:4035:3: RULE_ID
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
    // InternalBDSL.g:4044:1: rule__Signature__ControlsAssignment_3_1 : ( ruleControlDef ) ;
    public final void rule__Signature__ControlsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4048:1: ( ( ruleControlDef ) )
            // InternalBDSL.g:4049:2: ( ruleControlDef )
            {
            // InternalBDSL.g:4049:2: ( ruleControlDef )
            // InternalBDSL.g:4050:3: ruleControlDef
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
    // InternalBDSL.g:4059:1: rule__ControlDef__TypeAssignment_1 : ( ruleControlType ) ;
    public final void rule__ControlDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4063:1: ( ( ruleControlType ) )
            // InternalBDSL.g:4064:2: ( ruleControlType )
            {
            // InternalBDSL.g:4064:2: ( ruleControlType )
            // InternalBDSL.g:4065:3: ruleControlType
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
    // InternalBDSL.g:4074:1: rule__ControlDef__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ControlDef__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4078:1: ( ( RULE_ID ) )
            // InternalBDSL.g:4079:2: ( RULE_ID )
            {
            // InternalBDSL.g:4079:2: ( RULE_ID )
            // InternalBDSL.g:4080:3: RULE_ID
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
    // InternalBDSL.g:4089:1: rule__ControlDef__ArityAssignment_5 : ( ruleArityValue ) ;
    public final void rule__ControlDef__ArityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4093:1: ( ( ruleArityValue ) )
            // InternalBDSL.g:4094:2: ( ruleArityValue )
            {
            // InternalBDSL.g:4094:2: ( ruleArityValue )
            // InternalBDSL.g:4095:3: ruleArityValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getArityArityValueParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArityValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlDefAccess().getArityArityValueParserRuleCall_5_0()); 
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


    // $ANTLR start "rule__ArityValue__ValueAssignment"
    // InternalBDSL.g:4104:1: rule__ArityValue__ValueAssignment : ( ruleEInt ) ;
    public final void rule__ArityValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4108:1: ( ( ruleEInt ) )
            // InternalBDSL.g:4109:2: ( ruleEInt )
            {
            // InternalBDSL.g:4109:2: ( ruleEInt )
            // InternalBDSL.g:4110:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArityValueAccess().getValueEIntParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArityValueAccess().getValueEIntParserRuleCall_0()); 
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
    // $ANTLR end "rule__ArityValue__ValueAssignment"


    // $ANTLR start "rule__NameConstant__ValueAssignment"
    // InternalBDSL.g:4119:1: rule__NameConstant__ValueAssignment : ( ruleEString ) ;
    public final void rule__NameConstant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4123:1: ( ( ruleEString ) )
            // InternalBDSL.g:4124:2: ( ruleEString )
            {
            // InternalBDSL.g:4124:2: ( ruleEString )
            // InternalBDSL.g:4125:3: ruleEString
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
    // InternalBDSL.g:4134:1: rule__SiteVars__NameAssignment : ( RULE_ID ) ;
    public final void rule__SiteVars__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4138:1: ( ( RULE_ID ) )
            // InternalBDSL.g:4139:2: ( RULE_ID )
            {
            // InternalBDSL.g:4139:2: ( RULE_ID )
            // InternalBDSL.g:4140:3: RULE_ID
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
    // InternalBDSL.g:4149:1: rule__Site__IndexAssignment_2 : ( RULE_INT_SITE ) ;
    public final void rule__Site__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4153:1: ( ( RULE_INT_SITE ) )
            // InternalBDSL.g:4154:2: ( RULE_INT_SITE )
            {
            // InternalBDSL.g:4154:2: ( RULE_INT_SITE )
            // InternalBDSL.g:4155:3: RULE_INT_SITE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSiteAccess().getIndexINT_SITETerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT_SITE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSiteAccess().getIndexINT_SITETerminalRuleCall_2_0()); 
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
    // InternalBDSL.g:4164:1: rule__LVD2__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LVD2__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4168:1: ( ( RULE_ID ) )
            // InternalBDSL.g:4169:2: ( RULE_ID )
            {
            // InternalBDSL.g:4169:2: ( RULE_ID )
            // InternalBDSL.g:4170:3: RULE_ID
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
    // InternalBDSL.g:4179:1: rule__LVD2__TypeAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__LVD2__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4183:1: ( ( ( ruleFQN ) ) )
            // InternalBDSL.g:4184:2: ( ( ruleFQN ) )
            {
            // InternalBDSL.g:4184:2: ( ( ruleFQN ) )
            // InternalBDSL.g:4185:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getTypeControlVariableCrossReference_4_0()); 
            }
            // InternalBDSL.g:4186:3: ( ruleFQN )
            // InternalBDSL.g:4187:4: ruleFQN
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
    // InternalBDSL.g:4198:1: rule__LVD2__DefinitionAssignment_7 : ( ruleBigraphExpression ) ;
    public final void rule__LVD2__DefinitionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4202:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:4203:2: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:4203:2: ( ruleBigraphExpression )
            // InternalBDSL.g:4204:3: ruleBigraphExpression
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
    // InternalBDSL.g:4213:1: rule__LocalVarDecl__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__LocalVarDecl__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4217:1: ( ( RULE_ID ) )
            // InternalBDSL.g:4218:2: ( RULE_ID )
            {
            // InternalBDSL.g:4218:2: ( RULE_ID )
            // InternalBDSL.g:4219:3: RULE_ID
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
    // InternalBDSL.g:4228:1: rule__LocalVarDecl__SigAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__LocalVarDecl__SigAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4232:1: ( ( ( RULE_ID ) ) )
            // InternalBDSL.g:4233:2: ( ( RULE_ID ) )
            {
            // InternalBDSL.g:4233:2: ( ( RULE_ID ) )
            // InternalBDSL.g:4234:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSigSignatureCrossReference_2_1_1_0()); 
            }
            // InternalBDSL.g:4235:3: ( RULE_ID )
            // InternalBDSL.g:4236:4: RULE_ID
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
    // InternalBDSL.g:4247:1: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 : ( ruleSiteVars ) ;
    public final void rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4251:1: ( ( ruleSiteVars ) )
            // InternalBDSL.g:4252:2: ( ruleSiteVars )
            {
            // InternalBDSL.g:4252:2: ( ruleSiteVars )
            // InternalBDSL.g:4253:3: ruleSiteVars
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
    // InternalBDSL.g:4262:1: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 : ( ruleSiteVars ) ;
    public final void rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4266:1: ( ( ruleSiteVars ) )
            // InternalBDSL.g:4267:2: ( ruleSiteVars )
            {
            // InternalBDSL.g:4267:2: ( ruleSiteVars )
            // InternalBDSL.g:4268:3: ruleSiteVars
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
    // InternalBDSL.g:4277:1: rule__LocalVarDecl__TypeAssignment_2_2_2 : ( ( ruleFQN ) ) ;
    public final void rule__LocalVarDecl__TypeAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4281:1: ( ( ( ruleFQN ) ) )
            // InternalBDSL.g:4282:2: ( ( ruleFQN ) )
            {
            // InternalBDSL.g:4282:2: ( ( ruleFQN ) )
            // InternalBDSL.g:4283:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getTypeControlVariableCrossReference_2_2_2_0()); 
            }
            // InternalBDSL.g:4284:3: ( ruleFQN )
            // InternalBDSL.g:4285:4: ruleFQN
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
    // InternalBDSL.g:4296:1: rule__LocalVarDecl__DefinitionAssignment_2_3_2 : ( ruleBigraphExpression ) ;
    public final void rule__LocalVarDecl__DefinitionAssignment_2_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4300:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:4301:2: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:4301:2: ( ruleBigraphExpression )
            // InternalBDSL.g:4302:3: ruleBigraphExpression
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


    // $ANTLR start "rule__BigraphVarReference__ValueAssignment"
    // InternalBDSL.g:4311:1: rule__BigraphVarReference__ValueAssignment : ( ( ruleBigraphVarReferenceID ) ) ;
    public final void rule__BigraphVarReference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4315:1: ( ( ( ruleBigraphVarReferenceID ) ) )
            // InternalBDSL.g:4316:2: ( ( ruleBigraphVarReferenceID ) )
            {
            // InternalBDSL.g:4316:2: ( ( ruleBigraphVarReferenceID ) )
            // InternalBDSL.g:4317:3: ( ruleBigraphVarReferenceID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceAccess().getValueLocalVarDeclCrossReference_0()); 
            }
            // InternalBDSL.g:4318:3: ( ruleBigraphVarReferenceID )
            // InternalBDSL.g:4319:4: ruleBigraphVarReferenceID
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


    // $ANTLR start "rule__NodeExpressionCall__ValueAssignment_0"
    // InternalBDSL.g:4330:1: rule__NodeExpressionCall__ValueAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__NodeExpressionCall__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4334:1: ( ( ( ruleFQN ) ) )
            // InternalBDSL.g:4335:2: ( ( ruleFQN ) )
            {
            // InternalBDSL.g:4335:2: ( ( ruleFQN ) )
            // InternalBDSL.g:4336:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getValueControlVariableCrossReference_0_0()); 
            }
            // InternalBDSL.g:4337:3: ( ruleFQN )
            // InternalBDSL.g:4338:4: ruleFQN
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
    // InternalBDSL.g:4349:1: rule__NodeExpressionCall__LinksAssignment_1_1 : ( ruleLinkNames ) ;
    public final void rule__NodeExpressionCall__LinksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4353:1: ( ( ruleLinkNames ) )
            // InternalBDSL.g:4354:2: ( ruleLinkNames )
            {
            // InternalBDSL.g:4354:2: ( ruleLinkNames )
            // InternalBDSL.g:4355:3: ruleLinkNames
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
    // InternalBDSL.g:4364:1: rule__Addition__OperatorAssignment_1_0_1 : ( ruleBinaryParallelOperator ) ;
    public final void rule__Addition__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4368:1: ( ( ruleBinaryParallelOperator ) )
            // InternalBDSL.g:4369:2: ( ruleBinaryParallelOperator )
            {
            // InternalBDSL.g:4369:2: ( ruleBinaryParallelOperator )
            // InternalBDSL.g:4370:3: ruleBinaryParallelOperator
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
    // InternalBDSL.g:4379:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4383:1: ( ( ruleMultiplication ) )
            // InternalBDSL.g:4384:2: ( ruleMultiplication )
            {
            // InternalBDSL.g:4384:2: ( ruleMultiplication )
            // InternalBDSL.g:4385:3: ruleMultiplication
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
    // InternalBDSL.g:4394:1: rule__Multiplication__OperatorAssignment_1_0_1 : ( ruleBinaryNestingOperator ) ;
    public final void rule__Multiplication__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4398:1: ( ( ruleBinaryNestingOperator ) )
            // InternalBDSL.g:4399:2: ( ruleBinaryNestingOperator )
            {
            // InternalBDSL.g:4399:2: ( ruleBinaryNestingOperator )
            // InternalBDSL.g:4400:3: ruleBinaryNestingOperator
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
    // InternalBDSL.g:4409:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4413:1: ( ( rulePrimaryExpression ) )
            // InternalBDSL.g:4414:2: ( rulePrimaryExpression )
            {
            // InternalBDSL.g:4414:2: ( rulePrimaryExpression )
            // InternalBDSL.g:4415:3: rulePrimaryExpression
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


    // $ANTLR start "rule__MainDeclaration__DefinitionAssignment_1"
    // InternalBDSL.g:4424:1: rule__MainDeclaration__DefinitionAssignment_1 : ( ruleAbstractMainStatements ) ;
    public final void rule__MainDeclaration__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4428:1: ( ( ruleAbstractMainStatements ) )
            // InternalBDSL.g:4429:2: ( ruleAbstractMainStatements )
            {
            // InternalBDSL.g:4429:2: ( ruleAbstractMainStatements )
            // InternalBDSL.g:4430:3: ruleAbstractMainStatements
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclarationAccess().getDefinitionAbstractMainStatementsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractMainStatements();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclarationAccess().getDefinitionAbstractMainStatementsParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__MainDeclaration__DefinitionAssignment_1"


    // $ANTLR start "rule__PrintLn__TextAssignment_3"
    // InternalBDSL.g:4439:1: rule__PrintLn__TextAssignment_3 : ( rulePrintableExpression ) ;
    public final void rule__PrintLn__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4443:1: ( ( rulePrintableExpression ) )
            // InternalBDSL.g:4444:2: ( rulePrintableExpression )
            {
            // InternalBDSL.g:4444:2: ( rulePrintableExpression )
            // InternalBDSL.g:4445:3: rulePrintableExpression
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
    // InternalBDSL.g:4454:1: rule__PrintLn__ModeAssignment_4_1 : ( ruleOutputModeModel ) ;
    public final void rule__PrintLn__ModeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4458:1: ( ( ruleOutputModeModel ) )
            // InternalBDSL.g:4459:2: ( ruleOutputModeModel )
            {
            // InternalBDSL.g:4459:2: ( ruleOutputModeModel )
            // InternalBDSL.g:4460:3: ruleOutputModeModel
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
    // InternalBDSL.g:4469:1: rule__PrintableExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__PrintableExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4473:1: ( ( RULE_STRING ) )
            // InternalBDSL.g:4474:2: ( RULE_STRING )
            {
            // InternalBDSL.g:4474:2: ( RULE_STRING )
            // InternalBDSL.g:4475:3: RULE_STRING
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
        // InternalBDSL.g:3916:8: ( rule__BRSModel__StatementsAssignment_1_0 )
        // InternalBDSL.g:3916:9: rule__BRSModel__StatementsAssignment_1_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040022000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001001C0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001001C0002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000005822000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000005802000022L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000019008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000005802000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000004004000002L});

}
