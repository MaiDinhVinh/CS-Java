import java.util.Scanner;

class ex_review2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String res = "";
        String inp = sc.next();
        for(int i = 0; i < inp.length(); i++){
            switch (inp.charAt(i)){
                case 'z':
                    res += 'c';
                    break;
                case 'Z':
                    res += 'C';
                    break;
                default:
                    res += (char)(inp.charAt(i) + 3);
            }
        }
        System.out.println("The cipher text string is: " + res);
    }
}