/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c13prep.class11.class11_multithreading_synchronized_method;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Administrator
 */
public class WorkerSM implements Runnable {

    private BankAccountSM account;
    private int id;

    public WorkerSM(int id, BankAccountSM account) {
        this.id = id;
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("ID: " + this.id + ", startBalance: " + this.account.getBalance());
            
            try {
                /**
                 * I am doing an intensive work
                 */
                Thread.sleep(10); 
            } catch (InterruptedException ex) {
                System.err.println("I'm awake");
            }
            
            this.account.deposit(10);
            
            System.out.println(", endBalance: " + this.account.getBalance());
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        BankAccountSM acct = new BankAccountSM(100);

        for (int i = 0; i < 5; i++) {
            WorkerSM worker = new WorkerSM(i, acct);
            es.submit(worker);
        }

        try {
            es.shutdown();
            if (!es.awaitTermination(10_000, TimeUnit.MILLISECONDS)) {
                //if the timeout elapsed before termination
                
                /**
                 * Cancel currently executing tasks Return a list of waiting
                 * tasks that are still in queue to process the list can be use
                 * to resubmit to another es
                 */
                List<Runnable> waitingTasks = es.shutdownNow();

                // wait for all tasks in es to be terminated completely
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("#Balance: " + acct.getBalance());
        }
    }

}
