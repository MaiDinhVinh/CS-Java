package part1.variableHiding;

public class Sub3 extends Super3{
    public String str = "Sub3";

    @Override
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
