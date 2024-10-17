public class EX5 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int[][] arr = { {1, 2, 4, -2}, {-2, -3, -1, 0} };
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
