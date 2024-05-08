import java.util.Scanner;
class lab6_ex6{
    public static String rearrange(String inp){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String conso = "";
        String vow = "";
        String res = "";
        int status = 0;
        for (int i = 0; i < vowels.length; i++){
            if(inp.charAt(0) == vowels[i]){
                status++;
                break;
            }
        }
        boolean check = false;
        for(int i = 0; i <= inp.length() - 1; i++){
            for(int z = 0; z < vowels.length; z++){
                if(inp.charAt(i) == vowels[z]){
                    if(i == inp.length() - 1){
                        vow += inp.substring(i);
                        check = true;
                        break;
                    } else {
                        vow += inp.substring(i, i+1);
                        check = true;
                        break;
                    }
                }
            }
            if(!check){
                if(i == inp.length() -1){
                    conso += inp.substring(i);
                } else{
                    conso += inp.substring(i, i+1);
                }
            }
            check = false;
        }
        switch (status){
            case 0:
                res = conso + vow;
                break;
            case 1:
                res = vow + conso;
                break;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("A word: ");
        String s = sc.nextLine();
        System.out.println("Rearranged word: " + rearrange(s));
    }
}