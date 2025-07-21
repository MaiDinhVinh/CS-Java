package ReviewQuestion;

import java.util.ArrayList;

public class IsIncrementArrayList {
    public static boolean isIncrementing(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size() - 1; i++){
            if(arr.get(i) > arr.get(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

// Create first ArrayList with ascending order integers (duplicates allowed)
        ArrayList<Integer> ascendingList = new ArrayList<>();

        // Populate with ascending integers (with some duplications)
        ascendingList.add(1);
        ascendingList.add(2);
        ascendingList.add(2);
        ascendingList.add(3);
        ascendingList.add(5);
        ascendingList.add(5);
        ascendingList.add(8);
        ascendingList.add(10);
        ascendingList.add(12);
        ascendingList.add(15);

        // Create second ArrayList with random integers
        ArrayList<Integer> randomizedList = new ArrayList<>();

        // Populate with 10 random integers between 1 and 100
        randomizedList.add(27);
        randomizedList.add(84);
        randomizedList.add(3);
        randomizedList.add(59);
        randomizedList.add(12);
        randomizedList.add(41);
        randomizedList.add(95);
        randomizedList.add(33);
        randomizedList.add(67);
        randomizedList.add(18);

        System.out.println(isIncrementing(ascendingList));
        System.out.println(isIncrementing(randomizedList));
    }
}
