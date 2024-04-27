class Lab5_ex3{
    public static int greatestSum(int[] arr){
        int first = arr[0];
        int second = arr[1];
        for (int i = 2; i < arr.length; i++){
            if (arr[i] >= first){
                second = first;
                first = arr[i];
            }
        } 
        int sum = 0;
        return sum = first + second;
    }
    
    public static void main(String[] args){
        int[] arr = {-4, -34, -1, 0, -100, -99};
        System.out.println("the greatest sum is " + greatestSum(arr));
    }
}