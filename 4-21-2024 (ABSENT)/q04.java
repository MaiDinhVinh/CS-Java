import java.util.Scanner;
class Lab4_ex04{
    public static boolean isLeapYear(int input){
        boolean res = input % 4 == 0 || input % 100 == 0 && input % 400 == 0;
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int a = sc.nextInt();

        while (a > 0){
            if (isLeapYear(a) == true){
                System.out.println("It is a leap year");
            } else{
                System.out.println("It is NOT a leap year");
            }
            System.out.print("Enter a year: ");
            a = sc.nextInt();
        }
        System.out.println("---------------");

    }
}