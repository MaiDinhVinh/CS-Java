import java.util.Scanner; 

class Lab02_Ver2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.print("Enter the first number: ");
        a = sc.nextDouble();

        System.out.print("Enter the second number: ");
        b = sc.nextDouble();

        System.out.println("Value entered are a= " + a + " and b= " + b);
        double t1;
        t1 = a;
        a = b;
        b = t1;
        System.out.println("Value entered are a= " + a + " and b= " + b);
    }
}