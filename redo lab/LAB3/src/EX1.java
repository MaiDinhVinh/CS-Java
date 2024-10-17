import java.util.Scanner;
public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do{
            System.out.print("Enter a number: ");
            input = sc.nextInt();
        }while (input >= 0);
    }
}
