import java.util.ArrayList;
import java.util.List;

public class Mammal {
    public List<CharSequence> play() {
        return null;
    }
    public CharSequence sleep() {
        return null;
    }
}
class Monkey extends Mammal {
    public ArrayList<CharSequence> play() {
        return null;
    }
}
class Goat extends Mammal {
//    public List<String> play() { ... }
    public String sleep() {
        return null;
    }
}