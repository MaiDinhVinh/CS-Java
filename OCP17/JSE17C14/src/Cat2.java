import java.io.Serializable;

public class Cat2 implements Serializable {
    private Tail2 tail = new Tail2();
}
class Tail2 implements Serializable {
    private Fur2 fur = new Fur2();
}
class Fur2 implements Serializable{}