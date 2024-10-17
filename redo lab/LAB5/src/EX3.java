public class EX3 {

    public static int greatestSum(int[] arr){
        int max1 = -Integer.MAX_VALUE;
        int max2 = -Integer.MAX_VALUE;
        int posMax1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max1){
                max1 = arr[i];
                posMax1 = i;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i == posMax1) continue;
            else if(arr[i] > max2) max2 = arr[i];
        }
        return max1 + max2;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,5,56,100,1000};
        System.out.println(greatestSum(arr));
    }
}
