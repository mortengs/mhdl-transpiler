// Generated from /Users/Jesper/Documents/DTU/Bachelor thesis/mhdl-transpiler/src/parser/MHDL.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MHDLParser}.
 */
public interface MHDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MHDLParser#design}.
	 * @param ctx the parse tree
	 */
	void enterDesign(MHDLParser.DesignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MHDLParser#design}.
	 * @param ctx the parse tree
	 */
	void exitDesign(MHDLParser.DesignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MHDLParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(MHDLParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MHDLParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(MHDLParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MHDLParser#components}.
	 * @param ctx the parse tree
	 */
	void enterComponents(MHDLParser.ComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MHDLParser#components}.
	 * @param ctx the parse tree
	 */
	void exitComponents(MHDLParser.ComponentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MHDLParser#connections}.
	 * @param ctx the parse tree
	 */
	void enterConnections(MHDLParser.ConnectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MHDLParser#connections}.
	 * @param ctx the parse tree
	 */
	void exitConnections(MHDLParser.ConnectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MHDLParser#connection_end}.
	 * @param ctx the parse tree
	 */
	void enterConnection_end(MHDLParser.Connection_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link MHDLParser#connection_end}.
	 * @param ctx the parse tree
	 */
	void exitConnection_end(MHDLParser.Connection_endContext ctx);
}