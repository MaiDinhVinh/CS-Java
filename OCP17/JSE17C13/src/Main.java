import java.net.ConnectException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    //for snippet 26

    public static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("Hello");
        } finally {
            lock.unlock();
        }
    }

    //for snippet 37

    private static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        return input;
    }

    //for snippet 49

    public static List<Integer> addValues(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter(s -> s % 2 == 0)
                .forEach(i -> { data.add(i); });
        return data;
    }

    //for snippet 51

    public static List<Integer> addValuesBetter(IntStream source) {
        return source.filter(s -> s % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws InterruptedException {
        //snippet 1

//        new Thread(() -> System.out.print("Hello")).start();
//        System.out.print("World");

        //snippet 2

//        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
//        Runnable printRecords = () -> {
//            for (int i = 0; i < 3; i++)
//                System.out.println("Printing record: " + i);
//        };
//        System.out.println("begin");
//        Thread t1 = new Thread(printInventory);
//        Thread t2 = new Thread(printRecords);
//        Thread t3 = new Thread(printInventory);
//        t1.start();
//        t2.start();
//        t3.start();
//        t1.join();
//        t2.join();
//        t3.join();
//        System.out.println("end");

        //snippet 3

//        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
//        Runnable printRecords = () -> {
//            for (int i = 0; i < 3; i++)
//                System.out.println("Printing record: " + i);
//        };
//        System.out.println("begin");
//        new Thread(printInventory).run();
//        new Thread(printRecords).run();
//        new Thread(printInventory).run();
//        System.out.println("end");

        //snippet 4 - check Zoo class

        //snippet 5 - check Zoo class

        //snippet 6 - check CheckResults class

        //snippet 7 - check CheckResultsWithSleep class

        //snippet 8 - check CheckResultsWithSleepAndInterrupt

        //snippet 9

//        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
//        Runnable printRecords = () -> {
//        for (int i = 0; i < 3; i++)
//            System.out.println("Printing record: " + i);
//        };
//        ExecutorService service = Executors.newSingleThreadExecutor();
//        try {
//            System.out.println("begin");
//            service.execute(printInventory);
//            service.execute(printRecords);
//            service.execute(printInventory);
//            System.out.println("end");
//        } finally {
//            service.shutdown();
//        }

        //snippet 10 - check CheckResults2 class

        //snippet 11

//        var service = Executors.newSingleThreadExecutor();
//        try {
//            Future<Integer> result = service.submit(() -> 30 + 11);
//            System.out.println(result.get()); // 41
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            service.shutdown();
//        }

        //snippet 12

//        ExecutorService service = Executors.newSingleThreadExecutor();
//        try {
//            Future<Integer> result = service.submit(() -> 30 + 11);
//            System.out.println(result.get()); // 41
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }finally {
//            service.shutdown();
//        }
//        try{
//            service.awaitTermination(1, TimeUnit.MINUTES);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 13

//        ScheduledExecutorService service
//                = Executors.newSingleThreadScheduledExecutor();

        //snippet 14

//        ScheduledExecutorService service
//                = Executors.newSingleThreadScheduledExecutor();
//        Runnable task1 = () -> System.out.println("Hello Zoo");
//        Callable<String> task2 = () -> "Monkey";
//        ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
//        ScheduledFuture<?> r2 = service.schedule(task2, 20, TimeUnit.SECONDS);

        //snippet 15 - check SheepManager class

        //snippet 16 - check SheepManager2 class

        //snippet 17 - check SheepManager3 class

        //snippet 18

//        var manager = new SheepManager();
//        synchronized(manager) {
//        }

        //snippet 19 - check SheepManager4 class

        //snippet 20 - check SheepManager5 class

        //snippet 21 - check SheepManager5 class

        //snippet 22 - check SheepManager5 class


        /////////////////////////////////
        /// SECTION 2
        /////////////////////////////////

        //snippet 23 - check Main2 class

        //snippet 24 - check Main3 class

        //snippet 25

//        Lock lock = new ReentrantLock();
//        lock.unlock();

        //snippet 26 - also check the method printHello above

//        Lock lock = new ReentrantLock();
//        new Thread(() -> printHello(lock)).start();
//        if(lock.tryLock()) {
//            try {
//                System.out.println("Lock obtained, entering protected code");
//            } finally {
//                lock.unlock();
//            }
//        } else {
//            System.out.println("Unable to acquire lock, doing something else");
//        }

        //snippet 27

//        Lock lock = new ReentrantLock();
//        new Thread(() -> printHello(lock)).start();
//        if(lock.tryLock(10,TimeUnit.SECONDS)) {
//            try {
//                System.out.println("Lock obtained, entering protected code");
//            } finally {
//                lock.unlock();
//            }
//        } else {
//            System.out.println("Unable to acquire lock, doing something else");
//        }

        //snippet 28

//        Lock lock = new ReentrantLock();
//        if(lock.tryLock()) {
//            try {
//                lock.lock();
//                System.out.println("Lock obtained, entering protected code");
//            } finally {
//                lock.unlock();
//            }
//        }
//        new Thread(() -> System.out.print(lock.tryLock())).start();

        //snippet 29 - check LionPenManager class

        //snippet 30 - check LionPenManager2 class

        //snippet 31

//        var foodData = new HashMap<String, Integer>();
//        foodData.put("penguin", 1);
//        foodData.put("flamingo", 2);
//        for(String key: foodData.keySet())
//            foodData.remove(key);

        //snippet 32

//        var foodData = new ConcurrentHashMap<String, Integer>();
//        foodData.put("penguin", 1);
//        foodData.put("flamingo", 2);
//        for(String key: foodData.keySet())
//            foodData.remove(key);

        //snippet 33

//        Map<String,Integer> map = new ConcurrentHashMap<>();

        //snippet 34

//        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
//        for (var n : favNumbers) {
//            System.out.print(n + " ");
//            favNumbers.add(n+1);
//        }
//        System.out.println();
//        System.out.println("Size: " + favNumbers.size());

        //snippet 35 - check Fox record

        //snippet 36

//        Collection<Integer> collection = List.of(1,2);
//        Stream<Integer> p1 = collection.stream().parallel();
//        Stream<Integer> p2 = collection.parallelStream();

        //snippet 37 - check doWork method above too

//        long start = System.currentTimeMillis();
//        List.of(1,2,3,4,5)
//                .stream()
//                .map(w -> doWork(w))
//                .forEach(s -> System.out.print(s + " "));
//
//        System.out.println();
//        var timeTaken = (System.currentTimeMillis()-start)/1000;
//        System.out.println("Time: "+timeTaken+" seconds");

        //snippet 38

//        long start = System.currentTimeMillis();
//        List.of(1,2,3,4,5)
//                .stream()
//                .parallel()
//                .map(w -> doWork(w))
//                .forEach(s -> System.out.print(s + " "));
//
//        System.out.println();
//        var timeTaken = (System.currentTimeMillis()-start)/1000;
//        System.out.println("Time: "+timeTaken+" seconds");

        //snippet 39

//        long start = System.currentTimeMillis();
//        List.of(1,2,3,4,5)
//                .stream()
//                .parallel()
//                .map(w -> doWork(w))
//                .forEachOrdered(s -> System.out.print(s + " "));
//
//        System.out.println();
//        var timeTaken = (System.currentTimeMillis()-start)/1000;
//        System.out.println("Time: "+timeTaken+" seconds");

        //snippet 40

//        System.out.print(List.of(1,2,3,4,5,6)
//                .parallelStream()
//                .findAny()
//                .get());

        //snippet 41

//        List.of(1,2,3,4,5,6).stream().unordered();

        //snippet 42

//        List.of(1,2,3,4,5,6).stream().unordered().parallel();

        //snippet 43

//        System.out.println(List.of('w', 'o', 'l', 'f')
//                .parallelStream()
//                .reduce("",
//                        (s1,c) -> s1 + c,
//                        (s2,s3) -> s2 + s3));

        //snippet 44

//        System.out.println(List.of(1,2,3,4,5,6)
//                .parallelStream()
//                .reduce(0, (a, b) -> (a - b)));

        //snippet 45

//        System.out.println(List.of("w","o","l","f")
//                .parallelStream()
//                .reduce("X", String::concat));

        //snippet 46

//        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
//        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new,
//                Set::add,
//                Set::addAll);
//        System.out.println(set);

        //snippet 47

//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
//        ConcurrentMap<Integer, String> map = ohMy
//                .collect(Collectors.toConcurrentMap(String::length,
//                        k -> k,
//                        (s1, s2) -> s1 + "," + s2));
//        System.out.println(map);
//        System.out.println(map.getClass());

        //snippet 48

//        var ohMy = Stream.of("lions", "tigers", "bears").parallel();
//        ConcurrentMap<Integer, List<String>> map = ohMy.collect(
//                Collectors.groupingByConcurrent(String::length));
//        System.out.println(map);

        //snippet 49 - check addValues above too

//        var list = addValues(IntStream.range(1, 11));
//        System.out.print(list);

        //snippet 50 - check addValues method above too

//        var list = addValues(IntStream.range(1, 11).parallel());
//        System.out.print(list);

        //snippet 51 - check addValuesBetter method above
    }
}
