import java.util.Scanner;
class Lab3_ex6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int res = 1;
        int a;
        do{
            System.out.print("Enter a number: ");
            a = sc.nextInt();
            if (a < 0){
                System.out.println("You should enter a positive number!");
            }
        } while(a < 0);
        for(int fact = 1; fact <= a; fact++){
            res *= fact;
        }
        System.out.println(a + "! " + "= " + res);
    }
}