import java.util.Scanner;
class Lab4_ex5{
    public static int getSmallest(int a, int b, int c){
        int smallest = 0;
        if (a < b && a < c){
            smallest = a;
        } else if (b < a && b < c){
            smallest = b; 
        } else if (c < a && c < b){
            smallest = c;
        }
        return smallest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 distinct integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        while (x != y && y != z && x != z){
            System.out.println(getSmallest(x, y, z) + " is the smallest");
            System.out.print("Enter 3 distinct integers: ");
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
        }
        System.out.println("-------------");
    }
}