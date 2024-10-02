import java.util.Scanner;
public class EX1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int input = sc.nextInt();
        if(input % 4 == 0 || input % 100 == 0 && input % 400 == 0)
            System.out.println("It is a LEAP year ");
        else System.out.println("It is NOT a leap year");
    }
}