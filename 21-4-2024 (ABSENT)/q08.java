import java.util.Scanner;
class lab4_ex8{
    public static void printMenu(){
        System.out.println("+-----------------------------------------------------------------+");
        System.out.println("|                  EMPLOYEE MANAGEMENT PROGRAM                    |");
        System.out.println("+-----------------------------------------------------------------+");
        System.out.println("|1. Input |2. Sort |3. Analyze |4. Find |5.Save |6. Open |7. Exit |");
        System.out.println("+-----------------------------------------------------------------+");
    }

    public static void toContinue(){
        System.out.println("Do you want to continue ?");
        System.out.println("- Yes, I do. (press 'y', 'Y')");
        System.out.println("- No, I don't. (press 'n', 'N')");
        System.out.println("- Please clear the screen ! (press 'c', 'C')");
    }

    public static void main(String[] args){
        char choice = ' ';
        do{
            Scanner sc = new Scanner(System.in);
            //step 1
            printMenu(); 
            //step 2 
            int inp = 0;
            do{
                System.out.print("Please enter your selection: ");
                inp = sc.nextInt();
            } while (inp <= 0 || inp > 7);
            
            //step 3
            System.out.println("You have selected " + inp);
            if(inp == 7){
                return; //end program
            }

            //step 4
            toContinue();
            do{
                System.out.print("Please enter choice: ");
                choice = sc.next().charAt(0);
            } while (choice != 'n' && choice != 'N' && choice != 'c' && choice != 'C' && choice != 'y' && choice != 'Y');
            if(choice == 'c' || choice == 'C'){
                System.out.println("clear fr fr fr");
            }
        } while (choice == 'c' || choice == 'C' || choice == 'y' || choice == 'Y');   
    }
}