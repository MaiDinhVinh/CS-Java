import java.util.*;
import java.util.function.BiFunction;

public class Main{
    public static void main(String[] args) {
        //snippet 1

//        Collection<String> list = new ArrayList<>();
//        list.add("Magician");
//        list.add("Assistant");
//        System.out.println(list); // [Magician, Assistant]
//        list.removeIf(s -> s.startsWith("A"));
//        System.out.println(list);

        //snippet 2

//        Collection<String> set = new HashSet<>();
//        set.add("Wand");
//        set.add("");
//        set.removeIf(String::isEmpty); // s -> s.isEmpty()
//        System.out.println(set);

        //snippet 3

//        Collection<String> cats = List.of("Annie", "Ripley");
//        cats.forEach(System.out::println);
//        cats.forEach(c -> System.out.println(c));

        //snippet 4

//        var list1 = List.of(1, 2);
//        var list2 = List.of(2, 1);
//        var set1 = Set.of(1, 2);
//        var set2 = Set.of(2, 1);
//
//        System.out.println(list1.equals(list2)); //false
//        System.out.println(set1.equals(set2)); //true
//        System.out.println(list1.equals(set1)); //false

        //snippet 5

//        var heights = new ArrayList<Integer>();
//        heights.add(null);
//        int h = heights.get(0);

        //snippet 6

//        String[] array = new String[] {"a", "b", "c"};
//        List<String> asList = Arrays.asList(array); // [a, b, c]
//        List<String> of = List.of(array); // [a, b, c]
//        List<String> copy = List.copyOf(asList); // [a, b, c]
//
//        array[0] = "z";
//
//        System.out.println(asList); // [z, b, c]
//        System.out.println(of); // [a, b, c]
//        System.out.println(copy); // [a, b, c]
//
//        asList.set(0, "x");
//        System.out.println(Arrays.toString(array)); // [x, b, c]
//
//        copy.add("y");

        //snippet 7

//        var linked1 = new LinkedList<String>();
//        var linked2 = new LinkedList<String>(linked1);

        //snippet 8

//        var list1 = new ArrayList<String>();
//        var list2 = new ArrayList<String>(list1);
//        var list3 = new ArrayList<String>(10);

        //snippet 9

//        var strings = new ArrayList<String>(); //?
//        strings.add("a");
//        for (String s: strings) { }

        //snippet 10

//        var list = new ArrayList<>();

        //snippet 11

//        var list = new ArrayList<>();
//        list.add("a");
//        for (String s: list) { }

        //snippet 12

//        List<String> list = new ArrayList<>();
//        list.add("SD");
//        list.add(0, "NY");
//        list.set(1, "FL"); //NY, FL
//        System.out.println(list.get(0));
//        list.remove("NY");
//        list.remove(0);
//        list.set(0, "?");
//        System.out.println(list);

        //snippet 13

//        var numbers = Arrays.asList(1, 2, 3);
//        numbers.replaceAll(x -> x*2);
//        System.out.println(numbers);

        //snippet 14

//        var list = new LinkedList<Integer>();
//        list.add(3);
//        list.add(2);
//        list.add(1);
//        list.remove(2);
//        list.remove(Integer.valueOf(2));
//        System.out.println(list);

        //snippet 15

//        List<String> list = new ArrayList<>();
//        list.add("hawk");
//        list.add("robin");
//        Object[] objectArray = list.toArray();
//        String[] stringArray = list.toArray(new String[0]); //explain ?
//        list.clear();
//        System.out.println(objectArray.length); // 2
//        System.out.println(stringArray.length);

        //snippet 16

//        Set<Character> letters = Set.of('z', 'o', 'o');
//        Set<Character> copy = Set.copyOf(letters);

        //snippet 17

//        Set<Integer> set = new HashSet<>();
//        boolean b1 = set.add(66);
//        boolean b2 = set.add(10);
//        boolean b3 = set.add(66);
//        boolean b4 = set.add(8);
//        set.forEach(System.out::println);

        //snippet 18

//        Set<Integer> set = new TreeSet<>();
//        boolean b1 = set.add(66);
//        boolean b2 = set.add(10);
//        boolean b3 = set.add(66);
//        boolean b4 = set.add(8);
//        set.forEach(System.out::println); //explain output

        //snippet 19

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(10);
//        queue.add(4);
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());

        //snippet 20

//        Deque<Integer> deque = new LinkedList<>();
//        deque.offerFirst(10);
//        deque.offerLast(4);
//        System.out.println(deque.peekFirst());
//        System.out.println(deque.pollFirst());
//        System.out.println(deque.pollLast());
//        System.out.println(deque.pollFirst());
//        System.out.println(deque.peekFirst());

        //snippet 21

//        Deque<Integer> stack = new ArrayDeque<>();
//        stack.push(10);
//        stack.push(4);
//        stack.peek();
//        stack.poll();
//        stack.poll();
//        stack.peek();

        //snippet 22

//        Map<String, String> map = new HashMap<>();
//        map.put("koala", "bamboo");
//        map.put("lion", "meat");
//        map.put("giraffe", "leaf");
//        String food = map.get("koala");
//        for (String key: map.keySet())
//            System.out.print(key + ",");

        //snippet 23

//        Map<String, String> map = new TreeMap<>();
//        map.put("koala", "bamboo");
//        map.put("lion", "meat");
//        map.put("giraffe", "leaf");
//        String food = map.get("koala");
//        for (String key: map.keySet())
//            System.out.print(key + ",");

