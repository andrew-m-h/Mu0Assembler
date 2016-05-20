import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 Created by andrew on 4/20/16.
 */
public class Main {

    public static void main(String[] args) {
        try {

            Mu0Lexer lex = new Mu0Lexer(new org.antlr.v4.runtime.ANTLRFileStream(args[0]));
            CommonTokenStream tokens = new CommonTokenStream(lex);

            Mu0Parser parser = new Mu0Parser(tokens);
            Mu0Parser.ProgramContext programCtx = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            Mu0BaseListener listener = new Mu0BaseListener();
            walker.walk(listener, programCtx);

            if (args[1].contentEquals("-run")){
                Interpret interpreter = new Interpret(listener.ass.memory);
                interpreter.Run();
                for (MemoryCell i : interpreter.memory){
                    System.out.println(i + "\t// " + Interpret.Decompile(i.Cell));
                }
            } else {
                for (MemoryCell i : listener.ass.memory) {
                    System.out.println(i);
                }
            }

        } catch (IOException e){
            System.out.println("Parse Error");
        }
    }
}
