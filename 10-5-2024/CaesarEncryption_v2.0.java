import java.util.Scanner;

class ad_review1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inp = sc.next();
        System.out.print("Enter encryption shifting: ");
        int ert = sc.nextInt();

        String res = "";
        char encrypting = ' ';
        for(int i = 0; i < inp.length(); i++){
            encrypting = inp.charAt(i);
            if(ert < 0){
                for(int j = ert; j < 0; j++){
                    if(encrypting == 'a'){
                        encrypting = (char)('z');
                    } else if(encrypting == 'A'){
                        encrypting = (char)('Z');
                    } else{
                        encrypting = (char)(encrypting - 1);
                    }
                }
            } else if(ert > 0){
                for(int j = 0; j < ert; j++){
                    if(encrypting == 'z'){
                        encrypting = (char)('a');
                    } else if(encrypting == 'Z'){
                        encrypting = (char)('A');
                    } else{
                        encrypting = (char)(encrypting + 1);
                    }
                }
            } else{
                res = inp;
                break;
            }
            res += encrypting;
            encrypting = ' ';
        }
        System.out.println("The cipher text string is: " + res);
    }
}