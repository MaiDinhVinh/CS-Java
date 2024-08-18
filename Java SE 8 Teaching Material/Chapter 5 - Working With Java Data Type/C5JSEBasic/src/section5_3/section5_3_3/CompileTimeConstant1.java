package section5_3.section5_3_3;

public class CompileTimeConstant1 {
    /**
     * OBSERVATION: This code failed to compile with the error
     * <blockquote><pre>
     * CompileTimeConstant1.java:10: error: variable val might not have been initialized
     *         System.out.println(val);
     *                            ^
     * 1 error
     * </pre></blockquote><p>
     * - Although we know that the variable {@code i} is initialized with value
     * 0 and the condition is ALWAYS satisfied. However, {@code i} cannot be
     * understandable by the compiler since {@code i} is not a compile time
     * constant. Therefore, the compiler has analyzed a paths where the
     * condition is not satisfied and evaluated to {@code false} =>
     * the variable {@code val} will remained uninitialized => compiler refused
     * to compile<p>
     * To make this code compilable, we will have to add a special keywords
     * behind the {@code i} declaration, which is the {@code final} keywords.
     * This keyword will make the compiler understand that {@code i} is a
     * compile time constant and therefore, the condition is always evaluated
     * to {@code true}
     * */
    public static void main(String[] args) {
        int val;
        //int i = 0;
        final int i = 0;
        if(i == 0){
            val = 10;
        }
        System.out.println(val);
    }
}
