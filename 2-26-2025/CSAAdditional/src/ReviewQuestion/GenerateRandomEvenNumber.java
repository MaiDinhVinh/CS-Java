package ReviewQuestion;

import java.util.Random;

public class GenerateRandomEvenNumber {
    public static int[] onlyEven1(int totalNum, int limit){
        int[] arr = new int[totalNum];
        Random ran = new Random();
        for(int i = 0; i < totalNum; i++){
            int a = ran.nextInt(limit); //should be limit + 1 because it wan't inclusive but exclusive
            while(a % 2 != 0) a = ran.nextInt(limit);
            arr[i] = a;
        }
        return arr;
    }

    public static int[] onlyEven2(int totalNum, int limit){
        int[] arr = new int[totalNum];
        for(int i = 0; i < totalNum; i++){
            int a;
            do
                a = (int)(Math.random()*(limit+1));
            while (a % 2 != 0);
            arr[i] = a;
        }
        return arr;
    }

    public static void main(String[] args) {
        for(int i: onlyEven1(10, 100)){
            System.out.println(i);
        }

        for(int i: onlyEven2(10, 100)){
            System.out.println(i);
        }
    }
}
