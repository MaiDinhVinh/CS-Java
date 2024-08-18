package section5_3.section5_3_3;

public class CompileTimeConstant3 {
    /**
     * OBSERVATION: This code has the same error with the
     * last code in the class: <p>
     * {@link section5_3.section5_3_3.CompileTimeConstant1}<p>
     * Since {@code i} is not compile time constant =>
     * the compiler will not understand {@code i}. Moreover,
     * the compiler also detected an execution path where
     * both conditions aren't satisfied*/
    public static void main(String[] args) {
        int val;
        int i = 0;
        if (i == 0){
            val = 10;
        }
        if(i != 0){
            val = 20;
        }
        System.out.println(val);
    }
}
