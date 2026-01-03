/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c13prep.class10.class10_multithreading_intro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class AdderWithReturn implements Callable<Integer> {

    private String inFile;
    private String outFile;

    public AdderWithReturn(String inFile, String outFile) {
        this.inFile = inFile;
        this.outFile = outFile;
    }

    public int doAdd() throws IOException, InterruptedException {
        int total = 0;
        String line = null;

        try (BufferedReader reader
                = Files.newBufferedReader(Paths.get(inFile))) {
            while ((line = reader.readLine()) != null) {
                total += Integer.parseInt(line);
            }
        }

        /**
         * I am doing a hard work
         */
        Thread.sleep(1000);

        return total;
    }

    //https://docs.oracle.com/javase/8/docs/api/index.html?java/util/concurrent/Callable.html
    @Override
    public Integer call() throws IOException, InterruptedException {
        /**
         * let all exceptions handled by main
         */
        return this.doAdd();
    }

    public static void main(String[] args) {
        String folder = "src/class10_multithreading_intro/";
        String inExt = ".in.txt";
        String outExt = ".out.txt";
        String[] inFiles = new String[6];
        String[] outFiles = new String[6];

        for (int i = 0; i < 6; i++) {
            inFiles[i] = folder + "file" + i + inExt;
            outFiles[i] = folder + "file" + i + outExt;

        }

        //change the pool size to see the effect on time
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer>[] results = new Future[6];
        Instant start = Instant.now();
        for (int i = 0; i < 6; i++) {
            AdderWithReturn adder
                    = new AdderWithReturn(inFiles[i], outFiles[i]);
            
            /**
             * submit a task to executor
             * it starts doing its work 
             * if there is an available thread in the pool
             * result will be returned to a future
             */
            results[i] = es.submit(adder);
        }

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            try {
                /**
                 * the future requests result
                 * it waits if necessary for the correspondent tasks to complete, 
                 * and then retrieves its result.
                 */
                int value = results[i].get(); 
                System.out.println("Total in file " + i + ": " + value);
                
                sum += value;
            } catch (ExecutionException e) {
                /**
                 * Exception raised in Adder
                 */
                Throwable addEx = e.getCause();
                System.err.println(addEx.getMessage());
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }

        try {
            /**
             * signal all tasks finish and shutdown gracefully, 
             * no new task accepted
             * this has to be called, otherwise main will never end
             * even if all tasks has been completed
             */
            es.shutdown(); 
            
            
            
            /**
             * it should be called after es.shutdown(),
             * es will let all tasks to finish first
             * by the time provided, if there is any task still running
             * es kills the task
             * 
             */
            es.awaitTermination(15, TimeUnit.SECONDS); 
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }

        System.out.println("Average: " + (sum/6.0));
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis()
                + " milliseconds");

    }

}
