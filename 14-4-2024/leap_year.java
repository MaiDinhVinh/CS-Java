import java.util.Scanner;
//cach 1
class Lab2_ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("Enter a year: ");
        year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("It is a leap year");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is NOT a leap year");
        }
    }
}

//cach 2
class Lab02_ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("Enter a year: ");
        year = sc.nextInt();

        if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is NOT a leap year");
        }
    }
}