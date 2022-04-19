import java.io.*;
import org.graalvm.polyglot.*;

class HelloWorld {
    // We create a polyglot context to evaluate source files
    static Context polyglotCtx = Context.newBuilder().allowAllAccess(true).build();

    // Utility method to load and evaluate a source file
    static Value loadSource(String language, String fileName) throws IOException {
        File file = new File(fileName);
        Source source = Source.newBuilder(language, file).build();
        return polyglotCtx.eval(source);
    }

    public static void main(String[] args) throws IOException {
        // Load rust code
        Value fn = loadSource("llvm", "helloworld.bc").getMember("get_number");
        // Call the function
        System.out.println(fn.execute().asDouble());
    }
}
