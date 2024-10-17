import java.util.Scanner;
public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int factorial = 1;
        do{
            System.out.print("Enter a number: ");
            input = sc.nextInt();
            if(input < 0){
                System.out.println("You should enter a positive number !");
            }
        }while(input < 0);
        if(input == 0){
            System.out.println("0! = 1");
        }else{
            for(int i = 1; i <= input; i ++){
                factorial *= i;
            }
            System.out.format("%d! = %d", input, factorial);
        }
    }
}
