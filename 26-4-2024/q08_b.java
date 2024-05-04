class lab6_ex8b{
    public static void partition(int[] arr, int pivot){
        int[] res = new int[arr.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] <= pivot){
                res[index] = arr[i];
                count++;
                index++;
            } 
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > pivot){
                res[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = res[i];
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int pivot = 11;
        int[] a = {37, 13, 36, 10, 9};
        System.out.print("Before: ");
        printArray(a);
        partition(a, pivot);
        System.out.print("\n");
        System.out.print("After: ");
        printArray(a);
    }
}