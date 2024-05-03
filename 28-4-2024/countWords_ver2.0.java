import java.util.Scanner;
class lab6_ex4a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inp = sc.nextLine();
        int space_num = 0;
        int c = 0;
        int caches = 0;
        //check truong hop dac biet
        for (int i = 0; i < inp.length(); i++){
            if(inp.charAt(i) != ' '){
                c++;
            }
        }
        if (c == 0 || inp.length() == 0 || (inp.length() == 1 && inp.charAt(0) == ' ')){
            System.out.println("Word count: " + space_num);
        }
        //cac truong hop khac
        for (int i = 0; i < inp.length(); i++){
            if (inp.charAt(i) == ' '){
                caches++;
            }
            if (inp.charAt(i) != ' '){
                space_num = caches - (caches - 1);
                caches = 0;
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
