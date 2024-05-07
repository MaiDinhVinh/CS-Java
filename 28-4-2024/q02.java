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
        int a = s1.compareTo(s2);
        int b = s2.compareTo(s1);    
        int c = s2.compareTo(s3); 
        int d = s3.compareTo(s2);
        int e = s3.compareTo(s1);
        int f = s1.compareTo(s3);
        int[] arr = {a, b, c, d, e, f};
        int max = a;
        String first = "";
        String last = "";
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        if(max == a){
            first = s2;
            last = s1;
        } else if(max == b){
            first = s1;
            last = s2;
        } else if(max == c){
            first = s3;
            last = s2;
        } else if(max == d){
            first = s2;
            last = s3;
        } else if(max == e){
            first = s1;
            last = s3;
        } else if(max == f){
            first = s3;
            last = s1;
        }
        System.out.println("The first string is: " + first);
        System.out.println("The last string is: " + last);
    }
}