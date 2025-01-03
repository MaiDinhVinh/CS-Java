public class EX1 {

    public static int countDiv3(int[] arr){
        int divisibleCount = 0;
        for(int i: arr){
            if(i % 3 == 0){
                divisibleCount++;
            }
        }
        return divisibleCount;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        System.out.println(countDiv3(arr));
    }
}
