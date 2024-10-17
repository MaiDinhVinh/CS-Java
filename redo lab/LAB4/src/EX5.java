import java.util.Scanner;
public class EX5 {

    public static int getSmallest(int a, int b, int c){
        int smallest = 0;
        if(a < b && a < c){
            smallest = a;
        }else if (b < a && b < c){
            smallest = b;
        }else if(c < a && c < b){
            smallest = c;
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        do{
            System.out.print("Enter 3 integers: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a != b && a != c && b != c)
                System.out.format("%d is the smallest%n", getSmallest(a, b ,c));
        }while (a != b && a != c && b != c);
    }
}
