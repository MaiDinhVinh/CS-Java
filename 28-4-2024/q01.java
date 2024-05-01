import java.util.Scanner;
class lab6_ex1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String F = sc.next();
        System.out.print("Please enter your middle name: ");
        String M = sc.next();
        System.out.print("Please enter your last name: ");
        String L = sc.next();
        System.out.println("F M L format: " + F + ' ' + M + ' ' + L);
        System.out.println("L M F format: " + L + ' ' + M + ' ' + F);
    }
}