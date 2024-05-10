import java.util.Scanner;
class review2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inp;
        do{
            System.out.print("Enter the size: ");
            inp = sc.nextInt();
        } while(inp <= 0);

        for(int i = 0; i < inp; i++){
            if(i % 2 == 0){
                for(int j = 0; j < inp; j++){
                    System.out.print("#");
                    System.out.print("_");
                }
            } else if (i % 2 == 1){
                for(int z = 0; z < inp; z++){
                    System.out.print("_");
                    System.out.print("#");
                }
            }
            System.out.print("\n");
        }
    }
}