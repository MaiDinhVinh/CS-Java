public class EX2 {

    public static boolean isAscending(int[] arr){
        int element = -Integer.MAX_VALUE;
        int duplicatedVal = 0;
        for(int i: arr){
            if(i > element){
                element = i;
            }else if(i == element){
                duplicatedVal++;
                element = i;
            }else{
                return false;
            }
        }
        if(duplicatedVal == arr.length - 1) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {38, 38, 38, 38};
        String result = isAscending(arr)?" ":" NOT ";
        System.out.format("Elements are%sin ascending order%n", result);
    }
}
