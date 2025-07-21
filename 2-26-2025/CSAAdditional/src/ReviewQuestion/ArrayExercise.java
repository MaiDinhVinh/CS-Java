package ReviewQuestion;

public class ArrayExercise {
    public static int countOccurences(double[] arr,
                                      double lowerBound,
                                      double upperBound){
        int count = 0;
        for(double d: arr){
            if(d >= upperBound || d <= lowerBound) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        double[] arr = {634.5, 521.8, 786.6, 899.0, 509.1, 235.4, 750.0, 806.8, 142.5, 645.3};
        System.out.println(countOccurences(arr, 250.0, 750.0));
    }
}
