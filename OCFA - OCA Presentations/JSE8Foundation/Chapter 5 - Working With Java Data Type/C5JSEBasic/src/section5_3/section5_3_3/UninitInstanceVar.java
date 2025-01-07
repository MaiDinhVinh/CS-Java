package section5_3.section5_3_3;

public class UninitInstanceVar {
    int x;
    double y;
    boolean z;
    String str;

    public static void main(String[] args) {
        UninitInstanceVar demo1 = new UninitInstanceVar();
        System.out.println(demo1.x);
        System.out.println(demo1.y);
        System.out.println(demo1.z);
        System.out.println(demo1.str);
    }
}
