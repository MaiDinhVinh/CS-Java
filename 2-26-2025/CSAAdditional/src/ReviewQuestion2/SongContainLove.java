package ReviewQuestion2;

public class SongContainLove {
    public static int findCount(String[][] arr, String target){
        int count = 0;
        for(String[] a: arr){
            for(String str: a){
                if(str.contains(target)) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[][] songTitles = {
                {"We Are the Champions", "You Shook Me All Night Long", "We Found Love"},
                {"Bleeding Love", "Stairway to Heaven", "Won't Get Fooled Again"},
                {"I'd Do Anything for Love", "Stupid Crazy Love", "Love in This Club"},
                {"Since U Been Gone", "One More Time", "Walk This Way"}
        };
        System.out.println(findCount(songTitles, "Love"));
    }
}
