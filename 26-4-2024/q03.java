class Lab5_ex3{
    public static int greatestSum(int[] arr){
        int first = arr[0];
        int second = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > first){
                second = first;
                first = arr[i];
            } else if (arr[i] == first){
                continue;
            } else if(arr[i] > second){
                second = arr[i];
            }
        }
        return first + second;
    }
    
    public static void main(String[] args){
        int[] arr = {-1, -9, -7, -3, -8};
        System.out.println("the greatest sum is " + greatestSum(arr));
    }
} //SAI VAI CA LON - DA CHUA LAI BAI (COMMIT ERROR)