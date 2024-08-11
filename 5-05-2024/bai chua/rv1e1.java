public class rv1e1 {
  public static void main(String[] args) {
    System.out.println("hello");
    int amt = 1234;
    int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    int[] count_note = new int[notes.length];

    int i = 0;
    while (amt > 0){
      if (amt >= notes[i]){
        count_note[i] = count_note[i] + 1;
        amt -= notes[i];
      } else {
        i++;
      }
    }

    for (int j = 0; j < count_note.length; j++) {
      if (count_note[j] !=0){
        System.out.println(count_note[j] + "of " + notes[j] + "k;");
      }
    }
  }
}
