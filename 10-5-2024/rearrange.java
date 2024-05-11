public class rearrange {
  public static String rearrange(String str){
    String vowels = "aeiou";
    boolean sWC = true;
    if (vowels.contains(str.substring(0,1))){
      sWC = false;
    } 

    String con = "";
    String vow = "";
    for (int i = 0; i < str.length(); i++) {
      String c = str.substring(i, i + 1);
      if (vowels.contains(c)){
        vow += c;
      } else {
        con += c;
      }
    }

    if (sWC){
      return con + vow;
    } else {
      return vow + con;
    }
  }

  public static void main(String[] args) {
    System.out.println(rearrange("programmer"));
    
  }
}
