package c13prep.class10.lab10;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PLMultithread {

    public static int task0(String path){
        int drawCount = 0;
        Path read = Paths.get(path);
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)){
            br.readLine();
            String line = "";
            while((line = br.readLine()) != null){
                List<String> sep = Arrays.asList(line.split(","));
                if(sep.get(6).equals("D")) drawCount++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return drawCount;
    }

    public static int task1(String path){
        int count = 0;
        Path read = Paths.get(path);
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)){
            br.readLine();
            String line = "";
            while((line = br.readLine()) != null){
                List<String> sep = Arrays.asList(line.split(","));
                if(sep.get(6).equals("A") && sep.get(9).equals("H")) count++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int task2(String path){
        int sum = 0;
        Path read = Paths.get(path);
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)){
            br.readLine();
            String line = "";
            while((line = br.readLine()) != null){
                List<String> sep = Arrays.asList(line.split(","));
                sum += Integer.parseInt(sep.get(4)) + Integer.parseInt(sep.get(5));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sum;
    }

    public static ArrayList<Number> task3(String path){
        ArrayList<Integer> numGoals = new ArrayList<>();
        Path read = Paths.get(path);
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)){
            br.readLine();
            String line = "";
            while((line = br.readLine()) != null){
                int sum = 0;
                List<String> sep = Arrays.asList(line.split(","));
                sum += Integer.parseInt(sep.get(4)) + Integer.parseInt(sep.get(5));
                numGoals.add(sum);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        Optional<Integer> opResult = numGoals.stream().max((s1, s2) -> s1 - s2);
        int maxVal = 0;
        if(opResult.isPresent()){
            maxVal = opResult.get();
        }
        final int max = maxVal;
        Long count = numGoals.stream().collect(
                Collectors.filtering(e -> e == max,
                Collectors.counting())
        );

        ArrayList<Number> results = new ArrayList<>();
        results.add(count);
        results.add(max);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return results;
    }

    public static Integer task4(String path){
        int count = 0;
        Path read = Paths.get(path);
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)){
            br.readLine();
            String line = "";
            while((line = br.readLine()) != null){
                List<String> sep = Arrays.asList(line.split(","));
                if(sep.get(2).equals("Arsenal")) count += Integer.parseInt(sep.get(4));
                else if(sep.get(3).equals("Arsenal")) count += Integer.parseInt(sep.get(5));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static Integer task5(String path){
        int count = 0;
        Path read = Paths.get(path);
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)){
            br.readLine();
            String line = "";
            while((line = br.readLine()) != null){
                List<String> sep = Arrays.asList(line.split(","));
                if(sep.get(2).equals("Liverpool")) count += Integer.parseInt(sep.get(4));
                else if(sep.get(3).equals("Liverpool")) count += Integer.parseInt(sep.get(5));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static ArrayList<String> task6(String path) {
        int count = 0;
        Path read = Paths.get(path);
        try (BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)) {
            br.readLine();
            String line = "";
            while ((line = br.readLine()) != null) {
                List<String> sep = Arrays.asList(line.split(","));
                if (sep.get(2).equals("Chelsea")) count += Integer.parseInt(sep.get(4));
                else if (sep.get(3).equals("Chelsea")) count += Integer.parseInt(sep.get(5));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayList<String> arr = new ArrayList<>();
        arr.add(path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf(".")));
        arr.add(Integer.toString(count));
        return arr;
    }

    public static Integer task7(String path){
        int count = 0;
        Path read = Paths.get(path);
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)){
            br.readLine();
            String line = "";
            while((line = br.readLine()) != null){
                List<String> sep = Arrays.asList(line.split(","));
                if(sep.get(1).contains("09") || sep.get(1).contains("10") || sep.get(1).contains("11") ||
                        sep.get(1).contains("12")){
                    if(sep.get(2).equals("Man United")) count += Integer.parseInt(sep.get(4));
                    else if(sep.get(3).equals("Man United")) count += Integer.parseInt(sep.get(5));
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //TASK 1

        String[] paths = {
                "src/c13prep/class10/lab10/PL2012-13.csv",
                "src/c13prep/class10/lab10/PL2013-14.csv",
                "src/c13prep/class10/lab10/PL2014-15.csv",
                "src/c13prep/class10/lab10/PL2015-16.csv",
                "src/c13prep/class10/lab10/PL2016-17.csv",
                "src/c13prep/class10/lab10/PL2017-18.csv"
                        };
        Instant start0 = Instant.now();
        ExecutorService es0 = Executors.newFixedThreadPool(6);
        es0.submit(() -> System.out.println("PL2012-13: " + task0(paths[0]) + " draw matches"));
        es0.submit(() -> System.out.println("PL2013-14: " + task0(paths[1]) + " draw matches"));
        es0.submit(() -> System.out.println("PL2014-15: " + task0(paths[2]) + " draw matches"));
        es0.submit(() -> System.out.println("PL2015-16: " + task0(paths[3]) + " draw matches"));
        es0.submit(() -> System.out.println("PL2016-17: " + task0(paths[4]) + " draw matches"));
        es0.submit(() -> System.out.println("PL2017-18: " + task0(paths[5]) + " draw matches"));
        es0.shutdown();
        es0.awaitTermination(10, TimeUnit.SECONDS);
        Instant end0 = Instant.now();
        System.out.println(Duration.between(start0, end0));

        System.out.println("---------------------------------");

        //TASK 2

        Instant start1 = Instant.now();
        ExecutorService es1 = Executors.newFixedThreadPool(6);
        es1.submit(() -> System.out.println("PL2012-13: " + task1(paths[0]) + " matches HomeTeam won in HTR but lost in FTR"));
        es1.submit(() -> System.out.println("PL2013-14: " + task1(paths[1]) + " matches HomeTeam won in HTR but lost in FTR"));
        es1.submit(() -> System.out.println("PL2014-15: " + task1(paths[2]) + " matches HomeTeam won in HTR but lost in FTR"));
        es1.submit(() -> System.out.println("PL2015-16: " + task1(paths[3]) + " matches HomeTeam won in HTR but lost in FTR"));
        es1.submit(() -> System.out.println("PL2016-17: " + task1(paths[4]) + " matches HomeTeam won in HTR but lost in FTR"));
        es1.submit(() -> System.out.println("PL2017-18: " + task1(paths[5]) + " matches HomeTeam won in HTR but lost in FTR"));
        es1.shutdown();
        es1.awaitTermination(10, TimeUnit.SECONDS);
        Instant end1 = Instant.now();
        System.out.println(Duration.between(start1, end1));

        System.out.println("---------------------------------");

        //TASK 3

        Instant start2 = Instant.now();
        ExecutorService es2 = Executors.newFixedThreadPool(6);
        es2.submit(() -> System.out.println("PL2012-13: " + task2(paths[0]) + " goals"));
        es2.submit(() -> System.out.println("PL2013-14: " + task2(paths[1]) + " goals"));
        es2.submit(() -> System.out.println("PL2014-15: " + task2(paths[2]) + " goals"));
        es2.submit(() -> System.out.println("PL2015-16: " + task2(paths[3]) + " goals"));
        es2.submit(() -> System.out.println("PL2016-17: " + task2(paths[4]) + " goals"));
        es2.submit(() -> System.out.println("PL2017-18: " + task2(paths[5]) + " goals"));
        es2.shutdown();
        es2.awaitTermination(10, TimeUnit.SECONDS);
        Instant end2 = Instant.now();
        System.out.println(Duration.between(start2, end2));

        System.out.println("---------------------------------");

        //TASK 3

        Instant start3 = Instant.now();
        ExecutorService es3 = Executors.newFixedThreadPool(6);
        es3.submit(() -> System.out.format("PL2012-13: %s matches had the most goals of %s goals%n", task3(paths[0]).get(0), task3(paths[0]).get(1)));
        es3.submit(() -> System.out.format("PL2013-14: %s matches had the most goals of %s goals%n", task3(paths[1]).get(0), task3(paths[1]).get(1)));
        es3.submit(() -> System.out.format("PL2014-15: %s matches had the most goals of %s goals%n", task3(paths[2]).get(0), task3(paths[2]).get(1)));
        es3.submit(() -> System.out.format("PL2015-16: %s matches had the most goals of %s goals%n", task3(paths[3]).get(0), task3(paths[3]).get(1)));
        es3.submit(() -> System.out.format("PL2016-17: %s matches had the most goals of %s goals%n", task3(paths[4]).get(0), task3(paths[4]).get(1)));
        es3.submit(() -> System.out.format("PL2017-18: %s matches had the most goals of %s goals%n", task3(paths[5]).get(0), task3(paths[5]).get(1)));
        es3.shutdown();
        es3.awaitTermination(10, TimeUnit.SECONDS);
        Instant end3 = Instant.now();
        System.out.println(Duration.between(start3, end3));

        System.out.println("---------------------------------");

        //TASK 4

        Instant start4 = Instant.now();
        ExecutorService es4 = Executors.newFixedThreadPool(6);
        int sum = 0;
        Future fut[] = {es4.submit(() -> task4(paths[0])),
                      es4.submit(() -> task4(paths[1])),
                      es4.submit(() -> task4(paths[2])),
                      es4.submit(() -> task4(paths[3])),
                      es4.submit(() -> task4(paths[4])),
                      es4.submit(() -> task4(paths[5]))};
        es4.shutdown();
        es4.awaitTermination(10, TimeUnit.SECONDS);
        for(Future f: fut) sum += (int) f.get();
        Instant end4 = Instant.now();
        System.out.println(Duration.between(start4, end4));
        System.out.format("Arsenal scored %d goals in 6 seasons%n", sum);

        System.out.println("---------------------------------");

        //TASK 5

        Instant start5 = Instant.now();
        ExecutorService es5 = Executors.newFixedThreadPool(6);
        int sum2 = 0;
        Future fut2[] = {es5.submit(() -> task4(paths[0])),
                es5.submit(() -> task5(paths[1])),
                es5.submit(() -> task5(paths[2])),
                es5.submit(() -> task5(paths[3])),
                es5.submit(() -> task5(paths[4])),
                es5.submit(() -> task5(paths[5]))};
        es5.shutdown();
        es5.awaitTermination(10, TimeUnit.SECONDS);
        for(Future f: fut2) sum2 += (int) f.get();
        Instant end5 = Instant.now();
        System.out.println(Duration.between(start5, end5));
        System.out.format("Liverpool scored %d goals in 6 seasons%n", sum2);

        System.out.println("---------------------------------");

        //TASK 6

        Instant start6 = Instant.now();
        ExecutorService es6 = Executors.newFixedThreadPool(6);
        Future fut3[] = {
                es6.submit(() -> task6(paths[0])),
                es6.submit(() -> task6(paths[1])),
                es6.submit(() -> task6(paths[2])),
                es6.submit(() -> task6(paths[3])),
                es6.submit(() -> task6(paths[4])),
                es6.submit(() -> task6(paths[5]))
        };
        es6.shutdown();
        es6.awaitTermination(10, TimeUnit.SECONDS);
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        for(Future f: fut3){
            arr.add((ArrayList<String>) f.get());
        }
        Optional<ArrayList<String>> op = arr.stream().min((e1, e2) ->
                        Integer.parseInt(e1.get(1)) - Integer.parseInt(e2.get(1)));
        ArrayList<String> min = null;
        if(op.isPresent()){
            min = op.get();
        }
        Instant end6 = Instant.now();
        System.out.println(Duration.between(start6, end6));

        System.out.format("Chelsea scored the least goals of %s in season %s%n", min.get(1), min.get(0));

        System.out.println("---------------------------------");

        //TASK 7

        Instant start7 = Instant.now();
        ExecutorService es7 = Executors.newFixedThreadPool(6);
        Future fut4[] = {
                es7.submit(() -> task7(paths[0])),
                es7.submit(() -> task7(paths[1])),
                es7.submit(() -> task7(paths[2])),
                es7.submit(() -> task7(paths[3])),
                es7.submit(() -> task7(paths[4])),
                es7.submit(() -> task7(paths[5]))
        };
        es7.shutdown();
        es7.awaitTermination(10, TimeUnit.SECONDS);
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(Future f: fut4){
            arr2.add((Integer) f.get());
        }
        IntStream stream = arr2.stream().mapToInt(e -> (int) e);
        int sum4 = stream.sum();
        Instant end7 = Instant.now();
        System.out.println(Duration.between(start7, end7));
        System.out.format("Man United won %d matches as hometeam from September to December in all 6 seasons", sum4);

    }
}
