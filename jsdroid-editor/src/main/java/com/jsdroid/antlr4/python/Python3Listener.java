// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/python\Python3.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.python;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link Python3Parser}.
 */
public interface Python3Listener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the preParse tree
	 */
	void enterSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the preParse tree
	 */
	void exitSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the preParse tree
	 */
	void enterFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the preParse tree
	 */
	void exitFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#eval_input}.
	 * @param ctx the preParse tree
	 */
	void enterEval_input(Python3Parser.Eval_inputContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#eval_input}.
	 * @param ctx the preParse tree
	 */
	void exitEval_input(Python3Parser.Eval_inputContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#decorator}.
	 * @param ctx the preParse tree
	 */
	void enterDecorator(Python3Parser.DecoratorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#decorator}.
	 * @param ctx the preParse tree
	 */
	void exitDecorator(Python3Parser.DecoratorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#decorators}.
	 * @param ctx the preParse tree
	 */
	void enterDecorators(Python3Parser.DecoratorsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#decorators}.
	 * @param ctx the preParse tree
	 */
	void exitDecorators(Python3Parser.DecoratorsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#decorated}.
	 * @param ctx the preParse tree
	 */
	void enterDecorated(Python3Parser.DecoratedContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#decorated}.
	 * @param ctx the preParse tree
	 */
	void exitDecorated(Python3Parser.DecoratedContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#funcdef}.
	 * @param ctx the preParse tree
	 */
	void enterFuncdef(Python3Parser.FuncdefContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#funcdef}.
	 * @param ctx the preParse tree
	 */
	void exitFuncdef(Python3Parser.FuncdefContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#parameters}.
	 * @param ctx the preParse tree
	 */
	void enterParameters(Python3Parser.ParametersContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#parameters}.
	 * @param ctx the preParse tree
	 */
	void exitParameters(Python3Parser.ParametersContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#typedargslist}.
	 * @param ctx the preParse tree
	 */
	void enterTypedargslist(Python3Parser.TypedargslistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#typedargslist}.
	 * @param ctx the preParse tree
	 */
	void exitTypedargslist(Python3Parser.TypedargslistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#tfpdef}.
	 * @param ctx the preParse tree
	 */
	void enterTfpdef(Python3Parser.TfpdefContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#tfpdef}.
	 * @param ctx the preParse tree
	 */
	void exitTfpdef(Python3Parser.TfpdefContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#varargslist}.
	 * @param ctx the preParse tree
	 */
	void enterVarargslist(Python3Parser.VarargslistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#varargslist}.
	 * @param ctx the preParse tree
	 */
	void exitVarargslist(Python3Parser.VarargslistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#vfpdef}.
	 * @param ctx the preParse tree
	 */
	void enterVfpdef(Python3Parser.VfpdefContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#vfpdef}.
	 * @param ctx the preParse tree
	 */
	void exitVfpdef(Python3Parser.VfpdefContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the preParse tree
	 */
	void enterStmt(Python3Parser.StmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the preParse tree
	 */
	void exitStmt(Python3Parser.StmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#simple_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterSimple_stmt(Python3Parser.Simple_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#simple_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitSimple_stmt(Python3Parser.Simple_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#small_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterSmall_stmt(Python3Parser.Small_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#small_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitSmall_stmt(Python3Parser.Small_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#expr_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterExpr_stmt(Python3Parser.Expr_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#expr_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitExpr_stmt(Python3Parser.Expr_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#testlist_star_expr}.
	 * @param ctx the preParse tree
	 */
	void enterTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#testlist_star_expr}.
	 * @param ctx the preParse tree
	 */
	void exitTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#augassign}.
	 * @param ctx the preParse tree
	 */
	void enterAugassign(Python3Parser.AugassignContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#augassign}.
	 * @param ctx the preParse tree
	 */
	void exitAugassign(Python3Parser.AugassignContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#del_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterDel_stmt(Python3Parser.Del_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#del_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitDel_stmt(Python3Parser.Del_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#pass_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterPass_stmt(Python3Parser.Pass_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#pass_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitPass_stmt(Python3Parser.Pass_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#flow_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterFlow_stmt(Python3Parser.Flow_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#flow_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitFlow_stmt(Python3Parser.Flow_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#break_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterBreak_stmt(Python3Parser.Break_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#break_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitBreak_stmt(Python3Parser.Break_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#continue_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterContinue_stmt(Python3Parser.Continue_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#continue_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitContinue_stmt(Python3Parser.Continue_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#return_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterReturn_stmt(Python3Parser.Return_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#return_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitReturn_stmt(Python3Parser.Return_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#yield_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterYield_stmt(Python3Parser.Yield_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#yield_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitYield_stmt(Python3Parser.Yield_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#raise_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterRaise_stmt(Python3Parser.Raise_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#raise_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitRaise_stmt(Python3Parser.Raise_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#import_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterImport_stmt(Python3Parser.Import_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#import_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitImport_stmt(Python3Parser.Import_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#import_name}.
	 * @param ctx the preParse tree
	 */
	void enterImport_name(Python3Parser.Import_nameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#import_name}.
	 * @param ctx the preParse tree
	 */
	void exitImport_name(Python3Parser.Import_nameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#import_from}.
	 * @param ctx the preParse tree
	 */
	void enterImport_from(Python3Parser.Import_fromContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#import_from}.
	 * @param ctx the preParse tree
	 */
	void exitImport_from(Python3Parser.Import_fromContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#import_as_name}.
	 * @param ctx the preParse tree
	 */
	void enterImport_as_name(Python3Parser.Import_as_nameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#import_as_name}.
	 * @param ctx the preParse tree
	 */
	void exitImport_as_name(Python3Parser.Import_as_nameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#dotted_as_name}.
	 * @param ctx the preParse tree
	 */
	void enterDotted_as_name(Python3Parser.Dotted_as_nameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#dotted_as_name}.
	 * @param ctx the preParse tree
	 */
	void exitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#import_as_names}.
	 * @param ctx the preParse tree
	 */
	void enterImport_as_names(Python3Parser.Import_as_namesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#import_as_names}.
	 * @param ctx the preParse tree
	 */
	void exitImport_as_names(Python3Parser.Import_as_namesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#dotted_as_names}.
	 * @param ctx the preParse tree
	 */
	void enterDotted_as_names(Python3Parser.Dotted_as_namesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#dotted_as_names}.
	 * @param ctx the preParse tree
	 */
	void exitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#dotted_name}.
	 * @param ctx the preParse tree
	 */
	void enterDotted_name(Python3Parser.Dotted_nameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#dotted_name}.
	 * @param ctx the preParse tree
	 */
	void exitDotted_name(Python3Parser.Dotted_nameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#global_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterGlobal_stmt(Python3Parser.Global_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#global_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitGlobal_stmt(Python3Parser.Global_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#nonlocal_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#nonlocal_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#assert_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterAssert_stmt(Python3Parser.Assert_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#assert_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitAssert_stmt(Python3Parser.Assert_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#compound_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterCompound_stmt(Python3Parser.Compound_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#compound_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitCompound_stmt(Python3Parser.Compound_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#if_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterIf_stmt(Python3Parser.If_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#if_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitIf_stmt(Python3Parser.If_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#while_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterWhile_stmt(Python3Parser.While_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#while_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitWhile_stmt(Python3Parser.While_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#for_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterFor_stmt(Python3Parser.For_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#for_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitFor_stmt(Python3Parser.For_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#try_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterTry_stmt(Python3Parser.Try_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#try_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitTry_stmt(Python3Parser.Try_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#with_stmt}.
	 * @param ctx the preParse tree
	 */
	void enterWith_stmt(Python3Parser.With_stmtContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#with_stmt}.
	 * @param ctx the preParse tree
	 */
	void exitWith_stmt(Python3Parser.With_stmtContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#with_item}.
	 * @param ctx the preParse tree
	 */
	void enterWith_item(Python3Parser.With_itemContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#with_item}.
	 * @param ctx the preParse tree
	 */
	void exitWith_item(Python3Parser.With_itemContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#except_clause}.
	 * @param ctx the preParse tree
	 */
	void enterExcept_clause(Python3Parser.Except_clauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#except_clause}.
	 * @param ctx the preParse tree
	 */
	void exitExcept_clause(Python3Parser.Except_clauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the preParse tree
	 */
	void enterSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the preParse tree
	 */
	void exitSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#test}.
	 * @param ctx the preParse tree
	 */
	void enterTest(Python3Parser.TestContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#test}.
	 * @param ctx the preParse tree
	 */
	void exitTest(Python3Parser.TestContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#test_nocond}.
	 * @param ctx the preParse tree
	 */
	void enterTest_nocond(Python3Parser.Test_nocondContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#test_nocond}.
	 * @param ctx the preParse tree
	 */
	void exitTest_nocond(Python3Parser.Test_nocondContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#lambdef}.
	 * @param ctx the preParse tree
	 */
	void enterLambdef(Python3Parser.LambdefContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#lambdef}.
	 * @param ctx the preParse tree
	 */
	void exitLambdef(Python3Parser.LambdefContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#lambdef_nocond}.
	 * @param ctx the preParse tree
	 */
	void enterLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#lambdef_nocond}.
	 * @param ctx the preParse tree
	 */
	void exitLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#or_test}.
	 * @param ctx the preParse tree
	 */
	void enterOr_test(Python3Parser.Or_testContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#or_test}.
	 * @param ctx the preParse tree
	 */
	void exitOr_test(Python3Parser.Or_testContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#and_test}.
	 * @param ctx the preParse tree
	 */
	void enterAnd_test(Python3Parser.And_testContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#and_test}.
	 * @param ctx the preParse tree
	 */
	void exitAnd_test(Python3Parser.And_testContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#not_test}.
	 * @param ctx the preParse tree
	 */
	void enterNot_test(Python3Parser.Not_testContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#not_test}.
	 * @param ctx the preParse tree
	 */
	void exitNot_test(Python3Parser.Not_testContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#comparison}.
	 * @param ctx the preParse tree
	 */
	void enterComparison(Python3Parser.ComparisonContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#comparison}.
	 * @param ctx the preParse tree
	 */
	void exitComparison(Python3Parser.ComparisonContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#comp_op}.
	 * @param ctx the preParse tree
	 */
	void enterComp_op(Python3Parser.Comp_opContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#comp_op}.
	 * @param ctx the preParse tree
	 */
	void exitComp_op(Python3Parser.Comp_opContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#star_expr}.
	 * @param ctx the preParse tree
	 */
	void enterStar_expr(Python3Parser.Star_exprContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#star_expr}.
	 * @param ctx the preParse tree
	 */
	void exitStar_expr(Python3Parser.Star_exprContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#expr}.
	 * @param ctx the preParse tree
	 */
	void enterExpr(Python3Parser.ExprContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#expr}.
	 * @param ctx the preParse tree
	 */
	void exitExpr(Python3Parser.ExprContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#xor_expr}.
	 * @param ctx the preParse tree
	 */
	void enterXor_expr(Python3Parser.Xor_exprContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#xor_expr}.
	 * @param ctx the preParse tree
	 */
	void exitXor_expr(Python3Parser.Xor_exprContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#and_expr}.
	 * @param ctx the preParse tree
	 */
	void enterAnd_expr(Python3Parser.And_exprContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#and_expr}.
	 * @param ctx the preParse tree
	 */
	void exitAnd_expr(Python3Parser.And_exprContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#shift_expr}.
	 * @param ctx the preParse tree
	 */
	void enterShift_expr(Python3Parser.Shift_exprContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#shift_expr}.
	 * @param ctx the preParse tree
	 */
	void exitShift_expr(Python3Parser.Shift_exprContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#arith_expr}.
	 * @param ctx the preParse tree
	 */
	void enterArith_expr(Python3Parser.Arith_exprContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#arith_expr}.
	 * @param ctx the preParse tree
	 */
	void exitArith_expr(Python3Parser.Arith_exprContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#term}.
	 * @param ctx the preParse tree
	 */
	void enterTerm(Python3Parser.TermContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#term}.
	 * @param ctx the preParse tree
	 */
	void exitTerm(Python3Parser.TermContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#factor}.
	 * @param ctx the preParse tree
	 */
	void enterFactor(Python3Parser.FactorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#factor}.
	 * @param ctx the preParse tree
	 */
	void exitFactor(Python3Parser.FactorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#power}.
	 * @param ctx the preParse tree
	 */
	void enterPower(Python3Parser.PowerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#power}.
	 * @param ctx the preParse tree
	 */
	void exitPower(Python3Parser.PowerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the preParse tree
	 */
	void enterAtom(Python3Parser.AtomContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the preParse tree
	 */
	void exitAtom(Python3Parser.AtomContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#testlist_comp}.
	 * @param ctx the preParse tree
	 */
	void enterTestlist_comp(Python3Parser.Testlist_compContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#testlist_comp}.
	 * @param ctx the preParse tree
	 */
	void exitTestlist_comp(Python3Parser.Testlist_compContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#trailer}.
	 * @param ctx the preParse tree
	 */
	void enterTrailer(Python3Parser.TrailerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#trailer}.
	 * @param ctx the preParse tree
	 */
	void exitTrailer(Python3Parser.TrailerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#subscriptlist}.
	 * @param ctx the preParse tree
	 */
	void enterSubscriptlist(Python3Parser.SubscriptlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#subscriptlist}.
	 * @param ctx the preParse tree
	 */
	void exitSubscriptlist(Python3Parser.SubscriptlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#subscript}.
	 * @param ctx the preParse tree
	 */
	void enterSubscript(Python3Parser.SubscriptContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#subscript}.
	 * @param ctx the preParse tree
	 */
	void exitSubscript(Python3Parser.SubscriptContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#sliceop}.
	 * @param ctx the preParse tree
	 */
	void enterSliceop(Python3Parser.SliceopContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#sliceop}.
	 * @param ctx the preParse tree
	 */
	void exitSliceop(Python3Parser.SliceopContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#exprlist}.
	 * @param ctx the preParse tree
	 */
	void enterExprlist(Python3Parser.ExprlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#exprlist}.
	 * @param ctx the preParse tree
	 */
	void exitExprlist(Python3Parser.ExprlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#testlist}.
	 * @param ctx the preParse tree
	 */
	void enterTestlist(Python3Parser.TestlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#testlist}.
	 * @param ctx the preParse tree
	 */
	void exitTestlist(Python3Parser.TestlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#dictorsetmaker}.
	 * @param ctx the preParse tree
	 */
	void enterDictorsetmaker(Python3Parser.DictorsetmakerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#dictorsetmaker}.
	 * @param ctx the preParse tree
	 */
	void exitDictorsetmaker(Python3Parser.DictorsetmakerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#classdef}.
	 * @param ctx the preParse tree
	 */
	void enterClassdef(Python3Parser.ClassdefContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#classdef}.
	 * @param ctx the preParse tree
	 */
	void exitClassdef(Python3Parser.ClassdefContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#arglist}.
	 * @param ctx the preParse tree
	 */
	void enterArglist(Python3Parser.ArglistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#arglist}.
	 * @param ctx the preParse tree
	 */
	void exitArglist(Python3Parser.ArglistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#argument}.
	 * @param ctx the preParse tree
	 */
	void enterArgument(Python3Parser.ArgumentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#argument}.
	 * @param ctx the preParse tree
	 */
	void exitArgument(Python3Parser.ArgumentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#comp_iter}.
	 * @param ctx the preParse tree
	 */
	void enterComp_iter(Python3Parser.Comp_iterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#comp_iter}.
	 * @param ctx the preParse tree
	 */
	void exitComp_iter(Python3Parser.Comp_iterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#comp_for}.
	 * @param ctx the preParse tree
	 */
	void enterComp_for(Python3Parser.Comp_forContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#comp_for}.
	 * @param ctx the preParse tree
	 */
	void exitComp_for(Python3Parser.Comp_forContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#comp_if}.
	 * @param ctx the preParse tree
	 */
	void enterComp_if(Python3Parser.Comp_ifContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#comp_if}.
	 * @param ctx the preParse tree
	 */
	void exitComp_if(Python3Parser.Comp_ifContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#yield_expr}.
	 * @param ctx the preParse tree
	 */
	void enterYield_expr(Python3Parser.Yield_exprContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#yield_expr}.
	 * @param ctx the preParse tree
	 */
	void exitYield_expr(Python3Parser.Yield_exprContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#yield_arg}.
	 * @param ctx the preParse tree
	 */
	void enterYield_arg(Python3Parser.Yield_argContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#yield_arg}.
	 * @param ctx the preParse tree
	 */
	void exitYield_arg(Python3Parser.Yield_argContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#str}.
	 * @param ctx the preParse tree
	 */
	void enterStr(Python3Parser.StrContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#str}.
	 * @param ctx the preParse tree
	 */
	void exitStr(Python3Parser.StrContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#number}.
	 * @param ctx the preParse tree
	 */
	void enterNumber(Python3Parser.NumberContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#number}.
	 * @param ctx the preParse tree
	 */
	void exitNumber(Python3Parser.NumberContext ctx);
	/**
	 * Enter a preParse tree produced by {@link Python3Parser#integer}.
	 * @param ctx the preParse tree
	 */
	void enterInteger(Python3Parser.IntegerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link Python3Parser#integer}.
	 * @param ctx the preParse tree
	 */
	void exitInteger(Python3Parser.IntegerContext ctx);
}