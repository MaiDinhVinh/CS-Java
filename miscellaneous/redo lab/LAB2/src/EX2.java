import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 distinct integers: ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        if(i1 > i2 && i1 > i3){
            System.out.format("%d is the greatest", i1);
        } else if(i2 > i1 && i2 > i3){
            System.out.format("%d is the greatest", i2);
        } else if(i3 > i1 && i3 > i2){
            System.out.format("%d is the greatest", i3);
        }
    }
}
