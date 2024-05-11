import java.util.Scanner;
class lab6_ex5a{
    public static boolean isPalindrome(String inp){
        for(int i = 0; i < inp.length(); i++){
            if(!(inp.charAt(i) == inp.charAt(inp.length() - 1 - i))){
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
            System.out.println("\"" + s + "\"" + " is a palindrome");
        } else{
            System.out.println("\"" + s + "\"" + " is not a palindrome");
        }
    }
}