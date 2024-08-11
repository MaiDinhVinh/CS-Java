class lab5_ex7{
    public static boolean isPartOf(int x, int[] arr){
        // boolean res = false;
        for (int i = 0; i < arr.length; i++){
            // res = x == arr[i];
            // if (res == true){
            //     break;
            // }
            if (x == arr[i]){
                return true;
            }

        }
        // return res;
        return false;
    }
    
    public static boolean isSubSet(int[] arrA, int[] arrB){
        for (int a = 0; a < arrA.length; a++){
            // if (isPartOf(arrA[a], arrB) == false){
            if (!isPartOf(arrA[a], arrB)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arrA = {11, 37, 13, 37, 10, 9};
        int[] arrB = {37, 0, 13, 37, 3, 10, 9};
        if (isSubSet(arrA, arrB)){
            System.out.println("arrA is subset of arrB");
        } else{
            System.out.println("arrA is NOT subset of arrB");
        }
    }
}