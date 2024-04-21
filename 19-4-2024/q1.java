import java.util.Scanner;
class Lab3_ex01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        while (a >= 0){
            System.out.print("Enter a number: ");
            a = sc.nextInt();
        }
    } 
}