import java.util.Scanner;
class lab6_ex2_question{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the lowercase string: ");
        String s1 = sc.next();
        System.out.print("Please enter the lowercase string: "); 
        String s2 = sc.next(); 
        System.out.print("Please enter the lowercase string: ");
        String s3 = sc.next(); 
        String first = "";
        String last = "";
        if(s1.compareTo(s2) > 0 && s1.compareTo(s3) > 0){
            last = s1;
            if(s2.compareTo(s3) > 0){
                first = s3;
            } else{
                first = s2;
            }
        }
        if(s2.compareTo(s1) > 0 && s2.compareTo(s3) > 0){
            last = s2;
            if(s1.compareTo(s3) > 0){
                first = s3;
            } else{
                first = s1;
            }
        }
        if(s3.compareTo(s1) > 0 && s3.compareTo(s2) > 0){
            last = s3;
            if(s1.compareTo(s2) > 0){
                first = s2;
            } else{
                first = s1;
            }
        }
        System.out.println("The first string is: " + first);
        System.out.println("The last string is: " + last);
    }
}