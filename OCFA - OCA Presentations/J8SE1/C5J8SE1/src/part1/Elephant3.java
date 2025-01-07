package part1;

public class Elephant3 extends Mammal3{
    public Elephant3() {
        //super(10);
        /*super();*/
        this(10);
    }

    public Elephant3(int a){
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        Elephant3 ele = new Elephant3();
    }
}
