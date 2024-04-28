class Lab5_ex6{
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 6, 7, 8, 9},
            {10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19},
            {20, 21, 22, 23, 24}
            };
        int prod1 = 1;
        int prod2 = 1;
        //first diagonal line
        for (int i = 0; i < arr.length; i++){
            prod1 *= arr[i][i]; //row = cols
        }
        //second diagonal line
        int floop = arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            // prod2 *= arr[i][floop];
            // floop--;
            prod2 *= arr[i][arr.length-1-i]; //row + col = length - 1
        }
        System.out.println("first product is " + prod1 + " ,second product is " + prod2);
    }
}