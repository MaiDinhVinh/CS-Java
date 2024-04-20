import java.util.Scanner;
class Lab3_ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int max = 0;
        while (a >= 0){
            if (a > max){
                max = a;
            }
            System.out.print("Enter a number: ");
            a = sc.nextInt();
        }
        System.out.println("The maximum number is: " + max);
    }
}