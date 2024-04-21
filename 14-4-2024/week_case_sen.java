import java.util.Scanner;
class Lab2_ex3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inp = sc.next().charAt(0); //lay input ky tu tai vi tri index = 0 (same as python)
        switch (inp){
            case 'm': 
            case 'M':
                System.out.println("It's Monday");
                break;
            case 't':
            case 'T':
                System.out.println("It's Tuesday");
                break;
            case 'w':
            case 'W':
                System.out.println("It's Wednesday");
                break;
            case 'h':
            case 'H':
                System.out.println("It's Thursday");
                break;
            case 'f':
            case 'F':
                System.out.println("It's Friday");
                break;
            case 's':
            case 'S':
                System.out.println("It's Saturday");
                break;
            case 'u':
            case 'U':
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Invalid input !");
        }
    }
} //xoa code lap lai