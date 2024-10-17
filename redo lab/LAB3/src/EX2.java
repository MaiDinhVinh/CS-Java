import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        int max = -Integer.MAX_VALUE;
        int input = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number: ");
            input = sc.nextInt();
            if(input > max){
                max = input;
            }
        } while(input >= 0);
        System.out.format("The maximum number is %d", max);
    }
}
