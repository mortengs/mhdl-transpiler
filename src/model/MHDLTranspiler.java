package model;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.MHDLLexer;
import parser.MHDLParser;


import java.io.*;


/**
 * Created by mortengs on 6/1/17.
 */


public class MHDLTranspiler {

    public static void main(String args[]) {
        File file;
        if(args.length > 0) {
            //Get the file
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
        CharStream f1 = CharStreams.fromFileName(file.getAbsolutePath());
        MHDLLexer lex = new MHDLLexer(f1);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        MHDLParser parser = new MHDLParser(tokens);

        MHDLParser.DesignContext designContext = parser.design();
        ParseTreeWalker walker = new ParseTreeWalker();
        Synthesizer liser = new Synthesizer();

        System.out.println(file.getName().substring(0,file.getName().length()-5) + ".xml");

        liser.writer = new PrintWriter( file.getName().substring(0,file.getName().length()-5) + ".xml");

        walker.walk(liser,designContext);
    }

    private static void stream(File file) throws IOException {
        StringBuilder out = new StringBuilder();
        String sep = System.lineSeparator();
        try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                out.append(line).append(sep);
            }
        }
        System.out.println(out.toString());
    }
}
