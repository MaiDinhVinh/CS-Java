import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main3{
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        final a2 obj = new a2();
        es.submit(() -> obj.increment(1));
        es.submit(() -> obj.increment(1));
        es.submit(() -> obj.increment(1));
        es.submit(() -> obj.increment(1));
        es.submit(() -> obj.increment(1));
        es.shutdown();

        es.awaitTermination(10, TimeUnit.SECONDS); //QUESTION: WHAT HAPPEN IF I REMOVE THIS LINE ?

        System.out.println(obj);
    }
}

class a2{
    private int a;

    public synchronized void increment(int i) {
        this.a += i;
    }
    @Override
    public String toString(){
        return Integer.toString(this.a);
    }
}
