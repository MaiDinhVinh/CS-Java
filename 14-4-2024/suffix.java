import java.util.Scanner;
class Lab2_ex5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = sc.nextInt();
        int last2digits = value % 100;
        if (last2digits >= 11 && last2digits <= 13){
            System.out.println(value + "th");
        } else{
            int suff = value % 10;
            switch (suff){
                case 1:
                    System.out.println(value + "st");
                    break;
                case 2:
                    System.out.println(value + "nd");
                    break;
                case 3:
                    System.out.println(value +"rd");
                    break;
                default:
                    System.out.println(value +"th");
            }
        }
    }
}