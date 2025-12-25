import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.Optional;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.minBy;

public class Main{
    //for snippet 1

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }

    //for snippet 65

    private static Stream<Integer> mapping(IntStream stream) {
        return stream.mapToObj(x -> x);
    }
    private static Stream<Integer> boxing(IntStream stream) {
        return stream.boxed();
    }

    //for snippet 69

    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }

    //for snippet 70

    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax()-stats.getMin();
    }

    //for snippet 72

    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) { // outer if
            var num = optional.get();
            var string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }
    }

    //for snippet 73

    private static void threeDigit2(Optional<Integer> optional) {
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3) //what if predicate not ... ?
                .ifPresent(System.out::println);
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
//        System.out.println(opt.orElseThrow(
//                () -> new IllegalStateException()));

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

        ////////////////////////////////////
        /// SECTION 2
        ////////////////////////////////////

        //snippet 24

//        var array = new String[] { "w", "o", "l", "f" };
//        var result = "";
//        for (var s: array) result = result + s;
//        System.out.println(result);

        //snippet 25

//        Stream<String> stream = Stream.of("w", "o", "l", "f");
//        String word = stream.reduce("", (s, c) -> s + c);
//        System.out.println(word);

        //snippet 26

//        Stream<String> stream = Stream.of("w", "o", "l", "f");
//        String word = stream.reduce("", String::concat);
//        System.out.println(word);

        //snippet 27

//        Stream<Integer> stream = Stream.of(3, 5, 6);
//        System.out.println(stream.reduce(1, (a, b) -> a*b));

        //snippet 28

//        BinaryOperator<Integer> op = (a, b) -> a * b;
//        Stream<Integer> empty = Stream.empty();
//        Stream<Integer> oneElement = Stream.of(3);
//        Stream<Integer> threeElements = Stream.of(3, 5, 6);
//
//        empty.reduce(op).ifPresent(System.out::println);
//        oneElement.reduce(op).ifPresent(System.out::println);
//        threeElements.reduce(op).ifPresent(System.out::println);

        //snippet 29

//        Stream<String> stream = Stream.of("w", "o", "l", "f!");
//        int length = stream.reduce(0, (i, s) -> i+s.length(), (a, b) -> a+b);
//        System.out.println(length);

        //snippet 30

//        Stream<String> stream = Stream.of("w", "o", "l", "f!");
//        StringBuilder word = stream.collect(
//                StringBuilder::new,
//                StringBuilder::append,
//                StringBuilder::append);
//        System.out.println(word);

        //snippet 31

//        Stream<String> stream = Stream.of("w", "o", "l", "f");
//        TreeSet<String> set = stream.collect(
//                TreeSet::new,
//                TreeSet::add,
//                TreeSet::addAll);
//        System.out.println(set);

        //snippet 32

//        Stream<String> stream = Stream.of("w", "o", "l", "f");
//        TreeSet<String> set =
//                stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set);

        //snippet 33

//        Stream<String> stream = Stream.of("w", "o", "l", "f");
//        Set<String> set = stream.collect(Collectors.toSet());
//        System.out.println(set); //explain the order ?

        //snippet 34

//        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//        s.filter(x -> x.startsWith("m"))
//                .forEach(System.out::print);

        //snippet 35

//        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
//        s.distinct()
//                .forEach(System.out::print);

        //snippet 36

//        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
//        s.skip(5)
//                .limit(2)
//                .forEach(System.out::print);

        //snippet 37

//        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//        s.map(String::length)
//                .forEach(System.out::print);

        //snippet 38

//        List<String> zero = List.of();
//        var one = List.of("Bonobo");
//        var two = List.of("Mama Gorilla", "Baby Gorilla");
//        Stream<List<String>> animals = Stream.of(zero, one, two);
//        animals.flatMap(m -> m.stream())
//                .forEach(System.out::println);

        //snippet 39

//        var one = Stream.of("Bonobo");
//        var two = Stream.of("Mama Gorilla", "Baby Gorilla");
//        Stream.concat(one, two)
//                .forEach(System.out::println);

        //snippet 40

//        Stream<String> s = Stream.of("brown-", "bear-");
//        s.sorted()
//                .forEach(System.out::print);

        //snipept 41

//        Stream<String> s = Stream.of("brown bear-", "grizzly-");
//        s.sorted(Comparator.reverseOrder())
//                .forEach(System.out::print);

        //snippet 42

//        Stream<String> s = Stream.of("brown bear-", "grizzly-");
//        s.sorted(Comparator::reverseOrder);

        //snippet 43

