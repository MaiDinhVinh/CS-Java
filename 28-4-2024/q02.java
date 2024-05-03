//su dung cang nhieu thu vien cua string cang tot
//Linh - Lan - Long sap xep nhu the nao ?
import java.util.Scanner;
class lab6_ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the lowercase string: ");
        String inp1 = sc.next();
        System.out.print("Please enter the lowercase string: ");
        String inp2 = sc.next();
        System.out.print("Please enter the lowercase string: ");
        String inp3 = sc.next();
        char a = inp1.charAt(0);
        char b = inp2.charAt(0);
        char c = inp3.charAt(0);
        if (a == b && b == c && a == c){
            System.out.println("All string has the same order");
        } else{
            if (a > b && a > c){
                if (b > c){
                    System.out.println("The first string is: " + inp3);
                    System.out.println("The last string is: " + inp1);
                } else if (b == c){
                    System.out.println("Both " + inp2 + " and " + inp3 + " have the same order");
                    System.out.println("The last string is: " + inp1);
                } else{
                    System.out.println("The first string is: " + inp2);
                    System.out.println("The last string is: " + inp1);
                }
            } else if (b > a && b > c){
                if (a > c){
                    System.out.println("The first string is: " + inp3);
                    System.out.println("The last string is: " + inp2);
                } else if(a == c){
                    System.out.println("Both " + inp1 + " and " + inp3 + " have the same order");
                    System.out.println("The last string is: " + inp2);
                } else{
                    System.out.println("The first string is: " + inp1);
                    System.out.println("The last string is: " + inp2);
                }
            } else{
                if (a > b){
                    System.out.println("The first string is: " + inp2);
                    System.out.println("The last string is: " + inp3);
                } else if (a == b){
                    System.out.println("Both " + inp1 + " and " + inp2 + " have the same order");
                    System.out.println("The last string is: " + inp3);
                } else{
                    System.out.println("The first string is: " + inp1);
                    System.out.println("The last string is: " + inp3);
                }
            }
        }
    }
}