import java.util.Scanner;

class review2{
    public static char firstCharNotRepeated(String inp){
        char same = ' ';
        for (int i = 0; i < inp.length()-1; i++){
            for (int z = i; z < inp.length(); z++){
                if(inp.charAt(z) == same){
                    continue;
                } else if (inp.charAt(z) == inp.charAt(i+1)){
                    same = inp.charAt(z);
                } else{
                    return inp.charAt(z);
                }
            }
        }
        return ' ';
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("str: ");
        String input = sc.nextLine();

        System.out.println("output: " + firstCharNotRepeated(input));
    }
}