//        var stream = Stream.of("black bear", "brown bear", "grizzly");
//        long count = stream.filter(s -> s.startsWith("g"))
//                .peek(System.out::println).count();
//        System.out.println(count);

        //snippet 44

//        var numbers = new ArrayList<>();
//        var letters = new ArrayList<>();
//        numbers.add(1);
//        letters.add('a');
//        Stream<List<?>> stream = Stream.of(numbers, letters);
//        stream.map(List::size).forEach(System.out::print);

        //snippet 45
//        var numbers = new ArrayList<>();
//        var letters = new ArrayList<>();
//        numbers.add(1);
//        letters.add('a');
//        Stream<List<?>> bad = Stream.of(numbers, letters);
//        bad.peek(x -> x.remove(0))
//                .map(List::size)
//                .forEach(System.out::print);

        //snippet 46

//        var list = List.of("Toby", "Anna", "Leroy", "Alex");
//        List<String> filtered = new ArrayList<>();
//        for (String name: list)
//            if (name.length() == 4) filtered.add(name);
//        Collections.sort(filtered);
//        var iter = filtered.iterator();
//        if (iter.hasNext()) System.out.println(iter.next());
//        if (iter.hasNext()) System.out.println(iter.next());

        //snippet 47

//        var list = List.of("Toby", "Anna", "Leroy", "Alex");
//        list.stream().filter(n -> n.length() == 4).sorted()
//                .limit(2).forEach(System.out::println);

        //snippet 48

//        var list = List.of("Toby", "Anna", "Leroy", "Alex");
//        list.stream()
//                .filter(n -> n.length() == 4)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);

        //snippet 49

//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);

        //snippet 50

//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);

        //snippet 51

//        Stream.generate(() -> "Olaf Lazisson")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);

        //snippet 52

//        long count = Stream.of("goldfish", "finch")
//                .filter(s -> s.length()> 5)
//                .collect(Collectors.toList())
//                .stream()
//                .count();
//        System.out.println(count);

        //snippet 53

//        List<String> helper = Stream.of("goldfish", "finch")
//                .filter(s -> s.length()> 5)
//                .collect(Collectors.toList());
//        long count = helper.stream()
//                .count();
//        System.out.println(count);

        //snippet 54

//        Stream<Integer> stream = Stream.of(1, 2, 3);
//        System.out.println(stream.reduce(0, (s, n) -> s + n));

        //snippet 55

//        Stream<Integer> stream = Stream.of(1, 2, 3);
//        System.out.println(stream.mapToInt(x -> x).sum());

        //snippet 56

//        IntStream intStream = IntStream.of(1, 2, 3);
//        OptionalDouble avg = intStream.average();
//        System.out.println(avg.getAsDouble());

        //snippet 57

//        DoubleStream empty = DoubleStream.empty();

        //snippet 58

//        DoubleStream oneValue = DoubleStream.of(3.14);
//        oneValue.forEach(System.out::println);
//        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
//        varargs.forEach(System.out::println);

        //snippet 59

//        var random = DoubleStream.generate(Math::random);
//        var fractions = DoubleStream.iterate(.5, d -> d / 2);
//        random.limit(3).forEach(System.out::println);
//        fractions.limit(3).forEach(System.out::println);

        //snippet 60

//        IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
//        count.forEach(System.out::print);

        //snippet 61

//        IntStream range = IntStream.range(1, 6);
//        range.forEach(System.out::print);

        //snippet 62

//        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
//        rangeClosed.forEach(System.out::print);

        //snippet 63

//        Stream<String> objStream = Stream.of("penguin", "fish");
//        IntStream intStream = objStream.mapToInt(s -> s.length());

        //snippet 64

//        var integerList = new ArrayList<Integer>();
//        IntStream ints = integerList.stream()
//                .flatMapToInt(x -> IntStream.of(x));
//        DoubleStream doubles = integerList.stream()
//                .flatMapToDouble(x -> DoubleStream.of(x));
//        LongStream longs = integerList.stream()
//                .flatMapToLong(x -> LongStream.of(x));

        //snippet 65 - check boxing and mapping method above

        //snippet 66

//        var stream = IntStream.rangeClosed(1,10);
//        OptionalDouble optional = stream.average();

        //snippet 67

//        var stream = IntStream.rangeClosed(1,10);
//        OptionalDouble optional = stream.average();
//        optional.ifPresent(System.out::println);
//        System.out.println(optional.getAsDouble());
//        System.out.println(optional.orElseGet(() -> Double.NaN));

        //snippet 68

//        LongStream longs = LongStream.of(5, 10);
//        long sum = longs.sum();
//        System.out.println(sum);
//        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
//        OptionalDouble min = doubles.min();

        //snippet 69 - check max method above

        //snippet 70 - check range method above

        //snippet 71

