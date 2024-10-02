import java.util.Scanner;
public class AscendingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 positive integer: ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int p1 = (i1)%1000/100;
        int p2 = (i2)%1000/100;
        int p3 = (i3)%1000/100;
        System.out.format("The integers are: %d, %d and %d%n", i1, i2, i3);
        if(p3 > p2 && p2 > p1) System.out.println("Yes");
        else System.out.println("No");
    }
}
