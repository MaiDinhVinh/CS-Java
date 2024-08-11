import java.util.Arrays;
import java.util.Scanner;
class printWord2{
    public static String[] returnArrayWord(String inp){
        String add = "";
        int count = 0;
        for(int i = 0; i < inp.length(); i++){
            if(inp.charAt(i) != ' '){
                add += inp.charAt(i);
            } else{
                if(add.length() == 0){
                    continue;
                } else{
                    count += 1;
                    add = "";
                }
            }
            if(i == inp.length() - 1){
                count += 1;
                add = "";
            }
        }
        String[] arr = new String[count];
        int index = 0;
        for(int i = 0; i < inp.length(); i++){
            if(inp.charAt(i) != ' '){
                add += inp.charAt(i);
            } else{
                if(add.length() == 0){
                    continue;
                } else{
                    arr[index] = add;
                    index++;
                    add = "";
                }
            }
            if(i == inp.length() - 1){
                arr[index] = add;
            }
        }

        return arr; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String str = sc.nextLine();
        System.out.println("Array: " + Arrays.toString(returnArrayWord(str)));
    }
}