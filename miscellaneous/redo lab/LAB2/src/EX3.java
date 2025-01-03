import java.util.Scanner;
public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = sc.next().charAt(0);
        switch(input){
            case 'm':
            case 'M':
                System.out.println("It is Monday");
                break;
            case 'h':
            case 'H':
                System.out.println("It is Thursday");
                break;
            case 't':
            case 'T':
                System.out.println("It is Tuesday");
                break;
            case 'w':
            case 'W':
                System.out.println("It is Wednesday");
                break;
            case 'f':
            case 'F':
                System.out.println("It is Friday");
                break;
            case 's':
            case 'S':
                System.out.println("It is Saturday");
                break;
            case 'u':
            case 'U':
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("no valid day detected !");
        }
    }
}
