package section6_1.section6_1_1.MiscellaneousOperators;

import java.util.List;
import java.util.ArrayList;

public class LambdaOperator {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("hello");
        test.add("world");
        test.add("test1");
        test.add("test2");
        test.forEach(m -> System.out.println(m)); //replacing for loop
    }
}
