import java.util.Scanner;
public class MagicNumber {

    public static int getMagic(int input){
        int firstMagic = input%10;
        int secondMagic = input%1000/100;
        int thirdMagic = input%100000/10000;
        return (firstMagic + secondMagic + thirdMagic)%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getMagic(55377));
    }
}
