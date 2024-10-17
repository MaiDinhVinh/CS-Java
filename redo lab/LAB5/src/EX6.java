public class EX6 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 2, 4},
                {2, 1, 4, 2},
                {2, 0, 0, 2},
                {4, 2, 2, 1}
        };
        int prod1 = 1;
        int colPos = arr.length - 1;
        int prod2 = 1;
        for(int i = 0; i < arr.length; i++, colPos--){
            prod1 *= arr[i][i];
            prod2 *= arr[i][colPos];
        }
        System.out.println(prod1);
    }
}
