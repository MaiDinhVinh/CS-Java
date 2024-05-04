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
        int loop = 1;
        Scanner sc = new Scanner(System.in);
        do{
            loop -= 1;
            printMenu();
            int choice;
            do{
                System.out.print("Please enter your selection: ");
                choice = sc.nextInt();
              } while (choice <= 0 || choice > 7);
            System.out.println("You have selected " + choice);
            if (choice == 7){
                break;
            }
            char choice2 = ' ';
            toContinue();
            System.out.print("Please enter your selection: ");
            choice2 = sc.next().charAt(0);
            switch (choice2){
                case 'y':
                    loop += 1;
                    break;
                case 'Y':
                    loop += 1;
                    break;
                case 'c':
                    loop += 1;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();  
                    break;
                case 'C':
                    loop += 1;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();  
                    break;
            }
        } while(loop == 1);
    }
}