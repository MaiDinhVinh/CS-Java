import java.util.Scanner;
class lab6_ex8a{
    public static void main(String[] args){
        int pivot = 38;
        int[] arr = {38, 39, 36};
        int smalleq_c = 0;
        int greater_c = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] <= pivot){
                smalleq_c += 1;
            } else{
                greater_c += 1;
            }
        }
        //print less or equal
        int print_num = 0;
        System.out.print("Less than or equal " + pivot + ": ");
        for(int i = 0; i < arr.length; i++){
            if(print_num == smalleq_c - 1 && arr[i] <= pivot){
                System.out.print(arr[i]);    
            } else if (arr[i] <= pivot){
                System.out.print(arr[i] + "," + " ");
                print_num++;
            }
        }
        System.out.print("\n");
        //print greater
        int print_num2 = 0;
        System.out.print("Greater than " + pivot + ": ");
        for(int i = 0; i < arr.length; i++){
            if(print_num2 == greater_c - 1 && arr[i] > pivot){
                System.out.print(arr[i]);
            } else if (arr[i] > pivot){
                System.out.print(arr[i] + "," + " ");
                print_num2++;
            }
        }
    }
}