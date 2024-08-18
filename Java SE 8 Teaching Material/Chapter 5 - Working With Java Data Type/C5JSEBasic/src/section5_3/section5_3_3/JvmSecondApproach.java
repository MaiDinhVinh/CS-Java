package section5_3.section5_3_3;

public class JvmSecondApproach {
    /**
     * OBSERVATION: Although variable {@code p} isn't
     * initialized yet in the first statement, but
     * it was initialized in the second statement with
     * {@code p = 10}. Therefore, the print statement
     * work just fine since the variable {@code p} has
     * a initialized value*/
    public static void main(String[] args) {
        int p;
        p = 10;
        System.out.println(p);
    }
}
