package part1.overridingVShiding;

public class Sub extends Super{
    @Override
    public void method1(){
        System.out.println("From Sub");
    }

    public static void main(String[] args) {
        Sub sb = new Sub();
        sb.method1();

        Super sup = new Sub();
        sup.method1();
    }
}
