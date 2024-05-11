//tim min la cach an toan nhat, tuy nhien van co cach khong can tim min
class Lab5_ex3_chuabai1{
    public static int greatestSum(int[] arr){
        int first = arr[0], min = arr[0], max1Pos = 0; //tim max1 thi lay tai arr[0] cung dc
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first){
                first = arr[i];
                max1Pos = i;
            } else if(arr[i] < min){
                min = arr[i];
            }
        }

        int second = min;
        for(int i = 0; i < arr.length; i++){
            if(i == max1Pos){
                continue;
            }
            if(arr[i] > second){
                second = arr[i];
            }
        }

        return first + second;
    }
    
    public static void main(String[] args){
        int[] arr = {-1, -9, -7, -3, -8};
        System.out.println("the greatest sum is " + greatestSum(arr));
    }
}