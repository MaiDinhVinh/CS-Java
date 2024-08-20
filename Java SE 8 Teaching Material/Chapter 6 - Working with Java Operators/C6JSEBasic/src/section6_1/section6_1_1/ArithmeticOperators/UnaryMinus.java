package section6_1.section6_1_1.ArithmeticOperators;

public class UnaryMinus {
    /**
     * Return a negated value of a literal value or a variable
     * with changing the value of the variable itself<p>
     * NOTE: {@code +} is also called an Unary Plus operator, but
     * it is not really an operator since it doesn't do anything<p>
     * <blockquote><pre>
     *     int a = -10;
     *     int c = +a;
     * </pre></blockquote><p>
     * In this code, people will think that {@code c} will be assigned
     * with value of 10, however, {@code +} operator
     * won't do anything => {@code c} is assigned to -10*/
    public static void main(String[] args) {
        //USING UNARY MINUS ON A LITERAL
        int a = -10; //assign -10 to a
        //USING UNARY MINUS ON A VARIABLE
        //(This won't change the actual value of original variable)
        int b = -a; //this will assign -(-10) => assign 10
        //USING UNARY PLUS
        int c = +a; //check javadoc note
    }
}
