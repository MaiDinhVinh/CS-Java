import java.util.Scanner;
class lab6_ex4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        int count = 1;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                count++;                    
            }
        }
        System.out.println("Word count: " + count);
    }
}