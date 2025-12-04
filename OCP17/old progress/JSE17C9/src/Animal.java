public class Animal implements Comparable<Animal> {
    private int id;

    public int compareTo(Animal a) {
        return id - a.id; // sorts ascending by id
    }

    public static void main(String[] args) {
        var a1 = new Animal();
        var a2 = new Animal();

        a1.id = 5;
        a2.id = 7;

        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a1));
        System.out.println(a2.compareTo(a1));
    }
}
