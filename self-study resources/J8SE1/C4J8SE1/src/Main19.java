import java.util.*;
import java.util.function.*;
class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        print(animals, a -> a.canHop());
    }
    private static void print(List<Animal> animals, Predicate<Animal>
            checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) System.out.print(animal + " ");
        }
        System.out.println();
    }
}