import java.util.ArrayList;
import java.util.List;
import static java.lang.Integer.MAX_VALUE;
import static java.util.Arrays.*;

//for snippet 12
/*import static java.util.Arrays;
import static java.util.Arrays.asList;
static import java.util.Arrays.*;*/
public class Main{
    //for snippet 2
    /*static{
        i = 10;
    }
    public static int i = 10;*/

    //for snippet 3
    /*final public static void ExampleMethod(int i){
        System.out.println("hello world");
    }*/

    //for snippet 4
    /*public void walk1() {}
    default void walk2() {}
    void public walk3() {}
    void walk4() {}*/

    //for snippet 5
    /*public void walk1() {}
    public final void walk2() {}
    public static final void walk3() {}
    public final static void walk4() {}
    public modifier void walk5() {}
    public void final walk6() {}
    final public void walk7() {}*/

    //for snippet 6
    /*public void walk1() { }
    public void walk2() { return; }
    public String walk3() { return ""; }
    public String walk4() { }
    public walk5() { }
    String walk6(int a) { if (a == 4) return ""; }*/

    //for snippet 7
    /*public long demo1(){
        int i = 10;
        return i;
    }

    public int demo2(){
        long l = 10L;
        return l;
    }

    public int demo3(){
        Integer i = 10;
        return i;
    }

    public int demo4(){
        Long l = 10L;
        return l;
    }

    public Integer demo5(){
        int i = 10;
        return i;
    }


    //double conversion issue, duplicate question (Q3), can ask later
    public Long demo6(){
        byte b = 10;
        return b;
    }

    public Object demo7(){
        String s = "hello";
        return s;
    }

    public String demo8(){
        Object obj = new Object();
        return obj;
    }*/

    //for snippet 10
    /*private static final ArrayList<String> values = new ArrayList<>();*/

    //for snippet 13
    /*public static void speak(String name) {
        name = "Sparky";
    }*/

    //for snippet 14
    /*public static void speak(StringBuilder s) {
        s.append("Webby");
    }*/

    //for snippet 15
    /*public static int number(int number) {
        number++;
        return number;
    }
    public static String letters(String letters) {
        letters += "d";
        return letters;
    }*/

    //for snippet 16
    /*public void fly(int numMiles) { }
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }*/

    //for snippet 17
    /*public void fly(int numMiles) { }
    public int fly(int numMiles) { }*/

    //for snippet 18
    /*public void fly(int numMiles) { }
    public static void fly(int numMiles) { }*/

    //for snippet 19
    /*public void fly(int numMiles) { }
    public void fly(Integer numMiles) { }*/

    //for snippet 20
    /*public void fly(String s) {
        System.out.print("string ");
    }
    public void fly(Object o) {
        System.out.print("object ");
    }*/

    //for snippet 21
    /*public void fly(int i) {
        System.out.print("int ");
    }
    public void fly(long l) {
        System.out.print("long ");
    }*/

    //for snippet 22
    /*public static void play(Long l) { }
    public static void play(Long... l) { }*/
    public static void main(String[] args) {
        //snippet 1
        /*String s1 = "Hello world";
        String s2 = "Hello ";
        String s3 = " world";
        String s4 = s2 + s3;
        System.out.println(s1 == s4);

        String str1 = "Hello world";
        String str2 = "Hello " + "world";
        System.out.println(str1 == str2);*/

        //snippet 2 - check the code above

        //snippet 3 - check the code above

        //snippet 4 - check the code above

        //snippet 5 - check the code above

        //snippet 6 - check the code above

        //snippet 7 - check the code above

        //snippet 8 - check Main2/3 classes

        //snippet 9 - check Main4 class

        //snippet 10 - also check the code above
        //what is special about this code ?
        /*values.add("hello world");*/

        //snippet 11 - check the import statements too
        /*System.out.println(MAX_VALUE); //explain this
        String[] arr = {"hello"};
        List<String> arrlist = asList(arr);*/ //explain this

        //snippet 12 - check the import statements

        //snippet 13 - check the method too
        /*String name = "Webby";
        speak(name);
        System.out.println(name);*/

        //snippet 14 - check the method too
        /*StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name);*/

        //snippet 15 - check both methods too
        /*int number = 1;
        String letters = "abc";
        number(number);
        letters = letters(letters);
        System.out.println(number + letters);*/

        //snippet 16 - check the method above

        //snippet 17 - check the method above

        //snippet 18 - check the method above

        //snippet 19 - check the method above

        //snippet 20 - also check the method above
        /*Main m = new Main();
        m.fly("test");
        m.fly(56);*/

        //snippet 21 - also check the method above
        /*Main m = new Main();
        m.fly(123);
        m.fly(123L);*/

        //snippet 22 - also check the method above
        /*play(4);
        play(4L);*/

        /////////////////////////////////////////////////////////
        //////////////////END OF FIRST PART//////////////////////
        /////////////////////////////////////////////////////////

        //snippet 23 - check Main 5

        //snippet 24 - check Bunny class

        //snippet 25 - check Main 6

        //snippet 26 - also check Main 6

        //snippet 27 - check Main 7

        //snippet 28 - check Main 8

        //snippet 29 - check Main 9

        //snippet 30 - check Main 10

        //snippet 31 - check Main 11

        //snippet 32 - check Main 12

        //snippet 33 - check Main 13

        //snippet 34 - check Main 14 (class Swan1)

        //snippet 35 - also check Main 14 (class Swan2)

        //snippet 36 - check Main15

        //snippet 37 - check Main 16

        //snippet 38 - check Main 17

        /*Snippet 39 - check:
        * Animals class, CheckTrait interface,
        * CheckIfHopper class, Main18 class*/
    }
}