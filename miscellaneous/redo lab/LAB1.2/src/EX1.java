import java.util.Scanner;
public class EX1 {
    public static void main(String[] args) {
        System.out.print("Enter the distance in inches: ");
        Scanner sc = new Scanner(System.in);
        double input = (double)sc.nextInt();
        System.out.println(input + " inches" + " = " + (input*2.54) + " cm");
    }
}
