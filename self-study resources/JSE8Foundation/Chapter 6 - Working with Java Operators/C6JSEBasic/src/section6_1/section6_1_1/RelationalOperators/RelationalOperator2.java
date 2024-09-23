package section6_1.section6_1_1.RelationalOperators;

public class RelationalOperator2 {
    /**
     * This is Binary Operation (involves 2 operands)<p>
     * We can't compare an non-numeric value to a numeric value
     * (e.g: comparing {@code double} value to {@code boolean} value.
     * This is also applied to reference types where we can't
     * compare between 2 different reference types. <p>
     * However, we still can compare between primitve variable and
     * wrapper class objects<p>
     * Therefore, these codes below is non-compilable
     * <blockquote><pre>
     *     System.out.println(10 == false) //comparision between numerical value and boolean value
     *     Object obj = new Object(); //THIS IS CORRECT
     *     System.out.println(obj != 10); //comparision between reference variable and numerical literal
     *     System.out.println(obj == true); //comparision between reference variable and boolean literal
     *     Integer INT = 10;
     *     Double D = 10.0;
     *     System.out.println(INT == D); //although this is true, but this is wrapper objects and comparing between different reference types is prohibited
     * </pre></blockquote><p>
     * -----------------------------------------------------------------------<p>
     * <blockquote><pre>
     *     Object obj1 = new Object();
     *     Object obj2 = new Object();
     *     System.out.println(obj1 == obj2); //false
     *     Object obj3 = new Object();
     *     Object obj4 = obj3;
     *     System.out.println(obj3 == obj4); //true
     * </pre></blockquote><p>
     * In this code, the first print statement will print out
     * {@code false} because {@code obj1} was created within a chunk
     * of memeory address while {@code obj2} was created within
     * another memory chunk => their addresses are different from
     * each other => return {@code false} when compared. However,
     * {@code obj3} and {@code obj4} returned {@code true} when
     * compared because {@code obj4} copied the memory address from
     * {@code obj3} => both reference variables will point to a
     * same object<p>
     * NOTE: Although {@link java.lang.String} is a class, their comparision
     * mechanism is different due to JVM optimization => This will be further
     * discussed in String Chapter*/

    public static void main(String[] args) {
        int a = 10;
        Integer b = 20;
        char ch = 'a';
        Double d = 10.0;
        Boolean flag = false;
        System.out.println(a == b); //false because 20 is larger than 10
        System.out.println(a == 10.0); //true since 10 is considered as equal to 10.0
        System.out.println(a == ch); //false since 10 is not equal to 'a' in decimal (using ASCII)
        System.out.println(97 == ch); //true since 97 is decimal for 'a' in ASCII
        System.out.println(a != d); //false since 10 is considered as equal to 10.0
        System.out.println(a != 10); //false since 10 is 10
        System.out.println(false != flag); //false because flag is also "false"


        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("wtf1" + (obj1 == obj2));
        Object obj3 = new Object();
        Object obj4 = new Object();
        System.out.println("wtf2" + (obj3 == obj4));


    }
}
