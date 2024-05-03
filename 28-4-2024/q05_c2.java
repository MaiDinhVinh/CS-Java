//kayak hannah
//hannah length = 6
//0-5, 1-4, 2-3
import java.util.Scanner;
class lab6_ex5b{
    public static boolean isPalindrome(String inp){
        char[] before = new char[inp.length()];
        char[] after = new char[inp.length()];
        for (int i = 0; i < inp.length(); i++){
            before[i] = inp.charAt(i);
        }
        //lam nguoc lai tiep 
        int z = 0;
        for (int i = inp.length() - 1; i >= 0; i--){
            after[z] = before[i];
            z++;
        }
        //check 2 array tiep 
        boolean res = false;
        for (int i = 0; i < inp.length(); i++){
            if (after[i] == before[i]){
                res = true;
            } else if(after[i] - before[i] == 32 || after[i] - before[i] == -32){
                res = true;
            } else{
                break;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String s = sc.nextLine();
        if (isPalindrome(s) == true){
            System.out.println("\" " + s + " \"" + " is a palindrome");
        } else{
            System.out.println("\" " + s + " \"" + " is not a palindrome");
        }
    }
}