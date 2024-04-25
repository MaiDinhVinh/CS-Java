import java.util.Scanner;
class Lab4_ex2{
    public static double inchToCm(double usr_inp){
        double res = usr_inp * 2.54;
        return res;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in inches: ");
        double inp = sc.nextInt();

        System.out.println(inp + " inches = " + inchToCm(inp) + " cm");
    }
}