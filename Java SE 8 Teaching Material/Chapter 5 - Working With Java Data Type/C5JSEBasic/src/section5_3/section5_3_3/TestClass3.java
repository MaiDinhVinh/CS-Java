package section5_3.section5_3_3;

public class TestClass3 {
    /**
     * OBSERVATION: This code compiled unsuccessfully<p>
     * <blockquote><pre>
     * TestClass3.java:11: error: variable a might not have been initialized
     *         System.out.println(a);
     *                            ^
     * 1 error
     * </pre></blockquote>*/
    static int x;
    int y;

    public static void main(String[] args) {
        int a;
        System.out.println(a);
    }
}
