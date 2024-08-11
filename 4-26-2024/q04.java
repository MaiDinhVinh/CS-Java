class lab5_ex4{
    public static int sumLast3(int[] arr){
        int sum = 0;
        if (arr.length <= 3){
            for (int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
        } else{
            for (int i = arr.length - 3; i < arr.length; i++){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] a = {-1, 2, -3, 4, -5, 6, -7, 8, 9, 10, 0, 3, 4, -1000, 23034, -122, 2, 3};
        System.out.println(sumLast3(a));
    }
}