import java.util.Scanner;
public class EX3 {

    public static double fToC(double input){
        return (input - 32)/9*5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in Fahrenheit: ");
        double input = sc.nextDouble();
        System.out.format("Temp %f in Fahrenheit = %f Celsius", input, fToC(input));
    }
}
