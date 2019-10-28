// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/c\C.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.c;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link CParser#primaryExpression}.
	 * @param ctx the preParse tree
	 */
	void enterPrimaryExpression(CParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#primaryExpression}.
	 * @param ctx the preParse tree
	 */
	void exitPrimaryExpression(CParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#genericSelection}.
	 * @param ctx the preParse tree
	 */
	void enterGenericSelection(CParser.GenericSelectionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#genericSelection}.
	 * @param ctx the preParse tree
	 */
	void exitGenericSelection(CParser.GenericSelectionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#genericAssocList}.
	 * @param ctx the preParse tree
	 */
	void enterGenericAssocList(CParser.GenericAssocListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#genericAssocList}.
	 * @param ctx the preParse tree
	 */
	void exitGenericAssocList(CParser.GenericAssocListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#genericAssociation}.
	 * @param ctx the preParse tree
	 */
	void enterGenericAssociation(CParser.GenericAssociationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#genericAssociation}.
	 * @param ctx the preParse tree
	 */
	void exitGenericAssociation(CParser.GenericAssociationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#postfixExpression}.
	 * @param ctx the preParse tree
	 */
	void enterPostfixExpression(CParser.PostfixExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#postfixExpression}.
	 * @param ctx the preParse tree
	 */
	void exitPostfixExpression(CParser.PostfixExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#argumentExpressionList}.
	 * @param ctx the preParse tree
	 */
	void enterArgumentExpressionList(CParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#argumentExpressionList}.
	 * @param ctx the preParse tree
	 */
	void exitArgumentExpressionList(CParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#unaryExpression}.
	 * @param ctx the preParse tree
	 */
	void enterUnaryExpression(CParser.UnaryExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#unaryExpression}.
	 * @param ctx the preParse tree
	 */
	void exitUnaryExpression(CParser.UnaryExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#unaryOperator}.
	 * @param ctx the preParse tree
	 */
	void enterUnaryOperator(CParser.UnaryOperatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#unaryOperator}.
	 * @param ctx the preParse tree
	 */
	void exitUnaryOperator(CParser.UnaryOperatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#castExpression}.
	 * @param ctx the preParse tree
	 */
	void enterCastExpression(CParser.CastExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#castExpression}.
	 * @param ctx the preParse tree
	 */
	void exitCastExpression(CParser.CastExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#multiplicativeExpression}.
	 * @param ctx the preParse tree
	 */
	void enterMultiplicativeExpression(CParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#multiplicativeExpression}.
	 * @param ctx the preParse tree
	 */
	void exitMultiplicativeExpression(CParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#additiveExpression}.
	 * @param ctx the preParse tree
	 */
	void enterAdditiveExpression(CParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#additiveExpression}.
	 * @param ctx the preParse tree
	 */
	void exitAdditiveExpression(CParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#shiftExpression}.
	 * @param ctx the preParse tree
	 */
	void enterShiftExpression(CParser.ShiftExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#shiftExpression}.
	 * @param ctx the preParse tree
	 */
	void exitShiftExpression(CParser.ShiftExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#relationalExpression}.
	 * @param ctx the preParse tree
	 */
	void enterRelationalExpression(CParser.RelationalExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#relationalExpression}.
	 * @param ctx the preParse tree
	 */
	void exitRelationalExpression(CParser.RelationalExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#equalityExpression}.
	 * @param ctx the preParse tree
	 */
	void enterEqualityExpression(CParser.EqualityExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#equalityExpression}.
	 * @param ctx the preParse tree
	 */
	void exitEqualityExpression(CParser.EqualityExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#andExpression}.
	 * @param ctx the preParse tree
	 */
	void enterAndExpression(CParser.AndExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#andExpression}.
	 * @param ctx the preParse tree
	 */
	void exitAndExpression(CParser.AndExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#exclusiveOrExpression}.
	 * @param ctx the preParse tree
	 */
	void enterExclusiveOrExpression(CParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#exclusiveOrExpression}.
	 * @param ctx the preParse tree
	 */
	void exitExclusiveOrExpression(CParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#inclusiveOrExpression}.
	 * @param ctx the preParse tree
	 */
	void enterInclusiveOrExpression(CParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#inclusiveOrExpression}.
	 * @param ctx the preParse tree
	 */
	void exitInclusiveOrExpression(CParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#logicalAndExpression}.
	 * @param ctx the preParse tree
	 */
	void enterLogicalAndExpression(CParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#logicalAndExpression}.
	 * @param ctx the preParse tree
	 */
	void exitLogicalAndExpression(CParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#logicalOrExpression}.
	 * @param ctx the preParse tree
	 */
	void enterLogicalOrExpression(CParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#logicalOrExpression}.
	 * @param ctx the preParse tree
	 */
	void exitLogicalOrExpression(CParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the preParse tree
	 */
	void enterConditionalExpression(CParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the preParse tree
	 */
	void exitConditionalExpression(CParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#assignmentExpression}.
	 * @param ctx the preParse tree
	 */
	void enterAssignmentExpression(CParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#assignmentExpression}.
	 * @param ctx the preParse tree
	 */
	void exitAssignmentExpression(CParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#assignmentOperator}.
	 * @param ctx the preParse tree
	 */
	void enterAssignmentOperator(CParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#assignmentOperator}.
	 * @param ctx the preParse tree
	 */
	void exitAssignmentOperator(CParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterExpression(CParser.ExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitExpression(CParser.ExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#constantExpression}.
	 * @param ctx the preParse tree
	 */
	void enterConstantExpression(CParser.ConstantExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#constantExpression}.
	 * @param ctx the preParse tree
	 */
	void exitConstantExpression(CParser.ConstantExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#declaration}.
	 * @param ctx the preParse tree
	 */
	void enterDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#declaration}.
	 * @param ctx the preParse tree
	 */
	void exitDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#declarationSpecifiers}.
	 * @param ctx the preParse tree
	 */
	void enterDeclarationSpecifiers(CParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#declarationSpecifiers}.
	 * @param ctx the preParse tree
	 */
	void exitDeclarationSpecifiers(CParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#declarationSpecifiers2}.
	 * @param ctx the preParse tree
	 */
	void enterDeclarationSpecifiers2(CParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#declarationSpecifiers2}.
	 * @param ctx the preParse tree
	 */
	void exitDeclarationSpecifiers2(CParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#declarationSpecifier}.
	 * @param ctx the preParse tree
	 */
	void enterDeclarationSpecifier(CParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#declarationSpecifier}.
	 * @param ctx the preParse tree
	 */
	void exitDeclarationSpecifier(CParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#initDeclaratorList}.
	 * @param ctx the preParse tree
	 */
	void enterInitDeclaratorList(CParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#initDeclaratorList}.
	 * @param ctx the preParse tree
	 */
	void exitInitDeclaratorList(CParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#initDeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterInitDeclarator(CParser.InitDeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#initDeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitInitDeclarator(CParser.InitDeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#storageClassSpecifier}.
	 * @param ctx the preParse tree
	 */
	void enterStorageClassSpecifier(CParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#storageClassSpecifier}.
	 * @param ctx the preParse tree
	 */
	void exitStorageClassSpecifier(CParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#typeSpecifier}.
	 * @param ctx the preParse tree
	 */
	void enterTypeSpecifier(CParser.TypeSpecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#typeSpecifier}.
	 * @param ctx the preParse tree
	 */
	void exitTypeSpecifier(CParser.TypeSpecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#structOrUnionSpecifier}.
	 * @param ctx the preParse tree
	 */
	void enterStructOrUnionSpecifier(CParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#structOrUnionSpecifier}.
	 * @param ctx the preParse tree
	 */
	void exitStructOrUnionSpecifier(CParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#structOrUnion}.
	 * @param ctx the preParse tree
	 */
	void enterStructOrUnion(CParser.StructOrUnionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#structOrUnion}.
	 * @param ctx the preParse tree
	 */
	void exitStructOrUnion(CParser.StructOrUnionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#structDeclarationList}.
	 * @param ctx the preParse tree
	 */
	void enterStructDeclarationList(CParser.StructDeclarationListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#structDeclarationList}.
	 * @param ctx the preParse tree
	 */
	void exitStructDeclarationList(CParser.StructDeclarationListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#structDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterStructDeclaration(CParser.StructDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#structDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitStructDeclaration(CParser.StructDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#specifierQualifierList}.
	 * @param ctx the preParse tree
	 */
	void enterSpecifierQualifierList(CParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#specifierQualifierList}.
	 * @param ctx the preParse tree
	 */
	void exitSpecifierQualifierList(CParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#structDeclaratorList}.
	 * @param ctx the preParse tree
	 */
	void enterStructDeclaratorList(CParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#structDeclaratorList}.
	 * @param ctx the preParse tree
	 */
	void exitStructDeclaratorList(CParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#structDeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterStructDeclarator(CParser.StructDeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#structDeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitStructDeclarator(CParser.StructDeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#enumSpecifier}.
	 * @param ctx the preParse tree
	 */
	void enterEnumSpecifier(CParser.EnumSpecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#enumSpecifier}.
	 * @param ctx the preParse tree
	 */
	void exitEnumSpecifier(CParser.EnumSpecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#enumeratorList}.
	 * @param ctx the preParse tree
	 */
	void enterEnumeratorList(CParser.EnumeratorListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#enumeratorList}.
	 * @param ctx the preParse tree
	 */
	void exitEnumeratorList(CParser.EnumeratorListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#enumerator}.
	 * @param ctx the preParse tree
	 */
	void enterEnumerator(CParser.EnumeratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#enumerator}.
	 * @param ctx the preParse tree
	 */
	void exitEnumerator(CParser.EnumeratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#enumerationConstant}.
	 * @param ctx the preParse tree
	 */
	void enterEnumerationConstant(CParser.EnumerationConstantContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#enumerationConstant}.
	 * @param ctx the preParse tree
	 */
	void exitEnumerationConstant(CParser.EnumerationConstantContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#atomicTypeSpecifier}.
	 * @param ctx the preParse tree
	 */
	void enterAtomicTypeSpecifier(CParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#atomicTypeSpecifier}.
	 * @param ctx the preParse tree
	 */
	void exitAtomicTypeSpecifier(CParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#typeQualifier}.
	 * @param ctx the preParse tree
	 */
	void enterTypeQualifier(CParser.TypeQualifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#typeQualifier}.
	 * @param ctx the preParse tree
	 */
	void exitTypeQualifier(CParser.TypeQualifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#functionSpecifier}.
	 * @param ctx the preParse tree
	 */
	void enterFunctionSpecifier(CParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#functionSpecifier}.
	 * @param ctx the preParse tree
	 */
	void exitFunctionSpecifier(CParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#alignmentSpecifier}.
	 * @param ctx the preParse tree
	 */
	void enterAlignmentSpecifier(CParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#alignmentSpecifier}.
	 * @param ctx the preParse tree
	 */
	void exitAlignmentSpecifier(CParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#declarator}.
	 * @param ctx the preParse tree
	 */
	void enterDeclarator(CParser.DeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#declarator}.
	 * @param ctx the preParse tree
	 */
	void exitDeclarator(CParser.DeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#directDeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterDirectDeclarator(CParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#directDeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitDirectDeclarator(CParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#gccDeclaratorExtension}.
	 * @param ctx the preParse tree
	 */
	void enterGccDeclaratorExtension(CParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#gccDeclaratorExtension}.
	 * @param ctx the preParse tree
	 */
	void exitGccDeclaratorExtension(CParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#gccAttributeSpecifier}.
	 * @param ctx the preParse tree
	 */
	void enterGccAttributeSpecifier(CParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#gccAttributeSpecifier}.
	 * @param ctx the preParse tree
	 */
	void exitGccAttributeSpecifier(CParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#gccAttributeList}.
	 * @param ctx the preParse tree
	 */
	void enterGccAttributeList(CParser.GccAttributeListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#gccAttributeList}.
	 * @param ctx the preParse tree
	 */
	void exitGccAttributeList(CParser.GccAttributeListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#gccAttribute}.
	 * @param ctx the preParse tree
	 */
	void enterGccAttribute(CParser.GccAttributeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#gccAttribute}.
	 * @param ctx the preParse tree
	 */
	void exitGccAttribute(CParser.GccAttributeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#nestedParenthesesBlock}.
	 * @param ctx the preParse tree
	 */
	void enterNestedParenthesesBlock(CParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#nestedParenthesesBlock}.
	 * @param ctx the preParse tree
	 */
	void exitNestedParenthesesBlock(CParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#pointer}.
	 * @param ctx the preParse tree
	 */
	void enterPointer(CParser.PointerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#pointer}.
	 * @param ctx the preParse tree
	 */
	void exitPointer(CParser.PointerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#typeQualifierList}.
	 * @param ctx the preParse tree
	 */
	void enterTypeQualifierList(CParser.TypeQualifierListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#typeQualifierList}.
	 * @param ctx the preParse tree
	 */
	void exitTypeQualifierList(CParser.TypeQualifierListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#parameterTypeList}.
	 * @param ctx the preParse tree
	 */
	void enterParameterTypeList(CParser.ParameterTypeListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#parameterTypeList}.
	 * @param ctx the preParse tree
	 */
	void exitParameterTypeList(CParser.ParameterTypeListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#parameterList}.
	 * @param ctx the preParse tree
	 */
	void enterParameterList(CParser.ParameterListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#parameterList}.
	 * @param ctx the preParse tree
	 */
	void exitParameterList(CParser.ParameterListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#parameterDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterParameterDeclaration(CParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#parameterDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitParameterDeclaration(CParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#identifierList}.
	 * @param ctx the preParse tree
	 */
	void enterIdentifierList(CParser.IdentifierListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#identifierList}.
	 * @param ctx the preParse tree
	 */
	void exitIdentifierList(CParser.IdentifierListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#typeName}.
	 * @param ctx the preParse tree
	 */
	void enterTypeName(CParser.TypeNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#typeName}.
	 * @param ctx the preParse tree
	 */
	void exitTypeName(CParser.TypeNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#abstractDeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterAbstractDeclarator(CParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#abstractDeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitAbstractDeclarator(CParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#directAbstractDeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterDirectAbstractDeclarator(CParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#directAbstractDeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitDirectAbstractDeclarator(CParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#typedefName}.
	 * @param ctx the preParse tree
	 */
	void enterTypedefName(CParser.TypedefNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#typedefName}.
	 * @param ctx the preParse tree
	 */
	void exitTypedefName(CParser.TypedefNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#initializer}.
	 * @param ctx the preParse tree
	 */
	void enterInitializer(CParser.InitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#initializer}.
	 * @param ctx the preParse tree
	 */
	void exitInitializer(CParser.InitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#initializerList}.
	 * @param ctx the preParse tree
	 */
	void enterInitializerList(CParser.InitializerListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#initializerList}.
	 * @param ctx the preParse tree
	 */
	void exitInitializerList(CParser.InitializerListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#designation}.
	 * @param ctx the preParse tree
	 */
	void enterDesignation(CParser.DesignationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#designation}.
	 * @param ctx the preParse tree
	 */
	void exitDesignation(CParser.DesignationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#designatorList}.
	 * @param ctx the preParse tree
	 */
	void enterDesignatorList(CParser.DesignatorListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#designatorList}.
	 * @param ctx the preParse tree
	 */
	void exitDesignatorList(CParser.DesignatorListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#designator}.
	 * @param ctx the preParse tree
	 */
	void enterDesignator(CParser.DesignatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#designator}.
	 * @param ctx the preParse tree
	 */
	void exitDesignator(CParser.DesignatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#staticAssertDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterStaticAssertDeclaration(CParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#staticAssertDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitStaticAssertDeclaration(CParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterStatement(CParser.StatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitStatement(CParser.StatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#labeledStatement}.
	 * @param ctx the preParse tree
	 */
	void enterLabeledStatement(CParser.LabeledStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#labeledStatement}.
	 * @param ctx the preParse tree
	 */
	void exitLabeledStatement(CParser.LabeledStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the preParse tree
	 */
	void enterCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the preParse tree
	 */
	void exitCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#blockItemList}.
	 * @param ctx the preParse tree
	 */
	void enterBlockItemList(CParser.BlockItemListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#blockItemList}.
	 * @param ctx the preParse tree
	 */
	void exitBlockItemList(CParser.BlockItemListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#blockItem}.
	 * @param ctx the preParse tree
	 */
	void enterBlockItem(CParser.BlockItemContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#blockItem}.
	 * @param ctx the preParse tree
	 */
	void exitBlockItem(CParser.BlockItemContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the preParse tree
	 */
	void enterExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the preParse tree
	 */
	void exitExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#selectionStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSelectionStatement(CParser.SelectionStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#selectionStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSelectionStatement(CParser.SelectionStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#iterationStatement}.
	 * @param ctx the preParse tree
	 */
	void enterIterationStatement(CParser.IterationStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#iterationStatement}.
	 * @param ctx the preParse tree
	 */
	void exitIterationStatement(CParser.IterationStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#jumpStatement}.
	 * @param ctx the preParse tree
	 */
	void enterJumpStatement(CParser.JumpStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#jumpStatement}.
	 * @param ctx the preParse tree
	 */
	void exitJumpStatement(CParser.JumpStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the preParse tree
	 */
	void enterCompilationUnit(CParser.CompilationUnitContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the preParse tree
	 */
	void exitCompilationUnit(CParser.CompilationUnitContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#translationUnit}.
	 * @param ctx the preParse tree
	 */
	void enterTranslationUnit(CParser.TranslationUnitContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#translationUnit}.
	 * @param ctx the preParse tree
	 */
	void exitTranslationUnit(CParser.TranslationUnitContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#externalDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterExternalDeclaration(CParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#externalDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitExternalDeclaration(CParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#functionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterFunctionDefinition(CParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#functionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitFunctionDefinition(CParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CParser#declarationList}.
	 * @param ctx the preParse tree
	 */
	void enterDeclarationList(CParser.DeclarationListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CParser#declarationList}.
	 * @param ctx the preParse tree
	 */
	void exitDeclarationList(CParser.DeclarationListContext ctx);
}