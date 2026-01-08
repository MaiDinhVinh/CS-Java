import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main2{
    public static void main(String[] args) throws InterruptedException {
        Lock l = new ReentrantLock();
        ExecutorService es = Executors.newFixedThreadPool(5);
        final a obj = new a();
        es.submit(() -> obj.increment(l, 1));
        es.submit(() -> obj.increment(l, 1));
        es.submit(() -> obj.increment(l, 1));
        es.submit(() -> obj.increment(l, 1));
        es.submit(() -> obj.increment(l, 1));
        es.shutdown();

        es.awaitTermination(10, TimeUnit.SECONDS); //QUESTION: WHAT HAPPEN IF I REMOVE THIS LINE ?

        System.out.println(obj);
    }
}

class a{
    private int a;

    public void increment(Lock l, int i) {
        try{
            if(l.tryLock(5, TimeUnit.SECONDS)){
                System.out.println("not protected");
                try{
                    this.a += i;
                }finally{
                    l.unlock();
                }
            }else System.out.println("protected");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String toString(){
        return Integer.toString(this.a);
    }
}
