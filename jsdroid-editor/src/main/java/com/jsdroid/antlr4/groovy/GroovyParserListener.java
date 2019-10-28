// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/groovy\GroovyParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.groovy;

    import java.util.Arrays;
    import java.util.Set;
    import java.util.HashSet;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link GroovyParser}.
 */
public interface GroovyParserListener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#compilationUnit}.
	 * @param ctx the preParse tree
	 */
	void enterCompilationUnit(GroovyParser.CompilationUnitContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#compilationUnit}.
	 * @param ctx the preParse tree
	 */
	void exitCompilationUnit(GroovyParser.CompilationUnitContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#scriptPart}.
	 * @param ctx the preParse tree
	 */
	void enterScriptPart(GroovyParser.ScriptPartContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#scriptPart}.
	 * @param ctx the preParse tree
	 */
	void exitScriptPart(GroovyParser.ScriptPartContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#packageDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterPackageDefinition(GroovyParser.PackageDefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#packageDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitPackageDefinition(GroovyParser.PackageDefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#importStatement}.
	 * @param ctx the preParse tree
	 */
	void enterImportStatement(GroovyParser.ImportStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#importStatement}.
	 * @param ctx the preParse tree
	 */
	void exitImportStatement(GroovyParser.ImportStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#classDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterClassDeclaration(GroovyParser.ClassDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#classDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitClassDeclaration(GroovyParser.ClassDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#classMember}.
	 * @param ctx the preParse tree
	 */
	void enterClassMember(GroovyParser.ClassMemberContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#classMember}.
	 * @param ctx the preParse tree
	 */
	void exitClassMember(GroovyParser.ClassMemberContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#enumConstant}.
	 * @param ctx the preParse tree
	 */
	void enterEnumConstant(GroovyParser.EnumConstantContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#enumConstant}.
	 * @param ctx the preParse tree
	 */
	void exitEnumConstant(GroovyParser.EnumConstantContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#classBody}.
	 * @param ctx the preParse tree
	 */
	void enterClassBody(GroovyParser.ClassBodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#classBody}.
	 * @param ctx the preParse tree
	 */
	void exitClassBody(GroovyParser.ClassBodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#implementsClause}.
	 * @param ctx the preParse tree
	 */
	void enterImplementsClause(GroovyParser.ImplementsClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#implementsClause}.
	 * @param ctx the preParse tree
	 */
	void exitImplementsClause(GroovyParser.ImplementsClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#extendsClause}.
	 * @param ctx the preParse tree
	 */
	void enterExtendsClause(GroovyParser.ExtendsClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#extendsClause}.
	 * @param ctx the preParse tree
	 */
	void exitExtendsClause(GroovyParser.ExtendsClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#methodDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterMethodDeclaration(GroovyParser.MethodDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#methodDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitMethodDeclaration(GroovyParser.MethodDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#fieldDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterFieldDeclaration(GroovyParser.FieldDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#fieldDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitFieldDeclaration(GroovyParser.FieldDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#declarationRule}.
	 * @param ctx the preParse tree
	 */
	void enterDeclarationRule(GroovyParser.DeclarationRuleContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#declarationRule}.
	 * @param ctx the preParse tree
	 */
	void exitDeclarationRule(GroovyParser.DeclarationRuleContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#objectInitializer}.
	 * @param ctx the preParse tree
	 */
	void enterObjectInitializer(GroovyParser.ObjectInitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#objectInitializer}.
	 * @param ctx the preParse tree
	 */
	void exitObjectInitializer(GroovyParser.ObjectInitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#classInitializer}.
	 * @param ctx the preParse tree
	 */
	void enterClassInitializer(GroovyParser.ClassInitializerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#classInitializer}.
	 * @param ctx the preParse tree
	 */
	void exitClassInitializer(GroovyParser.ClassInitializerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#typeDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterTypeDeclaration(GroovyParser.TypeDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#typeDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitTypeDeclaration(GroovyParser.TypeDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#annotationClause}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationClause(GroovyParser.AnnotationClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#annotationClause}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationClause(GroovyParser.AnnotationClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#annotationElementPair}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationElementPair(GroovyParser.AnnotationElementPairContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#annotationElementPair}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationElementPair(GroovyParser.AnnotationElementPairContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#annotationElement}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationElement(GroovyParser.AnnotationElementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#annotationElement}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationElement(GroovyParser.AnnotationElementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#genericDeclarationList}.
	 * @param ctx the preParse tree
	 */
	void enterGenericDeclarationList(GroovyParser.GenericDeclarationListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#genericDeclarationList}.
	 * @param ctx the preParse tree
	 */
	void exitGenericDeclarationList(GroovyParser.GenericDeclarationListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#genericsDeclarationElement}.
	 * @param ctx the preParse tree
	 */
	void enterGenericsDeclarationElement(GroovyParser.GenericsDeclarationElementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#genericsDeclarationElement}.
	 * @param ctx the preParse tree
	 */
	void exitGenericsDeclarationElement(GroovyParser.GenericsDeclarationElementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#throwsClause}.
	 * @param ctx the preParse tree
	 */
	void enterThrowsClause(GroovyParser.ThrowsClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#throwsClause}.
	 * @param ctx the preParse tree
	 */
	void exitThrowsClause(GroovyParser.ThrowsClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#argumentDeclarationList}.
	 * @param ctx the preParse tree
	 */
	void enterArgumentDeclarationList(GroovyParser.ArgumentDeclarationListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#argumentDeclarationList}.
	 * @param ctx the preParse tree
	 */
	void exitArgumentDeclarationList(GroovyParser.ArgumentDeclarationListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#argumentDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterArgumentDeclaration(GroovyParser.ArgumentDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#argumentDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitArgumentDeclaration(GroovyParser.ArgumentDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#blockStatement}.
	 * @param ctx the preParse tree
	 */
	void enterBlockStatement(GroovyParser.BlockStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#blockStatement}.
	 * @param ctx the preParse tree
	 */
	void exitBlockStatement(GroovyParser.BlockStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#singleDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterSingleDeclaration(GroovyParser.SingleDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#singleDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitSingleDeclaration(GroovyParser.SingleDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#tupleDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterTupleDeclaration(GroovyParser.TupleDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#tupleDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitTupleDeclaration(GroovyParser.TupleDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#tupleVariableDeclaration}.
	 * @param ctx the preParse tree
	 */
	void enterTupleVariableDeclaration(GroovyParser.TupleVariableDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#tupleVariableDeclaration}.
	 * @param ctx the preParse tree
	 */
	void exitTupleVariableDeclaration(GroovyParser.TupleVariableDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#newInstanceRule}.
	 * @param ctx the preParse tree
	 */
	void enterNewInstanceRule(GroovyParser.NewInstanceRuleContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#newInstanceRule}.
	 * @param ctx the preParse tree
	 */
	void exitNewInstanceRule(GroovyParser.NewInstanceRuleContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#newArrayRule}.
	 * @param ctx the preParse tree
	 */
	void enterNewArrayRule(GroovyParser.NewArrayRuleContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#newArrayRule}.
	 * @param ctx the preParse tree
	 */
	void exitNewArrayRule(GroovyParser.NewArrayRuleContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterDeclarationStatement(GroovyParser.DeclarationStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitDeclarationStatement(GroovyParser.DeclarationStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code newArrayStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterNewArrayStatement(GroovyParser.NewArrayStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code newArrayStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitNewArrayStatement(GroovyParser.NewArrayStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code newInstanceStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterNewInstanceStatement(GroovyParser.NewInstanceStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code newInstanceStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitNewInstanceStatement(GroovyParser.NewInstanceStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code classicForStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterClassicForStatement(GroovyParser.ClassicForStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code classicForStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitClassicForStatement(GroovyParser.ClassicForStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterForInStatement(GroovyParser.ForInStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitForInStatement(GroovyParser.ForInStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code forColonStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterForColonStatement(GroovyParser.ForColonStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code forColonStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitForColonStatement(GroovyParser.ForColonStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterIfStatement(GroovyParser.IfStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitIfStatement(GroovyParser.IfStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterWhileStatement(GroovyParser.WhileStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitWhileStatement(GroovyParser.WhileStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterSwitchStatement(GroovyParser.SwitchStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitSwitchStatement(GroovyParser.SwitchStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tryCatchFinallyStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterTryCatchFinallyStatement(GroovyParser.TryCatchFinallyStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tryCatchFinallyStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitTryCatchFinallyStatement(GroovyParser.TryCatchFinallyStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code controlStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterControlStatement(GroovyParser.ControlStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code controlStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitControlStatement(GroovyParser.ControlStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterReturnStatement(GroovyParser.ReturnStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitReturnStatement(GroovyParser.ReturnStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterThrowStatement(GroovyParser.ThrowStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitThrowStatement(GroovyParser.ThrowStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code assertStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterAssertStatement(GroovyParser.AssertStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code assertStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitAssertStatement(GroovyParser.AssertStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code synchronizedStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterSynchronizedStatement(GroovyParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code synchronizedStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitSynchronizedStatement(GroovyParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code labeledStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterLabeledStatement(GroovyParser.LabeledStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code labeledStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitLabeledStatement(GroovyParser.LabeledStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void enterExpressionStatement(GroovyParser.ExpressionStatementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the preParse tree
	 */
	void exitExpressionStatement(GroovyParser.ExpressionStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#blockStatementWithCurve}.
	 * @param ctx the preParse tree
	 */
	void enterBlockStatementWithCurve(GroovyParser.BlockStatementWithCurveContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#blockStatementWithCurve}.
	 * @param ctx the preParse tree
	 */
	void exitBlockStatementWithCurve(GroovyParser.BlockStatementWithCurveContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#statementBlock}.
	 * @param ctx the preParse tree
	 */
	void enterStatementBlock(GroovyParser.StatementBlockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#statementBlock}.
	 * @param ctx the preParse tree
	 */
	void exitStatementBlock(GroovyParser.StatementBlockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#tryBlock}.
	 * @param ctx the preParse tree
	 */
	void enterTryBlock(GroovyParser.TryBlockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#tryBlock}.
	 * @param ctx the preParse tree
	 */
	void exitTryBlock(GroovyParser.TryBlockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#catchBlock}.
	 * @param ctx the preParse tree
	 */
	void enterCatchBlock(GroovyParser.CatchBlockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#catchBlock}.
	 * @param ctx the preParse tree
	 */
	void exitCatchBlock(GroovyParser.CatchBlockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#finallyBlock}.
	 * @param ctx the preParse tree
	 */
	void enterFinallyBlock(GroovyParser.FinallyBlockContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#finallyBlock}.
	 * @param ctx the preParse tree
	 */
	void exitFinallyBlock(GroovyParser.FinallyBlockContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#caseStatement}.
	 * @param ctx the preParse tree
	 */
	void enterCaseStatement(GroovyParser.CaseStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#caseStatement}.
	 * @param ctx the preParse tree
	 */
	void exitCaseStatement(GroovyParser.CaseStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#pathExpression}.
	 * @param ctx the preParse tree
	 */
	void enterPathExpression(GroovyParser.PathExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#pathExpression}.
	 * @param ctx the preParse tree
	 */
	void exitPathExpression(GroovyParser.PathExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#gstringPathExpression}.
	 * @param ctx the preParse tree
	 */
	void enterGstringPathExpression(GroovyParser.GstringPathExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#gstringPathExpression}.
	 * @param ctx the preParse tree
	 */
	void exitGstringPathExpression(GroovyParser.GstringPathExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#closureExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterClosureExpressionRule(GroovyParser.ClosureExpressionRuleContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#closureExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitClosureExpressionRule(GroovyParser.ClosureExpressionRuleContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#gstringExpressionBody}.
	 * @param ctx the preParse tree
	 */
	void enterGstringExpressionBody(GroovyParser.GstringExpressionBodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#gstringExpressionBody}.
	 * @param ctx the preParse tree
	 */
	void exitGstringExpressionBody(GroovyParser.GstringExpressionBodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#gstring}.
	 * @param ctx the preParse tree
	 */
	void enterGstring(GroovyParser.GstringContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#gstring}.
	 * @param ctx the preParse tree
	 */
	void exitGstring(GroovyParser.GstringContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code annotationParamArrayExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationParamArrayExpression(GroovyParser.AnnotationParamArrayExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code annotationParamArrayExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationParamArrayExpression(GroovyParser.AnnotationParamArrayExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code annotationParamClassConstantExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationParamClassConstantExpression(GroovyParser.AnnotationParamClassConstantExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code annotationParamClassConstantExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationParamClassConstantExpression(GroovyParser.AnnotationParamClassConstantExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code annotationParamPathExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationParamPathExpression(GroovyParser.AnnotationParamPathExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code annotationParamPathExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationParamPathExpression(GroovyParser.AnnotationParamPathExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code annotationParamClassExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationParamClassExpression(GroovyParser.AnnotationParamClassExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code annotationParamClassExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationParamClassExpression(GroovyParser.AnnotationParamClassExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code annotationParamStringExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationParamStringExpression(GroovyParser.AnnotationParamStringExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code annotationParamStringExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationParamStringExpression(GroovyParser.AnnotationParamStringExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code annotationParamDecimalExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationParamDecimalExpression(GroovyParser.AnnotationParamDecimalExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code annotationParamDecimalExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationParamDecimalExpression(GroovyParser.AnnotationParamDecimalExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code annotationParamIntegerExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationParamIntegerExpression(GroovyParser.AnnotationParamIntegerExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code annotationParamIntegerExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationParamIntegerExpression(GroovyParser.AnnotationParamIntegerExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code annotationParamNullExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationParamNullExpression(GroovyParser.AnnotationParamNullExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code annotationParamNullExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationParamNullExpression(GroovyParser.AnnotationParamNullExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code annotationParamBoolExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationParamBoolExpression(GroovyParser.AnnotationParamBoolExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code annotationParamBoolExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationParamBoolExpression(GroovyParser.AnnotationParamBoolExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code annotationParamClosureExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void enterAnnotationParamClosureExpression(GroovyParser.AnnotationParamClosureExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code annotationParamClosureExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the preParse tree
	 */
	void exitAnnotationParamClosureExpression(GroovyParser.AnnotationParamClosureExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code cmdExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterCmdExpression(GroovyParser.CmdExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code cmdExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitCmdExpression(GroovyParser.CmdExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code spreadExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterSpreadExpression(GroovyParser.SpreadExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code spreadExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitSpreadExpression(GroovyParser.SpreadExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterParenthesisExpression(GroovyParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitParenthesisExpression(GroovyParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterAssignmentExpression(GroovyParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitAssignmentExpression(GroovyParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code superExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterSuperExpression(GroovyParser.SuperExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code superExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitSuperExpression(GroovyParser.SuperExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code constructorCallExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterConstructorCallExpression(GroovyParser.ConstructorCallExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code constructorCallExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitConstructorCallExpression(GroovyParser.ConstructorCallExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterBinaryExpression(GroovyParser.BinaryExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitBinaryExpression(GroovyParser.BinaryExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code castExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterCastExpression(GroovyParser.CastExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code castExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitCastExpression(GroovyParser.CastExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code callExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterCallExpression(GroovyParser.CallExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code callExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitCallExpression(GroovyParser.CallExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterPrefixExpression(GroovyParser.PrefixExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitPrefixExpression(GroovyParser.PrefixExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code fieldAccessExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterFieldAccessExpression(GroovyParser.FieldAccessExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code fieldAccessExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitFieldAccessExpression(GroovyParser.FieldAccessExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterAtomExpression(GroovyParser.AtomExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitAtomExpression(GroovyParser.AtomExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterThisExpression(GroovyParser.ThisExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitThisExpression(GroovyParser.ThisExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code indexExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterIndexExpression(GroovyParser.IndexExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code indexExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitIndexExpression(GroovyParser.IndexExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterUnaryExpression(GroovyParser.UnaryExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitUnaryExpression(GroovyParser.UnaryExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterTernaryExpression(GroovyParser.TernaryExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitTernaryExpression(GroovyParser.TernaryExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterPostfixExpression(GroovyParser.PostfixExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitPostfixExpression(GroovyParser.PostfixExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterConstantExpression(GroovyParser.ConstantExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitConstantExpression(GroovyParser.ConstantExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code gstringExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterGstringExpression(GroovyParser.GstringExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code gstringExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitGstringExpression(GroovyParser.GstringExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code constantDecimalExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterConstantDecimalExpression(GroovyParser.ConstantDecimalExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code constantDecimalExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitConstantDecimalExpression(GroovyParser.ConstantDecimalExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code constantIntegerExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterConstantIntegerExpression(GroovyParser.ConstantIntegerExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code constantIntegerExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitConstantIntegerExpression(GroovyParser.ConstantIntegerExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterNullExpression(GroovyParser.NullExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitNullExpression(GroovyParser.NullExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterBoolExpression(GroovyParser.BoolExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitBoolExpression(GroovyParser.BoolExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterVariableExpression(GroovyParser.VariableExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitVariableExpression(GroovyParser.VariableExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code classConstantExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterClassConstantExpression(GroovyParser.ClassConstantExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code classConstantExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitClassConstantExpression(GroovyParser.ClassConstantExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code closureExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterClosureExpression(GroovyParser.ClosureExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code closureExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitClosureExpression(GroovyParser.ClosureExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code listConstructor}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterListConstructor(GroovyParser.ListConstructorContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code listConstructor}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitListConstructor(GroovyParser.ListConstructorContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code mapConstructor}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterMapConstructor(GroovyParser.MapConstructorContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code mapConstructor}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitMapConstructor(GroovyParser.MapConstructorContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code newArrayExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterNewArrayExpression(GroovyParser.NewArrayExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code newArrayExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitNewArrayExpression(GroovyParser.NewArrayExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code newInstanceExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterNewInstanceExpression(GroovyParser.NewInstanceExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code newInstanceExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitNewInstanceExpression(GroovyParser.NewInstanceExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#classConstantRule}.
	 * @param ctx the preParse tree
	 */
	void enterClassConstantRule(GroovyParser.ClassConstantRuleContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#classConstantRule}.
	 * @param ctx the preParse tree
	 */
	void exitClassConstantRule(GroovyParser.ClassConstantRuleContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#argumentListRule}.
	 * @param ctx the preParse tree
	 */
	void enterArgumentListRule(GroovyParser.ArgumentListRuleContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#argumentListRule}.
	 * @param ctx the preParse tree
	 */
	void exitArgumentListRule(GroovyParser.ArgumentListRuleContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#callExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterCallExpressionRule(GroovyParser.CallExpressionRuleContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#callExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitCallExpressionRule(GroovyParser.CallExpressionRuleContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#nonKwCallExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void enterNonKwCallExpressionRule(GroovyParser.NonKwCallExpressionRuleContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#nonKwCallExpressionRule}.
	 * @param ctx the preParse tree
	 */
	void exitNonKwCallExpressionRule(GroovyParser.NonKwCallExpressionRuleContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#callRule}.
	 * @param ctx the preParse tree
	 */
	void enterCallRule(GroovyParser.CallRuleContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#callRule}.
	 * @param ctx the preParse tree
	 */
	void exitCallRule(GroovyParser.CallRuleContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#classNameExpression}.
	 * @param ctx the preParse tree
	 */
	void enterClassNameExpression(GroovyParser.ClassNameExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#classNameExpression}.
	 * @param ctx the preParse tree
	 */
	void exitClassNameExpression(GroovyParser.ClassNameExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#genericClassNameExpression}.
	 * @param ctx the preParse tree
	 */
	void enterGenericClassNameExpression(GroovyParser.GenericClassNameExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#genericClassNameExpression}.
	 * @param ctx the preParse tree
	 */
	void exitGenericClassNameExpression(GroovyParser.GenericClassNameExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#genericList}.
	 * @param ctx the preParse tree
	 */
	void enterGenericList(GroovyParser.GenericListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#genericList}.
	 * @param ctx the preParse tree
	 */
	void exitGenericList(GroovyParser.GenericListContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code genericsConcreteElement}
	 * labeled alternative in {@link GroovyParser#genericListElement}.
	 * @param ctx the preParse tree
	 */
	void enterGenericsConcreteElement(GroovyParser.GenericsConcreteElementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code genericsConcreteElement}
	 * labeled alternative in {@link GroovyParser#genericListElement}.
	 * @param ctx the preParse tree
	 */
	void exitGenericsConcreteElement(GroovyParser.GenericsConcreteElementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code genericsWildcardElement}
	 * labeled alternative in {@link GroovyParser#genericListElement}.
	 * @param ctx the preParse tree
	 */
	void enterGenericsWildcardElement(GroovyParser.GenericsWildcardElementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code genericsWildcardElement}
	 * labeled alternative in {@link GroovyParser#genericListElement}.
	 * @param ctx the preParse tree
	 */
	void exitGenericsWildcardElement(GroovyParser.GenericsWildcardElementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#mapEntry}.
	 * @param ctx the preParse tree
	 */
	void enterMapEntry(GroovyParser.MapEntryContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#mapEntry}.
	 * @param ctx the preParse tree
	 */
	void exitMapEntry(GroovyParser.MapEntryContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#classModifier}.
	 * @param ctx the preParse tree
	 */
	void enterClassModifier(GroovyParser.ClassModifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#classModifier}.
	 * @param ctx the preParse tree
	 */
	void exitClassModifier(GroovyParser.ClassModifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#memberModifier}.
	 * @param ctx the preParse tree
	 */
	void enterMemberModifier(GroovyParser.MemberModifierContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#memberModifier}.
	 * @param ctx the preParse tree
	 */
	void exitMemberModifier(GroovyParser.MemberModifierContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#argumentList}.
	 * @param ctx the preParse tree
	 */
	void enterArgumentList(GroovyParser.ArgumentListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#argumentList}.
	 * @param ctx the preParse tree
	 */
	void exitArgumentList(GroovyParser.ArgumentListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#argument}.
	 * @param ctx the preParse tree
	 */
	void enterArgument(GroovyParser.ArgumentContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#argument}.
	 * @param ctx the preParse tree
	 */
	void exitArgument(GroovyParser.ArgumentContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#selectorName}.
	 * @param ctx the preParse tree
	 */
	void enterSelectorName(GroovyParser.SelectorNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#selectorName}.
	 * @param ctx the preParse tree
	 */
	void exitSelectorName(GroovyParser.SelectorNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link GroovyParser#kwSelectorName}.
	 * @param ctx the preParse tree
	 */
	void enterKwSelectorName(GroovyParser.KwSelectorNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link GroovyParser#kwSelectorName}.
	 * @param ctx the preParse tree
	 */
	void exitKwSelectorName(GroovyParser.KwSelectorNameContext ctx);
}