package part1.variableHiding;

public class Sub2 extends Super2{
    public String str = "Sub2";
    public static String staticStr = "static Sub2";

    public static void main(String[] args) {
        /*Super2 sup2 = new Sub2();
        System.out.println(sup2.str);
        System.out.println(sup2.staticStr);*/

        /*System.out.println(Super2.staticStr);*/
    }
}
