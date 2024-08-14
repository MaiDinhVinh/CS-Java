public class TestInitializer {
    private int a;

    {
        System.out.println("im init");
        this.a = 1;
    }

    public TestInitializer(){
        System.out.println("im construct");
    }

    public static void main(String[] args) {
        TestInitializer demo1 = new TestInitializer();
    }
}
