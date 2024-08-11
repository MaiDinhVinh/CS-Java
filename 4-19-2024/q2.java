import java.util.Scanner;
class Lab3_ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int max = 0;
        do{
            System.out.print("Enter a number: ");
            a = sc.nextInt();
            if(a > max){
                max = a;
            }
        } while(a >= 0);
        System.out.println("The maximum number is: " + max);
    }
} 