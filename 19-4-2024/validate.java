import java.util.Scanner;
class Lab3_ex5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        int count = 0;
        while (true){
            count++;
            if (age >= 1 && age <= 100){
                System.out.println("Your age is " + age);
                System.out.println("Number of attempts " + count);
                break;
            } else{
                System.out.print("Enter age: ");
                age = sc.nextInt();
            }
        }
    }
}