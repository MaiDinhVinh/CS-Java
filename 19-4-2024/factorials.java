import java.util.Scanner;
class Lab3_ex6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int res = 1;
        while (a < 0){
            System.out.println("You should enter a positive number!");
            System.out.print("Enter a number: ");
            a = sc.nextInt();
        }
        for(int fact = 1; fact <= a; fact++){
            res *= fact;
        }
        System.out.println(a + "! " + "= " + res);
    }
}//sua lai dung do while