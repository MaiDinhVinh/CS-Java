import java.util.Scanner;

class review1_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your amount of money: ");
        int inp = sc.nextInt();

        int x = inp % 10; //lay hang don vi
        int y = inp % 100; //lay hang chuc
        int z = inp / 100; //lay hang tram
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, k = 0; //tu 1k - 500k
        //for loop tinh hang don vi
        for (int i = x; i > 0; i-=0){
            if(i == 1){
                a++;
                i-=1;
            } else if(i > 1 && i <= 4){
                b++;
                i-=2;
            } else if(i >= 5 && i < 10){
                c++;
                i-=5;
            }
        }

        //for loop tinh hang chuc
        if (y > 0){
            for (int i = (y - x); i > 0; i-= 0){
                if(i >= 10 && i < 20){
                    d++;
                    i-=10;
                } else if(i >= 20 && i < 50){
                    e++;
                    i-=20;
                } else if(i >= 50 && i < 100){
                    f++;
                    i-=50;
                }
            }
        }

        //for loop tinh hang tram
        if(z > 0){
            for (int i = z; i > 0; i-=0){
                if(i >= 1 && i < 2){
                    g++;
                    i -= 1;
                } else if(i >= 2 && i < 5){
                    h++;
                    i -= 2;
                } else if(i >= 5){
                    k++;
                    i -= 5;
                }
            }
        }

        System.out.println(k + " of 500k " + ", " + h + " of 200k " + ", " + g + " of 100k " + ", " + f + " of 50k " + ", " + e + " of 20k " + ", " + d + " of 10k " + ", " + c + " of 5k " + ", " + b + " of 2k " + "," + a + " of 1k ");
    }
}