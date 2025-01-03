import java.util.Scanner;
public class EX7 {

    public static boolean containDigit7(int input){
        for (int i = input; i > 0; i/=10){
            if(i % 10 == 7){
                return true;
            }
        }
        return false;
    }

    public static int sumWithout7(int input){
        int sum = 0;
        for(int i = 0; i <= input; i++){
            if(containDigit7(i)) continue;
            else sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumWithout7(30));
    }
}
