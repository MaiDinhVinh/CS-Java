import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        System.out.format("Perimeter of rectangle is: %d%n", (height+width)*2);
        System.out.format("Area of rectangle is: %d", (height*width));
    }
}
