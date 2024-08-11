import java.util.Scanner;

class review2{
    public static char firstCharNotRepeated(String inp){
        char res = ' ';
        String current = "";
        String right = "";
        String left = "";
        for (int i = 0; i < inp.length(); i++){
            if(i == inp.length() - 1){
                current = inp.substring(i);
            } else{
                current = inp.substring(i, i+1);
            }
            if(i > 0){
                left = inp.substring(0, i);
                right = inp.substring(i+1);
                if((!left.contains(current)) && (!right.contains(current))){
                    res = current.charAt(0);
                    break;
                }
            } else{
                String all = inp.substring(i+1);
                if(!all.contains(current)){
                    res = current.charAt(0);
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("str: ");
        String input = sc.nextLine();

        System.out.println("output: " + firstCharNotRepeated(input));
    }
}