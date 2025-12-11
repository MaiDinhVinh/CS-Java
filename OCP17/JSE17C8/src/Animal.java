import java.util.ArrayList;
import java.util.List;
public record Animal(String species, boolean canHop, boolean canSwim) { }

interface CheckTrait {
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}

class TraditionalSearch {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

//        print(animals, new CheckIfHopper());

        //for snippet 2

        print(animals, a -> a.canHop());

        //for snippet 3
        print(animals, a -> a.canSwim());

        //for snippet 4
        print(animals, a -> !a.canSwim());

    }
    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                 System.out.print(animal + " ");
            }
        System.out.println();
    }
}