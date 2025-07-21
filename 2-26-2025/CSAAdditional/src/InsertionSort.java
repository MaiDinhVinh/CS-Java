import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
        int[] a = {7,8,5,2,4,6,3};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int index = i;
            while(index > 0 && temp < arr[index - 1]){
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = temp;
        }
    }
}