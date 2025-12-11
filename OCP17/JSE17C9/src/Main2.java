import java.util.ArrayList;
import java.util.List;

public class Main2 {
    static class Sparrow extends Bird { }
    static class Bird { }

    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<Bird>();
//        birds.add(new Sparrow());
//        birds.add(new Bird());
    }
}
