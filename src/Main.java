import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * Created by andrew on 4/20/16.
 */
public class Main {

    public static void main(String[] args) {
        try {

            Mu0Lexer lex = new Mu0Lexer(new org.antlr.v4.runtime.ANTLRFileStream(args[1]));
            CommonTokenStream tokens = new CommonTokenStream(lex);

            Mu0Parser parser = new Mu0Parser(tokens);
            Mu0Parser.ProgramContext programCtx = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            Mu0BaseListener listener = new Mu0BaseListener();
            walker.walk(listener, programCtx);

            for (int i = 0; i < listener.ass.memory.length; i++){
                System.out.println(i + " : " + listener.ass.memory[i]);
            }
            Interpret interpreter = new Interpret(listener.ass.memory);
            System.out.println("Output Data");
            for (int i = Assemble.MEMORY_SIZE - 20; i < Assemble.MEMORY_SIZE; i++){
                System.out.println(i + " : " + interpreter.memory[i]);
            }

        } catch (IOException e){
            System.out.println("Parse Error");
        }
    }
}
