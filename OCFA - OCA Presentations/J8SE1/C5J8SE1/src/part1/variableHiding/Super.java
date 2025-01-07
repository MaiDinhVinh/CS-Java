package part1.variableHiding;

public class Super {
    public String str = "Super";

    public static void main(String[] args) {
        Super sup = new Super();
        System.out.println(sup.str);

        Sub sb = new Sub();
        System.out.println(sb.str);
    }
}
