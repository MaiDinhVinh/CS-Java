package part1.variableHiding;

public class Super4 {
    public String str = "Super4";

    public void getStr(){
        System.out.println(this.str);
    }

    public static void main(String[] args) {
        /*Sub4 su4 = new Sub4();
        su4.getStr();*/

        /*Super4 sup4 = new Sub4();
        sup4.getStr();*/
    }
}
