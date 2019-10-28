// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/lua\Lua.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.lua;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link LuaParser#chunk}.
	 * @param ctx the preParse tree
	 */
	void enterChunk(LuaParser.ChunkContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#chunk}.
	 * @param ctx the preParse tree
	 */
	void exitChunk(LuaParser.ChunkContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#block}.
	 * @param ctx the preParse tree
	 */
	void enterBlock(LuaParser.BlockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#block}.
	 * @param ctx the preParse tree
	 */
	void exitBlock(LuaParser.BlockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#stat}.
	 * @param ctx the preParse tree
	 */
	void enterStat(LuaParser.StatContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#stat}.
	 * @param ctx the preParse tree
	 */
	void exitStat(LuaParser.StatContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#retstat}.
	 * @param ctx the preParse tree
	 */
	void enterRetstat(LuaParser.RetstatContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#retstat}.
	 * @param ctx the preParse tree
	 */
	void exitRetstat(LuaParser.RetstatContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#label}.
	 * @param ctx the preParse tree
	 */
	void enterLabel(LuaParser.LabelContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#label}.
	 * @param ctx the preParse tree
	 */
	void exitLabel(LuaParser.LabelContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#funcname}.
	 * @param ctx the preParse tree
	 */
	void enterFuncname(LuaParser.FuncnameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#funcname}.
	 * @param ctx the preParse tree
	 */
	void exitFuncname(LuaParser.FuncnameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#varlist}.
	 * @param ctx the preParse tree
	 */
	void enterVarlist(LuaParser.VarlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#varlist}.
	 * @param ctx the preParse tree
	 */
	void exitVarlist(LuaParser.VarlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#namelist}.
	 * @param ctx the preParse tree
	 */
	void enterNamelist(LuaParser.NamelistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#namelist}.
	 * @param ctx the preParse tree
	 */
	void exitNamelist(LuaParser.NamelistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#explist}.
	 * @param ctx the preParse tree
	 */
	void enterExplist(LuaParser.ExplistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#explist}.
	 * @param ctx the preParse tree
	 */
	void exitExplist(LuaParser.ExplistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#exp}.
	 * @param ctx the preParse tree
	 */
	void enterExp(LuaParser.ExpContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#exp}.
	 * @param ctx the preParse tree
	 */
	void exitExp(LuaParser.ExpContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#var}.
	 * @param ctx the preParse tree
	 */
	void enterVar(LuaParser.VarContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#var}.
	 * @param ctx the preParse tree
	 */
	void exitVar(LuaParser.VarContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#prefixexp}.
	 * @param ctx the preParse tree
	 */
	void enterPrefixexp(LuaParser.PrefixexpContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#prefixexp}.
	 * @param ctx the preParse tree
	 */
	void exitPrefixexp(LuaParser.PrefixexpContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#functioncall}.
	 * @param ctx the preParse tree
	 */
	void enterFunctioncall(LuaParser.FunctioncallContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#functioncall}.
	 * @param ctx the preParse tree
	 */
	void exitFunctioncall(LuaParser.FunctioncallContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#varOrExp}.
	 * @param ctx the preParse tree
	 */
	void enterVarOrExp(LuaParser.VarOrExpContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#varOrExp}.
	 * @param ctx the preParse tree
	 */
	void exitVarOrExp(LuaParser.VarOrExpContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#nameAndArgs}.
	 * @param ctx the preParse tree
	 */
	void enterNameAndArgs(LuaParser.NameAndArgsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#nameAndArgs}.
	 * @param ctx the preParse tree
	 */
	void exitNameAndArgs(LuaParser.NameAndArgsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#varSuffix}.
	 * @param ctx the preParse tree
	 */
	void enterVarSuffix(LuaParser.VarSuffixContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#varSuffix}.
	 * @param ctx the preParse tree
	 */
	void exitVarSuffix(LuaParser.VarSuffixContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#args}.
	 * @param ctx the preParse tree
	 */
	void enterArgs(LuaParser.ArgsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#args}.
	 * @param ctx the preParse tree
	 */
	void exitArgs(LuaParser.ArgsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#functiondef}.
	 * @param ctx the preParse tree
	 */
	void enterFunctiondef(LuaParser.FunctiondefContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#functiondef}.
	 * @param ctx the preParse tree
	 */
	void exitFunctiondef(LuaParser.FunctiondefContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#funcbody}.
	 * @param ctx the preParse tree
	 */
	void enterFuncbody(LuaParser.FuncbodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#funcbody}.
	 * @param ctx the preParse tree
	 */
	void exitFuncbody(LuaParser.FuncbodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#parlist}.
	 * @param ctx the preParse tree
	 */
	void enterParlist(LuaParser.ParlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#parlist}.
	 * @param ctx the preParse tree
	 */
	void exitParlist(LuaParser.ParlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#tableconstructor}.
	 * @param ctx the preParse tree
	 */
	void enterTableconstructor(LuaParser.TableconstructorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#tableconstructor}.
	 * @param ctx the preParse tree
	 */
	void exitTableconstructor(LuaParser.TableconstructorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#fieldlist}.
	 * @param ctx the preParse tree
	 */
	void enterFieldlist(LuaParser.FieldlistContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#fieldlist}.
	 * @param ctx the preParse tree
	 */
	void exitFieldlist(LuaParser.FieldlistContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#field}.
	 * @param ctx the preParse tree
	 */
	void enterField(LuaParser.FieldContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#field}.
	 * @param ctx the preParse tree
	 */
	void exitField(LuaParser.FieldContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#fieldsep}.
	 * @param ctx the preParse tree
	 */
	void enterFieldsep(LuaParser.FieldsepContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#fieldsep}.
	 * @param ctx the preParse tree
	 */
	void exitFieldsep(LuaParser.FieldsepContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#operatorOr}.
	 * @param ctx the preParse tree
	 */
	void enterOperatorOr(LuaParser.OperatorOrContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#operatorOr}.
	 * @param ctx the preParse tree
	 */
	void exitOperatorOr(LuaParser.OperatorOrContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#operatorAnd}.
	 * @param ctx the preParse tree
	 */
	void enterOperatorAnd(LuaParser.OperatorAndContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#operatorAnd}.
	 * @param ctx the preParse tree
	 */
	void exitOperatorAnd(LuaParser.OperatorAndContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#operatorComparison}.
	 * @param ctx the preParse tree
	 */
	void enterOperatorComparison(LuaParser.OperatorComparisonContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#operatorComparison}.
	 * @param ctx the preParse tree
	 */
	void exitOperatorComparison(LuaParser.OperatorComparisonContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#operatorStrcat}.
	 * @param ctx the preParse tree
	 */
	void enterOperatorStrcat(LuaParser.OperatorStrcatContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#operatorStrcat}.
	 * @param ctx the preParse tree
	 */
	void exitOperatorStrcat(LuaParser.OperatorStrcatContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#operatorAddSub}.
	 * @param ctx the preParse tree
	 */
	void enterOperatorAddSub(LuaParser.OperatorAddSubContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#operatorAddSub}.
	 * @param ctx the preParse tree
	 */
	void exitOperatorAddSub(LuaParser.OperatorAddSubContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#operatorMulDivMod}.
	 * @param ctx the preParse tree
	 */
	void enterOperatorMulDivMod(LuaParser.OperatorMulDivModContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#operatorMulDivMod}.
	 * @param ctx the preParse tree
	 */
	void exitOperatorMulDivMod(LuaParser.OperatorMulDivModContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#operatorUnary}.
	 * @param ctx the preParse tree
	 */
	void enterOperatorUnary(LuaParser.OperatorUnaryContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#operatorUnary}.
	 * @param ctx the preParse tree
	 */
	void exitOperatorUnary(LuaParser.OperatorUnaryContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#operatorPower}.
	 * @param ctx the preParse tree
	 */
	void enterOperatorPower(LuaParser.OperatorPowerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#operatorPower}.
	 * @param ctx the preParse tree
	 */
	void exitOperatorPower(LuaParser.OperatorPowerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#number}.
	 * @param ctx the preParse tree
	 */
	void enterNumber(LuaParser.NumberContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#number}.
	 * @param ctx the preParse tree
	 */
	void exitNumber(LuaParser.NumberContext ctx);
	/**
	 * Enter a preParse tree produced by {@link LuaParser#string}.
	 * @param ctx the preParse tree
	 */
	void enterString(LuaParser.StringContext ctx);
	/**
	 * Exit a preParse tree produced by {@link LuaParser#string}.
	 * @param ctx the preParse tree
	 */
	void exitString(LuaParser.StringContext ctx);
}