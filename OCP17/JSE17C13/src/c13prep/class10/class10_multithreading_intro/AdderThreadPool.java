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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Administrator
 */
public class AdderThreadPool implements Runnable{
    private String inFile;
    private String outFile;

    public AdderThreadPool(String inFile, String outFile) {
        this.inFile = inFile;
        this.outFile = outFile;
    }
    
    public void doAdd() throws IOException, InterruptedException {
        int total = 0;
        String line = null;
        
        try (BufferedReader reader = 
                Files.newBufferedReader(Paths.get(inFile))) {
            while ((line = reader.readLine()) != null) {                
                total += Integer.parseInt(line);
            }
        }
        
        /**
         * I am doing a hard work
         */
        Thread.sleep(1000);
        
        try (BufferedWriter writer = 
                Files.newBufferedWriter(Paths.get(outFile))) {
            writer.write("Total:" + total);
        }
    }
    
    @Override
    public void run() {
        try {
            this.doAdd();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
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
        Instant start = Instant.now();
        try {
            for (int i = 0; i < 6; i++) {
                AdderThreadPool adder = 
                        new AdderThreadPool (inFiles[i], outFiles[i]);
                
                /**
                 * submit a task to executor
                 * it starts doing its work 
                 * if there is an available thread in the pool
                 */
                es.submit(adder);
            }
            
            
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
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis() 
                + " milliseconds");
        
        
    }

    
}
