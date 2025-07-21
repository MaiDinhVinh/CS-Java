package ReviewQuestion;

import java.util.ArrayList;

public class IncresingStockRate {
    public static boolean isIncreasingRate(ArrayList<Double> arr){
        double rate = 0.0;
        for(int i = 0; i < arr.size() - 1; i++){
            if(rate > arr.get(i + 1) - arr.get(i)) return false;
            rate = arr.get(i + 1) - arr.get(i);
        }
        return true;
    }

    public static void main(String[] args) {
        // First ArrayList with the pattern from the image
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(10.1);
        list1.add(12.2);
        list1.add(15.3);
        list1.add(20.4);
        list1.add(28.5);
        list1.add(40.6);
        list1.add(61.7);
        list1.add(85.8);

        // Second ArrayList with a similar pattern
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(5.0);
        list2.add(8.0);
        list2.add(12.0);
        list2.add(17.0);
        list2.add(23.0);
        list2.add(30.0);
        list2.add(38.0);
        list2.add(4.0);

        // Third ArrayList with a similar pattern
        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(2.0);
        list3.add(5.0);
        list3.add(9.0);
        list3.add(14.0);
        list3.add(20.0);
        list3.add(2.0);
        list3.add(35.0);
        list3.add(44.0);

        System.out.println(isIncreasingRate(list1));
        System.out.println(isIncreasingRate(list2));
        System.out.println(isIncreasingRate(list3));
    }
}
