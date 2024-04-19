import java.util.Scanner;
class Lab02_ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 distinct integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0; 
        if (a > b && a > c){
            max = a;
        } 
        if (b > a && b > c){
            max = b;
        } 
        if (c > a && c > b){
            max = c;
        }
        System.out.println(max);
    }
} //toi gian lai
