import java.util.Scanner;
class test_only{
    public static boolean containDigit7(int a){
        boolean res = true;
        while (a > 0){
            res = a % 10 == 7;
            if(res == true){
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
            if(containDigit7(i) == true){
                continue;
            } else{
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumWithout7(10));
    }
}

