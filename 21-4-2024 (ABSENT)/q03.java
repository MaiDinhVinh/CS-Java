import java.util.Scanner;
class Lab4_ex3{
    public static float fToC(float input){
        float result = (input - 32)/9*5;
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in Fahrenheit: ");
        float a = sc.nextFloat();

        System.out.println("Temp " + a + " in Fahrenheit = " + fToC(a) + " Celsious");
    }
}