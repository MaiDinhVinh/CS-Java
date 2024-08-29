public class HW {
    /*
     * 1. Write a method that accepts a number as input and prints whether the number is odd or even
        using an if/else statement as well as a ternary expression.*/
    //method 1
    public static void isOddOrEven1(int a){
        if(a % 2 == 1){
            System.out.println("this number is odd");
        } else{
            System.out.println("this number is even");
        }
    }

    //method 2
    public static void isOddOrEven2(int a){
        System.out.println(a % 2 == 1 ? "odd" : "even");
    }

    /*
    * 2. Accept a number between 0 to 5 as input and print the sum of numbers from 1 to the input
        number using code that exploits the "fall through" behavior of a switch statement.*/
    public static int sumFrom1to5(int a){
        int sum = 0;
        switch (a){
            case 5: sum += 5;
            case 4: sum += 4;
            case 3: sum += 3;
            case 2: sum += 2;
            case 1: sum += 1;
        }

        return sum;
    }

    /*
    * 3. Accept a number as input and generate output as follows using a cascaded and/or nested
if/else statement - if the number is even print "even", if it is divisible by 3, print "three", if
it is divisible by 5, print "five" and if it is not divisible by 2, 3, or 5, print "unknown". If the
number is divisible by 2 as well as by 3, print "23", and if the number is divisible by 2, 3, and
5, print "235".*/
    //approach 1
    public static void divisibleby235(int a){
        if(a % 2 == 0){
            if(a % 3 == 0){
                if(a % 5 == 0){
                    System.out.println("235");
                }else{
                    System.out.println("23");
                }
            }else{
                System.out.println("even");
            }
        } else if (a % 3 == 0){
            System.out.println("three");
        } else if(a % 5 == 0){
            System.out.println("five");
        } else{
            System.out.println("unknown");
        }
    }

    //approach 2
    public static void divisibleBy235(int a){
        if(a % 2 == 0 && a % 3 == 0 && a % 5 == 0){
            System.out.println("235");
        } else if(a % 2 == 0 && a % 3 == 0){
            System.out.println("23");
        } else if(a % 2 == 0){
            System.out.println("even");
        } else if(a % 3 == 0){
            System.out.println("three");
        } else if(a % 5 == 0){
            System.out.println("five");
        } else{
            System.out.println("unknown");
        }
    }
    public static void main(String[] args) {
        int a = 60;
        divisibleby235(a);
    }
}
