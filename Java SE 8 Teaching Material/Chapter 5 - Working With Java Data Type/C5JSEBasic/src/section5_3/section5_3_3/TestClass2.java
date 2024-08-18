package section5_3.section5_3_3;

public class TestClass2 {
    /**
     * OBSERVATION: This code printed out {@code 0 0}*/
    static int a;
    int y;

    public static void main(String[] args) {
        int p;
        System.out.println(a + " " + new TestClass2().y); //new TestClass2 instance and then access their instance field
    }
}
