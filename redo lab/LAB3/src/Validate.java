import java.util.Scanner;
public class Validate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        int attempt = 0;
        do{
            System.out.print("Enter age: ");
            age = sc.nextInt();
            attempt++;
            if(age > 0){
                System.out.format("Your age is %d%n", age);
                System.out.format("Number of attempt: %s%n", attempt);
                break;
            }
        }while(age <= 0);
    }
}
