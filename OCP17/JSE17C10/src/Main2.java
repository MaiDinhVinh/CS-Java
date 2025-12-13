import java.io.*;
import java.util.*;
import java.util.function.Supplier;

public class Main2 {
    private static List<String> create() throws IOException {
        throw new IOException();
    }

    //for snippet 76

    public void good() throws IOException {
        Main2.create().stream().count();
    }

    //for snippet 77 - explain ?

    public void bad() throws IOException {
//        Supplier<List<String>> s = Main2::create;
    }

    //for snippet 78

    public void ugly() {
        Supplier<List<String>> s = () -> {
            try {
                return Main2.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }

    //for snippet 79

    private static List<String> createSafe() {
        try {
            return Main2.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //for snippet 80

    public void wrapped() {
        Supplier<List<String>> s2 = Main2::createSafe;
    }
}