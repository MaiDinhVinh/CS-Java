package ReviewQuestion;

public class DetermineOverpricedStock {
    public static boolean[] overOrUnderpriced(double[] arr){
        boolean[] result = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 70){
                result[i] = true;
            }else{
                result[i] = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[] arr = {55.6, 63.2, 68.1, 70.1, 72.4, 73.9, 71.5, 68.3, 67.1, 66.2};
        for(boolean b: overOrUnderpriced(arr)){
            System.out.println(b);
        }
    }

}
