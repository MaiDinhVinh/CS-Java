package section5_3.section5_3_3;

public class CompileTimeConstant2 {
    /**
     * OBSERVATION: Although {@code i} is not a compile time
     * constant. However, the compiler has detected an
     * execution path where the {@code val} variable
     * is still initialized without satisfying the condition
     * . Therefore, allowing {@code val} to be initialized
     * without satisfying the condition*/
    public static void main(String[] args) {
        int val;
        int i = 0;
        if(i == 0){
            val = 10;
        }else{
            val = 20;
        }
        System.out.println(val);
    }
}
