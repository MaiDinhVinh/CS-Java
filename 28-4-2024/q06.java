import java.util.Scanner;
class lab6_ex6{
    public static String rearrange(String inp){
        char[] left = new char[inp.length()];
        char[] right = new char[inp.length()];
        int status = 0;
        if (inp.charAt(0) == 'a' || inp.charAt(0) == 'e' || inp.charAt(0) == 'i' || inp.charAt(0) == 'o' || inp.charAt(0) == 'u'){
            status++;
        } 
        switch (status){
            case 0: //bat dau bang consonant
                for (int i = 0; i < inp.length(); i++){
                    if(inp.charAt(i) != 'a' && inp.charAt(i) != 'e' && inp.charAt(i) != 'i' && inp.charAt(i) != 'o' && inp.charAt(i) != 'u'){
                        left[i] = inp.charAt(i);
                    } else if (inp.charAt(i) == 'a' || inp.charAt(i) == 'e' || inp.charAt(i) == 'i' || inp.charAt(i) == 'o' || inp.charAt(i) == 'u') {
                        right[i] = inp.charAt(i);
                    }
                }
                break;
            case 1: //bat dau bang vowels
                for (int i = 0; i < inp.length(); i++){
                    if(inp.charAt(i) == 'a' || inp.charAt(i) == 'e' || inp.charAt(i) == 'i' || inp.charAt(i) == 'o' || inp.charAt(i) == 'u'){
                        left[i] = inp.charAt(i);
                    } else{
                        right[i] = inp.charAt(i);
                    }
                }
                break;
        }
        String s1 = "";
        String s2 = "";
        s1 = s1.copyValueOf(left, 0, left.length); //noi gia tri cua char trong array left ve thanh 1 string hoan chinh  
        s2 = s2.copyValueOf(right, 0, right.length);
        String res = s1 + s2;
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("A word: ");
        String s = sc.nextLine();
        System.out.println("Rearranged word: " + rearrange(s));
    }
}