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

/**
 *
 * @author Administrator
 */
public class AdderRunnable implements Runnable{
    private String inFile;
    private String outFile;

    public AdderRunnable(String inFile, String outFile) {
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
        
        Thread[] threads = new Thread[6];
        Instant start = Instant.now();
        try {
            for (int i = 0; i < 6; i++) {
                AdderRunnable adder = 
                        new AdderRunnable (inFiles[i], outFiles[i]);
                
                threads[i] = new Thread(adder);
                threads[i].start(); //each adder starts doing its work
            }
            
            /**
             * Main waits for all threads to complete before going forward
             */
            for (Thread t : threads) {
                t.join(); //demo without join() to see the mis-management effect
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis() 
                + " milliseconds");
    }

    
}
