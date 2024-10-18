public class EX7 {

    public static boolean isPartOf(int[] arr, int x){
        for(int i: arr){
            if(i == x){
                return true;
            }
        }
        return false;
    }

    public static boolean isSubSet(int[] arrA, int[] arrB){
        if(arrA.length == 0) return false;
        for(int i: arrA){
            if(!(isPartOf(arrB, i))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arrA = {};
        int[] arrB = {37, 0, 13, 37, 3, 10, 9};
        System.out.println(isSubSet(arrA, arrB));

    }
}
