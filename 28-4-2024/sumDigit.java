import java.util.Scanner;
class lab6_ex3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = sc.next();
        int sum = 0;
        for (int i = 0; i < inp.length(); i++){
            if (inp.charAt(i) == '*'){
                break;
            } else{
                int check = (int)inp.charAt(i);
                switch (check){
                    case 48:
                        sum += 0;
                        break;
                    case 49:
                        sum += 1;
                        break;
                    case 50:
                        sum += 2;
                        break;
                    case 51:
                        sum += 3;
                        break;
                    case 52:
                        sum += 4;
                        break;
                    case 53:
                        sum += 5;
                        break;
                    case 54:
                        sum += 6;
                        break;
                    case 55:
                        sum += 7;
                        break;
                    case 56:
                        sum += 8;
                        break;
                    case 57:
                        sum += 9;
                        break;
                    default:
                        continue;
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}