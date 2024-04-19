import java.util.Scanner;
class Lab2_ex4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender (1 = male, 0 = female): ");
        int gender = sc.nextInt();
        switch (gender){
            case 0:
                System.out.print("Enter your weight (kg) and height (m): ");
                double weight_0 = sc.nextDouble();
                double height_0 = sc.nextDouble();
                double BMI_0 = weight_0/(height_0*height_0);
                if (BMI_0 <= 19){
                    System.out.println("You're a little skinny");
                } else if (BMI_0 <= 24){
                    System.out.println("You're in good shape");
                } else{
                    System.out.println("You're a little big");
                }
                break;
            case 1:
                System.out.print("Enter your weight (kg) and height (m): ");
                double weight_1 = sc.nextDouble();
                double height_1 = sc.nextDouble();
                double BMI_1 = weight_1/(height_1*height_1);
                if (BMI_1 <= 20){
                    System.out.println("You're a little skinny");
                } else if (BMI_1 <= 25){
                    System.out.println("You're in good shape");
                } else{
                    System.out.println("You're a little big");
                }
                break;
            default:
                System.out.println("Please enter appropriate gender!");
        }
    }
}