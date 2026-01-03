/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c13prep.class10.class10_multithreading_intro;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Administrator
 */
public class MoreAboutExecutorService {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        if (!es.isShutdown()) {
            List<Future> fList = new ArrayList();
            for (int i = 0; i < 6; i++) {
                final int id = i;
                Runnable r = () -> {
                    try {

                        System.out.println("r" + id + " start doing my work");

                        /**
                         * Doing a tough work
                         */
                        Thread.sleep(4000);

                        System.out.println("r" + id + " finish doing my work");
                    } catch (InterruptedException e) {
                        System.err.println("r" + id + " am not done yet. Somebody terminates me. WHY??");
                        System.err.println("r" + id + e.getMessage());
                    }
//                    return id;
                };

                fList.add(es.submit(r));
            }

            /**
             * https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html
             * The following method shuts down an ExecutorService in two phases,
             * first by calling shutdown to reject incoming tasks, and then
             * calling shutdownNow, if necessary, to cancel any lingering tasks:
             */
            es.shutdown(); // Disable new tasks from being submitted
            try {
                // Wait a while for existing tasks to terminate
                if (!es.awaitTermination(2000, TimeUnit.MILLISECONDS)) {

                    /**
                     * Cancel currently executing tasks 
                     * Return a list of waiting
                     * tasks that are still in queue to process
                     * the list can be use to resubmit to another es
                     */
                    List<Runnable> waitingTasks = es.shutdownNow();
                    
                    // wait for all tasks in es to be terminated completely
                    Thread.sleep(1000);
                    
                    // check status of all tasks
                    fList.forEach(f -> System.out.println(f.isDone()));
                            
                    // resubmit task to another pool to complete
                    ExecutorService es1 = Executors.newFixedThreadPool(2);
                    waitingTasks.forEach(r -> es1.submit(r));
                    
                    es1.shutdown();
                    es1.awaitTermination(7000, TimeUnit.MILLISECONDS);
                }

                   

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
        System.out.println("Pool finished!");
    }
}
