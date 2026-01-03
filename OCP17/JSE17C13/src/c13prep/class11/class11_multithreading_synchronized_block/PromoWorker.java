/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c13prep.class11.class11_multithreading_synchronized_block;

import c13prep.class11.class11_multithreading_synchronized_method.*;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Administrator
 */
public class PromoWorker implements Runnable {

    protected BankAccountSB account;
    protected int id;
    protected int amount;

    public PromoWorker(int id, BankAccountSB account, int amount) {
        this.id = id;
        this.account = account;
        this.amount = amount;
    }

    public void doWork() {
//        System.out.print("ID: " + this.id + ", startBalance: " + this.account.getBalance());

        try {
            /**
             * I am doing an intensive work
             */
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            System.err.println("I'm awake");
        }

        account.deposit(this.amount);

        if (account.getBalance() > 500) {
            int bonus = (int) ((account.getBalance() - 500) * 0.1);
            account.withdrawal(bonus);
        }

//        System.out.println(", endBalance: " + this.account.getBalance());
    }

    @Override
    public void run() {

        this.doWork();

    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        BankAccountSB acct = new BankAccountSB(500);

        for (int i = 0; i < 2; i++) {
            PromoWorker worker = new PromoWorker(i, acct, 50);
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

            }
            // wait for all tasks in es to be terminated completely
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("#Balance: " + acct.getBalance());
        }
    }

}
