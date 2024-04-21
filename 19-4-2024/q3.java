class Lab3_ex3{
    public static void main(String[] args){
        int sum = 0;
        for(int x = 9; x >= 9 && x <= 300; x++){
            if (x % 7 == 0 && x % 63 != 0){
                sum += x;
            }
        }
        System.out.print("Sum of integer between 9 and 300 that are divisible by 7 but not 63 is " + sum);
    }
}
