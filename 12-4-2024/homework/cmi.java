import java.util.Scanner;

class lab02_Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //double inch = 2.54;
        double user_inp;

        System.out.print("Enter the distance in inches: ");
        user_inp = sc.nextDouble();

        double result = user_inp*2.54;
        System.out.print(user_inp + " inch(es) = " + result);
        }
}

