package section6_1.section6_1_2;

public class ExpressionVsStatement {
    /**
     * In this code, we can see that both
     * <blockquote><pre>
     *     int a = 10;
     *     int b = 20;
     * </pre></blockquote><p>
     * are statements since it don't has any value
     * on its own => we can't do something like:
     * <blockquote><pre>
     *     int c = int a = 10
     * </pre></blockquote><p>
     * Moreover,
     * <blockquote><pre>
     *     a + b;
     * </pre></blockquote><p>
     * is a valid expression but this is not a valid statement
     * and this won't allow us to compile.<p>
     * <blockquote><pre>
     *     a = a + b;
     * </pre></blockquote><p>
     * This code here will run because it is both a valid
     * statement and a valid expression. We said "this expression
     * has value on its own" is because that the value created from
     * the expression on the RHS and then assigned to the variable
     * on the LHS using {@code =} operator is equivalent to the assignment of a value in RHS to
     * variable on LHS using {@code =} operator => the value produced
     * by the expression is the value produced from the RHS of the
     * {@code =} => we can also do something like this:
     * <blockquote><pre>
     *     int k = (a = a + b);
     * </pre></blockquote><p>
     * */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //a + b;
        a = a + b;
    }
}
