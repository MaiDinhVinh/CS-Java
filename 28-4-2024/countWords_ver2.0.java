import java.util.Scanner;
class lab6_ex4b{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inp = sc.nextLine();
        int space_num = 0;

        for (int i = 0; i < inp.length() - 1; i++){
            if(inp.charAt(i) == ' ' && inp.charAt(i+1) != ' '){
                space_num += 1;
            }
        }
        System.out.println("Word count: " + space_num);
    }
}