import java.util.Scanner;
class lab6_ex5b{
    public static boolean isPalindrome(String inp){
        for(int i = 0; i < inp.length(); i++){
            if((inp.substring(i, i+1)).compareToIgnoreCase(inp.substring((inp.length() - 1 - i), (inp.length() - i))) != 0){
                return false;
            }
        }
        return true;
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