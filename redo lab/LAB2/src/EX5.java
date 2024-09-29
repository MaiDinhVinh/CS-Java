import java.util.Scanner;
public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 integer: ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int i4 = sc.nextInt();
        int i5 = sc.nextInt();
        double sum = i1 + i2 + i3 + i4 + i5;
        System.out.format("The sum: %f%n", sum);
        System.out.format("Percentage: %d(%d%%), %d(%d%%), %d(%d%%), %d(%d%%), %d(%d%%)",
                i1, ((int)((i1/sum)*100)), i2, ((int)((i2/sum)*100)),
                i3, ((int)((i3/sum)*100)), i4 ,((int)((i4/sum)*100)),
                i5, ((int)((i5/sum)*100)));

    }
}
