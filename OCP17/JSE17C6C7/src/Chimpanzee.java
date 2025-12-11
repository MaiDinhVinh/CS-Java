class Primate {
    public Primate() {
        System.out.print("Primate-"); //1
    } }
class Ape extends Primate {
    public Ape(int fur) {
        System.out.print("Ape1-"); //2
    }
    public Ape() {
        System.out.print("Ape2-");
    } }
public class Chimpanzee extends Ape {
    public Chimpanzee() {
        super(2);
        System.out.print("Chimpanzee-"); //3
    }
    public static void main(String[] args) {
        new Chimpanzee();
    } }