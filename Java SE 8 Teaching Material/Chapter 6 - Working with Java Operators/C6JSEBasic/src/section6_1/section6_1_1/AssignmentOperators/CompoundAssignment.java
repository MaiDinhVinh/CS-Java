package section6_1.section6_1_1.AssignmentOperators;

public class CompoundAssignment {
    /**
     * These are called Compound Assignment since it does
     * 2 things at once. First is arithmetic operation and then
     * simple assignment<p>
     * FOR EXAMPLE: <p>
     * <blockquote><pre>
     *     int i = 10;
     *     i += 20;
     * </pre></blockquote><p>
     * In this code, variable {@code i} is initialized with value
     * of {@code 10} and then it is incremented with a value of
     * {@code 20} => increase {@code i} up to 30<p>
     * If you want to write it in full form: <p>
     * <blockquote><pre>
     *     int i = 10;
     *     i = (int) i + 10 //this is called Numeric Promotion - we will discuss this later
     * </pre></blockquote><p>
     * The {@code +=} operator also works with {@code String} datatype (check the code below)<p>
     * If you want to write it in full form:
     * <blockquote><pre>
     *     String s = "hello";
     *     s = s + " world";
     * </pre></blockquote><p>*/
    public static void main(String[] args) {
        int i = 10;
        i += 20;
        System.out.println(i);

        String s = "hello";
        s += " world";
    }
}
