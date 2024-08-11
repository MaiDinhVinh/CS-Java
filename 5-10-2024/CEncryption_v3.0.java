import java.util.Scanner;
class encryption{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inp = sc.next();
        System.out.print("Enter encryption shifting: ");
        int ert = sc.nextInt();

        //simplifying the shifting
        int n;
        int simplified_shift;
        if(ert == 0 || ert == 26){
            simplified_shift = 0;
        }
        if(ert < 26){
            simplified_shift = ert - 26;
        } else{
            n = 1;
            while(n < ert){
                n *= 26;
            } 
            simplified_shift = ert - n;
        }

        
        System.out.println();
    }
}    