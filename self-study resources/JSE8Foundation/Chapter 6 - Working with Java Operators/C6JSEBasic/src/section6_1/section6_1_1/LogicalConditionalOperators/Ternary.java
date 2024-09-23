package section6_1.section6_1_1.LogicalConditionalOperators;

public class Ternary {
    /**
     * This is Ternary Operation (involves 3 operands)<p>
     * Since this is the only operator that requires 3 operands
     * in Java => We called it "Ternary Operation"<p>
     * This is the short-from of if-else statement
     * */
    public static void main(String[] args) {
        int a = 5;
        String str = a == 5 ? "five" : "not five";
        System.out.println(str); //print five
    }
}
