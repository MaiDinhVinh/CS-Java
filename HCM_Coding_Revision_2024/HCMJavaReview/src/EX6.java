import java.util.Scanner;
public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the long string: ");
        String input1 = sc.nextLine();
        System.out.print("Enter the short string: ");
        String input2 = sc.nextLine();

        int short_input_length = input2.length();
        String short_reversed = "";
        for(int i = input2.length() - 1; i >= 0; i--){
            short_reversed += input2.charAt(i);
        }
        String compare = null;
        String final_result = "";
        boolean is_added = false;
        int temp = 0;
        for(int i = 0; i < input1.length(); i++){
            if(i > input1.length() - short_input_length){
                final_result += input1.substring(i);
                break;
            }
            if(i == input1.length() - short_input_length){
                compare = input1.substring(input1.length() - short_input_length);
                if(compare.compareTo(input2) == 0){
                    final_result += short_reversed;
                }else{
                    final_result += input1.substring(i);
                }
                break;
            }else{
                compare = input1.substring(i, short_input_length + i);
                if(compare.compareTo(input2) == 0){
                    final_result += short_reversed;
                    i += short_input_length - 1;
                }else{
                    final_result += input1.charAt(i);
                }
            }
        }

        System.out.println(final_result);

    }
}

