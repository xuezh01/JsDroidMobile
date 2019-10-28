// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/csharp\CSharpParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.csharp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link CSharpParser}.
 */
public interface CSharpParserListener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#compilation_unit}.
	 * @param ctx the preParse tree
	 */
	void enterCompilation_unit(CSharpParser.Compilation_unitContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#compilation_unit}.
	 * @param ctx the preParse tree
	 */
	void exitCompilation_unit(CSharpParser.Compilation_unitContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#namespace_or_type_name}.
	 * @param ctx the preParse tree
	 */
	void enterNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#namespace_or_type_name}.
	 * @param ctx the preParse tree
	 */
	void exitNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#type}.
	 * @param ctx the preParse tree
	 */
	void enterType(CSharpParser.TypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#type}.
	 * @param ctx the preParse tree
	 */
	void exitType(CSharpParser.TypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#base_type}.
	 * @param ctx the preParse tree
	 */
	void enterBase_type(CSharpParser.Base_typeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#base_type}.
	 * @param ctx the preParse tree
	 */
	void exitBase_type(CSharpParser.Base_typeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#simple_type}.
	 * @param ctx the preParse tree
	 */
	void enterSimple_type(CSharpParser.Simple_typeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#simple_type}.
	 * @param ctx the preParse tree
	 */
	void exitSimple_type(CSharpParser.Simple_typeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#numeric_type}.
	 * @param ctx the preParse tree
	 */
	void enterNumeric_type(CSharpParser.Numeric_typeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#numeric_type}.
	 * @param ctx the preParse tree
	 */
	void exitNumeric_type(CSharpParser.Numeric_typeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#integral_type}.
	 * @param ctx the preParse tree
	 */
	void enterIntegral_type(CSharpParser.Integral_typeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#integral_type}.
	 * @param ctx the preParse tree
	 */
	void exitIntegral_type(CSharpParser.Integral_typeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#floating_point_type}.
	 * @param ctx the preParse tree
	 */
	void enterFloating_point_type(CSharpParser.Floating_point_typeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#floating_point_type}.
	 * @param ctx the preParse tree
	 */
	void exitFloating_point_type(CSharpParser.Floating_point_typeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#class_type}.
	 * @param ctx the preParse tree
	 */
	void enterClass_type(CSharpParser.Class_typeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#class_type}.
	 * @param ctx the preParse tree
	 */
	void exitClass_type(CSharpParser.Class_typeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#type_argument_list}.
	 * @param ctx the preParse tree
	 */
	void enterType_argument_list(CSharpParser.Type_argument_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#type_argument_list}.
	 * @param ctx the preParse tree
	 */
	void exitType_argument_list(CSharpParser.Type_argument_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#argument_list}.
	 * @param ctx the preParse tree
	 */
	void enterArgument_list(CSharpParser.Argument_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#argument_list}.
	 * @param ctx the preParse tree
	 */
	void exitArgument_list(CSharpParser.Argument_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#argument}.
	 * @param ctx the preParse tree
	 */
	void enterArgument(CSharpParser.ArgumentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#argument}.
	 * @param ctx the preParse tree
	 */
	void exitArgument(CSharpParser.ArgumentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterExpression(CSharpParser.ExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitExpression(CSharpParser.ExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#non_assignment_expression}.
	 * @param ctx the preParse tree
	 */
	void enterNon_assignment_expression(CSharpParser.Non_assignment_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#non_assignment_expression}.
	 * @param ctx the preParse tree
	 */
	void exitNon_assignment_expression(CSharpParser.Non_assignment_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#assignment}.
	 * @param ctx the preParse tree
	 */
	void enterAssignment(CSharpParser.AssignmentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#assignment}.
	 * @param ctx the preParse tree
	 */
	void exitAssignment(CSharpParser.AssignmentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#assignment_operator}.
	 * @param ctx the preParse tree
	 */
	void enterAssignment_operator(CSharpParser.Assignment_operatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#assignment_operator}.
	 * @param ctx the preParse tree
	 */
	void exitAssignment_operator(CSharpParser.Assignment_operatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#conditional_expression}.
	 * @param ctx the preParse tree
	 */
	void enterConditional_expression(CSharpParser.Conditional_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#conditional_expression}.
	 * @param ctx the preParse tree
	 */
	void exitConditional_expression(CSharpParser.Conditional_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#null_coalescing_expression}.
	 * @param ctx the preParse tree
	 */
	void enterNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#null_coalescing_expression}.
	 * @param ctx the preParse tree
	 */
	void exitNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#conditional_or_expression}.
	 * @param ctx the preParse tree
	 */
	void enterConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#conditional_or_expression}.
	 * @param ctx the preParse tree
	 */
	void exitConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#conditional_and_expression}.
	 * @param ctx the preParse tree
	 */
	void enterConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#conditional_and_expression}.
	 * @param ctx the preParse tree
	 */
	void exitConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#inclusive_or_expression}.
	 * @param ctx the preParse tree
	 */
	void enterInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#inclusive_or_expression}.
	 * @param ctx the preParse tree
	 */
	void exitInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#exclusive_or_expression}.
	 * @param ctx the preParse tree
	 */
	void enterExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#exclusive_or_expression}.
	 * @param ctx the preParse tree
	 */
	void exitExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#and_expression}.
	 * @param ctx the preParse tree
	 */
	void enterAnd_expression(CSharpParser.And_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#and_expression}.
	 * @param ctx the preParse tree
	 */
	void exitAnd_expression(CSharpParser.And_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#equality_expression}.
	 * @param ctx the preParse tree
	 */
	void enterEquality_expression(CSharpParser.Equality_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#equality_expression}.
	 * @param ctx the preParse tree
	 */
	void exitEquality_expression(CSharpParser.Equality_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#relational_expression}.
	 * @param ctx the preParse tree
	 */
	void enterRelational_expression(CSharpParser.Relational_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#relational_expression}.
	 * @param ctx the preParse tree
	 */
	void exitRelational_expression(CSharpParser.Relational_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#shift_expression}.
	 * @param ctx the preParse tree
	 */
	void enterShift_expression(CSharpParser.Shift_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#shift_expression}.
	 * @param ctx the preParse tree
	 */
	void exitShift_expression(CSharpParser.Shift_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#additive_expression}.
	 * @param ctx the preParse tree
	 */
	void enterAdditive_expression(CSharpParser.Additive_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#additive_expression}.
	 * @param ctx the preParse tree
	 */
	void exitAdditive_expression(CSharpParser.Additive_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#multiplicative_expression}.
	 * @param ctx the preParse tree
	 */
	void enterMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#multiplicative_expression}.
	 * @param ctx the preParse tree
	 */
	void exitMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#unary_expression}.
	 * @param ctx the preParse tree
	 */
	void enterUnary_expression(CSharpParser.Unary_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#unary_expression}.
	 * @param ctx the preParse tree
	 */
	void exitUnary_expression(CSharpParser.Unary_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#primary_expression}.
	 * @param ctx the preParse tree
	 */
	void enterPrimary_expression(CSharpParser.Primary_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#primary_expression}.
	 * @param ctx the preParse tree
	 */
	void exitPrimary_expression(CSharpParser.Primary_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterLiteralExpression(CSharpParser.LiteralExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitLiteralExpression(CSharpParser.LiteralExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code simpleNameExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterSimpleNameExpression(CSharpParser.SimpleNameExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code simpleNameExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitSimpleNameExpression(CSharpParser.SimpleNameExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code parenthesisExpressions}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterParenthesisExpressions(CSharpParser.ParenthesisExpressionsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code parenthesisExpressions}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitParenthesisExpressions(CSharpParser.ParenthesisExpressionsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterMemberAccessExpression(CSharpParser.MemberAccessExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitMemberAccessExpression(CSharpParser.MemberAccessExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code literalAccessExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterLiteralAccessExpression(CSharpParser.LiteralAccessExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code literalAccessExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitLiteralAccessExpression(CSharpParser.LiteralAccessExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code thisReferenceExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterThisReferenceExpression(CSharpParser.ThisReferenceExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code thisReferenceExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitThisReferenceExpression(CSharpParser.ThisReferenceExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code baseAccessExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterBaseAccessExpression(CSharpParser.BaseAccessExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code baseAccessExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitBaseAccessExpression(CSharpParser.BaseAccessExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code objectCreationExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterObjectCreationExpression(CSharpParser.ObjectCreationExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code objectCreationExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitObjectCreationExpression(CSharpParser.ObjectCreationExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code typeofExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterTypeofExpression(CSharpParser.TypeofExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code typeofExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitTypeofExpression(CSharpParser.TypeofExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code checkedExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterCheckedExpression(CSharpParser.CheckedExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code checkedExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitCheckedExpression(CSharpParser.CheckedExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code uncheckedExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterUncheckedExpression(CSharpParser.UncheckedExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code uncheckedExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitUncheckedExpression(CSharpParser.UncheckedExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code defaultValueExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterDefaultValueExpression(CSharpParser.DefaultValueExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code defaultValueExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitDefaultValueExpression(CSharpParser.DefaultValueExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code anonymousMethodExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterAnonymousMethodExpression(CSharpParser.AnonymousMethodExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code anonymousMethodExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitAnonymousMethodExpression(CSharpParser.AnonymousMethodExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code sizeofExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterSizeofExpression(CSharpParser.SizeofExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code sizeofExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitSizeofExpression(CSharpParser.SizeofExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code nameofExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void enterNameofExpression(CSharpParser.NameofExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code nameofExpression}
	 * labeled alternative in {@link CSharpParser#primary_expression_start}.
	 * @param ctx the preParse tree
	 */
	void exitNameofExpression(CSharpParser.NameofExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#member_access}.
	 * @param ctx the preParse tree
	 */
	void enterMember_access(CSharpParser.Member_accessContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#member_access}.
	 * @param ctx the preParse tree
	 */
	void exitMember_access(CSharpParser.Member_accessContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#bracket_expression}.
	 * @param ctx the preParse tree
	 */
	void enterBracket_expression(CSharpParser.Bracket_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#bracket_expression}.
	 * @param ctx the preParse tree
	 */
	void exitBracket_expression(CSharpParser.Bracket_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#indexer_argument}.
	 * @param ctx the preParse tree
	 */
	void enterIndexer_argument(CSharpParser.Indexer_argumentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#indexer_argument}.
	 * @param ctx the preParse tree
	 */
	void exitIndexer_argument(CSharpParser.Indexer_argumentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#predefined_type}.
	 * @param ctx the preParse tree
	 */
	void enterPredefined_type(CSharpParser.Predefined_typeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#predefined_type}.
	 * @param ctx the preParse tree
	 */
	void exitPredefined_type(CSharpParser.Predefined_typeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#expression_list}.
	 * @param ctx the preParse tree
	 */
	void enterExpression_list(CSharpParser.Expression_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#expression_list}.
	 * @param ctx the preParse tree
	 */
	void exitExpression_list(CSharpParser.Expression_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#object_or_collection_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterObject_or_collection_initializer(CSharpParser.Object_or_collection_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#object_or_collection_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitObject_or_collection_initializer(CSharpParser.Object_or_collection_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#object_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterObject_initializer(CSharpParser.Object_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#object_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitObject_initializer(CSharpParser.Object_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#member_initializer_list}.
	 * @param ctx the preParse tree
	 */
	void enterMember_initializer_list(CSharpParser.Member_initializer_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#member_initializer_list}.
	 * @param ctx the preParse tree
	 */
	void exitMember_initializer_list(CSharpParser.Member_initializer_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#member_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterMember_initializer(CSharpParser.Member_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#member_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitMember_initializer(CSharpParser.Member_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#initializer_value}.
	 * @param ctx the preParse tree
	 */
	void enterInitializer_value(CSharpParser.Initializer_valueContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#initializer_value}.
	 * @param ctx the preParse tree
	 */
	void exitInitializer_value(CSharpParser.Initializer_valueContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#collection_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterCollection_initializer(CSharpParser.Collection_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#collection_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitCollection_initializer(CSharpParser.Collection_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#element_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterElement_initializer(CSharpParser.Element_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#element_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitElement_initializer(CSharpParser.Element_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#anonymous_object_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterAnonymous_object_initializer(CSharpParser.Anonymous_object_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#anonymous_object_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitAnonymous_object_initializer(CSharpParser.Anonymous_object_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#member_declarator_list}.
	 * @param ctx the preParse tree
	 */
	void enterMember_declarator_list(CSharpParser.Member_declarator_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#member_declarator_list}.
	 * @param ctx the preParse tree
	 */
	void exitMember_declarator_list(CSharpParser.Member_declarator_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#member_declarator}.
	 * @param ctx the preParse tree
	 */
	void enterMember_declarator(CSharpParser.Member_declaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#member_declarator}.
	 * @param ctx the preParse tree
	 */
	void exitMember_declarator(CSharpParser.Member_declaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#unbound_type_name}.
	 * @param ctx the preParse tree
	 */
	void enterUnbound_type_name(CSharpParser.Unbound_type_nameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#unbound_type_name}.
	 * @param ctx the preParse tree
	 */
	void exitUnbound_type_name(CSharpParser.Unbound_type_nameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#generic_dimension_specifier}.
	 * @param ctx the preParse tree
	 */
	void enterGeneric_dimension_specifier(CSharpParser.Generic_dimension_specifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#generic_dimension_specifier}.
	 * @param ctx the preParse tree
	 */
	void exitGeneric_dimension_specifier(CSharpParser.Generic_dimension_specifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#isType}.
	 * @param ctx the preParse tree
	 */
	void enterIsType(CSharpParser.IsTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#isType}.
	 * @param ctx the preParse tree
	 */
	void exitIsType(CSharpParser.IsTypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#lambda_expression}.
	 * @param ctx the preParse tree
	 */
	void enterLambda_expression(CSharpParser.Lambda_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#lambda_expression}.
	 * @param ctx the preParse tree
	 */
	void exitLambda_expression(CSharpParser.Lambda_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#anonymous_function_signature}.
	 * @param ctx the preParse tree
	 */
	void enterAnonymous_function_signature(CSharpParser.Anonymous_function_signatureContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#anonymous_function_signature}.
	 * @param ctx the preParse tree
	 */
	void exitAnonymous_function_signature(CSharpParser.Anonymous_function_signatureContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the preParse tree
	 */
	void enterExplicit_anonymous_function_parameter_list(CSharpParser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the preParse tree
	 */
	void exitExplicit_anonymous_function_parameter_list(CSharpParser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#explicit_anonymous_function_parameter}.
	 * @param ctx the preParse tree
	 */
	void enterExplicit_anonymous_function_parameter(CSharpParser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#explicit_anonymous_function_parameter}.
	 * @param ctx the preParse tree
	 */
	void exitExplicit_anonymous_function_parameter(CSharpParser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the preParse tree
	 */
	void enterImplicit_anonymous_function_parameter_list(CSharpParser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the preParse tree
	 */
	void exitImplicit_anonymous_function_parameter_list(CSharpParser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#anonymous_function_body}.
	 * @param ctx the preParse tree
	 */
	void enterAnonymous_function_body(CSharpParser.Anonymous_function_bodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#anonymous_function_body}.
	 * @param ctx the preParse tree
	 */
	void exitAnonymous_function_body(CSharpParser.Anonymous_function_bodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#query_expression}.
	 * @param ctx the preParse tree
	 */
	void enterQuery_expression(CSharpParser.Query_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#query_expression}.
	 * @param ctx the preParse tree
	 */
	void exitQuery_expression(CSharpParser.Query_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#from_clause}.
	 * @param ctx the preParse tree
	 */
	void enterFrom_clause(CSharpParser.From_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#from_clause}.
	 * @param ctx the preParse tree
	 */
	void exitFrom_clause(CSharpParser.From_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#query_body}.
	 * @param ctx the preParse tree
	 */
	void enterQuery_body(CSharpParser.Query_bodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#query_body}.
	 * @param ctx the preParse tree
	 */
	void exitQuery_body(CSharpParser.Query_bodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#query_body_clause}.
	 * @param ctx the preParse tree
	 */
	void enterQuery_body_clause(CSharpParser.Query_body_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#query_body_clause}.
	 * @param ctx the preParse tree
	 */
	void exitQuery_body_clause(CSharpParser.Query_body_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#let_clause}.
	 * @param ctx the preParse tree
	 */
	void enterLet_clause(CSharpParser.Let_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#let_clause}.
	 * @param ctx the preParse tree
	 */
	void exitLet_clause(CSharpParser.Let_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#where_clause}.
	 * @param ctx the preParse tree
	 */
	void enterWhere_clause(CSharpParser.Where_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#where_clause}.
	 * @param ctx the preParse tree
	 */
	void exitWhere_clause(CSharpParser.Where_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#combined_join_clause}.
	 * @param ctx the preParse tree
	 */
	void enterCombined_join_clause(CSharpParser.Combined_join_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#combined_join_clause}.
	 * @param ctx the preParse tree
	 */
	void exitCombined_join_clause(CSharpParser.Combined_join_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#orderby_clause}.
	 * @param ctx the preParse tree
	 */
	void enterOrderby_clause(CSharpParser.Orderby_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#orderby_clause}.
	 * @param ctx the preParse tree
	 */
	void exitOrderby_clause(CSharpParser.Orderby_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#ordering}.
	 * @param ctx the preParse tree
	 */
	void enterOrdering(CSharpParser.OrderingContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#ordering}.
	 * @param ctx the preParse tree
	 */
	void exitOrdering(CSharpParser.OrderingContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#select_or_group_clause}.
	 * @param ctx the preParse tree
	 */
	void enterSelect_or_group_clause(CSharpParser.Select_or_group_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#select_or_group_clause}.
	 * @param ctx the preParse tree
	 */
	void exitSelect_or_group_clause(CSharpParser.Select_or_group_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#query_continuation}.
	 * @param ctx the preParse tree
	 */
	void enterQuery_continuation(CSharpParser.Query_continuationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#query_continuation}.
	 * @param ctx the preParse tree
	 */
	void exitQuery_continuation(CSharpParser.Query_continuationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code labeledStatement}
	 * labeled alternative in {@link CSharpParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterLabeledStatement(CSharpParser.LabeledStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code labeledStatement}
	 * labeled alternative in {@link CSharpParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitLabeledStatement(CSharpParser.LabeledStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link CSharpParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterDeclarationStatement(CSharpParser.DeclarationStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link CSharpParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitDeclarationStatement(CSharpParser.DeclarationStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code embeddedStatement}
	 * labeled alternative in {@link CSharpParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterEmbeddedStatement(CSharpParser.EmbeddedStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code embeddedStatement}
	 * labeled alternative in {@link CSharpParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitEmbeddedStatement(CSharpParser.EmbeddedStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#labeled_Statement}.
	 * @param ctx the preParse tree
	 */
	void enterLabeled_Statement(CSharpParser.Labeled_StatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#labeled_Statement}.
	 * @param ctx the preParse tree
	 */
	void exitLabeled_Statement(CSharpParser.Labeled_StatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterEmbedded_statement(CSharpParser.Embedded_statementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitEmbedded_statement(CSharpParser.Embedded_statementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterEmptyStatement(CSharpParser.EmptyStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitEmptyStatement(CSharpParser.EmptyStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterExpressionStatement(CSharpParser.ExpressionStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitExpressionStatement(CSharpParser.ExpressionStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterIfStatement(CSharpParser.IfStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitIfStatement(CSharpParser.IfStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterSwitchStatement(CSharpParser.SwitchStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitSwitchStatement(CSharpParser.SwitchStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterWhileStatement(CSharpParser.WhileStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitWhileStatement(CSharpParser.WhileStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code doStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterDoStatement(CSharpParser.DoStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code doStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitDoStatement(CSharpParser.DoStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code forStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterForStatement(CSharpParser.ForStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code forStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitForStatement(CSharpParser.ForStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code foreachStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterForeachStatement(CSharpParser.ForeachStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code foreachStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitForeachStatement(CSharpParser.ForeachStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterBreakStatement(CSharpParser.BreakStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitBreakStatement(CSharpParser.BreakStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterContinueStatement(CSharpParser.ContinueStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitContinueStatement(CSharpParser.ContinueStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterGotoStatement(CSharpParser.GotoStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitGotoStatement(CSharpParser.GotoStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterReturnStatement(CSharpParser.ReturnStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitReturnStatement(CSharpParser.ReturnStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterThrowStatement(CSharpParser.ThrowStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitThrowStatement(CSharpParser.ThrowStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tryStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterTryStatement(CSharpParser.TryStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tryStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitTryStatement(CSharpParser.TryStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code checkedStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterCheckedStatement(CSharpParser.CheckedStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code checkedStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitCheckedStatement(CSharpParser.CheckedStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code uncheckedStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterUncheckedStatement(CSharpParser.UncheckedStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code uncheckedStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitUncheckedStatement(CSharpParser.UncheckedStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code lockStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterLockStatement(CSharpParser.LockStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code lockStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitLockStatement(CSharpParser.LockStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code usingStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterUsingStatement(CSharpParser.UsingStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code usingStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitUsingStatement(CSharpParser.UsingStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code yieldStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterYieldStatement(CSharpParser.YieldStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code yieldStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitYieldStatement(CSharpParser.YieldStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code unsafeStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterUnsafeStatement(CSharpParser.UnsafeStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code unsafeStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitUnsafeStatement(CSharpParser.UnsafeStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code fixedStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void enterFixedStatement(CSharpParser.FixedStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code fixedStatement}
	 * labeled alternative in {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the preParse tree
	 */
	void exitFixedStatement(CSharpParser.FixedStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#block}.
	 * @param ctx the preParse tree
	 */
	void enterBlock(CSharpParser.BlockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#block}.
	 * @param ctx the preParse tree
	 */
	void exitBlock(CSharpParser.BlockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#local_variable_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#local_variable_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#local_variable_type}.
	 * @param ctx the preParse tree
	 */
	void enterLocal_variable_type(CSharpParser.Local_variable_typeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#local_variable_type}.
	 * @param ctx the preParse tree
	 */
	void exitLocal_variable_type(CSharpParser.Local_variable_typeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#local_variable_declarator}.
	 * @param ctx the preParse tree
	 */
	void enterLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#local_variable_declarator}.
	 * @param ctx the preParse tree
	 */
	void exitLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#local_variable_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterLocal_variable_initializer(CSharpParser.Local_variable_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#local_variable_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitLocal_variable_initializer(CSharpParser.Local_variable_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#local_constant_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterLocal_constant_declaration(CSharpParser.Local_constant_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#local_constant_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitLocal_constant_declaration(CSharpParser.Local_constant_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#if_body}.
	 * @param ctx the preParse tree
	 */
	void enterIf_body(CSharpParser.If_bodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#if_body}.
	 * @param ctx the preParse tree
	 */
	void exitIf_body(CSharpParser.If_bodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#switch_section}.
	 * @param ctx the preParse tree
	 */
	void enterSwitch_section(CSharpParser.Switch_sectionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#switch_section}.
	 * @param ctx the preParse tree
	 */
	void exitSwitch_section(CSharpParser.Switch_sectionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#switch_label}.
	 * @param ctx the preParse tree
	 */
	void enterSwitch_label(CSharpParser.Switch_labelContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#switch_label}.
	 * @param ctx the preParse tree
	 */
	void exitSwitch_label(CSharpParser.Switch_labelContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#statement_list}.
	 * @param ctx the preParse tree
	 */
	void enterStatement_list(CSharpParser.Statement_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#statement_list}.
	 * @param ctx the preParse tree
	 */
	void exitStatement_list(CSharpParser.Statement_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#for_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterFor_initializer(CSharpParser.For_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#for_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitFor_initializer(CSharpParser.For_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#for_iterator}.
	 * @param ctx the preParse tree
	 */
	void enterFor_iterator(CSharpParser.For_iteratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#for_iterator}.
	 * @param ctx the preParse tree
	 */
	void exitFor_iterator(CSharpParser.For_iteratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#catch_clauses}.
	 * @param ctx the preParse tree
	 */
	void enterCatch_clauses(CSharpParser.Catch_clausesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#catch_clauses}.
	 * @param ctx the preParse tree
	 */
	void exitCatch_clauses(CSharpParser.Catch_clausesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#specific_catch_clause}.
	 * @param ctx the preParse tree
	 */
	void enterSpecific_catch_clause(CSharpParser.Specific_catch_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#specific_catch_clause}.
	 * @param ctx the preParse tree
	 */
	void exitSpecific_catch_clause(CSharpParser.Specific_catch_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#general_catch_clause}.
	 * @param ctx the preParse tree
	 */
	void enterGeneral_catch_clause(CSharpParser.General_catch_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#general_catch_clause}.
	 * @param ctx the preParse tree
	 */
	void exitGeneral_catch_clause(CSharpParser.General_catch_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#exception_filter}.
	 * @param ctx the preParse tree
	 */
	void enterException_filter(CSharpParser.Exception_filterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#exception_filter}.
	 * @param ctx the preParse tree
	 */
	void exitException_filter(CSharpParser.Exception_filterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#finally_clause}.
	 * @param ctx the preParse tree
	 */
	void enterFinally_clause(CSharpParser.Finally_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#finally_clause}.
	 * @param ctx the preParse tree
	 */
	void exitFinally_clause(CSharpParser.Finally_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#resource_acquisition}.
	 * @param ctx the preParse tree
	 */
	void enterResource_acquisition(CSharpParser.Resource_acquisitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#resource_acquisition}.
	 * @param ctx the preParse tree
	 */
	void exitResource_acquisition(CSharpParser.Resource_acquisitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#namespace_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterNamespace_declaration(CSharpParser.Namespace_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#namespace_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitNamespace_declaration(CSharpParser.Namespace_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#qualified_identifier}.
	 * @param ctx the preParse tree
	 */
	void enterQualified_identifier(CSharpParser.Qualified_identifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#qualified_identifier}.
	 * @param ctx the preParse tree
	 */
	void exitQualified_identifier(CSharpParser.Qualified_identifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#namespace_body}.
	 * @param ctx the preParse tree
	 */
	void enterNamespace_body(CSharpParser.Namespace_bodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#namespace_body}.
	 * @param ctx the preParse tree
	 */
	void exitNamespace_body(CSharpParser.Namespace_bodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#extern_alias_directives}.
	 * @param ctx the preParse tree
	 */
	void enterExtern_alias_directives(CSharpParser.Extern_alias_directivesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#extern_alias_directives}.
	 * @param ctx the preParse tree
	 */
	void exitExtern_alias_directives(CSharpParser.Extern_alias_directivesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#extern_alias_directive}.
	 * @param ctx the preParse tree
	 */
	void enterExtern_alias_directive(CSharpParser.Extern_alias_directiveContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#extern_alias_directive}.
	 * @param ctx the preParse tree
	 */
	void exitExtern_alias_directive(CSharpParser.Extern_alias_directiveContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#using_directives}.
	 * @param ctx the preParse tree
	 */
	void enterUsing_directives(CSharpParser.Using_directivesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#using_directives}.
	 * @param ctx the preParse tree
	 */
	void exitUsing_directives(CSharpParser.Using_directivesContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code usingAliasDirective}
	 * labeled alternative in {@link CSharpParser#using_directive}.
	 * @param ctx the preParse tree
	 */
	void enterUsingAliasDirective(CSharpParser.UsingAliasDirectiveContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code usingAliasDirective}
	 * labeled alternative in {@link CSharpParser#using_directive}.
	 * @param ctx the preParse tree
	 */
	void exitUsingAliasDirective(CSharpParser.UsingAliasDirectiveContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code usingNamespaceDirective}
	 * labeled alternative in {@link CSharpParser#using_directive}.
	 * @param ctx the preParse tree
	 */
	void enterUsingNamespaceDirective(CSharpParser.UsingNamespaceDirectiveContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code usingNamespaceDirective}
	 * labeled alternative in {@link CSharpParser#using_directive}.
	 * @param ctx the preParse tree
	 */
	void exitUsingNamespaceDirective(CSharpParser.UsingNamespaceDirectiveContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code usingStaticDirective}
	 * labeled alternative in {@link CSharpParser#using_directive}.
	 * @param ctx the preParse tree
	 */
	void enterUsingStaticDirective(CSharpParser.UsingStaticDirectiveContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code usingStaticDirective}
	 * labeled alternative in {@link CSharpParser#using_directive}.
	 * @param ctx the preParse tree
	 */
	void exitUsingStaticDirective(CSharpParser.UsingStaticDirectiveContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#namespace_member_declarations}.
	 * @param ctx the preParse tree
	 */
	void enterNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#namespace_member_declarations}.
	 * @param ctx the preParse tree
	 */
	void exitNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#namespace_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#namespace_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#type_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterType_declaration(CSharpParser.Type_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#type_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitType_declaration(CSharpParser.Type_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#qualified_alias_member}.
	 * @param ctx the preParse tree
	 */
	void enterQualified_alias_member(CSharpParser.Qualified_alias_memberContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#qualified_alias_member}.
	 * @param ctx the preParse tree
	 */
	void exitQualified_alias_member(CSharpParser.Qualified_alias_memberContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#type_parameter_list}.
	 * @param ctx the preParse tree
	 */
	void enterType_parameter_list(CSharpParser.Type_parameter_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#type_parameter_list}.
	 * @param ctx the preParse tree
	 */
	void exitType_parameter_list(CSharpParser.Type_parameter_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#type_parameter}.
	 * @param ctx the preParse tree
	 */
	void enterType_parameter(CSharpParser.Type_parameterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#type_parameter}.
	 * @param ctx the preParse tree
	 */
	void exitType_parameter(CSharpParser.Type_parameterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#class_base}.
	 * @param ctx the preParse tree
	 */
	void enterClass_base(CSharpParser.Class_baseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#class_base}.
	 * @param ctx the preParse tree
	 */
	void exitClass_base(CSharpParser.Class_baseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#interface_type_list}.
	 * @param ctx the preParse tree
	 */
	void enterInterface_type_list(CSharpParser.Interface_type_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#interface_type_list}.
	 * @param ctx the preParse tree
	 */
	void exitInterface_type_list(CSharpParser.Interface_type_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#type_parameter_constraints_clauses}.
	 * @param ctx the preParse tree
	 */
	void enterType_parameter_constraints_clauses(CSharpParser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#type_parameter_constraints_clauses}.
	 * @param ctx the preParse tree
	 */
	void exitType_parameter_constraints_clauses(CSharpParser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#type_parameter_constraints_clause}.
	 * @param ctx the preParse tree
	 */
	void enterType_parameter_constraints_clause(CSharpParser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#type_parameter_constraints_clause}.
	 * @param ctx the preParse tree
	 */
	void exitType_parameter_constraints_clause(CSharpParser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#type_parameter_constraints}.
	 * @param ctx the preParse tree
	 */
	void enterType_parameter_constraints(CSharpParser.Type_parameter_constraintsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#type_parameter_constraints}.
	 * @param ctx the preParse tree
	 */
	void exitType_parameter_constraints(CSharpParser.Type_parameter_constraintsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#primary_constraint}.
	 * @param ctx the preParse tree
	 */
	void enterPrimary_constraint(CSharpParser.Primary_constraintContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#primary_constraint}.
	 * @param ctx the preParse tree
	 */
	void exitPrimary_constraint(CSharpParser.Primary_constraintContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#secondary_constraints}.
	 * @param ctx the preParse tree
	 */
	void enterSecondary_constraints(CSharpParser.Secondary_constraintsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#secondary_constraints}.
	 * @param ctx the preParse tree
	 */
	void exitSecondary_constraints(CSharpParser.Secondary_constraintsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#constructor_constraint}.
	 * @param ctx the preParse tree
	 */
	void enterConstructor_constraint(CSharpParser.Constructor_constraintContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#constructor_constraint}.
	 * @param ctx the preParse tree
	 */
	void exitConstructor_constraint(CSharpParser.Constructor_constraintContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#class_body}.
	 * @param ctx the preParse tree
	 */
	void enterClass_body(CSharpParser.Class_bodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#class_body}.
	 * @param ctx the preParse tree
	 */
	void exitClass_body(CSharpParser.Class_bodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#class_member_declarations}.
	 * @param ctx the preParse tree
	 */
	void enterClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#class_member_declarations}.
	 * @param ctx the preParse tree
	 */
	void exitClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#class_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterClass_member_declaration(CSharpParser.Class_member_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#class_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitClass_member_declaration(CSharpParser.Class_member_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#all_member_modifiers}.
	 * @param ctx the preParse tree
	 */
	void enterAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#all_member_modifiers}.
	 * @param ctx the preParse tree
	 */
	void exitAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#all_member_modifier}.
	 * @param ctx the preParse tree
	 */
	void enterAll_member_modifier(CSharpParser.All_member_modifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#all_member_modifier}.
	 * @param ctx the preParse tree
	 */
	void exitAll_member_modifier(CSharpParser.All_member_modifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#common_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#common_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#typed_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterTyped_member_declaration(CSharpParser.Typed_member_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#typed_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitTyped_member_declaration(CSharpParser.Typed_member_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#constant_declarators}.
	 * @param ctx the preParse tree
	 */
	void enterConstant_declarators(CSharpParser.Constant_declaratorsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#constant_declarators}.
	 * @param ctx the preParse tree
	 */
	void exitConstant_declarators(CSharpParser.Constant_declaratorsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#constant_declarator}.
	 * @param ctx the preParse tree
	 */
	void enterConstant_declarator(CSharpParser.Constant_declaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#constant_declarator}.
	 * @param ctx the preParse tree
	 */
	void exitConstant_declarator(CSharpParser.Constant_declaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#variable_declarators}.
	 * @param ctx the preParse tree
	 */
	void enterVariable_declarators(CSharpParser.Variable_declaratorsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#variable_declarators}.
	 * @param ctx the preParse tree
	 */
	void exitVariable_declarators(CSharpParser.Variable_declaratorsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#variable_declarator}.
	 * @param ctx the preParse tree
	 */
	void enterVariable_declarator(CSharpParser.Variable_declaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#variable_declarator}.
	 * @param ctx the preParse tree
	 */
	void exitVariable_declarator(CSharpParser.Variable_declaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#variable_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterVariable_initializer(CSharpParser.Variable_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#variable_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitVariable_initializer(CSharpParser.Variable_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#return_type}.
	 * @param ctx the preParse tree
	 */
	void enterReturn_type(CSharpParser.Return_typeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#return_type}.
	 * @param ctx the preParse tree
	 */
	void exitReturn_type(CSharpParser.Return_typeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#member_name}.
	 * @param ctx the preParse tree
	 */
	void enterMember_name(CSharpParser.Member_nameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#member_name}.
	 * @param ctx the preParse tree
	 */
	void exitMember_name(CSharpParser.Member_nameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#method_body}.
	 * @param ctx the preParse tree
	 */
	void enterMethod_body(CSharpParser.Method_bodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#method_body}.
	 * @param ctx the preParse tree
	 */
	void exitMethod_body(CSharpParser.Method_bodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#formal_parameter_list}.
	 * @param ctx the preParse tree
	 */
	void enterFormal_parameter_list(CSharpParser.Formal_parameter_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#formal_parameter_list}.
	 * @param ctx the preParse tree
	 */
	void exitFormal_parameter_list(CSharpParser.Formal_parameter_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#fixed_parameters}.
	 * @param ctx the preParse tree
	 */
	void enterFixed_parameters(CSharpParser.Fixed_parametersContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#fixed_parameters}.
	 * @param ctx the preParse tree
	 */
	void exitFixed_parameters(CSharpParser.Fixed_parametersContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#fixed_parameter}.
	 * @param ctx the preParse tree
	 */
	void enterFixed_parameter(CSharpParser.Fixed_parameterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#fixed_parameter}.
	 * @param ctx the preParse tree
	 */
	void exitFixed_parameter(CSharpParser.Fixed_parameterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#parameter_modifier}.
	 * @param ctx the preParse tree
	 */
	void enterParameter_modifier(CSharpParser.Parameter_modifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#parameter_modifier}.
	 * @param ctx the preParse tree
	 */
	void exitParameter_modifier(CSharpParser.Parameter_modifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#parameter_array}.
	 * @param ctx the preParse tree
	 */
	void enterParameter_array(CSharpParser.Parameter_arrayContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#parameter_array}.
	 * @param ctx the preParse tree
	 */
	void exitParameter_array(CSharpParser.Parameter_arrayContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#accessor_declarations}.
	 * @param ctx the preParse tree
	 */
	void enterAccessor_declarations(CSharpParser.Accessor_declarationsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#accessor_declarations}.
	 * @param ctx the preParse tree
	 */
	void exitAccessor_declarations(CSharpParser.Accessor_declarationsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#get_accessor_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterGet_accessor_declaration(CSharpParser.Get_accessor_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#get_accessor_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitGet_accessor_declaration(CSharpParser.Get_accessor_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#set_accessor_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterSet_accessor_declaration(CSharpParser.Set_accessor_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#set_accessor_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitSet_accessor_declaration(CSharpParser.Set_accessor_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#accessor_modifier}.
	 * @param ctx the preParse tree
	 */
	void enterAccessor_modifier(CSharpParser.Accessor_modifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#accessor_modifier}.
	 * @param ctx the preParse tree
	 */
	void exitAccessor_modifier(CSharpParser.Accessor_modifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#accessor_body}.
	 * @param ctx the preParse tree
	 */
	void enterAccessor_body(CSharpParser.Accessor_bodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#accessor_body}.
	 * @param ctx the preParse tree
	 */
	void exitAccessor_body(CSharpParser.Accessor_bodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#event_accessor_declarations}.
	 * @param ctx the preParse tree
	 */
	void enterEvent_accessor_declarations(CSharpParser.Event_accessor_declarationsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#event_accessor_declarations}.
	 * @param ctx the preParse tree
	 */
	void exitEvent_accessor_declarations(CSharpParser.Event_accessor_declarationsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#add_accessor_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterAdd_accessor_declaration(CSharpParser.Add_accessor_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#add_accessor_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitAdd_accessor_declaration(CSharpParser.Add_accessor_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#remove_accessor_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterRemove_accessor_declaration(CSharpParser.Remove_accessor_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#remove_accessor_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitRemove_accessor_declaration(CSharpParser.Remove_accessor_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#overloadable_operator}.
	 * @param ctx the preParse tree
	 */
	void enterOverloadable_operator(CSharpParser.Overloadable_operatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#overloadable_operator}.
	 * @param ctx the preParse tree
	 */
	void exitOverloadable_operator(CSharpParser.Overloadable_operatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#conversion_operator_declarator}.
	 * @param ctx the preParse tree
	 */
	void enterConversion_operator_declarator(CSharpParser.Conversion_operator_declaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#conversion_operator_declarator}.
	 * @param ctx the preParse tree
	 */
	void exitConversion_operator_declarator(CSharpParser.Conversion_operator_declaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#constructor_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterConstructor_initializer(CSharpParser.Constructor_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#constructor_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitConstructor_initializer(CSharpParser.Constructor_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#body}.
	 * @param ctx the preParse tree
	 */
	void enterBody(CSharpParser.BodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#body}.
	 * @param ctx the preParse tree
	 */
	void exitBody(CSharpParser.BodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#struct_interfaces}.
	 * @param ctx the preParse tree
	 */
	void enterStruct_interfaces(CSharpParser.Struct_interfacesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#struct_interfaces}.
	 * @param ctx the preParse tree
	 */
	void exitStruct_interfaces(CSharpParser.Struct_interfacesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#struct_body}.
	 * @param ctx the preParse tree
	 */
	void enterStruct_body(CSharpParser.Struct_bodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#struct_body}.
	 * @param ctx the preParse tree
	 */
	void exitStruct_body(CSharpParser.Struct_bodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#struct_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterStruct_member_declaration(CSharpParser.Struct_member_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#struct_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitStruct_member_declaration(CSharpParser.Struct_member_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#array_type}.
	 * @param ctx the preParse tree
	 */
	void enterArray_type(CSharpParser.Array_typeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#array_type}.
	 * @param ctx the preParse tree
	 */
	void exitArray_type(CSharpParser.Array_typeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#rank_specifier}.
	 * @param ctx the preParse tree
	 */
	void enterRank_specifier(CSharpParser.Rank_specifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#rank_specifier}.
	 * @param ctx the preParse tree
	 */
	void exitRank_specifier(CSharpParser.Rank_specifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#array_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterArray_initializer(CSharpParser.Array_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#array_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitArray_initializer(CSharpParser.Array_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#variant_type_parameter_list}.
	 * @param ctx the preParse tree
	 */
	void enterVariant_type_parameter_list(CSharpParser.Variant_type_parameter_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#variant_type_parameter_list}.
	 * @param ctx the preParse tree
	 */
	void exitVariant_type_parameter_list(CSharpParser.Variant_type_parameter_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#variant_type_parameter}.
	 * @param ctx the preParse tree
	 */
	void enterVariant_type_parameter(CSharpParser.Variant_type_parameterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#variant_type_parameter}.
	 * @param ctx the preParse tree
	 */
	void exitVariant_type_parameter(CSharpParser.Variant_type_parameterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#variance_annotation}.
	 * @param ctx the preParse tree
	 */
	void enterVariance_annotation(CSharpParser.Variance_annotationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#variance_annotation}.
	 * @param ctx the preParse tree
	 */
	void exitVariance_annotation(CSharpParser.Variance_annotationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#interface_base}.
	 * @param ctx the preParse tree
	 */
	void enterInterface_base(CSharpParser.Interface_baseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#interface_base}.
	 * @param ctx the preParse tree
	 */
	void exitInterface_base(CSharpParser.Interface_baseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#interface_body}.
	 * @param ctx the preParse tree
	 */
	void enterInterface_body(CSharpParser.Interface_bodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#interface_body}.
	 * @param ctx the preParse tree
	 */
	void exitInterface_body(CSharpParser.Interface_bodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#interface_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#interface_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#interface_accessors}.
	 * @param ctx the preParse tree
	 */
	void enterInterface_accessors(CSharpParser.Interface_accessorsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#interface_accessors}.
	 * @param ctx the preParse tree
	 */
	void exitInterface_accessors(CSharpParser.Interface_accessorsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#enum_base}.
	 * @param ctx the preParse tree
	 */
	void enterEnum_base(CSharpParser.Enum_baseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#enum_base}.
	 * @param ctx the preParse tree
	 */
	void exitEnum_base(CSharpParser.Enum_baseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#enum_body}.
	 * @param ctx the preParse tree
	 */
	void enterEnum_body(CSharpParser.Enum_bodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#enum_body}.
	 * @param ctx the preParse tree
	 */
	void exitEnum_body(CSharpParser.Enum_bodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#enum_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterEnum_member_declaration(CSharpParser.Enum_member_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#enum_member_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitEnum_member_declaration(CSharpParser.Enum_member_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#global_attribute_section}.
	 * @param ctx the preParse tree
	 */
	void enterGlobal_attribute_section(CSharpParser.Global_attribute_sectionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#global_attribute_section}.
	 * @param ctx the preParse tree
	 */
	void exitGlobal_attribute_section(CSharpParser.Global_attribute_sectionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#global_attribute_target}.
	 * @param ctx the preParse tree
	 */
	void enterGlobal_attribute_target(CSharpParser.Global_attribute_targetContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#global_attribute_target}.
	 * @param ctx the preParse tree
	 */
	void exitGlobal_attribute_target(CSharpParser.Global_attribute_targetContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#attributes}.
	 * @param ctx the preParse tree
	 */
	void enterAttributes(CSharpParser.AttributesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#attributes}.
	 * @param ctx the preParse tree
	 */
	void exitAttributes(CSharpParser.AttributesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#attribute_section}.
	 * @param ctx the preParse tree
	 */
	void enterAttribute_section(CSharpParser.Attribute_sectionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#attribute_section}.
	 * @param ctx the preParse tree
	 */
	void exitAttribute_section(CSharpParser.Attribute_sectionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#attribute_target}.
	 * @param ctx the preParse tree
	 */
	void enterAttribute_target(CSharpParser.Attribute_targetContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#attribute_target}.
	 * @param ctx the preParse tree
	 */
	void exitAttribute_target(CSharpParser.Attribute_targetContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#attribute_list}.
	 * @param ctx the preParse tree
	 */
	void enterAttribute_list(CSharpParser.Attribute_listContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#attribute_list}.
	 * @param ctx the preParse tree
	 */
	void exitAttribute_list(CSharpParser.Attribute_listContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#attribute}.
	 * @param ctx the preParse tree
	 */
	void enterAttribute(CSharpParser.AttributeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#attribute}.
	 * @param ctx the preParse tree
	 */
	void exitAttribute(CSharpParser.AttributeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#attribute_argument}.
	 * @param ctx the preParse tree
	 */
	void enterAttribute_argument(CSharpParser.Attribute_argumentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#attribute_argument}.
	 * @param ctx the preParse tree
	 */
	void exitAttribute_argument(CSharpParser.Attribute_argumentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#pointer_type}.
	 * @param ctx the preParse tree
	 */
	void enterPointer_type(CSharpParser.Pointer_typeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#pointer_type}.
	 * @param ctx the preParse tree
	 */
	void exitPointer_type(CSharpParser.Pointer_typeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#fixed_pointer_declarators}.
	 * @param ctx the preParse tree
	 */
	void enterFixed_pointer_declarators(CSharpParser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#fixed_pointer_declarators}.
	 * @param ctx the preParse tree
	 */
	void exitFixed_pointer_declarators(CSharpParser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#fixed_pointer_declarator}.
	 * @param ctx the preParse tree
	 */
	void enterFixed_pointer_declarator(CSharpParser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#fixed_pointer_declarator}.
	 * @param ctx the preParse tree
	 */
	void exitFixed_pointer_declarator(CSharpParser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#fixed_pointer_initializer}.
	 * @param ctx the preParse tree
	 */
	void enterFixed_pointer_initializer(CSharpParser.Fixed_pointer_initializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#fixed_pointer_initializer}.
	 * @param ctx the preParse tree
	 */
	void exitFixed_pointer_initializer(CSharpParser.Fixed_pointer_initializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#fixed_size_buffer_declarator}.
	 * @param ctx the preParse tree
	 */
	void enterFixed_size_buffer_declarator(CSharpParser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#fixed_size_buffer_declarator}.
	 * @param ctx the preParse tree
	 */
	void exitFixed_size_buffer_declarator(CSharpParser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#local_variable_initializer_unsafe}.
	 * @param ctx the preParse tree
	 */
	void enterLocal_variable_initializer_unsafe(CSharpParser.Local_variable_initializer_unsafeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#local_variable_initializer_unsafe}.
	 * @param ctx the preParse tree
	 */
	void exitLocal_variable_initializer_unsafe(CSharpParser.Local_variable_initializer_unsafeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#right_arrow}.
	 * @param ctx the preParse tree
	 */
	void enterRight_arrow(CSharpParser.Right_arrowContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#right_arrow}.
	 * @param ctx the preParse tree
	 */
	void exitRight_arrow(CSharpParser.Right_arrowContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#right_shift}.
	 * @param ctx the preParse tree
	 */
	void enterRight_shift(CSharpParser.Right_shiftContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#right_shift}.
	 * @param ctx the preParse tree
	 */
	void exitRight_shift(CSharpParser.Right_shiftContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#right_shift_assignment}.
	 * @param ctx the preParse tree
	 */
	void enterRight_shift_assignment(CSharpParser.Right_shift_assignmentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#right_shift_assignment}.
	 * @param ctx the preParse tree
	 */
	void exitRight_shift_assignment(CSharpParser.Right_shift_assignmentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#literal}.
	 * @param ctx the preParse tree
	 */
	void enterLiteral(CSharpParser.LiteralContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#literal}.
	 * @param ctx the preParse tree
	 */
	void exitLiteral(CSharpParser.LiteralContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#boolean_literal}.
	 * @param ctx the preParse tree
	 */
	void enterBoolean_literal(CSharpParser.Boolean_literalContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#boolean_literal}.
	 * @param ctx the preParse tree
	 */
	void exitBoolean_literal(CSharpParser.Boolean_literalContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#string_literal}.
	 * @param ctx the preParse tree
	 */
	void enterString_literal(CSharpParser.String_literalContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#string_literal}.
	 * @param ctx the preParse tree
	 */
	void exitString_literal(CSharpParser.String_literalContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#interpolated_regular_string}.
	 * @param ctx the preParse tree
	 */
	void enterInterpolated_regular_string(CSharpParser.Interpolated_regular_stringContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#interpolated_regular_string}.
	 * @param ctx the preParse tree
	 */
	void exitInterpolated_regular_string(CSharpParser.Interpolated_regular_stringContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#interpolated_verbatium_string}.
	 * @param ctx the preParse tree
	 */
	void enterInterpolated_verbatium_string(CSharpParser.Interpolated_verbatium_stringContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#interpolated_verbatium_string}.
	 * @param ctx the preParse tree
	 */
	void exitInterpolated_verbatium_string(CSharpParser.Interpolated_verbatium_stringContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#interpolated_regular_string_part}.
	 * @param ctx the preParse tree
	 */
	void enterInterpolated_regular_string_part(CSharpParser.Interpolated_regular_string_partContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#interpolated_regular_string_part}.
	 * @param ctx the preParse tree
	 */
	void exitInterpolated_regular_string_part(CSharpParser.Interpolated_regular_string_partContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#interpolated_verbatium_string_part}.
	 * @param ctx the preParse tree
	 */
	void enterInterpolated_verbatium_string_part(CSharpParser.Interpolated_verbatium_string_partContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#interpolated_verbatium_string_part}.
	 * @param ctx the preParse tree
	 */
	void exitInterpolated_verbatium_string_part(CSharpParser.Interpolated_verbatium_string_partContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#interpolated_string_expression}.
	 * @param ctx the preParse tree
	 */
	void enterInterpolated_string_expression(CSharpParser.Interpolated_string_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#interpolated_string_expression}.
	 * @param ctx the preParse tree
	 */
	void exitInterpolated_string_expression(CSharpParser.Interpolated_string_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#keyword}.
	 * @param ctx the preParse tree
	 */
	void enterKeyword(CSharpParser.KeywordContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#keyword}.
	 * @param ctx the preParse tree
	 */
	void exitKeyword(CSharpParser.KeywordContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#class_definition}.
	 * @param ctx the preParse tree
	 */
	void enterClass_definition(CSharpParser.Class_definitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#class_definition}.
	 * @param ctx the preParse tree
	 */
	void exitClass_definition(CSharpParser.Class_definitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#struct_definition}.
	 * @param ctx the preParse tree
	 */
	void enterStruct_definition(CSharpParser.Struct_definitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#struct_definition}.
	 * @param ctx the preParse tree
	 */
	void exitStruct_definition(CSharpParser.Struct_definitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#interface_definition}.
	 * @param ctx the preParse tree
	 */
	void enterInterface_definition(CSharpParser.Interface_definitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#interface_definition}.
	 * @param ctx the preParse tree
	 */
	void exitInterface_definition(CSharpParser.Interface_definitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#enum_definition}.
	 * @param ctx the preParse tree
	 */
	void enterEnum_definition(CSharpParser.Enum_definitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#enum_definition}.
	 * @param ctx the preParse tree
	 */
	void exitEnum_definition(CSharpParser.Enum_definitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#delegate_definition}.
	 * @param ctx the preParse tree
	 */
	void enterDelegate_definition(CSharpParser.Delegate_definitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#delegate_definition}.
	 * @param ctx the preParse tree
	 */
	void exitDelegate_definition(CSharpParser.Delegate_definitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#event_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterEvent_declaration(CSharpParser.Event_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#event_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitEvent_declaration(CSharpParser.Event_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#field_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterField_declaration(CSharpParser.Field_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#field_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitField_declaration(CSharpParser.Field_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#property_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterProperty_declaration(CSharpParser.Property_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#property_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitProperty_declaration(CSharpParser.Property_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#constant_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterConstant_declaration(CSharpParser.Constant_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#constant_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitConstant_declaration(CSharpParser.Constant_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#indexer_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterIndexer_declaration(CSharpParser.Indexer_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#indexer_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitIndexer_declaration(CSharpParser.Indexer_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#destructor_definition}.
	 * @param ctx the preParse tree
	 */
	void enterDestructor_definition(CSharpParser.Destructor_definitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#destructor_definition}.
	 * @param ctx the preParse tree
	 */
	void exitDestructor_definition(CSharpParser.Destructor_definitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#constructor_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterConstructor_declaration(CSharpParser.Constructor_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#constructor_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitConstructor_declaration(CSharpParser.Constructor_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#method_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterMethod_declaration(CSharpParser.Method_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#method_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitMethod_declaration(CSharpParser.Method_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#method_member_name}.
	 * @param ctx the preParse tree
	 */
	void enterMethod_member_name(CSharpParser.Method_member_nameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#method_member_name}.
	 * @param ctx the preParse tree
	 */
	void exitMethod_member_name(CSharpParser.Method_member_nameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#operator_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterOperator_declaration(CSharpParser.Operator_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#operator_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitOperator_declaration(CSharpParser.Operator_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#arg_declaration}.
	 * @param ctx the preParse tree
	 */
	void enterArg_declaration(CSharpParser.Arg_declarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#arg_declaration}.
	 * @param ctx the preParse tree
	 */
	void exitArg_declaration(CSharpParser.Arg_declarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#method_invocation}.
	 * @param ctx the preParse tree
	 */
	void enterMethod_invocation(CSharpParser.Method_invocationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#method_invocation}.
	 * @param ctx the preParse tree
	 */
	void exitMethod_invocation(CSharpParser.Method_invocationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#object_creation_expression}.
	 * @param ctx the preParse tree
	 */
	void enterObject_creation_expression(CSharpParser.Object_creation_expressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#object_creation_expression}.
	 * @param ctx the preParse tree
	 */
	void exitObject_creation_expression(CSharpParser.Object_creation_expressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link CSharpParser#identifier}.
	 * @param ctx the preParse tree
	 */
	void enterIdentifier(CSharpParser.IdentifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link CSharpParser#identifier}.
	 * @param ctx the preParse tree
	 */
	void exitIdentifier(CSharpParser.IdentifierContext ctx);
}