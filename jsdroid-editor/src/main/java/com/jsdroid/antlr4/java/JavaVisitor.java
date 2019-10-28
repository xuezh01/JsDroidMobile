// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/java\Java.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.java;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a preParse tree produced
 * by {@link JavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a preParse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitModifier(JavaParser.ModifierContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#variableModifier}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JavaParser.VariableModifierContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JavaParser.TypeParametersContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JavaParser.TypeParameterContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JavaParser.TypeBoundContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JavaParser.EnumDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#enumConstants}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(JavaParser.EnumConstantsContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JavaParser.EnumConstantContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#typeList}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitTypeList(JavaParser.TypeListContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JavaParser.InterfaceBodyContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#memberDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(JavaParser.MemberDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#genericMethodDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#genericConstructorDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#constDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(JavaParser.ConstDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#constantDeclarator}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#variableDeclarators}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JavaParser.ArrayInitializerContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#enumConstantName}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(JavaParser.EnumConstantNameContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#type}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitType(JavaParser.TypeContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JavaParser.TypeArgumentsContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JavaParser.TypeArgumentContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#qualifiedNameList}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(JavaParser.QualifiedNameListContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JavaParser.FormalParametersContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JavaParser.FormalParameterListContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaParser.FormalParameterContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#lastFormalParameter}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(JavaParser.LastFormalParameterContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(JavaParser.ConstructorBodyContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JavaParser.QualifiedNameContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#literal}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JavaParser.AnnotationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#annotationName}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(JavaParser.AnnotationNameContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#elementValuePairs}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(JavaParser.ElementValuePairsContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(JavaParser.ElementValuePairContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitElementValue(JavaParser.ElementValueContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#annotationMethodRest}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#annotationConstantRest}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JavaParser.DefaultValueContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#block}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaParser.BlockContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#statement}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaParser.StatementContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JavaParser.CatchClauseContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitCatchType(JavaParser.CatchTypeContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#finallyBlock}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(JavaParser.FinallyBlockContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#resources}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitResources(JavaParser.ResourcesContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#resource}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitResource(JavaParser.ResourceContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JavaParser.SwitchLabelContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#forControl}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitForControl(JavaParser.ForControlContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitForInit(JavaParser.ForInitContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#enhancedForControl}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(JavaParser.EnhancedForControlContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitForUpdate(JavaParser.ForUpdateContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#parExpression}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitParExpression(JavaParser.ParExpressionContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#expressionList}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JavaParser.ExpressionListContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(JavaParser.StatementExpressionContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(JavaParser.ConstantExpressionContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#expression}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaParser.ExpressionContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#primary}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitPrimary(JavaParser.PrimaryContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#creator}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitCreator(JavaParser.CreatorContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#createdName}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitCreatedName(JavaParser.CreatedNameContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#innerCreator}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(JavaParser.InnerCreatorContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#arrayCreatorRest}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#classCreatorRest}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#explicitGenericInvocation}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#superSuffix}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(JavaParser.SuperSuffixContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a preParse tree produced by {@link JavaParser#arguments}.
	 * @param ctx the preParse tree
	 * @return the visitor result
	 */
	T visitArguments(JavaParser.ArgumentsContext ctx);
}