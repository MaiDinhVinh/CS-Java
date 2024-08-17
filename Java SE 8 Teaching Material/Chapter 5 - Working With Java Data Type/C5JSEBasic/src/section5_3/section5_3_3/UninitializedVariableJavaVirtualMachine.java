package section5_3.section5_3_3;

public class UninitializedVariableJavaVirtualMachine {
    static int i; //print 0
    static double x; //print 0.0
    static boolean f; //print false
    static String str; //print null

    /**
     * OBSERVATION: String is initialized as {@code null} since String is basically
     * an array of character,therefore, an uninitialized
     * array will be automatically initialized with default
     * value stated in the presentation*/

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(x);
        System.out.println(f);
        System.out.println(str);
    }
}