        //snippet 24

//        System.out.println(map.contains("lion"));
//        System.out.println(map.containsKey("lion"));
//        System.out.println(map.containsValue("lion"));
//        System.out.println(map.size());
//        map.clear();
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());

        //snippet 25

//        Map<Integer, Character> map = new HashMap<>();
//        map.put(1, 'a');
//        map.put(2, 'b');
//        map.put(3, 'c');
//        map.forEach((k, v) -> System.out.println(v));

        //snippet 26

//        Map<Integer, Character> map = new HashMap<>();
//        map.put(1, 'a');
//        map.put(2, 'b');
//        map.put(3, 'c');
//        map.values().forEach(System.out::println);

        //snippet 27

//        Map<Integer, Character> map = new HashMap<>();
//        map.put(1, 'a');
//        map.put(2, 'b');
//        map.put(3, 'c');
//        map.entrySet().forEach(e ->
//                System.out.println(e.getKey() + " " + e.getValue()));

        //snippet 28

//        Map<Character, String> map = new HashMap<>();
//        map.put('x', "spot");
//        System.out.println("X marks the " + map.get('x'));
//        System.out.println("X marks the " + map.getOrDefault('x', ""));
//        System.out.println("Y marks the " + map.get('y'));
//        System.out.println("Y marks the " + map.getOrDefault('y', ""));

        //snippet 29

//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 2);
//        map.put(2, 4);
//        Integer original = map.replace(2, 10);
//        System.out.println(map);
//        map.replaceAll((k, v) -> k + v);
//        System.out.println(map);

        //snippet 30

//        Map<String, String> favorites = new HashMap<>();
//        favorites.put("Jenny", "Bus Tour");
//        favorites.put("Tom", null);
//        favorites.putIfAbsent("Jenny", "Tram");
//        favorites.putIfAbsent("Sam", "Tram");
//        favorites.putIfAbsent("Tom", "Tram");
//        System.out.println(favorites);

        //snippet 31

//        BiFunction<String, String, String> mapper = (v1, v2)
//                -> v1.length() > v2.length() ? v1: v2;
//        Map<String, String> favorites = new HashMap<>();
//        favorites.put("Jenny", "Bus Tour");
//        favorites.put("Tom", "Tram");
//
//        String jenny = favorites.merge("Jenny", "Skyride", mapper);
//        String tom = favorites.merge("Tom", "Skyride", mapper);
//
//        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
//        System.out.println(jenny); // Bus Tour
//        System.out.println(tom);

        //snippet 32

//        BiFunction<String, String, String> mapper =
//                (v1, v2) -> v1.length()> v2.length() ? v1 : v2;
//        Map<String, String> favorites = new HashMap<>();
//        favorites.put("Sam", null);
//        favorites.merge("Tom", "Skyride", mapper);
//        favorites.merge("Sam", "Skyride", mapper);
//        System.out.println(favorites);

        //snippet 33

//        BiFunction<String, String, String> mapper = (v1, v2) -> null;
//        Map<String, String> favorites = new HashMap<>();
//        favorites.put("Jenny", "Bus Tour");
//        favorites.put("Tom", "Bus Tour");
//        favorites.merge("Jenny", "Skyride", mapper);
//        favorites.merge("Sam", "Skyride", mapper);
//        System.out.println(favorites);

        /////////////////////////////////
        /// SECTION 2
        /////////////////////////////////

        //snippet 34 - check Duck class

        //snippet 35 - check Animal class

        //snippet 36 - check LegacyDuck class

        //snippet 37 - check MissingDuck class

        //snippet 38 - check Product class

        //snippet 39 - check Duck2 class

        //snippet 40

//        Comparator<Duck2> byWeight = (d1, d2) -> d1.getWeight()-d2.getWeight();

        //snippet 41

//        Comparator<Duck2> byWeight = Comparator.comparing(Duck2::getWeight);

        //snippet 42

//        var byWeight = new Comparator<Duck2>() { // DOES NOT COMPILE
//            public int compareTo(Duck2 d1, Duck2 d2) {
//                return d1.getWeight()-d2.getWeight();
//            }
//        };

        //snippet 43 - check Squirrel class

        //snippet 44 - check MultiFieldComparator class

        //snippet 45

//        Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies)
//                .thenComparingInt(Squirrel::getWeight);

        //snippet 46

//        var c = Comparator.comparing(Squirrel::getSpecies).reversed();

        //snippet 47 - check SortRabbits class

        //snippet 48 - check SortRabbits class again

        //snippet 49 - check SortRabbits class again

        //snippet 50

//        List<Integer> list = Arrays.asList(6,9,1,8);
//        Collections.sort(list);
//        System.out.println(Collections.binarySearch(list, 6));
//        System.out.println(Collections.binarySearch(list, 3)); //explain ?

        //snippet 51

//        var names = Arrays.asList("Fluffy", "Hoppy");
//        Comparator<String> c = Comparator.reverseOrder();
//        var index = Collections.binarySearch(names, "Hoppy", c);
//        System.out.println(index);

        //snippet 52 - check UseTreeSet class

        //snippet 53 - check UseTreeSet class again

        //snippet 54

//        List<String> bunnies = new ArrayList<>();
//        bunnies.add("long ear");
//        bunnies.add("floppy");
//        bunnies.add("hoppy");
//        System.out.println(bunnies);
//        bunnies.sort((b1, b2) -> b1.compareTo(b2));
//        System.out.println(bunnies);

    }
}