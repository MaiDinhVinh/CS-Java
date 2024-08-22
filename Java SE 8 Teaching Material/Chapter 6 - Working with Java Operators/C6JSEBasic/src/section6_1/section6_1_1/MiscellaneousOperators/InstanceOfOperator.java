package section6_1.section6_1_1.MiscellaneousOperators;

/**
 * In this code, we can see that there are 2 classes
 * {@code InstanceOfOperator} and {@code Test}. The class
 * {@code InstanceOfOperator} inherits the class {@code Test} =>
 * An instance from class {@code InstanceOfOperator} will be
 * considered as a "subtype" from class {@code Test} =>
 * return {@code true}*/
public class InstanceOfOperator extends Test{
    public static void main(String[] args) {
        InstanceOfOperator demo1 = new InstanceOfOperator();
        Test demo2 = new Test();
        System.out.println(demo1 instanceof Test);
    }
}

//SUBCLASS FOR TESTING
class Test{
    private int a;
}
