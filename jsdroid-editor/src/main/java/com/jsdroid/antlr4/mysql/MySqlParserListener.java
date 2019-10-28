// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/mysql\MySqlParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.mysql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a preParse tree produced by
 * {@link MySqlParser}.
 */
public interface MySqlParserListener extends ParseTreeListener {
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#root}.
	 * @param ctx the preParse tree
	 */
	void enterRoot(MySqlParser.RootContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#root}.
	 * @param ctx the preParse tree
	 */
	void exitRoot(MySqlParser.RootContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#sqlStatements}.
	 * @param ctx the preParse tree
	 */
	void enterSqlStatements(MySqlParser.SqlStatementsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#sqlStatements}.
	 * @param ctx the preParse tree
	 */
	void exitSqlStatements(MySqlParser.SqlStatementsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#sqlStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSqlStatement(MySqlParser.SqlStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#sqlStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSqlStatement(MySqlParser.SqlStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#emptyStatement}.
	 * @param ctx the preParse tree
	 */
	void enterEmptyStatement(MySqlParser.EmptyStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#emptyStatement}.
	 * @param ctx the preParse tree
	 */
	void exitEmptyStatement(MySqlParser.EmptyStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#ddlStatement}.
	 * @param ctx the preParse tree
	 */
	void enterDdlStatement(MySqlParser.DdlStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#ddlStatement}.
	 * @param ctx the preParse tree
	 */
	void exitDdlStatement(MySqlParser.DdlStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dmlStatement}.
	 * @param ctx the preParse tree
	 */
	void enterDmlStatement(MySqlParser.DmlStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dmlStatement}.
	 * @param ctx the preParse tree
	 */
	void exitDmlStatement(MySqlParser.DmlStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#transactionStatement}.
	 * @param ctx the preParse tree
	 */
	void enterTransactionStatement(MySqlParser.TransactionStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#transactionStatement}.
	 * @param ctx the preParse tree
	 */
	void exitTransactionStatement(MySqlParser.TransactionStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#replicationStatement}.
	 * @param ctx the preParse tree
	 */
	void enterReplicationStatement(MySqlParser.ReplicationStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#replicationStatement}.
	 * @param ctx the preParse tree
	 */
	void exitReplicationStatement(MySqlParser.ReplicationStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#preparedStatement}.
	 * @param ctx the preParse tree
	 */
	void enterPreparedStatement(MySqlParser.PreparedStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#preparedStatement}.
	 * @param ctx the preParse tree
	 */
	void exitPreparedStatement(MySqlParser.PreparedStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#compoundStatement}.
	 * @param ctx the preParse tree
	 */
	void enterCompoundStatement(MySqlParser.CompoundStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#compoundStatement}.
	 * @param ctx the preParse tree
	 */
	void exitCompoundStatement(MySqlParser.CompoundStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#administrationStatement}.
	 * @param ctx the preParse tree
	 */
	void enterAdministrationStatement(MySqlParser.AdministrationStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#administrationStatement}.
	 * @param ctx the preParse tree
	 */
	void exitAdministrationStatement(MySqlParser.AdministrationStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#utilityStatement}.
	 * @param ctx the preParse tree
	 */
	void enterUtilityStatement(MySqlParser.UtilityStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#utilityStatement}.
	 * @param ctx the preParse tree
	 */
	void exitUtilityStatement(MySqlParser.UtilityStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createDatabase}.
	 * @param ctx the preParse tree
	 */
	void enterCreateDatabase(MySqlParser.CreateDatabaseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createDatabase}.
	 * @param ctx the preParse tree
	 */
	void exitCreateDatabase(MySqlParser.CreateDatabaseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createEvent}.
	 * @param ctx the preParse tree
	 */
	void enterCreateEvent(MySqlParser.CreateEventContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createEvent}.
	 * @param ctx the preParse tree
	 */
	void exitCreateEvent(MySqlParser.CreateEventContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createIndex}.
	 * @param ctx the preParse tree
	 */
	void enterCreateIndex(MySqlParser.CreateIndexContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createIndex}.
	 * @param ctx the preParse tree
	 */
	void exitCreateIndex(MySqlParser.CreateIndexContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createLogfileGroup}.
	 * @param ctx the preParse tree
	 */
	void enterCreateLogfileGroup(MySqlParser.CreateLogfileGroupContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createLogfileGroup}.
	 * @param ctx the preParse tree
	 */
	void exitCreateLogfileGroup(MySqlParser.CreateLogfileGroupContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createProcedure}.
	 * @param ctx the preParse tree
	 */
	void enterCreateProcedure(MySqlParser.CreateProcedureContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createProcedure}.
	 * @param ctx the preParse tree
	 */
	void exitCreateProcedure(MySqlParser.CreateProcedureContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createFunction}.
	 * @param ctx the preParse tree
	 */
	void enterCreateFunction(MySqlParser.CreateFunctionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createFunction}.
	 * @param ctx the preParse tree
	 */
	void exitCreateFunction(MySqlParser.CreateFunctionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createServer}.
	 * @param ctx the preParse tree
	 */
	void enterCreateServer(MySqlParser.CreateServerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createServer}.
	 * @param ctx the preParse tree
	 */
	void exitCreateServer(MySqlParser.CreateServerContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the preParse tree
	 */
	void enterCopyCreateTable(MySqlParser.CopyCreateTableContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the preParse tree
	 */
	void exitCopyCreateTable(MySqlParser.CopyCreateTableContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the preParse tree
	 */
	void enterQueryCreateTable(MySqlParser.QueryCreateTableContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the preParse tree
	 */
	void exitQueryCreateTable(MySqlParser.QueryCreateTableContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the preParse tree
	 */
	void enterColumnCreateTable(MySqlParser.ColumnCreateTableContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the preParse tree
	 */
	void exitColumnCreateTable(MySqlParser.ColumnCreateTableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createTablespaceInnodb}.
	 * @param ctx the preParse tree
	 */
	void enterCreateTablespaceInnodb(MySqlParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createTablespaceInnodb}.
	 * @param ctx the preParse tree
	 */
	void exitCreateTablespaceInnodb(MySqlParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createTablespaceNdb}.
	 * @param ctx the preParse tree
	 */
	void enterCreateTablespaceNdb(MySqlParser.CreateTablespaceNdbContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createTablespaceNdb}.
	 * @param ctx the preParse tree
	 */
	void exitCreateTablespaceNdb(MySqlParser.CreateTablespaceNdbContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createTrigger}.
	 * @param ctx the preParse tree
	 */
	void enterCreateTrigger(MySqlParser.CreateTriggerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createTrigger}.
	 * @param ctx the preParse tree
	 */
	void exitCreateTrigger(MySqlParser.CreateTriggerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createView}.
	 * @param ctx the preParse tree
	 */
	void enterCreateView(MySqlParser.CreateViewContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createView}.
	 * @param ctx the preParse tree
	 */
	void exitCreateView(MySqlParser.CreateViewContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createDatabaseOption}.
	 * @param ctx the preParse tree
	 */
	void enterCreateDatabaseOption(MySqlParser.CreateDatabaseOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createDatabaseOption}.
	 * @param ctx the preParse tree
	 */
	void exitCreateDatabaseOption(MySqlParser.CreateDatabaseOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#ownerStatement}.
	 * @param ctx the preParse tree
	 */
	void enterOwnerStatement(MySqlParser.OwnerStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#ownerStatement}.
	 * @param ctx the preParse tree
	 */
	void exitOwnerStatement(MySqlParser.OwnerStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link MySqlParser#scheduleExpression}.
	 * @param ctx the preParse tree
	 */
	void enterPreciseSchedule(MySqlParser.PreciseScheduleContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link MySqlParser#scheduleExpression}.
	 * @param ctx the preParse tree
	 */
	void exitPreciseSchedule(MySqlParser.PreciseScheduleContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link MySqlParser#scheduleExpression}.
	 * @param ctx the preParse tree
	 */
	void enterIntervalSchedule(MySqlParser.IntervalScheduleContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link MySqlParser#scheduleExpression}.
	 * @param ctx the preParse tree
	 */
	void exitIntervalSchedule(MySqlParser.IntervalScheduleContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#timestampValue}.
	 * @param ctx the preParse tree
	 */
	void enterTimestampValue(MySqlParser.TimestampValueContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#timestampValue}.
	 * @param ctx the preParse tree
	 */
	void exitTimestampValue(MySqlParser.TimestampValueContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#intervalExpr}.
	 * @param ctx the preParse tree
	 */
	void enterIntervalExpr(MySqlParser.IntervalExprContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#intervalExpr}.
	 * @param ctx the preParse tree
	 */
	void exitIntervalExpr(MySqlParser.IntervalExprContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#intervalType}.
	 * @param ctx the preParse tree
	 */
	void enterIntervalType(MySqlParser.IntervalTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#intervalType}.
	 * @param ctx the preParse tree
	 */
	void exitIntervalType(MySqlParser.IntervalTypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#enableType}.
	 * @param ctx the preParse tree
	 */
	void enterEnableType(MySqlParser.EnableTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#enableType}.
	 * @param ctx the preParse tree
	 */
	void exitEnableType(MySqlParser.EnableTypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#indexType}.
	 * @param ctx the preParse tree
	 */
	void enterIndexType(MySqlParser.IndexTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#indexType}.
	 * @param ctx the preParse tree
	 */
	void exitIndexType(MySqlParser.IndexTypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#indexOption}.
	 * @param ctx the preParse tree
	 */
	void enterIndexOption(MySqlParser.IndexOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#indexOption}.
	 * @param ctx the preParse tree
	 */
	void exitIndexOption(MySqlParser.IndexOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#procedureParameter}.
	 * @param ctx the preParse tree
	 */
	void enterProcedureParameter(MySqlParser.ProcedureParameterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#procedureParameter}.
	 * @param ctx the preParse tree
	 */
	void exitProcedureParameter(MySqlParser.ProcedureParameterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#functionParameter}.
	 * @param ctx the preParse tree
	 */
	void enterFunctionParameter(MySqlParser.FunctionParameterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#functionParameter}.
	 * @param ctx the preParse tree
	 */
	void exitFunctionParameter(MySqlParser.FunctionParameterContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code routineComment}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the preParse tree
	 */
	void enterRoutineComment(MySqlParser.RoutineCommentContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code routineComment}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the preParse tree
	 */
	void exitRoutineComment(MySqlParser.RoutineCommentContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the preParse tree
	 */
	void enterRoutineLanguage(MySqlParser.RoutineLanguageContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the preParse tree
	 */
	void exitRoutineLanguage(MySqlParser.RoutineLanguageContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the preParse tree
	 */
	void enterRoutineBehavior(MySqlParser.RoutineBehaviorContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the preParse tree
	 */
	void exitRoutineBehavior(MySqlParser.RoutineBehaviorContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code routineData}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the preParse tree
	 */
	void enterRoutineData(MySqlParser.RoutineDataContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code routineData}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the preParse tree
	 */
	void exitRoutineData(MySqlParser.RoutineDataContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the preParse tree
	 */
	void enterRoutineSecurity(MySqlParser.RoutineSecurityContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the preParse tree
	 */
	void exitRoutineSecurity(MySqlParser.RoutineSecurityContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#serverOption}.
	 * @param ctx the preParse tree
	 */
	void enterServerOption(MySqlParser.ServerOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#serverOption}.
	 * @param ctx the preParse tree
	 */
	void exitServerOption(MySqlParser.ServerOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createDefinitions}.
	 * @param ctx the preParse tree
	 */
	void enterCreateDefinitions(MySqlParser.CreateDefinitionsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createDefinitions}.
	 * @param ctx the preParse tree
	 */
	void exitCreateDefinitions(MySqlParser.CreateDefinitionsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterColumnDeclaration(MySqlParser.ColumnDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitColumnDeclaration(MySqlParser.ColumnDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterConstraintDeclaration(MySqlParser.ConstraintDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitConstraintDeclaration(MySqlParser.ConstraintDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterIndexDeclaration(MySqlParser.IndexDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitIndexDeclaration(MySqlParser.IndexDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#columnDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterColumnDefinition(MySqlParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#columnDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitColumnDefinition(MySqlParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterNullColumnConstraint(MySqlParser.NullColumnConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitNullColumnConstraint(MySqlParser.NullColumnConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterDefaultColumnConstraint(MySqlParser.DefaultColumnConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitDefaultColumnConstraint(MySqlParser.DefaultColumnConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterAutoIncrementColumnConstraint(MySqlParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitAutoIncrementColumnConstraint(MySqlParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterPrimaryKeyColumnConstraint(MySqlParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitPrimaryKeyColumnConstraint(MySqlParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterUniqueKeyColumnConstraint(MySqlParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitUniqueKeyColumnConstraint(MySqlParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code updateCurrentTimestamp}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterUpdateCurrentTimestamp(MySqlParser.UpdateCurrentTimestampContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code updateCurrentTimestamp}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitUpdateCurrentTimestamp(MySqlParser.UpdateCurrentTimestampContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterCommentColumnConstraint(MySqlParser.CommentColumnConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitCommentColumnConstraint(MySqlParser.CommentColumnConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterFormatColumnConstraint(MySqlParser.FormatColumnConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitFormatColumnConstraint(MySqlParser.FormatColumnConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterStorageColumnConstraint(MySqlParser.StorageColumnConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitStorageColumnConstraint(MySqlParser.StorageColumnConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterReferenceColumnConstraint(MySqlParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitReferenceColumnConstraint(MySqlParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterPrimaryKeyTableConstraint(MySqlParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitPrimaryKeyTableConstraint(MySqlParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterUniqueKeyTableConstraint(MySqlParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitUniqueKeyTableConstraint(MySqlParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterForeignKeyTableConstraint(MySqlParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitForeignKeyTableConstraint(MySqlParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the preParse tree
	 */
	void enterCheckTableConstraint(MySqlParser.CheckTableConstraintContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the preParse tree
	 */
	void exitCheckTableConstraint(MySqlParser.CheckTableConstraintContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#referenceDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterReferenceDefinition(MySqlParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#referenceDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitReferenceDefinition(MySqlParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#referenceAction}.
	 * @param ctx the preParse tree
	 */
	void enterReferenceAction(MySqlParser.ReferenceActionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#referenceAction}.
	 * @param ctx the preParse tree
	 */
	void exitReferenceAction(MySqlParser.ReferenceActionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#referenceControlType}.
	 * @param ctx the preParse tree
	 */
	void enterReferenceControlType(MySqlParser.ReferenceControlTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#referenceControlType}.
	 * @param ctx the preParse tree
	 */
	void exitReferenceControlType(MySqlParser.ReferenceControlTypeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link MySqlParser#indexColumnDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterSimpleIndexDeclaration(MySqlParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link MySqlParser#indexColumnDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitSimpleIndexDeclaration(MySqlParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link MySqlParser#indexColumnDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterSpecialIndexDeclaration(MySqlParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link MySqlParser#indexColumnDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitSpecialIndexDeclaration(MySqlParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionEngine(MySqlParser.TableOptionEngineContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionEngine(MySqlParser.TableOptionEngineContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionAutoIncrement(MySqlParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionAutoIncrement(MySqlParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionAverage(MySqlParser.TableOptionAverageContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionAverage(MySqlParser.TableOptionAverageContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionCharset(MySqlParser.TableOptionCharsetContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionCharset(MySqlParser.TableOptionCharsetContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionChecksum(MySqlParser.TableOptionChecksumContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionChecksum(MySqlParser.TableOptionChecksumContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionCollate(MySqlParser.TableOptionCollateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionCollate(MySqlParser.TableOptionCollateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionComment(MySqlParser.TableOptionCommentContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionComment(MySqlParser.TableOptionCommentContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionCompression(MySqlParser.TableOptionCompressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionCompression(MySqlParser.TableOptionCompressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionConnection(MySqlParser.TableOptionConnectionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionConnection(MySqlParser.TableOptionConnectionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionDataDirectory(MySqlParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionDataDirectory(MySqlParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionDelay(MySqlParser.TableOptionDelayContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionDelay(MySqlParser.TableOptionDelayContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionEncryption(MySqlParser.TableOptionEncryptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionEncryption(MySqlParser.TableOptionEncryptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionIndexDirectory(MySqlParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionIndexDirectory(MySqlParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionInsertMethod(MySqlParser.TableOptionInsertMethodContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionInsertMethod(MySqlParser.TableOptionInsertMethodContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionKeyBlockSize(MySqlParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionKeyBlockSize(MySqlParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionMaxRows(MySqlParser.TableOptionMaxRowsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionMaxRows(MySqlParser.TableOptionMaxRowsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionMinRows(MySqlParser.TableOptionMinRowsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionMinRows(MySqlParser.TableOptionMinRowsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionPackKeys(MySqlParser.TableOptionPackKeysContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionPackKeys(MySqlParser.TableOptionPackKeysContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionPassword(MySqlParser.TableOptionPasswordContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionPassword(MySqlParser.TableOptionPasswordContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionRowFormat(MySqlParser.TableOptionRowFormatContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionRowFormat(MySqlParser.TableOptionRowFormatContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionRecalculation(MySqlParser.TableOptionRecalculationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionRecalculation(MySqlParser.TableOptionRecalculationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionPersistent(MySqlParser.TableOptionPersistentContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionPersistent(MySqlParser.TableOptionPersistentContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionSamplePage(MySqlParser.TableOptionSamplePageContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionSamplePage(MySqlParser.TableOptionSamplePageContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionTablespace(MySqlParser.TableOptionTablespaceContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionTablespace(MySqlParser.TableOptionTablespaceContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableOptionUnion(MySqlParser.TableOptionUnionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableOptionUnion(MySqlParser.TableOptionUnionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#tablespaceStorage}.
	 * @param ctx the preParse tree
	 */
	void enterTablespaceStorage(MySqlParser.TablespaceStorageContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#tablespaceStorage}.
	 * @param ctx the preParse tree
	 */
	void exitTablespaceStorage(MySqlParser.TablespaceStorageContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#partitionDefinitions}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionDefinitions(MySqlParser.PartitionDefinitionsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#partitionDefinitions}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionDefinitions(MySqlParser.PartitionDefinitionsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionFunctionHash(MySqlParser.PartitionFunctionHashContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionFunctionHash(MySqlParser.PartitionFunctionHashContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionFunctionKey(MySqlParser.PartitionFunctionKeyContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionFunctionKey(MySqlParser.PartitionFunctionKeyContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionFunctionRange(MySqlParser.PartitionFunctionRangeContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionFunctionRange(MySqlParser.PartitionFunctionRangeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionFunctionList(MySqlParser.PartitionFunctionListContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionFunctionList(MySqlParser.PartitionFunctionListContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterSubPartitionFunctionHash(MySqlParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitSubPartitionFunctionHash(MySqlParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterSubPartitionFunctionKey(MySqlParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitSubPartitionFunctionKey(MySqlParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionComparision(MySqlParser.PartitionComparisionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionComparision(MySqlParser.PartitionComparisionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionListAtom(MySqlParser.PartitionListAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionListAtom(MySqlParser.PartitionListAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionListVector(MySqlParser.PartitionListVectorContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionListVector(MySqlParser.PartitionListVectorContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionSimple(MySqlParser.PartitionSimpleContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionSimple(MySqlParser.PartitionSimpleContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#partitionDefinerAtom}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionDefinerAtom(MySqlParser.PartitionDefinerAtomContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#partitionDefinerAtom}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionDefinerAtom(MySqlParser.PartitionDefinerAtomContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#partitionDefinerVector}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionDefinerVector(MySqlParser.PartitionDefinerVectorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#partitionDefinerVector}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionDefinerVector(MySqlParser.PartitionDefinerVectorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#subpartitionDefinition}.
	 * @param ctx the preParse tree
	 */
	void enterSubpartitionDefinition(MySqlParser.SubpartitionDefinitionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#subpartitionDefinition}.
	 * @param ctx the preParse tree
	 */
	void exitSubpartitionDefinition(MySqlParser.SubpartitionDefinitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionOptionEngine(MySqlParser.PartitionOptionEngineContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionOptionEngine(MySqlParser.PartitionOptionEngineContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionOptionComment(MySqlParser.PartitionOptionCommentContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionOptionComment(MySqlParser.PartitionOptionCommentContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionOptionDataDirectory(MySqlParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionOptionDataDirectory(MySqlParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionOptionIndexDirectory(MySqlParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionOptionIndexDirectory(MySqlParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionOptionMaxRows(MySqlParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionOptionMaxRows(MySqlParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionOptionMinRows(MySqlParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionOptionMinRows(MySqlParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionOptionTablespace(MySqlParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionOptionTablespace(MySqlParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void enterPartitionOptionNodeGroup(MySqlParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the preParse tree
	 */
	void exitPartitionOptionNodeGroup(MySqlParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link MySqlParser#alterDatabase}.
	 * @param ctx the preParse tree
	 */
	void enterAlterSimpleDatabase(MySqlParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link MySqlParser#alterDatabase}.
	 * @param ctx the preParse tree
	 */
	void exitAlterSimpleDatabase(MySqlParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link MySqlParser#alterDatabase}.
	 * @param ctx the preParse tree
	 */
	void enterAlterUpgradeName(MySqlParser.AlterUpgradeNameContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link MySqlParser#alterDatabase}.
	 * @param ctx the preParse tree
	 */
	void exitAlterUpgradeName(MySqlParser.AlterUpgradeNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#alterEvent}.
	 * @param ctx the preParse tree
	 */
	void enterAlterEvent(MySqlParser.AlterEventContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#alterEvent}.
	 * @param ctx the preParse tree
	 */
	void exitAlterEvent(MySqlParser.AlterEventContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#alterFunction}.
	 * @param ctx the preParse tree
	 */
	void enterAlterFunction(MySqlParser.AlterFunctionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#alterFunction}.
	 * @param ctx the preParse tree
	 */
	void exitAlterFunction(MySqlParser.AlterFunctionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#alterInstance}.
	 * @param ctx the preParse tree
	 */
	void enterAlterInstance(MySqlParser.AlterInstanceContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#alterInstance}.
	 * @param ctx the preParse tree
	 */
	void exitAlterInstance(MySqlParser.AlterInstanceContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#alterLogfileGroup}.
	 * @param ctx the preParse tree
	 */
	void enterAlterLogfileGroup(MySqlParser.AlterLogfileGroupContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#alterLogfileGroup}.
	 * @param ctx the preParse tree
	 */
	void exitAlterLogfileGroup(MySqlParser.AlterLogfileGroupContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#alterProcedure}.
	 * @param ctx the preParse tree
	 */
	void enterAlterProcedure(MySqlParser.AlterProcedureContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#alterProcedure}.
	 * @param ctx the preParse tree
	 */
	void exitAlterProcedure(MySqlParser.AlterProcedureContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#alterServer}.
	 * @param ctx the preParse tree
	 */
	void enterAlterServer(MySqlParser.AlterServerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#alterServer}.
	 * @param ctx the preParse tree
	 */
	void exitAlterServer(MySqlParser.AlterServerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#alterTable}.
	 * @param ctx the preParse tree
	 */
	void enterAlterTable(MySqlParser.AlterTableContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#alterTable}.
	 * @param ctx the preParse tree
	 */
	void exitAlterTable(MySqlParser.AlterTableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#alterTablespace}.
	 * @param ctx the preParse tree
	 */
	void enterAlterTablespace(MySqlParser.AlterTablespaceContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#alterTablespace}.
	 * @param ctx the preParse tree
	 */
	void exitAlterTablespace(MySqlParser.AlterTablespaceContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#alterView}.
	 * @param ctx the preParse tree
	 */
	void enterAlterView(MySqlParser.AlterViewContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#alterView}.
	 * @param ctx the preParse tree
	 */
	void exitAlterView(MySqlParser.AlterViewContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByTableOption(MySqlParser.AlterByTableOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByTableOption(MySqlParser.AlterByTableOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByAddColumn(MySqlParser.AlterByAddColumnContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByAddColumn(MySqlParser.AlterByAddColumnContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByAddColumns(MySqlParser.AlterByAddColumnsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByAddColumns(MySqlParser.AlterByAddColumnsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByAddIndex(MySqlParser.AlterByAddIndexContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByAddIndex(MySqlParser.AlterByAddIndexContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByAddPrimaryKey(MySqlParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByAddPrimaryKey(MySqlParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByAddUniqueKey(MySqlParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByAddUniqueKey(MySqlParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByAddSpecialIndex(MySqlParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByAddSpecialIndex(MySqlParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByAddForeignKey(MySqlParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByAddForeignKey(MySqlParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterBySetAlgorithm(MySqlParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterBySetAlgorithm(MySqlParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByChangeDefault(MySqlParser.AlterByChangeDefaultContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByChangeDefault(MySqlParser.AlterByChangeDefaultContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByChangeColumn(MySqlParser.AlterByChangeColumnContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByChangeColumn(MySqlParser.AlterByChangeColumnContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByLock(MySqlParser.AlterByLockContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByLock(MySqlParser.AlterByLockContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByModifyColumn(MySqlParser.AlterByModifyColumnContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByModifyColumn(MySqlParser.AlterByModifyColumnContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByDropColumn(MySqlParser.AlterByDropColumnContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByDropColumn(MySqlParser.AlterByDropColumnContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByDropPrimaryKey(MySqlParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByDropPrimaryKey(MySqlParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByDropIndex(MySqlParser.AlterByDropIndexContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByDropIndex(MySqlParser.AlterByDropIndexContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByDropForeignKey(MySqlParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByDropForeignKey(MySqlParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByDisableKeys(MySqlParser.AlterByDisableKeysContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByDisableKeys(MySqlParser.AlterByDisableKeysContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByEnableKeys(MySqlParser.AlterByEnableKeysContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByEnableKeys(MySqlParser.AlterByEnableKeysContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByRename(MySqlParser.AlterByRenameContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByRename(MySqlParser.AlterByRenameContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByOrder(MySqlParser.AlterByOrderContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByOrder(MySqlParser.AlterByOrderContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByConvertCharset(MySqlParser.AlterByConvertCharsetContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByConvertCharset(MySqlParser.AlterByConvertCharsetContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByDefaultCharset(MySqlParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByDefaultCharset(MySqlParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByDiscardTablespace(MySqlParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByDiscardTablespace(MySqlParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByImportTablespace(MySqlParser.AlterByImportTablespaceContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByImportTablespace(MySqlParser.AlterByImportTablespaceContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByForce(MySqlParser.AlterByForceContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByForce(MySqlParser.AlterByForceContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByValidate(MySqlParser.AlterByValidateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByValidate(MySqlParser.AlterByValidateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByAddPartition(MySqlParser.AlterByAddPartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByAddPartition(MySqlParser.AlterByAddPartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByDropPartition(MySqlParser.AlterByDropPartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByDropPartition(MySqlParser.AlterByDropPartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByDiscardPartition(MySqlParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByDiscardPartition(MySqlParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByImportPartition(MySqlParser.AlterByImportPartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByImportPartition(MySqlParser.AlterByImportPartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByTruncatePartition(MySqlParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByTruncatePartition(MySqlParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByCoalescePartition(MySqlParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByCoalescePartition(MySqlParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByReorganizePartition(MySqlParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByReorganizePartition(MySqlParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByExchangePartition(MySqlParser.AlterByExchangePartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByExchangePartition(MySqlParser.AlterByExchangePartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByAnalyzePartitiion}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByAnalyzePartitiion(MySqlParser.AlterByAnalyzePartitiionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByAnalyzePartitiion}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByAnalyzePartitiion(MySqlParser.AlterByAnalyzePartitiionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByCheckPartition(MySqlParser.AlterByCheckPartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByCheckPartition(MySqlParser.AlterByCheckPartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByOptimizePartition(MySqlParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByOptimizePartition(MySqlParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByRebuildPartition(MySqlParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByRebuildPartition(MySqlParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByRepairPartition(MySqlParser.AlterByRepairPartitionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByRepairPartition(MySqlParser.AlterByRepairPartitionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByRemovePartitioning(MySqlParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByRemovePartitioning(MySqlParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterAlterByUpgradePartitioning(MySqlParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitAlterByUpgradePartitioning(MySqlParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropDatabase}.
	 * @param ctx the preParse tree
	 */
	void enterDropDatabase(MySqlParser.DropDatabaseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropDatabase}.
	 * @param ctx the preParse tree
	 */
	void exitDropDatabase(MySqlParser.DropDatabaseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropEvent}.
	 * @param ctx the preParse tree
	 */
	void enterDropEvent(MySqlParser.DropEventContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropEvent}.
	 * @param ctx the preParse tree
	 */
	void exitDropEvent(MySqlParser.DropEventContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropIndex}.
	 * @param ctx the preParse tree
	 */
	void enterDropIndex(MySqlParser.DropIndexContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropIndex}.
	 * @param ctx the preParse tree
	 */
	void exitDropIndex(MySqlParser.DropIndexContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropLogfileGroup}.
	 * @param ctx the preParse tree
	 */
	void enterDropLogfileGroup(MySqlParser.DropLogfileGroupContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropLogfileGroup}.
	 * @param ctx the preParse tree
	 */
	void exitDropLogfileGroup(MySqlParser.DropLogfileGroupContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropProcedure}.
	 * @param ctx the preParse tree
	 */
	void enterDropProcedure(MySqlParser.DropProcedureContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropProcedure}.
	 * @param ctx the preParse tree
	 */
	void exitDropProcedure(MySqlParser.DropProcedureContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropFunction}.
	 * @param ctx the preParse tree
	 */
	void enterDropFunction(MySqlParser.DropFunctionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropFunction}.
	 * @param ctx the preParse tree
	 */
	void exitDropFunction(MySqlParser.DropFunctionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropServer}.
	 * @param ctx the preParse tree
	 */
	void enterDropServer(MySqlParser.DropServerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropServer}.
	 * @param ctx the preParse tree
	 */
	void exitDropServer(MySqlParser.DropServerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropTable}.
	 * @param ctx the preParse tree
	 */
	void enterDropTable(MySqlParser.DropTableContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropTable}.
	 * @param ctx the preParse tree
	 */
	void exitDropTable(MySqlParser.DropTableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropTablespace}.
	 * @param ctx the preParse tree
	 */
	void enterDropTablespace(MySqlParser.DropTablespaceContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropTablespace}.
	 * @param ctx the preParse tree
	 */
	void exitDropTablespace(MySqlParser.DropTablespaceContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropTrigger}.
	 * @param ctx the preParse tree
	 */
	void enterDropTrigger(MySqlParser.DropTriggerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropTrigger}.
	 * @param ctx the preParse tree
	 */
	void exitDropTrigger(MySqlParser.DropTriggerContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropView}.
	 * @param ctx the preParse tree
	 */
	void enterDropView(MySqlParser.DropViewContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropView}.
	 * @param ctx the preParse tree
	 */
	void exitDropView(MySqlParser.DropViewContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#renameTable}.
	 * @param ctx the preParse tree
	 */
	void enterRenameTable(MySqlParser.RenameTableContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#renameTable}.
	 * @param ctx the preParse tree
	 */
	void exitRenameTable(MySqlParser.RenameTableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#renameTableClause}.
	 * @param ctx the preParse tree
	 */
	void enterRenameTableClause(MySqlParser.RenameTableClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#renameTableClause}.
	 * @param ctx the preParse tree
	 */
	void exitRenameTableClause(MySqlParser.RenameTableClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#truncateTable}.
	 * @param ctx the preParse tree
	 */
	void enterTruncateTable(MySqlParser.TruncateTableContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#truncateTable}.
	 * @param ctx the preParse tree
	 */
	void exitTruncateTable(MySqlParser.TruncateTableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#callStatement}.
	 * @param ctx the preParse tree
	 */
	void enterCallStatement(MySqlParser.CallStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#callStatement}.
	 * @param ctx the preParse tree
	 */
	void exitCallStatement(MySqlParser.CallStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#deleteStatement}.
	 * @param ctx the preParse tree
	 */
	void enterDeleteStatement(MySqlParser.DeleteStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#deleteStatement}.
	 * @param ctx the preParse tree
	 */
	void exitDeleteStatement(MySqlParser.DeleteStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#doStatement}.
	 * @param ctx the preParse tree
	 */
	void enterDoStatement(MySqlParser.DoStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#doStatement}.
	 * @param ctx the preParse tree
	 */
	void exitDoStatement(MySqlParser.DoStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#handlerStatement}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerStatement(MySqlParser.HandlerStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#handlerStatement}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerStatement(MySqlParser.HandlerStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#insertStatement}.
	 * @param ctx the preParse tree
	 */
	void enterInsertStatement(MySqlParser.InsertStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#insertStatement}.
	 * @param ctx the preParse tree
	 */
	void exitInsertStatement(MySqlParser.InsertStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#loadDataStatement}.
	 * @param ctx the preParse tree
	 */
	void enterLoadDataStatement(MySqlParser.LoadDataStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#loadDataStatement}.
	 * @param ctx the preParse tree
	 */
	void exitLoadDataStatement(MySqlParser.LoadDataStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#loadXmlStatement}.
	 * @param ctx the preParse tree
	 */
	void enterLoadXmlStatement(MySqlParser.LoadXmlStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#loadXmlStatement}.
	 * @param ctx the preParse tree
	 */
	void exitLoadXmlStatement(MySqlParser.LoadXmlStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#replaceStatement}.
	 * @param ctx the preParse tree
	 */
	void enterReplaceStatement(MySqlParser.ReplaceStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#replaceStatement}.
	 * @param ctx the preParse tree
	 */
	void exitReplaceStatement(MySqlParser.ReplaceStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSimpleSelect(MySqlParser.SimpleSelectContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSimpleSelect(MySqlParser.SimpleSelectContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the preParse tree
	 */
	void enterParenthesisSelect(MySqlParser.ParenthesisSelectContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the preParse tree
	 */
	void exitParenthesisSelect(MySqlParser.ParenthesisSelectContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the preParse tree
	 */
	void enterUnionSelect(MySqlParser.UnionSelectContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the preParse tree
	 */
	void exitUnionSelect(MySqlParser.UnionSelectContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the preParse tree
	 */
	void enterUnionParenthesisSelect(MySqlParser.UnionParenthesisSelectContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the preParse tree
	 */
	void exitUnionParenthesisSelect(MySqlParser.UnionParenthesisSelectContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#updateStatement}.
	 * @param ctx the preParse tree
	 */
	void enterUpdateStatement(MySqlParser.UpdateStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#updateStatement}.
	 * @param ctx the preParse tree
	 */
	void exitUpdateStatement(MySqlParser.UpdateStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#insertStatementValue}.
	 * @param ctx the preParse tree
	 */
	void enterInsertStatementValue(MySqlParser.InsertStatementValueContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#insertStatementValue}.
	 * @param ctx the preParse tree
	 */
	void exitInsertStatementValue(MySqlParser.InsertStatementValueContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#updatedElement}.
	 * @param ctx the preParse tree
	 */
	void enterUpdatedElement(MySqlParser.UpdatedElementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#updatedElement}.
	 * @param ctx the preParse tree
	 */
	void exitUpdatedElement(MySqlParser.UpdatedElementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#assignmentField}.
	 * @param ctx the preParse tree
	 */
	void enterAssignmentField(MySqlParser.AssignmentFieldContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#assignmentField}.
	 * @param ctx the preParse tree
	 */
	void exitAssignmentField(MySqlParser.AssignmentFieldContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#lockClause}.
	 * @param ctx the preParse tree
	 */
	void enterLockClause(MySqlParser.LockClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#lockClause}.
	 * @param ctx the preParse tree
	 */
	void exitLockClause(MySqlParser.LockClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#singleDeleteStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSingleDeleteStatement(MySqlParser.SingleDeleteStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#singleDeleteStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSingleDeleteStatement(MySqlParser.SingleDeleteStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#multipleDeleteStatement}.
	 * @param ctx the preParse tree
	 */
	void enterMultipleDeleteStatement(MySqlParser.MultipleDeleteStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#multipleDeleteStatement}.
	 * @param ctx the preParse tree
	 */
	void exitMultipleDeleteStatement(MySqlParser.MultipleDeleteStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#handlerOpenStatement}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerOpenStatement(MySqlParser.HandlerOpenStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#handlerOpenStatement}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerOpenStatement(MySqlParser.HandlerOpenStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#handlerReadIndexStatement}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerReadIndexStatement(MySqlParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#handlerReadIndexStatement}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerReadIndexStatement(MySqlParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#handlerReadStatement}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerReadStatement(MySqlParser.HandlerReadStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#handlerReadStatement}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerReadStatement(MySqlParser.HandlerReadStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#handlerCloseStatement}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerCloseStatement(MySqlParser.HandlerCloseStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#handlerCloseStatement}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerCloseStatement(MySqlParser.HandlerCloseStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#singleUpdateStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSingleUpdateStatement(MySqlParser.SingleUpdateStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#singleUpdateStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSingleUpdateStatement(MySqlParser.SingleUpdateStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#multipleUpdateStatement}.
	 * @param ctx the preParse tree
	 */
	void enterMultipleUpdateStatement(MySqlParser.MultipleUpdateStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#multipleUpdateStatement}.
	 * @param ctx the preParse tree
	 */
	void exitMultipleUpdateStatement(MySqlParser.MultipleUpdateStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#orderByClause}.
	 * @param ctx the preParse tree
	 */
	void enterOrderByClause(MySqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#orderByClause}.
	 * @param ctx the preParse tree
	 */
	void exitOrderByClause(MySqlParser.OrderByClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#orderByExpression}.
	 * @param ctx the preParse tree
	 */
	void enterOrderByExpression(MySqlParser.OrderByExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#orderByExpression}.
	 * @param ctx the preParse tree
	 */
	void exitOrderByExpression(MySqlParser.OrderByExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#tableSources}.
	 * @param ctx the preParse tree
	 */
	void enterTableSources(MySqlParser.TableSourcesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#tableSources}.
	 * @param ctx the preParse tree
	 */
	void exitTableSources(MySqlParser.TableSourcesContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the preParse tree
	 */
	void enterTableSourceBase(MySqlParser.TableSourceBaseContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the preParse tree
	 */
	void exitTableSourceBase(MySqlParser.TableSourceBaseContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the preParse tree
	 */
	void enterTableSourceNested(MySqlParser.TableSourceNestedContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the preParse tree
	 */
	void exitTableSourceNested(MySqlParser.TableSourceNestedContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the preParse tree
	 */
	void enterAtomTableItem(MySqlParser.AtomTableItemContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the preParse tree
	 */
	void exitAtomTableItem(MySqlParser.AtomTableItemContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the preParse tree
	 */
	void enterSubqueryTableItem(MySqlParser.SubqueryTableItemContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the preParse tree
	 */
	void exitSubqueryTableItem(MySqlParser.SubqueryTableItemContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the preParse tree
	 */
	void enterTableSourcesItem(MySqlParser.TableSourcesItemContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the preParse tree
	 */
	void exitTableSourcesItem(MySqlParser.TableSourcesItemContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#indexHint}.
	 * @param ctx the preParse tree
	 */
	void enterIndexHint(MySqlParser.IndexHintContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#indexHint}.
	 * @param ctx the preParse tree
	 */
	void exitIndexHint(MySqlParser.IndexHintContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#indexHintType}.
	 * @param ctx the preParse tree
	 */
	void enterIndexHintType(MySqlParser.IndexHintTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#indexHintType}.
	 * @param ctx the preParse tree
	 */
	void exitIndexHintType(MySqlParser.IndexHintTypeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the preParse tree
	 */
	void enterInnerJoin(MySqlParser.InnerJoinContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the preParse tree
	 */
	void exitInnerJoin(MySqlParser.InnerJoinContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the preParse tree
	 */
	void enterStraightJoin(MySqlParser.StraightJoinContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the preParse tree
	 */
	void exitStraightJoin(MySqlParser.StraightJoinContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the preParse tree
	 */
	void enterOuterJoin(MySqlParser.OuterJoinContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the preParse tree
	 */
	void exitOuterJoin(MySqlParser.OuterJoinContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the preParse tree
	 */
	void enterNaturalJoin(MySqlParser.NaturalJoinContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the preParse tree
	 */
	void exitNaturalJoin(MySqlParser.NaturalJoinContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#queryExpression}.
	 * @param ctx the preParse tree
	 */
	void enterQueryExpression(MySqlParser.QueryExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#queryExpression}.
	 * @param ctx the preParse tree
	 */
	void exitQueryExpression(MySqlParser.QueryExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#queryExpressionNointo}.
	 * @param ctx the preParse tree
	 */
	void enterQueryExpressionNointo(MySqlParser.QueryExpressionNointoContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#queryExpressionNointo}.
	 * @param ctx the preParse tree
	 */
	void exitQueryExpressionNointo(MySqlParser.QueryExpressionNointoContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#querySpecification}.
	 * @param ctx the preParse tree
	 */
	void enterQuerySpecification(MySqlParser.QuerySpecificationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#querySpecification}.
	 * @param ctx the preParse tree
	 */
	void exitQuerySpecification(MySqlParser.QuerySpecificationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#querySpecificationNointo}.
	 * @param ctx the preParse tree
	 */
	void enterQuerySpecificationNointo(MySqlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#querySpecificationNointo}.
	 * @param ctx the preParse tree
	 */
	void exitQuerySpecificationNointo(MySqlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#unionParenthesis}.
	 * @param ctx the preParse tree
	 */
	void enterUnionParenthesis(MySqlParser.UnionParenthesisContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#unionParenthesis}.
	 * @param ctx the preParse tree
	 */
	void exitUnionParenthesis(MySqlParser.UnionParenthesisContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#unionStatement}.
	 * @param ctx the preParse tree
	 */
	void enterUnionStatement(MySqlParser.UnionStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#unionStatement}.
	 * @param ctx the preParse tree
	 */
	void exitUnionStatement(MySqlParser.UnionStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#selectSpec}.
	 * @param ctx the preParse tree
	 */
	void enterSelectSpec(MySqlParser.SelectSpecContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#selectSpec}.
	 * @param ctx the preParse tree
	 */
	void exitSelectSpec(MySqlParser.SelectSpecContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#selectElements}.
	 * @param ctx the preParse tree
	 */
	void enterSelectElements(MySqlParser.SelectElementsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#selectElements}.
	 * @param ctx the preParse tree
	 */
	void exitSelectElements(MySqlParser.SelectElementsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the preParse tree
	 */
	void enterSelectStarElement(MySqlParser.SelectStarElementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the preParse tree
	 */
	void exitSelectStarElement(MySqlParser.SelectStarElementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the preParse tree
	 */
	void enterSelectColumnElement(MySqlParser.SelectColumnElementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the preParse tree
	 */
	void exitSelectColumnElement(MySqlParser.SelectColumnElementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the preParse tree
	 */
	void enterSelectFunctionElement(MySqlParser.SelectFunctionElementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the preParse tree
	 */
	void exitSelectFunctionElement(MySqlParser.SelectFunctionElementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the preParse tree
	 */
	void enterSelectExpressionElement(MySqlParser.SelectExpressionElementContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the preParse tree
	 */
	void exitSelectExpressionElement(MySqlParser.SelectExpressionElementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the preParse tree
	 */
	void enterSelectIntoVariables(MySqlParser.SelectIntoVariablesContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the preParse tree
	 */
	void exitSelectIntoVariables(MySqlParser.SelectIntoVariablesContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the preParse tree
	 */
	void enterSelectIntoDumpFile(MySqlParser.SelectIntoDumpFileContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the preParse tree
	 */
	void exitSelectIntoDumpFile(MySqlParser.SelectIntoDumpFileContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the preParse tree
	 */
	void enterSelectIntoTextFile(MySqlParser.SelectIntoTextFileContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the preParse tree
	 */
	void exitSelectIntoTextFile(MySqlParser.SelectIntoTextFileContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#selectFieldsInto}.
	 * @param ctx the preParse tree
	 */
	void enterSelectFieldsInto(MySqlParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#selectFieldsInto}.
	 * @param ctx the preParse tree
	 */
	void exitSelectFieldsInto(MySqlParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#selectLinesInto}.
	 * @param ctx the preParse tree
	 */
	void enterSelectLinesInto(MySqlParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#selectLinesInto}.
	 * @param ctx the preParse tree
	 */
	void exitSelectLinesInto(MySqlParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#fromClause}.
	 * @param ctx the preParse tree
	 */
	void enterFromClause(MySqlParser.FromClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#fromClause}.
	 * @param ctx the preParse tree
	 */
	void exitFromClause(MySqlParser.FromClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#groupByItem}.
	 * @param ctx the preParse tree
	 */
	void enterGroupByItem(MySqlParser.GroupByItemContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#groupByItem}.
	 * @param ctx the preParse tree
	 */
	void exitGroupByItem(MySqlParser.GroupByItemContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#limitClause}.
	 * @param ctx the preParse tree
	 */
	void enterLimitClause(MySqlParser.LimitClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#limitClause}.
	 * @param ctx the preParse tree
	 */
	void exitLimitClause(MySqlParser.LimitClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#startTransaction}.
	 * @param ctx the preParse tree
	 */
	void enterStartTransaction(MySqlParser.StartTransactionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#startTransaction}.
	 * @param ctx the preParse tree
	 */
	void exitStartTransaction(MySqlParser.StartTransactionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#beginWork}.
	 * @param ctx the preParse tree
	 */
	void enterBeginWork(MySqlParser.BeginWorkContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#beginWork}.
	 * @param ctx the preParse tree
	 */
	void exitBeginWork(MySqlParser.BeginWorkContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#commitWork}.
	 * @param ctx the preParse tree
	 */
	void enterCommitWork(MySqlParser.CommitWorkContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#commitWork}.
	 * @param ctx the preParse tree
	 */
	void exitCommitWork(MySqlParser.CommitWorkContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#rollbackWork}.
	 * @param ctx the preParse tree
	 */
	void enterRollbackWork(MySqlParser.RollbackWorkContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#rollbackWork}.
	 * @param ctx the preParse tree
	 */
	void exitRollbackWork(MySqlParser.RollbackWorkContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#savepointStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSavepointStatement(MySqlParser.SavepointStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#savepointStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSavepointStatement(MySqlParser.SavepointStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#rollbackStatement}.
	 * @param ctx the preParse tree
	 */
	void enterRollbackStatement(MySqlParser.RollbackStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#rollbackStatement}.
	 * @param ctx the preParse tree
	 */
	void exitRollbackStatement(MySqlParser.RollbackStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#releaseStatement}.
	 * @param ctx the preParse tree
	 */
	void enterReleaseStatement(MySqlParser.ReleaseStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#releaseStatement}.
	 * @param ctx the preParse tree
	 */
	void exitReleaseStatement(MySqlParser.ReleaseStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#lockTables}.
	 * @param ctx the preParse tree
	 */
	void enterLockTables(MySqlParser.LockTablesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#lockTables}.
	 * @param ctx the preParse tree
	 */
	void exitLockTables(MySqlParser.LockTablesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#unlockTables}.
	 * @param ctx the preParse tree
	 */
	void enterUnlockTables(MySqlParser.UnlockTablesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#unlockTables}.
	 * @param ctx the preParse tree
	 */
	void exitUnlockTables(MySqlParser.UnlockTablesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#setAutocommitStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSetAutocommitStatement(MySqlParser.SetAutocommitStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#setAutocommitStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSetAutocommitStatement(MySqlParser.SetAutocommitStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#setTransactionStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSetTransactionStatement(MySqlParser.SetTransactionStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#setTransactionStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSetTransactionStatement(MySqlParser.SetTransactionStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#transactionMode}.
	 * @param ctx the preParse tree
	 */
	void enterTransactionMode(MySqlParser.TransactionModeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#transactionMode}.
	 * @param ctx the preParse tree
	 */
	void exitTransactionMode(MySqlParser.TransactionModeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#lockTableElement}.
	 * @param ctx the preParse tree
	 */
	void enterLockTableElement(MySqlParser.LockTableElementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#lockTableElement}.
	 * @param ctx the preParse tree
	 */
	void exitLockTableElement(MySqlParser.LockTableElementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#lockAction}.
	 * @param ctx the preParse tree
	 */
	void enterLockAction(MySqlParser.LockActionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#lockAction}.
	 * @param ctx the preParse tree
	 */
	void exitLockAction(MySqlParser.LockActionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#transactionOption}.
	 * @param ctx the preParse tree
	 */
	void enterTransactionOption(MySqlParser.TransactionOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#transactionOption}.
	 * @param ctx the preParse tree
	 */
	void exitTransactionOption(MySqlParser.TransactionOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#transactionLevel}.
	 * @param ctx the preParse tree
	 */
	void enterTransactionLevel(MySqlParser.TransactionLevelContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#transactionLevel}.
	 * @param ctx the preParse tree
	 */
	void exitTransactionLevel(MySqlParser.TransactionLevelContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#changeMaster}.
	 * @param ctx the preParse tree
	 */
	void enterChangeMaster(MySqlParser.ChangeMasterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#changeMaster}.
	 * @param ctx the preParse tree
	 */
	void exitChangeMaster(MySqlParser.ChangeMasterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#changeReplicationFilter}.
	 * @param ctx the preParse tree
	 */
	void enterChangeReplicationFilter(MySqlParser.ChangeReplicationFilterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#changeReplicationFilter}.
	 * @param ctx the preParse tree
	 */
	void exitChangeReplicationFilter(MySqlParser.ChangeReplicationFilterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#purgeBinaryLogs}.
	 * @param ctx the preParse tree
	 */
	void enterPurgeBinaryLogs(MySqlParser.PurgeBinaryLogsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#purgeBinaryLogs}.
	 * @param ctx the preParse tree
	 */
	void exitPurgeBinaryLogs(MySqlParser.PurgeBinaryLogsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#resetMaster}.
	 * @param ctx the preParse tree
	 */
	void enterResetMaster(MySqlParser.ResetMasterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#resetMaster}.
	 * @param ctx the preParse tree
	 */
	void exitResetMaster(MySqlParser.ResetMasterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#resetSlave}.
	 * @param ctx the preParse tree
	 */
	void enterResetSlave(MySqlParser.ResetSlaveContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#resetSlave}.
	 * @param ctx the preParse tree
	 */
	void exitResetSlave(MySqlParser.ResetSlaveContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#startSlave}.
	 * @param ctx the preParse tree
	 */
	void enterStartSlave(MySqlParser.StartSlaveContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#startSlave}.
	 * @param ctx the preParse tree
	 */
	void exitStartSlave(MySqlParser.StartSlaveContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#stopSlave}.
	 * @param ctx the preParse tree
	 */
	void enterStopSlave(MySqlParser.StopSlaveContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#stopSlave}.
	 * @param ctx the preParse tree
	 */
	void exitStopSlave(MySqlParser.StopSlaveContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#startGroupReplication}.
	 * @param ctx the preParse tree
	 */
	void enterStartGroupReplication(MySqlParser.StartGroupReplicationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#startGroupReplication}.
	 * @param ctx the preParse tree
	 */
	void exitStartGroupReplication(MySqlParser.StartGroupReplicationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#stopGroupReplication}.
	 * @param ctx the preParse tree
	 */
	void enterStopGroupReplication(MySqlParser.StopGroupReplicationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#stopGroupReplication}.
	 * @param ctx the preParse tree
	 */
	void exitStopGroupReplication(MySqlParser.StopGroupReplicationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the preParse tree
	 */
	void enterMasterStringOption(MySqlParser.MasterStringOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the preParse tree
	 */
	void exitMasterStringOption(MySqlParser.MasterStringOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the preParse tree
	 */
	void enterMasterDecimalOption(MySqlParser.MasterDecimalOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the preParse tree
	 */
	void exitMasterDecimalOption(MySqlParser.MasterDecimalOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the preParse tree
	 */
	void enterMasterBoolOption(MySqlParser.MasterBoolOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the preParse tree
	 */
	void exitMasterBoolOption(MySqlParser.MasterBoolOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the preParse tree
	 */
	void enterMasterRealOption(MySqlParser.MasterRealOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the preParse tree
	 */
	void exitMasterRealOption(MySqlParser.MasterRealOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the preParse tree
	 */
	void enterMasterUidListOption(MySqlParser.MasterUidListOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the preParse tree
	 */
	void exitMasterUidListOption(MySqlParser.MasterUidListOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#stringMasterOption}.
	 * @param ctx the preParse tree
	 */
	void enterStringMasterOption(MySqlParser.StringMasterOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#stringMasterOption}.
	 * @param ctx the preParse tree
	 */
	void exitStringMasterOption(MySqlParser.StringMasterOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#decimalMasterOption}.
	 * @param ctx the preParse tree
	 */
	void enterDecimalMasterOption(MySqlParser.DecimalMasterOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#decimalMasterOption}.
	 * @param ctx the preParse tree
	 */
	void exitDecimalMasterOption(MySqlParser.DecimalMasterOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#boolMasterOption}.
	 * @param ctx the preParse tree
	 */
	void enterBoolMasterOption(MySqlParser.BoolMasterOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#boolMasterOption}.
	 * @param ctx the preParse tree
	 */
	void exitBoolMasterOption(MySqlParser.BoolMasterOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#channelOption}.
	 * @param ctx the preParse tree
	 */
	void enterChannelOption(MySqlParser.ChannelOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#channelOption}.
	 * @param ctx the preParse tree
	 */
	void exitChannelOption(MySqlParser.ChannelOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void enterDoDbReplication(MySqlParser.DoDbReplicationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void exitDoDbReplication(MySqlParser.DoDbReplicationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void enterIgnoreDbReplication(MySqlParser.IgnoreDbReplicationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void exitIgnoreDbReplication(MySqlParser.IgnoreDbReplicationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void enterDoTableReplication(MySqlParser.DoTableReplicationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void exitDoTableReplication(MySqlParser.DoTableReplicationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void enterIgnoreTableReplication(MySqlParser.IgnoreTableReplicationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void exitIgnoreTableReplication(MySqlParser.IgnoreTableReplicationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void enterWildDoTableReplication(MySqlParser.WildDoTableReplicationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void exitWildDoTableReplication(MySqlParser.WildDoTableReplicationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void enterWildIgnoreTableReplication(MySqlParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void exitWildIgnoreTableReplication(MySqlParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void enterRewriteDbReplication(MySqlParser.RewriteDbReplicationContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the preParse tree
	 */
	void exitRewriteDbReplication(MySqlParser.RewriteDbReplicationContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#tablePair}.
	 * @param ctx the preParse tree
	 */
	void enterTablePair(MySqlParser.TablePairContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#tablePair}.
	 * @param ctx the preParse tree
	 */
	void exitTablePair(MySqlParser.TablePairContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#threadType}.
	 * @param ctx the preParse tree
	 */
	void enterThreadType(MySqlParser.ThreadTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#threadType}.
	 * @param ctx the preParse tree
	 */
	void exitThreadType(MySqlParser.ThreadTypeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the preParse tree
	 */
	void enterGtidsUntilOption(MySqlParser.GtidsUntilOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the preParse tree
	 */
	void exitGtidsUntilOption(MySqlParser.GtidsUntilOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the preParse tree
	 */
	void enterMasterLogUntilOption(MySqlParser.MasterLogUntilOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the preParse tree
	 */
	void exitMasterLogUntilOption(MySqlParser.MasterLogUntilOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the preParse tree
	 */
	void enterRelayLogUntilOption(MySqlParser.RelayLogUntilOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the preParse tree
	 */
	void exitRelayLogUntilOption(MySqlParser.RelayLogUntilOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the preParse tree
	 */
	void enterSqlGapsUntilOption(MySqlParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the preParse tree
	 */
	void exitSqlGapsUntilOption(MySqlParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the preParse tree
	 */
	void enterUserConnectionOption(MySqlParser.UserConnectionOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the preParse tree
	 */
	void exitUserConnectionOption(MySqlParser.UserConnectionOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the preParse tree
	 */
	void enterPasswordConnectionOption(MySqlParser.PasswordConnectionOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the preParse tree
	 */
	void exitPasswordConnectionOption(MySqlParser.PasswordConnectionOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the preParse tree
	 */
	void enterDefaultAuthConnectionOption(MySqlParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the preParse tree
	 */
	void exitDefaultAuthConnectionOption(MySqlParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the preParse tree
	 */
	void enterPluginDirConnectionOption(MySqlParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the preParse tree
	 */
	void exitPluginDirConnectionOption(MySqlParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#gtuidSet}.
	 * @param ctx the preParse tree
	 */
	void enterGtuidSet(MySqlParser.GtuidSetContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#gtuidSet}.
	 * @param ctx the preParse tree
	 */
	void exitGtuidSet(MySqlParser.GtuidSetContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#xaStartTransaction}.
	 * @param ctx the preParse tree
	 */
	void enterXaStartTransaction(MySqlParser.XaStartTransactionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#xaStartTransaction}.
	 * @param ctx the preParse tree
	 */
	void exitXaStartTransaction(MySqlParser.XaStartTransactionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#xaEndTransaction}.
	 * @param ctx the preParse tree
	 */
	void enterXaEndTransaction(MySqlParser.XaEndTransactionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#xaEndTransaction}.
	 * @param ctx the preParse tree
	 */
	void exitXaEndTransaction(MySqlParser.XaEndTransactionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#xaPrepareStatement}.
	 * @param ctx the preParse tree
	 */
	void enterXaPrepareStatement(MySqlParser.XaPrepareStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#xaPrepareStatement}.
	 * @param ctx the preParse tree
	 */
	void exitXaPrepareStatement(MySqlParser.XaPrepareStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#xaCommitWork}.
	 * @param ctx the preParse tree
	 */
	void enterXaCommitWork(MySqlParser.XaCommitWorkContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#xaCommitWork}.
	 * @param ctx the preParse tree
	 */
	void exitXaCommitWork(MySqlParser.XaCommitWorkContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#xaRollbackWork}.
	 * @param ctx the preParse tree
	 */
	void enterXaRollbackWork(MySqlParser.XaRollbackWorkContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#xaRollbackWork}.
	 * @param ctx the preParse tree
	 */
	void exitXaRollbackWork(MySqlParser.XaRollbackWorkContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#xaRecoverWork}.
	 * @param ctx the preParse tree
	 */
	void enterXaRecoverWork(MySqlParser.XaRecoverWorkContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#xaRecoverWork}.
	 * @param ctx the preParse tree
	 */
	void exitXaRecoverWork(MySqlParser.XaRecoverWorkContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#prepareStatement}.
	 * @param ctx the preParse tree
	 */
	void enterPrepareStatement(MySqlParser.PrepareStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#prepareStatement}.
	 * @param ctx the preParse tree
	 */
	void exitPrepareStatement(MySqlParser.PrepareStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#executeStatement}.
	 * @param ctx the preParse tree
	 */
	void enterExecuteStatement(MySqlParser.ExecuteStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#executeStatement}.
	 * @param ctx the preParse tree
	 */
	void exitExecuteStatement(MySqlParser.ExecuteStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#deallocatePrepare}.
	 * @param ctx the preParse tree
	 */
	void enterDeallocatePrepare(MySqlParser.DeallocatePrepareContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#deallocatePrepare}.
	 * @param ctx the preParse tree
	 */
	void exitDeallocatePrepare(MySqlParser.DeallocatePrepareContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#routineBody}.
	 * @param ctx the preParse tree
	 */
	void enterRoutineBody(MySqlParser.RoutineBodyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#routineBody}.
	 * @param ctx the preParse tree
	 */
	void exitRoutineBody(MySqlParser.RoutineBodyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#blockStatement}.
	 * @param ctx the preParse tree
	 */
	void enterBlockStatement(MySqlParser.BlockStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#blockStatement}.
	 * @param ctx the preParse tree
	 */
	void exitBlockStatement(MySqlParser.BlockStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#caseStatement}.
	 * @param ctx the preParse tree
	 */
	void enterCaseStatement(MySqlParser.CaseStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#caseStatement}.
	 * @param ctx the preParse tree
	 */
	void exitCaseStatement(MySqlParser.CaseStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#ifStatement}.
	 * @param ctx the preParse tree
	 */
	void enterIfStatement(MySqlParser.IfStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#ifStatement}.
	 * @param ctx the preParse tree
	 */
	void exitIfStatement(MySqlParser.IfStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#iterateStatement}.
	 * @param ctx the preParse tree
	 */
	void enterIterateStatement(MySqlParser.IterateStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#iterateStatement}.
	 * @param ctx the preParse tree
	 */
	void exitIterateStatement(MySqlParser.IterateStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#leaveStatement}.
	 * @param ctx the preParse tree
	 */
	void enterLeaveStatement(MySqlParser.LeaveStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#leaveStatement}.
	 * @param ctx the preParse tree
	 */
	void exitLeaveStatement(MySqlParser.LeaveStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#loopStatement}.
	 * @param ctx the preParse tree
	 */
	void enterLoopStatement(MySqlParser.LoopStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#loopStatement}.
	 * @param ctx the preParse tree
	 */
	void exitLoopStatement(MySqlParser.LoopStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#repeatStatement}.
	 * @param ctx the preParse tree
	 */
	void enterRepeatStatement(MySqlParser.RepeatStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#repeatStatement}.
	 * @param ctx the preParse tree
	 */
	void exitRepeatStatement(MySqlParser.RepeatStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#returnStatement}.
	 * @param ctx the preParse tree
	 */
	void enterReturnStatement(MySqlParser.ReturnStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#returnStatement}.
	 * @param ctx the preParse tree
	 */
	void exitReturnStatement(MySqlParser.ReturnStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#whileStatement}.
	 * @param ctx the preParse tree
	 */
	void enterWhileStatement(MySqlParser.WhileStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#whileStatement}.
	 * @param ctx the preParse tree
	 */
	void exitWhileStatement(MySqlParser.WhileStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the preParse tree
	 */
	void enterCloseCursor(MySqlParser.CloseCursorContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the preParse tree
	 */
	void exitCloseCursor(MySqlParser.CloseCursorContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the preParse tree
	 */
	void enterFetchCursor(MySqlParser.FetchCursorContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the preParse tree
	 */
	void exitFetchCursor(MySqlParser.FetchCursorContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the preParse tree
	 */
	void enterOpenCursor(MySqlParser.OpenCursorContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the preParse tree
	 */
	void exitOpenCursor(MySqlParser.OpenCursorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#declareVariable}.
	 * @param ctx the preParse tree
	 */
	void enterDeclareVariable(MySqlParser.DeclareVariableContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#declareVariable}.
	 * @param ctx the preParse tree
	 */
	void exitDeclareVariable(MySqlParser.DeclareVariableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#declareCondition}.
	 * @param ctx the preParse tree
	 */
	void enterDeclareCondition(MySqlParser.DeclareConditionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#declareCondition}.
	 * @param ctx the preParse tree
	 */
	void exitDeclareCondition(MySqlParser.DeclareConditionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#declareCursor}.
	 * @param ctx the preParse tree
	 */
	void enterDeclareCursor(MySqlParser.DeclareCursorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#declareCursor}.
	 * @param ctx the preParse tree
	 */
	void exitDeclareCursor(MySqlParser.DeclareCursorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#declareHandler}.
	 * @param ctx the preParse tree
	 */
	void enterDeclareHandler(MySqlParser.DeclareHandlerContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#declareHandler}.
	 * @param ctx the preParse tree
	 */
	void exitDeclareHandler(MySqlParser.DeclareHandlerContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerConditionCode(MySqlParser.HandlerConditionCodeContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerConditionCode(MySqlParser.HandlerConditionCodeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerConditionState(MySqlParser.HandlerConditionStateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerConditionState(MySqlParser.HandlerConditionStateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerConditionName(MySqlParser.HandlerConditionNameContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerConditionName(MySqlParser.HandlerConditionNameContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerConditionWarning(MySqlParser.HandlerConditionWarningContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerConditionWarning(MySqlParser.HandlerConditionWarningContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerConditionNotfound(MySqlParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerConditionNotfound(MySqlParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void enterHandlerConditionException(MySqlParser.HandlerConditionExceptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the preParse tree
	 */
	void exitHandlerConditionException(MySqlParser.HandlerConditionExceptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#procedureSqlStatement}.
	 * @param ctx the preParse tree
	 */
	void enterProcedureSqlStatement(MySqlParser.ProcedureSqlStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#procedureSqlStatement}.
	 * @param ctx the preParse tree
	 */
	void exitProcedureSqlStatement(MySqlParser.ProcedureSqlStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#caseAlternative}.
	 * @param ctx the preParse tree
	 */
	void enterCaseAlternative(MySqlParser.CaseAlternativeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#caseAlternative}.
	 * @param ctx the preParse tree
	 */
	void exitCaseAlternative(MySqlParser.CaseAlternativeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#elifAlternative}.
	 * @param ctx the preParse tree
	 */
	void enterElifAlternative(MySqlParser.ElifAlternativeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#elifAlternative}.
	 * @param ctx the preParse tree
	 */
	void exitElifAlternative(MySqlParser.ElifAlternativeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link MySqlParser#alterUser}.
	 * @param ctx the preParse tree
	 */
	void enterAlterUserMysqlV56(MySqlParser.AlterUserMysqlV56Context ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link MySqlParser#alterUser}.
	 * @param ctx the preParse tree
	 */
	void exitAlterUserMysqlV56(MySqlParser.AlterUserMysqlV56Context ctx);
	/**
	 * Enter a preParse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link MySqlParser#alterUser}.
	 * @param ctx the preParse tree
	 */
	void enterAlterUserMysqlV57(MySqlParser.AlterUserMysqlV57Context ctx);
	/**
	 * Exit a preParse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link MySqlParser#alterUser}.
	 * @param ctx the preParse tree
	 */
	void exitAlterUserMysqlV57(MySqlParser.AlterUserMysqlV57Context ctx);
	/**
	 * Enter a preParse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link MySqlParser#createUser}.
	 * @param ctx the preParse tree
	 */
	void enterCreateUserMysqlV56(MySqlParser.CreateUserMysqlV56Context ctx);
	/**
	 * Exit a preParse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link MySqlParser#createUser}.
	 * @param ctx the preParse tree
	 */
	void exitCreateUserMysqlV56(MySqlParser.CreateUserMysqlV56Context ctx);
	/**
	 * Enter a preParse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link MySqlParser#createUser}.
	 * @param ctx the preParse tree
	 */
	void enterCreateUserMysqlV57(MySqlParser.CreateUserMysqlV57Context ctx);
	/**
	 * Exit a preParse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link MySqlParser#createUser}.
	 * @param ctx the preParse tree
	 */
	void exitCreateUserMysqlV57(MySqlParser.CreateUserMysqlV57Context ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dropUser}.
	 * @param ctx the preParse tree
	 */
	void enterDropUser(MySqlParser.DropUserContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dropUser}.
	 * @param ctx the preParse tree
	 */
	void exitDropUser(MySqlParser.DropUserContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#grantStatement}.
	 * @param ctx the preParse tree
	 */
	void enterGrantStatement(MySqlParser.GrantStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#grantStatement}.
	 * @param ctx the preParse tree
	 */
	void exitGrantStatement(MySqlParser.GrantStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#grantProxy}.
	 * @param ctx the preParse tree
	 */
	void enterGrantProxy(MySqlParser.GrantProxyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#grantProxy}.
	 * @param ctx the preParse tree
	 */
	void exitGrantProxy(MySqlParser.GrantProxyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#renameUser}.
	 * @param ctx the preParse tree
	 */
	void enterRenameUser(MySqlParser.RenameUserContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#renameUser}.
	 * @param ctx the preParse tree
	 */
	void exitRenameUser(MySqlParser.RenameUserContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link MySqlParser#revokeStatement}.
	 * @param ctx the preParse tree
	 */
	void enterDetailRevoke(MySqlParser.DetailRevokeContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link MySqlParser#revokeStatement}.
	 * @param ctx the preParse tree
	 */
	void exitDetailRevoke(MySqlParser.DetailRevokeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link MySqlParser#revokeStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShortRevoke(MySqlParser.ShortRevokeContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link MySqlParser#revokeStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShortRevoke(MySqlParser.ShortRevokeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#revokeProxy}.
	 * @param ctx the preParse tree
	 */
	void enterRevokeProxy(MySqlParser.RevokeProxyContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#revokeProxy}.
	 * @param ctx the preParse tree
	 */
	void exitRevokeProxy(MySqlParser.RevokeProxyContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#setPasswordStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSetPasswordStatement(MySqlParser.SetPasswordStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#setPasswordStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSetPasswordStatement(MySqlParser.SetPasswordStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#userSpecification}.
	 * @param ctx the preParse tree
	 */
	void enterUserSpecification(MySqlParser.UserSpecificationContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#userSpecification}.
	 * @param ctx the preParse tree
	 */
	void exitUserSpecification(MySqlParser.UserSpecificationContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the preParse tree
	 */
	void enterPasswordAuthOption(MySqlParser.PasswordAuthOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the preParse tree
	 */
	void exitPasswordAuthOption(MySqlParser.PasswordAuthOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the preParse tree
	 */
	void enterStringAuthOption(MySqlParser.StringAuthOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the preParse tree
	 */
	void exitStringAuthOption(MySqlParser.StringAuthOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the preParse tree
	 */
	void enterHashAuthOption(MySqlParser.HashAuthOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the preParse tree
	 */
	void exitHashAuthOption(MySqlParser.HashAuthOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the preParse tree
	 */
	void enterSimpleAuthOption(MySqlParser.SimpleAuthOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the preParse tree
	 */
	void exitSimpleAuthOption(MySqlParser.SimpleAuthOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#tlsOption}.
	 * @param ctx the preParse tree
	 */
	void enterTlsOption(MySqlParser.TlsOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#tlsOption}.
	 * @param ctx the preParse tree
	 */
	void exitTlsOption(MySqlParser.TlsOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#userResourceOption}.
	 * @param ctx the preParse tree
	 */
	void enterUserResourceOption(MySqlParser.UserResourceOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#userResourceOption}.
	 * @param ctx the preParse tree
	 */
	void exitUserResourceOption(MySqlParser.UserResourceOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#userPasswordOption}.
	 * @param ctx the preParse tree
	 */
	void enterUserPasswordOption(MySqlParser.UserPasswordOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#userPasswordOption}.
	 * @param ctx the preParse tree
	 */
	void exitUserPasswordOption(MySqlParser.UserPasswordOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#userLockOption}.
	 * @param ctx the preParse tree
	 */
	void enterUserLockOption(MySqlParser.UserLockOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#userLockOption}.
	 * @param ctx the preParse tree
	 */
	void exitUserLockOption(MySqlParser.UserLockOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#privelegeClause}.
	 * @param ctx the preParse tree
	 */
	void enterPrivelegeClause(MySqlParser.PrivelegeClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#privelegeClause}.
	 * @param ctx the preParse tree
	 */
	void exitPrivelegeClause(MySqlParser.PrivelegeClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#privilege}.
	 * @param ctx the preParse tree
	 */
	void enterPrivilege(MySqlParser.PrivilegeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#privilege}.
	 * @param ctx the preParse tree
	 */
	void exitPrivilege(MySqlParser.PrivilegeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the preParse tree
	 */
	void enterCurrentSchemaPriviLevel(MySqlParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the preParse tree
	 */
	void exitCurrentSchemaPriviLevel(MySqlParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the preParse tree
	 */
	void enterGlobalPrivLevel(MySqlParser.GlobalPrivLevelContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the preParse tree
	 */
	void exitGlobalPrivLevel(MySqlParser.GlobalPrivLevelContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the preParse tree
	 */
	void enterDefiniteSchemaPrivLevel(MySqlParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the preParse tree
	 */
	void exitDefiniteSchemaPrivLevel(MySqlParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the preParse tree
	 */
	void enterDefiniteFullTablePrivLevel(MySqlParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the preParse tree
	 */
	void exitDefiniteFullTablePrivLevel(MySqlParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the preParse tree
	 */
	void enterDefiniteTablePrivLevel(MySqlParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the preParse tree
	 */
	void exitDefiniteTablePrivLevel(MySqlParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#renameUserClause}.
	 * @param ctx the preParse tree
	 */
	void enterRenameUserClause(MySqlParser.RenameUserClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#renameUserClause}.
	 * @param ctx the preParse tree
	 */
	void exitRenameUserClause(MySqlParser.RenameUserClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#analyzeTable}.
	 * @param ctx the preParse tree
	 */
	void enterAnalyzeTable(MySqlParser.AnalyzeTableContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#analyzeTable}.
	 * @param ctx the preParse tree
	 */
	void exitAnalyzeTable(MySqlParser.AnalyzeTableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#checkTable}.
	 * @param ctx the preParse tree
	 */
	void enterCheckTable(MySqlParser.CheckTableContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#checkTable}.
	 * @param ctx the preParse tree
	 */
	void exitCheckTable(MySqlParser.CheckTableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#checksumTable}.
	 * @param ctx the preParse tree
	 */
	void enterChecksumTable(MySqlParser.ChecksumTableContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#checksumTable}.
	 * @param ctx the preParse tree
	 */
	void exitChecksumTable(MySqlParser.ChecksumTableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#optimizeTable}.
	 * @param ctx the preParse tree
	 */
	void enterOptimizeTable(MySqlParser.OptimizeTableContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#optimizeTable}.
	 * @param ctx the preParse tree
	 */
	void exitOptimizeTable(MySqlParser.OptimizeTableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#repairTable}.
	 * @param ctx the preParse tree
	 */
	void enterRepairTable(MySqlParser.RepairTableContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#repairTable}.
	 * @param ctx the preParse tree
	 */
	void exitRepairTable(MySqlParser.RepairTableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#checkTableOption}.
	 * @param ctx the preParse tree
	 */
	void enterCheckTableOption(MySqlParser.CheckTableOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#checkTableOption}.
	 * @param ctx the preParse tree
	 */
	void exitCheckTableOption(MySqlParser.CheckTableOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#createUdfunction}.
	 * @param ctx the preParse tree
	 */
	void enterCreateUdfunction(MySqlParser.CreateUdfunctionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#createUdfunction}.
	 * @param ctx the preParse tree
	 */
	void exitCreateUdfunction(MySqlParser.CreateUdfunctionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#installPlugin}.
	 * @param ctx the preParse tree
	 */
	void enterInstallPlugin(MySqlParser.InstallPluginContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#installPlugin}.
	 * @param ctx the preParse tree
	 */
	void exitInstallPlugin(MySqlParser.InstallPluginContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#uninstallPlugin}.
	 * @param ctx the preParse tree
	 */
	void enterUninstallPlugin(MySqlParser.UninstallPluginContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#uninstallPlugin}.
	 * @param ctx the preParse tree
	 */
	void exitUninstallPlugin(MySqlParser.UninstallPluginContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code setVariable}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSetVariable(MySqlParser.SetVariableContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code setVariable}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSetVariable(MySqlParser.SetVariableContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code setCharset}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSetCharset(MySqlParser.SetCharsetContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code setCharset}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSetCharset(MySqlParser.SetCharsetContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code setNames}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSetNames(MySqlParser.SetNamesContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code setNames}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSetNames(MySqlParser.SetNamesContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code setPassword}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSetPassword(MySqlParser.SetPasswordContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code setPassword}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSetPassword(MySqlParser.SetPasswordContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSetTransaction(MySqlParser.SetTransactionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSetTransaction(MySqlParser.SetTransactionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSetAutocommit(MySqlParser.SetAutocommitContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSetAutocommit(MySqlParser.SetAutocommitContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowMasterLogs(MySqlParser.ShowMasterLogsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowMasterLogs(MySqlParser.ShowMasterLogsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowLogEvents(MySqlParser.ShowLogEventsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowLogEvents(MySqlParser.ShowLogEventsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowObjectFilter(MySqlParser.ShowObjectFilterContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowObjectFilter(MySqlParser.ShowObjectFilterContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showColumns}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowColumns(MySqlParser.ShowColumnsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showColumns}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowColumns(MySqlParser.ShowColumnsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowCreateDb(MySqlParser.ShowCreateDbContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowCreateDb(MySqlParser.ShowCreateDbContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowCreateFullIdObject(MySqlParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowCreateFullIdObject(MySqlParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowCreateUser(MySqlParser.ShowCreateUserContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowCreateUser(MySqlParser.ShowCreateUserContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showEngine}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowEngine(MySqlParser.ShowEngineContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showEngine}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowEngine(MySqlParser.ShowEngineContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowGlobalInfo(MySqlParser.ShowGlobalInfoContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowGlobalInfo(MySqlParser.ShowGlobalInfoContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showErrors}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowErrors(MySqlParser.ShowErrorsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showErrors}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowErrors(MySqlParser.ShowErrorsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowCountErrors(MySqlParser.ShowCountErrorsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowCountErrors(MySqlParser.ShowCountErrorsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowSchemaFilter(MySqlParser.ShowSchemaFilterContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowSchemaFilter(MySqlParser.ShowSchemaFilterContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowRoutine(MySqlParser.ShowRoutineContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowRoutine(MySqlParser.ShowRoutineContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showGrants}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowGrants(MySqlParser.ShowGrantsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showGrants}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowGrants(MySqlParser.ShowGrantsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowIndexes(MySqlParser.ShowIndexesContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowIndexes(MySqlParser.ShowIndexesContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowOpenTables(MySqlParser.ShowOpenTablesContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowOpenTables(MySqlParser.ShowOpenTablesContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showProfile}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowProfile(MySqlParser.ShowProfileContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showProfile}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowProfile(MySqlParser.ShowProfileContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShowSlaveStatus(MySqlParser.ShowSlaveStatusContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShowSlaveStatus(MySqlParser.ShowSlaveStatusContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#variableClause}.
	 * @param ctx the preParse tree
	 */
	void enterVariableClause(MySqlParser.VariableClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#variableClause}.
	 * @param ctx the preParse tree
	 */
	void exitVariableClause(MySqlParser.VariableClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#showCommonEntity}.
	 * @param ctx the preParse tree
	 */
	void enterShowCommonEntity(MySqlParser.ShowCommonEntityContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#showCommonEntity}.
	 * @param ctx the preParse tree
	 */
	void exitShowCommonEntity(MySqlParser.ShowCommonEntityContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#showFilter}.
	 * @param ctx the preParse tree
	 */
	void enterShowFilter(MySqlParser.ShowFilterContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#showFilter}.
	 * @param ctx the preParse tree
	 */
	void exitShowFilter(MySqlParser.ShowFilterContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#showGlobalInfoClause}.
	 * @param ctx the preParse tree
	 */
	void enterShowGlobalInfoClause(MySqlParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#showGlobalInfoClause}.
	 * @param ctx the preParse tree
	 */
	void exitShowGlobalInfoClause(MySqlParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#showSchemaEntity}.
	 * @param ctx the preParse tree
	 */
	void enterShowSchemaEntity(MySqlParser.ShowSchemaEntityContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#showSchemaEntity}.
	 * @param ctx the preParse tree
	 */
	void exitShowSchemaEntity(MySqlParser.ShowSchemaEntityContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#showProfileType}.
	 * @param ctx the preParse tree
	 */
	void enterShowProfileType(MySqlParser.ShowProfileTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#showProfileType}.
	 * @param ctx the preParse tree
	 */
	void exitShowProfileType(MySqlParser.ShowProfileTypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#binlogStatement}.
	 * @param ctx the preParse tree
	 */
	void enterBinlogStatement(MySqlParser.BinlogStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#binlogStatement}.
	 * @param ctx the preParse tree
	 */
	void exitBinlogStatement(MySqlParser.BinlogStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#cacheIndexStatement}.
	 * @param ctx the preParse tree
	 */
	void enterCacheIndexStatement(MySqlParser.CacheIndexStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#cacheIndexStatement}.
	 * @param ctx the preParse tree
	 */
	void exitCacheIndexStatement(MySqlParser.CacheIndexStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#flushStatement}.
	 * @param ctx the preParse tree
	 */
	void enterFlushStatement(MySqlParser.FlushStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#flushStatement}.
	 * @param ctx the preParse tree
	 */
	void exitFlushStatement(MySqlParser.FlushStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#killStatement}.
	 * @param ctx the preParse tree
	 */
	void enterKillStatement(MySqlParser.KillStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#killStatement}.
	 * @param ctx the preParse tree
	 */
	void exitKillStatement(MySqlParser.KillStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#loadIndexIntoCache}.
	 * @param ctx the preParse tree
	 */
	void enterLoadIndexIntoCache(MySqlParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#loadIndexIntoCache}.
	 * @param ctx the preParse tree
	 */
	void exitLoadIndexIntoCache(MySqlParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#resetStatement}.
	 * @param ctx the preParse tree
	 */
	void enterResetStatement(MySqlParser.ResetStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#resetStatement}.
	 * @param ctx the preParse tree
	 */
	void exitResetStatement(MySqlParser.ResetStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#shutdownStatement}.
	 * @param ctx the preParse tree
	 */
	void enterShutdownStatement(MySqlParser.ShutdownStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#shutdownStatement}.
	 * @param ctx the preParse tree
	 */
	void exitShutdownStatement(MySqlParser.ShutdownStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#tableIndexes}.
	 * @param ctx the preParse tree
	 */
	void enterTableIndexes(MySqlParser.TableIndexesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#tableIndexes}.
	 * @param ctx the preParse tree
	 */
	void exitTableIndexes(MySqlParser.TableIndexesContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the preParse tree
	 */
	void enterSimpleFlushOption(MySqlParser.SimpleFlushOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the preParse tree
	 */
	void exitSimpleFlushOption(MySqlParser.SimpleFlushOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the preParse tree
	 */
	void enterChannelFlushOption(MySqlParser.ChannelFlushOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the preParse tree
	 */
	void exitChannelFlushOption(MySqlParser.ChannelFlushOptionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the preParse tree
	 */
	void enterTableFlushOption(MySqlParser.TableFlushOptionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the preParse tree
	 */
	void exitTableFlushOption(MySqlParser.TableFlushOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#flushTableOption}.
	 * @param ctx the preParse tree
	 */
	void enterFlushTableOption(MySqlParser.FlushTableOptionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#flushTableOption}.
	 * @param ctx the preParse tree
	 */
	void exitFlushTableOption(MySqlParser.FlushTableOptionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#loadedTableIndexes}.
	 * @param ctx the preParse tree
	 */
	void enterLoadedTableIndexes(MySqlParser.LoadedTableIndexesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#loadedTableIndexes}.
	 * @param ctx the preParse tree
	 */
	void exitLoadedTableIndexes(MySqlParser.LoadedTableIndexesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#simpleDescribeStatement}.
	 * @param ctx the preParse tree
	 */
	void enterSimpleDescribeStatement(MySqlParser.SimpleDescribeStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#simpleDescribeStatement}.
	 * @param ctx the preParse tree
	 */
	void exitSimpleDescribeStatement(MySqlParser.SimpleDescribeStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#fullDescribeStatement}.
	 * @param ctx the preParse tree
	 */
	void enterFullDescribeStatement(MySqlParser.FullDescribeStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#fullDescribeStatement}.
	 * @param ctx the preParse tree
	 */
	void exitFullDescribeStatement(MySqlParser.FullDescribeStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#helpStatement}.
	 * @param ctx the preParse tree
	 */
	void enterHelpStatement(MySqlParser.HelpStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#helpStatement}.
	 * @param ctx the preParse tree
	 */
	void exitHelpStatement(MySqlParser.HelpStatementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#useStatement}.
	 * @param ctx the preParse tree
	 */
	void enterUseStatement(MySqlParser.UseStatementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#useStatement}.
	 * @param ctx the preParse tree
	 */
	void exitUseStatement(MySqlParser.UseStatementContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link MySqlParser#describeObjectClause}.
	 * @param ctx the preParse tree
	 */
	void enterDescribeStatements(MySqlParser.DescribeStatementsContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link MySqlParser#describeObjectClause}.
	 * @param ctx the preParse tree
	 */
	void exitDescribeStatements(MySqlParser.DescribeStatementsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link MySqlParser#describeObjectClause}.
	 * @param ctx the preParse tree
	 */
	void enterDescribeConnection(MySqlParser.DescribeConnectionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link MySqlParser#describeObjectClause}.
	 * @param ctx the preParse tree
	 */
	void exitDescribeConnection(MySqlParser.DescribeConnectionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#fullId}.
	 * @param ctx the preParse tree
	 */
	void enterFullId(MySqlParser.FullIdContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#fullId}.
	 * @param ctx the preParse tree
	 */
	void exitFullId(MySqlParser.FullIdContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#tableName}.
	 * @param ctx the preParse tree
	 */
	void enterTableName(MySqlParser.TableNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#tableName}.
	 * @param ctx the preParse tree
	 */
	void exitTableName(MySqlParser.TableNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#fullColumnName}.
	 * @param ctx the preParse tree
	 */
	void enterFullColumnName(MySqlParser.FullColumnNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#fullColumnName}.
	 * @param ctx the preParse tree
	 */
	void exitFullColumnName(MySqlParser.FullColumnNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#indexColumnName}.
	 * @param ctx the preParse tree
	 */
	void enterIndexColumnName(MySqlParser.IndexColumnNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#indexColumnName}.
	 * @param ctx the preParse tree
	 */
	void exitIndexColumnName(MySqlParser.IndexColumnNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#userName}.
	 * @param ctx the preParse tree
	 */
	void enterUserName(MySqlParser.UserNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#userName}.
	 * @param ctx the preParse tree
	 */
	void exitUserName(MySqlParser.UserNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#mysqlVariable}.
	 * @param ctx the preParse tree
	 */
	void enterMysqlVariable(MySqlParser.MysqlVariableContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#mysqlVariable}.
	 * @param ctx the preParse tree
	 */
	void exitMysqlVariable(MySqlParser.MysqlVariableContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#charsetName}.
	 * @param ctx the preParse tree
	 */
	void enterCharsetName(MySqlParser.CharsetNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#charsetName}.
	 * @param ctx the preParse tree
	 */
	void exitCharsetName(MySqlParser.CharsetNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#collationName}.
	 * @param ctx the preParse tree
	 */
	void enterCollationName(MySqlParser.CollationNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#collationName}.
	 * @param ctx the preParse tree
	 */
	void exitCollationName(MySqlParser.CollationNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#engineName}.
	 * @param ctx the preParse tree
	 */
	void enterEngineName(MySqlParser.EngineNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#engineName}.
	 * @param ctx the preParse tree
	 */
	void exitEngineName(MySqlParser.EngineNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#uuidSet}.
	 * @param ctx the preParse tree
	 */
	void enterUuidSet(MySqlParser.UuidSetContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#uuidSet}.
	 * @param ctx the preParse tree
	 */
	void exitUuidSet(MySqlParser.UuidSetContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#xid}.
	 * @param ctx the preParse tree
	 */
	void enterXid(MySqlParser.XidContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#xid}.
	 * @param ctx the preParse tree
	 */
	void exitXid(MySqlParser.XidContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#xuidStringId}.
	 * @param ctx the preParse tree
	 */
	void enterXuidStringId(MySqlParser.XuidStringIdContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#xuidStringId}.
	 * @param ctx the preParse tree
	 */
	void exitXuidStringId(MySqlParser.XuidStringIdContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#authPlugin}.
	 * @param ctx the preParse tree
	 */
	void enterAuthPlugin(MySqlParser.AuthPluginContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#authPlugin}.
	 * @param ctx the preParse tree
	 */
	void exitAuthPlugin(MySqlParser.AuthPluginContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#uid}.
	 * @param ctx the preParse tree
	 */
	void enterUid(MySqlParser.UidContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#uid}.
	 * @param ctx the preParse tree
	 */
	void exitUid(MySqlParser.UidContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#simpleId}.
	 * @param ctx the preParse tree
	 */
	void enterSimpleId(MySqlParser.SimpleIdContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#simpleId}.
	 * @param ctx the preParse tree
	 */
	void exitSimpleId(MySqlParser.SimpleIdContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dottedId}.
	 * @param ctx the preParse tree
	 */
	void enterDottedId(MySqlParser.DottedIdContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dottedId}.
	 * @param ctx the preParse tree
	 */
	void exitDottedId(MySqlParser.DottedIdContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#decimalLiteral}.
	 * @param ctx the preParse tree
	 */
	void enterDecimalLiteral(MySqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#decimalLiteral}.
	 * @param ctx the preParse tree
	 */
	void exitDecimalLiteral(MySqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#fileSizeLiteral}.
	 * @param ctx the preParse tree
	 */
	void enterFileSizeLiteral(MySqlParser.FileSizeLiteralContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#fileSizeLiteral}.
	 * @param ctx the preParse tree
	 */
	void exitFileSizeLiteral(MySqlParser.FileSizeLiteralContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#stringLiteral}.
	 * @param ctx the preParse tree
	 */
	void enterStringLiteral(MySqlParser.StringLiteralContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#stringLiteral}.
	 * @param ctx the preParse tree
	 */
	void exitStringLiteral(MySqlParser.StringLiteralContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#booleanLiteral}.
	 * @param ctx the preParse tree
	 */
	void enterBooleanLiteral(MySqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#booleanLiteral}.
	 * @param ctx the preParse tree
	 */
	void exitBooleanLiteral(MySqlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#hexadecimalLiteral}.
	 * @param ctx the preParse tree
	 */
	void enterHexadecimalLiteral(MySqlParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#hexadecimalLiteral}.
	 * @param ctx the preParse tree
	 */
	void exitHexadecimalLiteral(MySqlParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#nullNotnull}.
	 * @param ctx the preParse tree
	 */
	void enterNullNotnull(MySqlParser.NullNotnullContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#nullNotnull}.
	 * @param ctx the preParse tree
	 */
	void exitNullNotnull(MySqlParser.NullNotnullContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#updateTime}.
	 * @param ctx the preParse tree
	 */
	void enterUpdateTime(MySqlParser.UpdateTimeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#updateTime}.
	 * @param ctx the preParse tree
	 */
	void exitUpdateTime(MySqlParser.UpdateTimeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#constant}.
	 * @param ctx the preParse tree
	 */
	void enterConstant(MySqlParser.ConstantContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#constant}.
	 * @param ctx the preParse tree
	 */
	void exitConstant(MySqlParser.ConstantContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the preParse tree
	 */
	void enterStringDataType(MySqlParser.StringDataTypeContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the preParse tree
	 */
	void exitStringDataType(MySqlParser.StringDataTypeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the preParse tree
	 */
	void enterDimensionDataType(MySqlParser.DimensionDataTypeContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the preParse tree
	 */
	void exitDimensionDataType(MySqlParser.DimensionDataTypeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the preParse tree
	 */
	void enterSimpleDataType(MySqlParser.SimpleDataTypeContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the preParse tree
	 */
	void exitSimpleDataType(MySqlParser.SimpleDataTypeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the preParse tree
	 */
	void enterCollectionDataType(MySqlParser.CollectionDataTypeContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the preParse tree
	 */
	void exitCollectionDataType(MySqlParser.CollectionDataTypeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the preParse tree
	 */
	void enterSpatialDataType(MySqlParser.SpatialDataTypeContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the preParse tree
	 */
	void exitSpatialDataType(MySqlParser.SpatialDataTypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#convertedDataType}.
	 * @param ctx the preParse tree
	 */
	void enterConvertedDataType(MySqlParser.ConvertedDataTypeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#convertedDataType}.
	 * @param ctx the preParse tree
	 */
	void exitConvertedDataType(MySqlParser.ConvertedDataTypeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#lengthOneDimension}.
	 * @param ctx the preParse tree
	 */
	void enterLengthOneDimension(MySqlParser.LengthOneDimensionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#lengthOneDimension}.
	 * @param ctx the preParse tree
	 */
	void exitLengthOneDimension(MySqlParser.LengthOneDimensionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#lengthTwoDimension}.
	 * @param ctx the preParse tree
	 */
	void enterLengthTwoDimension(MySqlParser.LengthTwoDimensionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#lengthTwoDimension}.
	 * @param ctx the preParse tree
	 */
	void exitLengthTwoDimension(MySqlParser.LengthTwoDimensionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#lengthTwoOptionalDimension}.
	 * @param ctx the preParse tree
	 */
	void enterLengthTwoOptionalDimension(MySqlParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#lengthTwoOptionalDimension}.
	 * @param ctx the preParse tree
	 */
	void exitLengthTwoOptionalDimension(MySqlParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#uidList}.
	 * @param ctx the preParse tree
	 */
	void enterUidList(MySqlParser.UidListContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#uidList}.
	 * @param ctx the preParse tree
	 */
	void exitUidList(MySqlParser.UidListContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#tables}.
	 * @param ctx the preParse tree
	 */
	void enterTables(MySqlParser.TablesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#tables}.
	 * @param ctx the preParse tree
	 */
	void exitTables(MySqlParser.TablesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#indexColumnNames}.
	 * @param ctx the preParse tree
	 */
	void enterIndexColumnNames(MySqlParser.IndexColumnNamesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#indexColumnNames}.
	 * @param ctx the preParse tree
	 */
	void exitIndexColumnNames(MySqlParser.IndexColumnNamesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#expressions}.
	 * @param ctx the preParse tree
	 */
	void enterExpressions(MySqlParser.ExpressionsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#expressions}.
	 * @param ctx the preParse tree
	 */
	void exitExpressions(MySqlParser.ExpressionsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#expressionsWithDefaults}.
	 * @param ctx the preParse tree
	 */
	void enterExpressionsWithDefaults(MySqlParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#expressionsWithDefaults}.
	 * @param ctx the preParse tree
	 */
	void exitExpressionsWithDefaults(MySqlParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#constants}.
	 * @param ctx the preParse tree
	 */
	void enterConstants(MySqlParser.ConstantsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#constants}.
	 * @param ctx the preParse tree
	 */
	void exitConstants(MySqlParser.ConstantsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#simpleStrings}.
	 * @param ctx the preParse tree
	 */
	void enterSimpleStrings(MySqlParser.SimpleStringsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#simpleStrings}.
	 * @param ctx the preParse tree
	 */
	void exitSimpleStrings(MySqlParser.SimpleStringsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#userVariables}.
	 * @param ctx the preParse tree
	 */
	void enterUserVariables(MySqlParser.UserVariablesContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#userVariables}.
	 * @param ctx the preParse tree
	 */
	void exitUserVariables(MySqlParser.UserVariablesContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#defaultValue}.
	 * @param ctx the preParse tree
	 */
	void enterDefaultValue(MySqlParser.DefaultValueContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#defaultValue}.
	 * @param ctx the preParse tree
	 */
	void exitDefaultValue(MySqlParser.DefaultValueContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#currentTimestamp}.
	 * @param ctx the preParse tree
	 */
	void enterCurrentTimestamp(MySqlParser.CurrentTimestampContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#currentTimestamp}.
	 * @param ctx the preParse tree
	 */
	void exitCurrentTimestamp(MySqlParser.CurrentTimestampContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#expressionOrDefault}.
	 * @param ctx the preParse tree
	 */
	void enterExpressionOrDefault(MySqlParser.ExpressionOrDefaultContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#expressionOrDefault}.
	 * @param ctx the preParse tree
	 */
	void exitExpressionOrDefault(MySqlParser.ExpressionOrDefaultContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#ifExists}.
	 * @param ctx the preParse tree
	 */
	void enterIfExists(MySqlParser.IfExistsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#ifExists}.
	 * @param ctx the preParse tree
	 */
	void exitIfExists(MySqlParser.IfExistsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#ifNotExists}.
	 * @param ctx the preParse tree
	 */
	void enterIfNotExists(MySqlParser.IfNotExistsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#ifNotExists}.
	 * @param ctx the preParse tree
	 */
	void exitIfNotExists(MySqlParser.IfNotExistsContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void enterSpecificFunctionCall(MySqlParser.SpecificFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void exitSpecificFunctionCall(MySqlParser.SpecificFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void enterAggregateFunctionCall(MySqlParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void exitAggregateFunctionCall(MySqlParser.AggregateFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void enterScalarFunctionCall(MySqlParser.ScalarFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void exitScalarFunctionCall(MySqlParser.ScalarFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void enterUdfFunctionCall(MySqlParser.UdfFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void exitUdfFunctionCall(MySqlParser.UdfFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void enterPasswordFunctionCall(MySqlParser.PasswordFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the preParse tree
	 */
	void exitPasswordFunctionCall(MySqlParser.PasswordFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void enterSimpleFunctionCall(MySqlParser.SimpleFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void exitSimpleFunctionCall(MySqlParser.SimpleFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void enterDataTypeFunctionCall(MySqlParser.DataTypeFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void exitDataTypeFunctionCall(MySqlParser.DataTypeFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void enterValuesFunctionCall(MySqlParser.ValuesFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void exitValuesFunctionCall(MySqlParser.ValuesFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void enterCaseFunctionCall(MySqlParser.CaseFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void exitCaseFunctionCall(MySqlParser.CaseFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void enterCharFunctionCall(MySqlParser.CharFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void exitCharFunctionCall(MySqlParser.CharFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void enterPositionFunctionCall(MySqlParser.PositionFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void exitPositionFunctionCall(MySqlParser.PositionFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void enterSubstrFunctionCall(MySqlParser.SubstrFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void exitSubstrFunctionCall(MySqlParser.SubstrFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void enterTrimFunctionCall(MySqlParser.TrimFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void exitTrimFunctionCall(MySqlParser.TrimFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void enterWeightFunctionCall(MySqlParser.WeightFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void exitWeightFunctionCall(MySqlParser.WeightFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void enterExtractFunctionCall(MySqlParser.ExtractFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void exitExtractFunctionCall(MySqlParser.ExtractFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void enterGetFormatFunctionCall(MySqlParser.GetFormatFunctionCallContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the preParse tree
	 */
	void exitGetFormatFunctionCall(MySqlParser.GetFormatFunctionCallContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#caseFuncAlternative}.
	 * @param ctx the preParse tree
	 */
	void enterCaseFuncAlternative(MySqlParser.CaseFuncAlternativeContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#caseFuncAlternative}.
	 * @param ctx the preParse tree
	 */
	void exitCaseFuncAlternative(MySqlParser.CaseFuncAlternativeContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the preParse tree
	 */
	void enterLevelWeightList(MySqlParser.LevelWeightListContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the preParse tree
	 */
	void exitLevelWeightList(MySqlParser.LevelWeightListContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the preParse tree
	 */
	void enterLevelWeightRange(MySqlParser.LevelWeightRangeContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the preParse tree
	 */
	void exitLevelWeightRange(MySqlParser.LevelWeightRangeContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#levelInWeightListElement}.
	 * @param ctx the preParse tree
	 */
	void enterLevelInWeightListElement(MySqlParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#levelInWeightListElement}.
	 * @param ctx the preParse tree
	 */
	void exitLevelInWeightListElement(MySqlParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#aggregateWindowedFunction}.
	 * @param ctx the preParse tree
	 */
	void enterAggregateWindowedFunction(MySqlParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#aggregateWindowedFunction}.
	 * @param ctx the preParse tree
	 */
	void exitAggregateWindowedFunction(MySqlParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#scalarFunctionName}.
	 * @param ctx the preParse tree
	 */
	void enterScalarFunctionName(MySqlParser.ScalarFunctionNameContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#scalarFunctionName}.
	 * @param ctx the preParse tree
	 */
	void exitScalarFunctionName(MySqlParser.ScalarFunctionNameContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#passwordFunctionClause}.
	 * @param ctx the preParse tree
	 */
	void enterPasswordFunctionClause(MySqlParser.PasswordFunctionClauseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#passwordFunctionClause}.
	 * @param ctx the preParse tree
	 */
	void exitPasswordFunctionClause(MySqlParser.PasswordFunctionClauseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#functionArgs}.
	 * @param ctx the preParse tree
	 */
	void enterFunctionArgs(MySqlParser.FunctionArgsContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#functionArgs}.
	 * @param ctx the preParse tree
	 */
	void exitFunctionArgs(MySqlParser.FunctionArgsContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#functionArg}.
	 * @param ctx the preParse tree
	 */
	void enterFunctionArg(MySqlParser.FunctionArgContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#functionArg}.
	 * @param ctx the preParse tree
	 */
	void exitFunctionArg(MySqlParser.FunctionArgContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code isExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterIsExpression(MySqlParser.IsExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code isExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitIsExpression(MySqlParser.IsExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterNotExpression(MySqlParser.NotExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitNotExpression(MySqlParser.NotExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterLogicalExpression(MySqlParser.LogicalExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitLogicalExpression(MySqlParser.LogicalExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the preParse tree
	 */
	void enterPredicateExpression(MySqlParser.PredicateExpressionContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the preParse tree
	 */
	void exitPredicateExpression(MySqlParser.PredicateExpressionContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void enterSoundsLikePredicate(MySqlParser.SoundsLikePredicateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void exitSoundsLikePredicate(MySqlParser.SoundsLikePredicateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void enterExpressionAtomPredicate(MySqlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void exitExpressionAtomPredicate(MySqlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void enterInPredicate(MySqlParser.InPredicateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void exitInPredicate(MySqlParser.InPredicateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void enterSubqueryComparasionPredicate(MySqlParser.SubqueryComparasionPredicateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void exitSubqueryComparasionPredicate(MySqlParser.SubqueryComparasionPredicateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void enterBetweenPredicate(MySqlParser.BetweenPredicateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void exitBetweenPredicate(MySqlParser.BetweenPredicateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void enterBinaryComparasionPredicate(MySqlParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void exitBinaryComparasionPredicate(MySqlParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void enterIsNullPredicate(MySqlParser.IsNullPredicateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void exitIsNullPredicate(MySqlParser.IsNullPredicateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void enterLikePredicate(MySqlParser.LikePredicateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void exitLikePredicate(MySqlParser.LikePredicateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void enterRegexpPredicate(MySqlParser.RegexpPredicateContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the preParse tree
	 */
	void exitRegexpPredicate(MySqlParser.RegexpPredicateContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterUnaryExpressionAtom(MySqlParser.UnaryExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitUnaryExpressionAtom(MySqlParser.UnaryExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterCollateExpressionAtom(MySqlParser.CollateExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitCollateExpressionAtom(MySqlParser.CollateExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterSubqueryExpessionAtom(MySqlParser.SubqueryExpessionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitSubqueryExpessionAtom(MySqlParser.SubqueryExpessionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterMysqlVariableExpressionAtom(MySqlParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitMysqlVariableExpressionAtom(MySqlParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterNestedExpressionAtom(MySqlParser.NestedExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitNestedExpressionAtom(MySqlParser.NestedExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterNestedRowExpressionAtom(MySqlParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitNestedRowExpressionAtom(MySqlParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterMathExpressionAtom(MySqlParser.MathExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitMathExpressionAtom(MySqlParser.MathExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterIntervalExpressionAtom(MySqlParser.IntervalExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitIntervalExpressionAtom(MySqlParser.IntervalExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterExistsExpessionAtom(MySqlParser.ExistsExpessionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitExistsExpessionAtom(MySqlParser.ExistsExpessionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterConstantExpressionAtom(MySqlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitConstantExpressionAtom(MySqlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterFunctionCallExpressionAtom(MySqlParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitFunctionCallExpressionAtom(MySqlParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterBinaryExpressionAtom(MySqlParser.BinaryExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitBinaryExpressionAtom(MySqlParser.BinaryExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterFullColumnNameExpressionAtom(MySqlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitFullColumnNameExpressionAtom(MySqlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void enterBitExpressionAtom(MySqlParser.BitExpressionAtomContext ctx);
	/**
	 * Exit a preParse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the preParse tree
	 */
	void exitBitExpressionAtom(MySqlParser.BitExpressionAtomContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#unaryOperator}.
	 * @param ctx the preParse tree
	 */
	void enterUnaryOperator(MySqlParser.UnaryOperatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#unaryOperator}.
	 * @param ctx the preParse tree
	 */
	void exitUnaryOperator(MySqlParser.UnaryOperatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#comparisonOperator}.
	 * @param ctx the preParse tree
	 */
	void enterComparisonOperator(MySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#comparisonOperator}.
	 * @param ctx the preParse tree
	 */
	void exitComparisonOperator(MySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#logicalOperator}.
	 * @param ctx the preParse tree
	 */
	void enterLogicalOperator(MySqlParser.LogicalOperatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#logicalOperator}.
	 * @param ctx the preParse tree
	 */
	void exitLogicalOperator(MySqlParser.LogicalOperatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#bitOperator}.
	 * @param ctx the preParse tree
	 */
	void enterBitOperator(MySqlParser.BitOperatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#bitOperator}.
	 * @param ctx the preParse tree
	 */
	void exitBitOperator(MySqlParser.BitOperatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#mathOperator}.
	 * @param ctx the preParse tree
	 */
	void enterMathOperator(MySqlParser.MathOperatorContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#mathOperator}.
	 * @param ctx the preParse tree
	 */
	void exitMathOperator(MySqlParser.MathOperatorContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#charsetNameBase}.
	 * @param ctx the preParse tree
	 */
	void enterCharsetNameBase(MySqlParser.CharsetNameBaseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#charsetNameBase}.
	 * @param ctx the preParse tree
	 */
	void exitCharsetNameBase(MySqlParser.CharsetNameBaseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#transactionLevelBase}.
	 * @param ctx the preParse tree
	 */
	void enterTransactionLevelBase(MySqlParser.TransactionLevelBaseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#transactionLevelBase}.
	 * @param ctx the preParse tree
	 */
	void exitTransactionLevelBase(MySqlParser.TransactionLevelBaseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#privilegesBase}.
	 * @param ctx the preParse tree
	 */
	void enterPrivilegesBase(MySqlParser.PrivilegesBaseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#privilegesBase}.
	 * @param ctx the preParse tree
	 */
	void exitPrivilegesBase(MySqlParser.PrivilegesBaseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#intervalTypeBase}.
	 * @param ctx the preParse tree
	 */
	void enterIntervalTypeBase(MySqlParser.IntervalTypeBaseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#intervalTypeBase}.
	 * @param ctx the preParse tree
	 */
	void exitIntervalTypeBase(MySqlParser.IntervalTypeBaseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#dataTypeBase}.
	 * @param ctx the preParse tree
	 */
	void enterDataTypeBase(MySqlParser.DataTypeBaseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#dataTypeBase}.
	 * @param ctx the preParse tree
	 */
	void exitDataTypeBase(MySqlParser.DataTypeBaseContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#keywordsCanBeId}.
	 * @param ctx the preParse tree
	 */
	void enterKeywordsCanBeId(MySqlParser.KeywordsCanBeIdContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#keywordsCanBeId}.
	 * @param ctx the preParse tree
	 */
	void exitKeywordsCanBeId(MySqlParser.KeywordsCanBeIdContext ctx);
	/**
	 * Enter a preParse tree produced by {@link MySqlParser#functionNameBase}.
	 * @param ctx the preParse tree
	 */
	void enterFunctionNameBase(MySqlParser.FunctionNameBaseContext ctx);
	/**
	 * Exit a preParse tree produced by {@link MySqlParser#functionNameBase}.
	 * @param ctx the preParse tree
	 */
	void exitFunctionNameBase(MySqlParser.FunctionNameBaseContext ctx);
}