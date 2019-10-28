// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/java\Java.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.java;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the preParse tree
	 */
	void enterCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the preParse tree
	 */
	void exitCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitTypeDeclaration(JavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the preParse tree
	 */
	void enterModifier(JavaParser.ModifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the preParse tree
	 */
	void exitModifier(JavaParser.ModifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the preParse tree
	 */
	void enterClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the preParse tree
	 */
	void exitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#variableModifier}.
	 * @param ctx the preParse tree
	 */
	void enterVariableModifier(JavaParser.VariableModifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#variableModifier}.
	 * @param ctx the preParse tree
	 */
	void exitVariableModifier(JavaParser.VariableModifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the preParse tree
	 */
	void enterTypeParameters(JavaParser.TypeParametersContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the preParse tree
	 */
	void exitTypeParameters(JavaParser.TypeParametersContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the preParse tree
	 */
	void enterTypeParameter(JavaParser.TypeParameterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the preParse tree
	 */
	void exitTypeParameter(JavaParser.TypeParameterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the preParse tree
	 */
	void enterTypeBound(JavaParser.TypeBoundContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the preParse tree
	 */
	void exitTypeBound(JavaParser.TypeBoundContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterEnumDeclaration(JavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitEnumDeclaration(JavaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#enumConstants}.
	 * @param ctx the preParse tree
	 */
	void enterEnumConstants(JavaParser.EnumConstantsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#enumConstants}.
	 * @param ctx the preParse tree
	 */
	void exitEnumConstants(JavaParser.EnumConstantsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the preParse tree
	 */
	void enterEnumConstant(JavaParser.EnumConstantContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the preParse tree
	 */
	void exitEnumConstant(JavaParser.EnumConstantContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the preParse tree
	 */
	void enterEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the preParse tree
	 */
	void exitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#typeList}.
	 * @param ctx the preParse tree
	 */
	void enterTypeList(JavaParser.TypeListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#typeList}.
	 * @param ctx the preParse tree
	 */
	void exitTypeList(JavaParser.TypeListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the preParse tree
	 */
	void enterClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the preParse tree
	 */
	void exitClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the preParse tree
	 */
	void enterInterfaceBody(JavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the preParse tree
	 */
	void exitInterfaceBody(JavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#memberDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterMemberDeclaration(JavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#memberDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitMemberDeclaration(JavaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#genericMethodDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#genericMethodDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#genericConstructorDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#genericConstructorDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#constDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterConstDeclaration(JavaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#constDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitConstDeclaration(JavaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#constantDeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#constantDeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#variableDeclarators}.
	 * @param ctx the preParse tree
	 */
	void enterVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#variableDeclarators}.
	 * @param ctx the preParse tree
	 */
	void exitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the preParse tree
	 */
	void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the preParse tree
	 */
	void exitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the preParse tree
	 */
	void enterVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the preParse tree
	 */
	void exitVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the preParse tree
	 */
	void enterArrayInitializer(JavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the preParse tree
	 */
	void exitArrayInitializer(JavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#enumConstantName}.
	 * @param ctx the preParse tree
	 */
	void enterEnumConstantName(JavaParser.EnumConstantNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#enumConstantName}.
	 * @param ctx the preParse tree
	 */
	void exitEnumConstantName(JavaParser.EnumConstantNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#type}.
	 * @param ctx the preParse tree
	 */
	void enterType(JavaParser.TypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#type}.
	 * @param ctx the preParse tree
	 */
	void exitType(JavaParser.TypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the preParse tree
	 */
	void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the preParse tree
	 */
	void exitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the preParse tree
	 */
	void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the preParse tree
	 */
	void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the preParse tree
	 */
	void enterTypeArguments(JavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the preParse tree
	 */
	void exitTypeArguments(JavaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the preParse tree
	 */
	void enterTypeArgument(JavaParser.TypeArgumentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the preParse tree
	 */
	void exitTypeArgument(JavaParser.TypeArgumentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#qualifiedNameList}.
	 * @param ctx the preParse tree
	 */
	void enterQualifiedNameList(JavaParser.QualifiedNameListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#qualifiedNameList}.
	 * @param ctx the preParse tree
	 */
	void exitQualifiedNameList(JavaParser.QualifiedNameListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the preParse tree
	 */
	void enterFormalParameters(JavaParser.FormalParametersContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the preParse tree
	 */
	void exitFormalParameters(JavaParser.FormalParametersContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the preParse tree
	 */
	void enterFormalParameterList(JavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the preParse tree
	 */
	void exitFormalParameterList(JavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the preParse tree
	 */
	void enterFormalParameter(JavaParser.FormalParameterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the preParse tree
	 */
	void exitFormalParameter(JavaParser.FormalParameterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#lastFormalParameter}.
	 * @param ctx the preParse tree
	 */
	void enterLastFormalParameter(JavaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#lastFormalParameter}.
	 * @param ctx the preParse tree
	 */
	void exitLastFormalParameter(JavaParser.LastFormalParameterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the preParse tree
	 */
	void enterMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the preParse tree
	 */
	void exitMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the preParse tree
	 */
	void enterConstructorBody(JavaParser.ConstructorBodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the preParse tree
	 */
	void exitConstructorBody(JavaParser.ConstructorBodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the preParse tree
	 */
	void enterQualifiedName(JavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the preParse tree
	 */
	void exitQualifiedName(JavaParser.QualifiedNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#literal}.
	 * @param ctx the preParse tree
	 */
	void enterLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#literal}.
	 * @param ctx the preParse tree
	 */
	void exitLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotation(JavaParser.AnnotationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotation(JavaParser.AnnotationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#annotationName}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationName(JavaParser.AnnotationNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#annotationName}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationName(JavaParser.AnnotationNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#elementValuePairs}.
	 * @param ctx the preParse tree
	 */
	void enterElementValuePairs(JavaParser.ElementValuePairsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#elementValuePairs}.
	 * @param ctx the preParse tree
	 */
	void exitElementValuePairs(JavaParser.ElementValuePairsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the preParse tree
	 */
	void enterElementValuePair(JavaParser.ElementValuePairContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the preParse tree
	 */
	void exitElementValuePair(JavaParser.ElementValuePairContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the preParse tree
	 */
	void enterElementValue(JavaParser.ElementValueContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the preParse tree
	 */
	void exitElementValue(JavaParser.ElementValueContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the preParse tree
	 */
	void enterElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the preParse tree
	 */
	void exitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#annotationMethodRest}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#annotationMethodRest}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#annotationConstantRest}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#annotationConstantRest}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the preParse tree
	 */
	void enterDefaultValue(JavaParser.DefaultValueContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the preParse tree
	 */
	void exitDefaultValue(JavaParser.DefaultValueContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#block}.
	 * @param ctx the preParse tree
	 */
	void enterBlock(JavaParser.BlockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#block}.
	 * @param ctx the preParse tree
	 */
	void exitBlock(JavaParser.BlockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the preParse tree
	 */
	void enterBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the preParse tree
	 */
	void exitBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the preParse tree
	 */
	void enterLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the preParse tree
	 */
	void exitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterStatement(JavaParser.StatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitStatement(JavaParser.StatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the preParse tree
	 */
	void enterCatchClause(JavaParser.CatchClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the preParse tree
	 */
	void exitCatchClause(JavaParser.CatchClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the preParse tree
	 */
	void enterCatchType(JavaParser.CatchTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the preParse tree
	 */
	void exitCatchType(JavaParser.CatchTypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#finallyBlock}.
	 * @param ctx the preParse tree
	 */
	void enterFinallyBlock(JavaParser.FinallyBlockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#finallyBlock}.
	 * @param ctx the preParse tree
	 */
	void exitFinallyBlock(JavaParser.FinallyBlockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterResourceSpecification(JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitResourceSpecification(JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#resources}.
	 * @param ctx the preParse tree
	 */
	void enterResources(JavaParser.ResourcesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#resources}.
	 * @param ctx the preParse tree
	 */
	void exitResources(JavaParser.ResourcesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#resource}.
	 * @param ctx the preParse tree
	 */
	void enterResource(JavaParser.ResourceContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#resource}.
	 * @param ctx the preParse tree
	 */
	void exitResource(JavaParser.ResourceContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the preParse tree
	 */
	void enterSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the preParse tree
	 */
	void exitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the preParse tree
	 */
	void enterSwitchLabel(JavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the preParse tree
	 */
	void exitSwitchLabel(JavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#forControl}.
	 * @param ctx the preParse tree
	 */
	void enterForControl(JavaParser.ForControlContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#forControl}.
	 * @param ctx the preParse tree
	 */
	void exitForControl(JavaParser.ForControlContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the preParse tree
	 */
	void enterForInit(JavaParser.ForInitContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the preParse tree
	 */
	void exitForInit(JavaParser.ForInitContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#enhancedForControl}.
	 * @param ctx the preParse tree
	 */
	void enterEnhancedForControl(JavaParser.EnhancedForControlContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#enhancedForControl}.
	 * @param ctx the preParse tree
	 */
	void exitEnhancedForControl(JavaParser.EnhancedForControlContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the preParse tree
	 */
	void enterForUpdate(JavaParser.ForUpdateContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the preParse tree
	 */
	void exitForUpdate(JavaParser.ForUpdateContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#parExpression}.
	 * @param ctx the preParse tree
	 */
	void enterParExpression(JavaParser.ParExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#parExpression}.
	 * @param ctx the preParse tree
	 */
	void exitParExpression(JavaParser.ParExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#expressionList}.
	 * @param ctx the preParse tree
	 */
	void enterExpressionList(JavaParser.ExpressionListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#expressionList}.
	 * @param ctx the preParse tree
	 */
	void exitExpressionList(JavaParser.ExpressionListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the preParse tree
	 */
	void enterStatementExpression(JavaParser.StatementExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the preParse tree
	 */
	void exitStatementExpression(JavaParser.StatementExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the preParse tree
	 */
	void enterConstantExpression(JavaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the preParse tree
	 */
	void exitConstantExpression(JavaParser.ConstantExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterExpression(JavaParser.ExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitExpression(JavaParser.ExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#primary}.
	 * @param ctx the preParse tree
	 */
	void enterPrimary(JavaParser.PrimaryContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#primary}.
	 * @param ctx the preParse tree
	 */
	void exitPrimary(JavaParser.PrimaryContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#creator}.
	 * @param ctx the preParse tree
	 */
	void enterCreator(JavaParser.CreatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#creator}.
	 * @param ctx the preParse tree
	 */
	void exitCreator(JavaParser.CreatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#createdName}.
	 * @param ctx the preParse tree
	 */
	void enterCreatedName(JavaParser.CreatedNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#createdName}.
	 * @param ctx the preParse tree
	 */
	void exitCreatedName(JavaParser.CreatedNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#innerCreator}.
	 * @param ctx the preParse tree
	 */
	void enterInnerCreator(JavaParser.InnerCreatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#innerCreator}.
	 * @param ctx the preParse tree
	 */
	void exitInnerCreator(JavaParser.InnerCreatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#arrayCreatorRest}.
	 * @param ctx the preParse tree
	 */
	void enterArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#arrayCreatorRest}.
	 * @param ctx the preParse tree
	 */
	void exitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#classCreatorRest}.
	 * @param ctx the preParse tree
	 */
	void enterClassCreatorRest(JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#classCreatorRest}.
	 * @param ctx the preParse tree
	 */
	void exitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#explicitGenericInvocation}.
	 * @param ctx the preParse tree
	 */
	void enterExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#explicitGenericInvocation}.
	 * @param ctx the preParse tree
	 */
	void exitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the preParse tree
	 */
	void enterNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the preParse tree
	 */
	void exitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the preParse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the preParse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the preParse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the preParse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#superSuffix}.
	 * @param ctx the preParse tree
	 */
	void enterSuperSuffix(JavaParser.SuperSuffixContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#superSuffix}.
	 * @param ctx the preParse tree
	 */
	void exitSuperSuffix(JavaParser.SuperSuffixContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the preParse tree
	 */
	void enterExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the preParse tree
	 */
	void exitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a preParse tree produced by {@link JavaParser#arguments}.
	 * @param ctx the preParse tree
	 */
	void enterArguments(JavaParser.ArgumentsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link JavaParser#arguments}.
	 * @param ctx the preParse tree
	 */
	void exitArguments(JavaParser.ArgumentsContext ctx);
}