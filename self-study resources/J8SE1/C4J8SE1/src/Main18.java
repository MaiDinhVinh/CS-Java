import java.util.ArrayList;
import java.util.List;
public class Main18 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        //old code
        /*print(animals, new CheckIfHopper());*/

        //new code
        print(animals, a -> a.canHop());

        //new code 2
        print(animals, a -> a.canSwim());

        //new code 3
        print(animals, a -> ! a.canSwim());

    }
    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
            }
        System.out.println();
    }
}
