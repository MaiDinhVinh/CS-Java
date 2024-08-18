package section5_3.section5_3_4;

public class TwoTypesOfAssignment {
    public static int calculate(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = calculate(a ,b); //Assigning using return value of a method
        System.out.println(c);

        int x = 1, y = x; //Assigning from another variable
    }
}
