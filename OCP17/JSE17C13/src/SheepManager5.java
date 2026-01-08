import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager5 {
    private int sheepCount = 0;
    private final Object herb = new Object();
    private void incrementAndReport() {
        synchronized (herb){
            System.out.print(++sheepCount+" ");
        }
    }

    //for snippet 21

//    private synchronized void incrementAndReport() {
//        System.out.print(sheepCount.incrementAndGet()+" ");
//    }

    //for snippet 22

    static void dance1() {
        synchronized(SheepManager.class) {
            System.out.print("Time to dance!");
        }
    }
    static synchronized void dance2() {
        System.out.print("Time to dance!");
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManager5 manager = new SheepManager5();
            for(int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            service.shutdown();
        }
    }
}
