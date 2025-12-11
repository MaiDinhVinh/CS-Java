import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main{
    //for snippet 1

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        //snippet 1 - check average method above too

//        System.out.println(average(90, 100));
//        System.out.println(average());

        //snippet 2

//        Optional<Double> opt = average(90, 100);
//        if (opt.isPresent())
//            System.out.println(opt.get());

        //snippet 3

//        Optional<Double> opt = average();
//        System.out.println(opt.get());

        //snippet 4

//        Object obj = null;
//        Optional o = (obj == null) ? Optional.empty() : Optional.of(obj);

        //snippet 5

//        Object obj = new Object();
//        Optional o = Optional.ofNullable(obj);

        //snipept 6

//        Optional<Double> opt = average(90, 100);
//        opt.ifPresent(System.out::println);

        //snippet 7

//        Optional<Double> opt = average();
//        System.out.println(opt.orElse(Double.NaN));
//        System.out.println(opt.orElseGet(() -> Math.random()));

        //snippet 8

//        Optional<Double> opt = average();
//        System.out.println(opt.orElseThrow());

        //snippet 9

//        Optional<Double> opt = average();
//        System.out.println(opt.orElseThrow(() -> new IllegalStateException()));

        //snippet 10

//        Optional<Double> opt = average();
//        System.out.println(opt.orElseGet(
//                () -> new IllegalStateException()));

        //snippet 11

//        Optional<Double> opt = average(90, 100);
//        System.out.println(opt.orElse(Double.NaN));
//        System.out.println(opt.orElseGet(() -> Math.random()));
//        System.out.println(opt.orElseThrow());

        //snippet 12

//        Stream<String> empty = Stream.empty();
//        Stream<Integer> singleElement = Stream.of(1);
//        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        //snippet 13

//        var list = List.of("a", "b", "c");
//        Stream<String> fromList = list.stream();

        //snippet 14

//        var list = List.of("a", "b", "c");
//        Stream<String> fromListParallel = list.parallelStream();

        //snippet 15

//        Stream<Double> randoms = Stream.generate(Math::random);
//        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

        //snippet 16

//        Stream<Integer> oddNumberUnder100 = Stream.iterate(
//                1,
//                n -> n < 100,
//                n -> n + 2);

        //snippet 17

//        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//        System.out.println(s.count());

        //snippet 18

//        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
//        Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
//        min.ifPresent(System.out::println);

        //snippet 19

//        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
//        System.out.println(minEmpty.isPresent());

        //snippet 20

//        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//        Stream<String> infinite = Stream.generate(() -> "chimp");
//        s.findAny().ifPresent(System.out::println);
//        infinite.findAny().ifPresent(System.out::println);

        //snippet 21

//        var list = List.of("monkey", "2", "chimp");
//        Stream<String> infinite = Stream.generate(() -> "chimp");
//        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
//        System.out.println(list.stream().anyMatch(pred));
//        System.out.println(list.stream().allMatch(pred));
//        System.out.println(list.stream().noneMatch(pred));
//        System.out.println(infinite.anyMatch(pred));

        //snippet 22

//        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
//        s.forEach(System.out::print);

        //snippet 23

//        Stream<Integer> s = Stream.of(1);
//        for (Integer i : s) {}
    }
}