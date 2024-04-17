import java.util.Scanner;
class Lab02_Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float user_inp;
        
        System.out.print("Enter temp in Fahrenheit: ");
        user_inp = sc.nextFloat();

        float C = (user_inp - 32)/9*5;
        System.out.println("Temp " + user_inp + " in Fahrenheit = " + C + " Celsius");
    }
}
