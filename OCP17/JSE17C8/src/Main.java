import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;

public class Main{

    //for snippe 39

    public void counts(List<Integer> list) {
        list.sort((final var x, @Deprecated var y) -> x.compareTo(y));
    }

    //for snippet 40

//    public void variables(int a) {
//        int b = 1;
//        Predicate<Integer> p1 = a -> {
//            int b = 0;
//            int c = 0;
//            return b == c;
//        }
//    }

    public static void main(String[] args) {
        //snippet 1 - Check Animal record

        //snippet 2 - Check Animal record again

        //snippet 3 - Check Animal record again

        //snippet 4 - Check Animal record again

        //snippet 5 - check Sprint interface

        //snippet 6 - check Dance interface

        //snippet 7 - check Dash interface

        //snippet 8 - check Soar interface

        //snippet 9 - check LearnToSpeak interface

        //snippet 10 - check LearnToSpeak interface again

        //snippet 11 - check Converter interface

        //snippet 12 - check StringStart interface

        //snippet 13 - check StringChecker interface

        //snippet 14 - check StringChecker interface again

        //snippet 15 - check StringParameterChecker interface

        //snippet 16 - check StringTwoParameterChecker interface

        //snippet 17 - check EmptyStringCreator interface

        //snippet 18 - check StringCopier interface

        ////////////////////////////////////////////////
        ///SECTION 2
        ////////////////////////////////////////////////

        //snippet 19

//        Supplier<LocalDate> s1 = LocalDate::now;
//        Supplier<LocalDate> s2 = () -> LocalDate.now();
//        LocalDate d1 = s1.get();
//        LocalDate d2 = s2.get();

        //snippet 20

//        Supplier<StringBuilder> s1 = StringBuilder::new;
//        Supplier<StringBuilder> s2 = () -> new StringBuilder();
//        System.out.println(s1.get());
//        System.out.println(s2.get());

        //snippet 21

//        Supplier<ArrayList<String>> s3 = ArrayList::new;
//        ArrayList<String> a1 = s3.get();
//        System.out.println(a1);

        //snippet 22

//        System.out.println(s3);

        //snippet 23

//        Consumer<String> c1 = System.out::println;
//        Consumer<String> c2 = x -> System.out.println(x);
//        c1.accept("Annie");
//        c2.accept("Annie");

        //snippet 24

//        var map = new HashMap<String, Integer>();
//        BiConsumer<String, Integer> b1 = map::put;
//        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
//        b1.accept("chicken", 7);
//        b2.accept("chick", 1);
//        System.out.println(map);

        //snippet 25

//        var map = new HashMap<String, String>(); //type param ???
//        BiConsumer<String, String> b1 = map::put;
//        BiConsumer<String, String> b2 = (k, v) -> map.put(k, v);
//        b1.accept("chicken", "Cluck");
//        b2.accept("chick", "Tweep");
//        System.out.println(map);

        //snippet 26

//        Predicate<String> p1 = String::isEmpty;
//        Predicate<String> p2 = x -> x.isEmpty();
//        System.out.println(p1.test(""));
//        System.out.println(p2.test(""));

        //snippet 27

//        BiPredicate<String, String> b1 = String::startsWith;
//        BiPredicate<String, String> b2 =
//                (string, prefix) -> string.startsWith(prefix);
//        System.out.println(b1.test("chicken", "chick"));
//        System.out.println(b2.test("chicken", "chick"));

        //snippet 28

//        Function<String, Integer> f1 = String::length;
//        Function<String, Integer> f2 = x -> x.length();
//        System.out.println(f1.apply("cluck"));
//        System.out.println(f2.apply("cluck"));

        //snippet 29

//        BiFunction<String, String, String> b1 = String::concat;
//        BiFunction<String, String, String> b2 =
//                (string, toAdd) -> string.concat(toAdd);
//        System.out.println(b1.apply("baby ", "chick"));
//        System.out.println(b2.apply("baby ", "chick"));

        //snippet 30

//        UnaryOperator<String> u1 = String::toUpperCase;
//        UnaryOperator<String> u2 = x -> x.toUpperCase();
//        System.out.println(u1.apply("chirp"));
//        System.out.println(u2.apply("chirp"));

        //snippet 31

//        BinaryOperator<String> b1 = String::concat;
//        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
//        System.out.println(b1.apply("baby ", "chick"));
//        System.out.println(b2.apply("baby ", "chick"));

        //snippet 32

//        Predicate<String> egg = s -> s.contains("egg");
//        Predicate<String> brown = s -> s.contains("brown");

        //snippet 33

//        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
//        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

        //snippet 34

//        Predicate<String> brownEggs = egg.and(brown);
//        Predicate<String> otherEggs = egg.and(brown.negate());

        //snippet 35

//        Consumer<String> c1 = x -> System.out.print("1: " + x);
//        Consumer<String> c2 = x -> System.out.print(",2: " + x);
//        Consumer<String> combined = c1.andThen(c2);
//        combined.accept("Annie");

        //snippet 36

//        Function<Integer, Integer> before = x -> x + 1;
//        Function<Integer, Integer> after = x -> x * 2;
//        Function<Integer, Integer> combined = after.compose(before);
//        System.out.println(combined.apply(3));

        //snippet 37

//        BooleanSupplier b1 = () -> true;
//        BooleanSupplier b2 = () -> Math.random()> .5;
//        System.out.println(b1.getAsBoolean());
//        System.out.println(b2.getAsBoolean());

        //snippet 38

//        Predicate<String> p = x -> true;
//        Predicate<String> p2 = (var x) -> true;
//        Predicate<String> p3 = (String x) -> true;

        //snippet 39 - check counts method above

        //snippet 40 - check variables method above

        //snippet 41 - check Test class in package section2

        //snippet 42 - check Crow class in package section2

        //snippet 43 - check Crow class again
    }
}