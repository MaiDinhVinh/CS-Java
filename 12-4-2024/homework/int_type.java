import java.util.Scanner;
class Lab02_ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 integers: ");
        double num1 = sc.nextDouble();
        int inum1 = (int)num1;
        double num2 = sc.nextDouble();
        int inum2 = (int)num2;
        double num3 = sc.nextDouble();
        int inum3 = (int)num3;
        double num4 = sc.nextDouble();
        int inum4 = (int)num4;
        double num5 = sc.nextDouble();
        int inum5 = (int)num5;
        //calculate sum
        double s = num1+num2+num3+num4+num5;
        int s2 = (int)s; //convert from double to int
        System.out.println("The sum: " + s2); 

        //calculate percentage over the sum of all integer
        double dperc1 = ((num1/s)*100);
        int perc1 = (int)dperc1;
        
        double dperc2 = ((num2/s)*100);
        int perc2 = (int)dperc2;

        double dperc3 = ((num3/s)*100);
        int perc3 = (int)dperc3;

        double dperc4 = ((num4/s)*100);
        int perc4 = (int)dperc4;

        double dperc5 = ((num5/s)*100);
        int perc5 = (int)dperc5;

        System.out.println("Percentage: " + inum1 + "(" + perc1 + "%" + ")" + "; " + inum2 + "(" + perc2 + "%" + ")" + "; " + inum3 + "(" + perc3 + "%" + ")" + "; " + inum4 + "(" + perc4 + "%" + ")" + "; " + inum5 + "(" + perc5 + "%" + ")");
    }
}