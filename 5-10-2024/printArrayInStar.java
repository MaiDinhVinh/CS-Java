import java.util.Scanner;

class review3{
    public static void printGraph(int a){
        for(int i = 0; i < a; i++){
            System.out.print("*");
        }
        System.out.print(" (" + a + ")");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        do{
            System.out.print("Enter the number of items: ");
            inp = sc.nextInt();
        } while(inp <= 0);

        int[] items = new int[inp];

        System.out.print("Enter the values of all items: ");
        for(int i = 0; i < inp; i++){ 
            items[i] = sc.nextInt();
        }

        for(int i = 0; i < inp; i++){
            System.out.print(i + ": ");
            printGraph(items[i]);
            System.out.print("\n");
        }
    }
}