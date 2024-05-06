import java.util.Scanner;
class Lab3_ex4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        double count = 0;
        double sum = 0;
        int max = 0;
        int min = a;
        while (a > 0){
            count++;
            if (a > max){
                max = a;
            } else if (a < min){
                min = a;
            } 
            sum += a;
            System.out.print("Enter a number: ");
            a = sc.nextInt();
        }
        double avg = sum/count;
        if (!(count > 0)){
            avg = 0;
        }
        System.out.println("Number of positive values entered is: " + (int)count);
        System.out.println("Maximum value entered is: " + max);
        System.out.println("Minimum value entered is: " + min);
        System.out.println("Average value is: " + avg);
    }
}