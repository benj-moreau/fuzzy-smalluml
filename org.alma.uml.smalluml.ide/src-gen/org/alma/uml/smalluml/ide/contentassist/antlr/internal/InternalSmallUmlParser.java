package org.alma.uml.smalluml.ide.contentassist.antlr.internal;

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
import org.alma.uml.smalluml.services.SmallUmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUmlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Class'", "'{'", "'}'", "'extends'", "','", "'attributes'", "'methods'", "'Relation'", "'from'", "'to'", "'cardinality'", "':'", "'('", "')'", "'['", "']'", "'-'", "'Enumeration'", "'ConcreteType'", "'Abstract'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
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


        public InternalSmallUmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallUmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallUmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallUml.g"; }


    	private SmallUmlGrammarAccess grammarAccess;

    	public void setGrammarAccess(SmallUmlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePackage"
    // InternalSmallUml.g:53:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalSmallUml.g:54:1: ( rulePackage EOF )
            // InternalSmallUml.g:55:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSmallUml.g:62:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:66:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalSmallUml.g:67:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalSmallUml.g:67:2: ( ( rule__Package__Group__0 ) )
            // InternalSmallUml.g:68:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalSmallUml.g:69:3: ( rule__Package__Group__0 )
            // InternalSmallUml.g:69:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleType"
    // InternalSmallUml.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSmallUml.g:79:1: ( ruleType EOF )
            // InternalSmallUml.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUml.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSmallUml.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSmallUml.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalSmallUml.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSmallUml.g:94:3: ( rule__Type__Alternatives )
            // InternalSmallUml.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleClass"
    // InternalSmallUml.g:103:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalSmallUml.g:104:1: ( ruleClass EOF )
            // InternalSmallUml.g:105:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSmallUml.g:112:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:116:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalSmallUml.g:117:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalSmallUml.g:117:2: ( ( rule__Class__Group__0 ) )
            // InternalSmallUml.g:118:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalSmallUml.g:119:3: ( rule__Class__Group__0 )
            // InternalSmallUml.g:119:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleRelation"
    // InternalSmallUml.g:128:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalSmallUml.g:129:1: ( ruleRelation EOF )
            // InternalSmallUml.g:130:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalSmallUml.g:137:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:141:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalSmallUml.g:142:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalSmallUml.g:142:2: ( ( rule__Relation__Group__0 ) )
            // InternalSmallUml.g:143:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalSmallUml.g:144:3: ( rule__Relation__Group__0 )
            // InternalSmallUml.g:144:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUml.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmallUml.g:154:1: ( ruleEString EOF )
            // InternalSmallUml.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSmallUml.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmallUml.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmallUml.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalSmallUml.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmallUml.g:169:3: ( rule__EString__Alternatives )
            // InternalSmallUml.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUml.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSmallUml.g:179:1: ( ruleAttribute EOF )
            // InternalSmallUml.g:180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUml.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSmallUml.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSmallUml.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSmallUml.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSmallUml.g:194:3: ( rule__Attribute__Group__0 )
            // InternalSmallUml.g:194:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalSmallUml.g:203:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalSmallUml.g:204:1: ( ruleMethod EOF )
            // InternalSmallUml.g:205:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalSmallUml.g:212:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:216:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalSmallUml.g:217:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalSmallUml.g:217:2: ( ( rule__Method__Group__0 ) )
            // InternalSmallUml.g:218:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalSmallUml.g:219:3: ( rule__Method__Group__0 )
            // InternalSmallUml.g:219:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleCardinality"
    // InternalSmallUml.g:228:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalSmallUml.g:229:1: ( ruleCardinality EOF )
            // InternalSmallUml.g:230:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalSmallUml.g:237:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:241:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalSmallUml.g:242:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalSmallUml.g:242:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalSmallUml.g:243:3: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalSmallUml.g:244:3: ( rule__Cardinality__Group__0 )
            // InternalSmallUml.g:244:4: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUml.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSmallUml.g:254:1: ( ruleEInt EOF )
            // InternalSmallUml.g:255:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSmallUml.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSmallUml.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSmallUml.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalSmallUml.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSmallUml.g:269:3: ( rule__EInt__Group__0 )
            // InternalSmallUml.g:269:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUml.g:278:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSmallUml.g:279:1: ( ruleEnumeration EOF )
            // InternalSmallUml.g:280:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUml.g:287:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:291:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSmallUml.g:292:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSmallUml.g:292:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSmallUml.g:293:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSmallUml.g:294:3: ( rule__Enumeration__Group__0 )
            // InternalSmallUml.g:294:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleConcreteType"
    // InternalSmallUml.g:303:1: entryRuleConcreteType : ruleConcreteType EOF ;
    public final void entryRuleConcreteType() throws RecognitionException {
        try {
            // InternalSmallUml.g:304:1: ( ruleConcreteType EOF )
            // InternalSmallUml.g:305:1: ruleConcreteType EOF
            {
             before(grammarAccess.getConcreteTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleConcreteType();

            state._fsp--;

             after(grammarAccess.getConcreteTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConcreteType"


    // $ANTLR start "ruleConcreteType"
    // InternalSmallUml.g:312:1: ruleConcreteType : ( ( rule__ConcreteType__Group__0 ) ) ;
    public final void ruleConcreteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:316:2: ( ( ( rule__ConcreteType__Group__0 ) ) )
            // InternalSmallUml.g:317:2: ( ( rule__ConcreteType__Group__0 ) )
            {
            // InternalSmallUml.g:317:2: ( ( rule__ConcreteType__Group__0 ) )
            // InternalSmallUml.g:318:3: ( rule__ConcreteType__Group__0 )
            {
             before(grammarAccess.getConcreteTypeAccess().getGroup()); 
            // InternalSmallUml.g:319:3: ( rule__ConcreteType__Group__0 )
            // InternalSmallUml.g:319:4: rule__ConcreteType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcreteType"


    // $ANTLR start "entryRuleEnumerationElement"
    // InternalSmallUml.g:328:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalSmallUml.g:329:1: ( ruleEnumerationElement EOF )
            // InternalSmallUml.g:330:1: ruleEnumerationElement EOF
            {
             before(grammarAccess.getEnumerationElementRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationElement();

            state._fsp--;

             after(grammarAccess.getEnumerationElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumerationElement"


    // $ANTLR start "ruleEnumerationElement"
    // InternalSmallUml.g:337:1: ruleEnumerationElement : ( ( rule__EnumerationElement__ValueAssignment ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:341:2: ( ( ( rule__EnumerationElement__ValueAssignment ) ) )
            // InternalSmallUml.g:342:2: ( ( rule__EnumerationElement__ValueAssignment ) )
            {
            // InternalSmallUml.g:342:2: ( ( rule__EnumerationElement__ValueAssignment ) )
            // InternalSmallUml.g:343:3: ( rule__EnumerationElement__ValueAssignment )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment()); 
            // InternalSmallUml.g:344:3: ( rule__EnumerationElement__ValueAssignment )
            // InternalSmallUml.g:344:4: rule__EnumerationElement__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationElement__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationElementAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationElement"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSmallUml.g:352:1: rule__Type__Alternatives : ( ( ruleEnumeration ) | ( ruleConcreteType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:356:1: ( ( ruleEnumeration ) | ( ruleConcreteType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSmallUml.g:357:2: ( ruleEnumeration )
                    {
                    // InternalSmallUml.g:357:2: ( ruleEnumeration )
                    // InternalSmallUml.g:358:3: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUml.g:363:2: ( ruleConcreteType )
                    {
                    // InternalSmallUml.g:363:2: ( ruleConcreteType )
                    // InternalSmallUml.g:364:3: ruleConcreteType
                    {
                     before(grammarAccess.getTypeAccess().getConcreteTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConcreteType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getConcreteTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSmallUml.g:373:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:377:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallUml.g:378:2: ( RULE_STRING )
                    {
                    // InternalSmallUml.g:378:2: ( RULE_STRING )
                    // InternalSmallUml.g:379:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUml.g:384:2: ( RULE_ID )
                    {
                    // InternalSmallUml.g:384:2: ( RULE_ID )
                    // InternalSmallUml.g:385:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__Package__Group__0"
    // InternalSmallUml.g:394:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:398:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSmallUml.g:399:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalSmallUml.g:406:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:410:1: ( ( () ) )
            // InternalSmallUml.g:411:1: ( () )
            {
            // InternalSmallUml.g:411:1: ( () )
            // InternalSmallUml.g:412:2: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // InternalSmallUml.g:413:2: ()
            // InternalSmallUml.g:413:3: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalSmallUml.g:421:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:425:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalSmallUml.g:426:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalSmallUml.g:433:1: rule__Package__Group__1__Impl : ( ( rule__Package__Group_1__0 )* ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:437:1: ( ( ( rule__Package__Group_1__0 )* ) )
            // InternalSmallUml.g:438:1: ( ( rule__Package__Group_1__0 )* )
            {
            // InternalSmallUml.g:438:1: ( ( rule__Package__Group_1__0 )* )
            // InternalSmallUml.g:439:2: ( rule__Package__Group_1__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_1()); 
            // InternalSmallUml.g:440:2: ( rule__Package__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmallUml.g:440:3: rule__Package__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Package__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalSmallUml.g:448:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:452:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalSmallUml.g:453:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalSmallUml.g:460:1: rule__Package__Group__2__Impl : ( ( rule__Package__Group_2__0 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:464:1: ( ( ( rule__Package__Group_2__0 )* ) )
            // InternalSmallUml.g:465:1: ( ( rule__Package__Group_2__0 )* )
            {
            // InternalSmallUml.g:465:1: ( ( rule__Package__Group_2__0 )* )
            // InternalSmallUml.g:466:2: ( rule__Package__Group_2__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_2()); 
            // InternalSmallUml.g:467:2: ( rule__Package__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmallUml.g:467:3: rule__Package__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Package__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalSmallUml.g:475:1: rule__Package__Group__3 : rule__Package__Group__3__Impl ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:479:1: ( rule__Package__Group__3__Impl )
            // InternalSmallUml.g:480:2: rule__Package__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalSmallUml.g:486:1: rule__Package__Group__3__Impl : ( ( rule__Package__Group_3__0 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:490:1: ( ( ( rule__Package__Group_3__0 )* ) )
            // InternalSmallUml.g:491:1: ( ( rule__Package__Group_3__0 )* )
            {
            // InternalSmallUml.g:491:1: ( ( rule__Package__Group_3__0 )* )
            // InternalSmallUml.g:492:2: ( rule__Package__Group_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_3()); 
            // InternalSmallUml.g:493:2: ( rule__Package__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=29 && LA5_0<=30)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallUml.g:493:3: rule__Package__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Package__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group_1__0"
    // InternalSmallUml.g:502:1: rule__Package__Group_1__0 : rule__Package__Group_1__0__Impl rule__Package__Group_1__1 ;
    public final void rule__Package__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:506:1: ( rule__Package__Group_1__0__Impl rule__Package__Group_1__1 )
            // InternalSmallUml.g:507:2: rule__Package__Group_1__0__Impl rule__Package__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_1__0"


    // $ANTLR start "rule__Package__Group_1__0__Impl"
    // InternalSmallUml.g:514:1: rule__Package__Group_1__0__Impl : ( ( rule__Package__ClassAssignment_1_0 ) ) ;
    public final void rule__Package__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:518:1: ( ( ( rule__Package__ClassAssignment_1_0 ) ) )
            // InternalSmallUml.g:519:1: ( ( rule__Package__ClassAssignment_1_0 ) )
            {
            // InternalSmallUml.g:519:1: ( ( rule__Package__ClassAssignment_1_0 ) )
            // InternalSmallUml.g:520:2: ( rule__Package__ClassAssignment_1_0 )
            {
             before(grammarAccess.getPackageAccess().getClassAssignment_1_0()); 
            // InternalSmallUml.g:521:2: ( rule__Package__ClassAssignment_1_0 )
            // InternalSmallUml.g:521:3: rule__Package__ClassAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__ClassAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getClassAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_1__0__Impl"


    // $ANTLR start "rule__Package__Group_1__1"
    // InternalSmallUml.g:529:1: rule__Package__Group_1__1 : rule__Package__Group_1__1__Impl ;
    public final void rule__Package__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:533:1: ( rule__Package__Group_1__1__Impl )
            // InternalSmallUml.g:534:2: rule__Package__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_1__1"


    // $ANTLR start "rule__Package__Group_1__1__Impl"
    // InternalSmallUml.g:540:1: rule__Package__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Package__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:544:1: ( ( ';' ) )
            // InternalSmallUml.g:545:1: ( ';' )
            {
            // InternalSmallUml.g:545:1: ( ';' )
            // InternalSmallUml.g:546:2: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_1_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_1__1__Impl"


    // $ANTLR start "rule__Package__Group_2__0"
    // InternalSmallUml.g:556:1: rule__Package__Group_2__0 : rule__Package__Group_2__0__Impl rule__Package__Group_2__1 ;
    public final void rule__Package__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:560:1: ( rule__Package__Group_2__0__Impl rule__Package__Group_2__1 )
            // InternalSmallUml.g:561:2: rule__Package__Group_2__0__Impl rule__Package__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__0"


    // $ANTLR start "rule__Package__Group_2__0__Impl"
    // InternalSmallUml.g:568:1: rule__Package__Group_2__0__Impl : ( ( rule__Package__RelationAssignment_2_0 ) ) ;
    public final void rule__Package__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:572:1: ( ( ( rule__Package__RelationAssignment_2_0 ) ) )
            // InternalSmallUml.g:573:1: ( ( rule__Package__RelationAssignment_2_0 ) )
            {
            // InternalSmallUml.g:573:1: ( ( rule__Package__RelationAssignment_2_0 ) )
            // InternalSmallUml.g:574:2: ( rule__Package__RelationAssignment_2_0 )
            {
             before(grammarAccess.getPackageAccess().getRelationAssignment_2_0()); 
            // InternalSmallUml.g:575:2: ( rule__Package__RelationAssignment_2_0 )
            // InternalSmallUml.g:575:3: rule__Package__RelationAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__RelationAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getRelationAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__0__Impl"


    // $ANTLR start "rule__Package__Group_2__1"
    // InternalSmallUml.g:583:1: rule__Package__Group_2__1 : rule__Package__Group_2__1__Impl ;
    public final void rule__Package__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:587:1: ( rule__Package__Group_2__1__Impl )
            // InternalSmallUml.g:588:2: rule__Package__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__1"


    // $ANTLR start "rule__Package__Group_2__1__Impl"
    // InternalSmallUml.g:594:1: rule__Package__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Package__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:598:1: ( ( ';' ) )
            // InternalSmallUml.g:599:1: ( ';' )
            {
            // InternalSmallUml.g:599:1: ( ';' )
            // InternalSmallUml.g:600:2: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_2_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__1__Impl"


    // $ANTLR start "rule__Package__Group_3__0"
    // InternalSmallUml.g:610:1: rule__Package__Group_3__0 : rule__Package__Group_3__0__Impl rule__Package__Group_3__1 ;
    public final void rule__Package__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:614:1: ( rule__Package__Group_3__0__Impl rule__Package__Group_3__1 )
            // InternalSmallUml.g:615:2: rule__Package__Group_3__0__Impl rule__Package__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__0"


    // $ANTLR start "rule__Package__Group_3__0__Impl"
    // InternalSmallUml.g:622:1: rule__Package__Group_3__0__Impl : ( ( rule__Package__TypesAssignment_3_0 ) ) ;
    public final void rule__Package__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:626:1: ( ( ( rule__Package__TypesAssignment_3_0 ) ) )
            // InternalSmallUml.g:627:1: ( ( rule__Package__TypesAssignment_3_0 ) )
            {
            // InternalSmallUml.g:627:1: ( ( rule__Package__TypesAssignment_3_0 ) )
            // InternalSmallUml.g:628:2: ( rule__Package__TypesAssignment_3_0 )
            {
             before(grammarAccess.getPackageAccess().getTypesAssignment_3_0()); 
            // InternalSmallUml.g:629:2: ( rule__Package__TypesAssignment_3_0 )
            // InternalSmallUml.g:629:3: rule__Package__TypesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__TypesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTypesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__0__Impl"


    // $ANTLR start "rule__Package__Group_3__1"
    // InternalSmallUml.g:637:1: rule__Package__Group_3__1 : rule__Package__Group_3__1__Impl ;
    public final void rule__Package__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:641:1: ( rule__Package__Group_3__1__Impl )
            // InternalSmallUml.g:642:2: rule__Package__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__1"


    // $ANTLR start "rule__Package__Group_3__1__Impl"
    // InternalSmallUml.g:648:1: rule__Package__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Package__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:652:1: ( ( ';' ) )
            // InternalSmallUml.g:653:1: ( ';' )
            {
            // InternalSmallUml.g:653:1: ( ';' )
            // InternalSmallUml.g:654:2: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_3_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalSmallUml.g:664:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:668:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalSmallUml.g:669:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalSmallUml.g:676:1: rule__Class__Group__0__Impl : ( ( rule__Class__IsAbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:680:1: ( ( ( rule__Class__IsAbstractAssignment_0 )? ) )
            // InternalSmallUml.g:681:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            {
            // InternalSmallUml.g:681:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            // InternalSmallUml.g:682:2: ( rule__Class__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 
            // InternalSmallUml.g:683:2: ( rule__Class__IsAbstractAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUml.g:683:3: rule__Class__IsAbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__IsAbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalSmallUml.g:691:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:695:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalSmallUml.g:696:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalSmallUml.g:703:1: rule__Class__Group__1__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:707:1: ( ( 'Class' ) )
            // InternalSmallUml.g:708:1: ( 'Class' )
            {
            // InternalSmallUml.g:708:1: ( 'Class' )
            // InternalSmallUml.g:709:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalSmallUml.g:718:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:722:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalSmallUml.g:723:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalSmallUml.g:730:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:734:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalSmallUml.g:735:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalSmallUml.g:735:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalSmallUml.g:736:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalSmallUml.g:737:2: ( rule__Class__NameAssignment_2 )
            // InternalSmallUml.g:737:3: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalSmallUml.g:745:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:749:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalSmallUml.g:750:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalSmallUml.g:757:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:761:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalSmallUml.g:762:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalSmallUml.g:762:1: ( ( rule__Class__Group_3__0 )? )
            // InternalSmallUml.g:763:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalSmallUml.g:764:2: ( rule__Class__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUml.g:764:3: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalSmallUml.g:772:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:776:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalSmallUml.g:777:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalSmallUml.g:784:1: rule__Class__Group__4__Impl : ( '{' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:788:1: ( ( '{' ) )
            // InternalSmallUml.g:789:1: ( '{' )
            {
            // InternalSmallUml.g:789:1: ( '{' )
            // InternalSmallUml.g:790:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalSmallUml.g:799:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:803:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalSmallUml.g:804:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalSmallUml.g:811:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:815:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalSmallUml.g:816:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalSmallUml.g:816:1: ( ( rule__Class__Group_5__0 )? )
            // InternalSmallUml.g:817:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalSmallUml.g:818:2: ( rule__Class__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUml.g:818:3: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalSmallUml.g:826:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:830:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalSmallUml.g:831:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalSmallUml.g:838:1: rule__Class__Group__6__Impl : ( ( rule__Class__Group_6__0 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:842:1: ( ( ( rule__Class__Group_6__0 )? ) )
            // InternalSmallUml.g:843:1: ( ( rule__Class__Group_6__0 )? )
            {
            // InternalSmallUml.g:843:1: ( ( rule__Class__Group_6__0 )? )
            // InternalSmallUml.g:844:2: ( rule__Class__Group_6__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_6()); 
            // InternalSmallUml.g:845:2: ( rule__Class__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUml.g:845:3: rule__Class__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalSmallUml.g:853:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:857:1: ( rule__Class__Group__7__Impl )
            // InternalSmallUml.g:858:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalSmallUml.g:864:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:868:1: ( ( '}' ) )
            // InternalSmallUml.g:869:1: ( '}' )
            {
            // InternalSmallUml.g:869:1: ( '}' )
            // InternalSmallUml.g:870:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalSmallUml.g:880:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:884:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalSmallUml.g:885:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // InternalSmallUml.g:892:1: rule__Class__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:896:1: ( ( 'extends' ) )
            // InternalSmallUml.g:897:1: ( 'extends' )
            {
            // InternalSmallUml.g:897:1: ( 'extends' )
            // InternalSmallUml.g:898:2: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // InternalSmallUml.g:907:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:911:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // InternalSmallUml.g:912:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // InternalSmallUml.g:919:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__ParentsAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:923:1: ( ( ( rule__Class__ParentsAssignment_3_1 ) ) )
            // InternalSmallUml.g:924:1: ( ( rule__Class__ParentsAssignment_3_1 ) )
            {
            // InternalSmallUml.g:924:1: ( ( rule__Class__ParentsAssignment_3_1 ) )
            // InternalSmallUml.g:925:2: ( rule__Class__ParentsAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getParentsAssignment_3_1()); 
            // InternalSmallUml.g:926:2: ( rule__Class__ParentsAssignment_3_1 )
            // InternalSmallUml.g:926:3: rule__Class__ParentsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ParentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getParentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_3__2"
    // InternalSmallUml.g:934:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:938:1: ( rule__Class__Group_3__2__Impl )
            // InternalSmallUml.g:939:2: rule__Class__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__2"


    // $ANTLR start "rule__Class__Group_3__2__Impl"
    // InternalSmallUml.g:945:1: rule__Class__Group_3__2__Impl : ( ( rule__Class__Group_3_2__0 )* ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:949:1: ( ( ( rule__Class__Group_3_2__0 )* ) )
            // InternalSmallUml.g:950:1: ( ( rule__Class__Group_3_2__0 )* )
            {
            // InternalSmallUml.g:950:1: ( ( rule__Class__Group_3_2__0 )* )
            // InternalSmallUml.g:951:2: ( rule__Class__Group_3_2__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_3_2()); 
            // InternalSmallUml.g:952:2: ( rule__Class__Group_3_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmallUml.g:952:3: rule__Class__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Class__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__2__Impl"


    // $ANTLR start "rule__Class__Group_3_2__0"
    // InternalSmallUml.g:961:1: rule__Class__Group_3_2__0 : rule__Class__Group_3_2__0__Impl rule__Class__Group_3_2__1 ;
    public final void rule__Class__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:965:1: ( rule__Class__Group_3_2__0__Impl rule__Class__Group_3_2__1 )
            // InternalSmallUml.g:966:2: rule__Class__Group_3_2__0__Impl rule__Class__Group_3_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_2__0"


    // $ANTLR start "rule__Class__Group_3_2__0__Impl"
    // InternalSmallUml.g:973:1: rule__Class__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:977:1: ( ( ',' ) )
            // InternalSmallUml.g:978:1: ( ',' )
            {
            // InternalSmallUml.g:978:1: ( ',' )
            // InternalSmallUml.g:979:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_3_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_2__0__Impl"


    // $ANTLR start "rule__Class__Group_3_2__1"
    // InternalSmallUml.g:988:1: rule__Class__Group_3_2__1 : rule__Class__Group_3_2__1__Impl ;
    public final void rule__Class__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:992:1: ( rule__Class__Group_3_2__1__Impl )
            // InternalSmallUml.g:993:2: rule__Class__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_2__1"


    // $ANTLR start "rule__Class__Group_3_2__1__Impl"
    // InternalSmallUml.g:999:1: rule__Class__Group_3_2__1__Impl : ( ( rule__Class__ParentsAssignment_3_2_1 ) ) ;
    public final void rule__Class__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1003:1: ( ( ( rule__Class__ParentsAssignment_3_2_1 ) ) )
            // InternalSmallUml.g:1004:1: ( ( rule__Class__ParentsAssignment_3_2_1 ) )
            {
            // InternalSmallUml.g:1004:1: ( ( rule__Class__ParentsAssignment_3_2_1 ) )
            // InternalSmallUml.g:1005:2: ( rule__Class__ParentsAssignment_3_2_1 )
            {
             before(grammarAccess.getClassAccess().getParentsAssignment_3_2_1()); 
            // InternalSmallUml.g:1006:2: ( rule__Class__ParentsAssignment_3_2_1 )
            // InternalSmallUml.g:1006:3: rule__Class__ParentsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ParentsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getParentsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_2__1__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalSmallUml.g:1015:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1019:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalSmallUml.g:1020:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // InternalSmallUml.g:1027:1: rule__Class__Group_5__0__Impl : ( 'attributes' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1031:1: ( ( 'attributes' ) )
            // InternalSmallUml.g:1032:1: ( 'attributes' )
            {
            // InternalSmallUml.g:1032:1: ( 'attributes' )
            // InternalSmallUml.g:1033:2: 'attributes'
            {
             before(grammarAccess.getClassAccess().getAttributesKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAttributesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // InternalSmallUml.g:1042:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1046:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalSmallUml.g:1047:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // InternalSmallUml.g:1054:1: rule__Class__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1058:1: ( ( '{' ) )
            // InternalSmallUml.g:1059:1: ( '{' )
            {
            // InternalSmallUml.g:1059:1: ( '{' )
            // InternalSmallUml.g:1060:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_5__2"
    // InternalSmallUml.g:1069:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl rule__Class__Group_5__3 ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1073:1: ( rule__Class__Group_5__2__Impl rule__Class__Group_5__3 )
            // InternalSmallUml.g:1074:2: rule__Class__Group_5__2__Impl rule__Class__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2"


    // $ANTLR start "rule__Class__Group_5__2__Impl"
    // InternalSmallUml.g:1081:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__AttributesAssignment_5_2 ) ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1085:1: ( ( ( rule__Class__AttributesAssignment_5_2 ) ) )
            // InternalSmallUml.g:1086:1: ( ( rule__Class__AttributesAssignment_5_2 ) )
            {
            // InternalSmallUml.g:1086:1: ( ( rule__Class__AttributesAssignment_5_2 ) )
            // InternalSmallUml.g:1087:2: ( rule__Class__AttributesAssignment_5_2 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_5_2()); 
            // InternalSmallUml.g:1088:2: ( rule__Class__AttributesAssignment_5_2 )
            // InternalSmallUml.g:1088:3: rule__Class__AttributesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2__Impl"


    // $ANTLR start "rule__Class__Group_5__3"
    // InternalSmallUml.g:1096:1: rule__Class__Group_5__3 : rule__Class__Group_5__3__Impl rule__Class__Group_5__4 ;
    public final void rule__Class__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1100:1: ( rule__Class__Group_5__3__Impl rule__Class__Group_5__4 )
            // InternalSmallUml.g:1101:2: rule__Class__Group_5__3__Impl rule__Class__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__3"


    // $ANTLR start "rule__Class__Group_5__3__Impl"
    // InternalSmallUml.g:1108:1: rule__Class__Group_5__3__Impl : ( ( rule__Class__AttributesAssignment_5_3 )* ) ;
    public final void rule__Class__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1112:1: ( ( ( rule__Class__AttributesAssignment_5_3 )* ) )
            // InternalSmallUml.g:1113:1: ( ( rule__Class__AttributesAssignment_5_3 )* )
            {
            // InternalSmallUml.g:1113:1: ( ( rule__Class__AttributesAssignment_5_3 )* )
            // InternalSmallUml.g:1114:2: ( rule__Class__AttributesAssignment_5_3 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_5_3()); 
            // InternalSmallUml.g:1115:2: ( rule__Class__AttributesAssignment_5_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmallUml.g:1115:3: rule__Class__AttributesAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Class__AttributesAssignment_5_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAttributesAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__3__Impl"


    // $ANTLR start "rule__Class__Group_5__4"
    // InternalSmallUml.g:1123:1: rule__Class__Group_5__4 : rule__Class__Group_5__4__Impl ;
    public final void rule__Class__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1127:1: ( rule__Class__Group_5__4__Impl )
            // InternalSmallUml.g:1128:2: rule__Class__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__4"


    // $ANTLR start "rule__Class__Group_5__4__Impl"
    // InternalSmallUml.g:1134:1: rule__Class__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1138:1: ( ( '}' ) )
            // InternalSmallUml.g:1139:1: ( '}' )
            {
            // InternalSmallUml.g:1139:1: ( '}' )
            // InternalSmallUml.g:1140:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__4__Impl"


    // $ANTLR start "rule__Class__Group_6__0"
    // InternalSmallUml.g:1150:1: rule__Class__Group_6__0 : rule__Class__Group_6__0__Impl rule__Class__Group_6__1 ;
    public final void rule__Class__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1154:1: ( rule__Class__Group_6__0__Impl rule__Class__Group_6__1 )
            // InternalSmallUml.g:1155:2: rule__Class__Group_6__0__Impl rule__Class__Group_6__1
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0"


    // $ANTLR start "rule__Class__Group_6__0__Impl"
    // InternalSmallUml.g:1162:1: rule__Class__Group_6__0__Impl : ( 'methods' ) ;
    public final void rule__Class__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1166:1: ( ( 'methods' ) )
            // InternalSmallUml.g:1167:1: ( 'methods' )
            {
            // InternalSmallUml.g:1167:1: ( 'methods' )
            // InternalSmallUml.g:1168:2: 'methods'
            {
             before(grammarAccess.getClassAccess().getMethodsKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getMethodsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0__Impl"


    // $ANTLR start "rule__Class__Group_6__1"
    // InternalSmallUml.g:1177:1: rule__Class__Group_6__1 : rule__Class__Group_6__1__Impl rule__Class__Group_6__2 ;
    public final void rule__Class__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1181:1: ( rule__Class__Group_6__1__Impl rule__Class__Group_6__2 )
            // InternalSmallUml.g:1182:2: rule__Class__Group_6__1__Impl rule__Class__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1"


    // $ANTLR start "rule__Class__Group_6__1__Impl"
    // InternalSmallUml.g:1189:1: rule__Class__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1193:1: ( ( '{' ) )
            // InternalSmallUml.g:1194:1: ( '{' )
            {
            // InternalSmallUml.g:1194:1: ( '{' )
            // InternalSmallUml.g:1195:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1__Impl"


    // $ANTLR start "rule__Class__Group_6__2"
    // InternalSmallUml.g:1204:1: rule__Class__Group_6__2 : rule__Class__Group_6__2__Impl rule__Class__Group_6__3 ;
    public final void rule__Class__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1208:1: ( rule__Class__Group_6__2__Impl rule__Class__Group_6__3 )
            // InternalSmallUml.g:1209:2: rule__Class__Group_6__2__Impl rule__Class__Group_6__3
            {
            pushFollow(FOLLOW_18);
            rule__Class__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2"


    // $ANTLR start "rule__Class__Group_6__2__Impl"
    // InternalSmallUml.g:1216:1: rule__Class__Group_6__2__Impl : ( ( rule__Class__MethodsAssignment_6_2 ) ) ;
    public final void rule__Class__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1220:1: ( ( ( rule__Class__MethodsAssignment_6_2 ) ) )
            // InternalSmallUml.g:1221:1: ( ( rule__Class__MethodsAssignment_6_2 ) )
            {
            // InternalSmallUml.g:1221:1: ( ( rule__Class__MethodsAssignment_6_2 ) )
            // InternalSmallUml.g:1222:2: ( rule__Class__MethodsAssignment_6_2 )
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_6_2()); 
            // InternalSmallUml.g:1223:2: ( rule__Class__MethodsAssignment_6_2 )
            // InternalSmallUml.g:1223:3: rule__Class__MethodsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__MethodsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getMethodsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2__Impl"


    // $ANTLR start "rule__Class__Group_6__3"
    // InternalSmallUml.g:1231:1: rule__Class__Group_6__3 : rule__Class__Group_6__3__Impl rule__Class__Group_6__4 ;
    public final void rule__Class__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1235:1: ( rule__Class__Group_6__3__Impl rule__Class__Group_6__4 )
            // InternalSmallUml.g:1236:2: rule__Class__Group_6__3__Impl rule__Class__Group_6__4
            {
            pushFollow(FOLLOW_18);
            rule__Class__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3"


    // $ANTLR start "rule__Class__Group_6__3__Impl"
    // InternalSmallUml.g:1243:1: rule__Class__Group_6__3__Impl : ( ( rule__Class__MethodsAssignment_6_3 )* ) ;
    public final void rule__Class__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1247:1: ( ( ( rule__Class__MethodsAssignment_6_3 )* ) )
            // InternalSmallUml.g:1248:1: ( ( rule__Class__MethodsAssignment_6_3 )* )
            {
            // InternalSmallUml.g:1248:1: ( ( rule__Class__MethodsAssignment_6_3 )* )
            // InternalSmallUml.g:1249:2: ( rule__Class__MethodsAssignment_6_3 )*
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_6_3()); 
            // InternalSmallUml.g:1250:2: ( rule__Class__MethodsAssignment_6_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmallUml.g:1250:3: rule__Class__MethodsAssignment_6_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Class__MethodsAssignment_6_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMethodsAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3__Impl"


    // $ANTLR start "rule__Class__Group_6__4"
    // InternalSmallUml.g:1258:1: rule__Class__Group_6__4 : rule__Class__Group_6__4__Impl ;
    public final void rule__Class__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1262:1: ( rule__Class__Group_6__4__Impl )
            // InternalSmallUml.g:1263:2: rule__Class__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4"


    // $ANTLR start "rule__Class__Group_6__4__Impl"
    // InternalSmallUml.g:1269:1: rule__Class__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1273:1: ( ( '}' ) )
            // InternalSmallUml.g:1274:1: ( '}' )
            {
            // InternalSmallUml.g:1274:1: ( '}' )
            // InternalSmallUml.g:1275:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalSmallUml.g:1285:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1289:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalSmallUml.g:1290:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalSmallUml.g:1297:1: rule__Relation__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1301:1: ( ( 'Relation' ) )
            // InternalSmallUml.g:1302:1: ( 'Relation' )
            {
            // InternalSmallUml.g:1302:1: ( 'Relation' )
            // InternalSmallUml.g:1303:2: 'Relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalSmallUml.g:1312:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1316:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalSmallUml.g:1317:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalSmallUml.g:1324:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1328:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalSmallUml.g:1329:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalSmallUml.g:1329:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalSmallUml.g:1330:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalSmallUml.g:1331:2: ( rule__Relation__NameAssignment_1 )
            // InternalSmallUml.g:1331:3: rule__Relation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalSmallUml.g:1339:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1343:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalSmallUml.g:1344:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalSmallUml.g:1351:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1355:1: ( ( '{' ) )
            // InternalSmallUml.g:1356:1: ( '{' )
            {
            // InternalSmallUml.g:1356:1: ( '{' )
            // InternalSmallUml.g:1357:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalSmallUml.g:1366:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1370:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalSmallUml.g:1371:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalSmallUml.g:1378:1: rule__Relation__Group__3__Impl : ( 'from' ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1382:1: ( ( 'from' ) )
            // InternalSmallUml.g:1383:1: ( 'from' )
            {
            // InternalSmallUml.g:1383:1: ( 'from' )
            // InternalSmallUml.g:1384:2: 'from'
            {
             before(grammarAccess.getRelationAccess().getFromKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalSmallUml.g:1393:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1397:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalSmallUml.g:1398:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalSmallUml.g:1405:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__FromAssignment_4 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1409:1: ( ( ( rule__Relation__FromAssignment_4 ) ) )
            // InternalSmallUml.g:1410:1: ( ( rule__Relation__FromAssignment_4 ) )
            {
            // InternalSmallUml.g:1410:1: ( ( rule__Relation__FromAssignment_4 ) )
            // InternalSmallUml.g:1411:2: ( rule__Relation__FromAssignment_4 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_4()); 
            // InternalSmallUml.g:1412:2: ( rule__Relation__FromAssignment_4 )
            // InternalSmallUml.g:1412:3: rule__Relation__FromAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Relation__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalSmallUml.g:1420:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1424:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalSmallUml.g:1425:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalSmallUml.g:1432:1: rule__Relation__Group__5__Impl : ( 'to' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1436:1: ( ( 'to' ) )
            // InternalSmallUml.g:1437:1: ( 'to' )
            {
            // InternalSmallUml.g:1437:1: ( 'to' )
            // InternalSmallUml.g:1438:2: 'to'
            {
             before(grammarAccess.getRelationAccess().getToKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__6"
    // InternalSmallUml.g:1447:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1451:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // InternalSmallUml.g:1452:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6"


    // $ANTLR start "rule__Relation__Group__6__Impl"
    // InternalSmallUml.g:1459:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__ToAssignment_6 ) ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1463:1: ( ( ( rule__Relation__ToAssignment_6 ) ) )
            // InternalSmallUml.g:1464:1: ( ( rule__Relation__ToAssignment_6 ) )
            {
            // InternalSmallUml.g:1464:1: ( ( rule__Relation__ToAssignment_6 ) )
            // InternalSmallUml.g:1465:2: ( rule__Relation__ToAssignment_6 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_6()); 
            // InternalSmallUml.g:1466:2: ( rule__Relation__ToAssignment_6 )
            // InternalSmallUml.g:1466:3: rule__Relation__ToAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ToAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group__7"
    // InternalSmallUml.g:1474:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1478:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // InternalSmallUml.g:1479:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7"


    // $ANTLR start "rule__Relation__Group__7__Impl"
    // InternalSmallUml.g:1486:1: rule__Relation__Group__7__Impl : ( 'cardinality' ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1490:1: ( ( 'cardinality' ) )
            // InternalSmallUml.g:1491:1: ( 'cardinality' )
            {
            // InternalSmallUml.g:1491:1: ( 'cardinality' )
            // InternalSmallUml.g:1492:2: 'cardinality'
            {
             before(grammarAccess.getRelationAccess().getCardinalityKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getCardinalityKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7__Impl"


    // $ANTLR start "rule__Relation__Group__8"
    // InternalSmallUml.g:1501:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl rule__Relation__Group__9 ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1505:1: ( rule__Relation__Group__8__Impl rule__Relation__Group__9 )
            // InternalSmallUml.g:1506:2: rule__Relation__Group__8__Impl rule__Relation__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Relation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8"


    // $ANTLR start "rule__Relation__Group__8__Impl"
    // InternalSmallUml.g:1513:1: rule__Relation__Group__8__Impl : ( ( rule__Relation__CardinalityAssignment_8 ) ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1517:1: ( ( ( rule__Relation__CardinalityAssignment_8 ) ) )
            // InternalSmallUml.g:1518:1: ( ( rule__Relation__CardinalityAssignment_8 ) )
            {
            // InternalSmallUml.g:1518:1: ( ( rule__Relation__CardinalityAssignment_8 ) )
            // InternalSmallUml.g:1519:2: ( rule__Relation__CardinalityAssignment_8 )
            {
             before(grammarAccess.getRelationAccess().getCardinalityAssignment_8()); 
            // InternalSmallUml.g:1520:2: ( rule__Relation__CardinalityAssignment_8 )
            // InternalSmallUml.g:1520:3: rule__Relation__CardinalityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Relation__CardinalityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getCardinalityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8__Impl"


    // $ANTLR start "rule__Relation__Group__9"
    // InternalSmallUml.g:1528:1: rule__Relation__Group__9 : rule__Relation__Group__9__Impl ;
    public final void rule__Relation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1532:1: ( rule__Relation__Group__9__Impl )
            // InternalSmallUml.g:1533:2: rule__Relation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__9"


    // $ANTLR start "rule__Relation__Group__9__Impl"
    // InternalSmallUml.g:1539:1: rule__Relation__Group__9__Impl : ( '}' ) ;
    public final void rule__Relation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1543:1: ( ( '}' ) )
            // InternalSmallUml.g:1544:1: ( '}' )
            {
            // InternalSmallUml.g:1544:1: ( '}' )
            // InternalSmallUml.g:1545:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__9__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSmallUml.g:1555:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1559:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSmallUml.g:1560:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalSmallUml.g:1567:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1571:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalSmallUml.g:1572:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalSmallUml.g:1572:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalSmallUml.g:1573:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalSmallUml.g:1574:2: ( rule__Attribute__NameAssignment_0 )
            // InternalSmallUml.g:1574:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalSmallUml.g:1582:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1586:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSmallUml.g:1587:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalSmallUml.g:1594:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1598:1: ( ( ':' ) )
            // InternalSmallUml.g:1599:1: ( ':' )
            {
            // InternalSmallUml.g:1599:1: ( ':' )
            // InternalSmallUml.g:1600:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalSmallUml.g:1609:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1613:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSmallUml.g:1614:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalSmallUml.g:1621:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypedValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1625:1: ( ( ( rule__Attribute__TypedValueAssignment_2 ) ) )
            // InternalSmallUml.g:1626:1: ( ( rule__Attribute__TypedValueAssignment_2 ) )
            {
            // InternalSmallUml.g:1626:1: ( ( rule__Attribute__TypedValueAssignment_2 ) )
            // InternalSmallUml.g:1627:2: ( rule__Attribute__TypedValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypedValueAssignment_2()); 
            // InternalSmallUml.g:1628:2: ( rule__Attribute__TypedValueAssignment_2 )
            // InternalSmallUml.g:1628:3: rule__Attribute__TypedValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypedValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypedValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalSmallUml.g:1636:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1640:1: ( rule__Attribute__Group__3__Impl )
            // InternalSmallUml.g:1641:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalSmallUml.g:1647:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1651:1: ( ( ';' ) )
            // InternalSmallUml.g:1652:1: ( ';' )
            {
            // InternalSmallUml.g:1652:1: ( ';' )
            // InternalSmallUml.g:1653:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalSmallUml.g:1663:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1667:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalSmallUml.g:1668:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalSmallUml.g:1675:1: rule__Method__Group__0__Impl : ( () ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1679:1: ( ( () ) )
            // InternalSmallUml.g:1680:1: ( () )
            {
            // InternalSmallUml.g:1680:1: ( () )
            // InternalSmallUml.g:1681:2: ()
            {
             before(grammarAccess.getMethodAccess().getMethodAction_0()); 
            // InternalSmallUml.g:1682:2: ()
            // InternalSmallUml.g:1682:3: 
            {
            }

             after(grammarAccess.getMethodAccess().getMethodAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalSmallUml.g:1690:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1694:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalSmallUml.g:1695:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalSmallUml.g:1702:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1706:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalSmallUml.g:1707:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalSmallUml.g:1707:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalSmallUml.g:1708:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalSmallUml.g:1709:2: ( rule__Method__NameAssignment_1 )
            // InternalSmallUml.g:1709:3: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalSmallUml.g:1717:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1721:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalSmallUml.g:1722:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalSmallUml.g:1729:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1733:1: ( ( '(' ) )
            // InternalSmallUml.g:1734:1: ( '(' )
            {
            // InternalSmallUml.g:1734:1: ( '(' )
            // InternalSmallUml.g:1735:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalSmallUml.g:1744:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1748:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalSmallUml.g:1749:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalSmallUml.g:1756:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1760:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalSmallUml.g:1761:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalSmallUml.g:1761:1: ( ( rule__Method__Group_3__0 )? )
            // InternalSmallUml.g:1762:2: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // InternalSmallUml.g:1763:2: ( rule__Method__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUml.g:1763:3: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalSmallUml.g:1771:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1775:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalSmallUml.g:1776:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalSmallUml.g:1783:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1787:1: ( ( ')' ) )
            // InternalSmallUml.g:1788:1: ( ')' )
            {
            // InternalSmallUml.g:1788:1: ( ')' )
            // InternalSmallUml.g:1789:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalSmallUml.g:1798:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1802:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalSmallUml.g:1803:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalSmallUml.g:1810:1: rule__Method__Group__5__Impl : ( ':' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1814:1: ( ( ':' ) )
            // InternalSmallUml.g:1815:1: ( ':' )
            {
            // InternalSmallUml.g:1815:1: ( ':' )
            // InternalSmallUml.g:1816:2: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalSmallUml.g:1825:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1829:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalSmallUml.g:1830:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Method__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalSmallUml.g:1837:1: rule__Method__Group__6__Impl : ( ( rule__Method__ReturnTypedValueAssignment_6 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1841:1: ( ( ( rule__Method__ReturnTypedValueAssignment_6 )? ) )
            // InternalSmallUml.g:1842:1: ( ( rule__Method__ReturnTypedValueAssignment_6 )? )
            {
            // InternalSmallUml.g:1842:1: ( ( rule__Method__ReturnTypedValueAssignment_6 )? )
            // InternalSmallUml.g:1843:2: ( rule__Method__ReturnTypedValueAssignment_6 )?
            {
             before(grammarAccess.getMethodAccess().getReturnTypedValueAssignment_6()); 
            // InternalSmallUml.g:1844:2: ( rule__Method__ReturnTypedValueAssignment_6 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUml.g:1844:3: rule__Method__ReturnTypedValueAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__ReturnTypedValueAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getReturnTypedValueAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // InternalSmallUml.g:1852:1: rule__Method__Group__7 : rule__Method__Group__7__Impl ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1856:1: ( rule__Method__Group__7__Impl )
            // InternalSmallUml.g:1857:2: rule__Method__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // InternalSmallUml.g:1863:1: rule__Method__Group__7__Impl : ( ';' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1867:1: ( ( ';' ) )
            // InternalSmallUml.g:1868:1: ( ';' )
            {
            // InternalSmallUml.g:1868:1: ( ';' )
            // InternalSmallUml.g:1869:2: ';'
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // InternalSmallUml.g:1879:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1883:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalSmallUml.g:1884:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // InternalSmallUml.g:1891:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ParametersAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1895:1: ( ( ( rule__Method__ParametersAssignment_3_0 ) ) )
            // InternalSmallUml.g:1896:1: ( ( rule__Method__ParametersAssignment_3_0 ) )
            {
            // InternalSmallUml.g:1896:1: ( ( rule__Method__ParametersAssignment_3_0 ) )
            // InternalSmallUml.g:1897:2: ( rule__Method__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3_0()); 
            // InternalSmallUml.g:1898:2: ( rule__Method__ParametersAssignment_3_0 )
            // InternalSmallUml.g:1898:3: rule__Method__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // InternalSmallUml.g:1906:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1910:1: ( rule__Method__Group_3__1__Impl )
            // InternalSmallUml.g:1911:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // InternalSmallUml.g:1917:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1921:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalSmallUml.g:1922:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalSmallUml.g:1922:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalSmallUml.g:1923:2: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // InternalSmallUml.g:1924:2: ( rule__Method__Group_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmallUml.g:1924:3: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__Method__Group_3_1__0"
    // InternalSmallUml.g:1933:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1937:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalSmallUml.g:1938:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__0"


    // $ANTLR start "rule__Method__Group_3_1__0__Impl"
    // InternalSmallUml.g:1945:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1949:1: ( ( ',' ) )
            // InternalSmallUml.g:1950:1: ( ',' )
            {
            // InternalSmallUml.g:1950:1: ( ',' )
            // InternalSmallUml.g:1951:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__0__Impl"


    // $ANTLR start "rule__Method__Group_3_1__1"
    // InternalSmallUml.g:1960:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1964:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalSmallUml.g:1965:2: rule__Method__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__1"


    // $ANTLR start "rule__Method__Group_3_1__1__Impl"
    // InternalSmallUml.g:1971:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1975:1: ( ( ( rule__Method__ParametersAssignment_3_1_1 ) ) )
            // InternalSmallUml.g:1976:1: ( ( rule__Method__ParametersAssignment_3_1_1 ) )
            {
            // InternalSmallUml.g:1976:1: ( ( rule__Method__ParametersAssignment_3_1_1 ) )
            // InternalSmallUml.g:1977:2: ( rule__Method__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3_1_1()); 
            // InternalSmallUml.g:1978:2: ( rule__Method__ParametersAssignment_3_1_1 )
            // InternalSmallUml.g:1978:3: rule__Method__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalSmallUml.g:1987:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1991:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalSmallUml.g:1992:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // InternalSmallUml.g:1999:1: rule__Cardinality__Group__0__Impl : ( '[' ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2003:1: ( ( '[' ) )
            // InternalSmallUml.g:2004:1: ( '[' )
            {
            // InternalSmallUml.g:2004:1: ( '[' )
            // InternalSmallUml.g:2005:2: '['
            {
             before(grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // InternalSmallUml.g:2014:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2018:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // InternalSmallUml.g:2019:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // InternalSmallUml.g:2026:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__LowerBoundAssignment_1 ) ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2030:1: ( ( ( rule__Cardinality__LowerBoundAssignment_1 ) ) )
            // InternalSmallUml.g:2031:1: ( ( rule__Cardinality__LowerBoundAssignment_1 ) )
            {
            // InternalSmallUml.g:2031:1: ( ( rule__Cardinality__LowerBoundAssignment_1 ) )
            // InternalSmallUml.g:2032:2: ( rule__Cardinality__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_1()); 
            // InternalSmallUml.g:2033:2: ( rule__Cardinality__LowerBoundAssignment_1 )
            // InternalSmallUml.g:2033:3: rule__Cardinality__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__2"
    // InternalSmallUml.g:2041:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2045:1: ( rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 )
            // InternalSmallUml.g:2046:2: rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Cardinality__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2"


    // $ANTLR start "rule__Cardinality__Group__2__Impl"
    // InternalSmallUml.g:2053:1: rule__Cardinality__Group__2__Impl : ( ',' ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2057:1: ( ( ',' ) )
            // InternalSmallUml.g:2058:1: ( ',' )
            {
            // InternalSmallUml.g:2058:1: ( ',' )
            // InternalSmallUml.g:2059:2: ','
            {
             before(grammarAccess.getCardinalityAccess().getCommaKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2__Impl"


    // $ANTLR start "rule__Cardinality__Group__3"
    // InternalSmallUml.g:2068:1: rule__Cardinality__Group__3 : rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 ;
    public final void rule__Cardinality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2072:1: ( rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 )
            // InternalSmallUml.g:2073:2: rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Cardinality__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__3"


    // $ANTLR start "rule__Cardinality__Group__3__Impl"
    // InternalSmallUml.g:2080:1: rule__Cardinality__Group__3__Impl : ( ( rule__Cardinality__UpperBoundAssignment_3 ) ) ;
    public final void rule__Cardinality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2084:1: ( ( ( rule__Cardinality__UpperBoundAssignment_3 ) ) )
            // InternalSmallUml.g:2085:1: ( ( rule__Cardinality__UpperBoundAssignment_3 ) )
            {
            // InternalSmallUml.g:2085:1: ( ( rule__Cardinality__UpperBoundAssignment_3 ) )
            // InternalSmallUml.g:2086:2: ( rule__Cardinality__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_3()); 
            // InternalSmallUml.g:2087:2: ( rule__Cardinality__UpperBoundAssignment_3 )
            // InternalSmallUml.g:2087:3: rule__Cardinality__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__UpperBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__3__Impl"


    // $ANTLR start "rule__Cardinality__Group__4"
    // InternalSmallUml.g:2095:1: rule__Cardinality__Group__4 : rule__Cardinality__Group__4__Impl ;
    public final void rule__Cardinality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2099:1: ( rule__Cardinality__Group__4__Impl )
            // InternalSmallUml.g:2100:2: rule__Cardinality__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__4"


    // $ANTLR start "rule__Cardinality__Group__4__Impl"
    // InternalSmallUml.g:2106:1: rule__Cardinality__Group__4__Impl : ( ']' ) ;
    public final void rule__Cardinality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2110:1: ( ( ']' ) )
            // InternalSmallUml.g:2111:1: ( ']' )
            {
            // InternalSmallUml.g:2111:1: ( ']' )
            // InternalSmallUml.g:2112:2: ']'
            {
             before(grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSmallUml.g:2122:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2126:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSmallUml.g:2127:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
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
    // InternalSmallUml.g:2134:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2138:1: ( ( ( '-' )? ) )
            // InternalSmallUml.g:2139:1: ( ( '-' )? )
            {
            // InternalSmallUml.g:2139:1: ( ( '-' )? )
            // InternalSmallUml.g:2140:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSmallUml.g:2141:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUml.g:2141:3: '-'
                    {
                    match(input,28,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
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
    // InternalSmallUml.g:2149:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2153:1: ( rule__EInt__Group__1__Impl )
            // InternalSmallUml.g:2154:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSmallUml.g:2160:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2164:1: ( ( RULE_INT ) )
            // InternalSmallUml.g:2165:1: ( RULE_INT )
            {
            // InternalSmallUml.g:2165:1: ( RULE_INT )
            // InternalSmallUml.g:2166:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalSmallUml.g:2176:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2180:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSmallUml.g:2181:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalSmallUml.g:2188:1: rule__Enumeration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2192:1: ( ( 'Enumeration' ) )
            // InternalSmallUml.g:2193:1: ( 'Enumeration' )
            {
            // InternalSmallUml.g:2193:1: ( 'Enumeration' )
            // InternalSmallUml.g:2194:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalSmallUml.g:2203:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2207:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSmallUml.g:2208:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalSmallUml.g:2215:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2219:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalSmallUml.g:2220:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalSmallUml.g:2220:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalSmallUml.g:2221:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalSmallUml.g:2222:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalSmallUml.g:2222:3: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalSmallUml.g:2230:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2234:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSmallUml.g:2235:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalSmallUml.g:2242:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2246:1: ( ( '{' ) )
            // InternalSmallUml.g:2247:1: ( '{' )
            {
            // InternalSmallUml.g:2247:1: ( '{' )
            // InternalSmallUml.g:2248:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalSmallUml.g:2257:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2261:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSmallUml.g:2262:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalSmallUml.g:2269:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__ValueAssignment_3 ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2273:1: ( ( ( rule__Enumeration__ValueAssignment_3 ) ) )
            // InternalSmallUml.g:2274:1: ( ( rule__Enumeration__ValueAssignment_3 ) )
            {
            // InternalSmallUml.g:2274:1: ( ( rule__Enumeration__ValueAssignment_3 ) )
            // InternalSmallUml.g:2275:2: ( rule__Enumeration__ValueAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_3()); 
            // InternalSmallUml.g:2276:2: ( rule__Enumeration__ValueAssignment_3 )
            // InternalSmallUml.g:2276:3: rule__Enumeration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalSmallUml.g:2284:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2288:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSmallUml.g:2289:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalSmallUml.g:2296:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__Group_4__0 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2300:1: ( ( ( rule__Enumeration__Group_4__0 )* ) )
            // InternalSmallUml.g:2301:1: ( ( rule__Enumeration__Group_4__0 )* )
            {
            // InternalSmallUml.g:2301:1: ( ( rule__Enumeration__Group_4__0 )* )
            // InternalSmallUml.g:2302:2: ( rule__Enumeration__Group_4__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_4()); 
            // InternalSmallUml.g:2303:2: ( rule__Enumeration__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSmallUml.g:2303:3: rule__Enumeration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Enumeration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // InternalSmallUml.g:2311:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2315:1: ( rule__Enumeration__Group__5__Impl )
            // InternalSmallUml.g:2316:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // InternalSmallUml.g:2322:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2326:1: ( ( '}' ) )
            // InternalSmallUml.g:2327:1: ( '}' )
            {
            // InternalSmallUml.g:2327:1: ( '}' )
            // InternalSmallUml.g:2328:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group_4__0"
    // InternalSmallUml.g:2338:1: rule__Enumeration__Group_4__0 : rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 ;
    public final void rule__Enumeration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2342:1: ( rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 )
            // InternalSmallUml.g:2343:2: rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Enumeration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__0"


    // $ANTLR start "rule__Enumeration__Group_4__0__Impl"
    // InternalSmallUml.g:2350:1: rule__Enumeration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2354:1: ( ( ',' ) )
            // InternalSmallUml.g:2355:1: ( ',' )
            {
            // InternalSmallUml.g:2355:1: ( ',' )
            // InternalSmallUml.g:2356:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_4__1"
    // InternalSmallUml.g:2365:1: rule__Enumeration__Group_4__1 : rule__Enumeration__Group_4__1__Impl ;
    public final void rule__Enumeration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2369:1: ( rule__Enumeration__Group_4__1__Impl )
            // InternalSmallUml.g:2370:2: rule__Enumeration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__1"


    // $ANTLR start "rule__Enumeration__Group_4__1__Impl"
    // InternalSmallUml.g:2376:1: rule__Enumeration__Group_4__1__Impl : ( ( rule__Enumeration__ValueAssignment_4_1 ) ) ;
    public final void rule__Enumeration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2380:1: ( ( ( rule__Enumeration__ValueAssignment_4_1 ) ) )
            // InternalSmallUml.g:2381:1: ( ( rule__Enumeration__ValueAssignment_4_1 ) )
            {
            // InternalSmallUml.g:2381:1: ( ( rule__Enumeration__ValueAssignment_4_1 ) )
            // InternalSmallUml.g:2382:2: ( rule__Enumeration__ValueAssignment_4_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_4_1()); 
            // InternalSmallUml.g:2383:2: ( rule__Enumeration__ValueAssignment_4_1 )
            // InternalSmallUml.g:2383:3: rule__Enumeration__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__1__Impl"


    // $ANTLR start "rule__ConcreteType__Group__0"
    // InternalSmallUml.g:2392:1: rule__ConcreteType__Group__0 : rule__ConcreteType__Group__0__Impl rule__ConcreteType__Group__1 ;
    public final void rule__ConcreteType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2396:1: ( rule__ConcreteType__Group__0__Impl rule__ConcreteType__Group__1 )
            // InternalSmallUml.g:2397:2: rule__ConcreteType__Group__0__Impl rule__ConcreteType__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__ConcreteType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteType__Group__0"


    // $ANTLR start "rule__ConcreteType__Group__0__Impl"
    // InternalSmallUml.g:2404:1: rule__ConcreteType__Group__0__Impl : ( () ) ;
    public final void rule__ConcreteType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2408:1: ( ( () ) )
            // InternalSmallUml.g:2409:1: ( () )
            {
            // InternalSmallUml.g:2409:1: ( () )
            // InternalSmallUml.g:2410:2: ()
            {
             before(grammarAccess.getConcreteTypeAccess().getConcreteTypeAction_0()); 
            // InternalSmallUml.g:2411:2: ()
            // InternalSmallUml.g:2411:3: 
            {
            }

             after(grammarAccess.getConcreteTypeAccess().getConcreteTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteType__Group__0__Impl"


    // $ANTLR start "rule__ConcreteType__Group__1"
    // InternalSmallUml.g:2419:1: rule__ConcreteType__Group__1 : rule__ConcreteType__Group__1__Impl rule__ConcreteType__Group__2 ;
    public final void rule__ConcreteType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2423:1: ( rule__ConcreteType__Group__1__Impl rule__ConcreteType__Group__2 )
            // InternalSmallUml.g:2424:2: rule__ConcreteType__Group__1__Impl rule__ConcreteType__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ConcreteType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteType__Group__1"


    // $ANTLR start "rule__ConcreteType__Group__1__Impl"
    // InternalSmallUml.g:2431:1: rule__ConcreteType__Group__1__Impl : ( 'ConcreteType' ) ;
    public final void rule__ConcreteType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2435:1: ( ( 'ConcreteType' ) )
            // InternalSmallUml.g:2436:1: ( 'ConcreteType' )
            {
            // InternalSmallUml.g:2436:1: ( 'ConcreteType' )
            // InternalSmallUml.g:2437:2: 'ConcreteType'
            {
             before(grammarAccess.getConcreteTypeAccess().getConcreteTypeKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConcreteTypeAccess().getConcreteTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteType__Group__1__Impl"


    // $ANTLR start "rule__ConcreteType__Group__2"
    // InternalSmallUml.g:2446:1: rule__ConcreteType__Group__2 : rule__ConcreteType__Group__2__Impl ;
    public final void rule__ConcreteType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2450:1: ( rule__ConcreteType__Group__2__Impl )
            // InternalSmallUml.g:2451:2: rule__ConcreteType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteType__Group__2"


    // $ANTLR start "rule__ConcreteType__Group__2__Impl"
    // InternalSmallUml.g:2457:1: rule__ConcreteType__Group__2__Impl : ( ( rule__ConcreteType__NameAssignment_2 ) ) ;
    public final void rule__ConcreteType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2461:1: ( ( ( rule__ConcreteType__NameAssignment_2 ) ) )
            // InternalSmallUml.g:2462:1: ( ( rule__ConcreteType__NameAssignment_2 ) )
            {
            // InternalSmallUml.g:2462:1: ( ( rule__ConcreteType__NameAssignment_2 ) )
            // InternalSmallUml.g:2463:2: ( rule__ConcreteType__NameAssignment_2 )
            {
             before(grammarAccess.getConcreteTypeAccess().getNameAssignment_2()); 
            // InternalSmallUml.g:2464:2: ( rule__ConcreteType__NameAssignment_2 )
            // InternalSmallUml.g:2464:3: rule__ConcreteType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConcreteTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteType__Group__2__Impl"


    // $ANTLR start "rule__Package__ClassAssignment_1_0"
    // InternalSmallUml.g:2473:1: rule__Package__ClassAssignment_1_0 : ( ruleClass ) ;
    public final void rule__Package__ClassAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2477:1: ( ( ruleClass ) )
            // InternalSmallUml.g:2478:2: ( ruleClass )
            {
            // InternalSmallUml.g:2478:2: ( ruleClass )
            // InternalSmallUml.g:2479:3: ruleClass
            {
             before(grammarAccess.getPackageAccess().getClassClassParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getClassClassParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ClassAssignment_1_0"


    // $ANTLR start "rule__Package__RelationAssignment_2_0"
    // InternalSmallUml.g:2488:1: rule__Package__RelationAssignment_2_0 : ( ruleRelation ) ;
    public final void rule__Package__RelationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2492:1: ( ( ruleRelation ) )
            // InternalSmallUml.g:2493:2: ( ruleRelation )
            {
            // InternalSmallUml.g:2493:2: ( ruleRelation )
            // InternalSmallUml.g:2494:3: ruleRelation
            {
             before(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__RelationAssignment_2_0"


    // $ANTLR start "rule__Package__TypesAssignment_3_0"
    // InternalSmallUml.g:2503:1: rule__Package__TypesAssignment_3_0 : ( ruleType ) ;
    public final void rule__Package__TypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2507:1: ( ( ruleType ) )
            // InternalSmallUml.g:2508:2: ( ruleType )
            {
            // InternalSmallUml.g:2508:2: ( ruleType )
            // InternalSmallUml.g:2509:3: ruleType
            {
             before(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__TypesAssignment_3_0"


    // $ANTLR start "rule__Class__IsAbstractAssignment_0"
    // InternalSmallUml.g:2518:1: rule__Class__IsAbstractAssignment_0 : ( ( 'Abstract' ) ) ;
    public final void rule__Class__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2522:1: ( ( ( 'Abstract' ) ) )
            // InternalSmallUml.g:2523:2: ( ( 'Abstract' ) )
            {
            // InternalSmallUml.g:2523:2: ( ( 'Abstract' ) )
            // InternalSmallUml.g:2524:3: ( 'Abstract' )
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalSmallUml.g:2525:3: ( 'Abstract' )
            // InternalSmallUml.g:2526:4: 'Abstract'
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__IsAbstractAssignment_0"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalSmallUml.g:2537:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2541:1: ( ( RULE_ID ) )
            // InternalSmallUml.g:2542:2: ( RULE_ID )
            {
            // InternalSmallUml.g:2542:2: ( RULE_ID )
            // InternalSmallUml.g:2543:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Class__ParentsAssignment_3_1"
    // InternalSmallUml.g:2552:1: rule__Class__ParentsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ParentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2556:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUml.g:2557:2: ( ( RULE_ID ) )
            {
            // InternalSmallUml.g:2557:2: ( ( RULE_ID ) )
            // InternalSmallUml.g:2558:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getParentsClassCrossReference_3_1_0()); 
            // InternalSmallUml.g:2559:3: ( RULE_ID )
            // InternalSmallUml.g:2560:4: RULE_ID
            {
             before(grammarAccess.getClassAccess().getParentsClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getParentsClassIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getParentsClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ParentsAssignment_3_1"


    // $ANTLR start "rule__Class__ParentsAssignment_3_2_1"
    // InternalSmallUml.g:2571:1: rule__Class__ParentsAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ParentsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2575:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUml.g:2576:2: ( ( RULE_ID ) )
            {
            // InternalSmallUml.g:2576:2: ( ( RULE_ID ) )
            // InternalSmallUml.g:2577:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getParentsClassCrossReference_3_2_1_0()); 
            // InternalSmallUml.g:2578:3: ( RULE_ID )
            // InternalSmallUml.g:2579:4: RULE_ID
            {
             before(grammarAccess.getClassAccess().getParentsClassIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getParentsClassIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getParentsClassCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ParentsAssignment_3_2_1"


    // $ANTLR start "rule__Class__AttributesAssignment_5_2"
    // InternalSmallUml.g:2590:1: rule__Class__AttributesAssignment_5_2 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2594:1: ( ( ruleAttribute ) )
            // InternalSmallUml.g:2595:2: ( ruleAttribute )
            {
            // InternalSmallUml.g:2595:2: ( ruleAttribute )
            // InternalSmallUml.g:2596:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_5_2"


    // $ANTLR start "rule__Class__AttributesAssignment_5_3"
    // InternalSmallUml.g:2605:1: rule__Class__AttributesAssignment_5_3 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2609:1: ( ( ruleAttribute ) )
            // InternalSmallUml.g:2610:2: ( ruleAttribute )
            {
            // InternalSmallUml.g:2610:2: ( ruleAttribute )
            // InternalSmallUml.g:2611:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_5_3"


    // $ANTLR start "rule__Class__MethodsAssignment_6_2"
    // InternalSmallUml.g:2620:1: rule__Class__MethodsAssignment_6_2 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2624:1: ( ( ruleMethod ) )
            // InternalSmallUml.g:2625:2: ( ruleMethod )
            {
            // InternalSmallUml.g:2625:2: ( ruleMethod )
            // InternalSmallUml.g:2626:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MethodsAssignment_6_2"


    // $ANTLR start "rule__Class__MethodsAssignment_6_3"
    // InternalSmallUml.g:2635:1: rule__Class__MethodsAssignment_6_3 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2639:1: ( ( ruleMethod ) )
            // InternalSmallUml.g:2640:2: ( ruleMethod )
            {
            // InternalSmallUml.g:2640:2: ( ruleMethod )
            // InternalSmallUml.g:2641:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MethodsAssignment_6_3"


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalSmallUml.g:2650:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2654:1: ( ( RULE_ID ) )
            // InternalSmallUml.g:2655:2: ( RULE_ID )
            {
            // InternalSmallUml.g:2655:2: ( RULE_ID )
            // InternalSmallUml.g:2656:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_1"


    // $ANTLR start "rule__Relation__FromAssignment_4"
    // InternalSmallUml.g:2665:1: rule__Relation__FromAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2669:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUml.g:2670:2: ( ( RULE_ID ) )
            {
            // InternalSmallUml.g:2670:2: ( ( RULE_ID ) )
            // InternalSmallUml.g:2671:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromClassCrossReference_4_0()); 
            // InternalSmallUml.g:2672:3: ( RULE_ID )
            // InternalSmallUml.g:2673:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromClassIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromClassIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getFromClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__FromAssignment_4"


    // $ANTLR start "rule__Relation__ToAssignment_6"
    // InternalSmallUml.g:2684:1: rule__Relation__ToAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2688:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUml.g:2689:2: ( ( RULE_ID ) )
            {
            // InternalSmallUml.g:2689:2: ( ( RULE_ID ) )
            // InternalSmallUml.g:2690:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToClassCrossReference_6_0()); 
            // InternalSmallUml.g:2691:3: ( RULE_ID )
            // InternalSmallUml.g:2692:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToClassIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToClassIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getToClassCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ToAssignment_6"


    // $ANTLR start "rule__Relation__CardinalityAssignment_8"
    // InternalSmallUml.g:2703:1: rule__Relation__CardinalityAssignment_8 : ( ruleCardinality ) ;
    public final void rule__Relation__CardinalityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2707:1: ( ( ruleCardinality ) )
            // InternalSmallUml.g:2708:2: ( ruleCardinality )
            {
            // InternalSmallUml.g:2708:2: ( ruleCardinality )
            // InternalSmallUml.g:2709:3: ruleCardinality
            {
             before(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__CardinalityAssignment_8"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalSmallUml.g:2718:1: rule__Attribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2722:1: ( ( ruleEString ) )
            // InternalSmallUml.g:2723:2: ( ruleEString )
            {
            // InternalSmallUml.g:2723:2: ( ruleEString )
            // InternalSmallUml.g:2724:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypedValueAssignment_2"
    // InternalSmallUml.g:2733:1: rule__Attribute__TypedValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypedValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2737:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUml.g:2738:2: ( ( RULE_ID ) )
            {
            // InternalSmallUml.g:2738:2: ( ( RULE_ID ) )
            // InternalSmallUml.g:2739:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypedValueTypeCrossReference_2_0()); 
            // InternalSmallUml.g:2740:3: ( RULE_ID )
            // InternalSmallUml.g:2741:4: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypedValueTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypedValueTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypedValueTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypedValueAssignment_2"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalSmallUml.g:2752:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2756:1: ( ( RULE_ID ) )
            // InternalSmallUml.g:2757:2: ( RULE_ID )
            {
            // InternalSmallUml.g:2757:2: ( RULE_ID )
            // InternalSmallUml.g:2758:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ParametersAssignment_3_0"
    // InternalSmallUml.g:2767:1: rule__Method__ParametersAssignment_3_0 : ( ruleAttribute ) ;
    public final void rule__Method__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2771:1: ( ( ruleAttribute ) )
            // InternalSmallUml.g:2772:2: ( ruleAttribute )
            {
            // InternalSmallUml.g:2772:2: ( ruleAttribute )
            // InternalSmallUml.g:2773:3: ruleAttribute
            {
             before(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_3_0"


    // $ANTLR start "rule__Method__ParametersAssignment_3_1_1"
    // InternalSmallUml.g:2782:1: rule__Method__ParametersAssignment_3_1_1 : ( ruleAttribute ) ;
    public final void rule__Method__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2786:1: ( ( ruleAttribute ) )
            // InternalSmallUml.g:2787:2: ( ruleAttribute )
            {
            // InternalSmallUml.g:2787:2: ( ruleAttribute )
            // InternalSmallUml.g:2788:3: ruleAttribute
            {
             before(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__Method__ReturnTypedValueAssignment_6"
    // InternalSmallUml.g:2797:1: rule__Method__ReturnTypedValueAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Method__ReturnTypedValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2801:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUml.g:2802:2: ( ( RULE_ID ) )
            {
            // InternalSmallUml.g:2802:2: ( ( RULE_ID ) )
            // InternalSmallUml.g:2803:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getReturnTypedValueTypeCrossReference_6_0()); 
            // InternalSmallUml.g:2804:3: ( RULE_ID )
            // InternalSmallUml.g:2805:4: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getReturnTypedValueTypeIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getReturnTypedValueTypeIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getReturnTypedValueTypeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypedValueAssignment_6"


    // $ANTLR start "rule__Cardinality__LowerBoundAssignment_1"
    // InternalSmallUml.g:2816:1: rule__Cardinality__LowerBoundAssignment_1 : ( ruleEInt ) ;
    public final void rule__Cardinality__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2820:1: ( ( ruleEInt ) )
            // InternalSmallUml.g:2821:2: ( ruleEInt )
            {
            // InternalSmallUml.g:2821:2: ( ruleEInt )
            // InternalSmallUml.g:2822:3: ruleEInt
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCardinalityAccess().getLowerBoundEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__LowerBoundAssignment_1"


    // $ANTLR start "rule__Cardinality__UpperBoundAssignment_3"
    // InternalSmallUml.g:2831:1: rule__Cardinality__UpperBoundAssignment_3 : ( ruleEInt ) ;
    public final void rule__Cardinality__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2835:1: ( ( ruleEInt ) )
            // InternalSmallUml.g:2836:2: ( ruleEInt )
            {
            // InternalSmallUml.g:2836:2: ( ruleEInt )
            // InternalSmallUml.g:2837:3: ruleEInt
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCardinalityAccess().getUpperBoundEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__UpperBoundAssignment_3"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalSmallUml.g:2846:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2850:1: ( ( RULE_ID ) )
            // InternalSmallUml.g:2851:2: ( RULE_ID )
            {
            // InternalSmallUml.g:2851:2: ( RULE_ID )
            // InternalSmallUml.g:2852:3: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__ValueAssignment_3"
    // InternalSmallUml.g:2861:1: rule__Enumeration__ValueAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__Enumeration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2865:1: ( ( ruleEnumerationElement ) )
            // InternalSmallUml.g:2866:2: ( ruleEnumerationElement )
            {
            // InternalSmallUml.g:2866:2: ( ruleEnumerationElement )
            // InternalSmallUml.g:2867:3: ruleEnumerationElement
            {
             before(grammarAccess.getEnumerationAccess().getValueEnumerationElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationElement();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValueEnumerationElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValueAssignment_3"


    // $ANTLR start "rule__Enumeration__ValueAssignment_4_1"
    // InternalSmallUml.g:2876:1: rule__Enumeration__ValueAssignment_4_1 : ( ruleEnumerationElement ) ;
    public final void rule__Enumeration__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2880:1: ( ( ruleEnumerationElement ) )
            // InternalSmallUml.g:2881:2: ( ruleEnumerationElement )
            {
            // InternalSmallUml.g:2881:2: ( ruleEnumerationElement )
            // InternalSmallUml.g:2882:3: ruleEnumerationElement
            {
             before(grammarAccess.getEnumerationAccess().getValueEnumerationElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationElement();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValueEnumerationElementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValueAssignment_4_1"


    // $ANTLR start "rule__ConcreteType__NameAssignment_2"
    // InternalSmallUml.g:2891:1: rule__ConcreteType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ConcreteType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2895:1: ( ( ruleEString ) )
            // InternalSmallUml.g:2896:2: ( ruleEString )
            {
            // InternalSmallUml.g:2896:2: ( ruleEString )
            // InternalSmallUml.g:2897:3: ruleEString
            {
             before(grammarAccess.getConcreteTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConcreteTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteType__NameAssignment_2"


    // $ANTLR start "rule__EnumerationElement__ValueAssignment"
    // InternalSmallUml.g:2906:1: rule__EnumerationElement__ValueAssignment : ( RULE_ID ) ;
    public final void rule__EnumerationElement__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:2910:1: ( ( RULE_ID ) )
            // InternalSmallUml.g:2911:2: ( RULE_ID )
            {
            // InternalSmallUml.g:2911:2: ( RULE_ID )
            // InternalSmallUml.g:2912:3: RULE_ID
            {
             before(grammarAccess.getEnumerationElementAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationElementAccess().getValueIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000E0081000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000060000000L});

}