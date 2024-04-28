class lab5_ex5{
    public static void main(String[] args){
        int[][] arr = { {1, 2, 4, -2}, {-2, -3, -1, 0} };
        int res = arr[0][0];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] < res){
                    res = arr[row][col];
                }
            }
        }
        System.out.println("min = " + res);
    }
}