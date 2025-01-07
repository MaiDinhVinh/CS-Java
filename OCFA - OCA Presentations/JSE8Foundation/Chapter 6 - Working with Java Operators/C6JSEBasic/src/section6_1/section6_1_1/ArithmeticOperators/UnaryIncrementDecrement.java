package section6_1.section6_1_1.ArithmeticOperators;

public class UnaryIncrementDecrement {
    /**
     * Unlike Unary Minus operation, this time, we will apply to
     * the variable directly and change the value of the variable
     * directly<p>
     * Unlike Unary Minus, we can apply the operator
     * before (pre) and after (post) the variable.<p>
     * The position of the operator is IMPORTANT
     * <blockquote><pre>
     *     int a = 10;
     *     int b = a++;
     *     System.out.println(a);
     *     System.out.println(b);
     * </pre></blockquote><p>
     * In this code, the variable {@code a} has a value of 10
     * while variable {@code b} has a value from variable
     * {@code a} and then the value from variable {@code a} has
     * been increased to {@code 11}<p>
     * <blockquote><pre>
     *     int a = 10;
     *     int b = ++a;
     *     System.out.println(a);
     *     System.out.println(b);
     * </pre></blockquote><p>
     * In this code, we can see that the order of the Unary Increment
     * has been changed to before the {@code a} variable. Therefore,
     * this will prioritize increment {@code a} first to {@code 11}
     * and then reassign it to {@code b}<p>
     * {@code --} is also working in the same way as {@code ++}*/
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println("a before: " + a);
        System.out.println("b: " + b);
        int c = ++a;//THIS HAS MAJOR DIFFERENCE, CHECK JAVADOC !
        System.out.println("a after: " + a);
        System.out.println("c: " + c);
    }
}
