public class EX8_2 {

    public static void partition(int[] arr, int pivot){
        int lessThanOrEqualCount = 0;
        int greaterThanCount = 0;
        for(int i: arr){
            if(i <= pivot){
                lessThanOrEqualCount++;
            }
        }
        for(int i: arr){
            if(i > pivot){
                greaterThanCount++;
            }
        }
        int[] lessThanOrEqual = new int[lessThanOrEqualCount];
        int[] greaterThan = new int[greaterThanCount];
        int lessThanIndex = 0;
        int greaterThanIndex = 0;
        for(int i: arr){
            if(i <= pivot){
                lessThanOrEqual[lessThanIndex] = i;
                lessThanIndex++;
            }else if(i > pivot){
                greaterThan[greaterThanIndex] = i;
                greaterThanIndex++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i < lessThanIndex){
                arr[i] = lessThanOrEqual[i];
            }else if(i - lessThanIndex < greaterThanIndex){
                arr[i] = greaterThan[i - lessThanIndex];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {37};
        int pivot = 20;
        partition(arr, pivot);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
