import java.util.Scanner;
class test2{
    public static char firstCharNotRepeated(String inp){
        int caches = 0;
        char res = ' ';
        char rep = ' ';
        for (int i = 0; i < inp.length(); i++){
            for (int z = i+1; z < inp.length(); z++){
                if (inp.charAt(i) == rep){
                    break;
                } else if (inp.charAt(i) == inp.charAt(z)){
                    caches += 1;
                }
            }
            if(caches == 0){
                res = inp.charAt(i);
                break;
            } else{
                caches = 0;
                rep = inp.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args){
        String s = "abacddbecf";
        System.out.println(firstCharNotRepeated(s));
    }
}