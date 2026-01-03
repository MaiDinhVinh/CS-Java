import java.net.ConnectException;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
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
//        new Thread(printInventory).start();
//        new Thread(printRecords).start();
//        new Thread(printInventory).start();
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
//        ScheduledFuture<?> r2 = service.schedule(task2, 8, TimeUnit.MINUTES);

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
    }
}
