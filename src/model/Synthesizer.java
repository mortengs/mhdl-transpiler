package model;

import parser.MHDLBaseListener;
import parser.MHDLParser;

import java.io.File;
import java.io.PrintWriter;


/**
 * Created by mortengs on 6/2/17.
 */
public class Synthesizer extends MHDLBaseListener {
    PrintWriter writer;
    private String indent = "";
    private int conn = 1;

    @Override
    public void enterDesign(MHDLParser.DesignContext ctx) {
        writer.println("<Architecture>");
        indentInc();
        writer.print(indent + "<ID>");
        writer.print(ctx.IDENTIFIER().getText());
        writer.println("</ID>");

        // Size has yet to be written to the file
    }

    @Override
    public void exitDesign(MHDLParser.DesignContext ctx) {
        writer.println("</Architecture>");
        writer.close();
    }

    @Override
    public void enterEntity(MHDLParser.EntityContext ctx) {
        super.enterEntity(ctx);
    }

    @Override
    public void exitEntity(MHDLParser.EntityContext ctx) {
        super.exitEntity(ctx);
    }

    @Override
    public void enterComponents(MHDLParser.ComponentsContext ctx) {
        //Check to see if the component exists in the library?
        writer.println(indent + "<ListOfArcComponents>");
        indentInc();
        for(int i = 0; i < ctx.IDENTIFIER().size(); i += 2){
            writer.println(indent + "<ArcComponentProperties>");
            indentInc();
            writer.print(indent +"<ID>");
            writer.print(ctx.IDENTIFIER().get(i));
            writer.println("</ID>");
            writer.print(indent + "<ArComponentType>");
            writer.print(ctx.IDENTIFIER().get(i+1));
            writer.println("</ArcComponentType>");
            indentDec();
            writer.println(indent + "</ArcComponentProperties>");
        }
    }

    @Override
    public void exitComponents(MHDLParser.ComponentsContext ctx) {
        indentDec();
        writer.println(indent + "</ListOfArcComponents>");
        super.exitComponents(ctx);
    }

    @Override
    public void enterConnections(MHDLParser.ConnectionsContext ctx) {
        //Define the connection entry points
        writer.println(indent + "<ListOfArcConnectors>");
        indentInc();
    }

    @Override
    public void exitConnections(MHDLParser.ConnectionsContext ctx) {
        indentDec();
        writer.println(indent + "</ListOfArcConnectors>");
    }

    @Override
    public void enterConnection_end(MHDLParser.Connection_endContext ctx) {
        for(int i = 0; i < ctx.IDENTIFIER().size(); i++){
            writer.println(indent + "<ArcConnectorProperties>");
            indentInc();

            writer.print(indent + "<Component1>");
            writer.print(ctx.getParent().getChild(conn));
            writer.println("</Component1>");

            writer.print(indent + "<Component2>");
            writer.print(ctx.IDENTIFIER().get(i));
            writer.println("</Component2>");

            indentDec();
            writer.println(indent + "</ArcConnectorProperties>");
        }
    }

    @Override
    public void exitConnection_end(MHDLParser.Connection_endContext ctx) {
        super.exitConnection_end(ctx);
        conn += 4;
    }

    public void indentInc() {
        indent += "    ";
    }

    public void indentDec() {
        indent = indent.substring(0,indent.length()-4);
    }
}
