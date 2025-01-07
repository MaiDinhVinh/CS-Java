package part1;

class Primate {
    public Primate() {
        System.out.println("Primate");
    }
}
class Ape extends Primate {
    public Ape() {
        System.out.println("Ape");
    }
}
public class Chimpanzee extends Ape {
    public static void main(String[] args) {
        new Chimpanzee();
    }
}