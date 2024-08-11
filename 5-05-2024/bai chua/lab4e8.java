import java.util.Scanner;

public class lab4e8 {
  public static void printMenu(){
    System.out.println("+------------------------------------------------------------------+");
    System.out.println("|                   EMPLOYEE MANAGEMENT PROGRAM                    |");
    System.out.println("+------------------------------------------------------------------+");
    System.out.println("|1. Input |2. Sort |3. Analyze |4. Find |5. Save |6. Open |7. Exit |");
    System.out.println("+------------------------------------------------------------------+");
  }
  
  public static void qnsContinue(){
    System.out.println("Do you want to continue?");
    System.out.println("- Yes, I do. (press \'y\', \'Y\')");
    System.out.println("- No, I don't. (press \'n\', \'N\')");
    System.out.println("- Please clear the screen! (press \'c\', \'C\')");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int selection;
    char toContinue;
    

    do {
      //step 1
      printMenu();

      //step 2
      do {
        System.out.print("Please enter your selection: ");
        selection = sc.nextInt();
      } while (selection < 1 || selection > 7);


      //step 3
      System.out.println("You have selected" + selection);
      if (selection == 7){
        return;
      }

      
      //step 4
      do {
        qnsContinue();
        System.out.print("Your choice: ");
        toContinue = sc.next().charAt(0);

        if (toContinue != 'y' && toContinue != 'Y'
            && toContinue != 'n' && toContinue != 'N'
            && toContinue != 'c' && toContinue != 'C'){
            System.out.println("Invalid answer! Please answer again");
        }
      } while (toContinue != 'y' && toContinue != 'Y'
        && toContinue != 'n' && toContinue != 'N'
        && toContinue != 'c' && toContinue != 'C');

      if (toContinue == 'c' || toContinue == 'C') {
        System.out.print("clear\n\n\n");  
      }
    } while (toContinue != 'n' && toContinue != 'N');



  }
  
}
