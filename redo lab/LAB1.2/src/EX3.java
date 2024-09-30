import java.util.Scanner;
public class EX3 {
    public static void main(String[] args) {
        System.out.print("Enter temp in Fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        System.out.format("Temp %f in Fahrenheit = %f Celsius", input, ((input-32)/9*5));

    }
}
