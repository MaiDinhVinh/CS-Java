import java.util.Scanner;

class ex_review1{
    public static void printWord(String inp){
        // inp += ' ';
        // String inp2 = ' ' + inp;
        String prt = "";
        for(int i = 0; i < inp.length(); i++){
            if(inp.charAt(i) != ' '){
                prt += inp.charAt(i);
            } else{
                if(prt.length() == 0){
                    continue;
                } else{
                    System.out.println(prt);
                    prt = "";
                } 
            }
            if(i == inp.length() - 1){
                System.out.println(prt);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.print("str = ");
        String str = sc.nextLine();
        printWord(str);
    }
}