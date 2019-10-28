// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/cpp\cpp.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.cpp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link cppParser}.
 */
public interface cppListener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link cppParser#translationunit}.
	 * @param ctx the preParse tree
	 */
	void enterTranslationunit(cppParser.TranslationunitContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#translationunit}.
	 * @param ctx the preParse tree
	 */
	void exitTranslationunit(cppParser.TranslationunitContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#primaryexpression}.
	 * @param ctx the preParse tree
	 */
	void enterPrimaryexpression(cppParser.PrimaryexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#primaryexpression}.
	 * @param ctx the preParse tree
	 */
	void exitPrimaryexpression(cppParser.PrimaryexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#idexpression}.
	 * @param ctx the preParse tree
	 */
	void enterIdexpression(cppParser.IdexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#idexpression}.
	 * @param ctx the preParse tree
	 */
	void exitIdexpression(cppParser.IdexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#unqualifiedid}.
	 * @param ctx the preParse tree
	 */
	void enterUnqualifiedid(cppParser.UnqualifiedidContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#unqualifiedid}.
	 * @param ctx the preParse tree
	 */
	void exitUnqualifiedid(cppParser.UnqualifiedidContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#qualifiedid}.
	 * @param ctx the preParse tree
	 */
	void enterQualifiedid(cppParser.QualifiedidContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#qualifiedid}.
	 * @param ctx the preParse tree
	 */
	void exitQualifiedid(cppParser.QualifiedidContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#nestednamespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterNestednamespecifier(cppParser.NestednamespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#nestednamespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitNestednamespecifier(cppParser.NestednamespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#lambdaexpression}.
	 * @param ctx the preParse tree
	 */
	void enterLambdaexpression(cppParser.LambdaexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#lambdaexpression}.
	 * @param ctx the preParse tree
	 */
	void exitLambdaexpression(cppParser.LambdaexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#lambdaintroducer}.
	 * @param ctx the preParse tree
	 */
	void enterLambdaintroducer(cppParser.LambdaintroducerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#lambdaintroducer}.
	 * @param ctx the preParse tree
	 */
	void exitLambdaintroducer(cppParser.LambdaintroducerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#lambdacapture}.
	 * @param ctx the preParse tree
	 */
	void enterLambdacapture(cppParser.LambdacaptureContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#lambdacapture}.
	 * @param ctx the preParse tree
	 */
	void exitLambdacapture(cppParser.LambdacaptureContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#capturedefault}.
	 * @param ctx the preParse tree
	 */
	void enterCapturedefault(cppParser.CapturedefaultContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#capturedefault}.
	 * @param ctx the preParse tree
	 */
	void exitCapturedefault(cppParser.CapturedefaultContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#capturelist}.
	 * @param ctx the preParse tree
	 */
	void enterCapturelist(cppParser.CapturelistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#capturelist}.
	 * @param ctx the preParse tree
	 */
	void exitCapturelist(cppParser.CapturelistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#capture}.
	 * @param ctx the preParse tree
	 */
	void enterCapture(cppParser.CaptureContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#capture}.
	 * @param ctx the preParse tree
	 */
	void exitCapture(cppParser.CaptureContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#simplecapture}.
	 * @param ctx the preParse tree
	 */
	void enterSimplecapture(cppParser.SimplecaptureContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#simplecapture}.
	 * @param ctx the preParse tree
	 */
	void exitSimplecapture(cppParser.SimplecaptureContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#initcapture}.
	 * @param ctx the preParse tree
	 */
	void enterInitcapture(cppParser.InitcaptureContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#initcapture}.
	 * @param ctx the preParse tree
	 */
	void exitInitcapture(cppParser.InitcaptureContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#lambdadeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterLambdadeclarator(cppParser.LambdadeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#lambdadeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitLambdadeclarator(cppParser.LambdadeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#postfixexpression}.
	 * @param ctx the preParse tree
	 */
	void enterPostfixexpression(cppParser.PostfixexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#postfixexpression}.
	 * @param ctx the preParse tree
	 */
	void exitPostfixexpression(cppParser.PostfixexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#expressionlist}.
	 * @param ctx the preParse tree
	 */
	void enterExpressionlist(cppParser.ExpressionlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#expressionlist}.
	 * @param ctx the preParse tree
	 */
	void exitExpressionlist(cppParser.ExpressionlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#pseudodestructorname}.
	 * @param ctx the preParse tree
	 */
	void enterPseudodestructorname(cppParser.PseudodestructornameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#pseudodestructorname}.
	 * @param ctx the preParse tree
	 */
	void exitPseudodestructorname(cppParser.PseudodestructornameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#unaryexpression}.
	 * @param ctx the preParse tree
	 */
	void enterUnaryexpression(cppParser.UnaryexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#unaryexpression}.
	 * @param ctx the preParse tree
	 */
	void exitUnaryexpression(cppParser.UnaryexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#unaryoperator}.
	 * @param ctx the preParse tree
	 */
	void enterUnaryoperator(cppParser.UnaryoperatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#unaryoperator}.
	 * @param ctx the preParse tree
	 */
	void exitUnaryoperator(cppParser.UnaryoperatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#newexpression}.
	 * @param ctx the preParse tree
	 */
	void enterNewexpression(cppParser.NewexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#newexpression}.
	 * @param ctx the preParse tree
	 */
	void exitNewexpression(cppParser.NewexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#newplacement}.
	 * @param ctx the preParse tree
	 */
	void enterNewplacement(cppParser.NewplacementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#newplacement}.
	 * @param ctx the preParse tree
	 */
	void exitNewplacement(cppParser.NewplacementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#newtypeid}.
	 * @param ctx the preParse tree
	 */
	void enterNewtypeid(cppParser.NewtypeidContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#newtypeid}.
	 * @param ctx the preParse tree
	 */
	void exitNewtypeid(cppParser.NewtypeidContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#newdeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterNewdeclarator(cppParser.NewdeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#newdeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitNewdeclarator(cppParser.NewdeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#noptrnewdeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterNoptrnewdeclarator(cppParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#noptrnewdeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitNoptrnewdeclarator(cppParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#newinitializer}.
	 * @param ctx the preParse tree
	 */
	void enterNewinitializer(cppParser.NewinitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#newinitializer}.
	 * @param ctx the preParse tree
	 */
	void exitNewinitializer(cppParser.NewinitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#deleteexpression}.
	 * @param ctx the preParse tree
	 */
	void enterDeleteexpression(cppParser.DeleteexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#deleteexpression}.
	 * @param ctx the preParse tree
	 */
	void exitDeleteexpression(cppParser.DeleteexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#noexceptexpression}.
	 * @param ctx the preParse tree
	 */
	void enterNoexceptexpression(cppParser.NoexceptexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#noexceptexpression}.
	 * @param ctx the preParse tree
	 */
	void exitNoexceptexpression(cppParser.NoexceptexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#castexpression}.
	 * @param ctx the preParse tree
	 */
	void enterCastexpression(cppParser.CastexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#castexpression}.
	 * @param ctx the preParse tree
	 */
	void exitCastexpression(cppParser.CastexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#pmexpression}.
	 * @param ctx the preParse tree
	 */
	void enterPmexpression(cppParser.PmexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#pmexpression}.
	 * @param ctx the preParse tree
	 */
	void exitPmexpression(cppParser.PmexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#multiplicativeexpression}.
	 * @param ctx the preParse tree
	 */
	void enterMultiplicativeexpression(cppParser.MultiplicativeexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#multiplicativeexpression}.
	 * @param ctx the preParse tree
	 */
	void exitMultiplicativeexpression(cppParser.MultiplicativeexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#additiveexpression}.
	 * @param ctx the preParse tree
	 */
	void enterAdditiveexpression(cppParser.AdditiveexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#additiveexpression}.
	 * @param ctx the preParse tree
	 */
	void exitAdditiveexpression(cppParser.AdditiveexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#shiftexpression}.
	 * @param ctx the preParse tree
	 */
	void enterShiftexpression(cppParser.ShiftexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#shiftexpression}.
	 * @param ctx the preParse tree
	 */
	void exitShiftexpression(cppParser.ShiftexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#relationalexpression}.
	 * @param ctx the preParse tree
	 */
	void enterRelationalexpression(cppParser.RelationalexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#relationalexpression}.
	 * @param ctx the preParse tree
	 */
	void exitRelationalexpression(cppParser.RelationalexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#equalityexpression}.
	 * @param ctx the preParse tree
	 */
	void enterEqualityexpression(cppParser.EqualityexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#equalityexpression}.
	 * @param ctx the preParse tree
	 */
	void exitEqualityexpression(cppParser.EqualityexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#andexpression}.
	 * @param ctx the preParse tree
	 */
	void enterAndexpression(cppParser.AndexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#andexpression}.
	 * @param ctx the preParse tree
	 */
	void exitAndexpression(cppParser.AndexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#exclusiveorexpression}.
	 * @param ctx the preParse tree
	 */
	void enterExclusiveorexpression(cppParser.ExclusiveorexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#exclusiveorexpression}.
	 * @param ctx the preParse tree
	 */
	void exitExclusiveorexpression(cppParser.ExclusiveorexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#inclusiveorexpression}.
	 * @param ctx the preParse tree
	 */
	void enterInclusiveorexpression(cppParser.InclusiveorexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#inclusiveorexpression}.
	 * @param ctx the preParse tree
	 */
	void exitInclusiveorexpression(cppParser.InclusiveorexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#logicalandexpression}.
	 * @param ctx the preParse tree
	 */
	void enterLogicalandexpression(cppParser.LogicalandexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#logicalandexpression}.
	 * @param ctx the preParse tree
	 */
	void exitLogicalandexpression(cppParser.LogicalandexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#logicalorexpression}.
	 * @param ctx the preParse tree
	 */
	void enterLogicalorexpression(cppParser.LogicalorexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#logicalorexpression}.
	 * @param ctx the preParse tree
	 */
	void exitLogicalorexpression(cppParser.LogicalorexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#conditionalexpression}.
	 * @param ctx the preParse tree
	 */
	void enterConditionalexpression(cppParser.ConditionalexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#conditionalexpression}.
	 * @param ctx the preParse tree
	 */
	void exitConditionalexpression(cppParser.ConditionalexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#assignmentexpression}.
	 * @param ctx the preParse tree
	 */
	void enterAssignmentexpression(cppParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#assignmentexpression}.
	 * @param ctx the preParse tree
	 */
	void exitAssignmentexpression(cppParser.AssignmentexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#assignmentoperator}.
	 * @param ctx the preParse tree
	 */
	void enterAssignmentoperator(cppParser.AssignmentoperatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#assignmentoperator}.
	 * @param ctx the preParse tree
	 */
	void exitAssignmentoperator(cppParser.AssignmentoperatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterExpression(cppParser.ExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitExpression(cppParser.ExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#constantexpression}.
	 * @param ctx the preParse tree
	 */
	void enterConstantexpression(cppParser.ConstantexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#constantexpression}.
	 * @param ctx the preParse tree
	 */
	void exitConstantexpression(cppParser.ConstantexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterStatement(cppParser.StatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitStatement(cppParser.StatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#labeledstatement}.
	 * @param ctx the preParse tree
	 */
	void enterLabeledstatement(cppParser.LabeledstatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#labeledstatement}.
	 * @param ctx the preParse tree
	 */
	void exitLabeledstatement(cppParser.LabeledstatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#expressionstatement}.
	 * @param ctx the preParse tree
	 */
	void enterExpressionstatement(cppParser.ExpressionstatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#expressionstatement}.
	 * @param ctx the preParse tree
	 */
	void exitExpressionstatement(cppParser.ExpressionstatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#compoundstatement}.
	 * @param ctx the preParse tree
	 */
	void enterCompoundstatement(cppParser.CompoundstatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#compoundstatement}.
	 * @param ctx the preParse tree
	 */
	void exitCompoundstatement(cppParser.CompoundstatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#statementseq}.
	 * @param ctx the preParse tree
	 */
	void enterStatementseq(cppParser.StatementseqContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#statementseq}.
	 * @param ctx the preParse tree
	 */
	void exitStatementseq(cppParser.StatementseqContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#selectionstatement}.
	 * @param ctx the preParse tree
	 */
	void enterSelectionstatement(cppParser.SelectionstatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#selectionstatement}.
	 * @param ctx the preParse tree
	 */
	void exitSelectionstatement(cppParser.SelectionstatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#condition}.
	 * @param ctx the preParse tree
	 */
	void enterCondition(cppParser.ConditionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#condition}.
	 * @param ctx the preParse tree
	 */
	void exitCondition(cppParser.ConditionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#iterationstatement}.
	 * @param ctx the preParse tree
	 */
	void enterIterationstatement(cppParser.IterationstatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#iterationstatement}.
	 * @param ctx the preParse tree
	 */
	void exitIterationstatement(cppParser.IterationstatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#forinitstatement}.
	 * @param ctx the preParse tree
	 */
	void enterForinitstatement(cppParser.ForinitstatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#forinitstatement}.
	 * @param ctx the preParse tree
	 */
	void exitForinitstatement(cppParser.ForinitstatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#forrangedeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterForrangedeclaration(cppParser.ForrangedeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#forrangedeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitForrangedeclaration(cppParser.ForrangedeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#forrangeinitializer}.
	 * @param ctx the preParse tree
	 */
	void enterForrangeinitializer(cppParser.ForrangeinitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#forrangeinitializer}.
	 * @param ctx the preParse tree
	 */
	void exitForrangeinitializer(cppParser.ForrangeinitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#jumpstatement}.
	 * @param ctx the preParse tree
	 */
	void enterJumpstatement(cppParser.JumpstatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#jumpstatement}.
	 * @param ctx the preParse tree
	 */
	void exitJumpstatement(cppParser.JumpstatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#declarationstatement}.
	 * @param ctx the preParse tree
	 */
	void enterDeclarationstatement(cppParser.DeclarationstatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#declarationstatement}.
	 * @param ctx the preParse tree
	 */
	void exitDeclarationstatement(cppParser.DeclarationstatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#declarationseq}.
	 * @param ctx the preParse tree
	 */
	void enterDeclarationseq(cppParser.DeclarationseqContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#declarationseq}.
	 * @param ctx the preParse tree
	 */
	void exitDeclarationseq(cppParser.DeclarationseqContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#declaration}.
	 * @param ctx the preParse tree
	 */
	void enterDeclaration(cppParser.DeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#declaration}.
	 * @param ctx the preParse tree
	 */
	void exitDeclaration(cppParser.DeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#blockdeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterBlockdeclaration(cppParser.BlockdeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#blockdeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitBlockdeclaration(cppParser.BlockdeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#aliasdeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterAliasdeclaration(cppParser.AliasdeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#aliasdeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitAliasdeclaration(cppParser.AliasdeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#simpledeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterSimpledeclaration(cppParser.SimpledeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#simpledeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitSimpledeclaration(cppParser.SimpledeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#static_assertdeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterStatic_assertdeclaration(cppParser.Static_assertdeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#static_assertdeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitStatic_assertdeclaration(cppParser.Static_assertdeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#emptydeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterEmptydeclaration(cppParser.EmptydeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#emptydeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitEmptydeclaration(cppParser.EmptydeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#attributedeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterAttributedeclaration(cppParser.AttributedeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#attributedeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitAttributedeclaration(cppParser.AttributedeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#declspecifier}.
	 * @param ctx the preParse tree
	 */
	void enterDeclspecifier(cppParser.DeclspecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#declspecifier}.
	 * @param ctx the preParse tree
	 */
	void exitDeclspecifier(cppParser.DeclspecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#declspecifierseq}.
	 * @param ctx the preParse tree
	 */
	void enterDeclspecifierseq(cppParser.DeclspecifierseqContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#declspecifierseq}.
	 * @param ctx the preParse tree
	 */
	void exitDeclspecifierseq(cppParser.DeclspecifierseqContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#storageclassspecifier}.
	 * @param ctx the preParse tree
	 */
	void enterStorageclassspecifier(cppParser.StorageclassspecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#storageclassspecifier}.
	 * @param ctx the preParse tree
	 */
	void exitStorageclassspecifier(cppParser.StorageclassspecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#functionspecifier}.
	 * @param ctx the preParse tree
	 */
	void enterFunctionspecifier(cppParser.FunctionspecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#functionspecifier}.
	 * @param ctx the preParse tree
	 */
	void exitFunctionspecifier(cppParser.FunctionspecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#typedefname}.
	 * @param ctx the preParse tree
	 */
	void enterTypedefname(cppParser.TypedefnameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#typedefname}.
	 * @param ctx the preParse tree
	 */
	void exitTypedefname(cppParser.TypedefnameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#typespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterTypespecifier(cppParser.TypespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#typespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitTypespecifier(cppParser.TypespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#trailingtypespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterTrailingtypespecifier(cppParser.TrailingtypespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#trailingtypespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitTrailingtypespecifier(cppParser.TrailingtypespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#typespecifierseq}.
	 * @param ctx the preParse tree
	 */
	void enterTypespecifierseq(cppParser.TypespecifierseqContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#typespecifierseq}.
	 * @param ctx the preParse tree
	 */
	void exitTypespecifierseq(cppParser.TypespecifierseqContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#trailingtypespecifierseq}.
	 * @param ctx the preParse tree
	 */
	void enterTrailingtypespecifierseq(cppParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#trailingtypespecifierseq}.
	 * @param ctx the preParse tree
	 */
	void exitTrailingtypespecifierseq(cppParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#simpletypespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterSimpletypespecifier(cppParser.SimpletypespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#simpletypespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitSimpletypespecifier(cppParser.SimpletypespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#typename}.
	 * @param ctx the preParse tree
	 */
	void enterTypename(cppParser.TypenameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#typename}.
	 * @param ctx the preParse tree
	 */
	void exitTypename(cppParser.TypenameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#decltypespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterDecltypespecifier(cppParser.DecltypespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#decltypespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitDecltypespecifier(cppParser.DecltypespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#elaboratedtypespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterElaboratedtypespecifier(cppParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#elaboratedtypespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitElaboratedtypespecifier(cppParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#enumname}.
	 * @param ctx the preParse tree
	 */
	void enterEnumname(cppParser.EnumnameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#enumname}.
	 * @param ctx the preParse tree
	 */
	void exitEnumname(cppParser.EnumnameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#enumspecifier}.
	 * @param ctx the preParse tree
	 */
	void enterEnumspecifier(cppParser.EnumspecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#enumspecifier}.
	 * @param ctx the preParse tree
	 */
	void exitEnumspecifier(cppParser.EnumspecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#enumhead}.
	 * @param ctx the preParse tree
	 */
	void enterEnumhead(cppParser.EnumheadContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#enumhead}.
	 * @param ctx the preParse tree
	 */
	void exitEnumhead(cppParser.EnumheadContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#opaqueenumdeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterOpaqueenumdeclaration(cppParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#opaqueenumdeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitOpaqueenumdeclaration(cppParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#enumkey}.
	 * @param ctx the preParse tree
	 */
	void enterEnumkey(cppParser.EnumkeyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#enumkey}.
	 * @param ctx the preParse tree
	 */
	void exitEnumkey(cppParser.EnumkeyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#enumbase}.
	 * @param ctx the preParse tree
	 */
	void enterEnumbase(cppParser.EnumbaseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#enumbase}.
	 * @param ctx the preParse tree
	 */
	void exitEnumbase(cppParser.EnumbaseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#enumeratorlist}.
	 * @param ctx the preParse tree
	 */
	void enterEnumeratorlist(cppParser.EnumeratorlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#enumeratorlist}.
	 * @param ctx the preParse tree
	 */
	void exitEnumeratorlist(cppParser.EnumeratorlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#enumeratordefinition}.
	 * @param ctx the preParse tree
	 */
	void enterEnumeratordefinition(cppParser.EnumeratordefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#enumeratordefinition}.
	 * @param ctx the preParse tree
	 */
	void exitEnumeratordefinition(cppParser.EnumeratordefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#enumerator}.
	 * @param ctx the preParse tree
	 */
	void enterEnumerator(cppParser.EnumeratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#enumerator}.
	 * @param ctx the preParse tree
	 */
	void exitEnumerator(cppParser.EnumeratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#namespacename}.
	 * @param ctx the preParse tree
	 */
	void enterNamespacename(cppParser.NamespacenameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#namespacename}.
	 * @param ctx the preParse tree
	 */
	void exitNamespacename(cppParser.NamespacenameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#originalnamespacename}.
	 * @param ctx the preParse tree
	 */
	void enterOriginalnamespacename(cppParser.OriginalnamespacenameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#originalnamespacename}.
	 * @param ctx the preParse tree
	 */
	void exitOriginalnamespacename(cppParser.OriginalnamespacenameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#namespacedefinition}.
	 * @param ctx the preParse tree
	 */
	void enterNamespacedefinition(cppParser.NamespacedefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#namespacedefinition}.
	 * @param ctx the preParse tree
	 */
	void exitNamespacedefinition(cppParser.NamespacedefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#namednamespacedefinition}.
	 * @param ctx the preParse tree
	 */
	void enterNamednamespacedefinition(cppParser.NamednamespacedefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#namednamespacedefinition}.
	 * @param ctx the preParse tree
	 */
	void exitNamednamespacedefinition(cppParser.NamednamespacedefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#originalnamespacedefinition}.
	 * @param ctx the preParse tree
	 */
	void enterOriginalnamespacedefinition(cppParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#originalnamespacedefinition}.
	 * @param ctx the preParse tree
	 */
	void exitOriginalnamespacedefinition(cppParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#extensionnamespacedefinition}.
	 * @param ctx the preParse tree
	 */
	void enterExtensionnamespacedefinition(cppParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#extensionnamespacedefinition}.
	 * @param ctx the preParse tree
	 */
	void exitExtensionnamespacedefinition(cppParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#unnamednamespacedefinition}.
	 * @param ctx the preParse tree
	 */
	void enterUnnamednamespacedefinition(cppParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#unnamednamespacedefinition}.
	 * @param ctx the preParse tree
	 */
	void exitUnnamednamespacedefinition(cppParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#namespacebody}.
	 * @param ctx the preParse tree
	 */
	void enterNamespacebody(cppParser.NamespacebodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#namespacebody}.
	 * @param ctx the preParse tree
	 */
	void exitNamespacebody(cppParser.NamespacebodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#namespacealias}.
	 * @param ctx the preParse tree
	 */
	void enterNamespacealias(cppParser.NamespacealiasContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#namespacealias}.
	 * @param ctx the preParse tree
	 */
	void exitNamespacealias(cppParser.NamespacealiasContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#namespacealiasdefinition}.
	 * @param ctx the preParse tree
	 */
	void enterNamespacealiasdefinition(cppParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#namespacealiasdefinition}.
	 * @param ctx the preParse tree
	 */
	void exitNamespacealiasdefinition(cppParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#qualifiednamespacespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterQualifiednamespacespecifier(cppParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#qualifiednamespacespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitQualifiednamespacespecifier(cppParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#usingdeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterUsingdeclaration(cppParser.UsingdeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#usingdeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitUsingdeclaration(cppParser.UsingdeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#usingdirective}.
	 * @param ctx the preParse tree
	 */
	void enterUsingdirective(cppParser.UsingdirectiveContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#usingdirective}.
	 * @param ctx the preParse tree
	 */
	void exitUsingdirective(cppParser.UsingdirectiveContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#asmdefinition}.
	 * @param ctx the preParse tree
	 */
	void enterAsmdefinition(cppParser.AsmdefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#asmdefinition}.
	 * @param ctx the preParse tree
	 */
	void exitAsmdefinition(cppParser.AsmdefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#linkagespecification}.
	 * @param ctx the preParse tree
	 */
	void enterLinkagespecification(cppParser.LinkagespecificationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#linkagespecification}.
	 * @param ctx the preParse tree
	 */
	void exitLinkagespecification(cppParser.LinkagespecificationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#attributespecifierseq}.
	 * @param ctx the preParse tree
	 */
	void enterAttributespecifierseq(cppParser.AttributespecifierseqContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#attributespecifierseq}.
	 * @param ctx the preParse tree
	 */
	void exitAttributespecifierseq(cppParser.AttributespecifierseqContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#attributespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterAttributespecifier(cppParser.AttributespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#attributespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitAttributespecifier(cppParser.AttributespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#alignmentspecifier}.
	 * @param ctx the preParse tree
	 */
	void enterAlignmentspecifier(cppParser.AlignmentspecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#alignmentspecifier}.
	 * @param ctx the preParse tree
	 */
	void exitAlignmentspecifier(cppParser.AlignmentspecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#attributelist}.
	 * @param ctx the preParse tree
	 */
	void enterAttributelist(cppParser.AttributelistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#attributelist}.
	 * @param ctx the preParse tree
	 */
	void exitAttributelist(cppParser.AttributelistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#attribute}.
	 * @param ctx the preParse tree
	 */
	void enterAttribute(cppParser.AttributeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#attribute}.
	 * @param ctx the preParse tree
	 */
	void exitAttribute(cppParser.AttributeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#attributetoken}.
	 * @param ctx the preParse tree
	 */
	void enterAttributetoken(cppParser.AttributetokenContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#attributetoken}.
	 * @param ctx the preParse tree
	 */
	void exitAttributetoken(cppParser.AttributetokenContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#attributescopedtoken}.
	 * @param ctx the preParse tree
	 */
	void enterAttributescopedtoken(cppParser.AttributescopedtokenContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#attributescopedtoken}.
	 * @param ctx the preParse tree
	 */
	void exitAttributescopedtoken(cppParser.AttributescopedtokenContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#attributenamespace}.
	 * @param ctx the preParse tree
	 */
	void enterAttributenamespace(cppParser.AttributenamespaceContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#attributenamespace}.
	 * @param ctx the preParse tree
	 */
	void exitAttributenamespace(cppParser.AttributenamespaceContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#attributeargumentclause}.
	 * @param ctx the preParse tree
	 */
	void enterAttributeargumentclause(cppParser.AttributeargumentclauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#attributeargumentclause}.
	 * @param ctx the preParse tree
	 */
	void exitAttributeargumentclause(cppParser.AttributeargumentclauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#balancedtokenseq}.
	 * @param ctx the preParse tree
	 */
	void enterBalancedtokenseq(cppParser.BalancedtokenseqContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#balancedtokenseq}.
	 * @param ctx the preParse tree
	 */
	void exitBalancedtokenseq(cppParser.BalancedtokenseqContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#balancedtoken}.
	 * @param ctx the preParse tree
	 */
	void enterBalancedtoken(cppParser.BalancedtokenContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#balancedtoken}.
	 * @param ctx the preParse tree
	 */
	void exitBalancedtoken(cppParser.BalancedtokenContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#initdeclaratorlist}.
	 * @param ctx the preParse tree
	 */
	void enterInitdeclaratorlist(cppParser.InitdeclaratorlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#initdeclaratorlist}.
	 * @param ctx the preParse tree
	 */
	void exitInitdeclaratorlist(cppParser.InitdeclaratorlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#initdeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterInitdeclarator(cppParser.InitdeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#initdeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitInitdeclarator(cppParser.InitdeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#declarator}.
	 * @param ctx the preParse tree
	 */
	void enterDeclarator(cppParser.DeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#declarator}.
	 * @param ctx the preParse tree
	 */
	void exitDeclarator(cppParser.DeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#ptrdeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterPtrdeclarator(cppParser.PtrdeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#ptrdeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitPtrdeclarator(cppParser.PtrdeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#noptrdeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterNoptrdeclarator(cppParser.NoptrdeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#noptrdeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitNoptrdeclarator(cppParser.NoptrdeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#parametersandqualifiers}.
	 * @param ctx the preParse tree
	 */
	void enterParametersandqualifiers(cppParser.ParametersandqualifiersContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#parametersandqualifiers}.
	 * @param ctx the preParse tree
	 */
	void exitParametersandqualifiers(cppParser.ParametersandqualifiersContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#trailingreturntype}.
	 * @param ctx the preParse tree
	 */
	void enterTrailingreturntype(cppParser.TrailingreturntypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#trailingreturntype}.
	 * @param ctx the preParse tree
	 */
	void exitTrailingreturntype(cppParser.TrailingreturntypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#ptroperator}.
	 * @param ctx the preParse tree
	 */
	void enterPtroperator(cppParser.PtroperatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#ptroperator}.
	 * @param ctx the preParse tree
	 */
	void exitPtroperator(cppParser.PtroperatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#cvqualifierseq}.
	 * @param ctx the preParse tree
	 */
	void enterCvqualifierseq(cppParser.CvqualifierseqContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#cvqualifierseq}.
	 * @param ctx the preParse tree
	 */
	void exitCvqualifierseq(cppParser.CvqualifierseqContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#cvqualifier}.
	 * @param ctx the preParse tree
	 */
	void enterCvqualifier(cppParser.CvqualifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#cvqualifier}.
	 * @param ctx the preParse tree
	 */
	void exitCvqualifier(cppParser.CvqualifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#refqualifier}.
	 * @param ctx the preParse tree
	 */
	void enterRefqualifier(cppParser.RefqualifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#refqualifier}.
	 * @param ctx the preParse tree
	 */
	void exitRefqualifier(cppParser.RefqualifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#declaratorid}.
	 * @param ctx the preParse tree
	 */
	void enterDeclaratorid(cppParser.DeclaratoridContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#declaratorid}.
	 * @param ctx the preParse tree
	 */
	void exitDeclaratorid(cppParser.DeclaratoridContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#typeid}.
	 * @param ctx the preParse tree
	 */
	void enterTypeid(cppParser.TypeidContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#typeid}.
	 * @param ctx the preParse tree
	 */
	void exitTypeid(cppParser.TypeidContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#abstractdeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterAbstractdeclarator(cppParser.AbstractdeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#abstractdeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitAbstractdeclarator(cppParser.AbstractdeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#ptrabstractdeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterPtrabstractdeclarator(cppParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#ptrabstractdeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitPtrabstractdeclarator(cppParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#noptrabstractdeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterNoptrabstractdeclarator(cppParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#noptrabstractdeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitNoptrabstractdeclarator(cppParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#abstractpackdeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterAbstractpackdeclarator(cppParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#abstractpackdeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitAbstractpackdeclarator(cppParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#noptrabstractpackdeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterNoptrabstractpackdeclarator(cppParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#noptrabstractpackdeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitNoptrabstractpackdeclarator(cppParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#parameterdeclarationclause}.
	 * @param ctx the preParse tree
	 */
	void enterParameterdeclarationclause(cppParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#parameterdeclarationclause}.
	 * @param ctx the preParse tree
	 */
	void exitParameterdeclarationclause(cppParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#parameterdeclarationlist}.
	 * @param ctx the preParse tree
	 */
	void enterParameterdeclarationlist(cppParser.ParameterdeclarationlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#parameterdeclarationlist}.
	 * @param ctx the preParse tree
	 */
	void exitParameterdeclarationlist(cppParser.ParameterdeclarationlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#parameterdeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterParameterdeclaration(cppParser.ParameterdeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#parameterdeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitParameterdeclaration(cppParser.ParameterdeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#functiondefinition}.
	 * @param ctx the preParse tree
	 */
	void enterFunctiondefinition(cppParser.FunctiondefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#functiondefinition}.
	 * @param ctx the preParse tree
	 */
	void exitFunctiondefinition(cppParser.FunctiondefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#functionbody}.
	 * @param ctx the preParse tree
	 */
	void enterFunctionbody(cppParser.FunctionbodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#functionbody}.
	 * @param ctx the preParse tree
	 */
	void exitFunctionbody(cppParser.FunctionbodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#initializer}.
	 * @param ctx the preParse tree
	 */
	void enterInitializer(cppParser.InitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#initializer}.
	 * @param ctx the preParse tree
	 */
	void exitInitializer(cppParser.InitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#braceorequalinitializer}.
	 * @param ctx the preParse tree
	 */
	void enterBraceorequalinitializer(cppParser.BraceorequalinitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#braceorequalinitializer}.
	 * @param ctx the preParse tree
	 */
	void exitBraceorequalinitializer(cppParser.BraceorequalinitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#initializerclause}.
	 * @param ctx the preParse tree
	 */
	void enterInitializerclause(cppParser.InitializerclauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#initializerclause}.
	 * @param ctx the preParse tree
	 */
	void exitInitializerclause(cppParser.InitializerclauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#initializerlist}.
	 * @param ctx the preParse tree
	 */
	void enterInitializerlist(cppParser.InitializerlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#initializerlist}.
	 * @param ctx the preParse tree
	 */
	void exitInitializerlist(cppParser.InitializerlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#bracedinitlist}.
	 * @param ctx the preParse tree
	 */
	void enterBracedinitlist(cppParser.BracedinitlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#bracedinitlist}.
	 * @param ctx the preParse tree
	 */
	void exitBracedinitlist(cppParser.BracedinitlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#classname}.
	 * @param ctx the preParse tree
	 */
	void enterClassname(cppParser.ClassnameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#classname}.
	 * @param ctx the preParse tree
	 */
	void exitClassname(cppParser.ClassnameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#classspecifier}.
	 * @param ctx the preParse tree
	 */
	void enterClassspecifier(cppParser.ClassspecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#classspecifier}.
	 * @param ctx the preParse tree
	 */
	void exitClassspecifier(cppParser.ClassspecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#classhead}.
	 * @param ctx the preParse tree
	 */
	void enterClasshead(cppParser.ClassheadContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#classhead}.
	 * @param ctx the preParse tree
	 */
	void exitClasshead(cppParser.ClassheadContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#classheadname}.
	 * @param ctx the preParse tree
	 */
	void enterClassheadname(cppParser.ClassheadnameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#classheadname}.
	 * @param ctx the preParse tree
	 */
	void exitClassheadname(cppParser.ClassheadnameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#classvirtspecifier}.
	 * @param ctx the preParse tree
	 */
	void enterClassvirtspecifier(cppParser.ClassvirtspecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#classvirtspecifier}.
	 * @param ctx the preParse tree
	 */
	void exitClassvirtspecifier(cppParser.ClassvirtspecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#classkey}.
	 * @param ctx the preParse tree
	 */
	void enterClasskey(cppParser.ClasskeyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#classkey}.
	 * @param ctx the preParse tree
	 */
	void exitClasskey(cppParser.ClasskeyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#memberspecification}.
	 * @param ctx the preParse tree
	 */
	void enterMemberspecification(cppParser.MemberspecificationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#memberspecification}.
	 * @param ctx the preParse tree
	 */
	void exitMemberspecification(cppParser.MemberspecificationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#memberdeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterMemberdeclaration(cppParser.MemberdeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#memberdeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitMemberdeclaration(cppParser.MemberdeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#memberdeclaratorlist}.
	 * @param ctx the preParse tree
	 */
	void enterMemberdeclaratorlist(cppParser.MemberdeclaratorlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#memberdeclaratorlist}.
	 * @param ctx the preParse tree
	 */
	void exitMemberdeclaratorlist(cppParser.MemberdeclaratorlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#memberdeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterMemberdeclarator(cppParser.MemberdeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#memberdeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitMemberdeclarator(cppParser.MemberdeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#virtspecifierseq}.
	 * @param ctx the preParse tree
	 */
	void enterVirtspecifierseq(cppParser.VirtspecifierseqContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#virtspecifierseq}.
	 * @param ctx the preParse tree
	 */
	void exitVirtspecifierseq(cppParser.VirtspecifierseqContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#virtspecifier}.
	 * @param ctx the preParse tree
	 */
	void enterVirtspecifier(cppParser.VirtspecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#virtspecifier}.
	 * @param ctx the preParse tree
	 */
	void exitVirtspecifier(cppParser.VirtspecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#purespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterPurespecifier(cppParser.PurespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#purespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitPurespecifier(cppParser.PurespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#baseclause}.
	 * @param ctx the preParse tree
	 */
	void enterBaseclause(cppParser.BaseclauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#baseclause}.
	 * @param ctx the preParse tree
	 */
	void exitBaseclause(cppParser.BaseclauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#basespecifierlist}.
	 * @param ctx the preParse tree
	 */
	void enterBasespecifierlist(cppParser.BasespecifierlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#basespecifierlist}.
	 * @param ctx the preParse tree
	 */
	void exitBasespecifierlist(cppParser.BasespecifierlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#basespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterBasespecifier(cppParser.BasespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#basespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitBasespecifier(cppParser.BasespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#classordecltype}.
	 * @param ctx the preParse tree
	 */
	void enterClassordecltype(cppParser.ClassordecltypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#classordecltype}.
	 * @param ctx the preParse tree
	 */
	void exitClassordecltype(cppParser.ClassordecltypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#basetypespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterBasetypespecifier(cppParser.BasetypespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#basetypespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitBasetypespecifier(cppParser.BasetypespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#accessspecifier}.
	 * @param ctx the preParse tree
	 */
	void enterAccessspecifier(cppParser.AccessspecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#accessspecifier}.
	 * @param ctx the preParse tree
	 */
	void exitAccessspecifier(cppParser.AccessspecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#conversionfunctionid}.
	 * @param ctx the preParse tree
	 */
	void enterConversionfunctionid(cppParser.ConversionfunctionidContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#conversionfunctionid}.
	 * @param ctx the preParse tree
	 */
	void exitConversionfunctionid(cppParser.ConversionfunctionidContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#conversiontypeid}.
	 * @param ctx the preParse tree
	 */
	void enterConversiontypeid(cppParser.ConversiontypeidContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#conversiontypeid}.
	 * @param ctx the preParse tree
	 */
	void exitConversiontypeid(cppParser.ConversiontypeidContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#conversiondeclarator}.
	 * @param ctx the preParse tree
	 */
	void enterConversiondeclarator(cppParser.ConversiondeclaratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#conversiondeclarator}.
	 * @param ctx the preParse tree
	 */
	void exitConversiondeclarator(cppParser.ConversiondeclaratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#ctorinitializer}.
	 * @param ctx the preParse tree
	 */
	void enterCtorinitializer(cppParser.CtorinitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#ctorinitializer}.
	 * @param ctx the preParse tree
	 */
	void exitCtorinitializer(cppParser.CtorinitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#meminitializerlist}.
	 * @param ctx the preParse tree
	 */
	void enterMeminitializerlist(cppParser.MeminitializerlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#meminitializerlist}.
	 * @param ctx the preParse tree
	 */
	void exitMeminitializerlist(cppParser.MeminitializerlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#meminitializer}.
	 * @param ctx the preParse tree
	 */
	void enterMeminitializer(cppParser.MeminitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#meminitializer}.
	 * @param ctx the preParse tree
	 */
	void exitMeminitializer(cppParser.MeminitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#meminitializerid}.
	 * @param ctx the preParse tree
	 */
	void enterMeminitializerid(cppParser.MeminitializeridContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#meminitializerid}.
	 * @param ctx the preParse tree
	 */
	void exitMeminitializerid(cppParser.MeminitializeridContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#operatorfunctionid}.
	 * @param ctx the preParse tree
	 */
	void enterOperatorfunctionid(cppParser.OperatorfunctionidContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#operatorfunctionid}.
	 * @param ctx the preParse tree
	 */
	void exitOperatorfunctionid(cppParser.OperatorfunctionidContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#literaloperatorid}.
	 * @param ctx the preParse tree
	 */
	void enterLiteraloperatorid(cppParser.LiteraloperatoridContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#literaloperatorid}.
	 * @param ctx the preParse tree
	 */
	void exitLiteraloperatorid(cppParser.LiteraloperatoridContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#templatedeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterTemplatedeclaration(cppParser.TemplatedeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#templatedeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitTemplatedeclaration(cppParser.TemplatedeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#templateparameterlist}.
	 * @param ctx the preParse tree
	 */
	void enterTemplateparameterlist(cppParser.TemplateparameterlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#templateparameterlist}.
	 * @param ctx the preParse tree
	 */
	void exitTemplateparameterlist(cppParser.TemplateparameterlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#templateparameter}.
	 * @param ctx the preParse tree
	 */
	void enterTemplateparameter(cppParser.TemplateparameterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#templateparameter}.
	 * @param ctx the preParse tree
	 */
	void exitTemplateparameter(cppParser.TemplateparameterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#typeparameter}.
	 * @param ctx the preParse tree
	 */
	void enterTypeparameter(cppParser.TypeparameterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#typeparameter}.
	 * @param ctx the preParse tree
	 */
	void exitTypeparameter(cppParser.TypeparameterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#simpletemplateid}.
	 * @param ctx the preParse tree
	 */
	void enterSimpletemplateid(cppParser.SimpletemplateidContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#simpletemplateid}.
	 * @param ctx the preParse tree
	 */
	void exitSimpletemplateid(cppParser.SimpletemplateidContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#templateid}.
	 * @param ctx the preParse tree
	 */
	void enterTemplateid(cppParser.TemplateidContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#templateid}.
	 * @param ctx the preParse tree
	 */
	void exitTemplateid(cppParser.TemplateidContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#templatename}.
	 * @param ctx the preParse tree
	 */
	void enterTemplatename(cppParser.TemplatenameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#templatename}.
	 * @param ctx the preParse tree
	 */
	void exitTemplatename(cppParser.TemplatenameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#templateargumentlist}.
	 * @param ctx the preParse tree
	 */
	void enterTemplateargumentlist(cppParser.TemplateargumentlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#templateargumentlist}.
	 * @param ctx the preParse tree
	 */
	void exitTemplateargumentlist(cppParser.TemplateargumentlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#templateargument}.
	 * @param ctx the preParse tree
	 */
	void enterTemplateargument(cppParser.TemplateargumentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#templateargument}.
	 * @param ctx the preParse tree
	 */
	void exitTemplateargument(cppParser.TemplateargumentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#typenamespecifier}.
	 * @param ctx the preParse tree
	 */
	void enterTypenamespecifier(cppParser.TypenamespecifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#typenamespecifier}.
	 * @param ctx the preParse tree
	 */
	void exitTypenamespecifier(cppParser.TypenamespecifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#explicitinstantiation}.
	 * @param ctx the preParse tree
	 */
	void enterExplicitinstantiation(cppParser.ExplicitinstantiationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#explicitinstantiation}.
	 * @param ctx the preParse tree
	 */
	void exitExplicitinstantiation(cppParser.ExplicitinstantiationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#explicitspecialization}.
	 * @param ctx the preParse tree
	 */
	void enterExplicitspecialization(cppParser.ExplicitspecializationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#explicitspecialization}.
	 * @param ctx the preParse tree
	 */
	void exitExplicitspecialization(cppParser.ExplicitspecializationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#tryblock}.
	 * @param ctx the preParse tree
	 */
	void enterTryblock(cppParser.TryblockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#tryblock}.
	 * @param ctx the preParse tree
	 */
	void exitTryblock(cppParser.TryblockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#functiontryblock}.
	 * @param ctx the preParse tree
	 */
	void enterFunctiontryblock(cppParser.FunctiontryblockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#functiontryblock}.
	 * @param ctx the preParse tree
	 */
	void exitFunctiontryblock(cppParser.FunctiontryblockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#handlerseq}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerseq(cppParser.HandlerseqContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#handlerseq}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerseq(cppParser.HandlerseqContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#handler}.
	 * @param ctx the preParse tree
	 */
	void enterHandler(cppParser.HandlerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#handler}.
	 * @param ctx the preParse tree
	 */
	void exitHandler(cppParser.HandlerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#exceptiondeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterExceptiondeclaration(cppParser.ExceptiondeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#exceptiondeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitExceptiondeclaration(cppParser.ExceptiondeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#throwexpression}.
	 * @param ctx the preParse tree
	 */
	void enterThrowexpression(cppParser.ThrowexpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#throwexpression}.
	 * @param ctx the preParse tree
	 */
	void exitThrowexpression(cppParser.ThrowexpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#exceptionspecification}.
	 * @param ctx the preParse tree
	 */
	void enterExceptionspecification(cppParser.ExceptionspecificationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#exceptionspecification}.
	 * @param ctx the preParse tree
	 */
	void exitExceptionspecification(cppParser.ExceptionspecificationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#dynamicexceptionspecification}.
	 * @param ctx the preParse tree
	 */
	void enterDynamicexceptionspecification(cppParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#dynamicexceptionspecification}.
	 * @param ctx the preParse tree
	 */
	void exitDynamicexceptionspecification(cppParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#typeidlist}.
	 * @param ctx the preParse tree
	 */
	void enterTypeidlist(cppParser.TypeidlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#typeidlist}.
	 * @param ctx the preParse tree
	 */
	void exitTypeidlist(cppParser.TypeidlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#noexceptspecification}.
	 * @param ctx the preParse tree
	 */
	void enterNoexceptspecification(cppParser.NoexceptspecificationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#noexceptspecification}.
	 * @param ctx the preParse tree
	 */
	void exitNoexceptspecification(cppParser.NoexceptspecificationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#rightShift}.
	 * @param ctx the preParse tree
	 */
	void enterRightShift(cppParser.RightShiftContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#rightShift}.
	 * @param ctx the preParse tree
	 */
	void exitRightShift(cppParser.RightShiftContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#rightShiftAssign}.
	 * @param ctx the preParse tree
	 */
	void enterRightShiftAssign(cppParser.RightShiftAssignContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#rightShiftAssign}.
	 * @param ctx the preParse tree
	 */
	void exitRightShiftAssign(cppParser.RightShiftAssignContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#operator}.
	 * @param ctx the preParse tree
	 */
	void enterOperator(cppParser.OperatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#operator}.
	 * @param ctx the preParse tree
	 */
	void exitOperator(cppParser.OperatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#literal}.
	 * @param ctx the preParse tree
	 */
	void enterLiteral(cppParser.LiteralContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#literal}.
	 * @param ctx the preParse tree
	 */
	void exitLiteral(cppParser.LiteralContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#booleanliteral}.
	 * @param ctx the preParse tree
	 */
	void enterBooleanliteral(cppParser.BooleanliteralContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#booleanliteral}.
	 * @param ctx the preParse tree
	 */
	void exitBooleanliteral(cppParser.BooleanliteralContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#pointerliteral}.
	 * @param ctx the preParse tree
	 */
	void enterPointerliteral(cppParser.PointerliteralContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#pointerliteral}.
	 * @param ctx the preParse tree
	 */
	void exitPointerliteral(cppParser.PointerliteralContext ctx);
	/**
	 * Enter a preParse tree produced by {@link cppParser#userdefinedliteral}.
	 * @param ctx the preParse tree
	 */
	void enterUserdefinedliteral(cppParser.UserdefinedliteralContext ctx);
	/**
	 * Exit a preParse tree produced by {@link cppParser#userdefinedliteral}.
	 * @param ctx the preParse tree
	 */
	void exitUserdefinedliteral(cppParser.UserdefinedliteralContext ctx);
}