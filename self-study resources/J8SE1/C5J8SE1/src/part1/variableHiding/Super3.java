package part1.variableHiding;

public class Super3 {
    public String str = "Super3";

    public void getStr(){
        System.out.println(this.str);
    }

    public static void main(String[] args) {
        Sub3 su3 = new Sub3();
        su3.getStr();

        Super3 sup3 = new Sub3();
        sup3.getStr();
    }
}
