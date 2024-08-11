import java.util.Scanner;
class Lab02_Ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double len;
        double wid;

        System.out.print("Please enter the length of a rectangle: ");
        len = sc.nextDouble();

        System.out.print("Please enther the width of a rectangle: ");
        wid = sc.nextDouble();

        double peri = (len + wid)*2;
        double area = len*wid;
        System.out.println("The perimeter of the rectangle is: " + peri);
        System.out.println("The area of the rectangle is: " + area);
    }
}