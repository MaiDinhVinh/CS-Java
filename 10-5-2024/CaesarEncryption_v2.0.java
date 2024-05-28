import java.util.Scanner;

class ad_review1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inp = sc.next();
        System.out.print("Enter encryption shifting: ");
        int ert = sc.nextInt();

        String res = "";
        char encryption = ' ';
        int loop = 0;
        if(ert > 0){
            loop = 1;
        } else if(ert < 0){
            loop = -1;
        }
        for(int i = 0; i < inp.length(); i++){
            encryption = inp.charAt(i);
            for(int j = 0; j != ert; j+=loop){
                if(ert > 0){
                    if(encryption == 'Z' || encryption == 'z'){
                        encryption -= 25;
                    } else{
                        encryption += 1;
                    }
                }
                if(ert < 0){
                    if(encryption == 'A' || encryption == 'a'){
                        encryption += 25;
                    } else{
                        encryption -= 1;
                    }
                }
            }
            res += encryption;
        }
        System.out.println("The cipher text string is: " + res);
    }
}