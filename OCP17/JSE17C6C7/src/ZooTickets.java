public class ZooTickets {
    private String name = "BestZoo";
    { System.out.print(name + "-"); } //3
    private static int COUNT = 0;
    static { System.out.print(COUNT + "-"); } //1
    static { COUNT += 10; System.out.print(COUNT + "-"); } //2

    public ZooTickets() {
        System.out.print("z-"); //4
    }

    public static void main(String... patrons) {
        new ZooTickets();
    } }