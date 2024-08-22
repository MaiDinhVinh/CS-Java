package section6_1.section6_1_1.MiscellaneousOperators;

public class DotOperator {
    /**
     * This is Binary Operation (Involves 2 operands)<p>
     * This operator is used to call a method from a reference
     * variable and access the member of a class or an object.<p>
     * <blockquote><pre>
     *     System.out.println(demo1.x);
     * </pre></blockquote><p>
     * This command shows us that to access the instance field
     * {@code x}, we must access it from the {@code demo1}
     * reference variable that pointing to the {@code DotOperator}
     * object => accessing its instance field
     * */
    int x;
    public static void main(String[] args) {
        DotOperator demo1 = new DotOperator();
        System.out.println(demo1.x);
    }
}
