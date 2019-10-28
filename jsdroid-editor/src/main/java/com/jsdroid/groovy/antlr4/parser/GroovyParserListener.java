// Generated from D:/project/jsdroid/idea/JsDroidMobile/jsdroid-editor/src/main/antlr\GroovyParser.g4 by ANTLR 4.7.2

package com.jsdroid.groovy.antlr4.parser;
    import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GroovyParser}.
 */
public interface GroovyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GroovyParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(GroovyParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(GroovyParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(GroovyParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(GroovyParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(GroovyParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(GroovyParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(GroovyParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(GroovyParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(GroovyParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(GroovyParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(GroovyParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(GroovyParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#modifiersOpt}.
	 * @param ctx the parse tree
	 */
	void enterModifiersOpt(GroovyParser.ModifiersOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#modifiersOpt}.
	 * @param ctx the parse tree
	 */
	void exitModifiersOpt(GroovyParser.ModifiersOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(GroovyParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(GroovyParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classOrInterfaceModifiersOpt}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifiersOpt(GroovyParser.ClassOrInterfaceModifiersOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classOrInterfaceModifiersOpt}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifiersOpt(GroovyParser.ClassOrInterfaceModifiersOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifiers(GroovyParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifiers(GroovyParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(GroovyParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(GroovyParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(GroovyParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(GroovyParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#variableModifiersOpt}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiersOpt(GroovyParser.VariableModifiersOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#variableModifiersOpt}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiersOpt(GroovyParser.VariableModifiersOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiers(GroovyParser.VariableModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiers(GroovyParser.VariableModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(GroovyParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(GroovyParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(GroovyParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(GroovyParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(GroovyParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(GroovyParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(GroovyParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(GroovyParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(GroovyParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(GroovyParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(GroovyParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(GroovyParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(GroovyParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(GroovyParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(GroovyParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(GroovyParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(GroovyParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(GroovyParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(GroovyParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(GroovyParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(GroovyParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(GroovyParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(GroovyParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(GroovyParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(GroovyParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(GroovyParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(GroovyParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(GroovyParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(GroovyParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(GroovyParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(GroovyParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(GroovyParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(GroovyParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(GroovyParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(GroovyParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(GroovyParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#variableInitializers}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializers(GroovyParser.VariableInitializersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#variableInitializers}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializers(GroovyParser.VariableInitializersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(GroovyParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(GroovyParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#dimsOpt}.
	 * @param ctx the parse tree
	 */
	void enterDimsOpt(GroovyParser.DimsOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#dimsOpt}.
	 * @param ctx the parse tree
	 */
	void exitDimsOpt(GroovyParser.DimsOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#standardType}.
	 * @param ctx the parse tree
	 */
	void enterStandardType(GroovyParser.StandardTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#standardType}.
	 * @param ctx the parse tree
	 */
	void exitStandardType(GroovyParser.StandardTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GroovyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GroovyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(GroovyParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(GroovyParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#generalClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterGeneralClassOrInterfaceType(GroovyParser.GeneralClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#generalClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitGeneralClassOrInterfaceType(GroovyParser.GeneralClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#standardClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterStandardClassOrInterfaceType(GroovyParser.StandardClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#standardClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitStandardClassOrInterfaceType(GroovyParser.StandardClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(GroovyParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(GroovyParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(GroovyParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(GroovyParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(GroovyParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(GroovyParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#annotatedQualifiedClassName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedQualifiedClassName(GroovyParser.AnnotatedQualifiedClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#annotatedQualifiedClassName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedQualifiedClassName(GroovyParser.AnnotatedQualifiedClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#qualifiedClassNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedClassNameList(GroovyParser.QualifiedClassNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#qualifiedClassNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedClassNameList(GroovyParser.QualifiedClassNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(GroovyParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(GroovyParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(GroovyParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(GroovyParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#thisFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterThisFormalParameter(GroovyParser.ThisFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#thisFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitThisFormalParameter(GroovyParser.ThisFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(GroovyParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(GroovyParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(GroovyParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(GroovyParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(GroovyParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(GroovyParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#qualifiedNameElement}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameElement(GroovyParser.QualifiedNameElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#qualifiedNameElement}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameElement(GroovyParser.QualifiedNameElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#qualifiedNameElements}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameElements(GroovyParser.QualifiedNameElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#qualifiedNameElements}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameElements(GroovyParser.QualifiedNameElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#qualifiedClassName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedClassName(GroovyParser.QualifiedClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#qualifiedClassName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedClassName(GroovyParser.QualifiedClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#qualifiedStandardClassName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedStandardClassName(GroovyParser.QualifiedStandardClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#qualifiedStandardClassName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedStandardClassName(GroovyParser.QualifiedStandardClassNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteralAlt(GroovyParser.IntegerLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteralAlt(GroovyParser.IntegerLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatingPointLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteralAlt(GroovyParser.FloatingPointLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatingPointLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteralAlt(GroovyParser.FloatingPointLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralAlt(GroovyParser.StringLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralAlt(GroovyParser.StringLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteralAlt(GroovyParser.BooleanLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteralAlt(GroovyParser.BooleanLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteralAlt(GroovyParser.NullLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteralAlt(GroovyParser.NullLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#gstring}.
	 * @param ctx the parse tree
	 */
	void enterGstring(GroovyParser.GstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#gstring}.
	 * @param ctx the parse tree
	 */
	void exitGstring(GroovyParser.GstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#gstringValue}.
	 * @param ctx the parse tree
	 */
	void enterGstringValue(GroovyParser.GstringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#gstringValue}.
	 * @param ctx the parse tree
	 */
	void exitGstringValue(GroovyParser.GstringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#gstringPath}.
	 * @param ctx the parse tree
	 */
	void enterGstringPath(GroovyParser.GstringPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#gstringPath}.
	 * @param ctx the parse tree
	 */
	void exitGstringPath(GroovyParser.GstringPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(GroovyParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(GroovyParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#standardLambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterStandardLambdaExpression(GroovyParser.StandardLambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#standardLambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitStandardLambdaExpression(GroovyParser.StandardLambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(GroovyParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(GroovyParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#standardLambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterStandardLambdaParameters(GroovyParser.StandardLambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#standardLambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitStandardLambdaParameters(GroovyParser.StandardLambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(GroovyParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(GroovyParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#closure}.
	 * @param ctx the parse tree
	 */
	void enterClosure(GroovyParser.ClosureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#closure}.
	 * @param ctx the parse tree
	 */
	void exitClosure(GroovyParser.ClosureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#closureOrLambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterClosureOrLambdaExpression(GroovyParser.ClosureOrLambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#closureOrLambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitClosureOrLambdaExpression(GroovyParser.ClosureOrLambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#blockStatementsOpt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementsOpt(GroovyParser.BlockStatementsOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#blockStatementsOpt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementsOpt(GroovyParser.BlockStatementsOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(GroovyParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(GroovyParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#annotationsOpt}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationsOpt(GroovyParser.AnnotationsOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#annotationsOpt}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationsOpt(GroovyParser.AnnotationsOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(GroovyParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(GroovyParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#elementValues}.
	 * @param ctx the parse tree
	 */
	void enterElementValues(GroovyParser.ElementValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#elementValues}.
	 * @param ctx the parse tree
	 */
	void exitElementValues(GroovyParser.ElementValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(GroovyParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(GroovyParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(GroovyParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(GroovyParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(GroovyParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(GroovyParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#elementValuePairName}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairName(GroovyParser.ElementValuePairNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#elementValuePairName}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairName(GroovyParser.ElementValuePairNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(GroovyParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(GroovyParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(GroovyParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(GroovyParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GroovyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GroovyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(GroovyParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(GroovyParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(GroovyParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(GroovyParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classifiedModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassifiedModifiers(GroovyParser.ClassifiedModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classifiedModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassifiedModifiers(GroovyParser.ClassifiedModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(GroovyParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(GroovyParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#typeNamePairs}.
	 * @param ctx the parse tree
	 */
	void enterTypeNamePairs(GroovyParser.TypeNamePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#typeNamePairs}.
	 * @param ctx the parse tree
	 */
	void exitTypeNamePairs(GroovyParser.TypeNamePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#typeNamePair}.
	 * @param ctx the parse tree
	 */
	void enterTypeNamePair(GroovyParser.TypeNamePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#typeNamePair}.
	 * @param ctx the parse tree
	 */
	void exitTypeNamePair(GroovyParser.TypeNamePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#variableNames}.
	 * @param ctx the parse tree
	 */
	void enterVariableNames(GroovyParser.VariableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#variableNames}.
	 * @param ctx the parse tree
	 */
	void exitVariableNames(GroovyParser.VariableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(GroovyParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(GroovyParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(GroovyParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(GroovyParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(GroovyParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(GroovyParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmtAlt}
	 * labeled alternative in {@link GroovyParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStmtAlt(GroovyParser.ForStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmtAlt}
	 * labeled alternative in {@link GroovyParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStmtAlt(GroovyParser.ForStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmtAlt}
	 * labeled alternative in {@link GroovyParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmtAlt(GroovyParser.WhileStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmtAlt}
	 * labeled alternative in {@link GroovyParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmtAlt(GroovyParser.WhileStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileStmtAlt}
	 * labeled alternative in {@link GroovyParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmtAlt(GroovyParser.DoWhileStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileStmtAlt}
	 * labeled alternative in {@link GroovyParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmtAlt(GroovyParser.DoWhileStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(GroovyParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(GroovyParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(GroovyParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(GroovyParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(GroovyParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(GroovyParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(GroovyParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(GroovyParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmtAlt(GroovyParser.BlockStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmtAlt(GroovyParser.BlockStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStmtAlt(GroovyParser.ConditionalStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStmtAlt(GroovyParser.ConditionalStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmtAlt(GroovyParser.LoopStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmtAlt(GroovyParser.LoopStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryCatchStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStmtAlt(GroovyParser.TryCatchStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryCatchStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStmtAlt(GroovyParser.TryCatchStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code synchronizedStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStmtAlt(GroovyParser.SynchronizedStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code synchronizedStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStmtAlt(GroovyParser.SynchronizedStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmtAlt(GroovyParser.ReturnStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmtAlt(GroovyParser.ReturnStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code throwStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStmtAlt(GroovyParser.ThrowStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throwStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStmtAlt(GroovyParser.ThrowStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmtAlt(GroovyParser.BreakStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmtAlt(GroovyParser.BreakStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmtAlt(GroovyParser.ContinueStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmtAlt(GroovyParser.ContinueStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labeledStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStmtAlt(GroovyParser.LabeledStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labeledStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStmtAlt(GroovyParser.LabeledStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStmtAlt(GroovyParser.ImportStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStmtAlt(GroovyParser.ImportStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assertStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmtAlt(GroovyParser.AssertStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assertStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmtAlt(GroovyParser.AssertStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDeclarationStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclarationStmtAlt(GroovyParser.TypeDeclarationStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDeclarationStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclarationStmtAlt(GroovyParser.TypeDeclarationStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localVariableDeclarationStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStmtAlt(GroovyParser.LocalVariableDeclarationStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localVariableDeclarationStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStmtAlt(GroovyParser.LocalVariableDeclarationStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDeclarationStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationStmtAlt(GroovyParser.MethodDeclarationStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDeclarationStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationStmtAlt(GroovyParser.MethodDeclarationStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmtAlt(GroovyParser.ExpressionStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmtAlt(GroovyParser.ExpressionStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmtAlt(GroovyParser.EmptyStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmtAlt(GroovyParser.EmptyStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterErrorAlt(GroovyParser.ErrorAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitErrorAlt(GroovyParser.ErrorAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(GroovyParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(GroovyParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(GroovyParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(GroovyParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(GroovyParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(GroovyParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(GroovyParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(GroovyParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(GroovyParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(GroovyParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(GroovyParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(GroovyParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(GroovyParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(GroovyParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(GroovyParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(GroovyParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(GroovyParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(GroovyParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(GroovyParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(GroovyParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classicalForControl}.
	 * @param ctx the parse tree
	 */
	void enterClassicalForControl(GroovyParser.ClassicalForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classicalForControl}.
	 * @param ctx the parse tree
	 */
	void exitClassicalForControl(GroovyParser.ClassicalForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(GroovyParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(GroovyParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(GroovyParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(GroovyParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#castParExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastParExpression(GroovyParser.CastParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#castParExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastParExpression(GroovyParser.CastParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(GroovyParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(GroovyParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#expressionInPar}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInPar(GroovyParser.ExpressionInParContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#expressionInPar}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInPar(GroovyParser.ExpressionInParContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(GroovyParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(GroovyParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#expressionListElement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionListElement(GroovyParser.ExpressionListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#expressionListElement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionListElement(GroovyParser.ExpressionListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#enhancedStatementExpression}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedStatementExpression(GroovyParser.EnhancedStatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#enhancedStatementExpression}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedStatementExpression(GroovyParser.EnhancedStatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commandExprAlt}
	 * labeled alternative in {@link GroovyParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterCommandExprAlt(GroovyParser.CommandExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commandExprAlt}
	 * labeled alternative in {@link GroovyParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitCommandExprAlt(GroovyParser.CommandExprAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(GroovyParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(GroovyParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExprAlt(GroovyParser.ShiftExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExprAlt(GroovyParser.ShiftExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleAssignmentExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultipleAssignmentExprAlt(GroovyParser.MultipleAssignmentExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleAssignmentExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultipleAssignmentExprAlt(GroovyParser.MultipleAssignmentExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionUnaryNotExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionUnaryNotExprAlt(GroovyParser.ExpressionUnaryNotExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionUnaryNotExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionUnaryNotExprAlt(GroovyParser.ExpressionUnaryNotExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionCastExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCastExprAlt(GroovyParser.ExpressionCastExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionCastExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCastExprAlt(GroovyParser.ExpressionCastExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionPostfixExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPostfixExprAlt(GroovyParser.ExpressionPostfixExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionPostfixExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPostfixExprAlt(GroovyParser.ExpressionPostfixExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclusiveOrExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExprAlt(GroovyParser.ExclusiveOrExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclusiveOrExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExprAlt(GroovyParser.ExclusiveOrExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExprAlt(GroovyParser.AdditiveExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExprAlt(GroovyParser.AdditiveExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRegexExprAlt(GroovyParser.RegexExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRegexExprAlt(GroovyParser.RegexExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExprAlt(GroovyParser.ConditionalExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExprAlt(GroovyParser.ConditionalExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExprAlt(GroovyParser.PowerExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExprAlt(GroovyParser.PowerExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExprAlt(GroovyParser.RelationalExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExprAlt(GroovyParser.RelationalExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExprAlt(GroovyParser.LogicalAndExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExprAlt(GroovyParser.LogicalAndExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExprAlt(GroovyParser.AssignmentExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExprAlt(GroovyParser.AssignmentExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExprAlt(GroovyParser.MultiplicativeExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExprAlt(GroovyParser.MultiplicativeExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inclusiveOrExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExprAlt(GroovyParser.InclusiveOrExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inclusiveOrExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExprAlt(GroovyParser.InclusiveOrExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionUnaryAddExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionUnaryAddExprAlt(GroovyParser.ExpressionUnaryAddExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionUnaryAddExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionUnaryAddExprAlt(GroovyParser.ExpressionUnaryAddExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExprAlt(GroovyParser.LogicalOrExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExprAlt(GroovyParser.LogicalOrExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExprAlt(GroovyParser.EqualityExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExprAlt(GroovyParser.EqualityExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExprAlt(GroovyParser.AndExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExprAlt(GroovyParser.AndExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExprAlt(GroovyParser.CastExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExprAlt(GroovyParser.CastExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExprAlt(GroovyParser.PostfixExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExprAlt(GroovyParser.PostfixExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryNotExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNotExprAlt(GroovyParser.UnaryNotExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryNotExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNotExprAlt(GroovyParser.UnaryNotExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryAddExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryAddExprAlt(GroovyParser.UnaryAddExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryAddExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryAddExprAlt(GroovyParser.UnaryAddExprAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#commandExpression}.
	 * @param ctx the parse tree
	 */
	void enterCommandExpression(GroovyParser.CommandExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#commandExpression}.
	 * @param ctx the parse tree
	 */
	void exitCommandExpression(GroovyParser.CommandExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#commandArgument}.
	 * @param ctx the parse tree
	 */
	void enterCommandArgument(GroovyParser.CommandArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#commandArgument}.
	 * @param ctx the parse tree
	 */
	void exitCommandArgument(GroovyParser.CommandArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#pathExpression}.
	 * @param ctx the parse tree
	 */
	void enterPathExpression(GroovyParser.PathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#pathExpression}.
	 * @param ctx the parse tree
	 */
	void exitPathExpression(GroovyParser.PathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterPathElement(GroovyParser.PathElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitPathElement(GroovyParser.PathElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#namePart}.
	 * @param ctx the parse tree
	 */
	void enterNamePart(GroovyParser.NamePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#namePart}.
	 * @param ctx the parse tree
	 */
	void exitNamePart(GroovyParser.NamePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#dynamicMemberName}.
	 * @param ctx the parse tree
	 */
	void enterDynamicMemberName(GroovyParser.DynamicMemberNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#dynamicMemberName}.
	 * @param ctx the parse tree
	 */
	void exitDynamicMemberName(GroovyParser.DynamicMemberNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#indexPropertyArgs}.
	 * @param ctx the parse tree
	 */
	void enterIndexPropertyArgs(GroovyParser.IndexPropertyArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#indexPropertyArgs}.
	 * @param ctx the parse tree
	 */
	void exitIndexPropertyArgs(GroovyParser.IndexPropertyArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#namedPropertyArgs}.
	 * @param ctx the parse tree
	 */
	void enterNamedPropertyArgs(GroovyParser.NamedPropertyArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#namedPropertyArgs}.
	 * @param ctx the parse tree
	 */
	void exitNamedPropertyArgs(GroovyParser.NamedPropertyArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPrmrAlt(GroovyParser.IdentifierPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPrmrAlt(GroovyParser.IdentifierPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralPrmrAlt(GroovyParser.LiteralPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralPrmrAlt(GroovyParser.LiteralPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterGstringPrmrAlt(GroovyParser.GstringPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitGstringPrmrAlt(GroovyParser.GstringPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNewPrmrAlt(GroovyParser.NewPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNewPrmrAlt(GroovyParser.NewPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterThisPrmrAlt(GroovyParser.ThisPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitThisPrmrAlt(GroovyParser.ThisPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterSuperPrmrAlt(GroovyParser.SuperPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitSuperPrmrAlt(GroovyParser.SuperPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenPrmrAlt(GroovyParser.ParenPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParenPrmrAlt(GroovyParser.ParenPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code closureOrLambdaExpressionPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterClosureOrLambdaExpressionPrmrAlt(GroovyParser.ClosureOrLambdaExpressionPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code closureOrLambdaExpressionPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitClosureOrLambdaExpressionPrmrAlt(GroovyParser.ClosureOrLambdaExpressionPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterListPrmrAlt(GroovyParser.ListPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitListPrmrAlt(GroovyParser.ListPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterMapPrmrAlt(GroovyParser.MapPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitMapPrmrAlt(GroovyParser.MapPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code builtInTypePrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInTypePrmrAlt(GroovyParser.BuiltInTypePrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code builtInTypePrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInTypePrmrAlt(GroovyParser.BuiltInTypePrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(GroovyParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(GroovyParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(GroovyParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(GroovyParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#mapEntryList}.
	 * @param ctx the parse tree
	 */
	void enterMapEntryList(GroovyParser.MapEntryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#mapEntryList}.
	 * @param ctx the parse tree
	 */
	void exitMapEntryList(GroovyParser.MapEntryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void enterMapEntry(GroovyParser.MapEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void exitMapEntry(GroovyParser.MapEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#mapEntryLabel}.
	 * @param ctx the parse tree
	 */
	void enterMapEntryLabel(GroovyParser.MapEntryLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#mapEntryLabel}.
	 * @param ctx the parse tree
	 */
	void exitMapEntryLabel(GroovyParser.MapEntryLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(GroovyParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(GroovyParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(GroovyParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(GroovyParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#anonymousInnerClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousInnerClassDeclaration(GroovyParser.AnonymousInnerClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#anonymousInnerClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousInnerClassDeclaration(GroovyParser.AnonymousInnerClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(GroovyParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(GroovyParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(GroovyParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(GroovyParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(GroovyParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(GroovyParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GroovyParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GroovyParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(GroovyParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(GroovyParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#enhancedArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedArgumentList(GroovyParser.EnhancedArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#enhancedArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedArgumentList(GroovyParser.EnhancedArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#argumentListElement}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListElement(GroovyParser.ArgumentListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#argumentListElement}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListElement(GroovyParser.ArgumentListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#enhancedArgumentListElement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedArgumentListElement(GroovyParser.EnhancedArgumentListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#enhancedArgumentListElement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedArgumentListElement(GroovyParser.EnhancedArgumentListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(GroovyParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(GroovyParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(GroovyParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(GroovyParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GroovyParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GroovyParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInType(GroovyParser.BuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInType(GroovyParser.BuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(GroovyParser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(GroovyParser.KeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#rparen}.
	 * @param ctx the parse tree
	 */
	void enterRparen(GroovyParser.RparenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#rparen}.
	 * @param ctx the parse tree
	 */
	void exitRparen(GroovyParser.RparenContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#nls}.
	 * @param ctx the parse tree
	 */
	void enterNls(GroovyParser.NlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#nls}.
	 * @param ctx the parse tree
	 */
	void exitNls(GroovyParser.NlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#sep}.
	 * @param ctx the parse tree
	 */
	void enterSep(GroovyParser.SepContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#sep}.
	 * @param ctx the parse tree
	 */
	void exitSep(GroovyParser.SepContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(GroovyParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(GroovyParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#constructorTip}.
	 * @param ctx the parse tree
	 */
	void enterConstructorTip(GroovyParser.ConstructorTipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#constructorTip}.
	 * @param ctx the parse tree
	 */
	void exitConstructorTip(GroovyParser.ConstructorTipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classTip}.
	 * @param ctx the parse tree
	 */
	void enterClassTip(GroovyParser.ClassTipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classTip}.
	 * @param ctx the parse tree
	 */
	void exitClassTip(GroovyParser.ClassTipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#methodOrFieldTip}.
	 * @param ctx the parse tree
	 */
	void enterMethodOrFieldTip(GroovyParser.MethodOrFieldTipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#methodOrFieldTip}.
	 * @param ctx the parse tree
	 */
	void exitMethodOrFieldTip(GroovyParser.MethodOrFieldTipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#variableTip}.
	 * @param ctx the parse tree
	 */
	void enterVariableTip(GroovyParser.VariableTipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#variableTip}.
	 * @param ctx the parse tree
	 */
	void exitVariableTip(GroovyParser.VariableTipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#pathEnd}.
	 * @param ctx the parse tree
	 */
	void enterPathEnd(GroovyParser.PathEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#pathEnd}.
	 * @param ctx the parse tree
	 */
	void exitPathEnd(GroovyParser.PathEndContext ctx);
}