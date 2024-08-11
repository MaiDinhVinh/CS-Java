public class lab5e3 {
  public static void main(String[] args) {
    int[] arr = {11, 3, 7, 0, 12};
    //tim tong lon nhat cua 2 pt ~ tim 2 pt lon nhat
    int max1 = arr[0], max1Pos = 0, min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max1) {
        max1 = arr[i];
        max1Pos = i;
      }
      if (arr[i] < min){
        min = arr[i];
      }
    } //9
    
    
    // int max2 = min;
    // int max2Pos = max1Pos + 1;
    // if (max2Pos >= arr.length){
    //   max2Pos = 0;
    // }
    // int max2 = arr[max2Pos];
    int max2 = arr[(max1Pos + 1) % arr.length];
    //tim max2 ~ tim so lon nhat trong day con lai, khong bao gom max1
    for (int i = 0; i < arr.length; i++) {
      if (i == max1Pos){
        continue;
      }
      if (max2 < arr[i]){
        max2 = arr[i];
      }
    }
    System.out.println("Greatest sum = " + (max1 + max2));

  }
}

