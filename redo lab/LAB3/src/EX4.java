import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int input;
        float sum = 0;
        int numberOfPos = 0;
        do{
            System.out.print("Enter a number: ");
            input = sc.nextInt();
            if(input > 0){
                numberOfPos++;
                sum += input;
                if(input > max){
                    max = input;
                }
                if(input < min){
                    min = input;
                }
            } else if(input <= 0){
                max = 0;
                min = 0;
            }
        }while(input > 0);
        System.out.format("Number of positive value is: %d%n", numberOfPos);
        System.out.format("Maximum value entered is: %d%n", max);
        System.out.format("Minimum value entered is: %d%n", min);
        if(numberOfPos == 0)
            System.out.println("Average value is: 0");
        else
            System.out.println("Average value is: " + (sum/numberOfPos));
    }
}
