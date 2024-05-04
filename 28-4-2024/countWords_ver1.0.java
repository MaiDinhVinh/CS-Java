import java.util.Scanner;

class lab6_ex4a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inp = sc.nextLine();
        int space_num = 0;

        for (int i = 0; i < inp.length(); i++){
            if(inp.charAt(i) == ' '){
                space_num += 1;
            }
        }
        System.out.println("Word count: " + (space_num + 1)); //khoang cach space + 1 => so chu (truong hop khong dac biet)
    }
}