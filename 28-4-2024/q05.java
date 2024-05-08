//kayak hannah
//hannah length = 6
//0-5, 1-4, 2-3
import java.util.Scanner;
class lab6_ex5a{
    public static boolean isPalindrome(String inp){
        //check do dai string 
        int check = inp.length();
        String middle1 = "";
        String middle2 = "";
        if(check % 2 == 1){
            check = (inp.length() - 1)/2;
            middle1 = inp.substring(0, check);
            middle2 = inp.substring(check+1);
        } else if(check % 2 == 0){
            check = inp.length() / 2;
            middle1 = inp.substring(0, check);
            middle2 = inp.substring(check);
        }
        //lat nguoc middle2
        char[] arr = new char[middle2.length()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = middle2.charAt(middle2.length() - 1 - i);
        }
        String fin_middle2 = "";
        fin_middle2 = fin_middle2.copyValueOf(arr, 0, arr.length);
        if(middle1.compareTo(fin_middle2) == 0){
            return true;
        } else{
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String s = sc.nextLine();
        if (isPalindrome(s) == true){
            System.out.println("\"" + s + "\"" + " is a palindrome");
        } else{
            System.out.println("\"" + s + "\"" + " is not a palindrome");
        }
    }
}