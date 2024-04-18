import java.util.Scanner;
class Lab02_ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 distinct integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Please enter 3 DISTINCT integers");
        } else if (a == b || a == c){
            System.out.println("Please enter 3 DISTINCT integers");
        } else if (a > b && a > c){
            System.out.println(a + " is the largest");
        } else if (b > c){
            System.out.println(b + " is the largest");
        } else{
            System.out.println(c + " is the largest");
        }
    }
}
