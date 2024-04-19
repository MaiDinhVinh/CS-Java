import java.util.Scanner;
class Lab02_ex6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 positive integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //lay hang tram
        int hund1 = (a % 1000)/100;
        int hund2 = (b % 1000)/100;
        int hund3 = (c % 1000)/100;
        if (hund1 < hund2 && hund2 < hund3){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}