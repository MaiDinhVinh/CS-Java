package section6_1.section6_1_1;

import section6_1.section6_1_1.ArithmeticOperators.AddSubMulDivi;
import section6_1.section6_1_1.ArithmeticOperators.ModulusOperators;
import section6_1.section6_1_1.ArithmeticOperators.UnaryMinus;
import section6_1.section6_1_1.ArithmeticOperators.UnaryIncrementDecrement;
import section6_1.section6_1_1.RelationalOperators.RelationalOperator1;
import section6_1.section6_1_1.RelationalOperators.RelationalOperator2;
import section6_1.section6_1_1.LogicalConditionalOperators.AndOrOperators;
import section6_1.section6_1_1.LogicalConditionalOperators.Negation;
import section6_1.section6_1_1.LogicalConditionalOperators.Ternary;

public class OverviewOfOperators {
    /**
     * 1) Arithmetic Operator: Arithmetic operators are used to perfrom
     * basic operation on all primitve variable (EXCEPT {@code boolean}).
     * They can also be applied for wrapper objects for numeric types listed below: <p>
     * {@link java.lang.Byte}<p>
     * {@link java.lang.Short}<p>
     * {@link java.lang.Character}<p>
     * {@link java.lang.Integer}<p>
     * {@link java.lang.Long}<p>
     * {@link java.lang.Float}<p>
     * {@link java.lang.Double}<p>
     * These wrapper classes are applicable due to the auto-boxing featur in Java 1.5<p>
     * (Go to {@link AddSubMulDivi} for {@code +}, {@code -}, {@code *}, {@code /} operators)<p>
     * (Go to {@link ModulusOperators} for {@code %} operator)<p>
     * (Go to {@link UnaryMinus} for {@code -} operator (Unary Operation ONLY !))<p>
     * (Go to {@link UnaryIncrementDecrement} for {@code ++} and {@code --} operators)<p>
     * ------------------------------------------------------------------<p>
     * 2) Relational Operator: Used to compare between NUMERICAL values
     * (wrapper objects are also usable)<p>
     * (Go to {@link RelationalOperator1} for {@code <}, {@code >}, {@code <=}, {@code >=} operators)<p>
     * (Go to {@link RelationalOperator2} for {@code ==} and {@code !=} operators)<p>
     * ----------------------------------------------------------<p>
     * 3) Logical - Conditional Operators: These operators form Boolean expression using
     * Boolean variables and Boolean values.<p>
     * (Go to {@link AndOrOperators} for {@code ||} and {@code &&} operators)<p>
     * (Go to {@link Negation} for {@code !} operation)<p>
     * (Go to {@link Ternary} for {@code :?} operation)<p>
     * -----------------------------------------------<p>
     * 4) Assignment Operators - These operators are used for value assignment
     * for variables. There are 2 types of Assignment Operators<p>
     * - The first one is: {@code =}, which represents for Simple Assignment<p>
     * - The second one is called Compound Assignment, there are 11 of them in
     * total, but we will just focusing on these type of operators:<p>
     * {@code *=}, {@code /=}, {@code %=}, {@code +=}, {@code -=}*/
    public static void main(String[] args) {
        System.out.println("operators illustration in javadoc");
    }
}
