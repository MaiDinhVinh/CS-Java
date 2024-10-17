public class EX4 {

    public static int sumLast3(int[] arr){
        int sum = 0;
        if(arr.length > 3){
            for(int i = arr.length -1; i >= arr.length - 3; i--){
                sum += arr[i];
            }
        }else{
            for(int i: arr){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(sumLast3(arr));
    }
}
