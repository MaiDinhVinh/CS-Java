public class palindrome {
  public static void main(String[] args) {
    String n = "noonk";
    boolean res = true;
    
    //no lib
    // int i = 0, j = n.length() - 1;
    // while (i < j){
    //   if (n.charAt(i) != n.charAt(j)){
    //     res = false;
    //     break;
    //   } else {
    //     i++;
    //     j--;
    //   }
    // }

    //reverse String
    String nLower = n.toLowerCase();
    String rev = "";
    for (int i = n.length() -1 ; i >= 0; i--) {
      rev += nLower.charAt(i);
    }
    System.out.println(nLower.equals(rev));
  }
}
