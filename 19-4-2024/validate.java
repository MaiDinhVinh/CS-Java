import java.util.Scanner;
class Lab3_ex5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        int count = 0;
        do{
            System.out.print("Enter age: ");
            age = sc.nextInt();
            count++;
        } while(age <= 0 || age > 100);
        System.out.println("Your age is: " + age);
        System.out.println("Number of attempts: " + count);
    }
} 