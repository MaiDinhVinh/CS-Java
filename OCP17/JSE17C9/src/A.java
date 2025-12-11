import java.util.ArrayList;
import java.util.List;

public class A {
}
class B extends A {}
class C extends B {}
class Test2{
    public static void main(String[] args) {
        //for snippet 81 - which code doesnt compile

//        List<?> list1 = new ArrayList<A>();
//        List<? extends A> list2 = new ArrayList<A>();
//        List<? super A> list3 = new ArrayList<A>();

        //for snippet 82 - which code doesnt compile

//        List<? extends B> list4 = new ArrayList<A>();
//        List<? super B> list5 = new ArrayList<A>();
//        List<?> list6 = new ArrayList<? extends A>();

    }
}