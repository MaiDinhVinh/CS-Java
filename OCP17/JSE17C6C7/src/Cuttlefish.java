public class Cuttlefish {
    private String name = "swimmy";
    { System.out.println(name); } //3
    private static int COUNT = 0;
    static { System.out.println(COUNT); } //1
    { COUNT++; System.out.println(COUNT); } //4

    public Cuttlefish() {
        System.out.println("Constructor"); //5
    }

    public static void main(String[] args) {
        System.out.println("Ready"); //2
        new Cuttlefish();
    }
}