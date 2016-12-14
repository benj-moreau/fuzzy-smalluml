package org.alma.uml.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.alma.uml.smalluml.services.SmallUmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Abstract'", "'Class'", "'extends'", "','", "'{'", "'attributes'", "'}'", "'methods'", "'Relation'", "'from'", "'to'", "'cardinality'", "':'", "'('", "')'", "'['", "']'", "'-'", "'Enumeration'", "'ConcreteType'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

        public InternalSmallUmlParser(TokenStream input, SmallUmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Package";
       	}

       	@Override
       	protected SmallUmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackage"
    // InternalSmallUml.g:64:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSmallUml.g:64:48: (iv_rulePackage= rulePackage EOF )
            // InternalSmallUml.g:65:2: iv_rulePackage= rulePackage EOF
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
    // InternalSmallUml.g:71:1: rulePackage returns [EObject current=null] : ( () ( ( (lv_class_1_0= ruleClass ) ) otherlv_2= ';' )* ( ( (lv_relation_3_0= ruleRelation ) ) otherlv_4= ';' )* ( ( (lv_types_5_0= ruleType ) ) otherlv_6= ';' )* ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_class_1_0 = null;

        EObject lv_relation_3_0 = null;

        EObject lv_types_5_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:77:2: ( ( () ( ( (lv_class_1_0= ruleClass ) ) otherlv_2= ';' )* ( ( (lv_relation_3_0= ruleRelation ) ) otherlv_4= ';' )* ( ( (lv_types_5_0= ruleType ) ) otherlv_6= ';' )* ) )
            // InternalSmallUml.g:78:2: ( () ( ( (lv_class_1_0= ruleClass ) ) otherlv_2= ';' )* ( ( (lv_relation_3_0= ruleRelation ) ) otherlv_4= ';' )* ( ( (lv_types_5_0= ruleType ) ) otherlv_6= ';' )* )
            {
            // InternalSmallUml.g:78:2: ( () ( ( (lv_class_1_0= ruleClass ) ) otherlv_2= ';' )* ( ( (lv_relation_3_0= ruleRelation ) ) otherlv_4= ';' )* ( ( (lv_types_5_0= ruleType ) ) otherlv_6= ';' )* )
            // InternalSmallUml.g:79:3: () ( ( (lv_class_1_0= ruleClass ) ) otherlv_2= ';' )* ( ( (lv_relation_3_0= ruleRelation ) ) otherlv_4= ';' )* ( ( (lv_types_5_0= ruleType ) ) otherlv_6= ';' )*
            {
            // InternalSmallUml.g:79:3: ()
            // InternalSmallUml.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            // InternalSmallUml.g:86:3: ( ( (lv_class_1_0= ruleClass ) ) otherlv_2= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmallUml.g:87:4: ( (lv_class_1_0= ruleClass ) ) otherlv_2= ';'
            	    {
            	    // InternalSmallUml.g:87:4: ( (lv_class_1_0= ruleClass ) )
            	    // InternalSmallUml.g:88:5: (lv_class_1_0= ruleClass )
            	    {
            	    // InternalSmallUml.g:88:5: (lv_class_1_0= ruleClass )
            	    // InternalSmallUml.g:89:6: lv_class_1_0= ruleClass
            	    {

            	    						newCompositeNode(grammarAccess.getPackageAccess().getClassClassParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_class_1_0=ruleClass();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"class",
            	    							lv_class_1_0,
            	    							"org.alma.uml.smalluml.SmallUml.Class");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSmallUml.g:111:3: ( ( (lv_relation_3_0= ruleRelation ) ) otherlv_4= ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmallUml.g:112:4: ( (lv_relation_3_0= ruleRelation ) ) otherlv_4= ';'
            	    {
            	    // InternalSmallUml.g:112:4: ( (lv_relation_3_0= ruleRelation ) )
            	    // InternalSmallUml.g:113:5: (lv_relation_3_0= ruleRelation )
            	    {
            	    // InternalSmallUml.g:113:5: (lv_relation_3_0= ruleRelation )
            	    // InternalSmallUml.g:114:6: lv_relation_3_0= ruleRelation
            	    {

            	    						newCompositeNode(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_relation_3_0=ruleRelation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relation",
            	    							lv_relation_3_0,
            	    							"org.alma.uml.smalluml.SmallUml.Relation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,11,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSmallUml.g:136:3: ( ( (lv_types_5_0= ruleType ) ) otherlv_6= ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=30 && LA3_0<=31)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmallUml.g:137:4: ( (lv_types_5_0= ruleType ) ) otherlv_6= ';'
            	    {
            	    // InternalSmallUml.g:137:4: ( (lv_types_5_0= ruleType ) )
            	    // InternalSmallUml.g:138:5: (lv_types_5_0= ruleType )
            	    {
            	    // InternalSmallUml.g:138:5: (lv_types_5_0= ruleType )
            	    // InternalSmallUml.g:139:6: lv_types_5_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_types_5_0=ruleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_5_0,
            	    							"org.alma.uml.smalluml.SmallUml.Type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,11,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalSmallUml.g:165:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmallUml.g:165:45: (iv_ruleType= ruleType EOF )
            // InternalSmallUml.g:166:2: iv_ruleType= ruleType EOF
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
    // InternalSmallUml.g:172:1: ruleType returns [EObject current=null] : (this_Enumeration_0= ruleEnumeration | this_ConcreteType_1= ruleConcreteType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Enumeration_0 = null;

        EObject this_ConcreteType_1 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:178:2: ( (this_Enumeration_0= ruleEnumeration | this_ConcreteType_1= ruleConcreteType ) )
            // InternalSmallUml.g:179:2: (this_Enumeration_0= ruleEnumeration | this_ConcreteType_1= ruleConcreteType )
            {
            // InternalSmallUml.g:179:2: (this_Enumeration_0= ruleEnumeration | this_ConcreteType_1= ruleConcreteType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==31) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUml.g:180:3: this_Enumeration_0= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_0=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUml.g:189:3: this_ConcreteType_1= ruleConcreteType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getConcreteTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConcreteType_1=ruleConcreteType();

                    state._fsp--;


                    			current = this_ConcreteType_1;
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


    // $ANTLR start "entryRuleClass"
    // InternalSmallUml.g:201:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUml.g:201:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUml.g:202:2: iv_ruleClass= ruleClass EOF
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
    // InternalSmallUml.g:208:1: ruleClass returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'Abstract' ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )? (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // InternalSmallUml.g:214:2: ( ( ( (lv_isAbstract_0_0= 'Abstract' ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )? (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalSmallUml.g:215:2: ( ( (lv_isAbstract_0_0= 'Abstract' ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )? (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalSmallUml.g:215:2: ( ( (lv_isAbstract_0_0= 'Abstract' ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )? (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalSmallUml.g:216:3: ( (lv_isAbstract_0_0= 'Abstract' ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )? (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalSmallUml.g:216:3: ( (lv_isAbstract_0_0= 'Abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallUml.g:217:4: (lv_isAbstract_0_0= 'Abstract' )
                    {
                    // InternalSmallUml.g:217:4: (lv_isAbstract_0_0= 'Abstract' )
                    // InternalSmallUml.g:218:5: lv_isAbstract_0_0= 'Abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,12,FOLLOW_7); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "Abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalSmallUml.g:234:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUml.g:235:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUml.g:235:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUml.g:236:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalSmallUml.g:252:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUml.g:253:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSmallUml.g:257:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSmallUml.g:258:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSmallUml.g:258:5: (otherlv_4= RULE_ID )
                    // InternalSmallUml.g:259:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_4, grammarAccess.getClassAccess().getParentsClassCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalSmallUml.g:270:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSmallUml.g:271:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalSmallUml.g:275:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalSmallUml.g:276:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalSmallUml.g:276:6: (otherlv_6= RULE_ID )
                    	    // InternalSmallUml.g:277:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getClassAccess().getParentsClassCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUml.g:294:3: (otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUml.g:295:4: otherlv_8= 'attributes' otherlv_9= '{' ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getClassAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUml.g:303:4: ( (lv_attributes_10_0= ruleAttribute ) )
                    // InternalSmallUml.g:304:5: (lv_attributes_10_0= ruleAttribute )
                    {
                    // InternalSmallUml.g:304:5: (lv_attributes_10_0= ruleAttribute )
                    // InternalSmallUml.g:305:6: lv_attributes_10_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_attributes_10_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_10_0,
                    							"org.alma.uml.smalluml.SmallUml.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUml.g:322:4: ( (lv_attributes_11_0= ruleAttribute ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSmallUml.g:323:5: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUml.g:323:5: (lv_attributes_11_0= ruleAttribute )
                    	    // InternalSmallUml.g:324:6: lv_attributes_11_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_attributes_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_11_0,
                    	    							"org.alma.uml.smalluml.SmallUml.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSmallUml.g:346:3: (otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUml.g:347:4: otherlv_13= 'methods' otherlv_14= '{' ( (lv_methods_15_0= ruleMethod ) ) ( (lv_methods_16_0= ruleMethod ) )* otherlv_17= '}'
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getMethodsKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSmallUml.g:355:4: ( (lv_methods_15_0= ruleMethod ) )
                    // InternalSmallUml.g:356:5: (lv_methods_15_0= ruleMethod )
                    {
                    // InternalSmallUml.g:356:5: (lv_methods_15_0= ruleMethod )
                    // InternalSmallUml.g:357:6: lv_methods_15_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_methods_15_0=ruleMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"methods",
                    							lv_methods_15_0,
                    							"org.alma.uml.smalluml.SmallUml.Method");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUml.g:374:4: ( (lv_methods_16_0= ruleMethod ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSmallUml.g:375:5: (lv_methods_16_0= ruleMethod )
                    	    {
                    	    // InternalSmallUml.g:375:5: (lv_methods_16_0= ruleMethod )
                    	    // InternalSmallUml.g:376:6: lv_methods_16_0= ruleMethod
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_3_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_methods_16_0=ruleMethod();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"methods",
                    	    							lv_methods_16_0,
                    	    							"org.alma.uml.smalluml.SmallUml.Method");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRelation"
    // InternalSmallUml.g:406:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalSmallUml.g:406:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalSmallUml.g:407:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalSmallUml.g:413:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_cardinality_8_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:419:2: ( (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' ) )
            // InternalSmallUml.g:420:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' )
            {
            // InternalSmallUml.g:420:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}' )
            // InternalSmallUml.g:421:3: otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cardinality' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalSmallUml.g:425:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallUml.g:426:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallUml.g:426:4: (lv_name_1_0= RULE_ID )
            // InternalSmallUml.g:427:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getFromKeyword_3());
            		
            // InternalSmallUml.g:451:3: ( (otherlv_4= RULE_ID ) )
            // InternalSmallUml.g:452:4: (otherlv_4= RULE_ID )
            {
            // InternalSmallUml.g:452:4: (otherlv_4= RULE_ID )
            // InternalSmallUml.g:453:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getFromClassCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getToKeyword_5());
            		
            // InternalSmallUml.g:468:3: ( (otherlv_6= RULE_ID ) )
            // InternalSmallUml.g:469:4: (otherlv_6= RULE_ID )
            {
            // InternalSmallUml.g:469:4: (otherlv_6= RULE_ID )
            // InternalSmallUml.g:470:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getToClassCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getCardinalityKeyword_7());
            		
            // InternalSmallUml.g:485:3: ( (lv_cardinality_8_0= ruleCardinality ) )
            // InternalSmallUml.g:486:4: (lv_cardinality_8_0= ruleCardinality )
            {
            // InternalSmallUml.g:486:4: (lv_cardinality_8_0= ruleCardinality )
            // InternalSmallUml.g:487:5: lv_cardinality_8_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_cardinality_8_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_8_0,
            						"org.alma.uml.smalluml.SmallUml.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalSmallUml.g:512:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUml.g:512:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUml.g:513:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmallUml.g:519:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUml.g:525:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUml.g:526:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUml.g:526:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallUml.g:527:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUml.g:535:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUml.g:546:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUml.g:546:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUml.g:547:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSmallUml.g:553:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:559:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalSmallUml.g:560:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalSmallUml.g:560:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            // InternalSmallUml.g:561:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalSmallUml.g:561:3: ( (lv_name_0_0= ruleEString ) )
            // InternalSmallUml.g:562:4: (lv_name_0_0= ruleEString )
            {
            // InternalSmallUml.g:562:4: (lv_name_0_0= ruleEString )
            // InternalSmallUml.g:563:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.alma.uml.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalSmallUml.g:584:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmallUml.g:585:4: (otherlv_2= RULE_ID )
            {
            // InternalSmallUml.g:585:4: (otherlv_2= RULE_ID )
            // InternalSmallUml.g:586:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypedValueTypeCrossReference_2_0());
            				

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
    // InternalSmallUml.g:605:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalSmallUml.g:605:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalSmallUml.g:606:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalSmallUml.g:612:1: ruleMethod returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )? otherlv_9= ';' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:618:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )? otherlv_9= ';' ) )
            // InternalSmallUml.g:619:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )? otherlv_9= ';' )
            {
            // InternalSmallUml.g:619:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )? otherlv_9= ';' )
            // InternalSmallUml.g:620:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )? otherlv_9= ';'
            {
            // InternalSmallUml.g:620:3: ()
            // InternalSmallUml.g:621:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            // InternalSmallUml.g:627:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallUml.g:628:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallUml.g:628:4: (lv_name_1_0= RULE_ID )
            // InternalSmallUml.g:629:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSmallUml.g:649:3: ( ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUml.g:650:4: ( (lv_parameters_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )*
                    {
                    // InternalSmallUml.g:650:4: ( (lv_parameters_3_0= ruleAttribute ) )
                    // InternalSmallUml.g:651:5: (lv_parameters_3_0= ruleAttribute )
                    {
                    // InternalSmallUml.g:651:5: (lv_parameters_3_0= ruleAttribute )
                    // InternalSmallUml.g:652:6: lv_parameters_3_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_parameters_3_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"org.alma.uml.smalluml.SmallUml.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUml.g:669:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSmallUml.g:670:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleAttribute ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSmallUml.g:674:5: ( (lv_parameters_5_0= ruleAttribute ) )
                    	    // InternalSmallUml.g:675:6: (lv_parameters_5_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUml.g:675:6: (lv_parameters_5_0= ruleAttribute )
                    	    // InternalSmallUml.g:676:7: lv_parameters_5_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_parameters_5_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"org.alma.uml.smalluml.SmallUml.Attribute");
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

            otherlv_6=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getColonKeyword_5());
            		
            // InternalSmallUml.g:703:3: ( (otherlv_8= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmallUml.g:704:4: (otherlv_8= RULE_ID )
                    {
                    // InternalSmallUml.g:704:4: (otherlv_8= RULE_ID )
                    // InternalSmallUml.g:705:5: otherlv_8= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    				
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getReturnTypedValueTypeCrossReference_6_0());
                    				

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


    // $ANTLR start "entryRuleCardinality"
    // InternalSmallUml.g:724:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalSmallUml.g:724:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalSmallUml.g:725:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalSmallUml.g:731:1: ruleCardinality returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleEInt ) ) otherlv_4= ']' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:737:2: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleEInt ) ) otherlv_4= ']' ) )
            // InternalSmallUml.g:738:2: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleEInt ) ) otherlv_4= ']' )
            {
            // InternalSmallUml.g:738:2: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleEInt ) ) otherlv_4= ']' )
            // InternalSmallUml.g:739:3: otherlv_0= '[' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleEInt ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSmallUml.g:743:3: ( (lv_lowerBound_1_0= ruleEInt ) )
            // InternalSmallUml.g:744:4: (lv_lowerBound_1_0= ruleEInt )
            {
            // InternalSmallUml.g:744:4: (lv_lowerBound_1_0= ruleEInt )
            // InternalSmallUml.g:745:5: lv_lowerBound_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_lowerBound_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_1_0,
            						"org.alma.uml.smalluml.SmallUml.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getCommaKeyword_2());
            		
            // InternalSmallUml.g:766:3: ( (lv_upperBound_3_0= ruleEInt ) )
            // InternalSmallUml.g:767:4: (lv_upperBound_3_0= ruleEInt )
            {
            // InternalSmallUml.g:767:4: (lv_upperBound_3_0= ruleEInt )
            // InternalSmallUml.g:768:5: lv_upperBound_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getUpperBoundEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_upperBound_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_3_0,
            						"org.alma.uml.smalluml.SmallUml.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUml.g:793:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUml.g:793:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUml.g:794:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSmallUml.g:800:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUml.g:806:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmallUml.g:807:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmallUml.g:807:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmallUml.g:808:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmallUml.g:808:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUml.g:809:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_30); 

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


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUml.g:826:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUml.g:826:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUml.g:827:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalSmallUml.g:833:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_value_3_0= ruleEnumerationElement ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleEnumerationElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_3_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:839:2: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_value_3_0= ruleEnumerationElement ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleEnumerationElement ) ) )* otherlv_6= '}' ) )
            // InternalSmallUml.g:840:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_value_3_0= ruleEnumerationElement ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleEnumerationElement ) ) )* otherlv_6= '}' )
            {
            // InternalSmallUml.g:840:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_value_3_0= ruleEnumerationElement ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleEnumerationElement ) ) )* otherlv_6= '}' )
            // InternalSmallUml.g:841:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_value_3_0= ruleEnumerationElement ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleEnumerationElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalSmallUml.g:845:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallUml.g:846:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallUml.g:846:4: (lv_name_1_0= RULE_ID )
            // InternalSmallUml.g:847:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmallUml.g:867:3: ( (lv_value_3_0= ruleEnumerationElement ) )
            // InternalSmallUml.g:868:4: (lv_value_3_0= ruleEnumerationElement )
            {
            // InternalSmallUml.g:868:4: (lv_value_3_0= ruleEnumerationElement )
            // InternalSmallUml.g:869:5: lv_value_3_0= ruleEnumerationElement
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getValueEnumerationElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_value_3_0=ruleEnumerationElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.alma.uml.smalluml.SmallUml.EnumerationElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUml.g:886:3: (otherlv_4= ',' ( (lv_value_5_0= ruleEnumerationElement ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSmallUml.g:887:4: otherlv_4= ',' ( (lv_value_5_0= ruleEnumerationElement ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSmallUml.g:891:4: ( (lv_value_5_0= ruleEnumerationElement ) )
            	    // InternalSmallUml.g:892:5: (lv_value_5_0= ruleEnumerationElement )
            	    {
            	    // InternalSmallUml.g:892:5: (lv_value_5_0= ruleEnumerationElement )
            	    // InternalSmallUml.g:893:6: lv_value_5_0= ruleEnumerationElement
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getValueEnumerationElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_value_5_0=ruleEnumerationElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_5_0,
            	    							"org.alma.uml.smalluml.SmallUml.EnumerationElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleConcreteType"
    // InternalSmallUml.g:919:1: entryRuleConcreteType returns [EObject current=null] : iv_ruleConcreteType= ruleConcreteType EOF ;
    public final EObject entryRuleConcreteType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteType = null;


        try {
            // InternalSmallUml.g:919:53: (iv_ruleConcreteType= ruleConcreteType EOF )
            // InternalSmallUml.g:920:2: iv_ruleConcreteType= ruleConcreteType EOF
            {
             newCompositeNode(grammarAccess.getConcreteTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcreteType=ruleConcreteType();

            state._fsp--;

             current =iv_ruleConcreteType; 
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
    // $ANTLR end "entryRuleConcreteType"


    // $ANTLR start "ruleConcreteType"
    // InternalSmallUml.g:926:1: ruleConcreteType returns [EObject current=null] : ( () otherlv_1= 'ConcreteType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleConcreteType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:932:2: ( ( () otherlv_1= 'ConcreteType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUml.g:933:2: ( () otherlv_1= 'ConcreteType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUml.g:933:2: ( () otherlv_1= 'ConcreteType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUml.g:934:3: () otherlv_1= 'ConcreteType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUml.g:934:3: ()
            // InternalSmallUml.g:935:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcreteTypeAccess().getConcreteTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getConcreteTypeAccess().getConcreteTypeKeyword_1());
            		
            // InternalSmallUml.g:945:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUml.g:946:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUml.g:946:4: (lv_name_2_0= ruleEString )
            // InternalSmallUml.g:947:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConcreteTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConcreteTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.alma.uml.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleConcreteType"


    // $ANTLR start "entryRuleEnumerationElement"
    // InternalSmallUml.g:968:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalSmallUml.g:968:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalSmallUml.g:969:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
            {
             newCompositeNode(grammarAccess.getEnumerationElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationElement=ruleEnumerationElement();

            state._fsp--;

             current =iv_ruleEnumerationElement; 
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
    // $ANTLR end "entryRuleEnumerationElement"


    // $ANTLR start "ruleEnumerationElement"
    // InternalSmallUml.g:975:1: ruleEnumerationElement returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmallUml.g:981:2: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalSmallUml.g:982:2: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalSmallUml.g:982:2: ( (lv_value_0_0= RULE_ID ) )
            // InternalSmallUml.g:983:3: (lv_value_0_0= RULE_ID )
            {
            // InternalSmallUml.g:983:3: (lv_value_0_0= RULE_ID )
            // InternalSmallUml.g:984:4: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getEnumerationElementAccess().getValueIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnumerationElementRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
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
    // $ANTLR end "ruleEnumerationElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000C0103002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000C0100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000048000L});

}