import java.util.Scanner;
class Lab3_ex4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int count = 0;
        int sum = 0;
        int max = a;
        int min = a;
        while (a > 0){
            count++;
            if (a > max){
                max = a;
                sum += a;
            } else if (a < min){
                min = a;
                sum += a;
            } else{
                sum+= a;
            }
            System.out.print("Enter a number: ");
            a = sc.nextInt();
        }
        System.out.println("Number of positive values entered is: " + count);
        System.out.println("Maximum value entered is: " + max);
        System.out.println("Minimum value entered is: " + min);
        double dsum = (double)sum;
        double dcount = (double)count;
        double avg = dsum/dcount;
        System.out.println("Average value is: " + avg);
    }
}