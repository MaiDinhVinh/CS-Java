import java.util.Scanner;
//BRO I TRIED TO SOLVE THIS FOR FUCKING 13 HOURS 
class lab6_ex2_fix{
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
        int a = s1.compareTo(s2); 
        int b = s2.compareTo(s3);
        int c = s3.compareTo(s1);
        if(a > b && a > c){
            last = s1;
            if(b < c){
                first = s2;
            } else{
                first = s3;
            }
        }
        if(b > c && b > a){
            last = s2;
            if(c < a){
                first = s3;
            } else{
                first = s1;
            }
        } else{
            last = s3;
            if(a < b){
                first = s1;
            } else{
                first = s2;
            }
        }
        System.out.println("The first string is: " + first);
        System.out.println("The last string is: " + last);
    }
}