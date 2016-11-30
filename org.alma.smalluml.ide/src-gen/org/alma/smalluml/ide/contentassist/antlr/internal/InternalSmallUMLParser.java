package org.alma.smalluml.ide.contentassist.antlr.internal;

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
import org.alma.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Enumeration'", "'{'", "'value'", "'}'", "','", "'Class'", "'extends'", "'attributes'", "'methods'", "':'", "'('", "')'", "'Relation'", "'cardinality'", "'from'", "'to'", "'String'", "'Boolean'", "'Real'", "'Integer'", "'UnlimitedNatural'", "'-'", "'['", "']'", "'Abstract'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
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


        public InternalSmallUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallUML.g"; }


    	private SmallUMLGrammarAccess grammarAccess;

    	public void setGrammarAccess(SmallUMLGrammarAccess grammarAccess) {
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
    // InternalSmallUML.g:53:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalSmallUML.g:54:1: ( rulePackage EOF )
            // InternalSmallUML.g:55:1: rulePackage EOF
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
    // InternalSmallUML.g:62:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:66:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalSmallUML.g:67:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalSmallUML.g:67:2: ( ( rule__Package__Group__0 ) )
            // InternalSmallUML.g:68:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalSmallUML.g:69:3: ( rule__Package__Group__0 )
            // InternalSmallUML.g:69:4: rule__Package__Group__0
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
    // InternalSmallUML.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSmallUML.g:79:1: ( ruleType EOF )
            // InternalSmallUML.g:80:1: ruleType EOF
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
    // InternalSmallUML.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSmallUML.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSmallUML.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalSmallUML.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSmallUML.g:94:3: ( rule__Type__Alternatives )
            // InternalSmallUML.g:94:4: rule__Type__Alternatives
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


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmallUML.g:104:1: ( ruleEString EOF )
            // InternalSmallUML.g:105:1: ruleEString EOF
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
    // InternalSmallUML.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmallUML.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmallUML.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalSmallUML.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmallUML.g:119:3: ( rule__EString__Alternatives )
            // InternalSmallUML.g:119:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:128:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSmallUML.g:129:1: ( ruleEnumeration EOF )
            // InternalSmallUML.g:130:1: ruleEnumeration EOF
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
    // InternalSmallUML.g:137:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:141:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSmallUML.g:142:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSmallUML.g:142:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSmallUML.g:143:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSmallUML.g:144:3: ( rule__Enumeration__Group__0 )
            // InternalSmallUML.g:144:4: rule__Enumeration__Group__0
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


    // $ANTLR start "entryRuleClass"
    // InternalSmallUML.g:153:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalSmallUML.g:154:1: ( ruleClass EOF )
            // InternalSmallUML.g:155:1: ruleClass EOF
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
    // InternalSmallUML.g:162:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:166:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalSmallUML.g:167:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalSmallUML.g:167:2: ( ( rule__Class__Group__0 ) )
            // InternalSmallUML.g:168:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalSmallUML.g:169:3: ( rule__Class__Group__0 )
            // InternalSmallUML.g:169:4: rule__Class__Group__0
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


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUML.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSmallUML.g:179:1: ( ruleAttribute EOF )
            // InternalSmallUML.g:180:1: ruleAttribute EOF
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
    // InternalSmallUML.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSmallUML.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSmallUML.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSmallUML.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSmallUML.g:194:3: ( rule__Attribute__Group__0 )
            // InternalSmallUML.g:194:4: rule__Attribute__Group__0
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
    // InternalSmallUML.g:203:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalSmallUML.g:204:1: ( ruleMethod EOF )
            // InternalSmallUML.g:205:1: ruleMethod EOF
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
    // InternalSmallUML.g:212:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:216:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalSmallUML.g:217:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalSmallUML.g:217:2: ( ( rule__Method__Group__0 ) )
            // InternalSmallUML.g:218:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalSmallUML.g:219:3: ( rule__Method__Group__0 )
            // InternalSmallUML.g:219:4: rule__Method__Group__0
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


    // $ANTLR start "entryRuleRelation"
    // InternalSmallUML.g:228:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalSmallUML.g:229:1: ( ruleRelation EOF )
            // InternalSmallUML.g:230:1: ruleRelation EOF
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
    // InternalSmallUML.g:237:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:241:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalSmallUML.g:242:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalSmallUML.g:242:2: ( ( rule__Relation__Group__0 ) )
            // InternalSmallUML.g:243:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalSmallUML.g:244:3: ( rule__Relation__Group__0 )
            // InternalSmallUML.g:244:4: rule__Relation__Group__0
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


    // $ANTLR start "entryRuleString0"
    // InternalSmallUML.g:253:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalSmallUML.g:254:1: ( ruleString0 EOF )
            // InternalSmallUML.g:255:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSmallUML.g:262:1: ruleString0 : ( ( rule__String0__Group__0 ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:266:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalSmallUML.g:267:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalSmallUML.g:267:2: ( ( rule__String0__Group__0 ) )
            // InternalSmallUML.g:268:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalSmallUML.g:269:3: ( rule__String0__Group__0 )
            // InternalSmallUML.g:269:4: rule__String0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleBoolean"
    // InternalSmallUML.g:278:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalSmallUML.g:279:1: ( ruleBoolean EOF )
            // InternalSmallUML.g:280:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalSmallUML.g:287:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:291:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // InternalSmallUML.g:292:2: ( ( rule__Boolean__Group__0 ) )
            {
            // InternalSmallUML.g:292:2: ( ( rule__Boolean__Group__0 ) )
            // InternalSmallUML.g:293:3: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // InternalSmallUML.g:294:3: ( rule__Boolean__Group__0 )
            // InternalSmallUML.g:294:4: rule__Boolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleReal"
    // InternalSmallUML.g:303:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // InternalSmallUML.g:304:1: ( ruleReal EOF )
            // InternalSmallUML.g:305:1: ruleReal EOF
            {
             before(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getRealRule()); 
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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalSmallUML.g:312:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:316:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalSmallUML.g:317:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalSmallUML.g:317:2: ( ( rule__Real__Group__0 ) )
            // InternalSmallUML.g:318:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalSmallUML.g:319:3: ( rule__Real__Group__0 )
            // InternalSmallUML.g:319:4: rule__Real__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // InternalSmallUML.g:328:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalSmallUML.g:329:1: ( ruleInteger EOF )
            // InternalSmallUML.g:330:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSmallUML.g:337:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:341:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalSmallUML.g:342:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalSmallUML.g:342:2: ( ( rule__Integer__Group__0 ) )
            // InternalSmallUML.g:343:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalSmallUML.g:344:3: ( rule__Integer__Group__0 )
            // InternalSmallUML.g:344:4: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleUnlimitedNatural"
    // InternalSmallUML.g:353:1: entryRuleUnlimitedNatural : ruleUnlimitedNatural EOF ;
    public final void entryRuleUnlimitedNatural() throws RecognitionException {
        try {
            // InternalSmallUML.g:354:1: ( ruleUnlimitedNatural EOF )
            // InternalSmallUML.g:355:1: ruleUnlimitedNatural EOF
            {
             before(grammarAccess.getUnlimitedNaturalRule()); 
            pushFollow(FOLLOW_1);
            ruleUnlimitedNatural();

            state._fsp--;

             after(grammarAccess.getUnlimitedNaturalRule()); 
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
    // $ANTLR end "entryRuleUnlimitedNatural"


    // $ANTLR start "ruleUnlimitedNatural"
    // InternalSmallUML.g:362:1: ruleUnlimitedNatural : ( ( rule__UnlimitedNatural__Group__0 ) ) ;
    public final void ruleUnlimitedNatural() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:366:2: ( ( ( rule__UnlimitedNatural__Group__0 ) ) )
            // InternalSmallUML.g:367:2: ( ( rule__UnlimitedNatural__Group__0 ) )
            {
            // InternalSmallUML.g:367:2: ( ( rule__UnlimitedNatural__Group__0 ) )
            // InternalSmallUML.g:368:3: ( rule__UnlimitedNatural__Group__0 )
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getGroup()); 
            // InternalSmallUML.g:369:3: ( rule__UnlimitedNatural__Group__0 )
            // InternalSmallUML.g:369:4: rule__UnlimitedNatural__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnlimitedNatural__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnlimitedNaturalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnlimitedNatural"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSmallUML.g:379:1: ( ruleEInt EOF )
            // InternalSmallUML.g:380:1: ruleEInt EOF
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
    // InternalSmallUML.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSmallUML.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSmallUML.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalSmallUML.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSmallUML.g:394:3: ( rule__EInt__Group__0 )
            // InternalSmallUML.g:394:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleCardinality"
    // InternalSmallUML.g:403:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalSmallUML.g:404:1: ( ruleCardinality EOF )
            // InternalSmallUML.g:405:1: ruleCardinality EOF
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
    // InternalSmallUML.g:412:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:416:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalSmallUML.g:417:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalSmallUML.g:417:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalSmallUML.g:418:3: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalSmallUML.g:419:3: ( rule__Cardinality__Group__0 )
            // InternalSmallUML.g:419:4: rule__Cardinality__Group__0
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSmallUML.g:427:1: rule__Type__Alternatives : ( ( ruleBoolean ) | ( ruleReal ) | ( ruleInteger ) | ( ruleString0 ) | ( ruleUnlimitedNatural ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:431:1: ( ( ruleBoolean ) | ( ruleReal ) | ( ruleInteger ) | ( ruleString0 ) | ( ruleUnlimitedNatural ) | ( ruleEnumeration ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            case 32:
                {
                alt1=5;
                }
                break;
            case 12:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSmallUML.g:432:2: ( ruleBoolean )
                    {
                    // InternalSmallUML.g:432:2: ( ruleBoolean )
                    // InternalSmallUML.g:433:3: ruleBoolean
                    {
                     before(grammarAccess.getTypeAccess().getBooleanParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:438:2: ( ruleReal )
                    {
                    // InternalSmallUML.g:438:2: ( ruleReal )
                    // InternalSmallUML.g:439:3: ruleReal
                    {
                     before(grammarAccess.getTypeAccess().getRealParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReal();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRealParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:444:2: ( ruleInteger )
                    {
                    // InternalSmallUML.g:444:2: ( ruleInteger )
                    // InternalSmallUML.g:445:3: ruleInteger
                    {
                     before(grammarAccess.getTypeAccess().getIntegerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntegerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSmallUML.g:450:2: ( ruleString0 )
                    {
                    // InternalSmallUML.g:450:2: ( ruleString0 )
                    // InternalSmallUML.g:451:3: ruleString0
                    {
                     before(grammarAccess.getTypeAccess().getString0ParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getString0ParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSmallUML.g:456:2: ( ruleUnlimitedNatural )
                    {
                    // InternalSmallUML.g:456:2: ( ruleUnlimitedNatural )
                    // InternalSmallUML.g:457:3: ruleUnlimitedNatural
                    {
                     before(grammarAccess.getTypeAccess().getUnlimitedNaturalParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleUnlimitedNatural();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getUnlimitedNaturalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSmallUML.g:462:2: ( ruleEnumeration )
                    {
                    // InternalSmallUML.g:462:2: ( ruleEnumeration )
                    // InternalSmallUML.g:463:3: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5()); 

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
    // InternalSmallUML.g:472:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:476:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSmallUML.g:477:2: ( RULE_STRING )
                    {
                    // InternalSmallUML.g:477:2: ( RULE_STRING )
                    // InternalSmallUML.g:478:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:483:2: ( RULE_ID )
                    {
                    // InternalSmallUML.g:483:2: ( RULE_ID )
                    // InternalSmallUML.g:484:3: RULE_ID
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
    // InternalSmallUML.g:493:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:497:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSmallUML.g:498:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalSmallUML.g:505:1: rule__Package__Group__0__Impl : ( ( rule__Package__Group_0__0 )* ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:509:1: ( ( ( rule__Package__Group_0__0 )* ) )
            // InternalSmallUML.g:510:1: ( ( rule__Package__Group_0__0 )* )
            {
            // InternalSmallUML.g:510:1: ( ( rule__Package__Group_0__0 )* )
            // InternalSmallUML.g:511:2: ( rule__Package__Group_0__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_0()); 
            // InternalSmallUML.g:512:2: ( rule__Package__Group_0__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmallUML.g:512:3: rule__Package__Group_0__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Package__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalSmallUML.g:520:1: rule__Package__Group__1 : rule__Package__Group__1__Impl ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:524:1: ( rule__Package__Group__1__Impl )
            // InternalSmallUML.g:525:2: rule__Package__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__1__Impl();

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
    // InternalSmallUML.g:531:1: rule__Package__Group__1__Impl : ( ( rule__Package__Group_1__0 )* ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:535:1: ( ( ( rule__Package__Group_1__0 )* ) )
            // InternalSmallUML.g:536:1: ( ( rule__Package__Group_1__0 )* )
            {
            // InternalSmallUML.g:536:1: ( ( rule__Package__Group_1__0 )* )
            // InternalSmallUML.g:537:2: ( rule__Package__Group_1__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_1()); 
            // InternalSmallUML.g:538:2: ( rule__Package__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmallUML.g:538:3: rule__Package__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Package__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "rule__Package__Group_0__0"
    // InternalSmallUML.g:547:1: rule__Package__Group_0__0 : rule__Package__Group_0__0__Impl rule__Package__Group_0__1 ;
    public final void rule__Package__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:551:1: ( rule__Package__Group_0__0__Impl rule__Package__Group_0__1 )
            // InternalSmallUML.g:552:2: rule__Package__Group_0__0__Impl rule__Package__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_0__1();

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
    // $ANTLR end "rule__Package__Group_0__0"


    // $ANTLR start "rule__Package__Group_0__0__Impl"
    // InternalSmallUML.g:559:1: rule__Package__Group_0__0__Impl : ( ( rule__Package__ClassAssignment_0_0 ) ) ;
    public final void rule__Package__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:563:1: ( ( ( rule__Package__ClassAssignment_0_0 ) ) )
            // InternalSmallUML.g:564:1: ( ( rule__Package__ClassAssignment_0_0 ) )
            {
            // InternalSmallUML.g:564:1: ( ( rule__Package__ClassAssignment_0_0 ) )
            // InternalSmallUML.g:565:2: ( rule__Package__ClassAssignment_0_0 )
            {
             before(grammarAccess.getPackageAccess().getClassAssignment_0_0()); 
            // InternalSmallUML.g:566:2: ( rule__Package__ClassAssignment_0_0 )
            // InternalSmallUML.g:566:3: rule__Package__ClassAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__ClassAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getClassAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_0__0__Impl"


    // $ANTLR start "rule__Package__Group_0__1"
    // InternalSmallUML.g:574:1: rule__Package__Group_0__1 : rule__Package__Group_0__1__Impl ;
    public final void rule__Package__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:578:1: ( rule__Package__Group_0__1__Impl )
            // InternalSmallUML.g:579:2: rule__Package__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_0__1__Impl();

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
    // $ANTLR end "rule__Package__Group_0__1"


    // $ANTLR start "rule__Package__Group_0__1__Impl"
    // InternalSmallUML.g:585:1: rule__Package__Group_0__1__Impl : ( ';' ) ;
    public final void rule__Package__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:589:1: ( ( ';' ) )
            // InternalSmallUML.g:590:1: ( ';' )
            {
            // InternalSmallUML.g:590:1: ( ';' )
            // InternalSmallUML.g:591:2: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_0_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getSemicolonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_0__1__Impl"


    // $ANTLR start "rule__Package__Group_1__0"
    // InternalSmallUML.g:601:1: rule__Package__Group_1__0 : rule__Package__Group_1__0__Impl rule__Package__Group_1__1 ;
    public final void rule__Package__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:605:1: ( rule__Package__Group_1__0__Impl rule__Package__Group_1__1 )
            // InternalSmallUML.g:606:2: rule__Package__Group_1__0__Impl rule__Package__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSmallUML.g:613:1: rule__Package__Group_1__0__Impl : ( ( rule__Package__RelationAssignment_1_0 ) ) ;
    public final void rule__Package__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:617:1: ( ( ( rule__Package__RelationAssignment_1_0 ) ) )
            // InternalSmallUML.g:618:1: ( ( rule__Package__RelationAssignment_1_0 ) )
            {
            // InternalSmallUML.g:618:1: ( ( rule__Package__RelationAssignment_1_0 ) )
            // InternalSmallUML.g:619:2: ( rule__Package__RelationAssignment_1_0 )
            {
             before(grammarAccess.getPackageAccess().getRelationAssignment_1_0()); 
            // InternalSmallUML.g:620:2: ( rule__Package__RelationAssignment_1_0 )
            // InternalSmallUML.g:620:3: rule__Package__RelationAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__RelationAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getRelationAssignment_1_0()); 

            }


            }

        }
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
    // InternalSmallUML.g:628:1: rule__Package__Group_1__1 : rule__Package__Group_1__1__Impl ;
    public final void rule__Package__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:632:1: ( rule__Package__Group_1__1__Impl )
            // InternalSmallUML.g:633:2: rule__Package__Group_1__1__Impl
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
    // InternalSmallUML.g:639:1: rule__Package__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Package__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:643:1: ( ( ';' ) )
            // InternalSmallUML.g:644:1: ( ';' )
            {
            // InternalSmallUML.g:644:1: ( ';' )
            // InternalSmallUML.g:645:2: ';'
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


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalSmallUML.g:655:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:659:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSmallUML.g:660:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:667:1: rule__Enumeration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:671:1: ( ( 'Enumeration' ) )
            // InternalSmallUML.g:672:1: ( 'Enumeration' )
            {
            // InternalSmallUML.g:672:1: ( 'Enumeration' )
            // InternalSmallUML.g:673:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSmallUML.g:682:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:686:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSmallUML.g:687:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmallUML.g:694:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:698:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalSmallUML.g:699:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:699:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalSmallUML.g:700:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:701:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalSmallUML.g:701:3: rule__Enumeration__NameAssignment_1
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
    // InternalSmallUML.g:709:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:713:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSmallUML.g:714:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
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
    // InternalSmallUML.g:721:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:725:1: ( ( '{' ) )
            // InternalSmallUML.g:726:1: ( '{' )
            {
            // InternalSmallUML.g:726:1: ( '{' )
            // InternalSmallUML.g:727:2: '{'
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
    // InternalSmallUML.g:736:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:740:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSmallUML.g:741:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmallUML.g:748:1: rule__Enumeration__Group__3__Impl : ( 'value' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:752:1: ( ( 'value' ) )
            // InternalSmallUML.g:753:1: ( 'value' )
            {
            // InternalSmallUML.g:753:1: ( 'value' )
            // InternalSmallUML.g:754:2: 'value'
            {
             before(grammarAccess.getEnumerationAccess().getValueKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getValueKeyword_3()); 

            }


            }

        }
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
    // InternalSmallUML.g:763:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:767:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSmallUML.g:768:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalSmallUML.g:775:1: rule__Enumeration__Group__4__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:779:1: ( ( '{' ) )
            // InternalSmallUML.g:780:1: ( '{' )
            {
            // InternalSmallUML.g:780:1: ( '{' )
            // InternalSmallUML.g:781:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalSmallUML.g:790:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:794:1: ( rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 )
            // InternalSmallUML.g:795:2: rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__6();

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
    // InternalSmallUML.g:802:1: rule__Enumeration__Group__5__Impl : ( ( rule__Enumeration__ValueAssignment_5 ) ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:806:1: ( ( ( rule__Enumeration__ValueAssignment_5 ) ) )
            // InternalSmallUML.g:807:1: ( ( rule__Enumeration__ValueAssignment_5 ) )
            {
            // InternalSmallUML.g:807:1: ( ( rule__Enumeration__ValueAssignment_5 ) )
            // InternalSmallUML.g:808:2: ( rule__Enumeration__ValueAssignment_5 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_5()); 
            // InternalSmallUML.g:809:2: ( rule__Enumeration__ValueAssignment_5 )
            // InternalSmallUML.g:809:3: rule__Enumeration__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValueAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Enumeration__Group__6"
    // InternalSmallUML.g:817:1: rule__Enumeration__Group__6 : rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 ;
    public final void rule__Enumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:821:1: ( rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 )
            // InternalSmallUML.g:822:2: rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Enumeration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__7();

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
    // $ANTLR end "rule__Enumeration__Group__6"


    // $ANTLR start "rule__Enumeration__Group__6__Impl"
    // InternalSmallUML.g:829:1: rule__Enumeration__Group__6__Impl : ( ( rule__Enumeration__Group_6__0 )* ) ;
    public final void rule__Enumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:833:1: ( ( ( rule__Enumeration__Group_6__0 )* ) )
            // InternalSmallUML.g:834:1: ( ( rule__Enumeration__Group_6__0 )* )
            {
            // InternalSmallUML.g:834:1: ( ( rule__Enumeration__Group_6__0 )* )
            // InternalSmallUML.g:835:2: ( rule__Enumeration__Group_6__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_6()); 
            // InternalSmallUML.g:836:2: ( rule__Enumeration__Group_6__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallUML.g:836:3: rule__Enumeration__Group_6__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Enumeration__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__6__Impl"


    // $ANTLR start "rule__Enumeration__Group__7"
    // InternalSmallUML.g:844:1: rule__Enumeration__Group__7 : rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8 ;
    public final void rule__Enumeration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:848:1: ( rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8 )
            // InternalSmallUML.g:849:2: rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Enumeration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__8();

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
    // $ANTLR end "rule__Enumeration__Group__7"


    // $ANTLR start "rule__Enumeration__Group__7__Impl"
    // InternalSmallUML.g:856:1: rule__Enumeration__Group__7__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:860:1: ( ( '}' ) )
            // InternalSmallUML.g:861:1: ( '}' )
            {
            // InternalSmallUML.g:861:1: ( '}' )
            // InternalSmallUML.g:862:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__7__Impl"


    // $ANTLR start "rule__Enumeration__Group__8"
    // InternalSmallUML.g:871:1: rule__Enumeration__Group__8 : rule__Enumeration__Group__8__Impl ;
    public final void rule__Enumeration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:875:1: ( rule__Enumeration__Group__8__Impl )
            // InternalSmallUML.g:876:2: rule__Enumeration__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__8__Impl();

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
    // $ANTLR end "rule__Enumeration__Group__8"


    // $ANTLR start "rule__Enumeration__Group__8__Impl"
    // InternalSmallUML.g:882:1: rule__Enumeration__Group__8__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:886:1: ( ( '}' ) )
            // InternalSmallUML.g:887:1: ( '}' )
            {
            // InternalSmallUML.g:887:1: ( '}' )
            // InternalSmallUML.g:888:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__8__Impl"


    // $ANTLR start "rule__Enumeration__Group_6__0"
    // InternalSmallUML.g:898:1: rule__Enumeration__Group_6__0 : rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1 ;
    public final void rule__Enumeration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:902:1: ( rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1 )
            // InternalSmallUML.g:903:2: rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Enumeration__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_6__1();

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
    // $ANTLR end "rule__Enumeration__Group_6__0"


    // $ANTLR start "rule__Enumeration__Group_6__0__Impl"
    // InternalSmallUML.g:910:1: rule__Enumeration__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:914:1: ( ( ',' ) )
            // InternalSmallUML.g:915:1: ( ',' )
            {
            // InternalSmallUML.g:915:1: ( ',' )
            // InternalSmallUML.g:916:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_6__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_6__1"
    // InternalSmallUML.g:925:1: rule__Enumeration__Group_6__1 : rule__Enumeration__Group_6__1__Impl ;
    public final void rule__Enumeration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:929:1: ( rule__Enumeration__Group_6__1__Impl )
            // InternalSmallUML.g:930:2: rule__Enumeration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_6__1__Impl();

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
    // $ANTLR end "rule__Enumeration__Group_6__1"


    // $ANTLR start "rule__Enumeration__Group_6__1__Impl"
    // InternalSmallUML.g:936:1: rule__Enumeration__Group_6__1__Impl : ( ( rule__Enumeration__ValueAssignment_6_1 ) ) ;
    public final void rule__Enumeration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:940:1: ( ( ( rule__Enumeration__ValueAssignment_6_1 ) ) )
            // InternalSmallUML.g:941:1: ( ( rule__Enumeration__ValueAssignment_6_1 ) )
            {
            // InternalSmallUML.g:941:1: ( ( rule__Enumeration__ValueAssignment_6_1 ) )
            // InternalSmallUML.g:942:2: ( rule__Enumeration__ValueAssignment_6_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_6_1()); 
            // InternalSmallUML.g:943:2: ( rule__Enumeration__ValueAssignment_6_1 )
            // InternalSmallUML.g:943:3: rule__Enumeration__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValueAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValueAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_6__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalSmallUML.g:952:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:956:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalSmallUML.g:957:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSmallUML.g:964:1: rule__Class__Group__0__Impl : ( ( rule__Class__IsAbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:968:1: ( ( ( rule__Class__IsAbstractAssignment_0 )? ) )
            // InternalSmallUML.g:969:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            {
            // InternalSmallUML.g:969:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            // InternalSmallUML.g:970:2: ( rule__Class__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 
            // InternalSmallUML.g:971:2: ( rule__Class__IsAbstractAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUML.g:971:3: rule__Class__IsAbstractAssignment_0
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
    // InternalSmallUML.g:979:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:983:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalSmallUML.g:984:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:991:1: rule__Class__Group__1__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:995:1: ( ( 'Class' ) )
            // InternalSmallUML.g:996:1: ( 'Class' )
            {
            // InternalSmallUML.g:996:1: ( 'Class' )
            // InternalSmallUML.g:997:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSmallUML.g:1006:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1010:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalSmallUML.g:1011:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSmallUML.g:1018:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1022:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalSmallUML.g:1023:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:1023:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalSmallUML.g:1024:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:1025:2: ( rule__Class__NameAssignment_2 )
            // InternalSmallUML.g:1025:3: rule__Class__NameAssignment_2
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
    // InternalSmallUML.g:1033:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1037:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalSmallUML.g:1038:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalSmallUML.g:1045:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1049:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalSmallUML.g:1050:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalSmallUML.g:1050:1: ( ( rule__Class__Group_3__0 )? )
            // InternalSmallUML.g:1051:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalSmallUML.g:1052:2: ( rule__Class__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:1052:3: rule__Class__Group_3__0
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
    // InternalSmallUML.g:1060:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1064:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalSmallUML.g:1065:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalSmallUML.g:1072:1: rule__Class__Group__4__Impl : ( '{' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1076:1: ( ( '{' ) )
            // InternalSmallUML.g:1077:1: ( '{' )
            {
            // InternalSmallUML.g:1077:1: ( '{' )
            // InternalSmallUML.g:1078:2: '{'
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
    // InternalSmallUML.g:1087:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1091:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalSmallUML.g:1092:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalSmallUML.g:1099:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1103:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalSmallUML.g:1104:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalSmallUML.g:1104:1: ( ( rule__Class__Group_5__0 )? )
            // InternalSmallUML.g:1105:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalSmallUML.g:1106:2: ( rule__Class__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUML.g:1106:3: rule__Class__Group_5__0
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
    // InternalSmallUML.g:1114:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1118:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalSmallUML.g:1119:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalSmallUML.g:1126:1: rule__Class__Group__6__Impl : ( ( rule__Class__Group_6__0 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1130:1: ( ( ( rule__Class__Group_6__0 )? ) )
            // InternalSmallUML.g:1131:1: ( ( rule__Class__Group_6__0 )? )
            {
            // InternalSmallUML.g:1131:1: ( ( rule__Class__Group_6__0 )? )
            // InternalSmallUML.g:1132:2: ( rule__Class__Group_6__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_6()); 
            // InternalSmallUML.g:1133:2: ( rule__Class__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUML.g:1133:3: rule__Class__Group_6__0
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
    // InternalSmallUML.g:1141:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1145:1: ( rule__Class__Group__7__Impl )
            // InternalSmallUML.g:1146:2: rule__Class__Group__7__Impl
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
    // InternalSmallUML.g:1152:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1156:1: ( ( '}' ) )
            // InternalSmallUML.g:1157:1: ( '}' )
            {
            // InternalSmallUML.g:1157:1: ( '}' )
            // InternalSmallUML.g:1158:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSmallUML.g:1168:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1172:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalSmallUML.g:1173:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:1180:1: rule__Class__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1184:1: ( ( 'extends' ) )
            // InternalSmallUML.g:1185:1: ( 'extends' )
            {
            // InternalSmallUML.g:1185:1: ( 'extends' )
            // InternalSmallUML.g:1186:2: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSmallUML.g:1195:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1199:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // InternalSmallUML.g:1200:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSmallUML.g:1207:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__ParentsAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1211:1: ( ( ( rule__Class__ParentsAssignment_3_1 ) ) )
            // InternalSmallUML.g:1212:1: ( ( rule__Class__ParentsAssignment_3_1 ) )
            {
            // InternalSmallUML.g:1212:1: ( ( rule__Class__ParentsAssignment_3_1 ) )
            // InternalSmallUML.g:1213:2: ( rule__Class__ParentsAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getParentsAssignment_3_1()); 
            // InternalSmallUML.g:1214:2: ( rule__Class__ParentsAssignment_3_1 )
            // InternalSmallUML.g:1214:3: rule__Class__ParentsAssignment_3_1
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
    // InternalSmallUML.g:1222:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1226:1: ( rule__Class__Group_3__2__Impl )
            // InternalSmallUML.g:1227:2: rule__Class__Group_3__2__Impl
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
    // InternalSmallUML.g:1233:1: rule__Class__Group_3__2__Impl : ( ( rule__Class__Group_3_2__0 )* ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1237:1: ( ( ( rule__Class__Group_3_2__0 )* ) )
            // InternalSmallUML.g:1238:1: ( ( rule__Class__Group_3_2__0 )* )
            {
            // InternalSmallUML.g:1238:1: ( ( rule__Class__Group_3_2__0 )* )
            // InternalSmallUML.g:1239:2: ( rule__Class__Group_3_2__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_3_2()); 
            // InternalSmallUML.g:1240:2: ( rule__Class__Group_3_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmallUML.g:1240:3: rule__Class__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalSmallUML.g:1249:1: rule__Class__Group_3_2__0 : rule__Class__Group_3_2__0__Impl rule__Class__Group_3_2__1 ;
    public final void rule__Class__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1253:1: ( rule__Class__Group_3_2__0__Impl rule__Class__Group_3_2__1 )
            // InternalSmallUML.g:1254:2: rule__Class__Group_3_2__0__Impl rule__Class__Group_3_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:1261:1: rule__Class__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1265:1: ( ( ',' ) )
            // InternalSmallUML.g:1266:1: ( ',' )
            {
            // InternalSmallUML.g:1266:1: ( ',' )
            // InternalSmallUML.g:1267:2: ','
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
    // InternalSmallUML.g:1276:1: rule__Class__Group_3_2__1 : rule__Class__Group_3_2__1__Impl ;
    public final void rule__Class__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1280:1: ( rule__Class__Group_3_2__1__Impl )
            // InternalSmallUML.g:1281:2: rule__Class__Group_3_2__1__Impl
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
    // InternalSmallUML.g:1287:1: rule__Class__Group_3_2__1__Impl : ( ( rule__Class__ParentsAssignment_3_2_1 ) ) ;
    public final void rule__Class__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1291:1: ( ( ( rule__Class__ParentsAssignment_3_2_1 ) ) )
            // InternalSmallUML.g:1292:1: ( ( rule__Class__ParentsAssignment_3_2_1 ) )
            {
            // InternalSmallUML.g:1292:1: ( ( rule__Class__ParentsAssignment_3_2_1 ) )
            // InternalSmallUML.g:1293:2: ( rule__Class__ParentsAssignment_3_2_1 )
            {
             before(grammarAccess.getClassAccess().getParentsAssignment_3_2_1()); 
            // InternalSmallUML.g:1294:2: ( rule__Class__ParentsAssignment_3_2_1 )
            // InternalSmallUML.g:1294:3: rule__Class__ParentsAssignment_3_2_1
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
    // InternalSmallUML.g:1303:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1307:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalSmallUML.g:1308:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmallUML.g:1315:1: rule__Class__Group_5__0__Impl : ( 'attributes' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1319:1: ( ( 'attributes' ) )
            // InternalSmallUML.g:1320:1: ( 'attributes' )
            {
            // InternalSmallUML.g:1320:1: ( 'attributes' )
            // InternalSmallUML.g:1321:2: 'attributes'
            {
             before(grammarAccess.getClassAccess().getAttributesKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSmallUML.g:1330:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1334:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalSmallUML.g:1335:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSmallUML.g:1342:1: rule__Class__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1346:1: ( ( '{' ) )
            // InternalSmallUML.g:1347:1: ( '{' )
            {
            // InternalSmallUML.g:1347:1: ( '{' )
            // InternalSmallUML.g:1348:2: '{'
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
    // InternalSmallUML.g:1357:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl rule__Class__Group_5__3 ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1361:1: ( rule__Class__Group_5__2__Impl rule__Class__Group_5__3 )
            // InternalSmallUML.g:1362:2: rule__Class__Group_5__2__Impl rule__Class__Group_5__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSmallUML.g:1369:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__AttributesAssignment_5_2 ) ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1373:1: ( ( ( rule__Class__AttributesAssignment_5_2 ) ) )
            // InternalSmallUML.g:1374:1: ( ( rule__Class__AttributesAssignment_5_2 ) )
            {
            // InternalSmallUML.g:1374:1: ( ( rule__Class__AttributesAssignment_5_2 ) )
            // InternalSmallUML.g:1375:2: ( rule__Class__AttributesAssignment_5_2 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_5_2()); 
            // InternalSmallUML.g:1376:2: ( rule__Class__AttributesAssignment_5_2 )
            // InternalSmallUML.g:1376:3: rule__Class__AttributesAssignment_5_2
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
    // InternalSmallUML.g:1384:1: rule__Class__Group_5__3 : rule__Class__Group_5__3__Impl rule__Class__Group_5__4 ;
    public final void rule__Class__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1388:1: ( rule__Class__Group_5__3__Impl rule__Class__Group_5__4 )
            // InternalSmallUML.g:1389:2: rule__Class__Group_5__3__Impl rule__Class__Group_5__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalSmallUML.g:1396:1: rule__Class__Group_5__3__Impl : ( ( rule__Class__AttributesAssignment_5_3 )* ) ;
    public final void rule__Class__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1400:1: ( ( ( rule__Class__AttributesAssignment_5_3 )* ) )
            // InternalSmallUML.g:1401:1: ( ( rule__Class__AttributesAssignment_5_3 )* )
            {
            // InternalSmallUML.g:1401:1: ( ( rule__Class__AttributesAssignment_5_3 )* )
            // InternalSmallUML.g:1402:2: ( rule__Class__AttributesAssignment_5_3 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_5_3()); 
            // InternalSmallUML.g:1403:2: ( rule__Class__AttributesAssignment_5_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmallUML.g:1403:3: rule__Class__AttributesAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalSmallUML.g:1411:1: rule__Class__Group_5__4 : rule__Class__Group_5__4__Impl ;
    public final void rule__Class__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1415:1: ( rule__Class__Group_5__4__Impl )
            // InternalSmallUML.g:1416:2: rule__Class__Group_5__4__Impl
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
    // InternalSmallUML.g:1422:1: rule__Class__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1426:1: ( ( '}' ) )
            // InternalSmallUML.g:1427:1: ( '}' )
            {
            // InternalSmallUML.g:1427:1: ( '}' )
            // InternalSmallUML.g:1428:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSmallUML.g:1438:1: rule__Class__Group_6__0 : rule__Class__Group_6__0__Impl rule__Class__Group_6__1 ;
    public final void rule__Class__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1442:1: ( rule__Class__Group_6__0__Impl rule__Class__Group_6__1 )
            // InternalSmallUML.g:1443:2: rule__Class__Group_6__0__Impl rule__Class__Group_6__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmallUML.g:1450:1: rule__Class__Group_6__0__Impl : ( 'methods' ) ;
    public final void rule__Class__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1454:1: ( ( 'methods' ) )
            // InternalSmallUML.g:1455:1: ( 'methods' )
            {
            // InternalSmallUML.g:1455:1: ( 'methods' )
            // InternalSmallUML.g:1456:2: 'methods'
            {
             before(grammarAccess.getClassAccess().getMethodsKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSmallUML.g:1465:1: rule__Class__Group_6__1 : rule__Class__Group_6__1__Impl rule__Class__Group_6__2 ;
    public final void rule__Class__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1469:1: ( rule__Class__Group_6__1__Impl rule__Class__Group_6__2 )
            // InternalSmallUML.g:1470:2: rule__Class__Group_6__1__Impl rule__Class__Group_6__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:1477:1: rule__Class__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1481:1: ( ( '{' ) )
            // InternalSmallUML.g:1482:1: ( '{' )
            {
            // InternalSmallUML.g:1482:1: ( '{' )
            // InternalSmallUML.g:1483:2: '{'
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
    // InternalSmallUML.g:1492:1: rule__Class__Group_6__2 : rule__Class__Group_6__2__Impl rule__Class__Group_6__3 ;
    public final void rule__Class__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1496:1: ( rule__Class__Group_6__2__Impl rule__Class__Group_6__3 )
            // InternalSmallUML.g:1497:2: rule__Class__Group_6__2__Impl rule__Class__Group_6__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalSmallUML.g:1504:1: rule__Class__Group_6__2__Impl : ( ( rule__Class__MethodsAssignment_6_2 ) ) ;
    public final void rule__Class__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1508:1: ( ( ( rule__Class__MethodsAssignment_6_2 ) ) )
            // InternalSmallUML.g:1509:1: ( ( rule__Class__MethodsAssignment_6_2 ) )
            {
            // InternalSmallUML.g:1509:1: ( ( rule__Class__MethodsAssignment_6_2 ) )
            // InternalSmallUML.g:1510:2: ( rule__Class__MethodsAssignment_6_2 )
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_6_2()); 
            // InternalSmallUML.g:1511:2: ( rule__Class__MethodsAssignment_6_2 )
            // InternalSmallUML.g:1511:3: rule__Class__MethodsAssignment_6_2
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
    // InternalSmallUML.g:1519:1: rule__Class__Group_6__3 : rule__Class__Group_6__3__Impl rule__Class__Group_6__4 ;
    public final void rule__Class__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1523:1: ( rule__Class__Group_6__3__Impl rule__Class__Group_6__4 )
            // InternalSmallUML.g:1524:2: rule__Class__Group_6__3__Impl rule__Class__Group_6__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalSmallUML.g:1531:1: rule__Class__Group_6__3__Impl : ( ( rule__Class__MethodsAssignment_6_3 )* ) ;
    public final void rule__Class__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1535:1: ( ( ( rule__Class__MethodsAssignment_6_3 )* ) )
            // InternalSmallUML.g:1536:1: ( ( rule__Class__MethodsAssignment_6_3 )* )
            {
            // InternalSmallUML.g:1536:1: ( ( rule__Class__MethodsAssignment_6_3 )* )
            // InternalSmallUML.g:1537:2: ( rule__Class__MethodsAssignment_6_3 )*
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_6_3()); 
            // InternalSmallUML.g:1538:2: ( rule__Class__MethodsAssignment_6_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmallUML.g:1538:3: rule__Class__MethodsAssignment_6_3
            	    {
            	    pushFollow(FOLLOW_22);
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
    // InternalSmallUML.g:1546:1: rule__Class__Group_6__4 : rule__Class__Group_6__4__Impl ;
    public final void rule__Class__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1550:1: ( rule__Class__Group_6__4__Impl )
            // InternalSmallUML.g:1551:2: rule__Class__Group_6__4__Impl
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
    // InternalSmallUML.g:1557:1: rule__Class__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1561:1: ( ( '}' ) )
            // InternalSmallUML.g:1562:1: ( '}' )
            {
            // InternalSmallUML.g:1562:1: ( '}' )
            // InternalSmallUML.g:1563:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSmallUML.g:1573:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1577:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSmallUML.g:1578:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSmallUML.g:1585:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1589:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalSmallUML.g:1590:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalSmallUML.g:1590:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalSmallUML.g:1591:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalSmallUML.g:1592:2: ( rule__Attribute__NameAssignment_0 )
            // InternalSmallUML.g:1592:3: rule__Attribute__NameAssignment_0
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
    // InternalSmallUML.g:1600:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1604:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSmallUML.g:1605:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalSmallUML.g:1612:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1616:1: ( ( ':' ) )
            // InternalSmallUML.g:1617:1: ( ':' )
            {
            // InternalSmallUML.g:1617:1: ( ':' )
            // InternalSmallUML.g:1618:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSmallUML.g:1627:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1631:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSmallUML.g:1632:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSmallUML.g:1639:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypedValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1643:1: ( ( ( rule__Attribute__TypedValueAssignment_2 ) ) )
            // InternalSmallUML.g:1644:1: ( ( rule__Attribute__TypedValueAssignment_2 ) )
            {
            // InternalSmallUML.g:1644:1: ( ( rule__Attribute__TypedValueAssignment_2 ) )
            // InternalSmallUML.g:1645:2: ( rule__Attribute__TypedValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypedValueAssignment_2()); 
            // InternalSmallUML.g:1646:2: ( rule__Attribute__TypedValueAssignment_2 )
            // InternalSmallUML.g:1646:3: rule__Attribute__TypedValueAssignment_2
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
    // InternalSmallUML.g:1654:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1658:1: ( rule__Attribute__Group__3__Impl )
            // InternalSmallUML.g:1659:2: rule__Attribute__Group__3__Impl
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
    // InternalSmallUML.g:1665:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1669:1: ( ( ';' ) )
            // InternalSmallUML.g:1670:1: ( ';' )
            {
            // InternalSmallUML.g:1670:1: ( ';' )
            // InternalSmallUML.g:1671:2: ';'
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
    // InternalSmallUML.g:1681:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1685:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalSmallUML.g:1686:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:1693:1: rule__Method__Group__0__Impl : ( () ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1697:1: ( ( () ) )
            // InternalSmallUML.g:1698:1: ( () )
            {
            // InternalSmallUML.g:1698:1: ( () )
            // InternalSmallUML.g:1699:2: ()
            {
             before(grammarAccess.getMethodAccess().getMethodAction_0()); 
            // InternalSmallUML.g:1700:2: ()
            // InternalSmallUML.g:1700:3: 
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
    // InternalSmallUML.g:1708:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1712:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalSmallUML.g:1713:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSmallUML.g:1720:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1724:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalSmallUML.g:1725:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:1725:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalSmallUML.g:1726:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:1727:2: ( rule__Method__NameAssignment_1 )
            // InternalSmallUML.g:1727:3: rule__Method__NameAssignment_1
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
    // InternalSmallUML.g:1735:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1739:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalSmallUML.g:1740:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSmallUML.g:1747:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1751:1: ( ( '(' ) )
            // InternalSmallUML.g:1752:1: ( '(' )
            {
            // InternalSmallUML.g:1752:1: ( '(' )
            // InternalSmallUML.g:1753:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSmallUML.g:1762:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1766:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalSmallUML.g:1767:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSmallUML.g:1774:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1778:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalSmallUML.g:1779:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalSmallUML.g:1779:1: ( ( rule__Method__Group_3__0 )? )
            // InternalSmallUML.g:1780:2: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // InternalSmallUML.g:1781:2: ( rule__Method__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUML.g:1781:3: rule__Method__Group_3__0
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
    // InternalSmallUML.g:1789:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1793:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalSmallUML.g:1794:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalSmallUML.g:1801:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1805:1: ( ( ')' ) )
            // InternalSmallUML.g:1806:1: ( ')' )
            {
            // InternalSmallUML.g:1806:1: ( ')' )
            // InternalSmallUML.g:1807:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSmallUML.g:1816:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1820:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalSmallUML.g:1821:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalSmallUML.g:1828:1: rule__Method__Group__5__Impl : ( ':' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1832:1: ( ( ':' ) )
            // InternalSmallUML.g:1833:1: ( ':' )
            {
            // InternalSmallUML.g:1833:1: ( ':' )
            // InternalSmallUML.g:1834:2: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSmallUML.g:1843:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1847:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalSmallUML.g:1848:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalSmallUML.g:1855:1: rule__Method__Group__6__Impl : ( ( rule__Method__ReturnTypedValueAssignment_6 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1859:1: ( ( ( rule__Method__ReturnTypedValueAssignment_6 )? ) )
            // InternalSmallUML.g:1860:1: ( ( rule__Method__ReturnTypedValueAssignment_6 )? )
            {
            // InternalSmallUML.g:1860:1: ( ( rule__Method__ReturnTypedValueAssignment_6 )? )
            // InternalSmallUML.g:1861:2: ( rule__Method__ReturnTypedValueAssignment_6 )?
            {
             before(grammarAccess.getMethodAccess().getReturnTypedValueAssignment_6()); 
            // InternalSmallUML.g:1862:2: ( rule__Method__ReturnTypedValueAssignment_6 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12||(LA14_0>=28 && LA14_0<=32)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUML.g:1862:3: rule__Method__ReturnTypedValueAssignment_6
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
    // InternalSmallUML.g:1870:1: rule__Method__Group__7 : rule__Method__Group__7__Impl ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1874:1: ( rule__Method__Group__7__Impl )
            // InternalSmallUML.g:1875:2: rule__Method__Group__7__Impl
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
    // InternalSmallUML.g:1881:1: rule__Method__Group__7__Impl : ( ';' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1885:1: ( ( ';' ) )
            // InternalSmallUML.g:1886:1: ( ';' )
            {
            // InternalSmallUML.g:1886:1: ( ';' )
            // InternalSmallUML.g:1887:2: ';'
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
    // InternalSmallUML.g:1897:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1901:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalSmallUML.g:1902:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSmallUML.g:1909:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ParametersAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1913:1: ( ( ( rule__Method__ParametersAssignment_3_0 ) ) )
            // InternalSmallUML.g:1914:1: ( ( rule__Method__ParametersAssignment_3_0 ) )
            {
            // InternalSmallUML.g:1914:1: ( ( rule__Method__ParametersAssignment_3_0 ) )
            // InternalSmallUML.g:1915:2: ( rule__Method__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3_0()); 
            // InternalSmallUML.g:1916:2: ( rule__Method__ParametersAssignment_3_0 )
            // InternalSmallUML.g:1916:3: rule__Method__ParametersAssignment_3_0
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
    // InternalSmallUML.g:1924:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1928:1: ( rule__Method__Group_3__1__Impl )
            // InternalSmallUML.g:1929:2: rule__Method__Group_3__1__Impl
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
    // InternalSmallUML.g:1935:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1939:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalSmallUML.g:1940:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalSmallUML.g:1940:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalSmallUML.g:1941:2: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // InternalSmallUML.g:1942:2: ( rule__Method__Group_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmallUML.g:1942:3: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalSmallUML.g:1951:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1955:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalSmallUML.g:1956:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSmallUML.g:1963:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1967:1: ( ( ',' ) )
            // InternalSmallUML.g:1968:1: ( ',' )
            {
            // InternalSmallUML.g:1968:1: ( ',' )
            // InternalSmallUML.g:1969:2: ','
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
    // InternalSmallUML.g:1978:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1982:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalSmallUML.g:1983:2: rule__Method__Group_3_1__1__Impl
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
    // InternalSmallUML.g:1989:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1993:1: ( ( ( rule__Method__ParametersAssignment_3_1_1 ) ) )
            // InternalSmallUML.g:1994:1: ( ( rule__Method__ParametersAssignment_3_1_1 ) )
            {
            // InternalSmallUML.g:1994:1: ( ( rule__Method__ParametersAssignment_3_1_1 ) )
            // InternalSmallUML.g:1995:2: ( rule__Method__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3_1_1()); 
            // InternalSmallUML.g:1996:2: ( rule__Method__ParametersAssignment_3_1_1 )
            // InternalSmallUML.g:1996:3: rule__Method__ParametersAssignment_3_1_1
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


    // $ANTLR start "rule__Relation__Group__0"
    // InternalSmallUML.g:2005:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2009:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalSmallUML.g:2010:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:2017:1: rule__Relation__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2021:1: ( ( 'Relation' ) )
            // InternalSmallUML.g:2022:1: ( 'Relation' )
            {
            // InternalSmallUML.g:2022:1: ( 'Relation' )
            // InternalSmallUML.g:2023:2: 'Relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSmallUML.g:2032:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2036:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalSmallUML.g:2037:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmallUML.g:2044:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2048:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalSmallUML.g:2049:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:2049:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalSmallUML.g:2050:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:2051:2: ( rule__Relation__NameAssignment_1 )
            // InternalSmallUML.g:2051:3: rule__Relation__NameAssignment_1
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
    // InternalSmallUML.g:2059:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2063:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalSmallUML.g:2064:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalSmallUML.g:2071:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2075:1: ( ( '{' ) )
            // InternalSmallUML.g:2076:1: ( '{' )
            {
            // InternalSmallUML.g:2076:1: ( '{' )
            // InternalSmallUML.g:2077:2: '{'
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
    // InternalSmallUML.g:2086:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2090:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalSmallUML.g:2091:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalSmallUML.g:2098:1: rule__Relation__Group__3__Impl : ( 'cardinality' ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2102:1: ( ( 'cardinality' ) )
            // InternalSmallUML.g:2103:1: ( 'cardinality' )
            {
            // InternalSmallUML.g:2103:1: ( 'cardinality' )
            // InternalSmallUML.g:2104:2: 'cardinality'
            {
             before(grammarAccess.getRelationAccess().getCardinalityKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getCardinalityKeyword_3()); 

            }


            }

        }
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
    // InternalSmallUML.g:2113:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2117:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalSmallUML.g:2118:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalSmallUML.g:2125:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__CardinalityAssignment_4 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2129:1: ( ( ( rule__Relation__CardinalityAssignment_4 ) ) )
            // InternalSmallUML.g:2130:1: ( ( rule__Relation__CardinalityAssignment_4 ) )
            {
            // InternalSmallUML.g:2130:1: ( ( rule__Relation__CardinalityAssignment_4 ) )
            // InternalSmallUML.g:2131:2: ( rule__Relation__CardinalityAssignment_4 )
            {
             before(grammarAccess.getRelationAccess().getCardinalityAssignment_4()); 
            // InternalSmallUML.g:2132:2: ( rule__Relation__CardinalityAssignment_4 )
            // InternalSmallUML.g:2132:3: rule__Relation__CardinalityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Relation__CardinalityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getCardinalityAssignment_4()); 

            }


            }

        }
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
    // InternalSmallUML.g:2140:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2144:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalSmallUML.g:2145:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:2152:1: rule__Relation__Group__5__Impl : ( 'from' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2156:1: ( ( 'from' ) )
            // InternalSmallUML.g:2157:1: ( 'from' )
            {
            // InternalSmallUML.g:2157:1: ( 'from' )
            // InternalSmallUML.g:2158:2: 'from'
            {
             before(grammarAccess.getRelationAccess().getFromKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromKeyword_5()); 

            }


            }

        }
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
    // InternalSmallUML.g:2167:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2171:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // InternalSmallUML.g:2172:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalSmallUML.g:2179:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__FromAssignment_6 ) ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2183:1: ( ( ( rule__Relation__FromAssignment_6 ) ) )
            // InternalSmallUML.g:2184:1: ( ( rule__Relation__FromAssignment_6 ) )
            {
            // InternalSmallUML.g:2184:1: ( ( rule__Relation__FromAssignment_6 ) )
            // InternalSmallUML.g:2185:2: ( rule__Relation__FromAssignment_6 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_6()); 
            // InternalSmallUML.g:2186:2: ( rule__Relation__FromAssignment_6 )
            // InternalSmallUML.g:2186:3: rule__Relation__FromAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Relation__FromAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromAssignment_6()); 

            }


            }

        }
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
    // InternalSmallUML.g:2194:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2198:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // InternalSmallUML.g:2199:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:2206:1: rule__Relation__Group__7__Impl : ( 'to' ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2210:1: ( ( 'to' ) )
            // InternalSmallUML.g:2211:1: ( 'to' )
            {
            // InternalSmallUML.g:2211:1: ( 'to' )
            // InternalSmallUML.g:2212:2: 'to'
            {
             before(grammarAccess.getRelationAccess().getToKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToKeyword_7()); 

            }


            }

        }
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
    // InternalSmallUML.g:2221:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl rule__Relation__Group__9 ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2225:1: ( rule__Relation__Group__8__Impl rule__Relation__Group__9 )
            // InternalSmallUML.g:2226:2: rule__Relation__Group__8__Impl rule__Relation__Group__9
            {
            pushFollow(FOLLOW_13);
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
    // InternalSmallUML.g:2233:1: rule__Relation__Group__8__Impl : ( ( rule__Relation__ToAssignment_8 ) ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2237:1: ( ( ( rule__Relation__ToAssignment_8 ) ) )
            // InternalSmallUML.g:2238:1: ( ( rule__Relation__ToAssignment_8 ) )
            {
            // InternalSmallUML.g:2238:1: ( ( rule__Relation__ToAssignment_8 ) )
            // InternalSmallUML.g:2239:2: ( rule__Relation__ToAssignment_8 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_8()); 
            // InternalSmallUML.g:2240:2: ( rule__Relation__ToAssignment_8 )
            // InternalSmallUML.g:2240:3: rule__Relation__ToAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ToAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToAssignment_8()); 

            }


            }

        }
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
    // InternalSmallUML.g:2248:1: rule__Relation__Group__9 : rule__Relation__Group__9__Impl ;
    public final void rule__Relation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2252:1: ( rule__Relation__Group__9__Impl )
            // InternalSmallUML.g:2253:2: rule__Relation__Group__9__Impl
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
    // InternalSmallUML.g:2259:1: rule__Relation__Group__9__Impl : ( '}' ) ;
    public final void rule__Relation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2263:1: ( ( '}' ) )
            // InternalSmallUML.g:2264:1: ( '}' )
            {
            // InternalSmallUML.g:2264:1: ( '}' )
            // InternalSmallUML.g:2265:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__String0__Group__0"
    // InternalSmallUML.g:2275:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2279:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalSmallUML.g:2280:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__String0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__1();

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
    // $ANTLR end "rule__String0__Group__0"


    // $ANTLR start "rule__String0__Group__0__Impl"
    // InternalSmallUML.g:2287:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2291:1: ( ( () ) )
            // InternalSmallUML.g:2292:1: ( () )
            {
            // InternalSmallUML.g:2292:1: ( () )
            // InternalSmallUML.g:2293:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalSmallUML.g:2294:2: ()
            // InternalSmallUML.g:2294:3: 
            {
            }

             after(grammarAccess.getString0Access().getStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0__Impl"


    // $ANTLR start "rule__String0__Group__1"
    // InternalSmallUML.g:2302:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2306:1: ( rule__String0__Group__1__Impl )
            // InternalSmallUML.g:2307:2: rule__String0__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__1__Impl();

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
    // $ANTLR end "rule__String0__Group__1"


    // $ANTLR start "rule__String0__Group__1__Impl"
    // InternalSmallUML.g:2313:1: rule__String0__Group__1__Impl : ( 'String' ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2317:1: ( ( 'String' ) )
            // InternalSmallUML.g:2318:1: ( 'String' )
            {
            // InternalSmallUML.g:2318:1: ( 'String' )
            // InternalSmallUML.g:2319:2: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1__Impl"


    // $ANTLR start "rule__Boolean__Group__0"
    // InternalSmallUML.g:2329:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2333:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // InternalSmallUML.g:2334:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Boolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1();

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
    // $ANTLR end "rule__Boolean__Group__0"


    // $ANTLR start "rule__Boolean__Group__0__Impl"
    // InternalSmallUML.g:2341:1: rule__Boolean__Group__0__Impl : ( () ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2345:1: ( ( () ) )
            // InternalSmallUML.g:2346:1: ( () )
            {
            // InternalSmallUML.g:2346:1: ( () )
            // InternalSmallUML.g:2347:2: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanAction_0()); 
            // InternalSmallUML.g:2348:2: ()
            // InternalSmallUML.g:2348:3: 
            {
            }

             after(grammarAccess.getBooleanAccess().getBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0__Impl"


    // $ANTLR start "rule__Boolean__Group__1"
    // InternalSmallUML.g:2356:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2360:1: ( rule__Boolean__Group__1__Impl )
            // InternalSmallUML.g:2361:2: rule__Boolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1__Impl();

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
    // $ANTLR end "rule__Boolean__Group__1"


    // $ANTLR start "rule__Boolean__Group__1__Impl"
    // InternalSmallUML.g:2367:1: rule__Boolean__Group__1__Impl : ( 'Boolean' ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2371:1: ( ( 'Boolean' ) )
            // InternalSmallUML.g:2372:1: ( 'Boolean' )
            {
            // InternalSmallUML.g:2372:1: ( 'Boolean' )
            // InternalSmallUML.g:2373:2: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBooleanAccess().getBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1__Impl"


    // $ANTLR start "rule__Real__Group__0"
    // InternalSmallUML.g:2383:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2387:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalSmallUML.g:2388:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Real__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__1();

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
    // $ANTLR end "rule__Real__Group__0"


    // $ANTLR start "rule__Real__Group__0__Impl"
    // InternalSmallUML.g:2395:1: rule__Real__Group__0__Impl : ( () ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2399:1: ( ( () ) )
            // InternalSmallUML.g:2400:1: ( () )
            {
            // InternalSmallUML.g:2400:1: ( () )
            // InternalSmallUML.g:2401:2: ()
            {
             before(grammarAccess.getRealAccess().getRealAction_0()); 
            // InternalSmallUML.g:2402:2: ()
            // InternalSmallUML.g:2402:3: 
            {
            }

             after(grammarAccess.getRealAccess().getRealAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0__Impl"


    // $ANTLR start "rule__Real__Group__1"
    // InternalSmallUML.g:2410:1: rule__Real__Group__1 : rule__Real__Group__1__Impl ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2414:1: ( rule__Real__Group__1__Impl )
            // InternalSmallUML.g:2415:2: rule__Real__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__1__Impl();

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
    // $ANTLR end "rule__Real__Group__1"


    // $ANTLR start "rule__Real__Group__1__Impl"
    // InternalSmallUML.g:2421:1: rule__Real__Group__1__Impl : ( 'Real' ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2425:1: ( ( 'Real' ) )
            // InternalSmallUML.g:2426:1: ( 'Real' )
            {
            // InternalSmallUML.g:2426:1: ( 'Real' )
            // InternalSmallUML.g:2427:2: 'Real'
            {
             before(grammarAccess.getRealAccess().getRealKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getRealKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // InternalSmallUML.g:2437:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2441:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalSmallUML.g:2442:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Integer__Group__1();

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
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // InternalSmallUML.g:2449:1: rule__Integer__Group__0__Impl : ( () ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2453:1: ( ( () ) )
            // InternalSmallUML.g:2454:1: ( () )
            {
            // InternalSmallUML.g:2454:1: ( () )
            // InternalSmallUML.g:2455:2: ()
            {
             before(grammarAccess.getIntegerAccess().getIntegerAction_0()); 
            // InternalSmallUML.g:2456:2: ()
            // InternalSmallUML.g:2456:3: 
            {
            }

             after(grammarAccess.getIntegerAccess().getIntegerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // InternalSmallUML.g:2464:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2468:1: ( rule__Integer__Group__1__Impl )
            // InternalSmallUML.g:2469:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__1__Impl();

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
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // InternalSmallUML.g:2475:1: rule__Integer__Group__1__Impl : ( 'Integer' ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2479:1: ( ( 'Integer' ) )
            // InternalSmallUML.g:2480:1: ( 'Integer' )
            {
            // InternalSmallUML.g:2480:1: ( 'Integer' )
            // InternalSmallUML.g:2481:2: 'Integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__UnlimitedNatural__Group__0"
    // InternalSmallUML.g:2491:1: rule__UnlimitedNatural__Group__0 : rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1 ;
    public final void rule__UnlimitedNatural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2495:1: ( rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1 )
            // InternalSmallUML.g:2496:2: rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__UnlimitedNatural__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnlimitedNatural__Group__1();

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
    // $ANTLR end "rule__UnlimitedNatural__Group__0"


    // $ANTLR start "rule__UnlimitedNatural__Group__0__Impl"
    // InternalSmallUML.g:2503:1: rule__UnlimitedNatural__Group__0__Impl : ( () ) ;
    public final void rule__UnlimitedNatural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2507:1: ( ( () ) )
            // InternalSmallUML.g:2508:1: ( () )
            {
            // InternalSmallUML.g:2508:1: ( () )
            // InternalSmallUML.g:2509:2: ()
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalAction_0()); 
            // InternalSmallUML.g:2510:2: ()
            // InternalSmallUML.g:2510:3: 
            {
            }

             after(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnlimitedNatural__Group__0__Impl"


    // $ANTLR start "rule__UnlimitedNatural__Group__1"
    // InternalSmallUML.g:2518:1: rule__UnlimitedNatural__Group__1 : rule__UnlimitedNatural__Group__1__Impl ;
    public final void rule__UnlimitedNatural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2522:1: ( rule__UnlimitedNatural__Group__1__Impl )
            // InternalSmallUML.g:2523:2: rule__UnlimitedNatural__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnlimitedNatural__Group__1__Impl();

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
    // $ANTLR end "rule__UnlimitedNatural__Group__1"


    // $ANTLR start "rule__UnlimitedNatural__Group__1__Impl"
    // InternalSmallUML.g:2529:1: rule__UnlimitedNatural__Group__1__Impl : ( 'UnlimitedNatural' ) ;
    public final void rule__UnlimitedNatural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2533:1: ( ( 'UnlimitedNatural' ) )
            // InternalSmallUML.g:2534:1: ( 'UnlimitedNatural' )
            {
            // InternalSmallUML.g:2534:1: ( 'UnlimitedNatural' )
            // InternalSmallUML.g:2535:2: 'UnlimitedNatural'
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnlimitedNatural__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSmallUML.g:2545:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2549:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSmallUML.g:2550:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSmallUML.g:2557:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2561:1: ( ( ( '-' )? ) )
            // InternalSmallUML.g:2562:1: ( ( '-' )? )
            {
            // InternalSmallUML.g:2562:1: ( ( '-' )? )
            // InternalSmallUML.g:2563:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSmallUML.g:2564:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUML.g:2564:3: '-'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalSmallUML.g:2572:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2576:1: ( rule__EInt__Group__1__Impl )
            // InternalSmallUML.g:2577:2: rule__EInt__Group__1__Impl
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
    // InternalSmallUML.g:2583:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2587:1: ( ( RULE_INT ) )
            // InternalSmallUML.g:2588:1: ( RULE_INT )
            {
            // InternalSmallUML.g:2588:1: ( RULE_INT )
            // InternalSmallUML.g:2589:2: RULE_INT
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


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalSmallUML.g:2599:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2603:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalSmallUML.g:2604:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSmallUML.g:2611:1: rule__Cardinality__Group__0__Impl : ( '[' ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2615:1: ( ( '[' ) )
            // InternalSmallUML.g:2616:1: ( '[' )
            {
            // InternalSmallUML.g:2616:1: ( '[' )
            // InternalSmallUML.g:2617:2: '['
            {
             before(grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSmallUML.g:2626:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2630:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // InternalSmallUML.g:2631:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSmallUML.g:2638:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__LowerBoundAssignment_1 ) ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2642:1: ( ( ( rule__Cardinality__LowerBoundAssignment_1 ) ) )
            // InternalSmallUML.g:2643:1: ( ( rule__Cardinality__LowerBoundAssignment_1 ) )
            {
            // InternalSmallUML.g:2643:1: ( ( rule__Cardinality__LowerBoundAssignment_1 ) )
            // InternalSmallUML.g:2644:2: ( rule__Cardinality__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_1()); 
            // InternalSmallUML.g:2645:2: ( rule__Cardinality__LowerBoundAssignment_1 )
            // InternalSmallUML.g:2645:3: rule__Cardinality__LowerBoundAssignment_1
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
    // InternalSmallUML.g:2653:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2657:1: ( rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 )
            // InternalSmallUML.g:2658:2: rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalSmallUML.g:2665:1: rule__Cardinality__Group__2__Impl : ( ',' ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2669:1: ( ( ',' ) )
            // InternalSmallUML.g:2670:1: ( ',' )
            {
            // InternalSmallUML.g:2670:1: ( ',' )
            // InternalSmallUML.g:2671:2: ','
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
    // InternalSmallUML.g:2680:1: rule__Cardinality__Group__3 : rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 ;
    public final void rule__Cardinality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2684:1: ( rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 )
            // InternalSmallUML.g:2685:2: rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalSmallUML.g:2692:1: rule__Cardinality__Group__3__Impl : ( ( rule__Cardinality__UpperBoundAssignment_3 ) ) ;
    public final void rule__Cardinality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2696:1: ( ( ( rule__Cardinality__UpperBoundAssignment_3 ) ) )
            // InternalSmallUML.g:2697:1: ( ( rule__Cardinality__UpperBoundAssignment_3 ) )
            {
            // InternalSmallUML.g:2697:1: ( ( rule__Cardinality__UpperBoundAssignment_3 ) )
            // InternalSmallUML.g:2698:2: ( rule__Cardinality__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_3()); 
            // InternalSmallUML.g:2699:2: ( rule__Cardinality__UpperBoundAssignment_3 )
            // InternalSmallUML.g:2699:3: rule__Cardinality__UpperBoundAssignment_3
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
    // InternalSmallUML.g:2707:1: rule__Cardinality__Group__4 : rule__Cardinality__Group__4__Impl ;
    public final void rule__Cardinality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2711:1: ( rule__Cardinality__Group__4__Impl )
            // InternalSmallUML.g:2712:2: rule__Cardinality__Group__4__Impl
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
    // InternalSmallUML.g:2718:1: rule__Cardinality__Group__4__Impl : ( ']' ) ;
    public final void rule__Cardinality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2722:1: ( ( ']' ) )
            // InternalSmallUML.g:2723:1: ( ']' )
            {
            // InternalSmallUML.g:2723:1: ( ']' )
            // InternalSmallUML.g:2724:2: ']'
            {
             before(grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
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


    // $ANTLR start "rule__Package__ClassAssignment_0_0"
    // InternalSmallUML.g:2734:1: rule__Package__ClassAssignment_0_0 : ( ruleClass ) ;
    public final void rule__Package__ClassAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2738:1: ( ( ruleClass ) )
            // InternalSmallUML.g:2739:2: ( ruleClass )
            {
            // InternalSmallUML.g:2739:2: ( ruleClass )
            // InternalSmallUML.g:2740:3: ruleClass
            {
             before(grammarAccess.getPackageAccess().getClassClassParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getClassClassParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ClassAssignment_0_0"


    // $ANTLR start "rule__Package__RelationAssignment_1_0"
    // InternalSmallUML.g:2749:1: rule__Package__RelationAssignment_1_0 : ( ruleRelation ) ;
    public final void rule__Package__RelationAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2753:1: ( ( ruleRelation ) )
            // InternalSmallUML.g:2754:2: ( ruleRelation )
            {
            // InternalSmallUML.g:2754:2: ( ruleRelation )
            // InternalSmallUML.g:2755:3: ruleRelation
            {
             before(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__RelationAssignment_1_0"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalSmallUML.g:2764:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2768:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:2769:2: ( RULE_ID )
            {
            // InternalSmallUML.g:2769:2: ( RULE_ID )
            // InternalSmallUML.g:2770:3: RULE_ID
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


    // $ANTLR start "rule__Enumeration__ValueAssignment_5"
    // InternalSmallUML.g:2779:1: rule__Enumeration__ValueAssignment_5 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2783:1: ( ( ruleString0 ) )
            // InternalSmallUML.g:2784:2: ( ruleString0 )
            {
            // InternalSmallUML.g:2784:2: ( ruleString0 )
            // InternalSmallUML.g:2785:3: ruleString0
            {
             before(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValueAssignment_5"


    // $ANTLR start "rule__Enumeration__ValueAssignment_6_1"
    // InternalSmallUML.g:2794:1: rule__Enumeration__ValueAssignment_6_1 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2798:1: ( ( ruleString0 ) )
            // InternalSmallUML.g:2799:2: ( ruleString0 )
            {
            // InternalSmallUML.g:2799:2: ( ruleString0 )
            // InternalSmallUML.g:2800:3: ruleString0
            {
             before(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValueAssignment_6_1"


    // $ANTLR start "rule__Class__IsAbstractAssignment_0"
    // InternalSmallUML.g:2809:1: rule__Class__IsAbstractAssignment_0 : ( ( 'Abstract' ) ) ;
    public final void rule__Class__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2813:1: ( ( ( 'Abstract' ) ) )
            // InternalSmallUML.g:2814:2: ( ( 'Abstract' ) )
            {
            // InternalSmallUML.g:2814:2: ( ( 'Abstract' ) )
            // InternalSmallUML.g:2815:3: ( 'Abstract' )
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalSmallUML.g:2816:3: ( 'Abstract' )
            // InternalSmallUML.g:2817:4: 'Abstract'
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSmallUML.g:2828:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2832:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:2833:2: ( RULE_ID )
            {
            // InternalSmallUML.g:2833:2: ( RULE_ID )
            // InternalSmallUML.g:2834:3: RULE_ID
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
    // InternalSmallUML.g:2843:1: rule__Class__ParentsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ParentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2847:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUML.g:2848:2: ( ( RULE_ID ) )
            {
            // InternalSmallUML.g:2848:2: ( ( RULE_ID ) )
            // InternalSmallUML.g:2849:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getParentsClassCrossReference_3_1_0()); 
            // InternalSmallUML.g:2850:3: ( RULE_ID )
            // InternalSmallUML.g:2851:4: RULE_ID
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
    // InternalSmallUML.g:2862:1: rule__Class__ParentsAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ParentsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2866:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUML.g:2867:2: ( ( RULE_ID ) )
            {
            // InternalSmallUML.g:2867:2: ( ( RULE_ID ) )
            // InternalSmallUML.g:2868:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getParentsClassCrossReference_3_2_1_0()); 
            // InternalSmallUML.g:2869:3: ( RULE_ID )
            // InternalSmallUML.g:2870:4: RULE_ID
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
    // InternalSmallUML.g:2881:1: rule__Class__AttributesAssignment_5_2 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2885:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:2886:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:2886:2: ( ruleAttribute )
            // InternalSmallUML.g:2887:3: ruleAttribute
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
    // InternalSmallUML.g:2896:1: rule__Class__AttributesAssignment_5_3 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2900:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:2901:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:2901:2: ( ruleAttribute )
            // InternalSmallUML.g:2902:3: ruleAttribute
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
    // InternalSmallUML.g:2911:1: rule__Class__MethodsAssignment_6_2 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2915:1: ( ( ruleMethod ) )
            // InternalSmallUML.g:2916:2: ( ruleMethod )
            {
            // InternalSmallUML.g:2916:2: ( ruleMethod )
            // InternalSmallUML.g:2917:3: ruleMethod
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
    // InternalSmallUML.g:2926:1: rule__Class__MethodsAssignment_6_3 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2930:1: ( ( ruleMethod ) )
            // InternalSmallUML.g:2931:2: ( ruleMethod )
            {
            // InternalSmallUML.g:2931:2: ( ruleMethod )
            // InternalSmallUML.g:2932:3: ruleMethod
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


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalSmallUML.g:2941:1: rule__Attribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2945:1: ( ( ruleEString ) )
            // InternalSmallUML.g:2946:2: ( ruleEString )
            {
            // InternalSmallUML.g:2946:2: ( ruleEString )
            // InternalSmallUML.g:2947:3: ruleEString
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
    // InternalSmallUML.g:2956:1: rule__Attribute__TypedValueAssignment_2 : ( ruleType ) ;
    public final void rule__Attribute__TypedValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2960:1: ( ( ruleType ) )
            // InternalSmallUML.g:2961:2: ( ruleType )
            {
            // InternalSmallUML.g:2961:2: ( ruleType )
            // InternalSmallUML.g:2962:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypedValueTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypedValueTypeParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalSmallUML.g:2971:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2975:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:2976:2: ( RULE_ID )
            {
            // InternalSmallUML.g:2976:2: ( RULE_ID )
            // InternalSmallUML.g:2977:3: RULE_ID
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
    // InternalSmallUML.g:2986:1: rule__Method__ParametersAssignment_3_0 : ( ruleAttribute ) ;
    public final void rule__Method__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2990:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:2991:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:2991:2: ( ruleAttribute )
            // InternalSmallUML.g:2992:3: ruleAttribute
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
    // InternalSmallUML.g:3001:1: rule__Method__ParametersAssignment_3_1_1 : ( ruleAttribute ) ;
    public final void rule__Method__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3005:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3006:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3006:2: ( ruleAttribute )
            // InternalSmallUML.g:3007:3: ruleAttribute
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
    // InternalSmallUML.g:3016:1: rule__Method__ReturnTypedValueAssignment_6 : ( ruleType ) ;
    public final void rule__Method__ReturnTypedValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3020:1: ( ( ruleType ) )
            // InternalSmallUML.g:3021:2: ( ruleType )
            {
            // InternalSmallUML.g:3021:2: ( ruleType )
            // InternalSmallUML.g:3022:3: ruleType
            {
             before(grammarAccess.getMethodAccess().getReturnTypedValueTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypedValueTypeParserRuleCall_6_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalSmallUML.g:3031:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3035:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:3036:2: ( RULE_ID )
            {
            // InternalSmallUML.g:3036:2: ( RULE_ID )
            // InternalSmallUML.g:3037:3: RULE_ID
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


    // $ANTLR start "rule__Relation__CardinalityAssignment_4"
    // InternalSmallUML.g:3046:1: rule__Relation__CardinalityAssignment_4 : ( ruleCardinality ) ;
    public final void rule__Relation__CardinalityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3050:1: ( ( ruleCardinality ) )
            // InternalSmallUML.g:3051:2: ( ruleCardinality )
            {
            // InternalSmallUML.g:3051:2: ( ruleCardinality )
            // InternalSmallUML.g:3052:3: ruleCardinality
            {
             before(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__CardinalityAssignment_4"


    // $ANTLR start "rule__Relation__FromAssignment_6"
    // InternalSmallUML.g:3061:1: rule__Relation__FromAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3065:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUML.g:3066:2: ( ( RULE_ID ) )
            {
            // InternalSmallUML.g:3066:2: ( ( RULE_ID ) )
            // InternalSmallUML.g:3067:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromClassCrossReference_6_0()); 
            // InternalSmallUML.g:3068:3: ( RULE_ID )
            // InternalSmallUML.g:3069:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromClassIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromClassIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getFromClassCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__FromAssignment_6"


    // $ANTLR start "rule__Relation__ToAssignment_8"
    // InternalSmallUML.g:3080:1: rule__Relation__ToAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3084:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUML.g:3085:2: ( ( RULE_ID ) )
            {
            // InternalSmallUML.g:3085:2: ( ( RULE_ID ) )
            // InternalSmallUML.g:3086:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToClassCrossReference_8_0()); 
            // InternalSmallUML.g:3087:3: ( RULE_ID )
            // InternalSmallUML.g:3088:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToClassIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToClassIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getToClassCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ToAssignment_8"


    // $ANTLR start "rule__Cardinality__LowerBoundAssignment_1"
    // InternalSmallUML.g:3099:1: rule__Cardinality__LowerBoundAssignment_1 : ( ruleEInt ) ;
    public final void rule__Cardinality__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3103:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:3104:2: ( ruleEInt )
            {
            // InternalSmallUML.g:3104:2: ( ruleEInt )
            // InternalSmallUML.g:3105:3: ruleEInt
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
    // InternalSmallUML.g:3114:1: rule__Cardinality__UpperBoundAssignment_3 : ( ruleEInt ) ;
    public final void rule__Cardinality__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3118:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:3119:2: ( ruleEInt )
            {
            // InternalSmallUML.g:3119:2: ( ruleEInt )
            // InternalSmallUML.g:3120:3: ruleEInt
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001F0001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000001F0001800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});

}