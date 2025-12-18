public class Frog {
    public void hop(String name, Integer jump) {
        System.out.print(name.toLowerCase() + " " + jump.intValue());
    }

    public static void main(String[] args) {
        new Frog().hop(null, 1);
    }
}
