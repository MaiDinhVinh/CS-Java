import java.util.Scanner;
public class EX8 {

    public static void printMenu(){
        System.out.println("+------------------------------------------------------------------+");
        System.out.println("|                   EMPLOYEE MANAGEMENT PROGRAM                    |");
        System.out.println("+------------------------------------------------------------------+");
        System.out.println("|1. Input |2. Sort |3. Analyze |4. Find |5. Save |6. Open |7. Exit |");
        System.out.println("+------------------------------------------------------------------+");
    }

    public static void toContinue(){
        System.out.println("Do you want to continue ?");
        System.out.println("- Yes, I do. (press 'y', 'Y')");
        System.out.println("- No, I don't. (press 'n', 'N')");
        System.out.println("- Please clear the screen ! (press 'c', 'C')");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1;
        char input2;
        do{
            printMenu();
            do{
                System.out.print("Please enter your selection: ");
                input1 = sc.nextInt();
                if(input1 < 1 || input1 > 7) System.out.println("Invalid selection, please type again !");
                else{
                    System.out.format("You have selected %s%n", input1);
                }
            }while(input1 < 1 || input1 > 7);
            if(input1 == 7){
                break;
            }
            toContinue();
            do{
                System.out.print("Please enter your selection: ");
                input2 = sc.next().charAt(0);
                if(input2 != 'y' && input2 != 'Y' && input2 != 'n' && input2 != 'N' && input2 != 'c' && input2 != 'C') {
                    System.out.println("Invalid option, please try again !");
                }else{
                    switch(input2){
                        case 'C':
                        case 'c':
                            System.out.println("Console cleared ! (Java doesn't have this feature :)))");
                    }
                }
            }while(input2 != 'y' && input2 != 'Y' && input2 != 'n' && input2 != 'N' && input2 != 'c' && input2 != 'C');
        }while(input2 != 'n' && input2 != 'N');
    }
}
