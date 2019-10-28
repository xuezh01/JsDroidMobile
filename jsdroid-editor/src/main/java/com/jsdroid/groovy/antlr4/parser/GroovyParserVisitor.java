// Generated from D:/project/jsdroid/idea/JsDroidMobile/jsdroid-editor/src/main/antlr\GroovyParser.g4 by ANTLR 4.7.2

package com.jsdroid.groovy.antlr4.parser;
    import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GroovyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GroovyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GroovyParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(GroovyParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(GroovyParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(GroovyParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(GroovyParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(GroovyParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(GroovyParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#modifiersOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiersOpt(GroovyParser.ModifiersOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(GroovyParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classOrInterfaceModifiersOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifiersOpt(GroovyParser.ClassOrInterfaceModifiersOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifiers(GroovyParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(GroovyParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(GroovyParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#variableModifiersOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifiersOpt(GroovyParser.VariableModifiersOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#variableModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifiers(GroovyParser.VariableModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(GroovyParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(GroovyParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(GroovyParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(GroovyParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(GroovyParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(GroovyParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(GroovyParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(GroovyParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(GroovyParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(GroovyParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(GroovyParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(GroovyParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(GroovyParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(GroovyParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(GroovyParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(GroovyParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(GroovyParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(GroovyParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#variableInitializers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializers(GroovyParser.VariableInitializersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(GroovyParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#dimsOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimsOpt(GroovyParser.DimsOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#standardType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardType(GroovyParser.StandardTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GroovyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(GroovyParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#generalClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralClassOrInterfaceType(GroovyParser.GeneralClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#standardClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardClassOrInterfaceType(GroovyParser.StandardClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(GroovyParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(GroovyParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(GroovyParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#annotatedQualifiedClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedQualifiedClassName(GroovyParser.AnnotatedQualifiedClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#qualifiedClassNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedClassNameList(GroovyParser.QualifiedClassNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(GroovyParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(GroovyParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#thisFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisFormalParameter(GroovyParser.ThisFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(GroovyParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(GroovyParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(GroovyParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#qualifiedNameElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameElement(GroovyParser.QualifiedNameElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#qualifiedNameElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameElements(GroovyParser.QualifiedNameElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#qualifiedClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedClassName(GroovyParser.QualifiedClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#qualifiedStandardClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedStandardClassName(GroovyParser.QualifiedStandardClassNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteralAlt(GroovyParser.IntegerLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatingPointLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointLiteralAlt(GroovyParser.FloatingPointLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralAlt(GroovyParser.StringLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralAlt(GroovyParser.BooleanLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteralAlt}
	 * labeled alternative in {@link GroovyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteralAlt(GroovyParser.NullLiteralAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#gstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGstring(GroovyParser.GstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#gstringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGstringValue(GroovyParser.GstringValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#gstringPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGstringPath(GroovyParser.GstringPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(GroovyParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#standardLambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardLambdaExpression(GroovyParser.StandardLambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(GroovyParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#standardLambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardLambdaParameters(GroovyParser.StandardLambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(GroovyParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#closure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure(GroovyParser.ClosureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#closureOrLambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosureOrLambdaExpression(GroovyParser.ClosureOrLambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#blockStatementsOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatementsOpt(GroovyParser.BlockStatementsOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(GroovyParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#annotationsOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationsOpt(GroovyParser.AnnotationsOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(GroovyParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#elementValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValues(GroovyParser.ElementValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(GroovyParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(GroovyParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(GroovyParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#elementValuePairName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairName(GroovyParser.ElementValuePairNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(GroovyParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(GroovyParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GroovyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(GroovyParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(GroovyParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classifiedModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassifiedModifiers(GroovyParser.ClassifiedModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GroovyParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#typeNamePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNamePairs(GroovyParser.TypeNamePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#typeNamePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNamePair(GroovyParser.TypeNamePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#variableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableNames(GroovyParser.VariableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(GroovyParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(GroovyParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(GroovyParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmtAlt}
	 * labeled alternative in {@link GroovyParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmtAlt(GroovyParser.ForStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmtAlt}
	 * labeled alternative in {@link GroovyParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmtAlt(GroovyParser.WhileStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileStmtAlt}
	 * labeled alternative in {@link GroovyParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmtAlt(GroovyParser.DoWhileStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(GroovyParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(GroovyParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(GroovyParser.TryCatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(GroovyParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmtAlt(GroovyParser.BlockStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStmtAlt(GroovyParser.ConditionalStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStmtAlt(GroovyParser.LoopStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tryCatchStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStmtAlt(GroovyParser.TryCatchStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code synchronizedStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStmtAlt(GroovyParser.SynchronizedStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmtAlt(GroovyParser.ReturnStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code throwStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStmtAlt(GroovyParser.ThrowStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmtAlt(GroovyParser.BreakStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmtAlt(GroovyParser.ContinueStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labeledStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStmtAlt(GroovyParser.LabeledStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmtAlt(GroovyParser.ImportStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assertStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStmtAlt(GroovyParser.AssertStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDeclarationStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclarationStmtAlt(GroovyParser.TypeDeclarationStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localVariableDeclarationStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStmtAlt(GroovyParser.LocalVariableDeclarationStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDeclarationStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarationStmtAlt(GroovyParser.MethodDeclarationStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmtAlt(GroovyParser.ExpressionStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStmtAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmtAlt(GroovyParser.EmptyStmtAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errorAlt}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorAlt(GroovyParser.ErrorAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(GroovyParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(GroovyParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(GroovyParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(GroovyParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(GroovyParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(GroovyParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(GroovyParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(GroovyParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(GroovyParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(GroovyParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classicalForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassicalForControl(GroovyParser.ClassicalForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(GroovyParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(GroovyParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#castParExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastParExpression(GroovyParser.CastParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(GroovyParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#expressionInPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInPar(GroovyParser.ExpressionInParContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(GroovyParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#expressionListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionListElement(GroovyParser.ExpressionListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#enhancedStatementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedStatementExpression(GroovyParser.EnhancedStatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandExprAlt}
	 * labeled alternative in {@link GroovyParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandExprAlt(GroovyParser.CommandExprAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(GroovyParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExprAlt(GroovyParser.ShiftExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleAssignmentExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleAssignmentExprAlt(GroovyParser.MultipleAssignmentExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionUnaryNotExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionUnaryNotExprAlt(GroovyParser.ExpressionUnaryNotExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionCastExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionCastExprAlt(GroovyParser.ExpressionCastExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionPostfixExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPostfixExprAlt(GroovyParser.ExpressionPostfixExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclusiveOrExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExprAlt(GroovyParser.ExclusiveOrExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExprAlt(GroovyParser.AdditiveExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexExprAlt(GroovyParser.RegexExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExprAlt(GroovyParser.ConditionalExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExprAlt(GroovyParser.PowerExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExprAlt(GroovyParser.RelationalExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExprAlt(GroovyParser.LogicalAndExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExprAlt(GroovyParser.AssignmentExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExprAlt(GroovyParser.MultiplicativeExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inclusiveOrExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExprAlt(GroovyParser.InclusiveOrExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionUnaryAddExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionUnaryAddExprAlt(GroovyParser.ExpressionUnaryAddExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExprAlt(GroovyParser.LogicalOrExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExprAlt(GroovyParser.EqualityExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExprAlt}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExprAlt(GroovyParser.AndExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExprAlt(GroovyParser.CastExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExprAlt(GroovyParser.PostfixExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryNotExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNotExprAlt(GroovyParser.UnaryNotExprAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryAddExprAlt}
	 * labeled alternative in {@link GroovyParser#castOperandExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryAddExprAlt(GroovyParser.UnaryAddExprAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#commandExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandExpression(GroovyParser.CommandExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#commandArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandArgument(GroovyParser.CommandArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#pathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathExpression(GroovyParser.PathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#pathElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathElement(GroovyParser.PathElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#namePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamePart(GroovyParser.NamePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#dynamicMemberName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicMemberName(GroovyParser.DynamicMemberNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#indexPropertyArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexPropertyArgs(GroovyParser.IndexPropertyArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#namedPropertyArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedPropertyArgs(GroovyParser.NamedPropertyArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPrmrAlt(GroovyParser.IdentifierPrmrAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralPrmrAlt(GroovyParser.LiteralPrmrAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gstringPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGstringPrmrAlt(GroovyParser.GstringPrmrAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewPrmrAlt(GroovyParser.NewPrmrAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisPrmrAlt(GroovyParser.ThisPrmrAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperPrmrAlt(GroovyParser.SuperPrmrAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenPrmrAlt(GroovyParser.ParenPrmrAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code closureOrLambdaExpressionPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosureOrLambdaExpressionPrmrAlt(GroovyParser.ClosureOrLambdaExpressionPrmrAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPrmrAlt(GroovyParser.ListPrmrAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapPrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapPrmrAlt(GroovyParser.MapPrmrAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code builtInTypePrmrAlt}
	 * labeled alternative in {@link GroovyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInTypePrmrAlt(GroovyParser.BuiltInTypePrmrAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(GroovyParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(GroovyParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#mapEntryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntryList(GroovyParser.MapEntryListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#mapEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntry(GroovyParser.MapEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#mapEntryLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntryLabel(GroovyParser.MapEntryLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(GroovyParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(GroovyParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#anonymousInnerClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousInnerClassDeclaration(GroovyParser.AnonymousInnerClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(GroovyParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(GroovyParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(GroovyParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GroovyParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(GroovyParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#enhancedArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedArgumentList(GroovyParser.EnhancedArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#argumentListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentListElement(GroovyParser.ArgumentListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#enhancedArgumentListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedArgumentListElement(GroovyParser.EnhancedArgumentListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(GroovyParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(GroovyParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GroovyParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#builtInType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInType(GroovyParser.BuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywords(GroovyParser.KeywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#rparen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRparen(GroovyParser.RparenContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#nls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNls(GroovyParser.NlsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(GroovyParser.SepContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(GroovyParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#constructorTip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorTip(GroovyParser.ConstructorTipContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classTip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTip(GroovyParser.ClassTipContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#methodOrFieldTip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodOrFieldTip(GroovyParser.MethodOrFieldTipContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#variableTip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTip(GroovyParser.VariableTipContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#pathEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathEnd(GroovyParser.PathEndContext ctx);
}