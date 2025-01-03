import java.util.Scanner;
public class Suffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "st";
        String nd = "nd";
        String rd = "rd";
        String th = "th";
        System.out.print("Enter value: ");
        int input = sc.nextInt();
        if(input%100 == 11 || input%100 == 12 || input%100 == 13){
            System.out.format("%d%s", input, th);
        }else{
            if(input%10 == 1){
                System.out.format("%d%s", input, st);
            }else if(input%10 == 2){
                System.out.format("%d%s", input, nd);
            }else if(input%10 == 3){
                System.out.format("%d%s", input, rd);
            }else{
                System.out.format("%d%s", input, th);
            }
        }
    }
}
