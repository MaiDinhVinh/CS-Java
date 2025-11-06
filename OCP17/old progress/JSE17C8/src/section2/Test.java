package section2;

import java.util.function.Predicate;

public class Test {
    private Predicate<String> pred = this::hello;
    public boolean hello(String a){
        return a.startsWith("h");
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.pred.test("hello"));
    }
}
