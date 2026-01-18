import java.io.Serializable;

public class Cat implements Serializable {
    private Tail tail = new Tail();
}
class Tail implements Serializable {
    private Fur fur = new Fur();
}
class Fur {}