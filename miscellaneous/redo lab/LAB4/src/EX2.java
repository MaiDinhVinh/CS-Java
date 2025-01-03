import java.util.Scanner;
public class EX2 {
    public static double inchToCm(double input){
        return input*2.54;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in inches: ");
        double input = sc.nextDouble();
        System.out.format("%f inche(s) = %f cm", input, inchToCm(input));
    }
}
