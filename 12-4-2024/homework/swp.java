import java.util.Scanner;

class Lab02_Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a;
        double b;

        System.out.print("Enter the first number: ");
        a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        b = sc.nextDouble();

        double temp1 = b;
        double temp2 = a;

        System.out.println("Values entered are a= " + a + " and b= " + b);
        System.out.println("Values after swap are a= " + temp1 + " and b= " + temp2);
    }
}

