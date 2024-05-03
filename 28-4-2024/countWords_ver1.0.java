import java.util.Scanner;
class lab6_ex4a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inp = sc.nextLine();
        int space_num = 0;
        if (inp.length() == 0 || (inp.length() == 1 && inp.charAt(0) == ' ')){
            System.out.println("Word count: " + space_num);
        } else{
            for (int i = 0; i < inp.length(); i++){
                if (inp.charAt(i) == ' '){
                    space_num++;
                } 
            }
            if (space_num % 2 == 1){
                System.out.println("Word count: " + (space_num));
            } else{
                if (inp.charAt(0) == ' ' && inp.charAt(inp.length() - 1) == ' '){
                    System.out.println("Word count: " + (space_num - 1));
                } else{
                    System.out.println("Word count: " + (space_num + 1));
                }
            }
        }
    }
} //sai do hieu sai de bai, k co cach o 2 dau cuoi 