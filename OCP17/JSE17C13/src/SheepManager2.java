import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager2 {
    private volatile int sheepCount = 0;
    private void incrementAndReport() {
        System.out.print((++sheepCount)+" ");
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManager2 manager = new SheepManager2();
            for(int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            service.shutdown();
        }
    }
}
