import java.util.Scanner;
class lab6_ex8a{
    public static void main(String[] args){
        int pivot = -1;
        int[] arr = {-1};
        System.out.print("Less than or equal " + pivot + ": ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= pivot){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("\n"); //cach 1 dong
        System.out.print("Greater than " + pivot + ": ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > pivot){
                System.out.print(arr[i] + " ");
            }
        }
    }
}