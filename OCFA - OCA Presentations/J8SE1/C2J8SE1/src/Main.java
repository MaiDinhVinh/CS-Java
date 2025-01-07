import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        //snippet 1
        /*//Explain why these code are non-compilable ?
        int x = 1.0;
        short y = 1921222;
        int z = 9f;
        long t = 192301398193810323;

        byte a = 10;*/



        //snippet 2
        /*int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);*/

        //snippet 3
        /*int x = 0;
        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(x + " ");
        }*/

        //snippet 4
        /*int x = 0;
        long y = 10;
        for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(x + " ");
        }*/

        //snippet 5
        /*for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
            System.out.print(x + " ");
        }*/

        /*ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        for(final Object a: arr){
            System.out.println(a);
        }*/

        int a = 10;
        int b = 3;
        OUTER: if(a == 10) {
            INNER: if(b == 3){
                break OUTER;
            }
            System.out.println("hello world");
        }

    }
}