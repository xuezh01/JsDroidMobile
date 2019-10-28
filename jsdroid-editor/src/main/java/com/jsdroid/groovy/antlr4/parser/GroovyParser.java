// Generated from D:/project/jsdroid/idea/JsDroidMobile/jsdroid-editor/src/main/antlr\GroovyParser.g4 by ANTLR 4.7.2

package com.jsdroid.groovy.antlr4.parser;
    import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GroovyParser extends AbstractParser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StringLiteral=1, GStringBegin=2, GStringEnd=3, GStringPart=4, GStringPathPart=5, 
		RollBackOne=6, AS=7, DEF=8, IN=9, TRAIT=10, THREADSAFE=11, VAR=12, BuiltInPrimitiveType=13, 
		ABSTRACT=14, ASSERT=15, BREAK=16, CASE=17, CATCH=18, CLASS=19, CONST=20, 
		CONTINUE=21, DEFAULT=22, DO=23, ELSE=24, ENUM=25, EXTENDS=26, FINAL=27, 
		FINALLY=28, FOR=29, IF=30, GOTO=31, IMPLEMENTS=32, IMPORT=33, INSTANCEOF=34, 
		INTERFACE=35, NATIVE=36, NEW=37, PACKAGE=38, PRIVATE=39, PROTECTED=40, 
		PUBLIC=41, RETURN=42, STATIC=43, STRICTFP=44, SUPER=45, SWITCH=46, SYNCHRONIZED=47, 
		THIS=48, THROW=49, THROWS=50, TRANSIENT=51, TRY=52, VOID=53, VOLATILE=54, 
		WHILE=55, IntegerLiteral=56, FloatingPointLiteral=57, BooleanLiteral=58, 
		NullLiteral=59, RANGE_INCLUSIVE=60, RANGE_EXCLUSIVE=61, SPREAD_DOT=62, 
		SAFE_DOT=63, SAFE_CHAIN_DOT=64, ELVIS=65, METHOD_POINTER=66, METHOD_REFERENCE=67, 
		REGEX_FIND=68, REGEX_MATCH=69, POWER=70, POWER_ASSIGN=71, SPACESHIP=72, 
		IDENTICAL=73, NOT_IDENTICAL=74, ARROW=75, NOT_INSTANCEOF=76, NOT_IN=77, 
		LPAREN=78, RPAREN=79, LBRACE=80, RBRACE=81, LBRACK=82, RBRACK=83, SEMI=84, 
		COMMA=85, DOT=86, ASSIGN=87, GT=88, LT=89, NOT=90, BITNOT=91, QUESTION=92, 
		COLON=93, EQUAL=94, LE=95, GE=96, NOTEQUAL=97, AND=98, OR=99, INC=100, 
		DEC=101, ADD=102, SUB=103, MUL=104, DIV=105, BITAND=106, BITOR=107, XOR=108, 
		MOD=109, ADD_ASSIGN=110, SUB_ASSIGN=111, MUL_ASSIGN=112, DIV_ASSIGN=113, 
		AND_ASSIGN=114, OR_ASSIGN=115, XOR_ASSIGN=116, MOD_ASSIGN=117, LSHIFT_ASSIGN=118, 
		RSHIFT_ASSIGN=119, URSHIFT_ASSIGN=120, ELVIS_ASSIGN=121, CapitalizedIdentifier=122, 
		Identifier=123, AT=124, ELLIPSIS=125, WS=126, NL=127, SH_COMMENT=128, 
		UNEXPECTED_CHAR=129;
	public static final int
		RULE_root = 0, RULE_statements = 1, RULE_packageDeclaration = 2, RULE_importDeclaration = 3, 
		RULE_typeDeclaration = 4, RULE_modifier = 5, RULE_modifiersOpt = 6, RULE_modifiers = 7, 
		RULE_classOrInterfaceModifiersOpt = 8, RULE_classOrInterfaceModifiers = 9, 
		RULE_classOrInterfaceModifier = 10, RULE_variableModifier = 11, RULE_variableModifiersOpt = 12, 
		RULE_variableModifiers = 13, RULE_typeParameters = 14, RULE_typeParameter = 15, 
		RULE_typeBound = 16, RULE_typeList = 17, RULE_classDeclaration = 18, RULE_classBody = 19, 
		RULE_enumConstants = 20, RULE_enumConstant = 21, RULE_classBodyDeclaration = 22, 
		RULE_memberDeclaration = 23, RULE_methodDeclaration = 24, RULE_methodName = 25, 
		RULE_returnType = 26, RULE_fieldDeclaration = 27, RULE_variableDeclarators = 28, 
		RULE_variableDeclarator = 29, RULE_variableDeclaratorId = 30, RULE_variableInitializer = 31, 
		RULE_variableInitializers = 32, RULE_dims = 33, RULE_dimsOpt = 34, RULE_standardType = 35, 
		RULE_type = 36, RULE_classOrInterfaceType = 37, RULE_generalClassOrInterfaceType = 38, 
		RULE_standardClassOrInterfaceType = 39, RULE_primitiveType = 40, RULE_typeArguments = 41, 
		RULE_typeArgument = 42, RULE_annotatedQualifiedClassName = 43, RULE_qualifiedClassNameList = 44, 
		RULE_formalParameters = 45, RULE_formalParameterList = 46, RULE_thisFormalParameter = 47, 
		RULE_formalParameter = 48, RULE_methodBody = 49, RULE_qualifiedName = 50, 
		RULE_qualifiedNameElement = 51, RULE_qualifiedNameElements = 52, RULE_qualifiedClassName = 53, 
		RULE_qualifiedStandardClassName = 54, RULE_literal = 55, RULE_gstring = 56, 
		RULE_gstringValue = 57, RULE_gstringPath = 58, RULE_lambdaExpression = 59, 
		RULE_standardLambdaExpression = 60, RULE_lambdaParameters = 61, RULE_standardLambdaParameters = 62, 
		RULE_lambdaBody = 63, RULE_closure = 64, RULE_closureOrLambdaExpression = 65, 
		RULE_blockStatementsOpt = 66, RULE_blockStatements = 67, RULE_annotationsOpt = 68, 
		RULE_annotation = 69, RULE_elementValues = 70, RULE_annotationName = 71, 
		RULE_elementValuePairs = 72, RULE_elementValuePair = 73, RULE_elementValuePairName = 74, 
		RULE_elementValue = 75, RULE_elementValueArrayInitializer = 76, RULE_block = 77, 
		RULE_blockStatement = 78, RULE_localVariableDeclaration = 79, RULE_classifiedModifiers = 80, 
		RULE_variableDeclaration = 81, RULE_typeNamePairs = 82, RULE_typeNamePair = 83, 
		RULE_variableNames = 84, RULE_conditionalStatement = 85, RULE_ifElseStatement = 86, 
		RULE_switchStatement = 87, RULE_loopStatement = 88, RULE_continueStatement = 89, 
		RULE_breakStatement = 90, RULE_tryCatchStatement = 91, RULE_assertStatement = 92, 
		RULE_statement = 93, RULE_catchClause = 94, RULE_catchType = 95, RULE_finallyBlock = 96, 
		RULE_resources = 97, RULE_resourceList = 98, RULE_resource = 99, RULE_switchBlockStatementGroup = 100, 
		RULE_switchLabel = 101, RULE_forControl = 102, RULE_enhancedForControl = 103, 
		RULE_classicalForControl = 104, RULE_forInit = 105, RULE_forUpdate = 106, 
		RULE_castParExpression = 107, RULE_parExpression = 108, RULE_expressionInPar = 109, 
		RULE_expressionList = 110, RULE_expressionListElement = 111, RULE_enhancedStatementExpression = 112, 
		RULE_statementExpression = 113, RULE_postfixExpression = 114, RULE_expression = 115, 
		RULE_castOperandExpression = 116, RULE_commandExpression = 117, RULE_commandArgument = 118, 
		RULE_pathExpression = 119, RULE_pathElement = 120, RULE_namePart = 121, 
		RULE_dynamicMemberName = 122, RULE_indexPropertyArgs = 123, RULE_namedPropertyArgs = 124, 
		RULE_primary = 125, RULE_list = 126, RULE_map = 127, RULE_mapEntryList = 128, 
		RULE_mapEntry = 129, RULE_mapEntryLabel = 130, RULE_creator = 131, RULE_arrayInitializer = 132, 
		RULE_anonymousInnerClassDeclaration = 133, RULE_createdName = 134, RULE_nonWildcardTypeArguments = 135, 
		RULE_typeArgumentsOrDiamond = 136, RULE_arguments = 137, RULE_argumentList = 138, 
		RULE_enhancedArgumentList = 139, RULE_argumentListElement = 140, RULE_enhancedArgumentListElement = 141, 
		RULE_stringLiteral = 142, RULE_className = 143, RULE_identifier = 144, 
		RULE_builtInType = 145, RULE_keywords = 146, RULE_rparen = 147, RULE_nls = 148, 
		RULE_sep = 149, RULE_error = 150, RULE_constructorTip = 151, RULE_classTip = 152, 
		RULE_methodOrFieldTip = 153, RULE_variableTip = 154, RULE_pathEnd = 155;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "statements", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "modifiersOpt", "modifiers", "classOrInterfaceModifiersOpt", 
			"classOrInterfaceModifiers", "classOrInterfaceModifier", "variableModifier", 
			"variableModifiersOpt", "variableModifiers", "typeParameters", "typeParameter", 
			"typeBound", "typeList", "classDeclaration", "classBody", "enumConstants", 
			"enumConstant", "classBodyDeclaration", "memberDeclaration", "methodDeclaration", 
			"methodName", "returnType", "fieldDeclaration", "variableDeclarators", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"variableInitializers", "dims", "dimsOpt", "standardType", "type", "classOrInterfaceType", 
			"generalClassOrInterfaceType", "standardClassOrInterfaceType", "primitiveType", 
			"typeArguments", "typeArgument", "annotatedQualifiedClassName", "qualifiedClassNameList", 
			"formalParameters", "formalParameterList", "thisFormalParameter", "formalParameter", 
			"methodBody", "qualifiedName", "qualifiedNameElement", "qualifiedNameElements", 
			"qualifiedClassName", "qualifiedStandardClassName", "literal", "gstring", 
			"gstringValue", "gstringPath", "lambdaExpression", "standardLambdaExpression", 
			"lambdaParameters", "standardLambdaParameters", "lambdaBody", "closure", 
			"closureOrLambdaExpression", "blockStatementsOpt", "blockStatements", 
			"annotationsOpt", "annotation", "elementValues", "annotationName", "elementValuePairs", 
			"elementValuePair", "elementValuePairName", "elementValue", "elementValueArrayInitializer", 
			"block", "blockStatement", "localVariableDeclaration", "classifiedModifiers", 
			"variableDeclaration", "typeNamePairs", "typeNamePair", "variableNames", 
			"conditionalStatement", "ifElseStatement", "switchStatement", "loopStatement", 
			"continueStatement", "breakStatement", "tryCatchStatement", "assertStatement", 
			"statement", "catchClause", "catchType", "finallyBlock", "resources", 
			"resourceList", "resource", "switchBlockStatementGroup", "switchLabel", 
			"forControl", "enhancedForControl", "classicalForControl", "forInit", 
			"forUpdate", "castParExpression", "parExpression", "expressionInPar", 
			"expressionList", "expressionListElement", "enhancedStatementExpression", 
			"statementExpression", "postfixExpression", "expression", "castOperandExpression", 
			"commandExpression", "commandArgument", "pathExpression", "pathElement", 
			"namePart", "dynamicMemberName", "indexPropertyArgs", "namedPropertyArgs", 
			"primary", "list", "map", "mapEntryList", "mapEntry", "mapEntryLabel", 
			"creator", "arrayInitializer", "anonymousInnerClassDeclaration", "createdName", 
			"nonWildcardTypeArguments", "typeArgumentsOrDiamond", "arguments", "argumentList", 
			"enhancedArgumentList", "argumentListElement", "enhancedArgumentListElement", 
			"stringLiteral", "className", "identifier", "builtInType", "keywords", 
			"rparen", "nls", "sep", "error", "constructorTip", "classTip", "methodOrFieldTip", 
			"variableTip", "pathEnd"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'as'", "'def'", "'in'", "'trait'", 
			"'threadsafe'", "'var'", null, "'abstract'", "'assert'", "'break'", "'case'", 
			"'catch'", "'class'", "'const'", "'continue'", "'default'", "'do'", "'else'", 
			"'enum'", "'extends'", "'final'", "'finally'", "'for'", "'if'", "'goto'", 
			"'implements'", "'import'", "'instanceof'", "'interface'", "'native'", 
			"'new'", "'package'", "'private'", "'protected'", "'public'", "'return'", 
			"'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", 
			"'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
			"'while'", null, null, null, "'null'", "'..'", "'..<'", "'*.'", "'?.'", 
			"'??.'", "'?:'", "'.&'", "'::'", "'=~'", "'==~'", "'**'", "'**='", "'<=>'", 
			"'==='", "'!=='", "'->'", "'!instanceof'", "'!in'", null, null, null, 
			null, null, null, "';'", "','", null, "'='", "'>'", "'<'", "'!'", "'~'", 
			"'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
			"'--'", "'+'", "'-'", "'*'", null, "'&'", "'|'", "'^'", "'%'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
			"'>>>='", "'?='", null, null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StringLiteral", "GStringBegin", "GStringEnd", "GStringPart", "GStringPathPart", 
			"RollBackOne", "AS", "DEF", "IN", "TRAIT", "THREADSAFE", "VAR", "BuiltInPrimitiveType", 
			"ABSTRACT", "ASSERT", "BREAK", "CASE", "CATCH", "CLASS", "CONST", "CONTINUE", 
			"DEFAULT", "DO", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FOR", 
			"IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INTERFACE", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "STATIC", 
			"STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
			"TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "NullLiteral", "RANGE_INCLUSIVE", "RANGE_EXCLUSIVE", 
			"SPREAD_DOT", "SAFE_DOT", "SAFE_CHAIN_DOT", "ELVIS", "METHOD_POINTER", 
			"METHOD_REFERENCE", "REGEX_FIND", "REGEX_MATCH", "POWER", "POWER_ASSIGN", 
			"SPACESHIP", "IDENTICAL", "NOT_IDENTICAL", "ARROW", "NOT_INSTANCEOF", 
			"NOT_IN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "NOT", "BITNOT", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "XOR", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"ELVIS_ASSIGN", "CapitalizedIdentifier", "Identifier", "AT", "ELLIPSIS", 
			"WS", "NL", "SH_COMMENT", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GroovyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    public static class GroovyParserRuleContext extends ParserRuleContext {
	        private Map metaDataMap = null;

	        public GroovyParserRuleContext() {}

	        public GroovyParserRuleContext(ParserRuleContext parent, int invokingStateNumber) {
	            super(parent, invokingStateNumber);
	        }

	        public Map<?, ?> getMetaDataMap() {
	            return this.metaDataMap;
	        }

	        public void setMetaDataMap(Map<?, ?> metaDataMap) {
	            this.metaDataMap = metaDataMap;
	        }
	    }

	    @Override
	    public int getSyntaxErrorSource() {
	        return GroovySyntaxError.PARSER;
	    }

	    @Override
	    public int getErrorLine() {
	        Token token = _input.LT(-1);

	        if (null == token) {
	            return -1;
	        }

	        return token.getLine();
	    }

	    @Override
	    public int getErrorColumn() {
	        Token token = _input.LT(-1);

	        if (null == token) {
	            return -1;
	        }

	        return token.getCharPositionInLine() + 1 + token.getText().length();
	    }

	public GroovyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends GroovyParserRuleContext {
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GroovyParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			nls();
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(313);
				packageDeclaration();
				}
				break;
			}
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(316);
				sep();
				}
				break;
			}
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(319);
				statements();
				}
				break;
			}
			setState(322);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends GroovyParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			statement();
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(325);
					sep();
					setState(326);
					statement();
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI || _la==NL) {
				{
				setState(333);
				sep();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public TerminalNode PACKAGE() { return getToken(GroovyParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			annotationsOpt();
			setState(337);
			match(PACKAGE);
			setState(338);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends GroovyParserRuleContext {
		public IdentifierContext alias;
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(GroovyParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(GroovyParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(GroovyParser.MUL, 0); }
		public TerminalNode AS() { return getToken(GroovyParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			annotationsOpt();
			setState(341);
			match(IMPORT);
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(342);
				match(STATIC);
				}
				break;
			}
			setState(345);
			qualifiedName();
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(346);
				match(DOT);
				setState(347);
				match(MUL);
				}
				break;
			case AS:
				{
				setState(348);
				match(AS);
				setState(349);
				((ImportDeclarationContext)_localctx).alias = identifier();
				}
				break;
			case EOF:
			case CASE:
			case DEFAULT:
			case ELSE:
			case WHILE:
			case RBRACE:
			case SEMI:
			case NL:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends GroovyParserRuleContext {
		public ClassOrInterfaceModifiersOptContext classOrInterfaceModifiersOpt() {
			return getRuleContext(ClassOrInterfaceModifiersOptContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			classOrInterfaceModifiersOpt();
			setState(353);
			classDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends GroovyParserRuleContext {
		public Token m;
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(GroovyParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(GroovyParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(GroovyParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(GroovyParser.VOLATILE, 0); }
		public TerminalNode DEF() { return getToken(GroovyParser.DEF, 0); }
		public TerminalNode VAR() { return getToken(GroovyParser.VAR, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modifier);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DEFAULT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				classOrInterfaceModifier();
				}
				break;
			case DEF:
			case VAR:
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				((ModifierContext)_localctx).m = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << VAR) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
					((ModifierContext)_localctx).m = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersOptContext extends GroovyParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ModifiersOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiersOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterModifiersOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitModifiersOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitModifiersOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersOptContext modifiersOpt() throws RecognitionException {
		ModifiersOptContext _localctx = new ModifiersOptContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_modifiersOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(359);
				modifiers();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends GroovyParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(362);
					modifier();
					setState(363);
					nls();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(367); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifiersOptContext extends GroovyParserRuleContext {
		public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
			return getRuleContext(ClassOrInterfaceModifiersContext.class,0);
		}
		public ClassOrInterfaceModifiersOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifiersOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassOrInterfaceModifiersOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassOrInterfaceModifiersOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassOrInterfaceModifiersOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifiersOptContext classOrInterfaceModifiersOpt() throws RecognitionException {
		ClassOrInterfaceModifiersOptContext _localctx = new ClassOrInterfaceModifiersOptContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classOrInterfaceModifiersOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(369);
				classOrInterfaceModifiers();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifiersContext extends GroovyParserRuleContext {
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public ClassOrInterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassOrInterfaceModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassOrInterfaceModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassOrInterfaceModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifiersContext classOrInterfaceModifiers() throws RecognitionException {
		ClassOrInterfaceModifiersContext _localctx = new ClassOrInterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classOrInterfaceModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(372);
					classOrInterfaceModifier();
					setState(373);
					nls();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(377); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends GroovyParserRuleContext {
		public Token m;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(GroovyParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(GroovyParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(GroovyParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(GroovyParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(GroovyParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(GroovyParser.STRICTFP, 0); }
		public TerminalNode DEFAULT() { return getToken(GroovyParser.DEFAULT, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				annotation();
				}
				break;
			case ABSTRACT:
			case DEFAULT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				((ClassOrInterfaceModifierContext)_localctx).m = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
					((ClassOrInterfaceModifierContext)_localctx).m = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends GroovyParserRuleContext {
		public Token m;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(GroovyParser.FINAL, 0); }
		public TerminalNode DEF() { return getToken(GroovyParser.DEF, 0); }
		public TerminalNode VAR() { return getToken(GroovyParser.VAR, 0); }
		public TerminalNode PUBLIC() { return getToken(GroovyParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(GroovyParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(GroovyParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(GroovyParser.ABSTRACT, 0); }
		public TerminalNode STRICTFP() { return getToken(GroovyParser.STRICTFP, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableModifier);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				annotation();
				}
				break;
			case DEF:
			case VAR:
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				((VariableModifierContext)_localctx).m = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << VAR) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
					((VariableModifierContext)_localctx).m = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifiersOptContext extends GroovyParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public VariableModifiersOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiersOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableModifiersOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableModifiersOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableModifiersOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifiersOptContext variableModifiersOpt() throws RecognitionException {
		VariableModifiersOptContext _localctx = new VariableModifiersOptContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableModifiersOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(387);
				variableModifiers();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifiersContext extends GroovyParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(390);
					variableModifier();
					setState(391);
					nls();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(395); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends GroovyParserRuleContext {
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(LT);
			setState(398);
			nls();
			setState(399);
			typeParameter();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(400);
				match(COMMA);
				setState(401);
				nls();
				setState(402);
				typeParameter();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			nls();
			setState(410);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends GroovyParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(GroovyParser.EXTENDS, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			className();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(413);
				match(EXTENDS);
				setState(414);
				nls();
				setState(415);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends GroovyParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(GroovyParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(GroovyParser.BITAND, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			type();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(420);
				match(BITAND);
				setState(421);
				nls();
				setState(422);
				type();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends GroovyParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			type();
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(430);
					match(COMMA);
					setState(431);
					nls();
					setState(432);
					type();
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public TypeListContext scs;
		public TypeContext sc;
		public TypeListContext is;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode CLASS() { return getToken(GroovyParser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(GroovyParser.INTERFACE, 0); }
		public TerminalNode ENUM() { return getToken(GroovyParser.ENUM, 0); }
		public TerminalNode AT() { return getToken(GroovyParser.AT, 0); }
		public TerminalNode TRAIT() { return getToken(GroovyParser.TRAIT, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(GroovyParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(GroovyParser.IMPLEMENTS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(439);
				match(CLASS);
				 ((ClassDeclarationContext)_localctx).t =  0; 
				}
				break;
			case INTERFACE:
				{
				setState(441);
				match(INTERFACE);
				 ((ClassDeclarationContext)_localctx).t =  1; 
				}
				break;
			case ENUM:
				{
				setState(443);
				match(ENUM);
				 ((ClassDeclarationContext)_localctx).t =  2; 
				}
				break;
			case AT:
				{
				setState(445);
				match(AT);
				setState(446);
				match(INTERFACE);
				 ((ClassDeclarationContext)_localctx).t =  3; 
				}
				break;
			case TRAIT:
				{
				setState(448);
				match(TRAIT);
				 ((ClassDeclarationContext)_localctx).t =  4; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(452);
			identifier();
			setState(453);
			nls();
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(454);
				if (!( 3 != _localctx.t )) throw new FailedPredicateException(this, " 3 != $t ");
				setState(456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(455);
					typeParameters();
					}
					break;
				}
				setState(458);
				nls();
				setState(472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(459);
					if (!( 2 != _localctx.t )) throw new FailedPredicateException(this, " 2 != $t ");
					setState(469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(460);
						match(EXTENDS);
						setState(461);
						nls();
						setState(465);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(462);
							if (!(1 == _localctx.t)) throw new FailedPredicateException(this, "1 == $t");
							setState(463);
							((ClassDeclarationContext)_localctx).scs = typeList();
							}
							break;
						case 2:
							{
							setState(464);
							((ClassDeclarationContext)_localctx).sc = type();
							}
							break;
						}
						setState(467);
						nls();
						}
						break;
					}
					}
					break;
				case 2:
					{
					}
					break;
				}
				setState(483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(474);
					if (!(1 != _localctx.t)) throw new FailedPredicateException(this, "1 != $t");
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IMPLEMENTS) {
						{
						setState(475);
						match(IMPLEMENTS);
						setState(476);
						nls();
						setState(477);
						((ClassDeclarationContext)_localctx).is = typeList();
						setState(478);
						nls();
						}
					}

					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(488);
				classBody(_localctx.t);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends GroovyParserRuleContext {
		public int t;
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody(int t) throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState(), t);
		enterRule(_localctx, 38, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(LBRACE);
			setState(492);
			nls();
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(493);
				if (!( 2 == _localctx.t )) throw new FailedPredicateException(this, " 2 == $t ");
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(494);
					enumConstants();
					}
					break;
				}
				setState(498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(497);
					sep();
					}
					break;
				}
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(503);
				classBodyDeclaration(_localctx.t);
				}
				break;
			}
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(506);
					sep();
					setState(507);
					classBodyDeclaration(_localctx.t);
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI || _la==NL) {
				{
				setState(514);
				sep();
				}
			}

			setState(517);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends GroovyParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			enumConstant();
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520);
					nls();
					setState(521);
					match(COMMA);
					setState(522);
					nls();
					setState(523);
					enumConstant();
					}
					} 
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(530);
				nls();
				setState(531);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AnonymousInnerClassDeclarationContext anonymousInnerClassDeclaration() {
			return getRuleContext(AnonymousInnerClassDeclarationContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			annotationsOpt();
			setState(536);
			identifier();
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(537);
				arguments();
				}
				break;
			}
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(540);
				anonymousInnerClassDeclaration(1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public TerminalNode SEMI() { return getToken(GroovyParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration(int t) throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState(), t);
		enterRule(_localctx, 44, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(544);
					match(STATIC);
					setState(545);
					nls();
					}
				}

				setState(548);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				memberDeclaration(_localctx.t);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ModifiersOptContext modifiersOpt() {
			return getRuleContext(ModifiersOptContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration(int t) throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState(), t);
		enterRule(_localctx, 46, RULE_memberDeclaration);
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				methodDeclaration(0, _localctx.t);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				modifiersOpt();
				setState(555);
				classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public int ct;
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(GroovyParser.DEFAULT, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ModifiersOptContext modifiersOpt() {
			return getRuleContext(ModifiersOptContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(GroovyParser.THROWS, 0); }
		public QualifiedClassNameListContext qualifiedClassNameList() {
			return getRuleContext(QualifiedClassNameListContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState, int t, int ct) {
			super(parent, invokingState);
			this.t = t;
			this.ct = ct;
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(int t,int ct) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), t, ct);
		enterRule(_localctx, 48, RULE_methodDeclaration);
		int _la;
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				if (!( 3 == _localctx.ct )) throw new FailedPredicateException(this, " 3 == $ct ");
				setState(560);
				returnType(_localctx.ct);
				setState(561);
				methodName();
				setState(562);
				match(LPAREN);
				setState(563);
				rparen();
				setState(568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(564);
					match(DEFAULT);
					setState(565);
					nls();
					setState(566);
					elementValue();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				modifiersOpt();
				setState(572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(571);
					typeParameters();
					}
					break;
				}
				setState(575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(574);
					returnType(_localctx.ct);
					}
					break;
				}
				setState(577);
				methodName();
				setState(578);
				formalParameters();
				setState(584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(579);
					nls();
					setState(580);
					match(THROWS);
					setState(581);
					nls();
					setState(582);
					qualifiedClassNameList();
					}
					break;
				}
				setState(586);
				nls();
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(587);
					methodBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends GroovyParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodName);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				stringLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends GroovyParserRuleContext {
		public int ct;
		public StandardTypeContext standardType() {
			return getRuleContext(StandardTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(GroovyParser.VOID, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState, int ct) {
			super(parent, invokingState);
			this.ct = ct;
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType(int ct) throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState(), ct);
		enterRule(_localctx, 52, RULE_returnType);
		try {
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				standardType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				if (!( 3 != _localctx.ct )) throw new FailedPredicateException(this, " 3 != $ct ");
				setState(598);
				match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends GroovyParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			variableDeclaration(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends GroovyParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableDeclarators);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			variableDeclarator();
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(604);
					match(COMMA);
					setState(605);
					nls();
					setState(606);
					variableDeclarator();
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends GroovyParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			variableDeclaratorId();
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(614);
				nls();
				setState(615);
				match(ASSIGN);
				setState(616);
				nls();
				setState(617);
				variableInitializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends GroovyParserRuleContext {
		public VariableTipContext variableTip() {
			return getRuleContext(VariableTipContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			variableTip();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends GroovyParserRuleContext {
		public EnhancedStatementExpressionContext enhancedStatementExpression() {
			return getRuleContext(EnhancedStatementExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			enhancedStatementExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializersContext extends GroovyParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public VariableInitializersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableInitializers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableInitializers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableInitializers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializersContext variableInitializers() throws RecognitionException {
		VariableInitializersContext _localctx = new VariableInitializersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableInitializers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			variableInitializer();
			setState(626);
			nls();
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(627);
					match(COMMA);
					setState(628);
					nls();
					setState(629);
					variableInitializer();
					setState(630);
					nls();
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(637);
			nls();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(638);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends GroovyParserRuleContext {
		public List<AnnotationsOptContext> annotationsOpt() {
			return getRuleContexts(AnnotationsOptContext.class);
		}
		public AnnotationsOptContext annotationsOpt(int i) {
			return getRuleContext(AnnotationsOptContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(GroovyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(GroovyParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(GroovyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(GroovyParser.RBRACK, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dims);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(645); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(641);
					annotationsOpt();
					setState(642);
					match(LBRACK);
					setState(643);
					match(RBRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(647); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsOptContext extends GroovyParserRuleContext {
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DimsOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimsOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterDimsOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitDimsOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitDimsOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsOptContext dimsOpt() throws RecognitionException {
		DimsOptContext _localctx = new DimsOptContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dimsOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			dims();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandardTypeContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public StandardClassOrInterfaceTypeContext standardClassOrInterfaceType() {
			return getRuleContext(StandardClassOrInterfaceTypeContext.class,0);
		}
		public DimsOptContext dimsOpt() {
			return getRuleContext(DimsOptContext.class,0);
		}
		public StandardTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStandardType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStandardType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStandardType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardTypeContext standardType() throws RecognitionException {
		StandardTypeContext _localctx = new StandardTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_standardType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			annotationsOpt();
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(652);
				primitiveType();
				}
				break;
			case 2:
				{
				setState(653);
				standardClassOrInterfaceType();
				}
				break;
			}
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(656);
				dimsOpt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public GeneralClassOrInterfaceTypeContext generalClassOrInterfaceType() {
			return getRuleContext(GeneralClassOrInterfaceTypeContext.class,0);
		}
		public DimsOptContext dimsOpt() {
			return getRuleContext(DimsOptContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(GroovyParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			annotationsOpt();
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(662);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BuiltInPrimitiveType:
					{
					setState(660);
					primitiveType();
					}
					break;
				case VOID:
					{
					setState(661);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(664);
				generalClassOrInterfaceType();
				}
				break;
			}
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(667);
				dimsOpt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends GroovyParserRuleContext {
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public QualifiedStandardClassNameContext qualifiedStandardClassName() {
			return getRuleContext(QualifiedStandardClassNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(670);
				qualifiedClassName();
				}
				break;
			case 2:
				{
				setState(671);
				qualifiedStandardClassName();
				}
				break;
			}
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(674);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralClassOrInterfaceTypeContext extends GroovyParserRuleContext {
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public GeneralClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGeneralClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGeneralClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGeneralClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralClassOrInterfaceTypeContext generalClassOrInterfaceType() throws RecognitionException {
		GeneralClassOrInterfaceTypeContext _localctx = new GeneralClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_generalClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			qualifiedClassName();
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(678);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandardClassOrInterfaceTypeContext extends GroovyParserRuleContext {
		public QualifiedStandardClassNameContext qualifiedStandardClassName() {
			return getRuleContext(QualifiedStandardClassNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public StandardClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStandardClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStandardClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStandardClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardClassOrInterfaceTypeContext standardClassOrInterfaceType() throws RecognitionException {
		StandardClassOrInterfaceTypeContext _localctx = new StandardClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_standardClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			qualifiedStandardClassName();
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(682);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends GroovyParserRuleContext {
		public TerminalNode BuiltInPrimitiveType() { return getToken(GroovyParser.BuiltInPrimitiveType, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primitiveType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(BuiltInPrimitiveType);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends GroovyParserRuleContext {
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(LT);
			setState(688);
			nls();
			setState(689);
			typeArgument();
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(690);
				match(COMMA);
				setState(691);
				nls();
				setState(692);
				typeArgument();
				}
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(699);
			nls();
			setState(700);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends GroovyParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(GroovyParser.QUESTION, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(GroovyParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(GroovyParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeArgument);
		int _la;
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				annotationsOpt();
				setState(704);
				match(QUESTION);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(705);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(706);
					nls();
					setState(707);
					type();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotatedQualifiedClassNameContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public AnnotatedQualifiedClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedQualifiedClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotatedQualifiedClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotatedQualifiedClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotatedQualifiedClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedQualifiedClassNameContext annotatedQualifiedClassName() throws RecognitionException {
		AnnotatedQualifiedClassNameContext _localctx = new AnnotatedQualifiedClassNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_annotatedQualifiedClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			annotationsOpt();
			setState(714);
			qualifiedClassName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedClassNameListContext extends GroovyParserRuleContext {
		public List<AnnotatedQualifiedClassNameContext> annotatedQualifiedClassName() {
			return getRuleContexts(AnnotatedQualifiedClassNameContext.class);
		}
		public AnnotatedQualifiedClassNameContext annotatedQualifiedClassName(int i) {
			return getRuleContext(AnnotatedQualifiedClassNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public QualifiedClassNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedClassNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedClassNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedClassNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedClassNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedClassNameListContext qualifiedClassNameList() throws RecognitionException {
		QualifiedClassNameListContext _localctx = new QualifiedClassNameListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_qualifiedClassNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			annotatedQualifiedClassName();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(717);
				match(COMMA);
				setState(718);
				nls();
				setState(719);
				annotatedQualifiedClassName();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(LPAREN);
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(727);
				formalParameterList();
				}
				break;
			}
			setState(730);
			rparen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends GroovyParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public ThisFormalParameterContext thisFormalParameter() {
			return getRuleContext(ThisFormalParameterContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(732);
				formalParameter();
				}
				break;
			case 2:
				{
				setState(733);
				thisFormalParameter();
				}
				break;
			}
			setState(742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(736);
					match(COMMA);
					setState(737);
					nls();
					setState(738);
					formalParameter();
					}
					} 
				}
				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisFormalParameterContext extends GroovyParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(GroovyParser.THIS, 0); }
		public ThisFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterThisFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitThisFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitThisFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisFormalParameterContext thisFormalParameter() throws RecognitionException {
		ThisFormalParameterContext _localctx = new ThisFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_thisFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			type();
			setState(746);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends GroovyParserRuleContext {
		public VariableModifiersOptContext variableModifiersOpt() {
			return getRuleContext(VariableModifiersOptContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(GroovyParser.ELLIPSIS, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			variableModifiersOpt();
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(749);
				type();
				}
				break;
			}
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(752);
				match(ELLIPSIS);
				}
				break;
			}
			setState(755);
			variableDeclaratorId();
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(756);
				nls();
				setState(757);
				match(ASSIGN);
				setState(758);
				nls();
				setState(759);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends GroovyParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends GroovyParserRuleContext {
		public List<QualifiedNameElementContext> qualifiedNameElement() {
			return getRuleContexts(QualifiedNameElementContext.class);
		}
		public QualifiedNameElementContext qualifiedNameElement(int i) {
			return getRuleContext(QualifiedNameElementContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(GroovyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GroovyParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			qualifiedNameElement();
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(766);
					match(DOT);
					setState(767);
					qualifiedNameElement();
					}
					} 
				}
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameElementContext extends GroovyParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEF() { return getToken(GroovyParser.DEF, 0); }
		public TerminalNode IN() { return getToken(GroovyParser.IN, 0); }
		public TerminalNode AS() { return getToken(GroovyParser.AS, 0); }
		public TerminalNode TRAIT() { return getToken(GroovyParser.TRAIT, 0); }
		public QualifiedNameElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedNameElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedNameElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedNameElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameElementContext qualifiedNameElement() throws RecognitionException {
		QualifiedNameElementContext _localctx = new QualifiedNameElementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_qualifiedNameElement);
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				match(DEF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				match(IN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(776);
				match(AS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(777);
				match(TRAIT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameElementsContext extends GroovyParserRuleContext {
		public List<QualifiedNameElementContext> qualifiedNameElement() {
			return getRuleContexts(QualifiedNameElementContext.class);
		}
		public QualifiedNameElementContext qualifiedNameElement(int i) {
			return getRuleContext(QualifiedNameElementContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(GroovyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GroovyParser.DOT, i);
		}
		public QualifiedNameElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedNameElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedNameElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedNameElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameElementsContext qualifiedNameElements() throws RecognitionException {
		QualifiedNameElementsContext _localctx = new QualifiedNameElementsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_qualifiedNameElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(780);
					qualifiedNameElement();
					setState(781);
					match(DOT);
					}
					} 
				}
				setState(787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedClassNameContext extends GroovyParserRuleContext {
		public QualifiedNameElementsContext qualifiedNameElements() {
			return getRuleContext(QualifiedNameElementsContext.class,0);
		}
		public ClassTipContext classTip() {
			return getRuleContext(ClassTipContext.class,0);
		}
		public QualifiedClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedClassNameContext qualifiedClassName() throws RecognitionException {
		QualifiedClassNameContext _localctx = new QualifiedClassNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_qualifiedClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			qualifiedNameElements();
			setState(789);
			classTip(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedStandardClassNameContext extends GroovyParserRuleContext {
		public QualifiedNameElementsContext qualifiedNameElements() {
			return getRuleContext(QualifiedNameElementsContext.class,0);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(GroovyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GroovyParser.DOT, i);
		}
		public QualifiedStandardClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedStandardClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedStandardClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedStandardClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedStandardClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedStandardClassNameContext qualifiedStandardClassName() throws RecognitionException {
		QualifiedStandardClassNameContext _localctx = new QualifiedStandardClassNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_qualifiedStandardClassName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			qualifiedNameElements();
			setState(792);
			className();
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(793);
					match(DOT);
					setState(794);
					className();
					}
					} 
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends GroovyParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralAltContext extends LiteralContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStringLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStringLiteralAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStringLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralAltContext extends LiteralContext {
		public TerminalNode IntegerLiteral() { return getToken(GroovyParser.IntegerLiteral, 0); }
		public IntegerLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIntegerLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIntegerLiteralAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIntegerLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatingPointLiteralAltContext extends LiteralContext {
		public TerminalNode FloatingPointLiteral() { return getToken(GroovyParser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFloatingPointLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFloatingPointLiteralAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFloatingPointLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralAltContext extends LiteralContext {
		public TerminalNode NullLiteral() { return getToken(GroovyParser.NullLiteral, 0); }
		public NullLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNullLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNullLiteralAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNullLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralAltContext extends LiteralContext {
		public TerminalNode BooleanLiteral() { return getToken(GroovyParser.BooleanLiteral, 0); }
		public BooleanLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBooleanLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBooleanLiteralAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBooleanLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literal);
		try {
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new IntegerLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				_localctx = new FloatingPointLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				match(FloatingPointLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				stringLiteral();
				}
				break;
			case BooleanLiteral:
				_localctx = new BooleanLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(803);
				match(BooleanLiteral);
				}
				break;
			case NullLiteral:
				_localctx = new NullLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(804);
				match(NullLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GstringContext extends GroovyParserRuleContext {
		public TerminalNode GStringBegin() { return getToken(GroovyParser.GStringBegin, 0); }
		public List<GstringValueContext> gstringValue() {
			return getRuleContexts(GstringValueContext.class);
		}
		public GstringValueContext gstringValue(int i) {
			return getRuleContext(GstringValueContext.class,i);
		}
		public TerminalNode GStringEnd() { return getToken(GroovyParser.GStringEnd, 0); }
		public List<TerminalNode> GStringPart() { return getTokens(GroovyParser.GStringPart); }
		public TerminalNode GStringPart(int i) {
			return getToken(GroovyParser.GStringPart, i);
		}
		public GstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GstringContext gstring() throws RecognitionException {
		GstringContext _localctx = new GstringContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_gstring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(GStringBegin);
			setState(808);
			gstringValue();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GStringPart) {
				{
				{
				setState(809);
				match(GStringPart);
				setState(810);
				gstringValue();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(816);
			match(GStringEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GstringValueContext extends GroovyParserRuleContext {
		public GstringPathContext gstringPath() {
			return getRuleContext(GstringPathContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ClosureContext closure() {
			return getRuleContext(ClosureContext.class,0);
		}
		public GstringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GstringValueContext gstringValue() throws RecognitionException {
		GstringValueContext _localctx = new GstringValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_gstringValue);
		try {
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				gstringPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(LBRACE);
				setState(821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(820);
					statementExpression();
					}
					break;
				}
				setState(823);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				closure();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GstringPathContext extends GroovyParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> GStringPathPart() { return getTokens(GroovyParser.GStringPathPart); }
		public TerminalNode GStringPathPart(int i) {
			return getToken(GroovyParser.GStringPathPart, i);
		}
		public GstringPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstringPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstringPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstringPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstringPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GstringPathContext gstringPath() throws RecognitionException {
		GstringPathContext _localctx = new GstringPathContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_gstringPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			identifier();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GStringPathPart) {
				{
				{
				setState(828);
				match(GStringPathPart);
				}
				}
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends GroovyParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(GroovyParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			lambdaParameters();
			setState(835);
			nls();
			setState(836);
			match(ARROW);
			setState(837);
			nls();
			setState(838);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandardLambdaExpressionContext extends GroovyParserRuleContext {
		public StandardLambdaParametersContext standardLambdaParameters() {
			return getRuleContext(StandardLambdaParametersContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(GroovyParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public StandardLambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardLambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStandardLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStandardLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStandardLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardLambdaExpressionContext standardLambdaExpression() throws RecognitionException {
		StandardLambdaExpressionContext _localctx = new StandardLambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_standardLambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			standardLambdaParameters();
			setState(841);
			nls();
			setState(842);
			match(ARROW);
			setState(843);
			nls();
			setState(844);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends GroovyParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_lambdaParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			formalParameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandardLambdaParametersContext extends GroovyParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public StandardLambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardLambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStandardLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStandardLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStandardLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardLambdaParametersContext standardLambdaParameters() throws RecognitionException {
		StandardLambdaParametersContext _localctx = new StandardLambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_standardLambdaParameters);
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				formalParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				variableDeclaratorId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends GroovyParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_lambdaBody);
		try {
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				statementExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureContext extends GroovyParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public BlockStatementsOptContext blockStatementsOpt() {
			return getRuleContext(BlockStatementsOptContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public TerminalNode ARROW() { return getToken(GroovyParser.ARROW, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ClosureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClosure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClosure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureContext closure() throws RecognitionException {
		ClosureContext _localctx = new ClosureContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(LBRACE);
			setState(857);
			nls();
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(859);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(858);
					formalParameterList();
					}
					break;
				}
				setState(861);
				nls();
				setState(862);
				match(ARROW);
				setState(863);
				nls();
				}
				break;
			}
			setState(867);
			blockStatementsOpt();
			setState(868);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureOrLambdaExpressionContext extends GroovyParserRuleContext {
		public ClosureContext closure() {
			return getRuleContext(ClosureContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ClosureOrLambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureOrLambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClosureOrLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClosureOrLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClosureOrLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureOrLambdaExpressionContext closureOrLambdaExpression() throws RecognitionException {
		ClosureOrLambdaExpressionContext _localctx = new ClosureOrLambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_closureOrLambdaExpression);
		try {
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				closure();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				lambdaExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsOptContext extends GroovyParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockStatementsOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatementsOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlockStatementsOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlockStatementsOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlockStatementsOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsOptContext blockStatementsOpt() throws RecognitionException {
		BlockStatementsOptContext _localctx = new BlockStatementsOptContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_blockStatementsOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(874);
				blockStatements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends GroovyParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_blockStatements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			blockStatement();
			setState(883);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(878);
					sep();
					setState(879);
					blockStatement();
					}
					} 
				}
				setState(885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(886);
				sep();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsOptContext extends GroovyParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public AnnotationsOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationsOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationsOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationsOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationsOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsOptContext annotationsOpt() throws RecognitionException {
		AnnotationsOptContext _localctx = new AnnotationsOptContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_annotationsOpt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(889);
					annotation();
					setState(890);
					nls();
					}
					} 
				}
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends GroovyParserRuleContext {
		public TerminalNode AT() { return getToken(GroovyParser.AT, 0); }
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public ElementValuesContext elementValues() {
			return getRuleContext(ElementValuesContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(AT);
			setState(898);
			annotationName();
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(899);
				match(LPAREN);
				setState(901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(900);
					elementValues();
					}
					break;
				}
				setState(903);
				rparen();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuesContext extends GroovyParserRuleContext {
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuesContext elementValues() throws RecognitionException {
		ElementValuesContext _localctx = new ElementValuesContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_elementValues);
		try {
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				elementValuePairs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				elementValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends GroovyParserRuleContext {
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			qualifiedClassName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends GroovyParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_elementValuePairs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			elementValuePair();
			setState(917);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(913);
					match(COMMA);
					setState(914);
					elementValuePair();
					}
					} 
				}
				setState(919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends GroovyParserRuleContext {
		public ElementValuePairNameContext elementValuePairName() {
			return getRuleContext(ElementValuePairNameContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			elementValuePairName();
			setState(921);
			nls();
			setState(922);
			match(ASSIGN);
			setState(923);
			nls();
			setState(924);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairNameContext extends GroovyParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public ElementValuePairNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValuePairName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValuePairName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValuePairName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairNameContext elementValuePairName() throws RecognitionException {
		ElementValuePairNameContext _localctx = new ElementValuePairNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elementValuePairName);
		try {
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				keywords();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends GroovyParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_elementValue);
		try {
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				elementValueArrayInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(932);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends GroovyParserRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(LBRACK);
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(936);
				elementValue();
				setState(941);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(937);
						match(COMMA);
						setState(938);
						elementValue();
						}
						} 
					}
					setState(943);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				}
				break;
			}
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(946);
				match(COMMA);
				}
			}

			setState(949);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends GroovyParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public BlockStatementsOptContext blockStatementsOpt() {
			return getRuleContext(BlockStatementsOptContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(LBRACE);
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(952);
				nls();
				}
				break;
			case 2:
				{
				setState(956);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(953);
						sep();
						}
						} 
					}
					setState(958);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				}
				break;
			}
			setState(961);
			blockStatementsOpt();
			setState(962);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends GroovyParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_blockStatement);
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends GroovyParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			if (!( !SemanticPredicates.isInvalidLocalVariableDeclaration(_input) )) throw new FailedPredicateException(this, " !SemanticPredicates.isInvalidLocalVariableDeclaration(_input) ");
			setState(969);
			variableDeclaration(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassifiedModifiersContext extends GroovyParserRuleContext {
		public int t;
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassifiedModifiersContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassifiedModifiersContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_classifiedModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassifiedModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassifiedModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassifiedModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassifiedModifiersContext classifiedModifiers(int t) throws RecognitionException {
		ClassifiedModifiersContext _localctx = new ClassifiedModifiersContext(_ctx, getState(), t);
		enterRule(_localctx, 160, RULE_classifiedModifiers);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				if (!( 0 == _localctx.t )) throw new FailedPredicateException(this, " 0 == $t ");
				setState(972);
				variableModifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(973);
				if (!( 1 == _localctx.t )) throw new FailedPredicateException(this, " 1 == $t ");
				setState(974);
				modifiers();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public ClassifiedModifiersContext classifiedModifiers() {
			return getRuleContext(ClassifiedModifiersContext.class,0);
		}
		public TypeNamePairsContext typeNamePairs() {
			return getRuleContext(TypeNamePairsContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration(int t) throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState(), t);
		enterRule(_localctx, 162, RULE_variableDeclaration);
		try {
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				classifiedModifiers(_localctx.t);
				setState(990);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(979);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
					case 1:
						{
						setState(978);
						type();
						}
						break;
					}
					setState(982);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						setState(981);
						variableDeclarators();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(984);
					typeNamePairs();
					setState(985);
					nls();
					setState(986);
					match(ASSIGN);
					setState(987);
					nls();
					setState(988);
					variableInitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(992);
					classifiedModifiers(_localctx.t);
					}
					break;
				}
				setState(995);
				type();
				setState(997);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(996);
					variableDeclarators();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNamePairsContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public List<TypeNamePairContext> typeNamePair() {
			return getRuleContexts(TypeNamePairContext.class);
		}
		public TypeNamePairContext typeNamePair(int i) {
			return getRuleContext(TypeNamePairContext.class,i);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public TypeNamePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNamePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeNamePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeNamePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeNamePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNamePairsContext typeNamePairs() throws RecognitionException {
		TypeNamePairsContext _localctx = new TypeNamePairsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_typeNamePairs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(LPAREN);
			setState(1002);
			typeNamePair();
			setState(1007);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1003);
					match(COMMA);
					setState(1004);
					typeNamePair();
					}
					} 
				}
				setState(1009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(1010);
			rparen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNamePairContext extends GroovyParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeNamePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNamePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeNamePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeNamePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeNamePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNamePairContext typeNamePair() throws RecognitionException {
		TypeNamePairContext _localctx = new TypeNamePairContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_typeNamePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1012);
				type();
				}
				break;
			}
			setState(1015);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNamesContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public List<VariableDeclaratorIdContext> variableDeclaratorId() {
			return getRuleContexts(VariableDeclaratorIdContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId(int i) {
			return getRuleContext(VariableDeclaratorIdContext.class,i);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public VariableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNamesContext variableNames() throws RecognitionException {
		VariableNamesContext _localctx = new VariableNamesContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_variableNames);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(LPAREN);
			setState(1018);
			variableDeclaratorId();
			setState(1021); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1019);
					match(COMMA);
					setState(1020);
					variableDeclaratorId();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1023); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1025);
			rparen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStatementContext extends GroovyParserRuleContext {
		public IfElseStatementContext ifElseStatement() {
			return getRuleContext(IfElseStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_conditionalStatement);
		try {
			setState(1029);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				ifElseStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				switchStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseStatementContext extends GroovyParserRuleContext {
		public StatementContext tb;
		public StatementContext fb;
		public TerminalNode IF() { return getToken(GroovyParser.IF, 0); }
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GroovyParser.ELSE, 0); }
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(IF);
			setState(1032);
			expressionInPar();
			setState(1033);
			nls();
			setState(1034);
			((IfElseStatementContext)_localctx).tb = statement();
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1035);
					nls();
					}
					break;
				case 2:
					{
					setState(1036);
					sep();
					}
					break;
				}
				setState(1039);
				match(ELSE);
				setState(1040);
				nls();
				setState(1041);
				((IfElseStatementContext)_localctx).fb = statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends GroovyParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GroovyParser.SWITCH, 0); }
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(SWITCH);
			setState(1046);
			expressionInPar();
			setState(1047);
			nls();
			setState(1048);
			match(LBRACE);
			setState(1049);
			nls();
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1050);
				switchBlockStatementGroup();
				}
				}
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1056);
			nls();
			setState(1057);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends GroovyParserRuleContext {
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	 
		public LoopStatementContext() { }
		public void copyFrom(LoopStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoWhileStmtAltContext extends LoopStatementContext {
		public TerminalNode DO() { return getToken(GroovyParser.DO, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(GroovyParser.WHILE, 0); }
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public DoWhileStmtAltContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterDoWhileStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitDoWhileStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitDoWhileStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStmtAltContext extends LoopStatementContext {
		public TerminalNode FOR() { return getToken(GroovyParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStmtAltContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterForStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitForStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitForStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtAltContext extends LoopStatementContext {
		public TerminalNode WHILE() { return getToken(GroovyParser.WHILE, 0); }
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtAltContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterWhileStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitWhileStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitWhileStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_loopStatement);
		try {
			setState(1078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				match(FOR);
				setState(1060);
				match(LPAREN);
				setState(1061);
				forControl();
				setState(1062);
				rparen();
				setState(1063);
				nls();
				setState(1064);
				statement();
				}
				break;
			case WHILE:
				_localctx = new WhileStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				match(WHILE);
				setState(1067);
				expressionInPar();
				setState(1068);
				nls();
				setState(1069);
				statement();
				}
				break;
			case DO:
				_localctx = new DoWhileStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				match(DO);
				setState(1072);
				nls();
				setState(1073);
				statement();
				setState(1074);
				nls();
				setState(1075);
				match(WHILE);
				setState(1076);
				expressionInPar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends GroovyParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(GroovyParser.CONTINUE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			match(CONTINUE);
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1081);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends GroovyParserRuleContext {
		public TerminalNode BREAK() { return getToken(GroovyParser.BREAK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			match(BREAK);
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1085);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryCatchStatementContext extends GroovyParserRuleContext {
		public TerminalNode TRY() { return getToken(GroovyParser.TRY, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_tryCatchStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(TRY);
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1089);
				resources();
				}
			}

			setState(1092);
			nls();
			setState(1093);
			block();
			setState(1099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1094);
					nls();
					setState(1095);
					catchClause();
					}
					} 
				}
				setState(1101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1102);
				nls();
				setState(1103);
				finallyBlock();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends GroovyParserRuleContext {
		public ExpressionContext ce;
		public ExpressionContext me;
		public TerminalNode ASSERT() { return getToken(GroovyParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(GroovyParser.COMMA, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_assertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(ASSERT);
			setState(1108);
			((AssertStatementContext)_localctx).ce = expression(0);
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1109);
				nls();
				setState(1110);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1111);
				nls();
				setState(1112);
				((AssertStatementContext)_localctx).me = expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends GroovyParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalStmtAltContext extends StatementContext {
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public ConditionalStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterConditionalStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitConditionalStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitConditionalStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStmtAltContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(GroovyParser.SEMI, 0); }
		public EmptyStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEmptyStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEmptyStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEmptyStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtAltContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlockStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlockStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlockStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TryCatchStmtAltContext extends StatementContext {
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public TryCatchStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTryCatchStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTryCatchStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTryCatchStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtAltContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public BreakStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBreakStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBreakStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBreakStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportStmtAltContext extends StatementContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public ImportStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterImportStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitImportStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitImportStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStmtAltContext extends StatementContext {
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ContinueStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterContinueStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitContinueStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitContinueStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssertStmtAltContext extends StatementContext {
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public AssertStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAssertStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAssertStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAssertStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopStmtAltContext extends StatementContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LoopStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLoopStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLoopStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLoopStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SynchronizedStmtAltContext extends StatementContext {
		public TerminalNode SYNCHRONIZED() { return getToken(GroovyParser.SYNCHRONIZED, 0); }
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSynchronizedStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSynchronizedStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSynchronizedStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStmtAltContext extends StatementContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodDeclarationStmtAltContext extends StatementContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodDeclarationStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMethodDeclarationStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMethodDeclarationStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMethodDeclarationStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalVariableDeclarationStmtAltContext extends StatementContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLocalVariableDeclarationStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLocalVariableDeclarationStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDeclarationStmtAltContext extends StatementContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TypeDeclarationStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeDeclarationStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeDeclarationStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeDeclarationStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ErrorAltContext extends StatementContext {
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public ErrorAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterErrorAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitErrorAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitErrorAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtAltContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(GroovyParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterReturnStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitReturnStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitReturnStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThrowStmtAltContext extends StatementContext {
		public TerminalNode THROW() { return getToken(GroovyParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterThrowStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitThrowStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitThrowStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabeledStmtAltContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLabeledStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLabeledStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLabeledStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_statement);
		try {
			setState(1147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				_localctx = new BlockStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				block();
				}
				break;
			case 2:
				_localctx = new ConditionalStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1117);
				conditionalStatement();
				}
				break;
			case 3:
				_localctx = new LoopStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1118);
				loopStatement();
				}
				break;
			case 4:
				_localctx = new TryCatchStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1119);
				tryCatchStatement();
				}
				break;
			case 5:
				_localctx = new SynchronizedStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1120);
				match(SYNCHRONIZED);
				setState(1121);
				expressionInPar();
				setState(1122);
				nls();
				setState(1123);
				block();
				}
				break;
			case 6:
				_localctx = new ReturnStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1125);
				match(RETURN);
				setState(1127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1126);
					expression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new ThrowStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1129);
				match(THROW);
				setState(1130);
				expression(0);
				}
				break;
			case 8:
				_localctx = new BreakStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1131);
				breakStatement();
				}
				break;
			case 9:
				_localctx = new ContinueStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1132);
				continueStatement();
				}
				break;
			case 10:
				_localctx = new LabeledStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1133);
				identifier();
				setState(1134);
				match(COLON);
				setState(1135);
				nls();
				setState(1136);
				statement();
				}
				break;
			case 11:
				_localctx = new ImportStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1138);
				importDeclaration();
				}
				break;
			case 12:
				_localctx = new AssertStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1139);
				assertStatement();
				}
				break;
			case 13:
				_localctx = new TypeDeclarationStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1140);
				typeDeclaration();
				}
				break;
			case 14:
				_localctx = new LocalVariableDeclarationStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1141);
				localVariableDeclaration();
				}
				break;
			case 15:
				_localctx = new MethodDeclarationStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1142);
				if (!( !SemanticPredicates.isInvalidMethodDeclaration(_input) )) throw new FailedPredicateException(this, " !SemanticPredicates.isInvalidMethodDeclaration(_input) ");
				setState(1143);
				methodDeclaration(3, 9);
				}
				break;
			case 16:
				_localctx = new ExpressionStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1144);
				statementExpression();
				}
				break;
			case 17:
				_localctx = new EmptyStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1145);
				match(SEMI);
				}
				break;
			case 18:
				_localctx = new ErrorAltContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1146);
				error();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends GroovyParserRuleContext {
		public TerminalNode CATCH() { return getToken(GroovyParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public VariableModifiersOptContext variableModifiersOpt() {
			return getRuleContext(VariableModifiersOptContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			match(CATCH);
			setState(1150);
			match(LPAREN);
			setState(1151);
			variableModifiersOpt();
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1152);
				catchType();
				}
				break;
			}
			setState(1155);
			identifier();
			setState(1156);
			rparen();
			setState(1157);
			nls();
			setState(1158);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends GroovyParserRuleContext {
		public List<QualifiedClassNameContext> qualifiedClassName() {
			return getRuleContexts(QualifiedClassNameContext.class);
		}
		public QualifiedClassNameContext qualifiedClassName(int i) {
			return getRuleContext(QualifiedClassNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(GroovyParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(GroovyParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_catchType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			qualifiedClassName();
			setState(1165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1161);
					match(BITOR);
					setState(1162);
					qualifiedClassName();
					}
					} 
				}
				setState(1167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends GroovyParserRuleContext {
		public TerminalNode FINALLY() { return getToken(GroovyParser.FINALLY, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(FINALLY);
			setState(1169);
			nls();
			setState(1170);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_resources);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(LPAREN);
			setState(1173);
			nls();
			setState(1174);
			resourceList();
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1175);
				sep();
				}
				break;
			}
			setState(1178);
			rparen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends GroovyParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitResourceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			resource();
			setState(1186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1181);
					sep();
					setState(1182);
					resource();
					}
					} 
				}
				setState(1188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends GroovyParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_resource);
		try {
			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends GroovyParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1196); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1193);
					switchLabel();
					setState(1194);
					nls();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1198); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1200);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends GroovyParserRuleContext {
		public TerminalNode CASE() { return getToken(GroovyParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(GroovyParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_switchLabel);
		try {
			setState(1208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				match(CASE);
				setState(1203);
				expression(0);
				setState(1204);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				match(DEFAULT);
				setState(1207);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends GroovyParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ClassicalForControlContext classicalForControl() {
			return getRuleContext(ClassicalForControlContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_forControl);
		try {
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1210);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1211);
				classicalForControl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends GroovyParserRuleContext {
		public VariableModifiersOptContext variableModifiersOpt() {
			return getRuleContext(VariableModifiersOptContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode IN() { return getToken(GroovyParser.IN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			variableModifiersOpt();
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1215);
				type();
				}
				break;
			}
			setState(1218);
			variableDeclaratorId();
			setState(1219);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1220);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassicalForControlContext extends GroovyParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(GroovyParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GroovyParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ClassicalForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicalForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassicalForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassicalForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassicalForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassicalForControlContext classicalForControl() throws RecognitionException {
		ClassicalForControlContext _localctx = new ClassicalForControlContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_classicalForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1222);
				forInit();
				}
				break;
			}
			setState(1225);
			match(SEMI);
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1226);
				expression(0);
				}
				break;
			}
			setState(1229);
			match(SEMI);
			setState(1231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1230);
				forUpdate();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends GroovyParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_forInit);
		try {
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1233);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				expressionList(false);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends GroovyParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			expressionList(false);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastParExpressionContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public CastParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castParExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCastParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCastParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCastParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastParExpressionContext castParExpression() throws RecognitionException {
		CastParExpressionContext _localctx = new CastParExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_castParExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(LPAREN);
			setState(1240);
			type();
			setState(1241);
			rparen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends GroovyParserRuleContext {
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			expressionInPar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionInParContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public EnhancedStatementExpressionContext enhancedStatementExpression() {
			return getRuleContext(EnhancedStatementExpressionContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public ExpressionInParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionInPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionInPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionInPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInParContext expressionInPar() throws RecognitionException {
		ExpressionInParContext _localctx = new ExpressionInParContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_expressionInPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			match(LPAREN);
			setState(1246);
			enhancedStatementExpression();
			setState(1247);
			rparen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends GroovyParserRuleContext {
		public boolean canSpread;
		public List<ExpressionListElementContext> expressionListElement() {
			return getRuleContexts(ExpressionListElementContext.class);
		}
		public ExpressionListElementContext expressionListElement(int i) {
			return getRuleContext(ExpressionListElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionListContext(ParserRuleContext parent, int invokingState, boolean canSpread) {
			super(parent, invokingState);
			this.canSpread = canSpread;
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList(boolean canSpread) throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState(), canSpread);
		enterRule(_localctx, 220, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			expressionListElement(_localctx.canSpread);
			setState(1254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1250);
					match(COMMA);
					setState(1251);
					expressionListElement(_localctx.canSpread);
					}
					} 
				}
				setState(1256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListElementContext extends GroovyParserRuleContext {
		public boolean canSpread;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(GroovyParser.MUL, 0); }
		public ExpressionListElementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionListElementContext(ParserRuleContext parent, int invokingState, boolean canSpread) {
			super(parent, invokingState);
			this.canSpread = canSpread;
		}
		@Override public int getRuleIndex() { return RULE_expressionListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListElementContext expressionListElement(boolean canSpread) throws RecognitionException {
		ExpressionListElementContext _localctx = new ExpressionListElementContext(_ctx, getState(), canSpread);
		enterRule(_localctx, 222, RULE_expressionListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1257);
				match(MUL);
				 require(_localctx.canSpread, "spread operator is not allowed here", -1); 
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(1262);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedStatementExpressionContext extends GroovyParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StandardLambdaExpressionContext standardLambdaExpression() {
			return getRuleContext(StandardLambdaExpressionContext.class,0);
		}
		public EnhancedStatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedStatementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnhancedStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnhancedStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnhancedStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedStatementExpressionContext enhancedStatementExpression() throws RecognitionException {
		EnhancedStatementExpressionContext _localctx = new EnhancedStatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_enhancedStatementExpression);
		try {
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				statementExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				standardLambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends GroovyParserRuleContext {
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
	 
		public StatementExpressionContext() { }
		public void copyFrom(StatementExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommandExprAltContext extends StatementExpressionContext {
		public CommandExpressionContext commandExpression() {
			return getRuleContext(CommandExpressionContext.class,0);
		}
		public CommandExprAltContext(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCommandExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCommandExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCommandExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_statementExpression);
		try {
			_localctx = new CommandExprAltContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			commandExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends GroovyParserRuleContext {
		public Token op;
		public PathExpressionContext pathExpression() {
			return getRuleContext(PathExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(GroovyParser.INC, 0); }
		public TerminalNode DEC() { return getToken(GroovyParser.DEC, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			pathExpression();
			setState(1272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1271);
				((PostfixExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((PostfixExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends GroovyParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token dlOp;
		public Token tgOp;
		public Token dgOp;
		public Token rangeOp;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(GroovyParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(GroovyParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(GroovyParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(GroovyParser.GT, i);
		}
		public TerminalNode RANGE_INCLUSIVE() { return getToken(GroovyParser.RANGE_INCLUSIVE, 0); }
		public TerminalNode RANGE_EXCLUSIVE() { return getToken(GroovyParser.RANGE_EXCLUSIVE, 0); }
		public ShiftExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterShiftExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitShiftExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitShiftExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipleAssignmentExprAltContext extends ExpressionContext {
		public VariableNamesContext left;
		public Token op;
		public StatementExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public VariableNamesContext variableNames() {
			return getRuleContext(VariableNamesContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public MultipleAssignmentExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMultipleAssignmentExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMultipleAssignmentExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMultipleAssignmentExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionUnaryNotExprAltContext extends ExpressionContext {
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BITNOT() { return getToken(GroovyParser.BITNOT, 0); }
		public TerminalNode NOT() { return getToken(GroovyParser.NOT, 0); }
		public ExpressionUnaryNotExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionUnaryNotExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionUnaryNotExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionUnaryNotExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionCastExprAltContext extends ExpressionContext {
		public CastParExpressionContext castParExpression() {
			return getRuleContext(CastParExpressionContext.class,0);
		}
		public CastOperandExpressionContext castOperandExpression() {
			return getRuleContext(CastOperandExpressionContext.class,0);
		}
		public ExpressionCastExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionCastExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionCastExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionCastExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionPostfixExprAltContext extends ExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionPostfixExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionPostfixExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionPostfixExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionPostfixExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExclusiveOrExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode XOR() { return getToken(GroovyParser.XOR, 0); }
		public ExclusiveOrExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExclusiveOrExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExclusiveOrExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExclusiveOrExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GroovyParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GroovyParser.SUB, 0); }
		public AdditiveExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAdditiveExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAdditiveExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAdditiveExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegexExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode REGEX_FIND() { return getToken(GroovyParser.REGEX_FIND, 0); }
		public TerminalNode REGEX_MATCH() { return getToken(GroovyParser.REGEX_MATCH, 0); }
		public RegexExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterRegexExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitRegexExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitRegexExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExprAltContext extends ExpressionContext {
		public ExpressionContext con;
		public ExpressionContext tb;
		public ExpressionContext fb;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(GroovyParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode ELVIS() { return getToken(GroovyParser.ELVIS, 0); }
		public ConditionalExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterConditionalExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitConditionalExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitConditionalExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(GroovyParser.POWER, 0); }
		public PowerExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPowerExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPowerExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPowerExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(GroovyParser.LE, 0); }
		public TerminalNode GE() { return getToken(GroovyParser.GE, 0); }
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public TerminalNode IN() { return getToken(GroovyParser.IN, 0); }
		public TerminalNode NOT_IN() { return getToken(GroovyParser.NOT_IN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(GroovyParser.AS, 0); }
		public TerminalNode INSTANCEOF() { return getToken(GroovyParser.INSTANCEOF, 0); }
		public TerminalNode NOT_INSTANCEOF() { return getToken(GroovyParser.NOT_INSTANCEOF, 0); }
		public RelationalExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterRelationalExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitRelationalExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitRelationalExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(GroovyParser.AND, 0); }
		public LogicalAndExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLogicalAndExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLogicalAndExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLogicalAndExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public EnhancedStatementExpressionContext enhancedStatementExpression() {
			return getRuleContext(EnhancedStatementExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(GroovyParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(GroovyParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(GroovyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(GroovyParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(GroovyParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(GroovyParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(GroovyParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(GroovyParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(GroovyParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(GroovyParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(GroovyParser.MOD_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(GroovyParser.POWER_ASSIGN, 0); }
		public TerminalNode ELVIS_ASSIGN() { return getToken(GroovyParser.ELVIS_ASSIGN, 0); }
		public AssignmentExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAssignmentExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAssignmentExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAssignmentExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(GroovyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GroovyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GroovyParser.MOD, 0); }
		public MultiplicativeExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMultiplicativeExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMultiplicativeExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMultiplicativeExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InclusiveOrExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITOR() { return getToken(GroovyParser.BITOR, 0); }
		public InclusiveOrExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterInclusiveOrExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitInclusiveOrExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitInclusiveOrExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionUnaryAddExprAltContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(GroovyParser.INC, 0); }
		public TerminalNode DEC() { return getToken(GroovyParser.DEC, 0); }
		public TerminalNode ADD() { return getToken(GroovyParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GroovyParser.SUB, 0); }
		public ExpressionUnaryAddExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionUnaryAddExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionUnaryAddExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionUnaryAddExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(GroovyParser.OR, 0); }
		public LogicalOrExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLogicalOrExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLogicalOrExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLogicalOrExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTICAL() { return getToken(GroovyParser.IDENTICAL, 0); }
		public TerminalNode NOT_IDENTICAL() { return getToken(GroovyParser.NOT_IDENTICAL, 0); }
		public TerminalNode EQUAL() { return getToken(GroovyParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(GroovyParser.NOTEQUAL, 0); }
		public TerminalNode SPACESHIP() { return getToken(GroovyParser.SPACESHIP, 0); }
		public EqualityExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEqualityExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEqualityExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEqualityExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITAND() { return getToken(GroovyParser.BITAND, 0); }
		public AndExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAndExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAndExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAndExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionCastExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1275);
				castParExpression();
				setState(1276);
				castOperandExpression();
				}
				break;
			case 2:
				{
				_localctx = new ExpressionPostfixExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1278);
				postfixExpression();
				}
				break;
			case 3:
				{
				_localctx = new ExpressionUnaryNotExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1279);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==BITNOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1280);
				nls();
				setState(1281);
				expression(18);
				}
				break;
			case 4:
				{
				_localctx = new ExpressionUnaryAddExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1283);
				((ExpressionUnaryAddExprAltContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (INC - 100)) | (1L << (DEC - 100)) | (1L << (ADD - 100)) | (1L << (SUB - 100)))) != 0)) ) {
					((ExpressionUnaryAddExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1284);
				expression(16);
				}
				break;
			case 5:
				{
				_localctx = new MultipleAssignmentExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1285);
				((MultipleAssignmentExprAltContext)_localctx).left = variableNames();
				setState(1286);
				nls();
				setState(1287);
				((MultipleAssignmentExprAltContext)_localctx).op = match(ASSIGN);
				setState(1288);
				nls();
				setState(1289);
				((MultipleAssignmentExprAltContext)_localctx).right = statementExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1401);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((PowerExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1293);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1294);
						((PowerExprAltContext)_localctx).op = match(POWER);
						setState(1295);
						nls();
						setState(1296);
						((PowerExprAltContext)_localctx).right = expression(18);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicativeExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1298);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1299);
						nls();
						setState(1300);
						((MultiplicativeExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (MUL - 104)) | (1L << (DIV - 104)) | (1L << (MOD - 104)))) != 0)) ) {
							((MultiplicativeExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1301);
						nls();
						setState(1302);
						((MultiplicativeExprAltContext)_localctx).right = expression(16);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((AdditiveExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1304);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1305);
						((AdditiveExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AdditiveExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1306);
						nls();
						setState(1307);
						((AdditiveExprAltContext)_localctx).right = expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((ShiftExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1309);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1310);
						nls();
						setState(1321);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case GT:
						case LT:
							{
							setState(1318);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
							case 1:
								{
								setState(1311);
								((ShiftExprAltContext)_localctx).dlOp = match(LT);
								setState(1312);
								match(LT);
								}
								break;
							case 2:
								{
								setState(1313);
								((ShiftExprAltContext)_localctx).tgOp = match(GT);
								setState(1314);
								match(GT);
								setState(1315);
								match(GT);
								}
								break;
							case 3:
								{
								setState(1316);
								((ShiftExprAltContext)_localctx).dgOp = match(GT);
								setState(1317);
								match(GT);
								}
								break;
							}
							}
							break;
						case RANGE_INCLUSIVE:
						case RANGE_EXCLUSIVE:
							{
							setState(1320);
							((ShiftExprAltContext)_localctx).rangeOp = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==RANGE_INCLUSIVE || _la==RANGE_EXCLUSIVE) ) {
								((ShiftExprAltContext)_localctx).rangeOp = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1323);
						nls();
						setState(1324);
						((ShiftExprAltContext)_localctx).right = expression(14);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1326);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1327);
						nls();
						setState(1328);
						((RelationalExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IN || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT_IN - 77)) | (1L << (GT - 77)) | (1L << (LT - 77)) | (1L << (LE - 77)) | (1L << (GE - 77)))) != 0)) ) {
							((RelationalExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1329);
						nls();
						setState(1330);
						((RelationalExprAltContext)_localctx).right = expression(12);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((EqualityExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1332);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1333);
						nls();
						setState(1334);
						((EqualityExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SPACESHIP - 72)) | (1L << (IDENTICAL - 72)) | (1L << (NOT_IDENTICAL - 72)) | (1L << (EQUAL - 72)) | (1L << (NOTEQUAL - 72)))) != 0)) ) {
							((EqualityExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1335);
						nls();
						setState(1336);
						((EqualityExprAltContext)_localctx).right = expression(11);
						}
						break;
					case 7:
						{
						_localctx = new RegexExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((RegexExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1338);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1339);
						nls();
						setState(1340);
						((RegexExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==REGEX_FIND || _la==REGEX_MATCH) ) {
							((RegexExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1341);
						nls();
						setState(1342);
						((RegexExprAltContext)_localctx).right = expression(10);
						}
						break;
					case 8:
						{
						_localctx = new AndExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((AndExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1344);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1345);
						nls();
						setState(1346);
						((AndExprAltContext)_localctx).op = match(BITAND);
						setState(1347);
						nls();
						setState(1348);
						((AndExprAltContext)_localctx).right = expression(9);
						}
						break;
					case 9:
						{
						_localctx = new ExclusiveOrExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((ExclusiveOrExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1350);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1351);
						nls();
						setState(1352);
						((ExclusiveOrExprAltContext)_localctx).op = match(XOR);
						setState(1353);
						nls();
						setState(1354);
						((ExclusiveOrExprAltContext)_localctx).right = expression(8);
						}
						break;
					case 10:
						{
						_localctx = new InclusiveOrExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((InclusiveOrExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1356);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1357);
						nls();
						setState(1358);
						((InclusiveOrExprAltContext)_localctx).op = match(BITOR);
						setState(1359);
						nls();
						setState(1360);
						((InclusiveOrExprAltContext)_localctx).right = expression(7);
						}
						break;
					case 11:
						{
						_localctx = new LogicalAndExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalAndExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1362);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1363);
						nls();
						setState(1364);
						((LogicalAndExprAltContext)_localctx).op = match(AND);
						setState(1365);
						nls();
						setState(1366);
						((LogicalAndExprAltContext)_localctx).right = expression(6);
						}
						break;
					case 12:
						{
						_localctx = new LogicalOrExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalOrExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1368);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1369);
						nls();
						setState(1370);
						((LogicalOrExprAltContext)_localctx).op = match(OR);
						setState(1371);
						nls();
						setState(1372);
						((LogicalOrExprAltContext)_localctx).right = expression(5);
						}
						break;
					case 13:
						{
						_localctx = new ConditionalExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExprAltContext)_localctx).con = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1374);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1375);
						nls();
						setState(1385);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case QUESTION:
							{
							setState(1376);
							match(QUESTION);
							setState(1377);
							nls();
							setState(1378);
							((ConditionalExprAltContext)_localctx).tb = expression(0);
							setState(1379);
							nls();
							setState(1380);
							match(COLON);
							setState(1381);
							nls();
							}
							break;
						case ELVIS:
							{
							setState(1383);
							match(ELVIS);
							setState(1384);
							nls();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1387);
						((ConditionalExprAltContext)_localctx).fb = expression(3);
						}
						break;
					case 14:
						{
						_localctx = new RelationalExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1389);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1390);
						nls();
						setState(1391);
						((RelationalExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AS || _la==INSTANCEOF || _la==NOT_INSTANCEOF) ) {
							((RelationalExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1392);
						nls();
						setState(1393);
						type();
						}
						break;
					case 15:
						{
						_localctx = new AssignmentExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((AssignmentExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1395);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1396);
						nls();
						setState(1397);
						((AssignmentExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (POWER_ASSIGN - 71)) | (1L << (ASSIGN - 71)) | (1L << (ADD_ASSIGN - 71)) | (1L << (SUB_ASSIGN - 71)) | (1L << (MUL_ASSIGN - 71)) | (1L << (DIV_ASSIGN - 71)) | (1L << (AND_ASSIGN - 71)) | (1L << (OR_ASSIGN - 71)) | (1L << (XOR_ASSIGN - 71)) | (1L << (MOD_ASSIGN - 71)) | (1L << (LSHIFT_ASSIGN - 71)) | (1L << (RSHIFT_ASSIGN - 71)) | (1L << (URSHIFT_ASSIGN - 71)) | (1L << (ELVIS_ASSIGN - 71)))) != 0)) ) {
							((AssignmentExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1398);
						nls();
						setState(1399);
						enhancedStatementExpression();
						}
						break;
					}
					} 
				}
				setState(1405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CastOperandExpressionContext extends GroovyParserRuleContext {
		public CastOperandExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castOperandExpression; }
	 
		public CastOperandExpressionContext() { }
		public void copyFrom(CastOperandExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostfixExprAltContext extends CastOperandExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixExprAltContext(CastOperandExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPostfixExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPostfixExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPostfixExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryNotExprAltContext extends CastOperandExpressionContext {
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public CastOperandExpressionContext castOperandExpression() {
			return getRuleContext(CastOperandExpressionContext.class,0);
		}
		public TerminalNode BITNOT() { return getToken(GroovyParser.BITNOT, 0); }
		public TerminalNode NOT() { return getToken(GroovyParser.NOT, 0); }
		public UnaryNotExprAltContext(CastOperandExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterUnaryNotExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitUnaryNotExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitUnaryNotExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryAddExprAltContext extends CastOperandExpressionContext {
		public Token op;
		public CastOperandExpressionContext castOperandExpression() {
			return getRuleContext(CastOperandExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(GroovyParser.INC, 0); }
		public TerminalNode DEC() { return getToken(GroovyParser.DEC, 0); }
		public TerminalNode ADD() { return getToken(GroovyParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GroovyParser.SUB, 0); }
		public UnaryAddExprAltContext(CastOperandExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterUnaryAddExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitUnaryAddExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitUnaryAddExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExprAltContext extends CastOperandExpressionContext {
		public CastParExpressionContext castParExpression() {
			return getRuleContext(CastParExpressionContext.class,0);
		}
		public CastOperandExpressionContext castOperandExpression() {
			return getRuleContext(CastOperandExpressionContext.class,0);
		}
		public CastExprAltContext(CastOperandExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCastExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCastExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCastExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastOperandExpressionContext castOperandExpression() throws RecognitionException {
		CastOperandExpressionContext _localctx = new CastOperandExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_castOperandExpression);
		int _la;
		try {
			setState(1416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				_localctx = new CastExprAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1406);
				castParExpression();
				setState(1407);
				castOperandExpression();
				}
				break;
			case 2:
				_localctx = new PostfixExprAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1409);
				postfixExpression();
				}
				break;
			case 3:
				_localctx = new UnaryNotExprAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1410);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==BITNOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1411);
				nls();
				setState(1412);
				castOperandExpression();
				}
				break;
			case 4:
				_localctx = new UnaryAddExprAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1414);
				((UnaryAddExprAltContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (INC - 100)) | (1L << (DEC - 100)) | (1L << (ADD - 100)) | (1L << (SUB - 100)))) != 0)) ) {
					((UnaryAddExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1415);
				castOperandExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandExpressionContext extends GroovyParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<CommandArgumentContext> commandArgument() {
			return getRuleContexts(CommandArgumentContext.class);
		}
		public CommandArgumentContext commandArgument(int i) {
			return getRuleContext(CommandArgumentContext.class,i);
		}
		public CommandExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCommandExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCommandExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCommandExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandExpressionContext commandExpression() throws RecognitionException {
		CommandExpressionContext _localctx = new CommandExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_commandExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			((CommandExpressionContext)_localctx).expression = expression(0);
			setState(1422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1419);
				if (!( !SemanticPredicates.isFollowingArgumentsOrClosure(((CommandExpressionContext)_localctx).expression) )) throw new FailedPredicateException(this, " !SemanticPredicates.isFollowingArgumentsOrClosure($expression.ctx) ");
				setState(1420);
				argumentList();
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(1427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1424);
					commandArgument();
					}
					} 
				}
				setState(1429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandArgumentContext extends GroovyParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<PathElementContext> pathElement() {
			return getRuleContexts(PathElementContext.class);
		}
		public PathElementContext pathElement(int i) {
			return getRuleContext(PathElementContext.class,i);
		}
		public CommandArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCommandArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCommandArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCommandArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandArgumentContext commandArgument() throws RecognitionException {
		CommandArgumentContext _localctx = new CommandArgumentContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_commandArgument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			primary();
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1432); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1431);
						pathElement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1434); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(1436);
				argumentList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathExpressionContext extends GroovyParserRuleContext {
		public int t;
		public PathElementContext pathElement;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<PathElementContext> pathElement() {
			return getRuleContexts(PathElementContext.class);
		}
		public PathElementContext pathElement(int i) {
			return getRuleContext(PathElementContext.class,i);
		}
		public PathEndContext pathEnd() {
			return getRuleContext(PathEndContext.class,0);
		}
		public PathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathExpressionContext pathExpression() throws RecognitionException {
		PathExpressionContext _localctx = new PathExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_pathExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			primary();
			setState(1445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1440);
					((PathExpressionContext)_localctx).pathElement = pathElement();
					 ((PathExpressionContext)_localctx).t =  ((PathExpressionContext)_localctx).pathElement.t; 
					}
					} 
				}
				setState(1447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1448);
				pathEnd();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathElementContext extends GroovyParserRuleContext {
		public int t;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public NamePartContext namePart() {
			return getRuleContext(NamePartContext.class,0);
		}
		public TerminalNode METHOD_POINTER() { return getToken(GroovyParser.METHOD_POINTER, 0); }
		public TerminalNode METHOD_REFERENCE() { return getToken(GroovyParser.METHOD_REFERENCE, 0); }
		public TerminalNode DOT() { return getToken(GroovyParser.DOT, 0); }
		public TerminalNode SPREAD_DOT() { return getToken(GroovyParser.SPREAD_DOT, 0); }
		public TerminalNode SAFE_DOT() { return getToken(GroovyParser.SAFE_DOT, 0); }
		public TerminalNode SAFE_CHAIN_DOT() { return getToken(GroovyParser.SAFE_CHAIN_DOT, 0); }
		public TerminalNode AT() { return getToken(GroovyParser.AT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode NEW() { return getToken(GroovyParser.NEW, 0); }
		public ConstructorTipContext constructorTip() {
			return getRuleContext(ConstructorTipContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClosureOrLambdaExpressionContext closureOrLambdaExpression() {
			return getRuleContext(ClosureOrLambdaExpressionContext.class,0);
		}
		public IndexPropertyArgsContext indexPropertyArgs() {
			return getRuleContext(IndexPropertyArgsContext.class,0);
		}
		public NamedPropertyArgsContext namedPropertyArgs() {
			return getRuleContext(NamedPropertyArgsContext.class,0);
		}
		public PathElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPathElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPathElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPathElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathElementContext pathElement() throws RecognitionException {
		PathElementContext _localctx = new PathElementContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_pathElement);
		int _la;
		try {
			setState(1490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1451);
				nls();
				setState(1462);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPREAD_DOT:
				case SAFE_DOT:
				case SAFE_CHAIN_DOT:
				case DOT:
					{
					setState(1452);
					_la = _input.LA(1);
					if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (SPREAD_DOT - 62)) | (1L << (SAFE_DOT - 62)) | (1L << (SAFE_CHAIN_DOT - 62)) | (1L << (DOT - 62)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1453);
					nls();
					setState(1456);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(1454);
						match(AT);
						}
						break;
					case 2:
						{
						setState(1455);
						nonWildcardTypeArguments();
						}
						break;
					}
					}
					break;
				case METHOD_POINTER:
					{
					setState(1458);
					match(METHOD_POINTER);
					setState(1459);
					nls();
					}
					break;
				case METHOD_REFERENCE:
					{
					setState(1460);
					match(METHOD_REFERENCE);
					setState(1461);
					nls();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1464);
				namePart();
				 ((PathElementContext)_localctx).t =  1; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				nls();
				setState(1468);
				match(DOT);
				setState(1469);
				nls();
				setState(1470);
				match(NEW);
				setState(1473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1471);
					constructorTip();
					}
					break;
				case 2:
					{
					setState(1472);
					creator(1);
					}
					break;
				}
				 ((PathElementContext)_localctx).t =  6; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1477);
				arguments();
				 ((PathElementContext)_localctx).t =  2; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1480);
				nls();
				setState(1481);
				closureOrLambdaExpression();
				 ((PathElementContext)_localctx).t =  3; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1484);
				indexPropertyArgs();
				 ((PathElementContext)_localctx).t =  4; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1487);
				namedPropertyArgs();
				 ((PathElementContext)_localctx).t =  5; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamePartContext extends GroovyParserRuleContext {
		public MethodOrFieldTipContext methodOrFieldTip() {
			return getRuleContext(MethodOrFieldTipContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DynamicMemberNameContext dynamicMemberName() {
			return getRuleContext(DynamicMemberNameContext.class,0);
		}
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public NamePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNamePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNamePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNamePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamePartContext namePart() throws RecognitionException {
		NamePartContext _localctx = new NamePartContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_namePart);
		try {
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1492);
				methodOrFieldTip();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1493);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1494);
				dynamicMemberName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1495);
				keywords();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicMemberNameContext extends GroovyParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public GstringContext gstring() {
			return getRuleContext(GstringContext.class,0);
		}
		public DynamicMemberNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicMemberName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterDynamicMemberName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitDynamicMemberName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitDynamicMemberName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicMemberNameContext dynamicMemberName() throws RecognitionException {
		DynamicMemberNameContext _localctx = new DynamicMemberNameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_dynamicMemberName);
		try {
			setState(1500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				parExpression();
				}
				break;
			case GStringBegin:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				gstring();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexPropertyArgsContext extends GroovyParserRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public TerminalNode QUESTION() { return getToken(GroovyParser.QUESTION, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IndexPropertyArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexPropertyArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIndexPropertyArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIndexPropertyArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIndexPropertyArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexPropertyArgsContext indexPropertyArgs() throws RecognitionException {
		IndexPropertyArgsContext _localctx = new IndexPropertyArgsContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_indexPropertyArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1502);
				match(QUESTION);
				}
			}

			setState(1505);
			match(LBRACK);
			setState(1507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1506);
				expressionList(true);
				}
				break;
			}
			setState(1509);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedPropertyArgsContext extends GroovyParserRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public MapEntryListContext mapEntryList() {
			return getRuleContext(MapEntryListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(GroovyParser.QUESTION, 0); }
		public NamedPropertyArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedPropertyArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNamedPropertyArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNamedPropertyArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNamedPropertyArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedPropertyArgsContext namedPropertyArgs() throws RecognitionException {
		NamedPropertyArgsContext _localctx = new NamedPropertyArgsContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_namedPropertyArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1511);
				match(QUESTION);
				}
			}

			setState(1514);
			match(LBRACK);
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1515);
				mapEntryList();
				}
				break;
			case 2:
				{
				setState(1516);
				match(COLON);
				}
				break;
			}
			setState(1519);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends GroovyParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MapPrmrAltContext extends PrimaryContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public MapPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMapPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMapPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMapPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GstringPrmrAltContext extends PrimaryContext {
		public GstringContext gstring() {
			return getRuleContext(GstringContext.class,0);
		}
		public GstringPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstringPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstringPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstringPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListPrmrAltContext extends PrimaryContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterListPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitListPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitListPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewPrmrAltContext extends PrimaryContext {
		public TerminalNode NEW() { return getToken(GroovyParser.NEW, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public ConstructorTipContext constructorTip() {
			return getRuleContext(ConstructorTipContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNewPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNewPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNewPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralPrmrAltContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLiteralPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLiteralPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLiteralPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisPrmrAltContext extends PrimaryContext {
		public TerminalNode THIS() { return getToken(GroovyParser.THIS, 0); }
		public ThisPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterThisPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitThisPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitThisPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClosureOrLambdaExpressionPrmrAltContext extends PrimaryContext {
		public ClosureOrLambdaExpressionContext closureOrLambdaExpression() {
			return getRuleContext(ClosureOrLambdaExpressionContext.class,0);
		}
		public ClosureOrLambdaExpressionPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClosureOrLambdaExpressionPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClosureOrLambdaExpressionPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClosureOrLambdaExpressionPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltInTypePrmrAltContext extends PrimaryContext {
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public BuiltInTypePrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBuiltInTypePrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBuiltInTypePrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBuiltInTypePrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierPrmrAltContext extends PrimaryContext {
		public ClassTipContext classTip() {
			return getRuleContext(ClassTipContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public IdentifierPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIdentifierPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIdentifierPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIdentifierPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuperPrmrAltContext extends PrimaryContext {
		public TerminalNode SUPER() { return getToken(GroovyParser.SUPER, 0); }
		public SuperPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSuperPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSuperPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSuperPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenPrmrAltContext extends PrimaryContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ParenPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterParenPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitParenPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitParenPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_primary);
		try {
			setState(1540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				_localctx = new IdentifierPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				classTip(2);
				setState(1523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1522);
					typeArguments();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new LiteralPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1525);
				literal();
				}
				break;
			case 3:
				_localctx = new GstringPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1526);
				gstring();
				}
				break;
			case 4:
				_localctx = new NewPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1527);
				match(NEW);
				setState(1528);
				nls();
				setState(1531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1529);
					constructorTip();
					}
					break;
				case 2:
					{
					setState(1530);
					creator(0);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new ThisPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1533);
				match(THIS);
				}
				break;
			case 6:
				_localctx = new SuperPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1534);
				match(SUPER);
				}
				break;
			case 7:
				_localctx = new ParenPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1535);
				parExpression();
				}
				break;
			case 8:
				_localctx = new ClosureOrLambdaExpressionPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1536);
				closureOrLambdaExpression();
				}
				break;
			case 9:
				_localctx = new ListPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1537);
				list();
				}
				break;
			case 10:
				_localctx = new MapPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1538);
				map();
				}
				break;
			case 11:
				_localctx = new BuiltInTypePrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1539);
				builtInType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends GroovyParserRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GroovyParser.COMMA, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			match(LBRACK);
			setState(1544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1543);
				expressionList(true);
				}
				break;
			}
			setState(1547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1546);
				match(COMMA);
				}
			}

			setState(1549);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends GroovyParserRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public MapEntryListContext mapEntryList() {
			return getRuleContext(MapEntryListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(GroovyParser.COMMA, 0); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			match(LBRACK);
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1552);
				mapEntryList();
				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1553);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				{
				setState(1556);
				match(COLON);
				}
				break;
			}
			setState(1559);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapEntryListContext extends GroovyParserRuleContext {
		public List<MapEntryContext> mapEntry() {
			return getRuleContexts(MapEntryContext.class);
		}
		public MapEntryContext mapEntry(int i) {
			return getRuleContext(MapEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public MapEntryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMapEntryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMapEntryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMapEntryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntryListContext mapEntryList() throws RecognitionException {
		MapEntryListContext _localctx = new MapEntryListContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_mapEntryList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			mapEntry();
			setState(1566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1562);
					match(COMMA);
					setState(1563);
					mapEntry();
					}
					} 
				}
				setState(1568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapEntryContext extends GroovyParserRuleContext {
		public MapEntryLabelContext mapEntryLabel() {
			return getRuleContext(MapEntryLabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(GroovyParser.MUL, 0); }
		public MapEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMapEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMapEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMapEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntryContext mapEntry() throws RecognitionException {
		MapEntryContext _localctx = new MapEntryContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_mapEntry);
		try {
			setState(1579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
				mapEntryLabel();
				setState(1570);
				match(COLON);
				setState(1571);
				nls();
				setState(1572);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1574);
				match(MUL);
				setState(1575);
				match(COLON);
				setState(1576);
				nls();
				setState(1577);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapEntryLabelContext extends GroovyParserRuleContext {
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MapEntryLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntryLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMapEntryLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMapEntryLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMapEntryLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntryLabelContext mapEntryLabel() throws RecognitionException {
		MapEntryLabelContext _localctx = new MapEntryLabelContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_mapEntryLabel);
		try {
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1581);
				keywords();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1582);
				primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends GroovyParserRuleContext {
		public int t;
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public DimsOptContext dimsOpt() {
			return getRuleContext(DimsOptContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public AnonymousInnerClassDeclarationContext anonymousInnerClassDeclaration() {
			return getRuleContext(AnonymousInnerClassDeclarationContext.class,0);
		}
		public List<AnnotationsOptContext> annotationsOpt() {
			return getRuleContexts(AnnotationsOptContext.class);
		}
		public AnnotationsOptContext annotationsOpt(int i) {
			return getRuleContext(AnnotationsOptContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(GroovyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(GroovyParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(GroovyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(GroovyParser.RBRACK, i);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CreatorContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator(int t) throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState(), t);
		enterRule(_localctx, 262, RULE_creator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			createdName();
			setState(1609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1586);
				if (!(0 == _localctx.t || 1 == _localctx.t)) throw new FailedPredicateException(this, "0 == $t || 1 == $t");
				setState(1587);
				nls();
				setState(1588);
				arguments();
				setState(1590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1589);
					anonymousInnerClassDeclaration(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1592);
				if (!(0 == _localctx.t)) throw new FailedPredicateException(this, "0 == $t");
				setState(1598); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1593);
						annotationsOpt();
						setState(1594);
						match(LBRACK);
						setState(1595);
						expression(0);
						setState(1596);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1600); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1602);
				dimsOpt();
				}
				break;
			case 3:
				{
				setState(1604);
				if (!(0 == _localctx.t)) throw new FailedPredicateException(this, "0 == $t");
				setState(1605);
				dims();
				setState(1606);
				nls();
				setState(1607);
				arrayInitializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends GroovyParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public VariableInitializersContext variableInitializers() {
			return getRuleContext(VariableInitializersContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_arrayInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			match(LBRACE);
			setState(1612);
			nls();
			setState(1614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1613);
				variableInitializers();
				}
				break;
			}
			setState(1616);
			nls();
			setState(1617);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousInnerClassDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnonymousInnerClassDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AnonymousInnerClassDeclarationContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_anonymousInnerClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnonymousInnerClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnonymousInnerClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnonymousInnerClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousInnerClassDeclarationContext anonymousInnerClassDeclaration(int t) throws RecognitionException {
		AnonymousInnerClassDeclarationContext _localctx = new AnonymousInnerClassDeclarationContext(_ctx, getState(), t);
		enterRule(_localctx, 266, RULE_anonymousInnerClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			classBody(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_createdName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			annotationsOpt();
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1622);
				primitiveType();
				}
				break;
			case 2:
				{
				setState(1623);
				qualifiedClassName();
				setState(1625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1624);
					typeArgumentsOrDiamond();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends GroovyParserRuleContext {
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			match(LT);
			setState(1630);
			nls();
			setState(1631);
			typeList();
			setState(1632);
			nls();
			setState(1633);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends GroovyParserRuleContext {
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_typeArgumentsOrDiamond);
		try {
			setState(1638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1635);
				match(LT);
				setState(1636);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1637);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public EnhancedArgumentListContext enhancedArgumentList() {
			return getRuleContext(EnhancedArgumentListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GroovyParser.COMMA, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(LPAREN);
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1641);
				enhancedArgumentList();
				}
				break;
			}
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1644);
				match(COMMA);
				}
				break;
			}
			setState(1647);
			rparen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends GroovyParserRuleContext {
		public List<ArgumentListElementContext> argumentListElement() {
			return getRuleContexts(ArgumentListElementContext.class);
		}
		public ArgumentListElementContext argumentListElement(int i) {
			return getRuleContext(ArgumentListElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_argumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			argumentListElement();
			setState(1656);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1650);
					match(COMMA);
					setState(1651);
					nls();
					setState(1652);
					argumentListElement();
					}
					} 
				}
				setState(1658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedArgumentListContext extends GroovyParserRuleContext {
		public List<EnhancedArgumentListElementContext> enhancedArgumentListElement() {
			return getRuleContexts(EnhancedArgumentListElementContext.class);
		}
		public EnhancedArgumentListElementContext enhancedArgumentListElement(int i) {
			return getRuleContext(EnhancedArgumentListElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public EnhancedArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnhancedArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnhancedArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnhancedArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedArgumentListContext enhancedArgumentList() throws RecognitionException {
		EnhancedArgumentListContext _localctx = new EnhancedArgumentListContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_enhancedArgumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			enhancedArgumentListElement();
			setState(1666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1660);
					match(COMMA);
					setState(1661);
					nls();
					setState(1662);
					enhancedArgumentListElement();
					}
					} 
				}
				setState(1668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListElementContext extends GroovyParserRuleContext {
		public ExpressionListElementContext expressionListElement() {
			return getRuleContext(ExpressionListElementContext.class,0);
		}
		public MapEntryContext mapEntry() {
			return getRuleContext(MapEntryContext.class,0);
		}
		public ArgumentListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArgumentListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArgumentListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArgumentListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListElementContext argumentListElement() throws RecognitionException {
		ArgumentListElementContext _localctx = new ArgumentListElementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_argumentListElement);
		try {
			setState(1671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1669);
				expressionListElement(true);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1670);
				mapEntry();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedArgumentListElementContext extends GroovyParserRuleContext {
		public ExpressionListElementContext expressionListElement() {
			return getRuleContext(ExpressionListElementContext.class,0);
		}
		public StandardLambdaExpressionContext standardLambdaExpression() {
			return getRuleContext(StandardLambdaExpressionContext.class,0);
		}
		public MapEntryContext mapEntry() {
			return getRuleContext(MapEntryContext.class,0);
		}
		public EnhancedArgumentListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedArgumentListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnhancedArgumentListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnhancedArgumentListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnhancedArgumentListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedArgumentListElementContext enhancedArgumentListElement() throws RecognitionException {
		EnhancedArgumentListElementContext _localctx = new EnhancedArgumentListElementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_enhancedArgumentListElement);
		try {
			setState(1676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1673);
				expressionListElement(true);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1674);
				standardLambdaExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1675);
				mapEntry();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends GroovyParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(GroovyParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends GroovyParserRuleContext {
		public ClassTipContext classTip() {
			return getRuleContext(ClassTipContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			classTip(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends GroovyParserRuleContext {
		public TerminalNode Identifier() { return getToken(GroovyParser.Identifier, 0); }
		public TerminalNode CapitalizedIdentifier() { return getToken(GroovyParser.CapitalizedIdentifier, 0); }
		public TerminalNode VAR() { return getToken(GroovyParser.VAR, 0); }
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public TerminalNode IN() { return getToken(GroovyParser.IN, 0); }
		public TerminalNode TRAIT() { return getToken(GroovyParser.TRAIT, 0); }
		public TerminalNode AS() { return getToken(GroovyParser.AS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_identifier);
		try {
			setState(1690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1682);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1683);
				match(CapitalizedIdentifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1684);
				match(VAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1685);
				if (!( DOT == _input.LT(2).getType() )) throw new FailedPredicateException(this, " DOT == _input.LT(2).getType() ");
				setState(1686);
				match(STATIC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1687);
				match(IN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1688);
				match(TRAIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1689);
				match(AS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltInTypeContext extends GroovyParserRuleContext {
		public TerminalNode BuiltInPrimitiveType() { return getToken(GroovyParser.BuiltInPrimitiveType, 0); }
		public TerminalNode VOID() { return getToken(GroovyParser.VOID, 0); }
		public BuiltInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBuiltInType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBuiltInType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBuiltInType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInTypeContext builtInType() throws RecognitionException {
		BuiltInTypeContext _localctx = new BuiltInTypeContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_builtInType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			_la = _input.LA(1);
			if ( !(_la==BuiltInPrimitiveType || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordsContext extends GroovyParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(GroovyParser.ABSTRACT, 0); }
		public TerminalNode AS() { return getToken(GroovyParser.AS, 0); }
		public TerminalNode ASSERT() { return getToken(GroovyParser.ASSERT, 0); }
		public TerminalNode BREAK() { return getToken(GroovyParser.BREAK, 0); }
		public TerminalNode CASE() { return getToken(GroovyParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(GroovyParser.CATCH, 0); }
		public TerminalNode CLASS() { return getToken(GroovyParser.CLASS, 0); }
		public TerminalNode CONST() { return getToken(GroovyParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(GroovyParser.CONTINUE, 0); }
		public TerminalNode DEF() { return getToken(GroovyParser.DEF, 0); }
		public TerminalNode DEFAULT() { return getToken(GroovyParser.DEFAULT, 0); }
		public TerminalNode DO() { return getToken(GroovyParser.DO, 0); }
		public TerminalNode ELSE() { return getToken(GroovyParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(GroovyParser.ENUM, 0); }
		public TerminalNode EXTENDS() { return getToken(GroovyParser.EXTENDS, 0); }
		public TerminalNode FINAL() { return getToken(GroovyParser.FINAL, 0); }
		public TerminalNode FINALLY() { return getToken(GroovyParser.FINALLY, 0); }
		public TerminalNode FOR() { return getToken(GroovyParser.FOR, 0); }
		public TerminalNode GOTO() { return getToken(GroovyParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(GroovyParser.IF, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(GroovyParser.IMPLEMENTS, 0); }
		public TerminalNode IMPORT() { return getToken(GroovyParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(GroovyParser.IN, 0); }
		public TerminalNode INSTANCEOF() { return getToken(GroovyParser.INSTANCEOF, 0); }
		public TerminalNode INTERFACE() { return getToken(GroovyParser.INTERFACE, 0); }
		public TerminalNode NATIVE() { return getToken(GroovyParser.NATIVE, 0); }
		public TerminalNode NEW() { return getToken(GroovyParser.NEW, 0); }
		public TerminalNode PACKAGE() { return getToken(GroovyParser.PACKAGE, 0); }
		public TerminalNode RETURN() { return getToken(GroovyParser.RETURN, 0); }
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(GroovyParser.STRICTFP, 0); }
		public TerminalNode SUPER() { return getToken(GroovyParser.SUPER, 0); }
		public TerminalNode SWITCH() { return getToken(GroovyParser.SWITCH, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(GroovyParser.SYNCHRONIZED, 0); }
		public TerminalNode THIS() { return getToken(GroovyParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(GroovyParser.THROW, 0); }
		public TerminalNode THROWS() { return getToken(GroovyParser.THROWS, 0); }
		public TerminalNode TRANSIENT() { return getToken(GroovyParser.TRANSIENT, 0); }
		public TerminalNode TRAIT() { return getToken(GroovyParser.TRAIT, 0); }
		public TerminalNode THREADSAFE() { return getToken(GroovyParser.THREADSAFE, 0); }
		public TerminalNode TRY() { return getToken(GroovyParser.TRY, 0); }
		public TerminalNode VAR() { return getToken(GroovyParser.VAR, 0); }
		public TerminalNode VOLATILE() { return getToken(GroovyParser.VOLATILE, 0); }
		public TerminalNode WHILE() { return getToken(GroovyParser.WHILE, 0); }
		public TerminalNode NullLiteral() { return getToken(GroovyParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(GroovyParser.BooleanLiteral, 0); }
		public TerminalNode BuiltInPrimitiveType() { return getToken(GroovyParser.BuiltInPrimitiveType, 0); }
		public TerminalNode VOID() { return getToken(GroovyParser.VOID, 0); }
		public TerminalNode PUBLIC() { return getToken(GroovyParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(GroovyParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(GroovyParser.PRIVATE, 0); }
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitKeywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << DEF) | (1L << IN) | (1L << TRAIT) | (1L << THREADSAFE) | (1L << VAR) | (1L << BuiltInPrimitiveType) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << CATCH) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << ELSE) | (1L << ENUM) | (1L << EXTENDS) | (1L << FINAL) | (1L << FINALLY) | (1L << FOR) | (1L << IF) | (1L << GOTO) | (1L << IMPLEMENTS) | (1L << IMPORT) | (1L << INSTANCEOF) | (1L << INTERFACE) | (1L << NATIVE) | (1L << NEW) | (1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << THROWS) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RparenContext extends GroovyParserRuleContext {
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public RparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rparen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterRparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitRparen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitRparen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RparenContext rparen() throws RecognitionException {
		RparenContext _localctx = new RparenContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_rparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1696);
				error();
				}
				break;
			}
			setState(1699);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NlsContext extends GroovyParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public NlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NlsContext nls() throws RecognitionException {
		NlsContext _localctx = new NlsContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_nls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1701);
					match(NL);
					}
					} 
				}
				setState(1706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SepContext extends GroovyParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(GroovyParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GroovyParser.SEMI, i);
		}
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_sep);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1708); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1707);
					_la = _input.LA(1);
					if ( !(_la==SEMI || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1710); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends GroovyParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(GroovyParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(GroovyParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(GroovyParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(GroovyParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(GroovyParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(GroovyParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(GroovyParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(GroovyParser.RBRACE, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(GroovyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(GroovyParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(GroovyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(GroovyParser.RBRACK, i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(GroovyParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GroovyParser.SEMI, i);
		}
		public List<TerminalNode> DOT() { return getTokens(GroovyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GroovyParser.DOT, i);
		}
		public List<TerminalNode> WS() { return getTokens(GroovyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GroovyParser.WS, i);
		}
		public List<TerminalNode> EOF() { return getTokens(GroovyParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(GroovyParser.EOF, i);
		}
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_error);
		int _la;
		try {
			int _alt;
			setState(1748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1712);
				match(LPAREN);
				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << GStringBegin) | (1L << GStringEnd) | (1L << GStringPart) | (1L << GStringPathPart) | (1L << RollBackOne) | (1L << AS) | (1L << DEF) | (1L << IN) | (1L << TRAIT) | (1L << THREADSAFE) | (1L << VAR) | (1L << BuiltInPrimitiveType) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << CATCH) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << ELSE) | (1L << ENUM) | (1L << EXTENDS) | (1L << FINAL) | (1L << FINALLY) | (1L << FOR) | (1L << IF) | (1L << GOTO) | (1L << IMPLEMENTS) | (1L << IMPORT) | (1L << INSTANCEOF) | (1L << INTERFACE) | (1L << NATIVE) | (1L << NEW) | (1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << THROWS) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << RANGE_INCLUSIVE) | (1L << RANGE_EXCLUSIVE) | (1L << SPREAD_DOT) | (1L << SAFE_DOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SAFE_CHAIN_DOT - 64)) | (1L << (ELVIS - 64)) | (1L << (METHOD_POINTER - 64)) | (1L << (METHOD_REFERENCE - 64)) | (1L << (REGEX_FIND - 64)) | (1L << (REGEX_MATCH - 64)) | (1L << (POWER - 64)) | (1L << (POWER_ASSIGN - 64)) | (1L << (SPACESHIP - 64)) | (1L << (IDENTICAL - 64)) | (1L << (NOT_IDENTICAL - 64)) | (1L << (ARROW - 64)) | (1L << (NOT_INSTANCEOF - 64)) | (1L << (NOT_IN - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (RBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (COMMA - 64)) | (1L << (DOT - 64)) | (1L << (ASSIGN - 64)) | (1L << (GT - 64)) | (1L << (LT - 64)) | (1L << (NOT - 64)) | (1L << (BITNOT - 64)) | (1L << (QUESTION - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (NOTEQUAL - 64)) | (1L << (AND - 64)) | (1L << (OR - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (DIV - 64)) | (1L << (BITAND - 64)) | (1L << (BITOR - 64)) | (1L << (XOR - 64)) | (1L << (MOD - 64)) | (1L << (ADD_ASSIGN - 64)) | (1L << (SUB_ASSIGN - 64)) | (1L << (MUL_ASSIGN - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (AND_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (XOR_ASSIGN - 64)) | (1L << (MOD_ASSIGN - 64)) | (1L << (LSHIFT_ASSIGN - 64)) | (1L << (RSHIFT_ASSIGN - 64)) | (1L << (URSHIFT_ASSIGN - 64)) | (1L << (ELVIS_ASSIGN - 64)) | (1L << (CapitalizedIdentifier - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (WS - 64)) | (1L << (NL - 64)))) != 0) || _la==SH_COMMENT || _la==UNEXPECTED_CHAR) {
					{
					{
					setState(1713);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==RPAREN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1718);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1719);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1720);
				match(LBRACE);
				setState(1724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << GStringBegin) | (1L << GStringEnd) | (1L << GStringPart) | (1L << GStringPathPart) | (1L << RollBackOne) | (1L << AS) | (1L << DEF) | (1L << IN) | (1L << TRAIT) | (1L << THREADSAFE) | (1L << VAR) | (1L << BuiltInPrimitiveType) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << CATCH) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << ELSE) | (1L << ENUM) | (1L << EXTENDS) | (1L << FINAL) | (1L << FINALLY) | (1L << FOR) | (1L << IF) | (1L << GOTO) | (1L << IMPLEMENTS) | (1L << IMPORT) | (1L << INSTANCEOF) | (1L << INTERFACE) | (1L << NATIVE) | (1L << NEW) | (1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << THROWS) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << RANGE_INCLUSIVE) | (1L << RANGE_EXCLUSIVE) | (1L << SPREAD_DOT) | (1L << SAFE_DOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SAFE_CHAIN_DOT - 64)) | (1L << (ELVIS - 64)) | (1L << (METHOD_POINTER - 64)) | (1L << (METHOD_REFERENCE - 64)) | (1L << (REGEX_FIND - 64)) | (1L << (REGEX_MATCH - 64)) | (1L << (POWER - 64)) | (1L << (POWER_ASSIGN - 64)) | (1L << (SPACESHIP - 64)) | (1L << (IDENTICAL - 64)) | (1L << (NOT_IDENTICAL - 64)) | (1L << (ARROW - 64)) | (1L << (NOT_INSTANCEOF - 64)) | (1L << (NOT_IN - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (COMMA - 64)) | (1L << (DOT - 64)) | (1L << (ASSIGN - 64)) | (1L << (GT - 64)) | (1L << (LT - 64)) | (1L << (NOT - 64)) | (1L << (BITNOT - 64)) | (1L << (QUESTION - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (NOTEQUAL - 64)) | (1L << (AND - 64)) | (1L << (OR - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (DIV - 64)) | (1L << (BITAND - 64)) | (1L << (BITOR - 64)) | (1L << (XOR - 64)) | (1L << (MOD - 64)) | (1L << (ADD_ASSIGN - 64)) | (1L << (SUB_ASSIGN - 64)) | (1L << (MUL_ASSIGN - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (AND_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (XOR_ASSIGN - 64)) | (1L << (MOD_ASSIGN - 64)) | (1L << (LSHIFT_ASSIGN - 64)) | (1L << (RSHIFT_ASSIGN - 64)) | (1L << (URSHIFT_ASSIGN - 64)) | (1L << (ELVIS_ASSIGN - 64)) | (1L << (CapitalizedIdentifier - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (WS - 64)) | (1L << (NL - 64)))) != 0) || _la==SH_COMMENT || _la==UNEXPECTED_CHAR) {
					{
					{
					setState(1721);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==RBRACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1726);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1727);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1728);
				match(LBRACK);
				setState(1732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << GStringBegin) | (1L << GStringEnd) | (1L << GStringPart) | (1L << GStringPathPart) | (1L << RollBackOne) | (1L << AS) | (1L << DEF) | (1L << IN) | (1L << TRAIT) | (1L << THREADSAFE) | (1L << VAR) | (1L << BuiltInPrimitiveType) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << CATCH) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << ELSE) | (1L << ENUM) | (1L << EXTENDS) | (1L << FINAL) | (1L << FINALLY) | (1L << FOR) | (1L << IF) | (1L << GOTO) | (1L << IMPLEMENTS) | (1L << IMPORT) | (1L << INSTANCEOF) | (1L << INTERFACE) | (1L << NATIVE) | (1L << NEW) | (1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << THROWS) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << RANGE_INCLUSIVE) | (1L << RANGE_EXCLUSIVE) | (1L << SPREAD_DOT) | (1L << SAFE_DOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SAFE_CHAIN_DOT - 64)) | (1L << (ELVIS - 64)) | (1L << (METHOD_POINTER - 64)) | (1L << (METHOD_REFERENCE - 64)) | (1L << (REGEX_FIND - 64)) | (1L << (REGEX_MATCH - 64)) | (1L << (POWER - 64)) | (1L << (POWER_ASSIGN - 64)) | (1L << (SPACESHIP - 64)) | (1L << (IDENTICAL - 64)) | (1L << (NOT_IDENTICAL - 64)) | (1L << (ARROW - 64)) | (1L << (NOT_INSTANCEOF - 64)) | (1L << (NOT_IN - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (RBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (COMMA - 64)) | (1L << (DOT - 64)) | (1L << (ASSIGN - 64)) | (1L << (GT - 64)) | (1L << (LT - 64)) | (1L << (NOT - 64)) | (1L << (BITNOT - 64)) | (1L << (QUESTION - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (NOTEQUAL - 64)) | (1L << (AND - 64)) | (1L << (OR - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (DIV - 64)) | (1L << (BITAND - 64)) | (1L << (BITOR - 64)) | (1L << (XOR - 64)) | (1L << (MOD - 64)) | (1L << (ADD_ASSIGN - 64)) | (1L << (SUB_ASSIGN - 64)) | (1L << (MUL_ASSIGN - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (AND_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (XOR_ASSIGN - 64)) | (1L << (MOD_ASSIGN - 64)) | (1L << (LSHIFT_ASSIGN - 64)) | (1L << (RSHIFT_ASSIGN - 64)) | (1L << (URSHIFT_ASSIGN - 64)) | (1L << (ELVIS_ASSIGN - 64)) | (1L << (CapitalizedIdentifier - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (WS - 64)) | (1L << (NL - 64)))) != 0) || _la==SH_COMMENT || _la==UNEXPECTED_CHAR) {
					{
					{
					setState(1729);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==RBRACK) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1735);
				match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << GStringBegin) | (1L << GStringEnd) | (1L << GStringPart) | (1L << GStringPathPart) | (1L << RollBackOne) | (1L << AS) | (1L << DEF) | (1L << IN) | (1L << TRAIT) | (1L << THREADSAFE) | (1L << VAR) | (1L << BuiltInPrimitiveType) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << CATCH) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << ELSE) | (1L << ENUM) | (1L << EXTENDS) | (1L << FINAL) | (1L << FINALLY) | (1L << FOR) | (1L << IF) | (1L << GOTO) | (1L << IMPLEMENTS) | (1L << IMPORT) | (1L << INSTANCEOF) | (1L << INTERFACE) | (1L << NATIVE) | (1L << NEW) | (1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << THROWS) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << RANGE_INCLUSIVE) | (1L << RANGE_EXCLUSIVE) | (1L << SPREAD_DOT) | (1L << SAFE_DOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SAFE_CHAIN_DOT - 64)) | (1L << (ELVIS - 64)) | (1L << (METHOD_POINTER - 64)) | (1L << (METHOD_REFERENCE - 64)) | (1L << (REGEX_FIND - 64)) | (1L << (REGEX_MATCH - 64)) | (1L << (POWER - 64)) | (1L << (POWER_ASSIGN - 64)) | (1L << (SPACESHIP - 64)) | (1L << (IDENTICAL - 64)) | (1L << (NOT_IDENTICAL - 64)) | (1L << (ARROW - 64)) | (1L << (NOT_INSTANCEOF - 64)) | (1L << (NOT_IN - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (RBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (COMMA - 64)) | (1L << (DOT - 64)) | (1L << (ASSIGN - 64)) | (1L << (GT - 64)) | (1L << (LT - 64)) | (1L << (NOT - 64)) | (1L << (BITNOT - 64)) | (1L << (QUESTION - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (NOTEQUAL - 64)) | (1L << (AND - 64)) | (1L << (OR - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (DIV - 64)) | (1L << (BITAND - 64)) | (1L << (BITOR - 64)) | (1L << (XOR - 64)) | (1L << (MOD - 64)) | (1L << (ADD_ASSIGN - 64)) | (1L << (SUB_ASSIGN - 64)) | (1L << (MUL_ASSIGN - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (AND_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (XOR_ASSIGN - 64)) | (1L << (MOD_ASSIGN - 64)) | (1L << (LSHIFT_ASSIGN - 64)) | (1L << (RSHIFT_ASSIGN - 64)) | (1L << (URSHIFT_ASSIGN - 64)) | (1L << (ELVIS_ASSIGN - 64)) | (1L << (CapitalizedIdentifier - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (WS - 64)))) != 0) || _la==SH_COMMENT || _la==UNEXPECTED_CHAR) {
					{
					{
					setState(1736);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1742);
				match(NL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1744); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1743);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==EOF || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (LPAREN - 78)) | (1L << (RPAREN - 78)) | (1L << (LBRACE - 78)) | (1L << (RBRACE - 78)) | (1L << (LBRACK - 78)) | (1L << (RBRACK - 78)) | (1L << (SEMI - 78)) | (1L << (DOT - 78)) | (1L << (WS - 78)) | (1L << (NL - 78)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1746); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorTipContext extends GroovyParserRuleContext {
		public StandardClassOrInterfaceTypeContext standardClassOrInterfaceType() {
			return getRuleContext(StandardClassOrInterfaceTypeContext.class,0);
		}
		public ConstructorTipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorTip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterConstructorTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitConstructorTip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitConstructorTip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorTipContext constructorTip() throws RecognitionException {
		ConstructorTipContext _localctx = new ConstructorTipContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_constructorTip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			standardClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTipContext extends GroovyParserRuleContext {
		public int t;
		public TerminalNode Identifier() { return getToken(GroovyParser.Identifier, 0); }
		public TerminalNode CapitalizedIdentifier() { return getToken(GroovyParser.CapitalizedIdentifier, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassTipContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassTipContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_classTip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassTip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassTip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTipContext classTip(int t) throws RecognitionException {
		ClassTipContext _localctx = new ClassTipContext(_ctx, getState(), t);
		enterRule(_localctx, 304, RULE_classTip);
		int _la;
		try {
			setState(1758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1752);
				if (!( 0 == _localctx.t )) throw new FailedPredicateException(this, " 0 == $t ");
				setState(1753);
				_la = _input.LA(1);
				if ( !(_la==CapitalizedIdentifier || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1754);
				if (!( 1 == _localctx.t )) throw new FailedPredicateException(this, " 1 == $t ");
				setState(1755);
				_la = _input.LA(1);
				if ( !(_la==CapitalizedIdentifier || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1756);
				if (!( 2 == _localctx.t )) throw new FailedPredicateException(this, " 2 == $t ");
				setState(1757);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodOrFieldTipContext extends GroovyParserRuleContext {
		public ClassTipContext classTip() {
			return getRuleContext(ClassTipContext.class,0);
		}
		public MethodOrFieldTipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodOrFieldTip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMethodOrFieldTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMethodOrFieldTip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMethodOrFieldTip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodOrFieldTipContext methodOrFieldTip() throws RecognitionException {
		MethodOrFieldTipContext _localctx = new MethodOrFieldTipContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_methodOrFieldTip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			classTip(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableTipContext extends GroovyParserRuleContext {
		public ClassTipContext classTip() {
			return getRuleContext(ClassTipContext.class,0);
		}
		public VariableTipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableTip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableTip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableTip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTipContext variableTip() throws RecognitionException {
		VariableTipContext _localctx = new VariableTipContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_variableTip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			classTip(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathEndContext extends GroovyParserRuleContext {
		public TerminalNode DOT() { return getToken(GroovyParser.DOT, 0); }
		public PathEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPathEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPathEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPathEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathEndContext pathEnd() throws RecognitionException {
		PathEndContext _localctx = new PathEndContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_pathEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return classDeclaration_sempred((ClassDeclarationContext)_localctx, predIndex);
		case 19:
			return classBody_sempred((ClassBodyContext)_localctx, predIndex);
		case 24:
			return methodDeclaration_sempred((MethodDeclarationContext)_localctx, predIndex);
		case 26:
			return returnType_sempred((ReturnTypeContext)_localctx, predIndex);
		case 79:
			return localVariableDeclaration_sempred((LocalVariableDeclarationContext)_localctx, predIndex);
		case 80:
			return classifiedModifiers_sempred((ClassifiedModifiersContext)_localctx, predIndex);
		case 93:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 115:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 117:
			return commandExpression_sempred((CommandExpressionContext)_localctx, predIndex);
		case 131:
			return creator_sempred((CreatorContext)_localctx, predIndex);
		case 144:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 152:
			return classTip_sempred((ClassTipContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean classDeclaration_sempred(ClassDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  3 != _localctx.t ;
		case 1:
			return  2 != _localctx.t ;
		case 2:
			return 1 == _localctx.t;
		case 3:
			return 1 != _localctx.t;
		}
		return true;
	}
	private boolean classBody_sempred(ClassBodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return  2 == _localctx.t ;
		}
		return true;
	}
	private boolean methodDeclaration_sempred(MethodDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return  3 == _localctx.ct ;
		}
		return true;
	}
	private boolean returnType_sempred(ReturnTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return  3 != _localctx.ct ;
		}
		return true;
	}
	private boolean localVariableDeclaration_sempred(LocalVariableDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return  !SemanticPredicates.isInvalidLocalVariableDeclaration(_input) ;
		}
		return true;
	}
	private boolean classifiedModifiers_sempred(ClassifiedModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return  0 == _localctx.t ;
		case 9:
			return  1 == _localctx.t ;
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return  !SemanticPredicates.isInvalidMethodDeclaration(_input) ;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 17);
		case 12:
			return precpred(_ctx, 15);
		case 13:
			return precpred(_ctx, 14);
		case 14:
			return precpred(_ctx, 13);
		case 15:
			return precpred(_ctx, 11);
		case 16:
			return precpred(_ctx, 10);
		case 17:
			return precpred(_ctx, 9);
		case 18:
			return precpred(_ctx, 8);
		case 19:
			return precpred(_ctx, 7);
		case 20:
			return precpred(_ctx, 6);
		case 21:
			return precpred(_ctx, 5);
		case 22:
			return precpred(_ctx, 4);
		case 23:
			return precpred(_ctx, 3);
		case 24:
			return precpred(_ctx, 12);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean commandExpression_sempred(CommandExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return  !SemanticPredicates.isFollowingArgumentsOrClosure(((CommandExpressionContext)_localctx).expression) ;
		}
		return true;
	}
	private boolean creator_sempred(CreatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return 0 == _localctx.t || 1 == _localctx.t;
		case 28:
			return 0 == _localctx.t;
		case 29:
			return 0 == _localctx.t;
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return  DOT == _input.LT(2).getType() ;
		}
		return true;
	}
	private boolean classTip_sempred(ClassTipContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return  0 == _localctx.t ;
		case 32:
			return  1 == _localctx.t ;
		case 33:
			return  2 == _localctx.t ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0083\u06e9\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\3\2\3\2\5\2\u013d\n\2\3\2\5\2\u0140\n"+
		"\2\3\2\5\2\u0143\n\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u014b\n\3\f\3\16\3\u014e"+
		"\13\3\3\3\5\3\u0151\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u015a\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u0161\n\5\3\6\3\6\3\6\3\7\3\7\5\7\u0168\n\7\3\b\5"+
		"\b\u016b\n\b\3\t\3\t\3\t\6\t\u0170\n\t\r\t\16\t\u0171\3\n\5\n\u0175\n"+
		"\n\3\13\3\13\3\13\6\13\u017a\n\13\r\13\16\13\u017b\3\f\3\f\5\f\u0180\n"+
		"\f\3\r\3\r\5\r\u0184\n\r\3\16\5\16\u0187\n\16\3\17\3\17\3\17\6\17\u018c"+
		"\n\17\r\17\16\17\u018d\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0197\n"+
		"\20\f\20\16\20\u019a\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u01a4\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u01ab\n\22\f\22\16\22\u01ae"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\7\23\u01b5\n\23\f\23\16\23\u01b8\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01c5\n\24"+
		"\3\24\3\24\3\24\3\24\5\24\u01cb\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u01d4\n\24\3\24\3\24\5\24\u01d8\n\24\3\24\5\24\u01db\n\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u01e3\n\24\3\24\5\24\u01e6\n\24\3\24\5\24"+
		"\u01e9\n\24\3\24\5\24\u01ec\n\24\3\25\3\25\3\25\3\25\5\25\u01f2\n\25\3"+
		"\25\5\25\u01f5\n\25\3\25\5\25\u01f8\n\25\3\25\5\25\u01fb\n\25\3\25\3\25"+
		"\3\25\7\25\u0200\n\25\f\25\16\25\u0203\13\25\3\25\5\25\u0206\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0210\n\26\f\26\16\26\u0213\13"+
		"\26\3\26\3\26\3\26\5\26\u0218\n\26\3\27\3\27\3\27\5\27\u021d\n\27\3\27"+
		"\5\27\u0220\n\27\3\30\3\30\3\30\5\30\u0225\n\30\3\30\3\30\5\30\u0229\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\5\31\u0230\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u023b\n\32\3\32\3\32\5\32\u023f\n\32\3\32\5"+
		"\32\u0242\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u024b\n\32\3\32"+
		"\3\32\5\32\u024f\n\32\5\32\u0251\n\32\3\33\3\33\5\33\u0255\n\33\3\34\3"+
		"\34\3\34\5\34\u025a\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\7\36\u0263"+
		"\n\36\f\36\16\36\u0266\13\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u026e"+
		"\n\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u027b\n\"\f\"\16\"\u027e"+
		"\13\"\3\"\3\"\5\"\u0282\n\"\3#\3#\3#\3#\6#\u0288\n#\r#\16#\u0289\3$\3"+
		"$\3%\3%\3%\5%\u0291\n%\3%\5%\u0294\n%\3&\3&\3&\5&\u0299\n&\3&\5&\u029c"+
		"\n&\3&\5&\u029f\n&\3\'\3\'\5\'\u02a3\n\'\3\'\5\'\u02a6\n\'\3(\3(\5(\u02aa"+
		"\n(\3)\3)\5)\u02ae\n)\3*\3*\3+\3+\3+\3+\3+\3+\3+\7+\u02b9\n+\f+\16+\u02bc"+
		"\13+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\5,\u02c8\n,\5,\u02ca\n,\3-\3-\3-\3"+
		".\3.\3.\3.\3.\7.\u02d4\n.\f.\16.\u02d7\13.\3/\3/\5/\u02db\n/\3/\3/\3\60"+
		"\3\60\5\60\u02e1\n\60\3\60\3\60\3\60\3\60\7\60\u02e7\n\60\f\60\16\60\u02ea"+
		"\13\60\3\61\3\61\3\61\3\62\3\62\5\62\u02f1\n\62\3\62\5\62\u02f4\n\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\5\62\u02fc\n\62\3\63\3\63\3\64\3\64\3\64"+
		"\7\64\u0303\n\64\f\64\16\64\u0306\13\64\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u030d\n\65\3\66\3\66\3\66\7\66\u0312\n\66\f\66\16\66\u0315\13\66\3\67"+
		"\3\67\3\67\38\38\38\38\78\u031e\n8\f8\168\u0321\138\39\39\39\39\39\59"+
		"\u0328\n9\3:\3:\3:\3:\7:\u032e\n:\f:\16:\u0331\13:\3:\3:\3;\3;\3;\5;\u0338"+
		"\n;\3;\3;\5;\u033c\n;\3<\3<\7<\u0340\n<\f<\16<\u0343\13<\3=\3=\3=\3=\3"+
		"=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3@\3@\5@\u0355\n@\3A\3A\5A\u0359\nA\3B\3"+
		"B\3B\5B\u035e\nB\3B\3B\3B\3B\5B\u0364\nB\3B\3B\3B\3C\3C\5C\u036b\nC\3"+
		"D\5D\u036e\nD\3E\3E\3E\3E\7E\u0374\nE\fE\16E\u0377\13E\3E\5E\u037a\nE"+
		"\3F\3F\3F\7F\u037f\nF\fF\16F\u0382\13F\3G\3G\3G\3G\5G\u0388\nG\3G\5G\u038b"+
		"\nG\3H\3H\5H\u038f\nH\3I\3I\3J\3J\3J\7J\u0396\nJ\fJ\16J\u0399\13J\3K\3"+
		"K\3K\3K\3K\3K\3L\3L\5L\u03a3\nL\3M\3M\3M\5M\u03a8\nM\3N\3N\3N\3N\7N\u03ae"+
		"\nN\fN\16N\u03b1\13N\5N\u03b3\nN\3N\5N\u03b6\nN\3N\3N\3O\3O\3O\7O\u03bd"+
		"\nO\fO\16O\u03c0\13O\5O\u03c2\nO\3O\3O\3O\3P\3P\5P\u03c9\nP\3Q\3Q\3Q\3"+
		"R\3R\3R\3R\5R\u03d2\nR\3S\3S\5S\u03d6\nS\3S\5S\u03d9\nS\3S\3S\3S\3S\3"+
		"S\3S\5S\u03e1\nS\3S\5S\u03e4\nS\3S\3S\5S\u03e8\nS\5S\u03ea\nS\3T\3T\3"+
		"T\3T\7T\u03f0\nT\fT\16T\u03f3\13T\3T\3T\3U\5U\u03f8\nU\3U\3U\3V\3V\3V"+
		"\3V\6V\u0400\nV\rV\16V\u0401\3V\3V\3W\3W\5W\u0408\nW\3X\3X\3X\3X\3X\3"+
		"X\5X\u0410\nX\3X\3X\3X\3X\5X\u0416\nX\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u041e\nY\f"+
		"Y\16Y\u0421\13Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\5Z\u0439\nZ\3[\3[\5[\u043d\n[\3\\\3\\\5\\\u0441\n\\\3]\3"+
		"]\5]\u0445\n]\3]\3]\3]\3]\3]\7]\u044c\n]\f]\16]\u044f\13]\3]\3]\3]\5]"+
		"\u0454\n]\3^\3^\3^\3^\3^\3^\3^\5^\u045d\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\5_\u046a\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\5_\u047e\n_\3`\3`\3`\3`\5`\u0484\n`\3`\3`\3`\3`\3`\3a\3a\3a\7a\u048e"+
		"\na\fa\16a\u0491\13a\3b\3b\3b\3b\3c\3c\3c\3c\5c\u049b\nc\3c\3c\3d\3d\3"+
		"d\3d\7d\u04a3\nd\fd\16d\u04a6\13d\3e\3e\5e\u04aa\ne\3f\3f\3f\6f\u04af"+
		"\nf\rf\16f\u04b0\3f\3f\3g\3g\3g\3g\3g\3g\5g\u04bb\ng\3h\3h\5h\u04bf\n"+
		"h\3i\3i\5i\u04c3\ni\3i\3i\3i\3i\3j\5j\u04ca\nj\3j\3j\5j\u04ce\nj\3j\3"+
		"j\5j\u04d2\nj\3k\3k\5k\u04d6\nk\3l\3l\3m\3m\3m\3m\3n\3n\3o\3o\3o\3o\3"+
		"p\3p\3p\7p\u04e7\np\fp\16p\u04ea\13p\3q\3q\3q\5q\u04ef\nq\3q\3q\3r\3r"+
		"\5r\u04f5\nr\3s\3s\3t\3t\5t\u04fb\nt\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u"+
		"\3u\3u\3u\3u\3u\3u\5u\u050e\nu\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u"+
		"\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u0529\nu\3u\5u\u052c\nu\3u\3u"+
		"\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u"+
		"\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u"+
		"\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u056c\nu\3u\3u\3u\3u\3u"+
		"\3u\3u\3u\3u\3u\3u\3u\3u\3u\7u\u057c\nu\fu\16u\u057f\13u\3v\3v\3v\3v\3"+
		"v\3v\3v\3v\3v\3v\5v\u058b\nv\3w\3w\3w\3w\5w\u0591\nw\3w\7w\u0594\nw\f"+
		"w\16w\u0597\13w\3x\3x\6x\u059b\nx\rx\16x\u059c\3x\5x\u05a0\nx\3y\3y\3"+
		"y\3y\7y\u05a6\ny\fy\16y\u05a9\13y\3y\5y\u05ac\ny\3z\3z\3z\3z\3z\5z\u05b3"+
		"\nz\3z\3z\3z\3z\5z\u05b9\nz\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u05c4\nz\3z"+
		"\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u05d5\nz\3{\3{\3{\3{\5{"+
		"\u05db\n{\3|\3|\5|\u05df\n|\3}\5}\u05e2\n}\3}\3}\5}\u05e6\n}\3}\3}\3~"+
		"\5~\u05eb\n~\3~\3~\3~\5~\u05f0\n~\3~\3~\3\177\3\177\5\177\u05f6\n\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u05fe\n\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\5\177\u0607\n\177\3\u0080\3\u0080\5\u0080\u060b"+
		"\n\u0080\3\u0080\5\u0080\u060e\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u0615\n\u0081\3\u0081\5\u0081\u0618\n\u0081\3\u0081\3"+
		"\u0081\3\u0082\3\u0082\3\u0082\7\u0082\u061f\n\u0082\f\u0082\16\u0082"+
		"\u0622\13\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\5\u0083\u062e\n\u0083\3\u0084\3\u0084\5\u0084"+
		"\u0632\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0639\n"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\6\u0085\u0641\n"+
		"\u0085\r\u0085\16\u0085\u0642\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\5\u0085\u064c\n\u0085\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u0651\n\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\5\u0088\u065c\n\u0088\5\u0088\u065e\n\u0088\3\u0089\3"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u0669\n\u008a\3\u008b\3\u008b\5\u008b\u066d\n\u008b\3\u008b\5\u008b\u0670"+
		"\n\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c"+
		"\u0679\n\u008c\f\u008c\16\u008c\u067c\13\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\7\u008d\u0683\n\u008d\f\u008d\16\u008d\u0686\13\u008d"+
		"\3\u008e\3\u008e\5\u008e\u068a\n\u008e\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u068f\n\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u069d\n\u0092\3\u0093"+
		"\3\u0093\3\u0094\3\u0094\3\u0095\5\u0095\u06a4\n\u0095\3\u0095\3\u0095"+
		"\3\u0096\7\u0096\u06a9\n\u0096\f\u0096\16\u0096\u06ac\13\u0096\3\u0097"+
		"\6\u0097\u06af\n\u0097\r\u0097\16\u0097\u06b0\3\u0098\3\u0098\7\u0098"+
		"\u06b5\n\u0098\f\u0098\16\u0098\u06b8\13\u0098\3\u0098\3\u0098\3\u0098"+
		"\7\u0098\u06bd\n\u0098\f\u0098\16\u0098\u06c0\13\u0098\3\u0098\3\u0098"+
		"\3\u0098\7\u0098\u06c5\n\u0098\f\u0098\16\u0098\u06c8\13\u0098\3\u0098"+
		"\3\u0098\7\u0098\u06cc\n\u0098\f\u0098\16\u0098\u06cf\13\u0098\3\u0098"+
		"\3\u0098\6\u0098\u06d3\n\u0098\r\u0098\16\u0098\u06d4\5\u0098\u06d7\n"+
		"\u0098\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\5\u009a\u06e1\n\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d"+
		"\3\u009d\2\3\u00e8\u009e\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\2\35\b\2\n\n\16\16&&\61\61\65\65"+
		"88\7\2\20\20\30\30\35\35)+-.\b\2\n\n\16\16\20\20\35\35)+-.\4\2\34\34/"+
		"/\4\2WW__\4\2\13\13__\3\2fg\3\2\\]\3\2fi\4\2jkoo\3\2hi\3\2>?\6\2\13\13"+
		"OOZ[ab\5\2JL``cc\3\2FG\5\2\t\t$$NN\5\2IIYYp{\4\2@BXX\4\2\17\17\67\67\4"+
		"\2\t9<=\4\2VV\u0081\u0081\3\2QQ\3\2SS\3\2UU\3\2\u0081\u0081\5\3PVXX\u0080"+
		"\u0081\3\2|}\2\u0764\2\u013a\3\2\2\2\4\u0146\3\2\2\2\6\u0152\3\2\2\2\b"+
		"\u0156\3\2\2\2\n\u0162\3\2\2\2\f\u0167\3\2\2\2\16\u016a\3\2\2\2\20\u016f"+
		"\3\2\2\2\22\u0174\3\2\2\2\24\u0179\3\2\2\2\26\u017f\3\2\2\2\30\u0183\3"+
		"\2\2\2\32\u0186\3\2\2\2\34\u018b\3\2\2\2\36\u018f\3\2\2\2 \u019e\3\2\2"+
		"\2\"\u01a5\3\2\2\2$\u01af\3\2\2\2&\u01c4\3\2\2\2(\u01ed\3\2\2\2*\u0209"+
		"\3\2\2\2,\u0219\3\2\2\2.\u0228\3\2\2\2\60\u022f\3\2\2\2\62\u0250\3\2\2"+
		"\2\64\u0254\3\2\2\2\66\u0259\3\2\2\28\u025b\3\2\2\2:\u025d\3\2\2\2<\u0267"+
		"\3\2\2\2>\u026f\3\2\2\2@\u0271\3\2\2\2B\u0273\3\2\2\2D\u0287\3\2\2\2F"+
		"\u028b\3\2\2\2H\u028d\3\2\2\2J\u0295\3\2\2\2L\u02a2\3\2\2\2N\u02a7\3\2"+
		"\2\2P\u02ab\3\2\2\2R\u02af\3\2\2\2T\u02b1\3\2\2\2V\u02c9\3\2\2\2X\u02cb"+
		"\3\2\2\2Z\u02ce\3\2\2\2\\\u02d8\3\2\2\2^\u02e0\3\2\2\2`\u02eb\3\2\2\2"+
		"b\u02ee\3\2\2\2d\u02fd\3\2\2\2f\u02ff\3\2\2\2h\u030c\3\2\2\2j\u0313\3"+
		"\2\2\2l\u0316\3\2\2\2n\u0319\3\2\2\2p\u0327\3\2\2\2r\u0329\3\2\2\2t\u033b"+
		"\3\2\2\2v\u033d\3\2\2\2x\u0344\3\2\2\2z\u034a\3\2\2\2|\u0350\3\2\2\2~"+
		"\u0354\3\2\2\2\u0080\u0358\3\2\2\2\u0082\u035a\3\2\2\2\u0084\u036a\3\2"+
		"\2\2\u0086\u036d\3\2\2\2\u0088\u036f\3\2\2\2\u008a\u0380\3\2\2\2\u008c"+
		"\u0383\3\2\2\2\u008e\u038e\3\2\2\2\u0090\u0390\3\2\2\2\u0092\u0392\3\2"+
		"\2\2\u0094\u039a\3\2\2\2\u0096\u03a2\3\2\2\2\u0098\u03a7\3\2\2\2\u009a"+
		"\u03a9\3\2\2\2\u009c\u03b9\3\2\2\2\u009e\u03c8\3\2\2\2\u00a0\u03ca\3\2"+
		"\2\2\u00a2\u03d1\3\2\2\2\u00a4\u03e9\3\2\2\2\u00a6\u03eb\3\2\2\2\u00a8"+
		"\u03f7\3\2\2\2\u00aa\u03fb\3\2\2\2\u00ac\u0407\3\2\2\2\u00ae\u0409\3\2"+
		"\2\2\u00b0\u0417\3\2\2\2\u00b2\u0438\3\2\2\2\u00b4\u043a\3\2\2\2\u00b6"+
		"\u043e\3\2\2\2\u00b8\u0442\3\2\2\2\u00ba\u0455\3\2\2\2\u00bc\u047d\3\2"+
		"\2\2\u00be\u047f\3\2\2\2\u00c0\u048a\3\2\2\2\u00c2\u0492\3\2\2\2\u00c4"+
		"\u0496\3\2\2\2\u00c6\u049e\3\2\2\2\u00c8\u04a9\3\2\2\2\u00ca\u04ae\3\2"+
		"\2\2\u00cc\u04ba\3\2\2\2\u00ce\u04be\3\2\2\2\u00d0\u04c0\3\2\2\2\u00d2"+
		"\u04c9\3\2\2\2\u00d4\u04d5\3\2\2\2\u00d6\u04d7\3\2\2\2\u00d8\u04d9\3\2"+
		"\2\2\u00da\u04dd\3\2\2\2\u00dc\u04df\3\2\2\2\u00de\u04e3\3\2\2\2\u00e0"+
		"\u04ee\3\2\2\2\u00e2\u04f4\3\2\2\2\u00e4\u04f6\3\2\2\2\u00e6\u04f8\3\2"+
		"\2\2\u00e8\u050d\3\2\2\2\u00ea\u058a\3\2\2\2\u00ec\u058c\3\2\2\2\u00ee"+
		"\u0598\3\2\2\2\u00f0\u05a1\3\2\2\2\u00f2\u05d4\3\2\2\2\u00f4\u05da\3\2"+
		"\2\2\u00f6\u05de\3\2\2\2\u00f8\u05e1\3\2\2\2\u00fa\u05ea\3\2\2\2\u00fc"+
		"\u0606\3\2\2\2\u00fe\u0608\3\2\2\2\u0100\u0611\3\2\2\2\u0102\u061b\3\2"+
		"\2\2\u0104\u062d\3\2\2\2\u0106\u0631\3\2\2\2\u0108\u0633\3\2\2\2\u010a"+
		"\u064d\3\2\2\2\u010c\u0655\3\2\2\2\u010e\u0657\3\2\2\2\u0110\u065f\3\2"+
		"\2\2\u0112\u0668\3\2\2\2\u0114\u066a\3\2\2\2\u0116\u0673\3\2\2\2\u0118"+
		"\u067d\3\2\2\2\u011a\u0689\3\2\2\2\u011c\u068e\3\2\2\2\u011e\u0690\3\2"+
		"\2\2\u0120\u0692\3\2\2\2\u0122\u069c\3\2\2\2\u0124\u069e\3\2\2\2\u0126"+
		"\u06a0\3\2\2\2\u0128\u06a3\3\2\2\2\u012a\u06aa\3\2\2\2\u012c\u06ae\3\2"+
		"\2\2\u012e\u06d6\3\2\2\2\u0130\u06d8\3\2\2\2\u0132\u06e0\3\2\2\2\u0134"+
		"\u06e2\3\2\2\2\u0136\u06e4\3\2\2\2\u0138\u06e6\3\2\2\2\u013a\u013c\5\u012a"+
		"\u0096\2\u013b\u013d\5\6\4\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u0140\5\u012c\u0097\2\u013f\u013e\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0143\5\4\3\2\u0142\u0141\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\2\2\3\u0145\3\3\2\2\2"+
		"\u0146\u014c\5\u00bc_\2\u0147\u0148\5\u012c\u0097\2\u0148\u0149\5\u00bc"+
		"_\2\u0149\u014b\3\2\2\2\u014a\u0147\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014f\u0151\5\u012c\u0097\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2"+
		"\2\u0151\5\3\2\2\2\u0152\u0153\5\u008aF\2\u0153\u0154\7(\2\2\u0154\u0155"+
		"\5f\64\2\u0155\7\3\2\2\2\u0156\u0157\5\u008aF\2\u0157\u0159\7#\2\2\u0158"+
		"\u015a\7-\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u0160\5f\64\2\u015c\u015d\7X\2\2\u015d\u0161\7j\2\2\u015e\u015f"+
		"\7\t\2\2\u015f\u0161\5\u0122\u0092\2\u0160\u015c\3\2\2\2\u0160\u015e\3"+
		"\2\2\2\u0160\u0161\3\2\2\2\u0161\t\3\2\2\2\u0162\u0163\5\22\n\2\u0163"+
		"\u0164\5&\24\2\u0164\13\3\2\2\2\u0165\u0168\5\26\f\2\u0166\u0168\t\2\2"+
		"\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\r\3\2\2\2\u0169\u016b"+
		"\5\20\t\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\17\3\2\2\2\u016c"+
		"\u016d\5\f\7\2\u016d\u016e\5\u012a\u0096\2\u016e\u0170\3\2\2\2\u016f\u016c"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\21\3\2\2\2\u0173\u0175\5\24\13\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\23\3\2\2\2\u0176\u0177\5\26\f\2\u0177\u0178\5\u012a\u0096\2"+
		"\u0178\u017a\3\2\2\2\u0179\u0176\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\25\3\2\2\2\u017d\u0180\5\u008cG\2\u017e"+
		"\u0180\t\3\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\27\3\2\2"+
		"\2\u0181\u0184\5\u008cG\2\u0182\u0184\t\4\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0182\3\2\2\2\u0184\31\3\2\2\2\u0185\u0187\5\34\17\2\u0186\u0185\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\33\3\2\2\2\u0188\u0189\5\30\r\2\u0189\u018a"+
		"\5\u012a\u0096\2\u018a\u018c\3\2\2\2\u018b\u0188\3\2\2\2\u018c\u018d\3"+
		"\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\35\3\2\2\2\u018f"+
		"\u0190\7[\2\2\u0190\u0191\5\u012a\u0096\2\u0191\u0198\5 \21\2\u0192\u0193"+
		"\7W\2\2\u0193\u0194\5\u012a\u0096\2\u0194\u0195\5 \21\2\u0195\u0197\3"+
		"\2\2\2\u0196\u0192\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\5\u012a"+
		"\u0096\2\u019c\u019d\7Z\2\2\u019d\37\3\2\2\2\u019e\u01a3\5\u0120\u0091"+
		"\2\u019f\u01a0\7\34\2\2\u01a0\u01a1\5\u012a\u0096\2\u01a1\u01a2\5\"\22"+
		"\2\u01a2\u01a4\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4!"+
		"\3\2\2\2\u01a5\u01ac\5J&\2\u01a6\u01a7\7l\2\2\u01a7\u01a8\5\u012a\u0096"+
		"\2\u01a8\u01a9\5J&\2\u01a9\u01ab\3\2\2\2\u01aa\u01a6\3\2\2\2\u01ab\u01ae"+
		"\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad#\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01b6\5J&\2\u01b0\u01b1\7W\2\2\u01b1\u01b2\5\u012a"+
		"\u0096\2\u01b2\u01b3\5J&\2\u01b3\u01b5\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b5"+
		"\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7%\3\2\2\2"+
		"\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7\25\2\2\u01ba\u01c5\b\24\1\2\u01bb\u01bc"+
		"\7%\2\2\u01bc\u01c5\b\24\1\2\u01bd\u01be\7\33\2\2\u01be\u01c5\b\24\1\2"+
		"\u01bf\u01c0\7~\2\2\u01c0\u01c1\7%\2\2\u01c1\u01c5\b\24\1\2\u01c2\u01c3"+
		"\7\f\2\2\u01c3\u01c5\b\24\1\2\u01c4\u01b9\3\2\2\2\u01c4\u01bb\3\2\2\2"+
		"\u01c4\u01bd\3\2\2\2\u01c4\u01bf\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6"+
		"\3\2\2\2\u01c6\u01c7\5\u0122\u0092\2\u01c7\u01e8\5\u012a\u0096\2\u01c8"+
		"\u01ca\6\24\2\3\u01c9\u01cb\5\36\20\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01da\5\u012a\u0096\2\u01cd\u01d7\6"+
		"\24\3\3\u01ce\u01cf\7\34\2\2\u01cf\u01d3\5\u012a\u0096\2\u01d0\u01d1\6"+
		"\24\4\3\u01d1\u01d4\5$\23\2\u01d2\u01d4\5J&\2\u01d3\u01d0\3\2\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\5\u012a\u0096\2\u01d6\u01d8"+
		"\3\2\2\2\u01d7\u01ce\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9"+
		"\u01db\3\2\2\2\u01da\u01cd\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01e5\3\2"+
		"\2\2\u01dc\u01e2\6\24\5\3\u01dd\u01de\7\"\2\2\u01de\u01df\5\u012a\u0096"+
		"\2\u01df\u01e0\5$\23\2\u01e0\u01e1\5\u012a\u0096\2\u01e1\u01e3\3\2\2\2"+
		"\u01e2\u01dd\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e6"+
		"\3\2\2\2\u01e5\u01dc\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7"+
		"\u01e9\3\2\2\2\u01e8\u01c8\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01eb\3\2"+
		"\2\2\u01ea\u01ec\5(\25\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\'\3\2\2\2\u01ed\u01ee\7R\2\2\u01ee\u01f7\5\u012a\u0096\2\u01ef\u01f1"+
		"\6\25\6\3\u01f0\u01f2\5*\26\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2"+
		"\u01f2\u01f4\3\2\2\2\u01f3\u01f5\5\u012c\u0097\2\u01f4\u01f3\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01ef\3\2"+
		"\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01fb\5.\30\2\u01fa"+
		"\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0201\3\2\2\2\u01fc\u01fd\5\u012c"+
		"\u0097\2\u01fd\u01fe\5.\30\2\u01fe\u0200\3\2\2\2\u01ff\u01fc\3\2\2\2\u0200"+
		"\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0205\3\2"+
		"\2\2\u0203\u0201\3\2\2\2\u0204\u0206\5\u012c\u0097\2\u0205\u0204\3\2\2"+
		"\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\7S\2\2\u0208)\3"+
		"\2\2\2\u0209\u0211\5,\27\2\u020a\u020b\5\u012a\u0096\2\u020b\u020c\7W"+
		"\2\2\u020c\u020d\5\u012a\u0096\2\u020d\u020e\5,\27\2\u020e\u0210\3\2\2"+
		"\2\u020f\u020a\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0217\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\5\u012a\u0096"+
		"\2\u0215\u0216\7W\2\2\u0216\u0218\3\2\2\2\u0217\u0214\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218+\3\2\2\2\u0219\u021a\5\u008aF\2\u021a\u021c\5\u0122\u0092"+
		"\2\u021b\u021d\5\u0114\u008b\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2"+
		"\u021d\u021f\3\2\2\2\u021e\u0220\5\u010c\u0087\2\u021f\u021e\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220-\3\2\2\2\u0221\u0229\7V\2\2\u0222\u0223\7-\2\2\u0223"+
		"\u0225\5\u012a\u0096\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226"+
		"\3\2\2\2\u0226\u0229\5\u009cO\2\u0227\u0229\5\60\31\2\u0228\u0221\3\2"+
		"\2\2\u0228\u0224\3\2\2\2\u0228\u0227\3\2\2\2\u0229/\3\2\2\2\u022a\u0230"+
		"\5\62\32\2\u022b\u0230\58\35\2\u022c\u022d\5\16\b\2\u022d\u022e\5&\24"+
		"\2\u022e\u0230\3\2\2\2\u022f\u022a\3\2\2\2\u022f\u022b\3\2\2\2\u022f\u022c"+
		"\3\2\2\2\u0230\61\3\2\2\2\u0231\u0232\6\32\7\3\u0232\u0233\5\66\34\2\u0233"+
		"\u0234\5\64\33\2\u0234\u0235\7P\2\2\u0235\u023a\5\u0128\u0095\2\u0236"+
		"\u0237\7\30\2\2\u0237\u0238\5\u012a\u0096\2\u0238\u0239\5\u0098M\2\u0239"+
		"\u023b\3\2\2\2\u023a\u0236\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0251\3\2"+
		"\2\2\u023c\u023e\5\16\b\2\u023d\u023f\5\36\20\2\u023e\u023d\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u0242\5\66\34\2\u0241\u0240\3"+
		"\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\5\64\33\2\u0244"+
		"\u024a\5\\/\2\u0245\u0246\5\u012a\u0096\2\u0246\u0247\7\64\2\2\u0247\u0248"+
		"\5\u012a\u0096\2\u0248\u0249\5Z.\2\u0249\u024b\3\2\2\2\u024a\u0245\3\2"+
		"\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\5\u012a\u0096"+
		"\2\u024d\u024f\5d\63\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251"+
		"\3\2\2\2\u0250\u0231\3\2\2\2\u0250\u023c\3\2\2\2\u0251\63\3\2\2\2\u0252"+
		"\u0255\5\u0122\u0092\2\u0253\u0255\5\u011e\u0090\2\u0254\u0252\3\2\2\2"+
		"\u0254\u0253\3\2\2\2\u0255\65\3\2\2\2\u0256\u025a\5H%\2\u0257\u0258\6"+
		"\34\b\3\u0258\u025a\7\67\2\2\u0259\u0256\3\2\2\2\u0259\u0257\3\2\2\2\u025a"+
		"\67\3\2\2\2\u025b\u025c\5\u00a4S\2\u025c9\3\2\2\2\u025d\u0264\5<\37\2"+
		"\u025e\u025f\7W\2\2\u025f\u0260\5\u012a\u0096\2\u0260\u0261\5<\37\2\u0261"+
		"\u0263\3\2\2\2\u0262\u025e\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265;\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u026d"+
		"\5> \2\u0268\u0269\5\u012a\u0096\2\u0269\u026a\7Y\2\2\u026a\u026b\5\u012a"+
		"\u0096\2\u026b\u026c\5@!\2\u026c\u026e\3\2\2\2\u026d\u0268\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e=\3\2\2\2\u026f\u0270\5\u0136\u009c\2\u0270?\3\2\2"+
		"\2\u0271\u0272\5\u00e2r\2\u0272A\3\2\2\2\u0273\u0274\5@!\2\u0274\u027c"+
		"\5\u012a\u0096\2\u0275\u0276\7W\2\2\u0276\u0277\5\u012a\u0096\2\u0277"+
		"\u0278\5@!\2\u0278\u0279\5\u012a\u0096\2\u0279\u027b\3\2\2\2\u027a\u0275"+
		"\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0281\5\u012a\u0096\2\u0280\u0282"+
		"\7W\2\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282C\3\2\2\2\u0283\u0284"+
		"\5\u008aF\2\u0284\u0285\7T\2\2\u0285\u0286\7U\2\2\u0286\u0288\3\2\2\2"+
		"\u0287\u0283\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a"+
		"\3\2\2\2\u028aE\3\2\2\2\u028b\u028c\5D#\2\u028cG\3\2\2\2\u028d\u0290\5"+
		"\u008aF\2\u028e\u0291\5R*\2\u028f\u0291\5P)\2\u0290\u028e\3\2\2\2\u0290"+
		"\u028f\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u0294\5F$\2\u0293\u0292\3\2\2"+
		"\2\u0293\u0294\3\2\2\2\u0294I\3\2\2\2\u0295\u029b\5\u008aF\2\u0296\u0299"+
		"\5R*\2\u0297\u0299\7\67\2\2\u0298\u0296\3\2\2\2\u0298\u0297\3\2\2\2\u0299"+
		"\u029c\3\2\2\2\u029a\u029c\5N(\2\u029b\u0298\3\2\2\2\u029b\u029a\3\2\2"+
		"\2\u029c\u029e\3\2\2\2\u029d\u029f\5F$\2\u029e\u029d\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029fK\3\2\2\2\u02a0\u02a3\5l\67\2\u02a1\u02a3\5n8\2\u02a2\u02a0"+
		"\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u02a6\5T+\2\u02a5"+
		"\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6M\3\2\2\2\u02a7\u02a9\5l\67\2"+
		"\u02a8\u02aa\5T+\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aaO\3\2"+
		"\2\2\u02ab\u02ad\5n8\2\u02ac\u02ae\5T+\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae"+
		"\3\2\2\2\u02aeQ\3\2\2\2\u02af\u02b0\7\17\2\2\u02b0S\3\2\2\2\u02b1\u02b2"+
		"\7[\2\2\u02b2\u02b3\5\u012a\u0096\2\u02b3\u02ba\5V,\2\u02b4\u02b5\7W\2"+
		"\2\u02b5\u02b6\5\u012a\u0096\2\u02b6\u02b7\5V,\2\u02b7\u02b9\3\2\2\2\u02b8"+
		"\u02b4\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\5\u012a\u0096"+
		"\2\u02be\u02bf\7Z\2\2\u02bfU\3\2\2\2\u02c0\u02ca\5J&\2\u02c1\u02c2\5\u008a"+
		"F\2\u02c2\u02c7\7^\2\2\u02c3\u02c4\t\5\2\2\u02c4\u02c5\5\u012a\u0096\2"+
		"\u02c5\u02c6\5J&\2\u02c6\u02c8\3\2\2\2\u02c7\u02c3\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c0\3\2\2\2\u02c9\u02c1\3\2\2\2\u02ca"+
		"W\3\2\2\2\u02cb\u02cc\5\u008aF\2\u02cc\u02cd\5l\67\2\u02cdY\3\2\2\2\u02ce"+
		"\u02d5\5X-\2\u02cf\u02d0\7W\2\2\u02d0\u02d1\5\u012a\u0096\2\u02d1\u02d2"+
		"\5X-\2\u02d2\u02d4\3\2\2\2\u02d3\u02cf\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5"+
		"\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6[\3\2\2\2\u02d7\u02d5\3\2\2\2"+
		"\u02d8\u02da\7P\2\2\u02d9\u02db\5^\60\2\u02da\u02d9\3\2\2\2\u02da\u02db"+
		"\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\5\u0128\u0095\2\u02dd]\3\2\2"+
		"\2\u02de\u02e1\5b\62\2\u02df\u02e1\5`\61\2\u02e0\u02de\3\2\2\2\u02e0\u02df"+
		"\3\2\2\2\u02e1\u02e8\3\2\2\2\u02e2\u02e3\7W\2\2\u02e3\u02e4\5\u012a\u0096"+
		"\2\u02e4\u02e5\5b\62\2\u02e5\u02e7\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e7\u02ea"+
		"\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9_\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02eb\u02ec\5J&\2\u02ec\u02ed\7\62\2\2\u02eda\3\2\2\2\u02ee"+
		"\u02f0\5\32\16\2\u02ef\u02f1\5J&\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2"+
		"\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f4\7\177\2\2\u02f3\u02f2\3\2\2\2\u02f3"+
		"\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02fb\5> \2\u02f6\u02f7\5\u012a"+
		"\u0096\2\u02f7\u02f8\7Y\2\2\u02f8\u02f9\5\u012a\u0096\2\u02f9\u02fa\5"+
		"\u00e8u\2\u02fa\u02fc\3\2\2\2\u02fb\u02f6\3\2\2\2\u02fb\u02fc\3\2\2\2"+
		"\u02fcc\3\2\2\2\u02fd\u02fe\5\u009cO\2\u02fee\3\2\2\2\u02ff\u0304\5h\65"+
		"\2\u0300\u0301\7X\2\2\u0301\u0303\5h\65\2\u0302\u0300\3\2\2\2\u0303\u0306"+
		"\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305g\3\2\2\2\u0306"+
		"\u0304\3\2\2\2\u0307\u030d\5\u0122\u0092\2\u0308\u030d\7\n\2\2\u0309\u030d"+
		"\7\13\2\2\u030a\u030d\7\t\2\2\u030b\u030d\7\f\2\2\u030c\u0307\3\2\2\2"+
		"\u030c\u0308\3\2\2\2\u030c\u0309\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030b"+
		"\3\2\2\2\u030di\3\2\2\2\u030e\u030f\5h\65\2\u030f\u0310\7X\2\2\u0310\u0312"+
		"\3\2\2\2\u0311\u030e\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314k\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0317\5j\66\2"+
		"\u0317\u0318\5\u0132\u009a\2\u0318m\3\2\2\2\u0319\u031a\5j\66\2\u031a"+
		"\u031f\5\u0120\u0091\2\u031b\u031c\7X\2\2\u031c\u031e\5\u0120\u0091\2"+
		"\u031d\u031b\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320"+
		"\3\2\2\2\u0320o\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0328\7:\2\2\u0323\u0328"+
		"\7;\2\2\u0324\u0328\5\u011e\u0090\2\u0325\u0328\7<\2\2\u0326\u0328\7="+
		"\2\2\u0327\u0322\3\2\2\2\u0327\u0323\3\2\2\2\u0327\u0324\3\2\2\2\u0327"+
		"\u0325\3\2\2\2\u0327\u0326\3\2\2\2\u0328q\3\2\2\2\u0329\u032a\7\4\2\2"+
		"\u032a\u032f\5t;\2\u032b\u032c\7\6\2\2\u032c\u032e\5t;\2\u032d\u032b\3"+
		"\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u0332\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0333\7\5\2\2\u0333s\3\2\2\2"+
		"\u0334\u033c\5v<\2\u0335\u0337\7R\2\2\u0336\u0338\5\u00e4s\2\u0337\u0336"+
		"\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033c\7S\2\2\u033a"+
		"\u033c\5\u0082B\2\u033b\u0334\3\2\2\2\u033b\u0335\3\2\2\2\u033b\u033a"+
		"\3\2\2\2\u033cu\3\2\2\2\u033d\u0341\5\u0122\u0092\2\u033e\u0340\7\7\2"+
		"\2\u033f\u033e\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342"+
		"\3\2\2\2\u0342w\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0345\5|?\2\u0345\u0346"+
		"\5\u012a\u0096\2\u0346\u0347\7M\2\2\u0347\u0348\5\u012a\u0096\2\u0348"+
		"\u0349\5\u0080A\2\u0349y\3\2\2\2\u034a\u034b\5~@\2\u034b\u034c\5\u012a"+
		"\u0096\2\u034c\u034d\7M\2\2\u034d\u034e\5\u012a\u0096\2\u034e\u034f\5"+
		"\u0080A\2\u034f{\3\2\2\2\u0350\u0351\5\\/\2\u0351}\3\2\2\2\u0352\u0355"+
		"\5\\/\2\u0353\u0355\5> \2\u0354\u0352\3\2\2\2\u0354\u0353\3\2\2\2\u0355"+
		"\177\3\2\2\2\u0356\u0359\5\u009cO\2\u0357\u0359\5\u00e4s\2\u0358\u0356"+
		"\3\2\2\2\u0358\u0357\3\2\2\2\u0359\u0081\3\2\2\2\u035a\u035b\7R\2\2\u035b"+
		"\u0363\5\u012a\u0096\2\u035c\u035e\5^\60\2\u035d\u035c\3\2\2\2\u035d\u035e"+
		"\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\5\u012a\u0096\2\u0360\u0361\7"+
		"M\2\2\u0361\u0362\5\u012a\u0096\2\u0362\u0364\3\2\2\2\u0363\u035d\3\2"+
		"\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\5\u0086D\2\u0366"+
		"\u0367\7S\2\2\u0367\u0083\3\2\2\2\u0368\u036b\5\u0082B\2\u0369\u036b\5"+
		"x=\2\u036a\u0368\3\2\2\2\u036a\u0369\3\2\2\2\u036b\u0085\3\2\2\2\u036c"+
		"\u036e\5\u0088E\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0087"+
		"\3\2\2\2\u036f\u0375\5\u009eP\2\u0370\u0371\5\u012c\u0097\2\u0371\u0372"+
		"\5\u009eP\2\u0372\u0374\3\2\2\2\u0373\u0370\3\2\2\2\u0374\u0377\3\2\2"+
		"\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375"+
		"\3\2\2\2\u0378\u037a\5\u012c\u0097\2\u0379\u0378\3\2\2\2\u0379\u037a\3"+
		"\2\2\2\u037a\u0089\3\2\2\2\u037b\u037c\5\u008cG\2\u037c\u037d\5\u012a"+
		"\u0096\2\u037d\u037f\3\2\2\2\u037e\u037b\3\2\2\2\u037f\u0382\3\2\2\2\u0380"+
		"\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u008b\3\2\2\2\u0382\u0380\3\2"+
		"\2\2\u0383\u0384\7~\2\2\u0384\u038a\5\u0090I\2\u0385\u0387\7P\2\2\u0386"+
		"\u0388\5\u008eH\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389"+
		"\3\2\2\2\u0389\u038b\5\u0128\u0095\2\u038a\u0385\3\2\2\2\u038a\u038b\3"+
		"\2\2\2\u038b\u008d\3\2\2\2\u038c\u038f\5\u0092J\2\u038d\u038f\5\u0098"+
		"M\2\u038e\u038c\3\2\2\2\u038e\u038d\3\2\2\2\u038f\u008f\3\2\2\2\u0390"+
		"\u0391\5l\67\2\u0391\u0091\3\2\2\2\u0392\u0397\5\u0094K\2\u0393\u0394"+
		"\7W\2\2\u0394\u0396\5\u0094K\2\u0395\u0393\3\2\2\2\u0396\u0399\3\2\2\2"+
		"\u0397\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0093\3\2\2\2\u0399\u0397"+
		"\3\2\2\2\u039a\u039b\5\u0096L\2\u039b\u039c\5\u012a\u0096\2\u039c\u039d"+
		"\7Y\2\2\u039d\u039e\5\u012a\u0096\2\u039e\u039f\5\u0098M\2\u039f\u0095"+
		"\3\2\2\2\u03a0\u03a3\5\u0122\u0092\2\u03a1\u03a3\5\u0126\u0094\2\u03a2"+
		"\u03a0\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3\u0097\3\2\2\2\u03a4\u03a8\5\u009a"+
		"N\2\u03a5\u03a8\5\u008cG\2\u03a6\u03a8\5\u00e8u\2\u03a7\u03a4\3\2\2\2"+
		"\u03a7\u03a5\3\2\2\2\u03a7\u03a6\3\2\2\2\u03a8\u0099\3\2\2\2\u03a9\u03b2"+
		"\7T\2\2\u03aa\u03af\5\u0098M\2\u03ab\u03ac\7W\2\2\u03ac\u03ae\5\u0098"+
		"M\2\u03ad\u03ab\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03aa\3\2"+
		"\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03b6\7W\2\2\u03b5"+
		"\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\7U"+
		"\2\2\u03b8\u009b\3\2\2\2\u03b9\u03c1\7R\2\2\u03ba\u03c2\5\u012a\u0096"+
		"\2\u03bb\u03bd\5\u012c\u0097\2\u03bc\u03bb\3\2\2\2\u03bd\u03c0\3\2\2\2"+
		"\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be"+
		"\3\2\2\2\u03c1\u03ba\3\2\2\2\u03c1\u03be\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u03c4\5\u0086D\2\u03c4\u03c5\7S\2\2\u03c5\u009d\3\2\2\2\u03c6\u03c9\5"+
		"\u00a0Q\2\u03c7\u03c9\5\u00bc_\2\u03c8\u03c6\3\2\2\2\u03c8\u03c7\3\2\2"+
		"\2\u03c9\u009f\3\2\2\2\u03ca\u03cb\6Q\t\2\u03cb\u03cc\5\u00a4S\2\u03cc"+
		"\u00a1\3\2\2\2\u03cd\u03ce\6R\n\3\u03ce\u03d2\5\34\17\2\u03cf\u03d0\6"+
		"R\13\3\u03d0\u03d2\5\20\t\2\u03d1\u03cd\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2"+
		"\u00a3\3\2\2\2\u03d3\u03e0\5\u00a2R\2\u03d4\u03d6\5J&\2\u03d5\u03d4\3"+
		"\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d9\5:\36\2\u03d8"+
		"\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03e1\3\2\2\2\u03da\u03db\5\u00a6"+
		"T\2\u03db\u03dc\5\u012a\u0096\2\u03dc\u03dd\7Y\2\2\u03dd\u03de\5\u012a"+
		"\u0096\2\u03de\u03df\5@!\2\u03df\u03e1\3\2\2\2\u03e0\u03d5\3\2\2\2\u03e0"+
		"\u03da\3\2\2\2\u03e1\u03ea\3\2\2\2\u03e2\u03e4\5\u00a2R\2\u03e3\u03e2"+
		"\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\5J&\2\u03e6"+
		"\u03e8\5:\36\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3\2"+
		"\2\2\u03e9\u03d3\3\2\2\2\u03e9\u03e3\3\2\2\2\u03ea\u00a5\3\2\2\2\u03eb"+
		"\u03ec\7P\2\2\u03ec\u03f1\5\u00a8U\2\u03ed\u03ee\7W\2\2\u03ee\u03f0\5"+
		"\u00a8U\2\u03ef\u03ed\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2"+
		"\u03f1\u03f2\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f5"+
		"\5\u0128\u0095\2\u03f5\u00a7\3\2\2\2\u03f6\u03f8\5J&\2\u03f7\u03f6\3\2"+
		"\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\5> \2\u03fa\u00a9"+
		"\3\2\2\2\u03fb\u03fc\7P\2\2\u03fc\u03ff\5> \2\u03fd\u03fe\7W\2\2\u03fe"+
		"\u0400\5> \2\u03ff\u03fd\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u03ff\3\2\2"+
		"\2\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\5\u0128\u0095\2"+
		"\u0404\u00ab\3\2\2\2\u0405\u0408\5\u00aeX\2\u0406\u0408\5\u00b0Y\2\u0407"+
		"\u0405\3\2\2\2\u0407\u0406\3\2\2\2\u0408\u00ad\3\2\2\2\u0409\u040a\7 "+
		"\2\2\u040a\u040b\5\u00dco\2\u040b\u040c\5\u012a\u0096\2\u040c\u0415\5"+
		"\u00bc_\2\u040d\u0410\5\u012a\u0096\2\u040e\u0410\5\u012c\u0097\2\u040f"+
		"\u040d\3\2\2\2\u040f\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\7\32"+
		"\2\2\u0412\u0413\5\u012a\u0096\2\u0413\u0414\5\u00bc_\2\u0414\u0416\3"+
		"\2\2\2\u0415\u040f\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u00af\3\2\2\2\u0417"+
		"\u0418\7\60\2\2\u0418\u0419\5\u00dco\2\u0419\u041a\5\u012a\u0096\2\u041a"+
		"\u041b\7R\2\2\u041b\u041f\5\u012a\u0096\2\u041c\u041e\5\u00caf\2\u041d"+
		"\u041c\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2"+
		"\2\2\u0420\u0422\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0423\5\u012a\u0096"+
		"\2\u0423\u0424\7S\2\2\u0424\u00b1\3\2\2\2\u0425\u0426\7\37\2\2\u0426\u0427"+
		"\7P\2\2\u0427\u0428\5\u00ceh\2\u0428\u0429\5\u0128\u0095\2\u0429\u042a"+
		"\5\u012a\u0096\2\u042a\u042b\5\u00bc_\2\u042b\u0439\3\2\2\2\u042c\u042d"+
		"\79\2\2\u042d\u042e\5\u00dco\2\u042e\u042f\5\u012a\u0096\2\u042f\u0430"+
		"\5\u00bc_\2\u0430\u0439\3\2\2\2\u0431\u0432\7\31\2\2\u0432\u0433\5\u012a"+
		"\u0096\2\u0433\u0434\5\u00bc_\2\u0434\u0435\5\u012a\u0096\2\u0435\u0436"+
		"\79\2\2\u0436\u0437\5\u00dco\2\u0437\u0439\3\2\2\2\u0438\u0425\3\2\2\2"+
		"\u0438\u042c\3\2\2\2\u0438\u0431\3\2\2\2\u0439\u00b3\3\2\2\2\u043a\u043c"+
		"\7\27\2\2\u043b\u043d\5\u0122\u0092\2\u043c\u043b\3\2\2\2\u043c\u043d"+
		"\3\2\2\2\u043d\u00b5\3\2\2\2\u043e\u0440\7\22\2\2\u043f\u0441\5\u0122"+
		"\u0092\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u00b7\3\2\2\2\u0442"+
		"\u0444\7\66\2\2\u0443\u0445\5\u00c4c\2\u0444\u0443\3\2\2\2\u0444\u0445"+
		"\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\5\u012a\u0096\2\u0447\u044d\5"+
		"\u009cO\2\u0448\u0449\5\u012a\u0096\2\u0449\u044a\5\u00be`\2\u044a\u044c"+
		"\3\2\2\2\u044b\u0448\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2\2\u044d"+
		"\u044e\3\2\2\2\u044e\u0453\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u0451\5\u012a"+
		"\u0096\2\u0451\u0452\5\u00c2b\2\u0452\u0454\3\2\2\2\u0453\u0450\3\2\2"+
		"\2\u0453\u0454\3\2\2\2\u0454\u00b9\3\2\2\2\u0455\u0456\7\21\2\2\u0456"+
		"\u045c\5\u00e8u\2\u0457\u0458\5\u012a\u0096\2\u0458\u0459\t\6\2\2\u0459"+
		"\u045a\5\u012a\u0096\2\u045a\u045b\5\u00e8u\2\u045b\u045d\3\2\2\2\u045c"+
		"\u0457\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u00bb\3\2\2\2\u045e\u047e\5\u009c"+
		"O\2\u045f\u047e\5\u00acW\2\u0460\u047e\5\u00b2Z\2\u0461\u047e\5\u00b8"+
		"]\2\u0462\u0463\7\61\2\2\u0463\u0464\5\u00dco\2\u0464\u0465\5\u012a\u0096"+
		"\2\u0465\u0466\5\u009cO\2\u0466\u047e\3\2\2\2\u0467\u0469\7,\2\2\u0468"+
		"\u046a\5\u00e8u\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u047e"+
		"\3\2\2\2\u046b\u046c\7\63\2\2\u046c\u047e\5\u00e8u\2\u046d\u047e\5\u00b6"+
		"\\\2\u046e\u047e\5\u00b4[\2\u046f\u0470\5\u0122\u0092\2\u0470\u0471\7"+
		"_\2\2\u0471\u0472\5\u012a\u0096\2\u0472\u0473\5\u00bc_\2\u0473\u047e\3"+
		"\2\2\2\u0474\u047e\5\b\5\2\u0475\u047e\5\u00ba^\2\u0476\u047e\5\n\6\2"+
		"\u0477\u047e\5\u00a0Q\2\u0478\u0479\6_\f\2\u0479\u047e\5\62\32\2\u047a"+
		"\u047e\5\u00e4s\2\u047b\u047e\7V\2\2\u047c\u047e\5\u012e\u0098\2\u047d"+
		"\u045e\3\2\2\2\u047d\u045f\3\2\2\2\u047d\u0460\3\2\2\2\u047d\u0461\3\2"+
		"\2\2\u047d\u0462\3\2\2\2\u047d\u0467\3\2\2\2\u047d\u046b\3\2\2\2\u047d"+
		"\u046d\3\2\2\2\u047d\u046e\3\2\2\2\u047d\u046f\3\2\2\2\u047d\u0474\3\2"+
		"\2\2\u047d\u0475\3\2\2\2\u047d\u0476\3\2\2\2\u047d\u0477\3\2\2\2\u047d"+
		"\u0478\3\2\2\2\u047d\u047a\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047c\3\2"+
		"\2\2\u047e\u00bd\3\2\2\2\u047f\u0480\7\24\2\2\u0480\u0481\7P\2\2\u0481"+
		"\u0483\5\32\16\2\u0482\u0484\5\u00c0a\2\u0483\u0482\3\2\2\2\u0483\u0484"+
		"\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\5\u0122\u0092\2\u0486\u0487\5"+
		"\u0128\u0095\2\u0487\u0488\5\u012a\u0096\2\u0488\u0489\5\u009cO\2\u0489"+
		"\u00bf\3\2\2\2\u048a\u048f\5l\67\2\u048b\u048c\7m\2\2\u048c\u048e\5l\67"+
		"\2\u048d\u048b\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u048f\u0490"+
		"\3\2\2\2\u0490\u00c1\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u0493\7\36\2\2"+
		"\u0493\u0494\5\u012a\u0096\2\u0494\u0495\5\u009cO\2\u0495\u00c3\3\2\2"+
		"\2\u0496\u0497\7P\2\2\u0497\u0498\5\u012a\u0096\2\u0498\u049a\5\u00c6"+
		"d\2\u0499\u049b\5\u012c\u0097\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2"+
		"\2\u049b\u049c\3\2\2\2\u049c\u049d\5\u0128\u0095\2\u049d\u00c5\3\2\2\2"+
		"\u049e\u04a4\5\u00c8e\2\u049f\u04a0\5\u012c\u0097\2\u04a0\u04a1\5\u00c8"+
		"e\2\u04a1\u04a3\3\2\2\2\u04a2\u049f\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4"+
		"\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u00c7\3\2\2\2\u04a6\u04a4\3\2"+
		"\2\2\u04a7\u04aa\5\u00a0Q\2\u04a8\u04aa\5\u00e8u\2\u04a9\u04a7\3\2\2\2"+
		"\u04a9\u04a8\3\2\2\2\u04aa\u00c9\3\2\2\2\u04ab\u04ac\5\u00ccg\2\u04ac"+
		"\u04ad\5\u012a\u0096\2\u04ad\u04af\3\2\2\2\u04ae\u04ab\3\2\2\2\u04af\u04b0"+
		"\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2"+
		"\u04b3\5\u0088E\2\u04b3\u00cb\3\2\2\2\u04b4\u04b5\7\23\2\2\u04b5\u04b6"+
		"\5\u00e8u\2\u04b6\u04b7\7_\2\2\u04b7\u04bb\3\2\2\2\u04b8\u04b9\7\30\2"+
		"\2\u04b9\u04bb\7_\2\2\u04ba\u04b4\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\u00cd"+
		"\3\2\2\2\u04bc\u04bf\5\u00d0i\2\u04bd\u04bf\5\u00d2j\2\u04be\u04bc\3\2"+
		"\2\2\u04be\u04bd\3\2\2\2\u04bf\u00cf\3\2\2\2\u04c0\u04c2\5\32\16\2\u04c1"+
		"\u04c3\5J&\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2"+
		"\2\u04c4\u04c5\5> \2\u04c5\u04c6\t\7\2\2\u04c6\u04c7\5\u00e8u\2\u04c7"+
		"\u00d1\3\2\2\2\u04c8\u04ca\5\u00d4k\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca"+
		"\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cd\7V\2\2\u04cc\u04ce\5\u00e8u\2"+
		"\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1"+
		"\7V\2\2\u04d0\u04d2\5\u00d6l\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2"+
		"\u04d2\u00d3\3\2\2\2\u04d3\u04d6\5\u00a0Q\2\u04d4\u04d6\5\u00dep\2\u04d5"+
		"\u04d3\3\2\2\2\u04d5\u04d4\3\2\2\2\u04d6\u00d5\3\2\2\2\u04d7\u04d8\5\u00de"+
		"p\2\u04d8\u00d7\3\2\2\2\u04d9\u04da\7P\2\2\u04da\u04db\5J&\2\u04db\u04dc"+
		"\5\u0128\u0095\2\u04dc\u00d9\3\2\2\2\u04dd\u04de\5\u00dco\2\u04de\u00db"+
		"\3\2\2\2\u04df\u04e0\7P\2\2\u04e0\u04e1\5\u00e2r\2\u04e1\u04e2\5\u0128"+
		"\u0095\2\u04e2\u00dd\3\2\2\2\u04e3\u04e8\5\u00e0q\2\u04e4\u04e5\7W\2\2"+
		"\u04e5\u04e7\5\u00e0q\2\u04e6\u04e4\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8"+
		"\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u00df\3\2\2\2\u04ea\u04e8\3\2"+
		"\2\2\u04eb\u04ec\7j\2\2\u04ec\u04ef\bq\1\2\u04ed\u04ef\3\2\2\2\u04ee\u04eb"+
		"\3\2\2\2\u04ee\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\5\u00e8u"+
		"\2\u04f1\u00e1\3\2\2\2\u04f2\u04f5\5\u00e4s\2\u04f3\u04f5\5z>\2\u04f4"+
		"\u04f2\3\2\2\2\u04f4\u04f3\3\2\2\2\u04f5\u00e3\3\2\2\2\u04f6\u04f7\5\u00ec"+
		"w\2\u04f7\u00e5\3\2\2\2\u04f8\u04fa\5\u00f0y\2\u04f9\u04fb\t\b\2\2\u04fa"+
		"\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u00e7\3\2\2\2\u04fc\u04fd\bu"+
		"\1\2\u04fd\u04fe\5\u00d8m\2\u04fe\u04ff\5\u00eav\2\u04ff\u050e\3\2\2\2"+
		"\u0500\u050e\5\u00e6t\2\u0501\u0502\t\t\2\2\u0502\u0503\5\u012a\u0096"+
		"\2\u0503\u0504\5\u00e8u\24\u0504\u050e\3\2\2\2\u0505\u0506\t\n\2\2\u0506"+
		"\u050e\5\u00e8u\22\u0507\u0508\5\u00aaV\2\u0508\u0509\5\u012a\u0096\2"+
		"\u0509\u050a\7Y\2\2\u050a\u050b\5\u012a\u0096\2\u050b\u050c\5\u00e4s\2"+
		"\u050c\u050e\3\2\2\2\u050d\u04fc\3\2\2\2\u050d\u0500\3\2\2\2\u050d\u0501"+
		"\3\2\2\2\u050d\u0505\3\2\2\2\u050d\u0507\3\2\2\2\u050e\u057d\3\2\2\2\u050f"+
		"\u0510\f\23\2\2\u0510\u0511\7H\2\2\u0511\u0512\5\u012a\u0096\2\u0512\u0513"+
		"\5\u00e8u\24\u0513\u057c\3\2\2\2\u0514\u0515\f\21\2\2\u0515\u0516\5\u012a"+
		"\u0096\2\u0516\u0517\t\13\2\2\u0517\u0518\5\u012a\u0096\2\u0518\u0519"+
		"\5\u00e8u\22\u0519\u057c\3\2\2\2\u051a\u051b\f\20\2\2\u051b\u051c\t\f"+
		"\2\2\u051c\u051d\5\u012a\u0096\2\u051d\u051e\5\u00e8u\21\u051e\u057c\3"+
		"\2\2\2\u051f\u0520\f\17\2\2\u0520\u052b\5\u012a\u0096\2\u0521\u0522\7"+
		"[\2\2\u0522\u0529\7[\2\2\u0523\u0524\7Z\2\2\u0524\u0525\7Z\2\2\u0525\u0529"+
		"\7Z\2\2\u0526\u0527\7Z\2\2\u0527\u0529\7Z\2\2\u0528\u0521\3\2\2\2\u0528"+
		"\u0523\3\2\2\2\u0528\u0526\3\2\2\2\u0529\u052c\3\2\2\2\u052a\u052c\t\r"+
		"\2\2\u052b\u0528\3\2\2\2\u052b\u052a\3\2\2\2\u052c\u052d\3\2\2\2\u052d"+
		"\u052e\5\u012a\u0096\2\u052e\u052f\5\u00e8u\20\u052f\u057c\3\2\2\2\u0530"+
		"\u0531\f\r\2\2\u0531\u0532\5\u012a\u0096\2\u0532\u0533\t\16\2\2\u0533"+
		"\u0534\5\u012a\u0096\2\u0534\u0535\5\u00e8u\16\u0535\u057c\3\2\2\2\u0536"+
		"\u0537\f\f\2\2\u0537\u0538\5\u012a\u0096\2\u0538\u0539\t\17\2\2\u0539"+
		"\u053a\5\u012a\u0096\2\u053a\u053b\5\u00e8u\r\u053b\u057c\3\2\2\2\u053c"+
		"\u053d\f\13\2\2\u053d\u053e\5\u012a\u0096\2\u053e\u053f\t\20\2\2\u053f"+
		"\u0540\5\u012a\u0096\2\u0540\u0541\5\u00e8u\f\u0541\u057c\3\2\2\2\u0542"+
		"\u0543\f\n\2\2\u0543\u0544\5\u012a\u0096\2\u0544\u0545\7l\2\2\u0545\u0546"+
		"\5\u012a\u0096\2\u0546\u0547\5\u00e8u\13\u0547\u057c\3\2\2\2\u0548\u0549"+
		"\f\t\2\2\u0549\u054a\5\u012a\u0096\2\u054a\u054b\7n\2\2\u054b\u054c\5"+
		"\u012a\u0096\2\u054c\u054d\5\u00e8u\n\u054d\u057c\3\2\2\2\u054e\u054f"+
		"\f\b\2\2\u054f\u0550\5\u012a\u0096\2\u0550\u0551\7m\2\2\u0551\u0552\5"+
		"\u012a\u0096\2\u0552\u0553\5\u00e8u\t\u0553\u057c\3\2\2\2\u0554\u0555"+
		"\f\7\2\2\u0555\u0556\5\u012a\u0096\2\u0556\u0557\7d\2\2\u0557\u0558\5"+
		"\u012a\u0096\2\u0558\u0559\5\u00e8u\b\u0559\u057c\3\2\2\2\u055a\u055b"+
		"\f\6\2\2\u055b\u055c\5\u012a\u0096\2\u055c\u055d\7e\2\2\u055d\u055e\5"+
		"\u012a\u0096\2\u055e\u055f\5\u00e8u\7\u055f\u057c\3\2\2\2\u0560\u0561"+
		"\f\5\2\2\u0561\u056b\5\u012a\u0096\2\u0562\u0563\7^\2\2\u0563\u0564\5"+
		"\u012a\u0096\2\u0564\u0565\5\u00e8u\2\u0565\u0566\5\u012a\u0096\2\u0566"+
		"\u0567\7_\2\2\u0567\u0568\5\u012a\u0096\2\u0568\u056c\3\2\2\2\u0569\u056a"+
		"\7C\2\2\u056a\u056c\5\u012a\u0096\2\u056b\u0562\3\2\2\2\u056b\u0569\3"+
		"\2\2\2\u056c\u056d\3\2\2\2\u056d\u056e\5\u00e8u\5\u056e\u057c\3\2\2\2"+
		"\u056f\u0570\f\16\2\2\u0570\u0571\5\u012a\u0096\2\u0571\u0572\t\21\2\2"+
		"\u0572\u0573\5\u012a\u0096\2\u0573\u0574\5J&\2\u0574\u057c\3\2\2\2\u0575"+
		"\u0576\f\3\2\2\u0576\u0577\5\u012a\u0096\2\u0577\u0578\t\22\2\2\u0578"+
		"\u0579\5\u012a\u0096\2\u0579\u057a\5\u00e2r\2\u057a\u057c\3\2\2\2\u057b"+
		"\u050f\3\2\2\2\u057b\u0514\3\2\2\2\u057b\u051a\3\2\2\2\u057b\u051f\3\2"+
		"\2\2\u057b\u0530\3\2\2\2\u057b\u0536\3\2\2\2\u057b\u053c\3\2\2\2\u057b"+
		"\u0542\3\2\2\2\u057b\u0548\3\2\2\2\u057b\u054e\3\2\2\2\u057b\u0554\3\2"+
		"\2\2\u057b\u055a\3\2\2\2\u057b\u0560\3\2\2\2\u057b\u056f\3\2\2\2\u057b"+
		"\u0575\3\2\2\2\u057c\u057f\3\2\2\2\u057d\u057b\3\2\2\2\u057d\u057e\3\2"+
		"\2\2\u057e\u00e9\3\2\2\2\u057f\u057d\3\2\2\2\u0580\u0581\5\u00d8m\2\u0581"+
		"\u0582\5\u00eav\2\u0582\u058b\3\2\2\2\u0583\u058b\5\u00e6t\2\u0584\u0585"+
		"\t\t\2\2\u0585\u0586\5\u012a\u0096\2\u0586\u0587\5\u00eav\2\u0587\u058b"+
		"\3\2\2\2\u0588\u0589\t\n\2\2\u0589\u058b\5\u00eav\2\u058a\u0580\3\2\2"+
		"\2\u058a\u0583\3\2\2\2\u058a\u0584\3\2\2\2\u058a\u0588\3\2\2\2\u058b\u00eb"+
		"\3\2\2\2\u058c\u0590\5\u00e8u\2\u058d\u058e\6w\34\3\u058e\u0591\5\u0116"+
		"\u008c\2\u058f\u0591\3\2\2\2\u0590\u058d\3\2\2\2\u0590\u058f\3\2\2\2\u0591"+
		"\u0595\3\2\2\2\u0592\u0594\5\u00eex\2\u0593\u0592\3\2\2\2\u0594\u0597"+
		"\3\2\2\2\u0595\u0593\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u00ed\3\2\2\2\u0597"+
		"\u0595\3\2\2\2\u0598\u059f\5\u00fc\177\2\u0599\u059b\5\u00f2z\2\u059a"+
		"\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2"+
		"\2\2\u059d\u05a0\3\2\2\2\u059e\u05a0\5\u0116\u008c\2\u059f\u059a\3\2\2"+
		"\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u00ef\3\2\2\2\u05a1\u05a7"+
		"\5\u00fc\177\2\u05a2\u05a3\5\u00f2z\2\u05a3\u05a4\by\1\2\u05a4\u05a6\3"+
		"\2\2\2\u05a5\u05a2\3\2\2\2\u05a6\u05a9\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a7"+
		"\u05a8\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa\u05ac\5\u0138"+
		"\u009d\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u00f1\3\2\2\2\u05ad"+
		"\u05b8\5\u012a\u0096\2\u05ae\u05af\t\23\2\2\u05af\u05b2\5\u012a\u0096"+
		"\2\u05b0\u05b3\7~\2\2\u05b1\u05b3\5\u0110\u0089\2\u05b2\u05b0\3\2\2\2"+
		"\u05b2\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b9\3\2\2\2\u05b4\u05b5"+
		"\7D\2\2\u05b5\u05b9\5\u012a\u0096\2\u05b6\u05b7\7E\2\2\u05b7\u05b9\5\u012a"+
		"\u0096\2\u05b8\u05ae\3\2\2\2\u05b8\u05b4\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b9"+
		"\u05ba\3\2\2\2\u05ba\u05bb\5\u00f4{\2\u05bb\u05bc\bz\1\2\u05bc\u05d5\3"+
		"\2\2\2\u05bd\u05be\5\u012a\u0096\2\u05be\u05bf\7X\2\2\u05bf\u05c0\5\u012a"+
		"\u0096\2\u05c0\u05c3\7\'\2\2\u05c1\u05c4\5\u0130\u0099\2\u05c2\u05c4\5"+
		"\u0108\u0085\2\u05c3\u05c1\3\2\2\2\u05c3\u05c2\3\2\2\2\u05c4\u05c5\3\2"+
		"\2\2\u05c5\u05c6\bz\1\2\u05c6\u05d5\3\2\2\2\u05c7\u05c8\5\u0114\u008b"+
		"\2\u05c8\u05c9\bz\1\2\u05c9\u05d5\3\2\2\2\u05ca\u05cb\5\u012a\u0096\2"+
		"\u05cb\u05cc\5\u0084C\2\u05cc\u05cd\bz\1\2\u05cd\u05d5\3\2\2\2\u05ce\u05cf"+
		"\5\u00f8}\2\u05cf\u05d0\bz\1\2\u05d0\u05d5\3\2\2\2\u05d1\u05d2\5\u00fa"+
		"~\2\u05d2\u05d3\bz\1\2\u05d3\u05d5\3\2\2\2\u05d4\u05ad\3\2\2\2\u05d4\u05bd"+
		"\3\2\2\2\u05d4\u05c7\3\2\2\2\u05d4\u05ca\3\2\2\2\u05d4\u05ce\3\2\2\2\u05d4"+
		"\u05d1\3\2\2\2\u05d5\u00f3\3\2\2\2\u05d6\u05db\5\u0134\u009b\2\u05d7\u05db"+
		"\5\u011e\u0090\2\u05d8\u05db\5\u00f6|\2\u05d9\u05db\5\u0126\u0094\2\u05da"+
		"\u05d6\3\2\2\2\u05da\u05d7\3\2\2\2\u05da\u05d8\3\2\2\2\u05da\u05d9\3\2"+
		"\2\2\u05db\u00f5\3\2\2\2\u05dc\u05df\5\u00dan\2\u05dd\u05df\5r:\2\u05de"+
		"\u05dc\3\2\2\2\u05de\u05dd\3\2\2\2\u05df\u00f7\3\2\2\2\u05e0\u05e2\7^"+
		"\2\2\u05e1\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3"+
		"\u05e5\7T\2\2\u05e4\u05e6\5\u00dep\2\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3"+
		"\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\7U\2\2\u05e8\u00f9\3\2\2\2\u05e9"+
		"\u05eb\7^\2\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\3\2"+
		"\2\2\u05ec\u05ef\7T\2\2\u05ed\u05f0\5\u0102\u0082\2\u05ee\u05f0\7_\2\2"+
		"\u05ef\u05ed\3\2\2\2\u05ef\u05ee\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2"+
		"\7U\2\2\u05f2\u00fb\3\2\2\2\u05f3\u05f5\5\u0132\u009a\2\u05f4\u05f6\5"+
		"T+\2\u05f5\u05f4\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u0607\3\2\2\2\u05f7"+
		"\u0607\5p9\2\u05f8\u0607\5r:\2\u05f9\u05fa\7\'\2\2\u05fa\u05fd\5\u012a"+
		"\u0096\2\u05fb\u05fe\5\u0130\u0099\2\u05fc\u05fe\5\u0108\u0085\2\u05fd"+
		"\u05fb\3\2\2\2\u05fd\u05fc\3\2\2\2\u05fe\u0607\3\2\2\2\u05ff\u0607\7\62"+
		"\2\2\u0600\u0607\7/\2\2\u0601\u0607\5\u00dan\2\u0602\u0607\5\u0084C\2"+
		"\u0603\u0607\5\u00fe\u0080\2\u0604\u0607\5\u0100\u0081\2\u0605\u0607\5"+
		"\u0124\u0093\2\u0606\u05f3\3\2\2\2\u0606\u05f7\3\2\2\2\u0606\u05f8\3\2"+
		"\2\2\u0606\u05f9\3\2\2\2\u0606\u05ff\3\2\2\2\u0606\u0600\3\2\2\2\u0606"+
		"\u0601\3\2\2\2\u0606\u0602\3\2\2\2\u0606\u0603\3\2\2\2\u0606\u0604\3\2"+
		"\2\2\u0606\u0605\3\2\2\2\u0607\u00fd\3\2\2\2\u0608\u060a\7T\2\2\u0609"+
		"\u060b\5\u00dep\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d"+
		"\3\2\2\2\u060c\u060e\7W\2\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e"+
		"\u060f\3\2\2\2\u060f\u0610\7U\2\2\u0610\u00ff\3\2\2\2\u0611\u0617\7T\2"+
		"\2\u0612\u0614\5\u0102\u0082\2\u0613\u0615\7W\2\2\u0614\u0613\3\2\2\2"+
		"\u0614\u0615\3\2\2\2\u0615\u0618\3\2\2\2\u0616\u0618\7_\2\2\u0617\u0612"+
		"\3\2\2\2\u0617\u0616\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\7U\2\2\u061a"+
		"\u0101\3\2\2\2\u061b\u0620\5\u0104\u0083\2\u061c\u061d\7W\2\2\u061d\u061f"+
		"\5\u0104\u0083\2\u061e\u061c\3\2\2\2\u061f\u0622\3\2\2\2\u0620\u061e\3"+
		"\2\2\2\u0620\u0621\3\2\2\2\u0621\u0103\3\2\2\2\u0622\u0620\3\2\2\2\u0623"+
		"\u0624\5\u0106\u0084\2\u0624\u0625\7_\2\2\u0625\u0626\5\u012a\u0096\2"+
		"\u0626\u0627\5\u00e8u\2\u0627\u062e\3\2\2\2\u0628\u0629\7j\2\2\u0629\u062a"+
		"\7_\2\2\u062a\u062b\5\u012a\u0096\2\u062b\u062c\5\u00e8u\2\u062c\u062e"+
		"\3\2\2\2\u062d\u0623\3\2\2\2\u062d\u0628\3\2\2\2\u062e\u0105\3\2\2\2\u062f"+
		"\u0632\5\u0126\u0094\2\u0630\u0632\5\u00fc\177\2\u0631\u062f\3\2\2\2\u0631"+
		"\u0630\3\2\2\2\u0632\u0107\3\2\2\2\u0633\u064b\5\u010e\u0088\2\u0634\u0635"+
		"\6\u0085\35\3\u0635\u0636\5\u012a\u0096\2\u0636\u0638\5\u0114\u008b\2"+
		"\u0637\u0639\5\u010c\u0087\2\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639"+
		"\u064c\3\2\2\2\u063a\u0640\6\u0085\36\3\u063b\u063c\5\u008aF\2\u063c\u063d"+
		"\7T\2\2\u063d\u063e\5\u00e8u\2\u063e\u063f\7U\2\2\u063f\u0641\3\2\2\2"+
		"\u0640\u063b\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643"+
		"\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0645\5F$\2\u0645\u064c\3\2\2\2\u0646"+
		"\u0647\6\u0085\37\3\u0647\u0648\5D#\2\u0648\u0649\5\u012a\u0096\2\u0649"+
		"\u064a\5\u010a\u0086\2\u064a\u064c\3\2\2\2\u064b\u0634\3\2\2\2\u064b\u063a"+
		"\3\2\2\2\u064b\u0646\3\2\2\2\u064c\u0109\3\2\2\2\u064d\u064e\7R\2\2\u064e"+
		"\u0650\5\u012a\u0096\2\u064f\u0651\5B\"\2\u0650\u064f\3\2\2\2\u0650\u0651"+
		"\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\5\u012a\u0096\2\u0653\u0654\7"+
		"S\2\2\u0654\u010b\3\2\2\2\u0655\u0656\5(\25\2\u0656\u010d\3\2\2\2\u0657"+
		"\u065d\5\u008aF\2\u0658\u065e\5R*\2\u0659\u065b\5l\67\2\u065a\u065c\5"+
		"\u0112\u008a\2\u065b\u065a\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065e\3\2"+
		"\2\2\u065d\u0658\3\2\2\2\u065d\u0659\3\2\2\2\u065e\u010f\3\2\2\2\u065f"+
		"\u0660\7[\2\2\u0660\u0661\5\u012a\u0096\2\u0661\u0662\5$\23\2\u0662\u0663"+
		"\5\u012a\u0096\2\u0663\u0664\7Z\2\2\u0664\u0111\3\2\2\2\u0665\u0666\7"+
		"[\2\2\u0666\u0669\7Z\2\2\u0667\u0669\5T+\2\u0668\u0665\3\2\2\2\u0668\u0667"+
		"\3\2\2\2\u0669\u0113\3\2\2\2\u066a\u066c\7P\2\2\u066b\u066d\5\u0118\u008d"+
		"\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066f\3\2\2\2\u066e\u0670"+
		"\7W\2\2\u066f\u066e\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0671\3\2\2\2\u0671"+
		"\u0672\5\u0128\u0095\2\u0672\u0115\3\2\2\2\u0673\u067a\5\u011a\u008e\2"+
		"\u0674\u0675\7W\2\2\u0675\u0676\5\u012a\u0096\2\u0676\u0677\5\u011a\u008e"+
		"\2\u0677\u0679\3\2\2\2\u0678\u0674\3\2\2\2\u0679\u067c\3\2\2\2\u067a\u0678"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u0117\3\2\2\2\u067c\u067a\3\2\2\2\u067d"+
		"\u0684\5\u011c\u008f\2\u067e\u067f\7W\2\2\u067f\u0680\5\u012a\u0096\2"+
		"\u0680\u0681\5\u011c\u008f\2\u0681\u0683\3\2\2\2\u0682\u067e\3\2\2\2\u0683"+
		"\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0119\3\2"+
		"\2\2\u0686\u0684\3\2\2\2\u0687\u068a\5\u00e0q\2\u0688\u068a\5\u0104\u0083"+
		"\2\u0689\u0687\3\2\2\2\u0689\u0688\3\2\2\2\u068a\u011b\3\2\2\2\u068b\u068f"+
		"\5\u00e0q\2\u068c\u068f\5z>\2\u068d\u068f\5\u0104\u0083\2\u068e\u068b"+
		"\3\2\2\2\u068e\u068c\3\2\2\2\u068e\u068d\3\2\2\2\u068f\u011d\3\2\2\2\u0690"+
		"\u0691\7\3\2\2\u0691\u011f\3\2\2\2\u0692\u0693\5\u0132\u009a\2\u0693\u0121"+
		"\3\2\2\2\u0694\u069d\7}\2\2\u0695\u069d\7|\2\2\u0696\u069d\7\16\2\2\u0697"+
		"\u0698\6\u0092 \2\u0698\u069d\7-\2\2\u0699\u069d\7\13\2\2\u069a\u069d"+
		"\7\f\2\2\u069b\u069d\7\t\2\2\u069c\u0694\3\2\2\2\u069c\u0695\3\2\2\2\u069c"+
		"\u0696\3\2\2\2\u069c\u0697\3\2\2\2\u069c\u0699\3\2\2\2\u069c\u069a\3\2"+
		"\2\2\u069c\u069b\3\2\2\2\u069d\u0123\3\2\2\2\u069e\u069f\t\24\2\2\u069f"+
		"\u0125\3\2\2\2\u06a0\u06a1\t\25\2\2\u06a1\u0127\3\2\2\2\u06a2\u06a4\5"+
		"\u012e\u0098\2\u06a3\u06a2\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a5\3\2"+
		"\2\2\u06a5\u06a6\7Q\2\2\u06a6\u0129\3\2\2\2\u06a7\u06a9\7\u0081\2\2\u06a8"+
		"\u06a7\3\2\2\2\u06a9\u06ac\3\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2"+
		"\2\2\u06ab\u012b\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ad\u06af\t\26\2\2\u06ae"+
		"\u06ad\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b0\u06b1\3\2"+
		"\2\2\u06b1\u012d\3\2\2\2\u06b2\u06b6\7P\2\2\u06b3\u06b5\n\27\2\2\u06b4"+
		"\u06b3\3\2\2\2\u06b5\u06b8\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b6\u06b7\3\2"+
		"\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b9\u06d7\7Q\2\2\u06ba"+
		"\u06be\7R\2\2\u06bb\u06bd\n\30\2\2\u06bc\u06bb\3\2\2\2\u06bd\u06c0\3\2"+
		"\2\2\u06be\u06bc\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c1\3\2\2\2\u06c0"+
		"\u06be\3\2\2\2\u06c1\u06d7\7S\2\2\u06c2\u06c6\7T\2\2\u06c3\u06c5\n\31"+
		"\2\2\u06c4\u06c3\3\2\2\2\u06c5\u06c8\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c6"+
		"\u06c7\3\2\2\2\u06c7\u06c9\3\2\2\2\u06c8\u06c6\3\2\2\2\u06c9\u06d7\7U"+
		"\2\2\u06ca\u06cc\n\32\2\2\u06cb\u06ca\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd"+
		"\u06cb\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d0\3\2\2\2\u06cf\u06cd\3\2"+
		"\2\2\u06d0\u06d7\7\u0081\2\2\u06d1\u06d3\n\33\2\2\u06d2\u06d1\3\2\2\2"+
		"\u06d3\u06d4\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d7"+
		"\3\2\2\2\u06d6\u06b2\3\2\2\2\u06d6\u06ba\3\2\2\2\u06d6\u06c2\3\2\2\2\u06d6"+
		"\u06cd\3\2\2\2\u06d6\u06d2\3\2\2\2\u06d7\u012f\3\2\2\2\u06d8\u06d9\5P"+
		")\2\u06d9\u0131\3\2\2\2\u06da\u06db\6\u009a!\3\u06db\u06e1\t\34\2\2\u06dc"+
		"\u06dd\6\u009a\"\3\u06dd\u06e1\t\34\2\2\u06de\u06df\6\u009a#\3\u06df\u06e1"+
		"\5\u0122\u0092\2\u06e0\u06da\3\2\2\2\u06e0\u06dc\3\2\2\2\u06e0\u06de\3"+
		"\2\2\2\u06e1\u0133\3\2\2\2\u06e2\u06e3\5\u0132\u009a\2\u06e3\u0135\3\2"+
		"\2\2\u06e4\u06e5\5\u0132\u009a\2\u06e5\u0137\3\2\2\2\u06e6\u06e7\7X\2"+
		"\2\u06e7\u0139\3\2\2\2\u00cb\u013c\u013f\u0142\u014c\u0150\u0159\u0160"+
		"\u0167\u016a\u0171\u0174\u017b\u017f\u0183\u0186\u018d\u0198\u01a3\u01ac"+
		"\u01b6\u01c4\u01ca\u01d3\u01d7\u01da\u01e2\u01e5\u01e8\u01eb\u01f1\u01f4"+
		"\u01f7\u01fa\u0201\u0205\u0211\u0217\u021c\u021f\u0224\u0228\u022f\u023a"+
		"\u023e\u0241\u024a\u024e\u0250\u0254\u0259\u0264\u026d\u027c\u0281\u0289"+
		"\u0290\u0293\u0298\u029b\u029e\u02a2\u02a5\u02a9\u02ad\u02ba\u02c7\u02c9"+
		"\u02d5\u02da\u02e0\u02e8\u02f0\u02f3\u02fb\u0304\u030c\u0313\u031f\u0327"+
		"\u032f\u0337\u033b\u0341\u0354\u0358\u035d\u0363\u036a\u036d\u0375\u0379"+
		"\u0380\u0387\u038a\u038e\u0397\u03a2\u03a7\u03af\u03b2\u03b5\u03be\u03c1"+
		"\u03c8\u03d1\u03d5\u03d8\u03e0\u03e3\u03e7\u03e9\u03f1\u03f7\u0401\u0407"+
		"\u040f\u0415\u041f\u0438\u043c\u0440\u0444\u044d\u0453\u045c\u0469\u047d"+
		"\u0483\u048f\u049a\u04a4\u04a9\u04b0\u04ba\u04be\u04c2\u04c9\u04cd\u04d1"+
		"\u04d5\u04e8\u04ee\u04f4\u04fa\u050d\u0528\u052b\u056b\u057b\u057d\u058a"+
		"\u0590\u0595\u059c\u059f\u05a7\u05ab\u05b2\u05b8\u05c3\u05d4\u05da\u05de"+
		"\u05e1\u05e5\u05ea\u05ef\u05f5\u05fd\u0606\u060a\u060d\u0614\u0617\u0620"+
		"\u062d\u0631\u0638\u0642\u064b\u0650\u065b\u065d\u0668\u066c\u066f\u067a"+
		"\u0684\u0689\u068e\u069c\u06a3\u06aa\u06b0\u06b6\u06be\u06c6\u06cd\u06d4"+
		"\u06d6\u06e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}