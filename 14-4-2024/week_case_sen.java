import java.util.Scanner;
class Lab2_ex3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inp = sc.next().charAt(0); //lay input ky tu tai vi tri index = 0 (same as python)
        switch (inp){
            case 'm':
                System.out.println("It's Monday");
                break;
            case 'M':
                System.out.println("It's Monday");
                break;
            case 't':
                System.out.println("It's Tuesday");
                break;
            case 'T':
                System.out.println("It's Tuesday");
                break;
            case 'w':
                System.out.println("It's Wednesday");
                break;
            case 'W':
                System.out.println("It's Wednesday");
                break;
            case 'h':
                System.out.println("It's Thursday");
                break;
            case 'H':
                System.out.println("It's Thursday");
                break;
            case 'f':
                System.out.println("It's Friday");
                break;
            case 'F':
                System.out.println("It's Friday");
                break;
            case 's':
                System.out.println("It's Saturday");
                break;
            case 'S':
                System.out.println("It's Saturday");
                break;
            case 'u':
                System.out.println("It's Sunday");
                break;
            case 'U':
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Invalid input !");
        }
    }
}