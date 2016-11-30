package org.alma.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.alma.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Enumeration'", "'{'", "'value'", "','", "'}'", "'Abstract'", "'Class'", "'extends'", "'attributes'", "'methods'", "':'", "'('", "')'", "'Relation'", "'cardinality'", "'from'", "'to'", "'String'", "'Boolean'", "'Real'", "'Integer'", "'UnlimitedNatural'", "'-'", "'['", "']'"
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

        public InternalSmallUMLParser(TokenStream input, SmallUMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Package";
       	}

       	@Override
       	protected SmallUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackage"
    // InternalSmallUML.g:64:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSmallUML.g:64:48: (iv_rulePackage= rulePackage EOF )
            // InternalSmallUML.g:65:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSmallUML.g:71:1: rulePackage returns [EObject current=null] : ( ( ( (lv_class_0_0= ruleClass ) ) otherlv_1= ';' )* ( ( (lv_relation_2_0= ruleRelation ) ) otherlv_3= ';' )* ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_class_0_0 = null;

        EObject lv_relation_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:77:2: ( ( ( ( (lv_class_0_0= ruleClass ) ) otherlv_1= ';' )* ( ( (lv_relation_2_0= ruleRelation ) ) otherlv_3= ';' )* ) )
            // InternalSmallUML.g:78:2: ( ( ( (lv_class_0_0= ruleClass ) ) otherlv_1= ';' )* ( ( (lv_relation_2_0= ruleRelation ) ) otherlv_3= ';' )* )
            {
            // InternalSmallUML.g:78:2: ( ( ( (lv_class_0_0= ruleClass ) ) otherlv_1= ';' )* ( ( (lv_relation_2_0= ruleRelation ) ) otherlv_3= ';' )* )
            // InternalSmallUML.g:79:3: ( ( (lv_class_0_0= ruleClass ) ) otherlv_1= ';' )* ( ( (lv_relation_2_0= ruleRelation ) ) otherlv_3= ';' )*
            {
            // InternalSmallUML.g:79:3: ( ( (lv_class_0_0= ruleClass ) ) otherlv_1= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmallUML.g:80:4: ( (lv_class_0_0= ruleClass ) ) otherlv_1= ';'
            	    {
            	    // InternalSmallUML.g:80:4: ( (lv_class_0_0= ruleClass ) )
            	    // InternalSmallUML.g:81:5: (lv_class_0_0= ruleClass )
            	    {
            	    // InternalSmallUML.g:81:5: (lv_class_0_0= ruleClass )
            	    // InternalSmallUML.g:82:6: lv_class_0_0= ruleClass
            	    {

            	    						newCompositeNode(grammarAccess.getPackageAccess().getClassClassParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_class_0_0=ruleClass();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"class",
            	    							lv_class_0_0,
            	    							"org.alma.smalluml.SmallUML.Class");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_1=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getSemicolonKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSmallUML.g:104:3: ( ( (lv_relation_2_0= ruleRelation ) ) otherlv_3= ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmallUML.g:105:4: ( (lv_relation_2_0= ruleRelation ) ) otherlv_3= ';'
            	    {
            	    // InternalSmallUML.g:105:4: ( (lv_relation_2_0= ruleRelation ) )
            	    // InternalSmallUML.g:106:5: (lv_relation_2_0= ruleRelation )
            	    {
            	    // InternalSmallUML.g:106:5: (lv_relation_2_0= ruleRelation )
            	    // InternalSmallUML.g:107:6: lv_relation_2_0= ruleRelation
            	    {

            	    						newCompositeNode(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_relation_2_0=ruleRelation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relation",
            	    							lv_relation_2_0,
            	    							"org.alma.smalluml.SmallUML.Relation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,11,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleType"
    // InternalSmallUML.g:133:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmallUML.g:133:45: (iv_ruleType= ruleType EOF )
            // InternalSmallUML.g:134:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUML.g:140:1: ruleType returns [EObject current=null] : (this_Boolean_0= ruleBoolean | this_Real_1= ruleReal | this_Integer_2= ruleInteger | this_String0_3= ruleString0 | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Boolean_0 = null;

        EObject this_Real_1 = null;

        EObject this_Integer_2 = null;

        EObject this_String0_3 = null;

        EObject this_UnlimitedNatural_4 = null;

        EObject this_Enumeration_5 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:146:2: ( (this_Boolean_0= ruleBoolean | this_Real_1= ruleReal | this_Integer_2= ruleInteger | this_String0_3= ruleString0 | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration ) )
            // InternalSmallUML.g:147:2: (this_Boolean_0= ruleBoolean | this_Real_1= ruleReal | this_Integer_2= ruleInteger | this_String0_3= ruleString0 | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration )
            {
            // InternalSmallUML.g:147:2: (this_Boolean_0= ruleBoolean | this_Real_1= ruleReal | this_Integer_2= ruleInteger | this_String0_3= ruleString0 | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            case 33:
                {
                alt3=5;
                }
                break;
            case 12:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSmallUML.g:148:3: this_Boolean_0= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBooleanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_0=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:157:3: this_Real_1= ruleReal
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getRealParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Real_1=ruleReal();

                    state._fsp--;


                    			current = this_Real_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:166:3: this_Integer_2= ruleInteger
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_2=ruleInteger();

                    state._fsp--;


                    			current = this_Integer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmallUML.g:175:3: this_String0_3= ruleString0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getString0ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_String0_3=ruleString0();

                    state._fsp--;


                    			current = this_String0_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSmallUML.g:184:3: this_UnlimitedNatural_4= ruleUnlimitedNatural
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getUnlimitedNaturalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnlimitedNatural_4=ruleUnlimitedNatural();

                    state._fsp--;


                    			current = this_UnlimitedNatural_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSmallUML.g:193:3: this_Enumeration_5= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_5=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_5;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:205:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:205:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:206:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmallUML.g:212:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:218:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:219:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:219:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:220:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:228:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:239:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUML.g:239:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUML.g:240:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUML.g:246:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_value_5_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:252:2: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSmallUML.g:253:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSmallUML.g:253:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalSmallUML.g:254:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalSmallUML.g:258:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallUML.g:259:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallUML.g:259:4: (lv_name_1_0= RULE_ID )
            // InternalSmallUML.g:260:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getValueKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUML.g:288:3: ( (lv_value_5_0= ruleString0 ) )
            // InternalSmallUML.g:289:4: (lv_value_5_0= ruleString0 )
            {
            // InternalSmallUML.g:289:4: (lv_value_5_0= ruleString0 )
            // InternalSmallUML.g:290:5: lv_value_5_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_5_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.alma.smalluml.SmallUML.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:307:3: (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallUML.g:308:4: otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSmallUML.g:312:4: ( (lv_value_7_0= ruleString0 ) )
            	    // InternalSmallUML.g:313:5: (lv_value_7_0= ruleString0 )
            	    {
            	    // InternalSmallUML.g:313:5: (lv_value_7_0= ruleString0 )
            	    // InternalSmallUML.g:314:6: lv_value_7_0= ruleString0
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_value_7_0=ruleString0();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_7_0,
            	    							"org.alma.smalluml.SmallUML.String0");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleClass"
    // InternalSmallUML.g:344:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUML.g:344:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUML.g:345:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSmallUML.g:351:1: ruleClass returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'Abstract' ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )? (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_attributes_10_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_methods_15_0 = null;

        EObject lv_methods_16_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:357:2: ( ( ( (lv_isAbstract_0_0= 'Abstract' ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )? (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalSmallUML.g:358:2: ( ( (lv_isAbstract_0_0= 'Abstract' ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )? (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalSmallUML.g:358:2: ( ( (lv_isAbstract_0_0= 'Abstract' ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )? (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalSmallUML.g:359:3: ( (lv_isAbstract_0_0= 'Abstract' ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )? (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalSmallUML.g:359:3: ( (lv_isAbstract_0_0= 'Abstract' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUML.g:360:4: (lv_isAbstract_0_0= 'Abstract' )
                    {
                    // InternalSmallUML.g:360:4: (lv_isAbstract_0_0= 'Abstract' )
                    // InternalSmallUML.g:361:5: lv_isAbstract_0_0= 'Abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "Abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalSmallUML.g:377:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:378:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:378:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:379:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSmallUML.g:395:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUML.g:396:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSmallUML.g:400:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSmallUML.g:401:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSmallUML.g:401:5: (otherlv_4= RULE_ID )
                    // InternalSmallUML.g:402:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_4, grammarAccess.getClassAccess().getParentsClassCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalSmallUML.g:413:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSmallUML.g:414:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalSmallUML.g:418:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalSmallUML.g:419:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalSmallUML.g:419:6: (otherlv_6= RULE_ID )
                    	    // InternalSmallUML.g:420:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getClassAccess().getParentsClassCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUML.g:437:3: (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUML.g:438:4: otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getClassAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,13,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:446:4: ( (lv_attributes_10_0= ruleAttribute ) )
                    // InternalSmallUML.g:447:5: (lv_attributes_10_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:447:5: (lv_attributes_10_0= ruleAttribute )
                    // InternalSmallUML.g:448:6: lv_attributes_10_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_attributes_10_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_10_0,
                    							"org.alma.smalluml.SmallUML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:465:4: ( (lv_attributes_11_0= ruleAttribute ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSmallUML.g:466:5: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:466:5: (lv_attributes_11_0= ruleAttribute )
                    	    // InternalSmallUML.g:467:6: lv_attributes_11_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_attributes_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_11_0,
                    	    							"org.alma.smalluml.SmallUML.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:489:3: (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallUML.g:490:4: otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}'
                    {
                    otherlv_13=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getMethodsKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSmallUML.g:498:4: ( (lv_methods_15_0= ruleMethod ) )
                    // InternalSmallUML.g:499:5: (lv_methods_15_0= ruleMethod )
                    {
                    // InternalSmallUML.g:499:5: (lv_methods_15_0= ruleMethod )
                    // InternalSmallUML.g:500:6: lv_methods_15_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_methods_15_0=ruleMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"methods",
                    							lv_methods_15_0,
                    							"org.alma.smalluml.SmallUML.Method");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:517:4: ( (lv_methods_16_0= ruleMethod ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSmallUML.g:518:5: (lv_methods_16_0= ruleMethod )
                    	    {
                    	    // InternalSmallUML.g:518:5: (lv_methods_16_0= ruleMethod )
                    	    // InternalSmallUML.g:519:6: lv_methods_16_0= ruleMethod
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_3_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_methods_16_0=ruleMethod();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"methods",
                    	    							lv_methods_16_0,
                    	    							"org.alma.smalluml.SmallUML.Method");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUML.g:549:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUML.g:549:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUML.g:550:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUML.g:556:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_typedValue_2_0= ruleType ) ) otherlv_3= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_typedValue_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:562:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_typedValue_2_0= ruleType ) ) otherlv_3= ';' ) )
            // InternalSmallUML.g:563:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_typedValue_2_0= ruleType ) ) otherlv_3= ';' )
            {
            // InternalSmallUML.g:563:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_typedValue_2_0= ruleType ) ) otherlv_3= ';' )
            // InternalSmallUML.g:564:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_typedValue_2_0= ruleType ) ) otherlv_3= ';'
            {
            // InternalSmallUML.g:564:3: ( (lv_name_0_0= ruleEString ) )
            // InternalSmallUML.g:565:4: (lv_name_0_0= ruleEString )
            {
            // InternalSmallUML.g:565:4: (lv_name_0_0= ruleEString )
            // InternalSmallUML.g:566:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.alma.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalSmallUML.g:587:3: ( (lv_typedValue_2_0= ruleType ) )
            // InternalSmallUML.g:588:4: (lv_typedValue_2_0= ruleType )
            {
            // InternalSmallUML.g:588:4: (lv_typedValue_2_0= ruleType )
            // InternalSmallUML.g:589:5: lv_typedValue_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypedValueTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_typedValue_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"typedValue",
            						lv_typedValue_2_0,
            						"org.alma.smalluml.SmallUML.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalSmallUML.g:614:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalSmallUML.g:614:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalSmallUML.g:615:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalSmallUML.g:621:1: ruleMethod returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnTypedValue_8_0= ruleType ) )? otherlv_9= ';' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_returnTypedValue_8_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:627:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnTypedValue_8_0= ruleType ) )? otherlv_9= ';' ) )
            // InternalSmallUML.g:628:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnTypedValue_8_0= ruleType ) )? otherlv_9= ';' )
            {
            // InternalSmallUML.g:628:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnTypedValue_8_0= ruleType ) )? otherlv_9= ';' )
            // InternalSmallUML.g:629:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnTypedValue_8_0= ruleType ) )? otherlv_9= ';'
            {
            // InternalSmallUML.g:629:3: ()
            // InternalSmallUML.g:630:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:636:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallUML.g:637:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallUML.g:637:4: (lv_name_1_0= RULE_ID )
            // InternalSmallUML.g:638:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSmallUML.g:658:3: ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUML.g:659:4: ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )*
                    {
                    // InternalSmallUML.g:659:4: ( (lv_parameters_3_0= ruleAttribute ) )
                    // InternalSmallUML.g:660:5: (lv_parameters_3_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:660:5: (lv_parameters_3_0= ruleAttribute )
                    // InternalSmallUML.g:661:6: lv_parameters_3_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_parameters_3_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"org.alma.smalluml.SmallUML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:678:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSmallUML.g:679:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSmallUML.g:683:5: ( (lv_parameters_5_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:684:6: (lv_parameters_5_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:684:6: (lv_parameters_5_0= ruleAttribute )
                    	    // InternalSmallUML.g:685:7: lv_parameters_5_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_parameters_5_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"org.alma.smalluml.SmallUML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getColonKeyword_5());
            		
            // InternalSmallUML.g:712:3: ( (lv_returnTypedValue_8_0= ruleType ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12||(LA15_0>=29 && LA15_0<=33)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmallUML.g:713:4: (lv_returnTypedValue_8_0= ruleType )
                    {
                    // InternalSmallUML.g:713:4: (lv_returnTypedValue_8_0= ruleType )
                    // InternalSmallUML.g:714:5: lv_returnTypedValue_8_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getReturnTypedValueTypeParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_returnTypedValue_8_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodRule());
                    					}
                    					set(
                    						current,
                    						"returnTypedValue",
                    						lv_returnTypedValue_8_0,
                    						"org.alma.smalluml.SmallUML.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleRelation"
    // InternalSmallUML.g:739:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalSmallUML.g:739:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalSmallUML.g:740:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalSmallUML.g:746:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'cardinality' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_cardinality_4_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:752:2: ( (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'cardinality' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // InternalSmallUML.g:753:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'cardinality' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // InternalSmallUML.g:753:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'cardinality' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // InternalSmallUML.g:754:3: otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'cardinality' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalSmallUML.g:758:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallUML.g:759:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallUML.g:759:4: (lv_name_1_0= RULE_ID )
            // InternalSmallUML.g:760:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getCardinalityKeyword_3());
            		
            // InternalSmallUML.g:784:3: ( (lv_cardinality_4_0= ruleCardinality ) )
            // InternalSmallUML.g:785:4: (lv_cardinality_4_0= ruleCardinality )
            {
            // InternalSmallUML.g:785:4: (lv_cardinality_4_0= ruleCardinality )
            // InternalSmallUML.g:786:5: lv_cardinality_4_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_cardinality_4_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_4_0,
            						"org.alma.smalluml.SmallUML.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getFromKeyword_5());
            		
            // InternalSmallUML.g:807:3: ( (otherlv_6= RULE_ID ) )
            // InternalSmallUML.g:808:4: (otherlv_6= RULE_ID )
            {
            // InternalSmallUML.g:808:4: (otherlv_6= RULE_ID )
            // InternalSmallUML.g:809:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getFromClassCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getToKeyword_7());
            		
            // InternalSmallUML.g:824:3: ( (otherlv_8= RULE_ID ) )
            // InternalSmallUML.g:825:4: (otherlv_8= RULE_ID )
            {
            // InternalSmallUML.g:825:4: (otherlv_8= RULE_ID )
            // InternalSmallUML.g:826:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getToClassCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleString0"
    // InternalSmallUML.g:845:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalSmallUML.g:845:48: (iv_ruleString0= ruleString0 EOF )
            // InternalSmallUML.g:846:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSmallUML.g:852:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:858:2: ( ( () otherlv_1= 'String' ) )
            // InternalSmallUML.g:859:2: ( () otherlv_1= 'String' )
            {
            // InternalSmallUML.g:859:2: ( () otherlv_1= 'String' )
            // InternalSmallUML.g:860:3: () otherlv_1= 'String'
            {
            // InternalSmallUML.g:860:3: ()
            // InternalSmallUML.g:861:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
            		

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleBoolean"
    // InternalSmallUML.g:875:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalSmallUML.g:875:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalSmallUML.g:876:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalSmallUML.g:882:1: ruleBoolean returns [EObject current=null] : ( () otherlv_1= 'Boolean' ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:888:2: ( ( () otherlv_1= 'Boolean' ) )
            // InternalSmallUML.g:889:2: ( () otherlv_1= 'Boolean' )
            {
            // InternalSmallUML.g:889:2: ( () otherlv_1= 'Boolean' )
            // InternalSmallUML.g:890:3: () otherlv_1= 'Boolean'
            {
            // InternalSmallUML.g:890:3: ()
            // InternalSmallUML.g:891:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getBooleanKeyword_1());
            		

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleReal"
    // InternalSmallUML.g:905:1: entryRuleReal returns [EObject current=null] : iv_ruleReal= ruleReal EOF ;
    public final EObject entryRuleReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal = null;


        try {
            // InternalSmallUML.g:905:45: (iv_ruleReal= ruleReal EOF )
            // InternalSmallUML.g:906:2: iv_ruleReal= ruleReal EOF
            {
             newCompositeNode(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;

             current =iv_ruleReal; 
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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalSmallUML.g:912:1: ruleReal returns [EObject current=null] : ( () otherlv_1= 'Real' ) ;
    public final EObject ruleReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:918:2: ( ( () otherlv_1= 'Real' ) )
            // InternalSmallUML.g:919:2: ( () otherlv_1= 'Real' )
            {
            // InternalSmallUML.g:919:2: ( () otherlv_1= 'Real' )
            // InternalSmallUML.g:920:3: () otherlv_1= 'Real'
            {
            // InternalSmallUML.g:920:3: ()
            // InternalSmallUML.g:921:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealAccess().getRealAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRealAccess().getRealKeyword_1());
            		

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
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // InternalSmallUML.g:935:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalSmallUML.g:935:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalSmallUML.g:936:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSmallUML.g:942:1: ruleInteger returns [EObject current=null] : ( () otherlv_1= 'Integer' ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:948:2: ( ( () otherlv_1= 'Integer' ) )
            // InternalSmallUML.g:949:2: ( () otherlv_1= 'Integer' )
            {
            // InternalSmallUML.g:949:2: ( () otherlv_1= 'Integer' )
            // InternalSmallUML.g:950:3: () otherlv_1= 'Integer'
            {
            // InternalSmallUML.g:950:3: ()
            // InternalSmallUML.g:951:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerAccess().getIntegerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getIntegerKeyword_1());
            		

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleUnlimitedNatural"
    // InternalSmallUML.g:965:1: entryRuleUnlimitedNatural returns [EObject current=null] : iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF ;
    public final EObject entryRuleUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNatural = null;


        try {
            // InternalSmallUML.g:965:57: (iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF )
            // InternalSmallUML.g:966:2: iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF
            {
             newCompositeNode(grammarAccess.getUnlimitedNaturalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnlimitedNatural=ruleUnlimitedNatural();

            state._fsp--;

             current =iv_ruleUnlimitedNatural; 
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
    // $ANTLR end "entryRuleUnlimitedNatural"


    // $ANTLR start "ruleUnlimitedNatural"
    // InternalSmallUML.g:972:1: ruleUnlimitedNatural returns [EObject current=null] : ( () otherlv_1= 'UnlimitedNatural' ) ;
    public final EObject ruleUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:978:2: ( ( () otherlv_1= 'UnlimitedNatural' ) )
            // InternalSmallUML.g:979:2: ( () otherlv_1= 'UnlimitedNatural' )
            {
            // InternalSmallUML.g:979:2: ( () otherlv_1= 'UnlimitedNatural' )
            // InternalSmallUML.g:980:3: () otherlv_1= 'UnlimitedNatural'
            {
            // InternalSmallUML.g:980:3: ()
            // InternalSmallUML.g:981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword_1());
            		

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
    // $ANTLR end "ruleUnlimitedNatural"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:995:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUML.g:995:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUML.g:996:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSmallUML.g:1002:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1008:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmallUML.g:1009:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmallUML.g:1009:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmallUML.g:1010:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmallUML.g:1010:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUML.g:1011:4: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_30); 

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


    // $ANTLR start "entryRuleCardinality"
    // InternalSmallUML.g:1028:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalSmallUML.g:1028:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalSmallUML.g:1029:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalSmallUML.g:1035:1: ruleCardinality returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleEInt ) ) otherlv_4= ']' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1041:2: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleEInt ) ) otherlv_4= ']' ) )
            // InternalSmallUML.g:1042:2: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleEInt ) ) otherlv_4= ']' )
            {
            // InternalSmallUML.g:1042:2: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleEInt ) ) otherlv_4= ']' )
            // InternalSmallUML.g:1043:3: otherlv_0= '[' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleEInt ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSmallUML.g:1047:3: ( (lv_lowerBound_1_0= ruleEInt ) )
            // InternalSmallUML.g:1048:4: (lv_lowerBound_1_0= ruleEInt )
            {
            // InternalSmallUML.g:1048:4: (lv_lowerBound_1_0= ruleEInt )
            // InternalSmallUML.g:1049:5: lv_lowerBound_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_lowerBound_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_1_0,
            						"org.alma.smalluml.SmallUML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getCommaKeyword_2());
            		
            // InternalSmallUML.g:1070:3: ( (lv_upperBound_3_0= ruleEInt ) )
            // InternalSmallUML.g:1071:4: (lv_upperBound_3_0= ruleEInt )
            {
            // InternalSmallUML.g:1071:4: (lv_upperBound_3_0= ruleEInt )
            // InternalSmallUML.g:1072:5: lv_upperBound_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getUpperBoundEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
            lv_upperBound_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_3_0,
            						"org.alma.smalluml.SmallUML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCardinality"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002060002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000003E0001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000003E0001800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});

}