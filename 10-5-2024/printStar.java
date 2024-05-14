import java.util.Scanner;

class ex_review3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int inp = sc.nextInt();
        for(int i = 0; i < inp; i+=2){
            //print space
            for(int j = 0; j < i-1; j+=2){
                System.out.print("_");
            }
            //print star
            for(int z = inp - i; z > 0; z--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}