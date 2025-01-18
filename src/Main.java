import gen.AngularLexer;
import gen.AngularParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import program.Program;
import visitors.AngularVisitor;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {

        String source = "tests/test2.txt";
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        ParseTree tree = parser.program();

        Program program = (Program) new AngularVisitor().visit(tree);

        System.out.println(program);

    }
}
