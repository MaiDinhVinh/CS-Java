//tim max2 baang cach bat dau bang 1 phan tu trong array
class Lab5_ex3_chuabai2{
    public static int greatestSum(int[] arr){
        int first = arr[0], max1Pos = 0; //tim max1 thi lay tai arr[0] cung dc
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first){
                first = arr[i];
                max1Pos = i;
            }
        }
        /* int max2 = arr[0]; ~ SAI, vi neu nhu max1 = arr[0] --> se khong bao gio tim dc max2 vi no von da lon
        hon tat ca cac so khac*/
        
        /*int max2 = arr[max1Pos+1]; ~ SAI, vi neu nhu max1 nam o vi
        tri cuoi cung trong array => loi out of range*/

        /* int max2Pos = max1Pos + 1;
        if(max2Pos >= arr.length){
            max2Pos = 0;
        } ~ CACH 1: neu nhu max1 o vi tri cuoi cung cua array => max2Pos auto = 0 */

        int second = arr[(max1Pos + 1) % arr.length]; 
        /*CACH 2: Boi vi max2 phai bat dau bang 1 so ngau nhien trong array va su dung max1Pos + 1
        co the gay ra loi out of range => bang cach chia lay du voi length array, neu nhu max1Pos nam
        o vi tri cuoi cung cua array => se chia het cho length array va auto = 0, neu khong thi
        ket qua van se la max1Pos + 1*/
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
        int[] arr = {-1, 0, -7, -3, 11};
        System.out.println("the greatest sum is " + greatestSum(arr));
    }
}