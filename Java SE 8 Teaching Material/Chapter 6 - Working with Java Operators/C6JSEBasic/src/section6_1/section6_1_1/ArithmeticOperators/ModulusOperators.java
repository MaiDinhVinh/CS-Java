package section6_1.section6_1_1.ArithmeticOperators;

public class ModulusOperators {
    /**
     * The {@code %} operator returns the remainder
     * between the division of a number {@code a} and
     * a number {@code b}<p>
     * This is for Binary Operation (involves 2 operands)*/
    public static void main(String[] args) {
        int a = 10, b = 3, c = a % b;
        //THIS IS ALSO APPLICABLE TO WRAPPER OBJECTS
        Character demo = 'a'; //this will have a int value of "97" accroding to ASCII table
        Integer i = 10, i1 = i % demo;
        System.out.println(c);
        System.out.println(i1);
    }
}
