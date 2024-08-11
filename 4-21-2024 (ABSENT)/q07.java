import java.util.Scanner;
class Lab4_ex7{
    public static boolean containDigit7(int a){
        boolean res = true;
        while (a > 0){
            res = a % 10 == 7;
            if (res == true){
                break;
            } else{
                a /= 10;
            }
        }
        return res;
    }

    public static int sumWithout7(int inp){
        int sum = 0;
        for (int i = 1; i <= inp; i++){
            // if (containDigit7(i) == true){
            //     continue;
            // } else{
            //     sum += i;
            // }
            if (!containDigit7(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sum without 7 is: " + sumWithout7(n));
    }
}