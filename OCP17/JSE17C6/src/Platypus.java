abstract class Mammal2 {
    abstract CharSequence chew();
    public Mammal2() {
        System.out.println(chew()); // Does this line compile?
    }
}
public class Platypus extends Mammal2 {
    String chew() { return "yummy!"; }
    public static void main(String[] args) {
        new Platypus();
    }
}