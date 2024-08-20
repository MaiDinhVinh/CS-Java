package section6_1.section6_1_1.RelationalOperators;

public class RelationalOperator1 {
    /**
     * {@code <} is "less than" operator<p>
     * {@code >} is "greater than" operator<p>
     * {@code <=} is "less than or equal to" operator<p>
     * {@code >=} is "greater than or equal to" operator<p>
     * This is Binary Operation (involves 2 operands)*/
    public static void main(String[] args) {
        int a = 10;
        Integer b = 100; //wrapper class object
        boolean flag = a < b; //flag assigned as "true" since 100 > 10
        flag = 10.0 > 10; //assigned "false" because 10.0 and 10 is considerd as equal
        flag = 10.0f < 10L; //assigned "false" because 10.0 and 10 is considered as equal
        flag = 10.0 > 10L; //assigned "false" because 10.0 and 10 is considered as equal
    }
}
