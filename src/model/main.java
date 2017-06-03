package model;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.MHDLLexer;
import parser.MHDLParser;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by mortengs on 6/1/17.
 */


public class main {

    public static void main(String args[]) {
        File file;
        if(args.length > 0) {
            //Get the file
            System.out.println(args[0]);
            file = new File(args[0]);
            try {
                System.out.println("----Streaming----");
                stream(file);
                System.out.println("----Transpiling----");
                transpile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No file specified");
        }
    }

    private static void transpile(File file) throws IOException {
        ANTLRFileStream f1 = new ANTLRFileStream(file.toString());
        MHDLLexer lex = new MHDLLexer(f1);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        MHDLParser parser = new MHDLParser(tokens);

        MHDLParser.DesignContext designContext = parser.design();
        ParseTreeWalker walker = new ParseTreeWalker();
        Listener liser = new Listener();

        System.out.println(file.getName().substring(0,file.getName().length()-5) + ".xml");
        String dir = "examples/xml/";
        liser.writer = new PrintWriter( dir + file.getName().substring(0,file.getName().length()-5) + ".xml");

        walker.walk(liser,designContext);
    }

    private static void stream(File file) throws IOException {
        StringBuilder out = new StringBuilder();
        String sep = System.lineSeparator();
        out.append(new ANTLRFileStream(file.toString())).append(sep);
        System.out.println(out.toString());
    }
}
