import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int i = sc.nextInt();
        System.out.print("Enter the second number: ");
        int i2 = sc.nextInt();
        System.out.format("Value entered are i=%d and i2=%d%n", i, i2);
        int temp = 0;
        temp = i;
        i = i2;
        i2 = temp;
        System.out.format("Value after swap are i=%d and i2=%d%n", i, i2);
    }
}
