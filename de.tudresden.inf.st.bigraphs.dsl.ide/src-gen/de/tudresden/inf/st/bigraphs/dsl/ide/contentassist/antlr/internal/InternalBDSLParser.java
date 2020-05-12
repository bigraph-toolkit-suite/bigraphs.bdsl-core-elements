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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UNSET'", "'+'", "'||'", "'UNSET2'", "'-'", "'*'", "'atomic'", "'active'", "'passive'", "'.'", "'.*'", "'$'", "'main'", "'='", "'{'", "'}'", "';'", "'signature'", "'ctrl'", "'arity'", "','", "'val'", "':'", "'('", "')'", "'['", "']'", "'println'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleLVD2"
    // InternalBDSL.g:411:1: entryRuleLVD2 : ruleLVD2 EOF ;
    public final void entryRuleLVD2() throws RecognitionException {
        try {
            // InternalBDSL.g:412:1: ( ruleLVD2 EOF )
            // InternalBDSL.g:413:1: ruleLVD2 EOF
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
    // InternalBDSL.g:420:1: ruleLVD2 : ( ( rule__LVD2__Group__0 ) ) ;
    public final void ruleLVD2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:424:2: ( ( ( rule__LVD2__Group__0 ) ) )
            // InternalBDSL.g:425:2: ( ( rule__LVD2__Group__0 ) )
            {
            // InternalBDSL.g:425:2: ( ( rule__LVD2__Group__0 ) )
            // InternalBDSL.g:426:3: ( rule__LVD2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getGroup()); 
            }
            // InternalBDSL.g:427:3: ( rule__LVD2__Group__0 )
            // InternalBDSL.g:427:4: rule__LVD2__Group__0
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
    // InternalBDSL.g:436:1: entryRuleLocalVarDecl : ruleLocalVarDecl EOF ;
    public final void entryRuleLocalVarDecl() throws RecognitionException {
        try {
            // InternalBDSL.g:437:1: ( ruleLocalVarDecl EOF )
            // InternalBDSL.g:438:1: ruleLocalVarDecl EOF
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
    // InternalBDSL.g:445:1: ruleLocalVarDecl : ( ( rule__LocalVarDecl__Group__0 ) ) ;
    public final void ruleLocalVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:449:2: ( ( ( rule__LocalVarDecl__Group__0 ) ) )
            // InternalBDSL.g:450:2: ( ( rule__LocalVarDecl__Group__0 ) )
            {
            // InternalBDSL.g:450:2: ( ( rule__LocalVarDecl__Group__0 ) )
            // InternalBDSL.g:451:3: ( rule__LocalVarDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup()); 
            }
            // InternalBDSL.g:452:3: ( rule__LocalVarDecl__Group__0 )
            // InternalBDSL.g:452:4: rule__LocalVarDecl__Group__0
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
    // InternalBDSL.g:461:1: entryRuleBigraphVarReference : ruleBigraphVarReference EOF ;
    public final void entryRuleBigraphVarReference() throws RecognitionException {
        try {
            // InternalBDSL.g:462:1: ( ruleBigraphVarReference EOF )
            // InternalBDSL.g:463:1: ruleBigraphVarReference EOF
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
    // InternalBDSL.g:470:1: ruleBigraphVarReference : ( ( rule__BigraphVarReference__ValueAssignment ) ) ;
    public final void ruleBigraphVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:474:2: ( ( ( rule__BigraphVarReference__ValueAssignment ) ) )
            // InternalBDSL.g:475:2: ( ( rule__BigraphVarReference__ValueAssignment ) )
            {
            // InternalBDSL.g:475:2: ( ( rule__BigraphVarReference__ValueAssignment ) )
            // InternalBDSL.g:476:3: ( rule__BigraphVarReference__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceAccess().getValueAssignment()); 
            }
            // InternalBDSL.g:477:3: ( rule__BigraphVarReference__ValueAssignment )
            // InternalBDSL.g:477:4: rule__BigraphVarReference__ValueAssignment
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
    // InternalBDSL.g:486:1: entryRuleAbstractBigraphDeclaration : ruleAbstractBigraphDeclaration EOF ;
    public final void entryRuleAbstractBigraphDeclaration() throws RecognitionException {
        try {
            // InternalBDSL.g:487:1: ( ruleAbstractBigraphDeclaration EOF )
            // InternalBDSL.g:488:1: ruleAbstractBigraphDeclaration EOF
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
    // InternalBDSL.g:495:1: ruleAbstractBigraphDeclaration : ( ( rule__AbstractBigraphDeclaration__Alternatives ) ) ;
    public final void ruleAbstractBigraphDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:499:2: ( ( ( rule__AbstractBigraphDeclaration__Alternatives ) ) )
            // InternalBDSL.g:500:2: ( ( rule__AbstractBigraphDeclaration__Alternatives ) )
            {
            // InternalBDSL.g:500:2: ( ( rule__AbstractBigraphDeclaration__Alternatives ) )
            // InternalBDSL.g:501:3: ( rule__AbstractBigraphDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractBigraphDeclarationAccess().getAlternatives()); 
            }
            // InternalBDSL.g:502:3: ( rule__AbstractBigraphDeclaration__Alternatives )
            // InternalBDSL.g:502:4: rule__AbstractBigraphDeclaration__Alternatives
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
    // InternalBDSL.g:511:1: entryRuleNodeExpressionCall : ruleNodeExpressionCall EOF ;
    public final void entryRuleNodeExpressionCall() throws RecognitionException {
        try {
            // InternalBDSL.g:512:1: ( ruleNodeExpressionCall EOF )
            // InternalBDSL.g:513:1: ruleNodeExpressionCall EOF
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
    // InternalBDSL.g:520:1: ruleNodeExpressionCall : ( ( rule__NodeExpressionCall__Group__0 ) ) ;
    public final void ruleNodeExpressionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:524:2: ( ( ( rule__NodeExpressionCall__Group__0 ) ) )
            // InternalBDSL.g:525:2: ( ( rule__NodeExpressionCall__Group__0 ) )
            {
            // InternalBDSL.g:525:2: ( ( rule__NodeExpressionCall__Group__0 ) )
            // InternalBDSL.g:526:3: ( rule__NodeExpressionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getGroup()); 
            }
            // InternalBDSL.g:527:3: ( rule__NodeExpressionCall__Group__0 )
            // InternalBDSL.g:527:4: rule__NodeExpressionCall__Group__0
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
    // InternalBDSL.g:536:1: entryRuleBigraphExpression : ruleBigraphExpression EOF ;
    public final void entryRuleBigraphExpression() throws RecognitionException {
        try {
            // InternalBDSL.g:537:1: ( ruleBigraphExpression EOF )
            // InternalBDSL.g:538:1: ruleBigraphExpression EOF
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
    // InternalBDSL.g:545:1: ruleBigraphExpression : ( ruleAddition ) ;
    public final void ruleBigraphExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:549:2: ( ( ruleAddition ) )
            // InternalBDSL.g:550:2: ( ruleAddition )
            {
            // InternalBDSL.g:550:2: ( ruleAddition )
            // InternalBDSL.g:551:3: ruleAddition
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
    // InternalBDSL.g:561:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalBDSL.g:562:1: ( ruleAddition EOF )
            // InternalBDSL.g:563:1: ruleAddition EOF
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
    // InternalBDSL.g:570:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:574:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalBDSL.g:575:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalBDSL.g:575:2: ( ( rule__Addition__Group__0 ) )
            // InternalBDSL.g:576:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalBDSL.g:577:3: ( rule__Addition__Group__0 )
            // InternalBDSL.g:577:4: rule__Addition__Group__0
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
    // InternalBDSL.g:586:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalBDSL.g:587:1: ( ruleMultiplication EOF )
            // InternalBDSL.g:588:1: ruleMultiplication EOF
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
    // InternalBDSL.g:595:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:599:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalBDSL.g:600:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalBDSL.g:600:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalBDSL.g:601:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalBDSL.g:602:3: ( rule__Multiplication__Group__0 )
            // InternalBDSL.g:602:4: rule__Multiplication__Group__0
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
    // InternalBDSL.g:611:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalBDSL.g:612:1: ( rulePrimaryExpression EOF )
            // InternalBDSL.g:613:1: rulePrimaryExpression EOF
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
    // InternalBDSL.g:620:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:624:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalBDSL.g:625:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalBDSL.g:625:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalBDSL.g:626:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalBDSL.g:627:3: ( rule__PrimaryExpression__Alternatives )
            // InternalBDSL.g:627:4: rule__PrimaryExpression__Alternatives
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
    // InternalBDSL.g:636:1: entryRuleMainDeclaration : ruleMainDeclaration EOF ;
    public final void entryRuleMainDeclaration() throws RecognitionException {
        try {
            // InternalBDSL.g:637:1: ( ruleMainDeclaration EOF )
            // InternalBDSL.g:638:1: ruleMainDeclaration EOF
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
    // InternalBDSL.g:645:1: ruleMainDeclaration : ( ( rule__MainDeclaration__Group__0 ) ) ;
    public final void ruleMainDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:649:2: ( ( ( rule__MainDeclaration__Group__0 ) ) )
            // InternalBDSL.g:650:2: ( ( rule__MainDeclaration__Group__0 ) )
            {
            // InternalBDSL.g:650:2: ( ( rule__MainDeclaration__Group__0 ) )
            // InternalBDSL.g:651:3: ( rule__MainDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclarationAccess().getGroup()); 
            }
            // InternalBDSL.g:652:3: ( rule__MainDeclaration__Group__0 )
            // InternalBDSL.g:652:4: rule__MainDeclaration__Group__0
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
    // InternalBDSL.g:661:1: entryRuleAbstractMainStatements : ruleAbstractMainStatements EOF ;
    public final void entryRuleAbstractMainStatements() throws RecognitionException {
        try {
            // InternalBDSL.g:662:1: ( ruleAbstractMainStatements EOF )
            // InternalBDSL.g:663:1: ruleAbstractMainStatements EOF
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
    // InternalBDSL.g:670:1: ruleAbstractMainStatements : ( ( rule__AbstractMainStatements__Alternatives ) ) ;
    public final void ruleAbstractMainStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:674:2: ( ( ( rule__AbstractMainStatements__Alternatives ) ) )
            // InternalBDSL.g:675:2: ( ( rule__AbstractMainStatements__Alternatives ) )
            {
            // InternalBDSL.g:675:2: ( ( rule__AbstractMainStatements__Alternatives ) )
            // InternalBDSL.g:676:3: ( rule__AbstractMainStatements__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractMainStatementsAccess().getAlternatives()); 
            }
            // InternalBDSL.g:677:3: ( rule__AbstractMainStatements__Alternatives )
            // InternalBDSL.g:677:4: rule__AbstractMainStatements__Alternatives
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
    // InternalBDSL.g:686:1: entryRulePrintLn : rulePrintLn EOF ;
    public final void entryRulePrintLn() throws RecognitionException {
        try {
            // InternalBDSL.g:687:1: ( rulePrintLn EOF )
            // InternalBDSL.g:688:1: rulePrintLn EOF
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
    // InternalBDSL.g:695:1: rulePrintLn : ( ( rule__PrintLn__Group__0 ) ) ;
    public final void rulePrintLn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:699:2: ( ( ( rule__PrintLn__Group__0 ) ) )
            // InternalBDSL.g:700:2: ( ( rule__PrintLn__Group__0 ) )
            {
            // InternalBDSL.g:700:2: ( ( rule__PrintLn__Group__0 ) )
            // InternalBDSL.g:701:3: ( rule__PrintLn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getGroup()); 
            }
            // InternalBDSL.g:702:3: ( rule__PrintLn__Group__0 )
            // InternalBDSL.g:702:4: rule__PrintLn__Group__0
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
    // InternalBDSL.g:711:1: entryRulePrintableExpression : rulePrintableExpression EOF ;
    public final void entryRulePrintableExpression() throws RecognitionException {
        try {
            // InternalBDSL.g:712:1: ( rulePrintableExpression EOF )
            // InternalBDSL.g:713:1: rulePrintableExpression EOF
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
    // InternalBDSL.g:720:1: rulePrintableExpression : ( ( rule__PrintableExpression__Alternatives ) ) ;
    public final void rulePrintableExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:724:2: ( ( ( rule__PrintableExpression__Alternatives ) ) )
            // InternalBDSL.g:725:2: ( ( rule__PrintableExpression__Alternatives ) )
            {
            // InternalBDSL.g:725:2: ( ( rule__PrintableExpression__Alternatives ) )
            // InternalBDSL.g:726:3: ( rule__PrintableExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintableExpressionAccess().getAlternatives()); 
            }
            // InternalBDSL.g:727:3: ( rule__PrintableExpression__Alternatives )
            // InternalBDSL.g:727:4: rule__PrintableExpression__Alternatives
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
    // InternalBDSL.g:736:1: ruleBinaryParallelOperator : ( ( rule__BinaryParallelOperator__Alternatives ) ) ;
    public final void ruleBinaryParallelOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:740:1: ( ( ( rule__BinaryParallelOperator__Alternatives ) ) )
            // InternalBDSL.g:741:2: ( ( rule__BinaryParallelOperator__Alternatives ) )
            {
            // InternalBDSL.g:741:2: ( ( rule__BinaryParallelOperator__Alternatives ) )
            // InternalBDSL.g:742:3: ( rule__BinaryParallelOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryParallelOperatorAccess().getAlternatives()); 
            }
            // InternalBDSL.g:743:3: ( rule__BinaryParallelOperator__Alternatives )
            // InternalBDSL.g:743:4: rule__BinaryParallelOperator__Alternatives
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
    // InternalBDSL.g:752:1: ruleBinaryNestingOperator : ( ( rule__BinaryNestingOperator__Alternatives ) ) ;
    public final void ruleBinaryNestingOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:756:1: ( ( ( rule__BinaryNestingOperator__Alternatives ) ) )
            // InternalBDSL.g:757:2: ( ( rule__BinaryNestingOperator__Alternatives ) )
            {
            // InternalBDSL.g:757:2: ( ( rule__BinaryNestingOperator__Alternatives ) )
            // InternalBDSL.g:758:3: ( rule__BinaryNestingOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryNestingOperatorAccess().getAlternatives()); 
            }
            // InternalBDSL.g:759:3: ( rule__BinaryNestingOperator__Alternatives )
            // InternalBDSL.g:759:4: rule__BinaryNestingOperator__Alternatives
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
    // InternalBDSL.g:768:1: ruleControlType : ( ( rule__ControlType__Alternatives ) ) ;
    public final void ruleControlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:772:1: ( ( ( rule__ControlType__Alternatives ) ) )
            // InternalBDSL.g:773:2: ( ( rule__ControlType__Alternatives ) )
            {
            // InternalBDSL.g:773:2: ( ( rule__ControlType__Alternatives ) )
            // InternalBDSL.g:774:3: ( rule__ControlType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlTypeAccess().getAlternatives()); 
            }
            // InternalBDSL.g:775:3: ( rule__ControlType__Alternatives )
            // InternalBDSL.g:775:4: rule__ControlType__Alternatives
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBDSL.g:783:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:787:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBDSL.g:788:2: ( RULE_STRING )
                    {
                    // InternalBDSL.g:788:2: ( RULE_STRING )
                    // InternalBDSL.g:789:3: RULE_STRING
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
                    // InternalBDSL.g:794:2: ( RULE_ID )
                    {
                    // InternalBDSL.g:794:2: ( RULE_ID )
                    // InternalBDSL.g:795:3: RULE_ID
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
    // InternalBDSL.g:804:1: rule__LinkNames__Alternatives : ( ( ruleNameConstant ) | ( ( rule__LinkNames__Group_1__0 ) ) );
    public final void rule__LinkNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:808:1: ( ( ruleNameConstant ) | ( ( rule__LinkNames__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==31) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||(LA2_1>=RULE_STRING && LA2_1<=RULE_ID)||LA2_1==37) ) {
                    alt2=1;
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

                if ( (LA2_2==31) ) {
                    alt2=2;
                }
                else if ( (LA2_2==EOF||(LA2_2>=RULE_STRING && LA2_2<=RULE_ID)||LA2_2==37) ) {
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
                    // InternalBDSL.g:809:2: ( ruleNameConstant )
                    {
                    // InternalBDSL.g:809:2: ( ruleNameConstant )
                    // InternalBDSL.g:810:3: ruleNameConstant
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
                    // InternalBDSL.g:815:2: ( ( rule__LinkNames__Group_1__0 ) )
                    {
                    // InternalBDSL.g:815:2: ( ( rule__LinkNames__Group_1__0 ) )
                    // InternalBDSL.g:816:3: ( rule__LinkNames__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLinkNamesAccess().getGroup_1()); 
                    }
                    // InternalBDSL.g:817:3: ( rule__LinkNames__Group_1__0 )
                    // InternalBDSL.g:817:4: rule__LinkNames__Group_1__0
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
    // InternalBDSL.g:825:1: rule__AbstractBigraphDeclaration__Alternatives : ( ( ruleBigraphVarReference ) | ( ruleNodeExpressionCall ) | ( ruleLVD2 ) );
    public final void rule__AbstractBigraphDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:829:1: ( ( ruleBigraphVarReference ) | ( ruleNodeExpressionCall ) | ( ruleLVD2 ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
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
                    // InternalBDSL.g:830:2: ( ruleBigraphVarReference )
                    {
                    // InternalBDSL.g:830:2: ( ruleBigraphVarReference )
                    // InternalBDSL.g:831:3: ruleBigraphVarReference
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
                    // InternalBDSL.g:836:2: ( ruleNodeExpressionCall )
                    {
                    // InternalBDSL.g:836:2: ( ruleNodeExpressionCall )
                    // InternalBDSL.g:837:3: ruleNodeExpressionCall
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
                    // InternalBDSL.g:842:2: ( ruleLVD2 )
                    {
                    // InternalBDSL.g:842:2: ( ruleLVD2 )
                    // InternalBDSL.g:843:3: ruleLVD2
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

            }
        }
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
    // InternalBDSL.g:852:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleAbstractBigraphDeclaration ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:856:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleAbstractBigraphDeclaration ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==22||LA4_0==32) ) {
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
                    // InternalBDSL.g:857:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalBDSL.g:857:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalBDSL.g:858:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalBDSL.g:859:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalBDSL.g:859:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalBDSL.g:863:2: ( ruleAbstractBigraphDeclaration )
                    {
                    // InternalBDSL.g:863:2: ( ruleAbstractBigraphDeclaration )
                    // InternalBDSL.g:864:3: ruleAbstractBigraphDeclaration
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
    // InternalBDSL.g:873:1: rule__AbstractMainStatements__Alternatives : ( ( ruleBigraphVarReference ) | ( rulePrintLn ) );
    public final void rule__AbstractMainStatements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:877:1: ( ( ruleBigraphVarReference ) | ( rulePrintLn ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==38) ) {
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
                    // InternalBDSL.g:878:2: ( ruleBigraphVarReference )
                    {
                    // InternalBDSL.g:878:2: ( ruleBigraphVarReference )
                    // InternalBDSL.g:879:3: ruleBigraphVarReference
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
                    // InternalBDSL.g:884:2: ( rulePrintLn )
                    {
                    // InternalBDSL.g:884:2: ( rulePrintLn )
                    // InternalBDSL.g:885:3: rulePrintLn
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
    // InternalBDSL.g:894:1: rule__PrintableExpression__Alternatives : ( ( RULE_STRING ) | ( ruleBigraphVarReference ) );
    public final void rule__PrintableExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:898:1: ( ( RULE_STRING ) | ( ruleBigraphVarReference ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
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
                    // InternalBDSL.g:899:2: ( RULE_STRING )
                    {
                    // InternalBDSL.g:899:2: ( RULE_STRING )
                    // InternalBDSL.g:900:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrintableExpressionAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrintableExpressionAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBDSL.g:905:2: ( ruleBigraphVarReference )
                    {
                    // InternalBDSL.g:905:2: ( ruleBigraphVarReference )
                    // InternalBDSL.g:906:3: ruleBigraphVarReference
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
    // InternalBDSL.g:915:1: rule__BinaryParallelOperator__Alternatives : ( ( ( 'UNSET' ) ) | ( ( '+' ) ) | ( ( '||' ) ) );
    public final void rule__BinaryParallelOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:919:1: ( ( ( 'UNSET' ) ) | ( ( '+' ) ) | ( ( '||' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
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
                    // InternalBDSL.g:920:2: ( ( 'UNSET' ) )
                    {
                    // InternalBDSL.g:920:2: ( ( 'UNSET' ) )
                    // InternalBDSL.g:921:3: ( 'UNSET' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryParallelOperatorAccess().getUNSETEnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:922:3: ( 'UNSET' )
                    // InternalBDSL.g:922:4: 'UNSET'
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
                    // InternalBDSL.g:926:2: ( ( '+' ) )
                    {
                    // InternalBDSL.g:926:2: ( ( '+' ) )
                    // InternalBDSL.g:927:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryParallelOperatorAccess().getPLUSEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:928:3: ( '+' )
                    // InternalBDSL.g:928:4: '+'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryParallelOperatorAccess().getPLUSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:932:2: ( ( '||' ) )
                    {
                    // InternalBDSL.g:932:2: ( ( '||' ) )
                    // InternalBDSL.g:933:3: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryParallelOperatorAccess().getBARSEnumLiteralDeclaration_2()); 
                    }
                    // InternalBDSL.g:934:3: ( '||' )
                    // InternalBDSL.g:934:4: '||'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryParallelOperatorAccess().getBARSEnumLiteralDeclaration_2()); 
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
    // InternalBDSL.g:942:1: rule__BinaryNestingOperator__Alternatives : ( ( ( 'UNSET2' ) ) | ( ( '-' ) ) | ( ( '*' ) ) );
    public final void rule__BinaryNestingOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:946:1: ( ( ( 'UNSET2' ) ) | ( ( '-' ) ) | ( ( '*' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
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
                    // InternalBDSL.g:947:2: ( ( 'UNSET2' ) )
                    {
                    // InternalBDSL.g:947:2: ( ( 'UNSET2' ) )
                    // InternalBDSL.g:948:3: ( 'UNSET2' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryNestingOperatorAccess().getUNSET2EnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:949:3: ( 'UNSET2' )
                    // InternalBDSL.g:949:4: 'UNSET2'
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
                    // InternalBDSL.g:953:2: ( ( '-' ) )
                    {
                    // InternalBDSL.g:953:2: ( ( '-' ) )
                    // InternalBDSL.g:954:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryNestingOperatorAccess().getDOTEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:955:3: ( '-' )
                    // InternalBDSL.g:955:4: '-'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryNestingOperatorAccess().getDOTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBDSL.g:959:2: ( ( '*' ) )
                    {
                    // InternalBDSL.g:959:2: ( ( '*' ) )
                    // InternalBDSL.g:960:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryNestingOperatorAccess().getMULEnumLiteralDeclaration_2()); 
                    }
                    // InternalBDSL.g:961:3: ( '*' )
                    // InternalBDSL.g:961:4: '*'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryNestingOperatorAccess().getMULEnumLiteralDeclaration_2()); 
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
    // InternalBDSL.g:969:1: rule__ControlType__Alternatives : ( ( ( 'atomic' ) ) | ( ( 'active' ) ) | ( ( 'passive' ) ) );
    public final void rule__ControlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:973:1: ( ( ( 'atomic' ) ) | ( ( 'active' ) ) | ( ( 'passive' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
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
                    // InternalBDSL.g:974:2: ( ( 'atomic' ) )
                    {
                    // InternalBDSL.g:974:2: ( ( 'atomic' ) )
                    // InternalBDSL.g:975:3: ( 'atomic' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlTypeAccess().getATOMICEnumLiteralDeclaration_0()); 
                    }
                    // InternalBDSL.g:976:3: ( 'atomic' )
                    // InternalBDSL.g:976:4: 'atomic'
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
                    // InternalBDSL.g:980:2: ( ( 'active' ) )
                    {
                    // InternalBDSL.g:980:2: ( ( 'active' ) )
                    // InternalBDSL.g:981:3: ( 'active' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlTypeAccess().getACTIVEEnumLiteralDeclaration_1()); 
                    }
                    // InternalBDSL.g:982:3: ( 'active' )
                    // InternalBDSL.g:982:4: 'active'
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
                    // InternalBDSL.g:986:2: ( ( 'passive' ) )
                    {
                    // InternalBDSL.g:986:2: ( ( 'passive' ) )
                    // InternalBDSL.g:987:3: ( 'passive' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlTypeAccess().getPASSIVEEnumLiteralDeclaration_2()); 
                    }
                    // InternalBDSL.g:988:3: ( 'passive' )
                    // InternalBDSL.g:988:4: 'passive'
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


    // $ANTLR start "rule__BRSModel__Group__0"
    // InternalBDSL.g:996:1: rule__BRSModel__Group__0 : rule__BRSModel__Group__0__Impl rule__BRSModel__Group__1 ;
    public final void rule__BRSModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1000:1: ( rule__BRSModel__Group__0__Impl rule__BRSModel__Group__1 )
            // InternalBDSL.g:1001:2: rule__BRSModel__Group__0__Impl rule__BRSModel__Group__1
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
    // InternalBDSL.g:1008:1: rule__BRSModel__Group__0__Impl : ( ( rule__BRSModel__SignatureAssignment_0 )* ) ;
    public final void rule__BRSModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1012:1: ( ( ( rule__BRSModel__SignatureAssignment_0 )* ) )
            // InternalBDSL.g:1013:1: ( ( rule__BRSModel__SignatureAssignment_0 )* )
            {
            // InternalBDSL.g:1013:1: ( ( rule__BRSModel__SignatureAssignment_0 )* )
            // InternalBDSL.g:1014:2: ( rule__BRSModel__SignatureAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSModelAccess().getSignatureAssignment_0()); 
            }
            // InternalBDSL.g:1015:2: ( rule__BRSModel__SignatureAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBDSL.g:1015:3: rule__BRSModel__SignatureAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__BRSModel__SignatureAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalBDSL.g:1023:1: rule__BRSModel__Group__1 : rule__BRSModel__Group__1__Impl ;
    public final void rule__BRSModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1027:1: ( rule__BRSModel__Group__1__Impl )
            // InternalBDSL.g:1028:2: rule__BRSModel__Group__1__Impl
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
    // InternalBDSL.g:1034:1: rule__BRSModel__Group__1__Impl : ( ( rule__BRSModel__UnorderedGroup_1 ) ) ;
    public final void rule__BRSModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1038:1: ( ( ( rule__BRSModel__UnorderedGroup_1 ) ) )
            // InternalBDSL.g:1039:1: ( ( rule__BRSModel__UnorderedGroup_1 ) )
            {
            // InternalBDSL.g:1039:1: ( ( rule__BRSModel__UnorderedGroup_1 ) )
            // InternalBDSL.g:1040:2: ( rule__BRSModel__UnorderedGroup_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRSModelAccess().getUnorderedGroup_1()); 
            }
            // InternalBDSL.g:1041:2: ( rule__BRSModel__UnorderedGroup_1 )
            // InternalBDSL.g:1041:3: rule__BRSModel__UnorderedGroup_1
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
    // InternalBDSL.g:1050:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1054:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalBDSL.g:1055:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalBDSL.g:1062:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1066:1: ( ( RULE_ID ) )
            // InternalBDSL.g:1067:1: ( RULE_ID )
            {
            // InternalBDSL.g:1067:1: ( RULE_ID )
            // InternalBDSL.g:1068:2: RULE_ID
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
    // InternalBDSL.g:1077:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1081:1: ( rule__FQN__Group__1__Impl )
            // InternalBDSL.g:1082:2: rule__FQN__Group__1__Impl
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
    // InternalBDSL.g:1088:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1092:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalBDSL.g:1093:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalBDSL.g:1093:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalBDSL.g:1094:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalBDSL.g:1095:2: ( rule__FQN__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBDSL.g:1095:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalBDSL.g:1104:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1108:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalBDSL.g:1109:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalBDSL.g:1116:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1120:1: ( ( '.' ) )
            // InternalBDSL.g:1121:1: ( '.' )
            {
            // InternalBDSL.g:1121:1: ( '.' )
            // InternalBDSL.g:1122:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1131:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1135:1: ( rule__FQN__Group_1__1__Impl )
            // InternalBDSL.g:1136:2: rule__FQN__Group_1__1__Impl
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
    // InternalBDSL.g:1142:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1146:1: ( ( RULE_ID ) )
            // InternalBDSL.g:1147:1: ( RULE_ID )
            {
            // InternalBDSL.g:1147:1: ( RULE_ID )
            // InternalBDSL.g:1148:2: RULE_ID
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
    // InternalBDSL.g:1158:1: rule__FqnWithWildCard__Group__0 : rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 ;
    public final void rule__FqnWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1162:1: ( rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 )
            // InternalBDSL.g:1163:2: rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1
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
    // InternalBDSL.g:1170:1: rule__FqnWithWildCard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1174:1: ( ( ruleFQN ) )
            // InternalBDSL.g:1175:1: ( ruleFQN )
            {
            // InternalBDSL.g:1175:1: ( ruleFQN )
            // InternalBDSL.g:1176:2: ruleFQN
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
    // InternalBDSL.g:1185:1: rule__FqnWithWildCard__Group__1 : rule__FqnWithWildCard__Group__1__Impl ;
    public final void rule__FqnWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1189:1: ( rule__FqnWithWildCard__Group__1__Impl )
            // InternalBDSL.g:1190:2: rule__FqnWithWildCard__Group__1__Impl
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
    // InternalBDSL.g:1196:1: rule__FqnWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1200:1: ( ( ( '.*' )? ) )
            // InternalBDSL.g:1201:1: ( ( '.*' )? )
            {
            // InternalBDSL.g:1201:1: ( ( '.*' )? )
            // InternalBDSL.g:1202:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalBDSL.g:1203:2: ( '.*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBDSL.g:1203:3: '.*'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

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
    // InternalBDSL.g:1212:1: rule__BigraphVarReferenceID__Group__0 : rule__BigraphVarReferenceID__Group__0__Impl rule__BigraphVarReferenceID__Group__1 ;
    public final void rule__BigraphVarReferenceID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1216:1: ( rule__BigraphVarReferenceID__Group__0__Impl rule__BigraphVarReferenceID__Group__1 )
            // InternalBDSL.g:1217:2: rule__BigraphVarReferenceID__Group__0__Impl rule__BigraphVarReferenceID__Group__1
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
    // InternalBDSL.g:1224:1: rule__BigraphVarReferenceID__Group__0__Impl : ( '$' ) ;
    public final void rule__BigraphVarReferenceID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1228:1: ( ( '$' ) )
            // InternalBDSL.g:1229:1: ( '$' )
            {
            // InternalBDSL.g:1229:1: ( '$' )
            // InternalBDSL.g:1230:2: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceIDAccess().getDollarSignKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1239:1: rule__BigraphVarReferenceID__Group__1 : rule__BigraphVarReferenceID__Group__1__Impl ;
    public final void rule__BigraphVarReferenceID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1243:1: ( rule__BigraphVarReferenceID__Group__1__Impl )
            // InternalBDSL.g:1244:2: rule__BigraphVarReferenceID__Group__1__Impl
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
    // InternalBDSL.g:1250:1: rule__BigraphVarReferenceID__Group__1__Impl : ( ruleFQN ) ;
    public final void rule__BigraphVarReferenceID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1254:1: ( ( ruleFQN ) )
            // InternalBDSL.g:1255:1: ( ruleFQN )
            {
            // InternalBDSL.g:1255:1: ( ruleFQN )
            // InternalBDSL.g:1256:2: ruleFQN
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
    // InternalBDSL.g:1266:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1270:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBDSL.g:1271:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalBDSL.g:1278:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1282:1: ( ( ( '-' )? ) )
            // InternalBDSL.g:1283:1: ( ( '-' )? )
            {
            // InternalBDSL.g:1283:1: ( ( '-' )? )
            // InternalBDSL.g:1284:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalBDSL.g:1285:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBDSL.g:1285:3: '-'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

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
    // InternalBDSL.g:1293:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1297:1: ( rule__EInt__Group__1__Impl )
            // InternalBDSL.g:1298:2: rule__EInt__Group__1__Impl
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
    // InternalBDSL.g:1304:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1308:1: ( ( RULE_INT ) )
            // InternalBDSL.g:1309:1: ( RULE_INT )
            {
            // InternalBDSL.g:1309:1: ( RULE_INT )
            // InternalBDSL.g:1310:2: RULE_INT
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
    // InternalBDSL.g:1320:1: rule__MainElement__Group__0 : rule__MainElement__Group__0__Impl rule__MainElement__Group__1 ;
    public final void rule__MainElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1324:1: ( rule__MainElement__Group__0__Impl rule__MainElement__Group__1 )
            // InternalBDSL.g:1325:2: rule__MainElement__Group__0__Impl rule__MainElement__Group__1
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
    // InternalBDSL.g:1332:1: rule__MainElement__Group__0__Impl : ( 'main' ) ;
    public final void rule__MainElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1336:1: ( ( 'main' ) )
            // InternalBDSL.g:1337:1: ( 'main' )
            {
            // InternalBDSL.g:1337:1: ( 'main' )
            // InternalBDSL.g:1338:2: 'main'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getMainKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1347:1: rule__MainElement__Group__1 : rule__MainElement__Group__1__Impl rule__MainElement__Group__2 ;
    public final void rule__MainElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1351:1: ( rule__MainElement__Group__1__Impl rule__MainElement__Group__2 )
            // InternalBDSL.g:1352:2: rule__MainElement__Group__1__Impl rule__MainElement__Group__2
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
    // InternalBDSL.g:1359:1: rule__MainElement__Group__1__Impl : ( '=' ) ;
    public final void rule__MainElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1363:1: ( ( '=' ) )
            // InternalBDSL.g:1364:1: ( '=' )
            {
            // InternalBDSL.g:1364:1: ( '=' )
            // InternalBDSL.g:1365:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getEqualsSignKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1374:1: rule__MainElement__Group__2 : rule__MainElement__Group__2__Impl rule__MainElement__Group__3 ;
    public final void rule__MainElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1378:1: ( rule__MainElement__Group__2__Impl rule__MainElement__Group__3 )
            // InternalBDSL.g:1379:2: rule__MainElement__Group__2__Impl rule__MainElement__Group__3
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
    // InternalBDSL.g:1386:1: rule__MainElement__Group__2__Impl : ( '{' ) ;
    public final void rule__MainElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1390:1: ( ( '{' ) )
            // InternalBDSL.g:1391:1: ( '{' )
            {
            // InternalBDSL.g:1391:1: ( '{' )
            // InternalBDSL.g:1392:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1401:1: rule__MainElement__Group__3 : rule__MainElement__Group__3__Impl rule__MainElement__Group__4 ;
    public final void rule__MainElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1405:1: ( rule__MainElement__Group__3__Impl rule__MainElement__Group__4 )
            // InternalBDSL.g:1406:2: rule__MainElement__Group__3__Impl rule__MainElement__Group__4
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
    // InternalBDSL.g:1413:1: rule__MainElement__Group__3__Impl : ( () ) ;
    public final void rule__MainElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1417:1: ( ( () ) )
            // InternalBDSL.g:1418:1: ( () )
            {
            // InternalBDSL.g:1418:1: ( () )
            // InternalBDSL.g:1419:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getMainLiteralAction_3()); 
            }
            // InternalBDSL.g:1420:2: ()
            // InternalBDSL.g:1420:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainElementAccess().getMainLiteralAction_3()); 
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
    // InternalBDSL.g:1428:1: rule__MainElement__Group__4 : rule__MainElement__Group__4__Impl rule__MainElement__Group__5 ;
    public final void rule__MainElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1432:1: ( rule__MainElement__Group__4__Impl rule__MainElement__Group__5 )
            // InternalBDSL.g:1433:2: rule__MainElement__Group__4__Impl rule__MainElement__Group__5
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
    // InternalBDSL.g:1440:1: rule__MainElement__Group__4__Impl : ( ( rule__MainElement__ValueAssignment_4 )* ) ;
    public final void rule__MainElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1444:1: ( ( ( rule__MainElement__ValueAssignment_4 )* ) )
            // InternalBDSL.g:1445:1: ( ( rule__MainElement__ValueAssignment_4 )* )
            {
            // InternalBDSL.g:1445:1: ( ( rule__MainElement__ValueAssignment_4 )* )
            // InternalBDSL.g:1446:2: ( rule__MainElement__ValueAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getValueAssignment_4()); 
            }
            // InternalBDSL.g:1447:2: ( rule__MainElement__ValueAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22||LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBDSL.g:1447:3: rule__MainElement__ValueAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MainElement__ValueAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalBDSL.g:1455:1: rule__MainElement__Group__5 : rule__MainElement__Group__5__Impl rule__MainElement__Group__6 ;
    public final void rule__MainElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1459:1: ( rule__MainElement__Group__5__Impl rule__MainElement__Group__6 )
            // InternalBDSL.g:1460:2: rule__MainElement__Group__5__Impl rule__MainElement__Group__6
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
    // InternalBDSL.g:1467:1: rule__MainElement__Group__5__Impl : ( '}' ) ;
    public final void rule__MainElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1471:1: ( ( '}' ) )
            // InternalBDSL.g:1472:1: ( '}' )
            {
            // InternalBDSL.g:1472:1: ( '}' )
            // InternalBDSL.g:1473:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1482:1: rule__MainElement__Group__6 : rule__MainElement__Group__6__Impl ;
    public final void rule__MainElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1486:1: ( rule__MainElement__Group__6__Impl )
            // InternalBDSL.g:1487:2: rule__MainElement__Group__6__Impl
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
    // InternalBDSL.g:1493:1: rule__MainElement__Group__6__Impl : ( ';' ) ;
    public final void rule__MainElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1497:1: ( ( ';' ) )
            // InternalBDSL.g:1498:1: ( ';' )
            {
            // InternalBDSL.g:1498:1: ( ';' )
            // InternalBDSL.g:1499:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainElementAccess().getSemicolonKeyword_6()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1509:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1513:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalBDSL.g:1514:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
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
    // InternalBDSL.g:1521:1: rule__Signature__Group__0__Impl : ( () ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1525:1: ( ( () ) )
            // InternalBDSL.g:1526:1: ( () )
            {
            // InternalBDSL.g:1526:1: ( () )
            // InternalBDSL.g:1527:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSignatureAction_0()); 
            }
            // InternalBDSL.g:1528:2: ()
            // InternalBDSL.g:1528:3: 
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
    // InternalBDSL.g:1536:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1540:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalBDSL.g:1541:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
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
    // InternalBDSL.g:1548:1: rule__Signature__Group__1__Impl : ( 'signature' ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1552:1: ( ( 'signature' ) )
            // InternalBDSL.g:1553:1: ( 'signature' )
            {
            // InternalBDSL.g:1553:1: ( 'signature' )
            // InternalBDSL.g:1554:2: 'signature'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSignatureKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1563:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1567:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalBDSL.g:1568:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
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
    // InternalBDSL.g:1575:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__NameAssignment_2 ) ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1579:1: ( ( ( rule__Signature__NameAssignment_2 ) ) )
            // InternalBDSL.g:1580:1: ( ( rule__Signature__NameAssignment_2 ) )
            {
            // InternalBDSL.g:1580:1: ( ( rule__Signature__NameAssignment_2 ) )
            // InternalBDSL.g:1581:2: ( rule__Signature__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getNameAssignment_2()); 
            }
            // InternalBDSL.g:1582:2: ( rule__Signature__NameAssignment_2 )
            // InternalBDSL.g:1582:3: rule__Signature__NameAssignment_2
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
    // InternalBDSL.g:1590:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1594:1: ( rule__Signature__Group__3__Impl )
            // InternalBDSL.g:1595:2: rule__Signature__Group__3__Impl
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
    // InternalBDSL.g:1601:1: rule__Signature__Group__3__Impl : ( ( rule__Signature__Group_3__0 )? ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1605:1: ( ( ( rule__Signature__Group_3__0 )? ) )
            // InternalBDSL.g:1606:1: ( ( rule__Signature__Group_3__0 )? )
            {
            // InternalBDSL.g:1606:1: ( ( rule__Signature__Group_3__0 )? )
            // InternalBDSL.g:1607:2: ( rule__Signature__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_3()); 
            }
            // InternalBDSL.g:1608:2: ( rule__Signature__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBDSL.g:1608:3: rule__Signature__Group_3__0
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
    // InternalBDSL.g:1617:1: rule__Signature__Group_3__0 : rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 ;
    public final void rule__Signature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1621:1: ( rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 )
            // InternalBDSL.g:1622:2: rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1
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
    // InternalBDSL.g:1629:1: rule__Signature__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Signature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1633:1: ( ( '{' ) )
            // InternalBDSL.g:1634:1: ( '{' )
            {
            // InternalBDSL.g:1634:1: ( '{' )
            // InternalBDSL.g:1635:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_3_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1644:1: rule__Signature__Group_3__1 : rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 ;
    public final void rule__Signature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1648:1: ( rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 )
            // InternalBDSL.g:1649:2: rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2
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
    // InternalBDSL.g:1656:1: rule__Signature__Group_3__1__Impl : ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) ) ;
    public final void rule__Signature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1660:1: ( ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) ) )
            // InternalBDSL.g:1661:1: ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) )
            {
            // InternalBDSL.g:1661:1: ( ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* ) )
            // InternalBDSL.g:1662:2: ( ( rule__Signature__ControlsAssignment_3_1 ) ) ( ( rule__Signature__ControlsAssignment_3_1 )* )
            {
            // InternalBDSL.g:1662:2: ( ( rule__Signature__ControlsAssignment_3_1 ) )
            // InternalBDSL.g:1663:3: ( rule__Signature__ControlsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getControlsAssignment_3_1()); 
            }
            // InternalBDSL.g:1664:3: ( rule__Signature__ControlsAssignment_3_1 )
            // InternalBDSL.g:1664:4: rule__Signature__ControlsAssignment_3_1
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

            // InternalBDSL.g:1667:2: ( ( rule__Signature__ControlsAssignment_3_1 )* )
            // InternalBDSL.g:1668:3: ( rule__Signature__ControlsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getControlsAssignment_3_1()); 
            }
            // InternalBDSL.g:1669:3: ( rule__Signature__ControlsAssignment_3_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=17 && LA16_0<=19)||LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBDSL.g:1669:4: rule__Signature__ControlsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Signature__ControlsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalBDSL.g:1678:1: rule__Signature__Group_3__2 : rule__Signature__Group_3__2__Impl ;
    public final void rule__Signature__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1682:1: ( rule__Signature__Group_3__2__Impl )
            // InternalBDSL.g:1683:2: rule__Signature__Group_3__2__Impl
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
    // InternalBDSL.g:1689:1: rule__Signature__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Signature__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1693:1: ( ( '}' ) )
            // InternalBDSL.g:1694:1: ( '}' )
            {
            // InternalBDSL.g:1694:1: ( '}' )
            // InternalBDSL.g:1695:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_3_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1705:1: rule__ControlDef__Group__0 : rule__ControlDef__Group__0__Impl rule__ControlDef__Group__1 ;
    public final void rule__ControlDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1709:1: ( rule__ControlDef__Group__0__Impl rule__ControlDef__Group__1 )
            // InternalBDSL.g:1710:2: rule__ControlDef__Group__0__Impl rule__ControlDef__Group__1
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
    // InternalBDSL.g:1717:1: rule__ControlDef__Group__0__Impl : ( () ) ;
    public final void rule__ControlDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1721:1: ( ( () ) )
            // InternalBDSL.g:1722:1: ( () )
            {
            // InternalBDSL.g:1722:1: ( () )
            // InternalBDSL.g:1723:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getControlVariableAction_0()); 
            }
            // InternalBDSL.g:1724:2: ()
            // InternalBDSL.g:1724:3: 
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
    // InternalBDSL.g:1732:1: rule__ControlDef__Group__1 : rule__ControlDef__Group__1__Impl rule__ControlDef__Group__2 ;
    public final void rule__ControlDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1736:1: ( rule__ControlDef__Group__1__Impl rule__ControlDef__Group__2 )
            // InternalBDSL.g:1737:2: rule__ControlDef__Group__1__Impl rule__ControlDef__Group__2
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
    // InternalBDSL.g:1744:1: rule__ControlDef__Group__1__Impl : ( ( rule__ControlDef__TypeAssignment_1 )? ) ;
    public final void rule__ControlDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1748:1: ( ( ( rule__ControlDef__TypeAssignment_1 )? ) )
            // InternalBDSL.g:1749:1: ( ( rule__ControlDef__TypeAssignment_1 )? )
            {
            // InternalBDSL.g:1749:1: ( ( rule__ControlDef__TypeAssignment_1 )? )
            // InternalBDSL.g:1750:2: ( rule__ControlDef__TypeAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getTypeAssignment_1()); 
            }
            // InternalBDSL.g:1751:2: ( rule__ControlDef__TypeAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=17 && LA17_0<=19)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBDSL.g:1751:3: rule__ControlDef__TypeAssignment_1
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
    // InternalBDSL.g:1759:1: rule__ControlDef__Group__2 : rule__ControlDef__Group__2__Impl rule__ControlDef__Group__3 ;
    public final void rule__ControlDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1763:1: ( rule__ControlDef__Group__2__Impl rule__ControlDef__Group__3 )
            // InternalBDSL.g:1764:2: rule__ControlDef__Group__2__Impl rule__ControlDef__Group__3
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
    // InternalBDSL.g:1771:1: rule__ControlDef__Group__2__Impl : ( 'ctrl' ) ;
    public final void rule__ControlDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1775:1: ( ( 'ctrl' ) )
            // InternalBDSL.g:1776:1: ( 'ctrl' )
            {
            // InternalBDSL.g:1776:1: ( 'ctrl' )
            // InternalBDSL.g:1777:2: 'ctrl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getCtrlKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1786:1: rule__ControlDef__Group__3 : rule__ControlDef__Group__3__Impl rule__ControlDef__Group__4 ;
    public final void rule__ControlDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1790:1: ( rule__ControlDef__Group__3__Impl rule__ControlDef__Group__4 )
            // InternalBDSL.g:1791:2: rule__ControlDef__Group__3__Impl rule__ControlDef__Group__4
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
    // InternalBDSL.g:1798:1: rule__ControlDef__Group__3__Impl : ( ( rule__ControlDef__NameAssignment_3 ) ) ;
    public final void rule__ControlDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1802:1: ( ( ( rule__ControlDef__NameAssignment_3 ) ) )
            // InternalBDSL.g:1803:1: ( ( rule__ControlDef__NameAssignment_3 ) )
            {
            // InternalBDSL.g:1803:1: ( ( rule__ControlDef__NameAssignment_3 ) )
            // InternalBDSL.g:1804:2: ( rule__ControlDef__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getNameAssignment_3()); 
            }
            // InternalBDSL.g:1805:2: ( rule__ControlDef__NameAssignment_3 )
            // InternalBDSL.g:1805:3: rule__ControlDef__NameAssignment_3
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
    // InternalBDSL.g:1813:1: rule__ControlDef__Group__4 : rule__ControlDef__Group__4__Impl rule__ControlDef__Group__5 ;
    public final void rule__ControlDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1817:1: ( rule__ControlDef__Group__4__Impl rule__ControlDef__Group__5 )
            // InternalBDSL.g:1818:2: rule__ControlDef__Group__4__Impl rule__ControlDef__Group__5
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
    // InternalBDSL.g:1825:1: rule__ControlDef__Group__4__Impl : ( 'arity' ) ;
    public final void rule__ControlDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1829:1: ( ( 'arity' ) )
            // InternalBDSL.g:1830:1: ( 'arity' )
            {
            // InternalBDSL.g:1830:1: ( 'arity' )
            // InternalBDSL.g:1831:2: 'arity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getArityKeyword_4()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1840:1: rule__ControlDef__Group__5 : rule__ControlDef__Group__5__Impl rule__ControlDef__Group__6 ;
    public final void rule__ControlDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1844:1: ( rule__ControlDef__Group__5__Impl rule__ControlDef__Group__6 )
            // InternalBDSL.g:1845:2: rule__ControlDef__Group__5__Impl rule__ControlDef__Group__6
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
    // InternalBDSL.g:1852:1: rule__ControlDef__Group__5__Impl : ( ( rule__ControlDef__ArityAssignment_5 ) ) ;
    public final void rule__ControlDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1856:1: ( ( ( rule__ControlDef__ArityAssignment_5 ) ) )
            // InternalBDSL.g:1857:1: ( ( rule__ControlDef__ArityAssignment_5 ) )
            {
            // InternalBDSL.g:1857:1: ( ( rule__ControlDef__ArityAssignment_5 ) )
            // InternalBDSL.g:1858:2: ( rule__ControlDef__ArityAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getArityAssignment_5()); 
            }
            // InternalBDSL.g:1859:2: ( rule__ControlDef__ArityAssignment_5 )
            // InternalBDSL.g:1859:3: rule__ControlDef__ArityAssignment_5
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
    // InternalBDSL.g:1867:1: rule__ControlDef__Group__6 : rule__ControlDef__Group__6__Impl ;
    public final void rule__ControlDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1871:1: ( rule__ControlDef__Group__6__Impl )
            // InternalBDSL.g:1872:2: rule__ControlDef__Group__6__Impl
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
    // InternalBDSL.g:1878:1: rule__ControlDef__Group__6__Impl : ( ';' ) ;
    public final void rule__ControlDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1882:1: ( ( ';' ) )
            // InternalBDSL.g:1883:1: ( ';' )
            {
            // InternalBDSL.g:1883:1: ( ';' )
            // InternalBDSL.g:1884:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlDefAccess().getSemicolonKeyword_6()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:1894:1: rule__LinkNames__Group_1__0 : rule__LinkNames__Group_1__0__Impl rule__LinkNames__Group_1__1 ;
    public final void rule__LinkNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1898:1: ( rule__LinkNames__Group_1__0__Impl rule__LinkNames__Group_1__1 )
            // InternalBDSL.g:1899:2: rule__LinkNames__Group_1__0__Impl rule__LinkNames__Group_1__1
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
    // InternalBDSL.g:1906:1: rule__LinkNames__Group_1__0__Impl : ( ruleNameConstant ) ;
    public final void rule__LinkNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1910:1: ( ( ruleNameConstant ) )
            // InternalBDSL.g:1911:1: ( ruleNameConstant )
            {
            // InternalBDSL.g:1911:1: ( ruleNameConstant )
            // InternalBDSL.g:1912:2: ruleNameConstant
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
    // InternalBDSL.g:1921:1: rule__LinkNames__Group_1__1 : rule__LinkNames__Group_1__1__Impl ;
    public final void rule__LinkNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1925:1: ( rule__LinkNames__Group_1__1__Impl )
            // InternalBDSL.g:1926:2: rule__LinkNames__Group_1__1__Impl
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
    // InternalBDSL.g:1932:1: rule__LinkNames__Group_1__1__Impl : ( ',' ) ;
    public final void rule__LinkNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1936:1: ( ( ',' ) )
            // InternalBDSL.g:1937:1: ( ',' )
            {
            // InternalBDSL.g:1937:1: ( ',' )
            // InternalBDSL.g:1938:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkNamesAccess().getCommaKeyword_1_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__LVD2__Group__0"
    // InternalBDSL.g:1948:1: rule__LVD2__Group__0 : rule__LVD2__Group__0__Impl rule__LVD2__Group__1 ;
    public final void rule__LVD2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1952:1: ( rule__LVD2__Group__0__Impl rule__LVD2__Group__1 )
            // InternalBDSL.g:1953:2: rule__LVD2__Group__0__Impl rule__LVD2__Group__1
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
    // InternalBDSL.g:1960:1: rule__LVD2__Group__0__Impl : ( () ) ;
    public final void rule__LVD2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1964:1: ( ( () ) )
            // InternalBDSL.g:1965:1: ( () )
            {
            // InternalBDSL.g:1965:1: ( () )
            // InternalBDSL.g:1966:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getLocalVarDeclAction_0()); 
            }
            // InternalBDSL.g:1967:2: ()
            // InternalBDSL.g:1967:3: 
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
    // InternalBDSL.g:1975:1: rule__LVD2__Group__1 : rule__LVD2__Group__1__Impl rule__LVD2__Group__2 ;
    public final void rule__LVD2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1979:1: ( rule__LVD2__Group__1__Impl rule__LVD2__Group__2 )
            // InternalBDSL.g:1980:2: rule__LVD2__Group__1__Impl rule__LVD2__Group__2
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
    // InternalBDSL.g:1987:1: rule__LVD2__Group__1__Impl : ( 'val' ) ;
    public final void rule__LVD2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:1991:1: ( ( 'val' ) )
            // InternalBDSL.g:1992:1: ( 'val' )
            {
            // InternalBDSL.g:1992:1: ( 'val' )
            // InternalBDSL.g:1993:2: 'val'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getValKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2002:1: rule__LVD2__Group__2 : rule__LVD2__Group__2__Impl rule__LVD2__Group__3 ;
    public final void rule__LVD2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2006:1: ( rule__LVD2__Group__2__Impl rule__LVD2__Group__3 )
            // InternalBDSL.g:2007:2: rule__LVD2__Group__2__Impl rule__LVD2__Group__3
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
    // InternalBDSL.g:2014:1: rule__LVD2__Group__2__Impl : ( ( rule__LVD2__NameAssignment_2 ) ) ;
    public final void rule__LVD2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2018:1: ( ( ( rule__LVD2__NameAssignment_2 ) ) )
            // InternalBDSL.g:2019:1: ( ( rule__LVD2__NameAssignment_2 ) )
            {
            // InternalBDSL.g:2019:1: ( ( rule__LVD2__NameAssignment_2 ) )
            // InternalBDSL.g:2020:2: ( rule__LVD2__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getNameAssignment_2()); 
            }
            // InternalBDSL.g:2021:2: ( rule__LVD2__NameAssignment_2 )
            // InternalBDSL.g:2021:3: rule__LVD2__NameAssignment_2
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
    // InternalBDSL.g:2029:1: rule__LVD2__Group__3 : rule__LVD2__Group__3__Impl rule__LVD2__Group__4 ;
    public final void rule__LVD2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2033:1: ( rule__LVD2__Group__3__Impl rule__LVD2__Group__4 )
            // InternalBDSL.g:2034:2: rule__LVD2__Group__3__Impl rule__LVD2__Group__4
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
    // InternalBDSL.g:2041:1: rule__LVD2__Group__3__Impl : ( ':' ) ;
    public final void rule__LVD2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2045:1: ( ( ':' ) )
            // InternalBDSL.g:2046:1: ( ':' )
            {
            // InternalBDSL.g:2046:1: ( ':' )
            // InternalBDSL.g:2047:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getColonKeyword_3()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2056:1: rule__LVD2__Group__4 : rule__LVD2__Group__4__Impl rule__LVD2__Group__5 ;
    public final void rule__LVD2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2060:1: ( rule__LVD2__Group__4__Impl rule__LVD2__Group__5 )
            // InternalBDSL.g:2061:2: rule__LVD2__Group__4__Impl rule__LVD2__Group__5
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
    // InternalBDSL.g:2068:1: rule__LVD2__Group__4__Impl : ( ( rule__LVD2__TypeAssignment_4 ) ) ;
    public final void rule__LVD2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2072:1: ( ( ( rule__LVD2__TypeAssignment_4 ) ) )
            // InternalBDSL.g:2073:1: ( ( rule__LVD2__TypeAssignment_4 ) )
            {
            // InternalBDSL.g:2073:1: ( ( rule__LVD2__TypeAssignment_4 ) )
            // InternalBDSL.g:2074:2: ( rule__LVD2__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getTypeAssignment_4()); 
            }
            // InternalBDSL.g:2075:2: ( rule__LVD2__TypeAssignment_4 )
            // InternalBDSL.g:2075:3: rule__LVD2__TypeAssignment_4
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
    // InternalBDSL.g:2083:1: rule__LVD2__Group__5 : rule__LVD2__Group__5__Impl rule__LVD2__Group__6 ;
    public final void rule__LVD2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2087:1: ( rule__LVD2__Group__5__Impl rule__LVD2__Group__6 )
            // InternalBDSL.g:2088:2: rule__LVD2__Group__5__Impl rule__LVD2__Group__6
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
    // InternalBDSL.g:2095:1: rule__LVD2__Group__5__Impl : ( '=' ) ;
    public final void rule__LVD2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2099:1: ( ( '=' ) )
            // InternalBDSL.g:2100:1: ( '=' )
            {
            // InternalBDSL.g:2100:1: ( '=' )
            // InternalBDSL.g:2101:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getEqualsSignKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2110:1: rule__LVD2__Group__6 : rule__LVD2__Group__6__Impl rule__LVD2__Group__7 ;
    public final void rule__LVD2__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2114:1: ( rule__LVD2__Group__6__Impl rule__LVD2__Group__7 )
            // InternalBDSL.g:2115:2: rule__LVD2__Group__6__Impl rule__LVD2__Group__7
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
    // InternalBDSL.g:2122:1: rule__LVD2__Group__6__Impl : ( '{' ) ;
    public final void rule__LVD2__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2126:1: ( ( '{' ) )
            // InternalBDSL.g:2127:1: ( '{' )
            {
            // InternalBDSL.g:2127:1: ( '{' )
            // InternalBDSL.g:2128:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2137:1: rule__LVD2__Group__7 : rule__LVD2__Group__7__Impl rule__LVD2__Group__8 ;
    public final void rule__LVD2__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2141:1: ( rule__LVD2__Group__7__Impl rule__LVD2__Group__8 )
            // InternalBDSL.g:2142:2: rule__LVD2__Group__7__Impl rule__LVD2__Group__8
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
    // InternalBDSL.g:2149:1: rule__LVD2__Group__7__Impl : ( ( rule__LVD2__DefinitionAssignment_7 )* ) ;
    public final void rule__LVD2__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2153:1: ( ( ( rule__LVD2__DefinitionAssignment_7 )* ) )
            // InternalBDSL.g:2154:1: ( ( rule__LVD2__DefinitionAssignment_7 )* )
            {
            // InternalBDSL.g:2154:1: ( ( rule__LVD2__DefinitionAssignment_7 )* )
            // InternalBDSL.g:2155:2: ( rule__LVD2__DefinitionAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getDefinitionAssignment_7()); 
            }
            // InternalBDSL.g:2156:2: ( rule__LVD2__DefinitionAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==22||LA18_0==32||LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBDSL.g:2156:3: rule__LVD2__DefinitionAssignment_7
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__LVD2__DefinitionAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalBDSL.g:2164:1: rule__LVD2__Group__8 : rule__LVD2__Group__8__Impl ;
    public final void rule__LVD2__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2168:1: ( rule__LVD2__Group__8__Impl )
            // InternalBDSL.g:2169:2: rule__LVD2__Group__8__Impl
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
    // InternalBDSL.g:2175:1: rule__LVD2__Group__8__Impl : ( '}' ) ;
    public final void rule__LVD2__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2179:1: ( ( '}' ) )
            // InternalBDSL.g:2180:1: ( '}' )
            {
            // InternalBDSL.g:2180:1: ( '}' )
            // InternalBDSL.g:2181:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getRightCurlyBracketKeyword_8()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2191:1: rule__LocalVarDecl__Group__0 : rule__LocalVarDecl__Group__0__Impl rule__LocalVarDecl__Group__1 ;
    public final void rule__LocalVarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2195:1: ( rule__LocalVarDecl__Group__0__Impl rule__LocalVarDecl__Group__1 )
            // InternalBDSL.g:2196:2: rule__LocalVarDecl__Group__0__Impl rule__LocalVarDecl__Group__1
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
    // InternalBDSL.g:2203:1: rule__LocalVarDecl__Group__0__Impl : ( 'val' ) ;
    public final void rule__LocalVarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2207:1: ( ( 'val' ) )
            // InternalBDSL.g:2208:1: ( 'val' )
            {
            // InternalBDSL.g:2208:1: ( 'val' )
            // InternalBDSL.g:2209:2: 'val'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getValKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2218:1: rule__LocalVarDecl__Group__1 : rule__LocalVarDecl__Group__1__Impl rule__LocalVarDecl__Group__2 ;
    public final void rule__LocalVarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2222:1: ( rule__LocalVarDecl__Group__1__Impl rule__LocalVarDecl__Group__2 )
            // InternalBDSL.g:2223:2: rule__LocalVarDecl__Group__1__Impl rule__LocalVarDecl__Group__2
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
    // InternalBDSL.g:2230:1: rule__LocalVarDecl__Group__1__Impl : ( () ) ;
    public final void rule__LocalVarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2234:1: ( ( () ) )
            // InternalBDSL.g:2235:1: ( () )
            {
            // InternalBDSL.g:2235:1: ( () )
            // InternalBDSL.g:2236:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getLocalVarDeclAction_1()); 
            }
            // InternalBDSL.g:2237:2: ()
            // InternalBDSL.g:2237:3: 
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
    // InternalBDSL.g:2245:1: rule__LocalVarDecl__Group__2 : rule__LocalVarDecl__Group__2__Impl ;
    public final void rule__LocalVarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2249:1: ( rule__LocalVarDecl__Group__2__Impl )
            // InternalBDSL.g:2250:2: rule__LocalVarDecl__Group__2__Impl
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
    // InternalBDSL.g:2256:1: rule__LocalVarDecl__Group__2__Impl : ( ( rule__LocalVarDecl__Group_2__0 ) ) ;
    public final void rule__LocalVarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2260:1: ( ( ( rule__LocalVarDecl__Group_2__0 ) ) )
            // InternalBDSL.g:2261:1: ( ( rule__LocalVarDecl__Group_2__0 ) )
            {
            // InternalBDSL.g:2261:1: ( ( rule__LocalVarDecl__Group_2__0 ) )
            // InternalBDSL.g:2262:2: ( rule__LocalVarDecl__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2()); 
            }
            // InternalBDSL.g:2263:2: ( rule__LocalVarDecl__Group_2__0 )
            // InternalBDSL.g:2263:3: rule__LocalVarDecl__Group_2__0
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
    // InternalBDSL.g:2272:1: rule__LocalVarDecl__Group_2__0 : rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1 ;
    public final void rule__LocalVarDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2276:1: ( rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1 )
            // InternalBDSL.g:2277:2: rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1
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
    // InternalBDSL.g:2284:1: rule__LocalVarDecl__Group_2__0__Impl : ( ( rule__LocalVarDecl__NameAssignment_2_0 ) ) ;
    public final void rule__LocalVarDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2288:1: ( ( ( rule__LocalVarDecl__NameAssignment_2_0 ) ) )
            // InternalBDSL.g:2289:1: ( ( rule__LocalVarDecl__NameAssignment_2_0 ) )
            {
            // InternalBDSL.g:2289:1: ( ( rule__LocalVarDecl__NameAssignment_2_0 ) )
            // InternalBDSL.g:2290:2: ( rule__LocalVarDecl__NameAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getNameAssignment_2_0()); 
            }
            // InternalBDSL.g:2291:2: ( rule__LocalVarDecl__NameAssignment_2_0 )
            // InternalBDSL.g:2291:3: rule__LocalVarDecl__NameAssignment_2_0
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
    // InternalBDSL.g:2299:1: rule__LocalVarDecl__Group_2__1 : rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2 ;
    public final void rule__LocalVarDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2303:1: ( rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2 )
            // InternalBDSL.g:2304:2: rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2
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
    // InternalBDSL.g:2311:1: rule__LocalVarDecl__Group_2__1__Impl : ( ( rule__LocalVarDecl__Group_2_1__0 )? ) ;
    public final void rule__LocalVarDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2315:1: ( ( ( rule__LocalVarDecl__Group_2_1__0 )? ) )
            // InternalBDSL.g:2316:1: ( ( rule__LocalVarDecl__Group_2_1__0 )? )
            {
            // InternalBDSL.g:2316:1: ( ( rule__LocalVarDecl__Group_2_1__0 )? )
            // InternalBDSL.g:2317:2: ( rule__LocalVarDecl__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_1()); 
            }
            // InternalBDSL.g:2318:2: ( rule__LocalVarDecl__Group_2_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBDSL.g:2318:3: rule__LocalVarDecl__Group_2_1__0
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
    // InternalBDSL.g:2326:1: rule__LocalVarDecl__Group_2__2 : rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3 ;
    public final void rule__LocalVarDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2330:1: ( rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3 )
            // InternalBDSL.g:2331:2: rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3
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
    // InternalBDSL.g:2338:1: rule__LocalVarDecl__Group_2__2__Impl : ( ( rule__LocalVarDecl__Group_2_2__0 )? ) ;
    public final void rule__LocalVarDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2342:1: ( ( ( rule__LocalVarDecl__Group_2_2__0 )? ) )
            // InternalBDSL.g:2343:1: ( ( rule__LocalVarDecl__Group_2_2__0 )? )
            {
            // InternalBDSL.g:2343:1: ( ( rule__LocalVarDecl__Group_2_2__0 )? )
            // InternalBDSL.g:2344:2: ( rule__LocalVarDecl__Group_2_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_2()); 
            }
            // InternalBDSL.g:2345:2: ( rule__LocalVarDecl__Group_2_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33||LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBDSL.g:2345:3: rule__LocalVarDecl__Group_2_2__0
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
    // InternalBDSL.g:2353:1: rule__LocalVarDecl__Group_2__3 : rule__LocalVarDecl__Group_2__3__Impl ;
    public final void rule__LocalVarDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2357:1: ( rule__LocalVarDecl__Group_2__3__Impl )
            // InternalBDSL.g:2358:2: rule__LocalVarDecl__Group_2__3__Impl
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
    // InternalBDSL.g:2364:1: rule__LocalVarDecl__Group_2__3__Impl : ( ( rule__LocalVarDecl__Group_2_3__0 ) ) ;
    public final void rule__LocalVarDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2368:1: ( ( ( rule__LocalVarDecl__Group_2_3__0 ) ) )
            // InternalBDSL.g:2369:1: ( ( rule__LocalVarDecl__Group_2_3__0 ) )
            {
            // InternalBDSL.g:2369:1: ( ( rule__LocalVarDecl__Group_2_3__0 ) )
            // InternalBDSL.g:2370:2: ( rule__LocalVarDecl__Group_2_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_3()); 
            }
            // InternalBDSL.g:2371:2: ( rule__LocalVarDecl__Group_2_3__0 )
            // InternalBDSL.g:2371:3: rule__LocalVarDecl__Group_2_3__0
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
    // InternalBDSL.g:2380:1: rule__LocalVarDecl__Group_2_1__0 : rule__LocalVarDecl__Group_2_1__0__Impl rule__LocalVarDecl__Group_2_1__1 ;
    public final void rule__LocalVarDecl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2384:1: ( rule__LocalVarDecl__Group_2_1__0__Impl rule__LocalVarDecl__Group_2_1__1 )
            // InternalBDSL.g:2385:2: rule__LocalVarDecl__Group_2_1__0__Impl rule__LocalVarDecl__Group_2_1__1
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
    // InternalBDSL.g:2392:1: rule__LocalVarDecl__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__LocalVarDecl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2396:1: ( ( '(' ) )
            // InternalBDSL.g:2397:1: ( '(' )
            {
            // InternalBDSL.g:2397:1: ( '(' )
            // InternalBDSL.g:2398:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getLeftParenthesisKeyword_2_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2407:1: rule__LocalVarDecl__Group_2_1__1 : rule__LocalVarDecl__Group_2_1__1__Impl rule__LocalVarDecl__Group_2_1__2 ;
    public final void rule__LocalVarDecl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2411:1: ( rule__LocalVarDecl__Group_2_1__1__Impl rule__LocalVarDecl__Group_2_1__2 )
            // InternalBDSL.g:2412:2: rule__LocalVarDecl__Group_2_1__1__Impl rule__LocalVarDecl__Group_2_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalBDSL.g:2419:1: rule__LocalVarDecl__Group_2_1__1__Impl : ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) ) ;
    public final void rule__LocalVarDecl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2423:1: ( ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) ) )
            // InternalBDSL.g:2424:1: ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) )
            {
            // InternalBDSL.g:2424:1: ( ( rule__LocalVarDecl__SigAssignment_2_1_1 ) )
            // InternalBDSL.g:2425:2: ( rule__LocalVarDecl__SigAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSigAssignment_2_1_1()); 
            }
            // InternalBDSL.g:2426:2: ( rule__LocalVarDecl__SigAssignment_2_1_1 )
            // InternalBDSL.g:2426:3: rule__LocalVarDecl__SigAssignment_2_1_1
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
    // InternalBDSL.g:2434:1: rule__LocalVarDecl__Group_2_1__2 : rule__LocalVarDecl__Group_2_1__2__Impl ;
    public final void rule__LocalVarDecl__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2438:1: ( rule__LocalVarDecl__Group_2_1__2__Impl )
            // InternalBDSL.g:2439:2: rule__LocalVarDecl__Group_2_1__2__Impl
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
    // InternalBDSL.g:2445:1: rule__LocalVarDecl__Group_2_1__2__Impl : ( ')' ) ;
    public final void rule__LocalVarDecl__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2449:1: ( ( ')' ) )
            // InternalBDSL.g:2450:1: ( ')' )
            {
            // InternalBDSL.g:2450:1: ( ')' )
            // InternalBDSL.g:2451:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getRightParenthesisKeyword_2_1_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2461:1: rule__LocalVarDecl__Group_2_2__0 : rule__LocalVarDecl__Group_2_2__0__Impl rule__LocalVarDecl__Group_2_2__1 ;
    public final void rule__LocalVarDecl__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2465:1: ( rule__LocalVarDecl__Group_2_2__0__Impl rule__LocalVarDecl__Group_2_2__1 )
            // InternalBDSL.g:2466:2: rule__LocalVarDecl__Group_2_2__0__Impl rule__LocalVarDecl__Group_2_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalBDSL.g:2473:1: rule__LocalVarDecl__Group_2_2__0__Impl : ( ( rule__LocalVarDecl__Group_2_2_0__0 )? ) ;
    public final void rule__LocalVarDecl__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2477:1: ( ( ( rule__LocalVarDecl__Group_2_2_0__0 )? ) )
            // InternalBDSL.g:2478:1: ( ( rule__LocalVarDecl__Group_2_2_0__0 )? )
            {
            // InternalBDSL.g:2478:1: ( ( rule__LocalVarDecl__Group_2_2_0__0 )? )
            // InternalBDSL.g:2479:2: ( rule__LocalVarDecl__Group_2_2_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_2_0()); 
            }
            // InternalBDSL.g:2480:2: ( rule__LocalVarDecl__Group_2_2_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBDSL.g:2480:3: rule__LocalVarDecl__Group_2_2_0__0
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
    // InternalBDSL.g:2488:1: rule__LocalVarDecl__Group_2_2__1 : rule__LocalVarDecl__Group_2_2__1__Impl rule__LocalVarDecl__Group_2_2__2 ;
    public final void rule__LocalVarDecl__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2492:1: ( rule__LocalVarDecl__Group_2_2__1__Impl rule__LocalVarDecl__Group_2_2__2 )
            // InternalBDSL.g:2493:2: rule__LocalVarDecl__Group_2_2__1__Impl rule__LocalVarDecl__Group_2_2__2
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
    // InternalBDSL.g:2500:1: rule__LocalVarDecl__Group_2_2__1__Impl : ( ':' ) ;
    public final void rule__LocalVarDecl__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2504:1: ( ( ':' ) )
            // InternalBDSL.g:2505:1: ( ':' )
            {
            // InternalBDSL.g:2505:1: ( ':' )
            // InternalBDSL.g:2506:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getColonKeyword_2_2_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2515:1: rule__LocalVarDecl__Group_2_2__2 : rule__LocalVarDecl__Group_2_2__2__Impl ;
    public final void rule__LocalVarDecl__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2519:1: ( rule__LocalVarDecl__Group_2_2__2__Impl )
            // InternalBDSL.g:2520:2: rule__LocalVarDecl__Group_2_2__2__Impl
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
    // InternalBDSL.g:2526:1: rule__LocalVarDecl__Group_2_2__2__Impl : ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) ) ;
    public final void rule__LocalVarDecl__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2530:1: ( ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) ) )
            // InternalBDSL.g:2531:1: ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) )
            {
            // InternalBDSL.g:2531:1: ( ( rule__LocalVarDecl__TypeAssignment_2_2_2 ) )
            // InternalBDSL.g:2532:2: ( rule__LocalVarDecl__TypeAssignment_2_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getTypeAssignment_2_2_2()); 
            }
            // InternalBDSL.g:2533:2: ( rule__LocalVarDecl__TypeAssignment_2_2_2 )
            // InternalBDSL.g:2533:3: rule__LocalVarDecl__TypeAssignment_2_2_2
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
    // InternalBDSL.g:2542:1: rule__LocalVarDecl__Group_2_2_0__0 : rule__LocalVarDecl__Group_2_2_0__0__Impl rule__LocalVarDecl__Group_2_2_0__1 ;
    public final void rule__LocalVarDecl__Group_2_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2546:1: ( rule__LocalVarDecl__Group_2_2_0__0__Impl rule__LocalVarDecl__Group_2_2_0__1 )
            // InternalBDSL.g:2547:2: rule__LocalVarDecl__Group_2_2_0__0__Impl rule__LocalVarDecl__Group_2_2_0__1
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
    // InternalBDSL.g:2554:1: rule__LocalVarDecl__Group_2_2_0__0__Impl : ( '[' ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2558:1: ( ( '[' ) )
            // InternalBDSL.g:2559:1: ( '[' )
            {
            // InternalBDSL.g:2559:1: ( '[' )
            // InternalBDSL.g:2560:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getLeftSquareBracketKeyword_2_2_0_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2569:1: rule__LocalVarDecl__Group_2_2_0__1 : rule__LocalVarDecl__Group_2_2_0__1__Impl rule__LocalVarDecl__Group_2_2_0__2 ;
    public final void rule__LocalVarDecl__Group_2_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2573:1: ( rule__LocalVarDecl__Group_2_2_0__1__Impl rule__LocalVarDecl__Group_2_2_0__2 )
            // InternalBDSL.g:2574:2: rule__LocalVarDecl__Group_2_2_0__1__Impl rule__LocalVarDecl__Group_2_2_0__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalBDSL.g:2581:1: rule__LocalVarDecl__Group_2_2_0__1__Impl : ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2585:1: ( ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) ) )
            // InternalBDSL.g:2586:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) )
            {
            // InternalBDSL.g:2586:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 ) )
            // InternalBDSL.g:2587:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSiteArgsAssignment_2_2_0_1()); 
            }
            // InternalBDSL.g:2588:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 )
            // InternalBDSL.g:2588:3: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1
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
    // InternalBDSL.g:2596:1: rule__LocalVarDecl__Group_2_2_0__2 : rule__LocalVarDecl__Group_2_2_0__2__Impl rule__LocalVarDecl__Group_2_2_0__3 ;
    public final void rule__LocalVarDecl__Group_2_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2600:1: ( rule__LocalVarDecl__Group_2_2_0__2__Impl rule__LocalVarDecl__Group_2_2_0__3 )
            // InternalBDSL.g:2601:2: rule__LocalVarDecl__Group_2_2_0__2__Impl rule__LocalVarDecl__Group_2_2_0__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalBDSL.g:2608:1: rule__LocalVarDecl__Group_2_2_0__2__Impl : ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2612:1: ( ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* ) )
            // InternalBDSL.g:2613:1: ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* )
            {
            // InternalBDSL.g:2613:1: ( ( rule__LocalVarDecl__Group_2_2_0_2__0 )* )
            // InternalBDSL.g:2614:2: ( rule__LocalVarDecl__Group_2_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getGroup_2_2_0_2()); 
            }
            // InternalBDSL.g:2615:2: ( rule__LocalVarDecl__Group_2_2_0_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBDSL.g:2615:3: rule__LocalVarDecl__Group_2_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__LocalVarDecl__Group_2_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalBDSL.g:2623:1: rule__LocalVarDecl__Group_2_2_0__3 : rule__LocalVarDecl__Group_2_2_0__3__Impl ;
    public final void rule__LocalVarDecl__Group_2_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2627:1: ( rule__LocalVarDecl__Group_2_2_0__3__Impl )
            // InternalBDSL.g:2628:2: rule__LocalVarDecl__Group_2_2_0__3__Impl
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
    // InternalBDSL.g:2634:1: rule__LocalVarDecl__Group_2_2_0__3__Impl : ( ']' ) ;
    public final void rule__LocalVarDecl__Group_2_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2638:1: ( ( ']' ) )
            // InternalBDSL.g:2639:1: ( ']' )
            {
            // InternalBDSL.g:2639:1: ( ']' )
            // InternalBDSL.g:2640:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getRightSquareBracketKeyword_2_2_0_3()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2650:1: rule__LocalVarDecl__Group_2_2_0_2__0 : rule__LocalVarDecl__Group_2_2_0_2__0__Impl rule__LocalVarDecl__Group_2_2_0_2__1 ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2654:1: ( rule__LocalVarDecl__Group_2_2_0_2__0__Impl rule__LocalVarDecl__Group_2_2_0_2__1 )
            // InternalBDSL.g:2655:2: rule__LocalVarDecl__Group_2_2_0_2__0__Impl rule__LocalVarDecl__Group_2_2_0_2__1
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
    // InternalBDSL.g:2662:1: rule__LocalVarDecl__Group_2_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2666:1: ( ( ',' ) )
            // InternalBDSL.g:2667:1: ( ',' )
            {
            // InternalBDSL.g:2667:1: ( ',' )
            // InternalBDSL.g:2668:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getCommaKeyword_2_2_0_2_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2677:1: rule__LocalVarDecl__Group_2_2_0_2__1 : rule__LocalVarDecl__Group_2_2_0_2__1__Impl ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2681:1: ( rule__LocalVarDecl__Group_2_2_0_2__1__Impl )
            // InternalBDSL.g:2682:2: rule__LocalVarDecl__Group_2_2_0_2__1__Impl
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
    // InternalBDSL.g:2688:1: rule__LocalVarDecl__Group_2_2_0_2__1__Impl : ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) ) ;
    public final void rule__LocalVarDecl__Group_2_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2692:1: ( ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) ) )
            // InternalBDSL.g:2693:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) )
            {
            // InternalBDSL.g:2693:1: ( ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 ) )
            // InternalBDSL.g:2694:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSiteArgsAssignment_2_2_0_2_1()); 
            }
            // InternalBDSL.g:2695:2: ( rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 )
            // InternalBDSL.g:2695:3: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1
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
    // InternalBDSL.g:2704:1: rule__LocalVarDecl__Group_2_3__0 : rule__LocalVarDecl__Group_2_3__0__Impl rule__LocalVarDecl__Group_2_3__1 ;
    public final void rule__LocalVarDecl__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2708:1: ( rule__LocalVarDecl__Group_2_3__0__Impl rule__LocalVarDecl__Group_2_3__1 )
            // InternalBDSL.g:2709:2: rule__LocalVarDecl__Group_2_3__0__Impl rule__LocalVarDecl__Group_2_3__1
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
    // InternalBDSL.g:2716:1: rule__LocalVarDecl__Group_2_3__0__Impl : ( '=' ) ;
    public final void rule__LocalVarDecl__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2720:1: ( ( '=' ) )
            // InternalBDSL.g:2721:1: ( '=' )
            {
            // InternalBDSL.g:2721:1: ( '=' )
            // InternalBDSL.g:2722:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_2_3_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2731:1: rule__LocalVarDecl__Group_2_3__1 : rule__LocalVarDecl__Group_2_3__1__Impl rule__LocalVarDecl__Group_2_3__2 ;
    public final void rule__LocalVarDecl__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2735:1: ( rule__LocalVarDecl__Group_2_3__1__Impl rule__LocalVarDecl__Group_2_3__2 )
            // InternalBDSL.g:2736:2: rule__LocalVarDecl__Group_2_3__1__Impl rule__LocalVarDecl__Group_2_3__2
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
    // InternalBDSL.g:2743:1: rule__LocalVarDecl__Group_2_3__1__Impl : ( '{' ) ;
    public final void rule__LocalVarDecl__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2747:1: ( ( '{' ) )
            // InternalBDSL.g:2748:1: ( '{' )
            {
            // InternalBDSL.g:2748:1: ( '{' )
            // InternalBDSL.g:2749:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getLeftCurlyBracketKeyword_2_3_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2758:1: rule__LocalVarDecl__Group_2_3__2 : rule__LocalVarDecl__Group_2_3__2__Impl rule__LocalVarDecl__Group_2_3__3 ;
    public final void rule__LocalVarDecl__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2762:1: ( rule__LocalVarDecl__Group_2_3__2__Impl rule__LocalVarDecl__Group_2_3__3 )
            // InternalBDSL.g:2763:2: rule__LocalVarDecl__Group_2_3__2__Impl rule__LocalVarDecl__Group_2_3__3
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
    // InternalBDSL.g:2770:1: rule__LocalVarDecl__Group_2_3__2__Impl : ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* ) ;
    public final void rule__LocalVarDecl__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2774:1: ( ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* ) )
            // InternalBDSL.g:2775:1: ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* )
            {
            // InternalBDSL.g:2775:1: ( ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )* )
            // InternalBDSL.g:2776:2: ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getDefinitionAssignment_2_3_2()); 
            }
            // InternalBDSL.g:2777:2: ( rule__LocalVarDecl__DefinitionAssignment_2_3_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==22||LA23_0==32||LA23_0==34) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBDSL.g:2777:3: rule__LocalVarDecl__DefinitionAssignment_2_3_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__LocalVarDecl__DefinitionAssignment_2_3_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalBDSL.g:2785:1: rule__LocalVarDecl__Group_2_3__3 : rule__LocalVarDecl__Group_2_3__3__Impl ;
    public final void rule__LocalVarDecl__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2789:1: ( rule__LocalVarDecl__Group_2_3__3__Impl )
            // InternalBDSL.g:2790:2: rule__LocalVarDecl__Group_2_3__3__Impl
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
    // InternalBDSL.g:2796:1: rule__LocalVarDecl__Group_2_3__3__Impl : ( '}' ) ;
    public final void rule__LocalVarDecl__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2800:1: ( ( '}' ) )
            // InternalBDSL.g:2801:1: ( '}' )
            {
            // InternalBDSL.g:2801:1: ( '}' )
            // InternalBDSL.g:2802:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getRightCurlyBracketKeyword_2_3_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2812:1: rule__NodeExpressionCall__Group__0 : rule__NodeExpressionCall__Group__0__Impl rule__NodeExpressionCall__Group__1 ;
    public final void rule__NodeExpressionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2816:1: ( rule__NodeExpressionCall__Group__0__Impl rule__NodeExpressionCall__Group__1 )
            // InternalBDSL.g:2817:2: rule__NodeExpressionCall__Group__0__Impl rule__NodeExpressionCall__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBDSL.g:2824:1: rule__NodeExpressionCall__Group__0__Impl : ( ( rule__NodeExpressionCall__ValueAssignment_0 ) ) ;
    public final void rule__NodeExpressionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2828:1: ( ( ( rule__NodeExpressionCall__ValueAssignment_0 ) ) )
            // InternalBDSL.g:2829:1: ( ( rule__NodeExpressionCall__ValueAssignment_0 ) )
            {
            // InternalBDSL.g:2829:1: ( ( rule__NodeExpressionCall__ValueAssignment_0 ) )
            // InternalBDSL.g:2830:2: ( rule__NodeExpressionCall__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getValueAssignment_0()); 
            }
            // InternalBDSL.g:2831:2: ( rule__NodeExpressionCall__ValueAssignment_0 )
            // InternalBDSL.g:2831:3: rule__NodeExpressionCall__ValueAssignment_0
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
    // InternalBDSL.g:2839:1: rule__NodeExpressionCall__Group__1 : rule__NodeExpressionCall__Group__1__Impl ;
    public final void rule__NodeExpressionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2843:1: ( rule__NodeExpressionCall__Group__1__Impl )
            // InternalBDSL.g:2844:2: rule__NodeExpressionCall__Group__1__Impl
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
    // InternalBDSL.g:2850:1: rule__NodeExpressionCall__Group__1__Impl : ( ( rule__NodeExpressionCall__Group_1__0 )? ) ;
    public final void rule__NodeExpressionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2854:1: ( ( ( rule__NodeExpressionCall__Group_1__0 )? ) )
            // InternalBDSL.g:2855:1: ( ( rule__NodeExpressionCall__Group_1__0 )? )
            {
            // InternalBDSL.g:2855:1: ( ( rule__NodeExpressionCall__Group_1__0 )? )
            // InternalBDSL.g:2856:2: ( rule__NodeExpressionCall__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getGroup_1()); 
            }
            // InternalBDSL.g:2857:2: ( rule__NodeExpressionCall__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBDSL.g:2857:3: rule__NodeExpressionCall__Group_1__0
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
    // InternalBDSL.g:2866:1: rule__NodeExpressionCall__Group_1__0 : rule__NodeExpressionCall__Group_1__0__Impl rule__NodeExpressionCall__Group_1__1 ;
    public final void rule__NodeExpressionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2870:1: ( rule__NodeExpressionCall__Group_1__0__Impl rule__NodeExpressionCall__Group_1__1 )
            // InternalBDSL.g:2871:2: rule__NodeExpressionCall__Group_1__0__Impl rule__NodeExpressionCall__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalBDSL.g:2878:1: rule__NodeExpressionCall__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeExpressionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2882:1: ( ( '[' ) )
            // InternalBDSL.g:2883:1: ( '[' )
            {
            // InternalBDSL.g:2883:1: ( '[' )
            // InternalBDSL.g:2884:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2893:1: rule__NodeExpressionCall__Group_1__1 : rule__NodeExpressionCall__Group_1__1__Impl rule__NodeExpressionCall__Group_1__2 ;
    public final void rule__NodeExpressionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2897:1: ( rule__NodeExpressionCall__Group_1__1__Impl rule__NodeExpressionCall__Group_1__2 )
            // InternalBDSL.g:2898:2: rule__NodeExpressionCall__Group_1__1__Impl rule__NodeExpressionCall__Group_1__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalBDSL.g:2905:1: rule__NodeExpressionCall__Group_1__1__Impl : ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* ) ;
    public final void rule__NodeExpressionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2909:1: ( ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* ) )
            // InternalBDSL.g:2910:1: ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* )
            {
            // InternalBDSL.g:2910:1: ( ( rule__NodeExpressionCall__LinksAssignment_1_1 )* )
            // InternalBDSL.g:2911:2: ( rule__NodeExpressionCall__LinksAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getLinksAssignment_1_1()); 
            }
            // InternalBDSL.g:2912:2: ( rule__NodeExpressionCall__LinksAssignment_1_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBDSL.g:2912:3: rule__NodeExpressionCall__LinksAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__NodeExpressionCall__LinksAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalBDSL.g:2920:1: rule__NodeExpressionCall__Group_1__2 : rule__NodeExpressionCall__Group_1__2__Impl ;
    public final void rule__NodeExpressionCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2924:1: ( rule__NodeExpressionCall__Group_1__2__Impl )
            // InternalBDSL.g:2925:2: rule__NodeExpressionCall__Group_1__2__Impl
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
    // InternalBDSL.g:2931:1: rule__NodeExpressionCall__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeExpressionCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2935:1: ( ( ']' ) )
            // InternalBDSL.g:2936:1: ( ']' )
            {
            // InternalBDSL.g:2936:1: ( ']' )
            // InternalBDSL.g:2937:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:2947:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2951:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalBDSL.g:2952:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBDSL.g:2959:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2963:1: ( ( ruleMultiplication ) )
            // InternalBDSL.g:2964:1: ( ruleMultiplication )
            {
            // InternalBDSL.g:2964:1: ( ruleMultiplication )
            // InternalBDSL.g:2965:2: ruleMultiplication
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
    // InternalBDSL.g:2974:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2978:1: ( rule__Addition__Group__1__Impl )
            // InternalBDSL.g:2979:2: rule__Addition__Group__1__Impl
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
    // InternalBDSL.g:2985:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:2989:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalBDSL.g:2990:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalBDSL.g:2990:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalBDSL.g:2991:2: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // InternalBDSL.g:2992:2: ( rule__Addition__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=11 && LA26_0<=13)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBDSL.g:2992:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalBDSL.g:3001:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3005:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalBDSL.g:3006:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBDSL.g:3013:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Group_1_0__0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3017:1: ( ( ( rule__Addition__Group_1_0__0 ) ) )
            // InternalBDSL.g:3018:1: ( ( rule__Addition__Group_1_0__0 ) )
            {
            // InternalBDSL.g:3018:1: ( ( rule__Addition__Group_1_0__0 ) )
            // InternalBDSL.g:3019:2: ( rule__Addition__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }
            // InternalBDSL.g:3020:2: ( rule__Addition__Group_1_0__0 )
            // InternalBDSL.g:3020:3: rule__Addition__Group_1_0__0
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
    // InternalBDSL.g:3028:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3032:1: ( rule__Addition__Group_1__1__Impl )
            // InternalBDSL.g:3033:2: rule__Addition__Group_1__1__Impl
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
    // InternalBDSL.g:3039:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3043:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalBDSL.g:3044:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalBDSL.g:3044:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalBDSL.g:3045:2: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // InternalBDSL.g:3046:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalBDSL.g:3046:3: rule__Addition__RightAssignment_1_1
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
    // InternalBDSL.g:3055:1: rule__Addition__Group_1_0__0 : rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 ;
    public final void rule__Addition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3059:1: ( rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 )
            // InternalBDSL.g:3060:2: rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBDSL.g:3067:1: rule__Addition__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3071:1: ( ( () ) )
            // InternalBDSL.g:3072:1: ( () )
            {
            // InternalBDSL.g:3072:1: ( () )
            // InternalBDSL.g:3073:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0()); 
            }
            // InternalBDSL.g:3074:2: ()
            // InternalBDSL.g:3074:3: 
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
    // InternalBDSL.g:3082:1: rule__Addition__Group_1_0__1 : rule__Addition__Group_1_0__1__Impl ;
    public final void rule__Addition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3086:1: ( rule__Addition__Group_1_0__1__Impl )
            // InternalBDSL.g:3087:2: rule__Addition__Group_1_0__1__Impl
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
    // InternalBDSL.g:3093:1: rule__Addition__Group_1_0__1__Impl : ( ( rule__Addition__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__Addition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3097:1: ( ( ( rule__Addition__OperatorAssignment_1_0_1 ) ) )
            // InternalBDSL.g:3098:1: ( ( rule__Addition__OperatorAssignment_1_0_1 ) )
            {
            // InternalBDSL.g:3098:1: ( ( rule__Addition__OperatorAssignment_1_0_1 ) )
            // InternalBDSL.g:3099:2: ( rule__Addition__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_0_1()); 
            }
            // InternalBDSL.g:3100:2: ( rule__Addition__OperatorAssignment_1_0_1 )
            // InternalBDSL.g:3100:3: rule__Addition__OperatorAssignment_1_0_1
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
    // InternalBDSL.g:3109:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3113:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalBDSL.g:3114:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalBDSL.g:3121:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3125:1: ( ( rulePrimaryExpression ) )
            // InternalBDSL.g:3126:1: ( rulePrimaryExpression )
            {
            // InternalBDSL.g:3126:1: ( rulePrimaryExpression )
            // InternalBDSL.g:3127:2: rulePrimaryExpression
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
    // InternalBDSL.g:3136:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3140:1: ( rule__Multiplication__Group__1__Impl )
            // InternalBDSL.g:3141:2: rule__Multiplication__Group__1__Impl
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
    // InternalBDSL.g:3147:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3151:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalBDSL.g:3152:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalBDSL.g:3152:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalBDSL.g:3153:2: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // InternalBDSL.g:3154:2: ( rule__Multiplication__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=14 && LA27_0<=16)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBDSL.g:3154:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalBDSL.g:3163:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3167:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalBDSL.g:3168:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBDSL.g:3175:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Group_1_0__0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3179:1: ( ( ( rule__Multiplication__Group_1_0__0 ) ) )
            // InternalBDSL.g:3180:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            {
            // InternalBDSL.g:3180:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            // InternalBDSL.g:3181:2: ( rule__Multiplication__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }
            // InternalBDSL.g:3182:2: ( rule__Multiplication__Group_1_0__0 )
            // InternalBDSL.g:3182:3: rule__Multiplication__Group_1_0__0
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
    // InternalBDSL.g:3190:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3194:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalBDSL.g:3195:2: rule__Multiplication__Group_1__1__Impl
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
    // InternalBDSL.g:3201:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3205:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalBDSL.g:3206:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalBDSL.g:3206:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalBDSL.g:3207:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // InternalBDSL.g:3208:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalBDSL.g:3208:3: rule__Multiplication__RightAssignment_1_1
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
    // InternalBDSL.g:3217:1: rule__Multiplication__Group_1_0__0 : rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 ;
    public final void rule__Multiplication__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3221:1: ( rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 )
            // InternalBDSL.g:3222:2: rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalBDSL.g:3229:1: rule__Multiplication__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3233:1: ( ( () ) )
            // InternalBDSL.g:3234:1: ( () )
            {
            // InternalBDSL.g:3234:1: ( () )
            // InternalBDSL.g:3235:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0()); 
            }
            // InternalBDSL.g:3236:2: ()
            // InternalBDSL.g:3236:3: 
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
    // InternalBDSL.g:3244:1: rule__Multiplication__Group_1_0__1 : rule__Multiplication__Group_1_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3248:1: ( rule__Multiplication__Group_1_0__1__Impl )
            // InternalBDSL.g:3249:2: rule__Multiplication__Group_1_0__1__Impl
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
    // InternalBDSL.g:3255:1: rule__Multiplication__Group_1_0__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3259:1: ( ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) ) )
            // InternalBDSL.g:3260:1: ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) )
            {
            // InternalBDSL.g:3260:1: ( ( rule__Multiplication__OperatorAssignment_1_0_1 ) )
            // InternalBDSL.g:3261:2: ( rule__Multiplication__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_0_1()); 
            }
            // InternalBDSL.g:3262:2: ( rule__Multiplication__OperatorAssignment_1_0_1 )
            // InternalBDSL.g:3262:3: rule__Multiplication__OperatorAssignment_1_0_1
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
    // InternalBDSL.g:3271:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3275:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalBDSL.g:3276:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBDSL.g:3283:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3287:1: ( ( '(' ) )
            // InternalBDSL.g:3288:1: ( '(' )
            {
            // InternalBDSL.g:3288:1: ( '(' )
            // InternalBDSL.g:3289:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:3298:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3302:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalBDSL.g:3303:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalBDSL.g:3310:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleBigraphExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3314:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:3315:1: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:3315:1: ( ruleBigraphExpression )
            // InternalBDSL.g:3316:2: ruleBigraphExpression
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
    // InternalBDSL.g:3325:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3329:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalBDSL.g:3330:2: rule__PrimaryExpression__Group_0__2__Impl
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
    // InternalBDSL.g:3336:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3340:1: ( ( ')' ) )
            // InternalBDSL.g:3341:1: ( ')' )
            {
            // InternalBDSL.g:3341:1: ( ')' )
            // InternalBDSL.g:3342:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:3352:1: rule__MainDeclaration__Group__0 : rule__MainDeclaration__Group__0__Impl rule__MainDeclaration__Group__1 ;
    public final void rule__MainDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3356:1: ( rule__MainDeclaration__Group__0__Impl rule__MainDeclaration__Group__1 )
            // InternalBDSL.g:3357:2: rule__MainDeclaration__Group__0__Impl rule__MainDeclaration__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalBDSL.g:3364:1: rule__MainDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__MainDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3368:1: ( ( () ) )
            // InternalBDSL.g:3369:1: ( () )
            {
            // InternalBDSL.g:3369:1: ( () )
            // InternalBDSL.g:3370:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclarationAccess().getMainDeclarationAction_0()); 
            }
            // InternalBDSL.g:3371:2: ()
            // InternalBDSL.g:3371:3: 
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
    // InternalBDSL.g:3379:1: rule__MainDeclaration__Group__1 : rule__MainDeclaration__Group__1__Impl rule__MainDeclaration__Group__2 ;
    public final void rule__MainDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3383:1: ( rule__MainDeclaration__Group__1__Impl rule__MainDeclaration__Group__2 )
            // InternalBDSL.g:3384:2: rule__MainDeclaration__Group__1__Impl rule__MainDeclaration__Group__2
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
    // InternalBDSL.g:3391:1: rule__MainDeclaration__Group__1__Impl : ( ( rule__MainDeclaration__DefinitionAssignment_1 ) ) ;
    public final void rule__MainDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3395:1: ( ( ( rule__MainDeclaration__DefinitionAssignment_1 ) ) )
            // InternalBDSL.g:3396:1: ( ( rule__MainDeclaration__DefinitionAssignment_1 ) )
            {
            // InternalBDSL.g:3396:1: ( ( rule__MainDeclaration__DefinitionAssignment_1 ) )
            // InternalBDSL.g:3397:2: ( rule__MainDeclaration__DefinitionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclarationAccess().getDefinitionAssignment_1()); 
            }
            // InternalBDSL.g:3398:2: ( rule__MainDeclaration__DefinitionAssignment_1 )
            // InternalBDSL.g:3398:3: rule__MainDeclaration__DefinitionAssignment_1
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
    // InternalBDSL.g:3406:1: rule__MainDeclaration__Group__2 : rule__MainDeclaration__Group__2__Impl ;
    public final void rule__MainDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3410:1: ( rule__MainDeclaration__Group__2__Impl )
            // InternalBDSL.g:3411:2: rule__MainDeclaration__Group__2__Impl
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
    // InternalBDSL.g:3417:1: rule__MainDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__MainDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3421:1: ( ( ';' ) )
            // InternalBDSL.g:3422:1: ( ';' )
            {
            // InternalBDSL.g:3422:1: ( ';' )
            // InternalBDSL.g:3423:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalBDSL.g:3433:1: rule__PrintLn__Group__0 : rule__PrintLn__Group__0__Impl rule__PrintLn__Group__1 ;
    public final void rule__PrintLn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3437:1: ( rule__PrintLn__Group__0__Impl rule__PrintLn__Group__1 )
            // InternalBDSL.g:3438:2: rule__PrintLn__Group__0__Impl rule__PrintLn__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalBDSL.g:3445:1: rule__PrintLn__Group__0__Impl : ( 'println' ) ;
    public final void rule__PrintLn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3449:1: ( ( 'println' ) )
            // InternalBDSL.g:3450:1: ( 'println' )
            {
            // InternalBDSL.g:3450:1: ( 'println' )
            // InternalBDSL.g:3451:2: 'println'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getPrintlnKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getPrintlnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__Group__0__Impl"


    // $ANTLR start "rule__PrintLn__Group__1"
    // InternalBDSL.g:3460:1: rule__PrintLn__Group__1 : rule__PrintLn__Group__1__Impl rule__PrintLn__Group__2 ;
    public final void rule__PrintLn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3464:1: ( rule__PrintLn__Group__1__Impl rule__PrintLn__Group__2 )
            // InternalBDSL.g:3465:2: rule__PrintLn__Group__1__Impl rule__PrintLn__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalBDSL.g:3472:1: rule__PrintLn__Group__1__Impl : ( '(' ) ;
    public final void rule__PrintLn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3476:1: ( ( '(' ) )
            // InternalBDSL.g:3477:1: ( '(' )
            {
            // InternalBDSL.g:3477:1: ( '(' )
            // InternalBDSL.g:3478:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
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
    // InternalBDSL.g:3487:1: rule__PrintLn__Group__2 : rule__PrintLn__Group__2__Impl rule__PrintLn__Group__3 ;
    public final void rule__PrintLn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3491:1: ( rule__PrintLn__Group__2__Impl rule__PrintLn__Group__3 )
            // InternalBDSL.g:3492:2: rule__PrintLn__Group__2__Impl rule__PrintLn__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalBDSL.g:3499:1: rule__PrintLn__Group__2__Impl : ( ( rule__PrintLn__TextAssignment_2 ) ) ;
    public final void rule__PrintLn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3503:1: ( ( ( rule__PrintLn__TextAssignment_2 ) ) )
            // InternalBDSL.g:3504:1: ( ( rule__PrintLn__TextAssignment_2 ) )
            {
            // InternalBDSL.g:3504:1: ( ( rule__PrintLn__TextAssignment_2 ) )
            // InternalBDSL.g:3505:2: ( rule__PrintLn__TextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getTextAssignment_2()); 
            }
            // InternalBDSL.g:3506:2: ( rule__PrintLn__TextAssignment_2 )
            // InternalBDSL.g:3506:3: rule__PrintLn__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PrintLn__TextAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getTextAssignment_2()); 
            }

            }


            }

        }
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
    // InternalBDSL.g:3514:1: rule__PrintLn__Group__3 : rule__PrintLn__Group__3__Impl ;
    public final void rule__PrintLn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3518:1: ( rule__PrintLn__Group__3__Impl )
            // InternalBDSL.g:3519:2: rule__PrintLn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintLn__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBDSL.g:3525:1: rule__PrintLn__Group__3__Impl : ( ')' ) ;
    public final void rule__PrintLn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3529:1: ( ( ')' ) )
            // InternalBDSL.g:3530:1: ( ')' )
            {
            // InternalBDSL.g:3530:1: ( ')' )
            // InternalBDSL.g:3531:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__BRSModel__UnorderedGroup_1"
    // InternalBDSL.g:3541:1: rule__BRSModel__UnorderedGroup_1 : rule__BRSModel__UnorderedGroup_1__0 {...}?;
    public final void rule__BRSModel__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBRSModelAccess().getUnorderedGroup_1());
        	
        try {
            // InternalBDSL.g:3546:1: ( rule__BRSModel__UnorderedGroup_1__0 {...}?)
            // InternalBDSL.g:3547:2: rule__BRSModel__UnorderedGroup_1__0 {...}?
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
    // InternalBDSL.g:3555:1: rule__BRSModel__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) ) ;
    public final void rule__BRSModel__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalBDSL.g:3560:1: ( ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) ) )
            // InternalBDSL.g:3561:3: ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) )
            {
            // InternalBDSL.g:3561:3: ( ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalBDSL.g:3562:3: ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) )
                    {
                    // InternalBDSL.g:3562:3: ({...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) ) )
                    // InternalBDSL.g:3563:4: {...}? => ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BRSModel__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalBDSL.g:3563:104: ( ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) ) )
                    // InternalBDSL.g:3564:5: ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0);
                    selected = true;
                    // InternalBDSL.g:3570:5: ( ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* ) )
                    // InternalBDSL.g:3571:6: ( ( rule__BRSModel__StatementsAssignment_1_0 ) ) ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* )
                    {
                    // InternalBDSL.g:3571:6: ( ( rule__BRSModel__StatementsAssignment_1_0 ) )
                    // InternalBDSL.g:3572:7: ( rule__BRSModel__StatementsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRSModelAccess().getStatementsAssignment_1_0()); 
                    }
                    // InternalBDSL.g:3573:7: ( rule__BRSModel__StatementsAssignment_1_0 )
                    // InternalBDSL.g:3573:8: rule__BRSModel__StatementsAssignment_1_0
                    {
                    pushFollow(FOLLOW_42);
                    rule__BRSModel__StatementsAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBRSModelAccess().getStatementsAssignment_1_0()); 
                    }

                    }

                    // InternalBDSL.g:3576:6: ( ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )* )
                    // InternalBDSL.g:3577:7: ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRSModelAccess().getStatementsAssignment_1_0()); 
                    }
                    // InternalBDSL.g:3578:7: ( ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0 )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==32) ) {
                            int LA28_1 = input.LA(2);

                            if ( (synpred1_InternalBDSL()) ) {
                                alt28=1;
                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalBDSL.g:3578:8: ( rule__BRSModel__StatementsAssignment_1_0 )=> rule__BRSModel__StatementsAssignment_1_0
                    	    {
                    	    pushFollow(FOLLOW_42);
                    	    rule__BRSModel__StatementsAssignment_1_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
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
                    // InternalBDSL.g:3584:3: ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) )
                    {
                    // InternalBDSL.g:3584:3: ({...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) ) )
                    // InternalBDSL.g:3585:4: {...}? => ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BRSModel__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalBDSL.g:3585:104: ( ( ( rule__BRSModel__MainAssignment_1_1 ) ) )
                    // InternalBDSL.g:3586:5: ( ( rule__BRSModel__MainAssignment_1_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1);
                    selected = true;
                    // InternalBDSL.g:3592:5: ( ( rule__BRSModel__MainAssignment_1_1 ) )
                    // InternalBDSL.g:3593:6: ( rule__BRSModel__MainAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRSModelAccess().getMainAssignment_1_1()); 
                    }
                    // InternalBDSL.g:3594:6: ( rule__BRSModel__MainAssignment_1_1 )
                    // InternalBDSL.g:3594:7: rule__BRSModel__MainAssignment_1_1
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
    // InternalBDSL.g:3607:1: rule__BRSModel__UnorderedGroup_1__0 : rule__BRSModel__UnorderedGroup_1__Impl ( rule__BRSModel__UnorderedGroup_1__1 )? ;
    public final void rule__BRSModel__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3611:1: ( rule__BRSModel__UnorderedGroup_1__Impl ( rule__BRSModel__UnorderedGroup_1__1 )? )
            // InternalBDSL.g:3612:2: rule__BRSModel__UnorderedGroup_1__Impl ( rule__BRSModel__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_43);
            rule__BRSModel__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBDSL.g:3613:2: ( rule__BRSModel__UnorderedGroup_1__1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getBRSModelAccess().getUnorderedGroup_1(), 1) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBDSL.g:3613:2: rule__BRSModel__UnorderedGroup_1__1
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
    // InternalBDSL.g:3619:1: rule__BRSModel__UnorderedGroup_1__1 : rule__BRSModel__UnorderedGroup_1__Impl ;
    public final void rule__BRSModel__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3623:1: ( rule__BRSModel__UnorderedGroup_1__Impl )
            // InternalBDSL.g:3624:2: rule__BRSModel__UnorderedGroup_1__Impl
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
    // InternalBDSL.g:3631:1: rule__BRSModel__SignatureAssignment_0 : ( ruleSignature ) ;
    public final void rule__BRSModel__SignatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3635:1: ( ( ruleSignature ) )
            // InternalBDSL.g:3636:2: ( ruleSignature )
            {
            // InternalBDSL.g:3636:2: ( ruleSignature )
            // InternalBDSL.g:3637:3: ruleSignature
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
    // InternalBDSL.g:3646:1: rule__BRSModel__StatementsAssignment_1_0 : ( ruleAbstractElement ) ;
    public final void rule__BRSModel__StatementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3650:1: ( ( ruleAbstractElement ) )
            // InternalBDSL.g:3651:2: ( ruleAbstractElement )
            {
            // InternalBDSL.g:3651:2: ( ruleAbstractElement )
            // InternalBDSL.g:3652:3: ruleAbstractElement
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
    // InternalBDSL.g:3661:1: rule__BRSModel__MainAssignment_1_1 : ( ruleMainElement ) ;
    public final void rule__BRSModel__MainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3665:1: ( ( ruleMainElement ) )
            // InternalBDSL.g:3666:2: ( ruleMainElement )
            {
            // InternalBDSL.g:3666:2: ( ruleMainElement )
            // InternalBDSL.g:3667:3: ruleMainElement
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
    // InternalBDSL.g:3676:1: rule__MainElement__ValueAssignment_4 : ( ruleMainDeclaration ) ;
    public final void rule__MainElement__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3680:1: ( ( ruleMainDeclaration ) )
            // InternalBDSL.g:3681:2: ( ruleMainDeclaration )
            {
            // InternalBDSL.g:3681:2: ( ruleMainDeclaration )
            // InternalBDSL.g:3682:3: ruleMainDeclaration
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
    // InternalBDSL.g:3691:1: rule__Signature__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Signature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3695:1: ( ( RULE_ID ) )
            // InternalBDSL.g:3696:2: ( RULE_ID )
            {
            // InternalBDSL.g:3696:2: ( RULE_ID )
            // InternalBDSL.g:3697:3: RULE_ID
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
    // InternalBDSL.g:3706:1: rule__Signature__ControlsAssignment_3_1 : ( ruleControlDef ) ;
    public final void rule__Signature__ControlsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3710:1: ( ( ruleControlDef ) )
            // InternalBDSL.g:3711:2: ( ruleControlDef )
            {
            // InternalBDSL.g:3711:2: ( ruleControlDef )
            // InternalBDSL.g:3712:3: ruleControlDef
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
    // InternalBDSL.g:3721:1: rule__ControlDef__TypeAssignment_1 : ( ruleControlType ) ;
    public final void rule__ControlDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3725:1: ( ( ruleControlType ) )
            // InternalBDSL.g:3726:2: ( ruleControlType )
            {
            // InternalBDSL.g:3726:2: ( ruleControlType )
            // InternalBDSL.g:3727:3: ruleControlType
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
    // InternalBDSL.g:3736:1: rule__ControlDef__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ControlDef__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3740:1: ( ( RULE_ID ) )
            // InternalBDSL.g:3741:2: ( RULE_ID )
            {
            // InternalBDSL.g:3741:2: ( RULE_ID )
            // InternalBDSL.g:3742:3: RULE_ID
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
    // InternalBDSL.g:3751:1: rule__ControlDef__ArityAssignment_5 : ( ruleArityValue ) ;
    public final void rule__ControlDef__ArityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3755:1: ( ( ruleArityValue ) )
            // InternalBDSL.g:3756:2: ( ruleArityValue )
            {
            // InternalBDSL.g:3756:2: ( ruleArityValue )
            // InternalBDSL.g:3757:3: ruleArityValue
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
    // InternalBDSL.g:3766:1: rule__ArityValue__ValueAssignment : ( ruleEInt ) ;
    public final void rule__ArityValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3770:1: ( ( ruleEInt ) )
            // InternalBDSL.g:3771:2: ( ruleEInt )
            {
            // InternalBDSL.g:3771:2: ( ruleEInt )
            // InternalBDSL.g:3772:3: ruleEInt
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
    // InternalBDSL.g:3781:1: rule__NameConstant__ValueAssignment : ( ruleEString ) ;
    public final void rule__NameConstant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3785:1: ( ( ruleEString ) )
            // InternalBDSL.g:3786:2: ( ruleEString )
            {
            // InternalBDSL.g:3786:2: ( ruleEString )
            // InternalBDSL.g:3787:3: ruleEString
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
    // InternalBDSL.g:3796:1: rule__SiteVars__NameAssignment : ( RULE_ID ) ;
    public final void rule__SiteVars__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3800:1: ( ( RULE_ID ) )
            // InternalBDSL.g:3801:2: ( RULE_ID )
            {
            // InternalBDSL.g:3801:2: ( RULE_ID )
            // InternalBDSL.g:3802:3: RULE_ID
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


    // $ANTLR start "rule__LVD2__NameAssignment_2"
    // InternalBDSL.g:3811:1: rule__LVD2__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LVD2__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3815:1: ( ( RULE_ID ) )
            // InternalBDSL.g:3816:2: ( RULE_ID )
            {
            // InternalBDSL.g:3816:2: ( RULE_ID )
            // InternalBDSL.g:3817:3: RULE_ID
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
    // InternalBDSL.g:3826:1: rule__LVD2__TypeAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__LVD2__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3830:1: ( ( ( ruleFQN ) ) )
            // InternalBDSL.g:3831:2: ( ( ruleFQN ) )
            {
            // InternalBDSL.g:3831:2: ( ( ruleFQN ) )
            // InternalBDSL.g:3832:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLVD2Access().getTypeControlVariableCrossReference_4_0()); 
            }
            // InternalBDSL.g:3833:3: ( ruleFQN )
            // InternalBDSL.g:3834:4: ruleFQN
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
    // InternalBDSL.g:3845:1: rule__LVD2__DefinitionAssignment_7 : ( ruleBigraphExpression ) ;
    public final void rule__LVD2__DefinitionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3849:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:3850:2: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:3850:2: ( ruleBigraphExpression )
            // InternalBDSL.g:3851:3: ruleBigraphExpression
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
    // InternalBDSL.g:3860:1: rule__LocalVarDecl__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__LocalVarDecl__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3864:1: ( ( RULE_ID ) )
            // InternalBDSL.g:3865:2: ( RULE_ID )
            {
            // InternalBDSL.g:3865:2: ( RULE_ID )
            // InternalBDSL.g:3866:3: RULE_ID
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
    // InternalBDSL.g:3875:1: rule__LocalVarDecl__SigAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__LocalVarDecl__SigAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3879:1: ( ( ( RULE_ID ) ) )
            // InternalBDSL.g:3880:2: ( ( RULE_ID ) )
            {
            // InternalBDSL.g:3880:2: ( ( RULE_ID ) )
            // InternalBDSL.g:3881:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getSigSignatureCrossReference_2_1_1_0()); 
            }
            // InternalBDSL.g:3882:3: ( RULE_ID )
            // InternalBDSL.g:3883:4: RULE_ID
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
    // InternalBDSL.g:3894:1: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1 : ( ruleSiteVars ) ;
    public final void rule__LocalVarDecl__SiteArgsAssignment_2_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3898:1: ( ( ruleSiteVars ) )
            // InternalBDSL.g:3899:2: ( ruleSiteVars )
            {
            // InternalBDSL.g:3899:2: ( ruleSiteVars )
            // InternalBDSL.g:3900:3: ruleSiteVars
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
    // InternalBDSL.g:3909:1: rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1 : ( ruleSiteVars ) ;
    public final void rule__LocalVarDecl__SiteArgsAssignment_2_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3913:1: ( ( ruleSiteVars ) )
            // InternalBDSL.g:3914:2: ( ruleSiteVars )
            {
            // InternalBDSL.g:3914:2: ( ruleSiteVars )
            // InternalBDSL.g:3915:3: ruleSiteVars
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
    // InternalBDSL.g:3924:1: rule__LocalVarDecl__TypeAssignment_2_2_2 : ( ( ruleFQN ) ) ;
    public final void rule__LocalVarDecl__TypeAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3928:1: ( ( ( ruleFQN ) ) )
            // InternalBDSL.g:3929:2: ( ( ruleFQN ) )
            {
            // InternalBDSL.g:3929:2: ( ( ruleFQN ) )
            // InternalBDSL.g:3930:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalVarDeclAccess().getTypeControlVariableCrossReference_2_2_2_0()); 
            }
            // InternalBDSL.g:3931:3: ( ruleFQN )
            // InternalBDSL.g:3932:4: ruleFQN
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
    // InternalBDSL.g:3943:1: rule__LocalVarDecl__DefinitionAssignment_2_3_2 : ( ruleBigraphExpression ) ;
    public final void rule__LocalVarDecl__DefinitionAssignment_2_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3947:1: ( ( ruleBigraphExpression ) )
            // InternalBDSL.g:3948:2: ( ruleBigraphExpression )
            {
            // InternalBDSL.g:3948:2: ( ruleBigraphExpression )
            // InternalBDSL.g:3949:3: ruleBigraphExpression
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
    // InternalBDSL.g:3958:1: rule__BigraphVarReference__ValueAssignment : ( ( ruleBigraphVarReferenceID ) ) ;
    public final void rule__BigraphVarReference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3962:1: ( ( ( ruleBigraphVarReferenceID ) ) )
            // InternalBDSL.g:3963:2: ( ( ruleBigraphVarReferenceID ) )
            {
            // InternalBDSL.g:3963:2: ( ( ruleBigraphVarReferenceID ) )
            // InternalBDSL.g:3964:3: ( ruleBigraphVarReferenceID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigraphVarReferenceAccess().getValueLocalVarDeclCrossReference_0()); 
            }
            // InternalBDSL.g:3965:3: ( ruleBigraphVarReferenceID )
            // InternalBDSL.g:3966:4: ruleBigraphVarReferenceID
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
    // InternalBDSL.g:3977:1: rule__NodeExpressionCall__ValueAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__NodeExpressionCall__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:3981:1: ( ( ( ruleFQN ) ) )
            // InternalBDSL.g:3982:2: ( ( ruleFQN ) )
            {
            // InternalBDSL.g:3982:2: ( ( ruleFQN ) )
            // InternalBDSL.g:3983:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeExpressionCallAccess().getValueControlVariableCrossReference_0_0()); 
            }
            // InternalBDSL.g:3984:3: ( ruleFQN )
            // InternalBDSL.g:3985:4: ruleFQN
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
    // InternalBDSL.g:3996:1: rule__NodeExpressionCall__LinksAssignment_1_1 : ( ruleLinkNames ) ;
    public final void rule__NodeExpressionCall__LinksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4000:1: ( ( ruleLinkNames ) )
            // InternalBDSL.g:4001:2: ( ruleLinkNames )
            {
            // InternalBDSL.g:4001:2: ( ruleLinkNames )
            // InternalBDSL.g:4002:3: ruleLinkNames
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
    // InternalBDSL.g:4011:1: rule__Addition__OperatorAssignment_1_0_1 : ( ruleBinaryParallelOperator ) ;
    public final void rule__Addition__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4015:1: ( ( ruleBinaryParallelOperator ) )
            // InternalBDSL.g:4016:2: ( ruleBinaryParallelOperator )
            {
            // InternalBDSL.g:4016:2: ( ruleBinaryParallelOperator )
            // InternalBDSL.g:4017:3: ruleBinaryParallelOperator
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
    // InternalBDSL.g:4026:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4030:1: ( ( ruleMultiplication ) )
            // InternalBDSL.g:4031:2: ( ruleMultiplication )
            {
            // InternalBDSL.g:4031:2: ( ruleMultiplication )
            // InternalBDSL.g:4032:3: ruleMultiplication
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
    // InternalBDSL.g:4041:1: rule__Multiplication__OperatorAssignment_1_0_1 : ( ruleBinaryNestingOperator ) ;
    public final void rule__Multiplication__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4045:1: ( ( ruleBinaryNestingOperator ) )
            // InternalBDSL.g:4046:2: ( ruleBinaryNestingOperator )
            {
            // InternalBDSL.g:4046:2: ( ruleBinaryNestingOperator )
            // InternalBDSL.g:4047:3: ruleBinaryNestingOperator
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
    // InternalBDSL.g:4056:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4060:1: ( ( rulePrimaryExpression ) )
            // InternalBDSL.g:4061:2: ( rulePrimaryExpression )
            {
            // InternalBDSL.g:4061:2: ( rulePrimaryExpression )
            // InternalBDSL.g:4062:3: rulePrimaryExpression
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
    // InternalBDSL.g:4071:1: rule__MainDeclaration__DefinitionAssignment_1 : ( ruleAbstractMainStatements ) ;
    public final void rule__MainDeclaration__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4075:1: ( ( ruleAbstractMainStatements ) )
            // InternalBDSL.g:4076:2: ( ruleAbstractMainStatements )
            {
            // InternalBDSL.g:4076:2: ( ruleAbstractMainStatements )
            // InternalBDSL.g:4077:3: ruleAbstractMainStatements
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


    // $ANTLR start "rule__PrintLn__TextAssignment_2"
    // InternalBDSL.g:4086:1: rule__PrintLn__TextAssignment_2 : ( rulePrintableExpression ) ;
    public final void rule__PrintLn__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBDSL.g:4090:1: ( ( rulePrintableExpression ) )
            // InternalBDSL.g:4091:2: ( rulePrintableExpression )
            {
            // InternalBDSL.g:4091:2: ( rulePrintableExpression )
            // InternalBDSL.g:4092:3: rulePrintableExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintLnAccess().getTextPrintableExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrintableExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintLnAccess().getTextPrintableExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintLn__TextAssignment_2"

    // $ANTLR start synpred1_InternalBDSL
    public final void synpred1_InternalBDSL_fragment() throws RecognitionException {   
        // InternalBDSL.g:3578:8: ( rule__BRSModel__StatementsAssignment_1_0 )
        // InternalBDSL.g:3578:9: rule__BRSModel__StatementsAssignment_1_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004004400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000200E0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000200E0002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000504400020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000500400022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001601000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000500400020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100800002L});

}
