import java.util.Scanner;
public class EX4 {

    public static boolean isLeapYear(int input){
        if(input % 4 == 0 || input % 100 == 0 && input % 400 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.print("Enter a year: ");
            input = sc.nextInt();
            if(input > 0){
                if(isLeapYear(input)) System.out.println("It is a leap year");
                else System.out.println("It is NOT a leap year");
            }
        }while(input > 0);
    }
}
