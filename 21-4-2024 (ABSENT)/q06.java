import java.util.Scanner;
class Lab4_ex6{
    public static int getMagic(int a){
        int sum = 0;
        for (int i = 0; i <= 4; i++){
            if (i % 2 == 0){
                sum += (a % 10);
                a /= 10;
            } else{
                a /= 10;
            }
        }
        return sum % 10;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st value: ");
        int x = sc.nextInt();
        System.out.println("Magic number = " + getMagic(x));
        System.out.print("Enter 2nd value: ");
        int y = sc.nextInt();
        System.out.println("Magic number = " + getMagic(y));
    }
}