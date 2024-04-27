class Lab4_ex1{
    public static int countDiv3(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 3 == 0){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] a = {1, 3, 5, 7, 9};
        System.out.println("There are " + countDiv3(a) + " elements divisible by 3");
    }
}