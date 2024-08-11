import java.util.Scanner;
class lab6_ex6{
    public static String rearrange(String inp){
        String vowels = "aeiou";
        String vow = "";
        String conso = "";
        boolean containVow = false;
        if(vowels.contains(inp.substring(0, 1))){
            containVow = true;
        }

        for(int i = 0; i < inp.length(); i++){
            if(vowels.contains(inp.substring(i, i+1))){
                vow += inp.charAt(i);
            } else{
                conso += inp.charAt(i);
            }
        }

        if(containVow){
           return vow + conso; 
        } else{
           return conso + vow;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("A word: ");
        String s = sc.nextLine();
        System.out.println("Rearranged word: " + rearrange(s));
    }
}