//        var cats = new ArrayList<String>();
//        cats.add("Annie");
//        cats.add("Ripley");
//        var stream = cats.stream();
//        cats.add("KC");
//        System.out.println(stream.count());

        //snippet 72 - check threeDigit method above

        //snippet 73 - check threeDigit2 method above

        //snippet 74

//        Main.threeDigit(Optional.empty());
//        Main.threeDigit2(Optional.empty());
//        Main.threeDigit(Optional.of(4));
//        Main.threeDigit2(Optional.of(4));
//        Main.threeDigit(Optional.of(123));
//        Main.threeDigit2(Optional.of(123));

        //snippet 75 - check Main2 class

        //snippet 76 - check Main2 class again

        //snippet 77 - check Main2 class again

        //snippet 78 - check Main2 class again

        //snippet 79 - check Main2 class again

        //snippet 80 - check Main2 class again

        //snippet 81

//        var stream = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-",
//                "mouse-");
//        Spliterator<String> originalBagOfFood = stream.spliterator();
//        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
//        emmasBag.forEachRemaining(System.out::print);
//
//        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
//        jillsBag.tryAdvance(System.out::print);
//        jillsBag.forEachRemaining(System.out::print);
//
//        originalBagOfFood.forEachRemaining(System.out::print);

        //snippet 82

//        var originalBag = Stream.iterate(1, n -> ++n)
//                .spliterator();
//        Spliterator<Integer> newBag = originalBag.trySplit();
//        newBag.tryAdvance(System.out::print);
//        newBag.tryAdvance(System.out::print);
//        newBag.tryAdvance(System.out::print);

        ////////////////////////////////////
        /// SECTION 3
        ////////////////////////////////////

        //snippet 83

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        String result = ohMy.collect(Collectors.joining(", "));
//        System.out.println(result);

        //snippet 84

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Double result = ohMy.collect(Collectors.averagingInt(String::length));
//        System.out.println(result);

        //snippet 85

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        TreeSet<String> result = ohMy
//                .filter(s -> s.startsWith("t"))
//                .collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(result);

        //snippet 86

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<String, Integer> map = ohMy.collect(
//                Collectors.toMap(s -> s, String::length));
//        System.out.println(map);

        //snippet 87

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, String> map = ohMy.collect(Collectors.toMap(
//                String::length,
//                k -> k)); //explain ?

        //snippet 88

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, String> map = ohMy.collect(Collectors.toMap(
//                String::length,
//                k -> k,
//                (s1, s2) -> s1 + "," + s2));
//        System.out.println(map);
//        System.out.println(map.getClass());

        //snippet 89

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        TreeMap<Integer, String> map = ohMy.collect(Collectors.toMap(
//                String::length,
//                k -> k,
//                (s1, s2) -> s1 + "," + s2,
//                TreeMap::new));
//        System.out.println(map);
//        System.out.println(map.getClass());

        //snippet 90

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, List<String>> map = ohMy.collect(
//                Collectors.groupingBy(String::length));
//        System.out.println(map);

        //snippet 91

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, Set<String>> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        Collectors.toSet()));
//        System.out.println(map);

        //snippet 92

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        TreeMap<Integer, Set<String>> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        TreeMap::new,
//                        Collectors.toSet()));
//        System.out.println(map);

        //snippet 93

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        TreeMap<Integer, List<String>> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        TreeMap::new,
//                        Collectors.toList()));
//        System.out.println(map);

        //snipept 94

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Boolean, List<String>> map = ohMy.collect(
//                Collectors.partitioningBy(s -> s.length() <= 5));
//        System.out.println(map);

        //snippet 95

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Boolean, List<String>> map = ohMy.collect(
//                Collectors.partitioningBy(s -> s.length() <= 7));
//        System.out.println(map);

        //snippet 96

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Boolean, Set<String>> map = ohMy.collect(
//                Collectors.partitioningBy(
//                        s -> s.length() <= 7,
//                        Collectors.toSet()));
//        System.out.println(map);

        //snippet 97

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, Long> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        Collectors.counting()));
//        System.out.println(map);

        //snippet 98
//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, Optional<Character>> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        Collectors.mapping(
//                                s -> s.charAt(0),
//                                Collectors.minBy((a, b) -> a - b)))); //explain ?
//        System.out.println(map);

        //snippet 99

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        var map = ohMy.collect(groupingBy(String::length,
//                Collectors.mapping(s -> s.charAt(0),
//                        minBy((a, b) -> a - b))));
//        System.out.println(map); //error ?

        //snippet 100 - check Main3
    }
}