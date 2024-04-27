class Lab5_ex2{
    public static boolean isAscending(int[] arr){
        int caches = arr[0];
        boolean res = false;
        for (int i = 1; i < arr.length; i++){
            res = arr[i] > caches;
            if (res == false){
                break;
            } else {
                caches = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 7, 8, 9};
        if (isAscending(arr) == true){
            System.out.println("Element are in ascending order");
        } else{
            System.out.println("Element are NOT in ascending order");
        }
    }
}