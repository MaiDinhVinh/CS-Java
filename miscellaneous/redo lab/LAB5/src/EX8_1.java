public class EX8_1 {
    public static void main(String[] args) {
        int[] arr = {37, 13, 37, 10, 9};
        int pivot = 11;
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
        for(int i: lessThanOrEqual){
            System.out.print(i + " ");
        }
        System.out.println("");
        for(int i: greaterThan){
            System.out.print(i + " ");
        }
    }
}
