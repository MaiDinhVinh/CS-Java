import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your text: ");
        String txt = sc.nextLine();
        System.out.print("Enter shifting: ");
        int shift = sc.nextInt();
        int eCase = 0;
        if(shift < 0){
           eCase = 1;
           shift = Math.abs(shift);
        } else{
            eCase = 0;
        }
        
        
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int length = alphabet.length();
        
        String eTxt = "";
        
        for(int i = 0; i < txt.length(); i++){
            String s = txt.substring(i, i + 1);
            int pos = alphabet.indexOf(s);
            int ePos = 0;
            int temp = shift;
            switch (eCase){
                case 1:
                    temp-= pos;
                    ePos = temp % 26;
                    if(ePos > 0){
                        ePos = 26 - ePos;
                    } else if(ePos < 0){
                        ePos = 0 + Math.abs(ePos);
                    }
                    break;
                case 0:
                    ePos = (pos + temp) % 26;
                    break; 
            }
            eTxt += alphabet.charAt(ePos);

        }
        
        System.out.println("Encrypted: " + eTxt.toUpperCase());
    }
}