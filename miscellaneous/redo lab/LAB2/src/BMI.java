import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender (0 for female, 1 for male): ");
        int gInput = sc.nextInt();
        System.out.print("Enter your weight (kg) and height(m): ");
        double wInput = sc.nextDouble();
        double hInput = sc.nextDouble();
        double BMI = wInput/(hInput * hInput);
        switch (gInput){
            case 0:
                if(BMI <= 19) System.out.println("You are a little skinny");
                else if(BMI > 19 && BMI <= 24)
                    System.out.println("You are in good shape");
                else if (BMI > 24) System.out.println("You are a little big");
                break;
            case 1:
                if(BMI <= 20) System.out.println("You are a little skinny");
                else if (BMI > 20 && BMI <= 25)
                    System.out.println("You are in good shape");
                else if(BMI > 25) System.out.println("You are a little big");
        }

    }
}
