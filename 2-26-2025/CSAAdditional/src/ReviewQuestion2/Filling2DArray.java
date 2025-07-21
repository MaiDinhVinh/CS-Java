package ReviewQuestion2;

public class Filling2DArray {
    public static boolean[][] makeGrid(int rows, int cols){
        boolean[][] res = new boolean[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                //if(i % 2 == 0 && j % 2 == 0) res[i][j] = true; //should be "checking if the sum is even"
                //else res[i][j] = false;
                if((i + j) % 2 == 0) res[i][j] = true;
                else res[i][j] = false;
            }
        }
        return res;
    }
}
