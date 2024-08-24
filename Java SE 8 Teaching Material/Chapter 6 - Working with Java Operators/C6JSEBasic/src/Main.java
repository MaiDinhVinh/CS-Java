public class Main {
    public static void main(String[] args) {
        /* Section 6.1.3 snippet 1
        int i = 1, post = 0, pre = 0;
        post = i++;
        System.out.println(i+", "+post); //prints 2, 1
        i = 1; //resetting to i back to 1
        pre = ++i;
        System.out.println(i+", "+pre); //prints 2, 2
        */

        /* Section 6.1.3 snippet 2
        int i = 1;
        i = i++;
        System.out.println(i); //print 1
        * */

        /* Section 6.1.3 snippet 3
        * int a = 2;
          int b = 5;
          int c = a * (a++ - --b) * a * b;
          System.out.println(a+" "+b+" "+c); //print out 3 4 -48
        *  */

        /* Section 6.1.3 snippet 4
        int a = 2;
        int b = 5;
        int c = c = b * a * (a++ - --b) * a * b; //print out -240
        System.out.println(c);
         */

        /* Section 6.1.3 snippet 5
        Integer a = 1;
        Integer b = a;
        a++;
        System.out.println(a == b); //print out false*/

        /* Section 6.1.4 snippet 6
        String s1 = "hello" + " world"; //both the operands are Strings
        System.out.println(s1); //prints "hello world"
        String s2 = "hello " + 1; //first operand is a String and second is an int
        System.out.println(s2); //prints "hello 1"
        Double d = 1.0;
        String s = "2";
        String s3 = d + s; //first operand is a Double and second is a String
        System.out.println(s3); //prints "1.02"*/

        /* Section 6.1.4 snippet 7
        Object obj = new Object();
        String str = obj.toString();
        System.out.println( str );
        System.out.println( "hello " + obj );*/

        /* Section 6.1.4 snippet 8
        Object obj = null;
        System.out.println("hello " + obj);*/

        /* Section 6.1.4 code snippet 9
        String str = "2";
        str += 1; //this is the same as str = str + 1;
        System.out.print(str); //prints "21"*/

        /* Section 6.1.4 snippet 10
        Object obj = new Object();
        String str = null;
        str += obj; //same as str = str + tc;
        System.out.print( str );*/

        /* Section 6.1.5 snippet 11
        byte b = 1;
        short s = -b;
        System.out.println(s);*/

        //section 6.1.5 snippet 12
        /*short s1 = 1;
        byte b1 = 1;
        byte b2 = 2;
        short s2 = +s1; //won't compile because the result will be an int
        byte b = s1 + 2; //won't compile because the result will be an int
        b = b1 & b2; //won't compile because the result will be an int
        s2 = s1 << 1; //won't compile because the result will be an int
        s2 = s1 * 1; //won't compile because the result will be an int
        float f = 1.0f; //recall that to write a float literal you have to append it with an f
        or an F
        double d = 1.0;
        int x = f - 1; //won't compile because the result will be a float
        float f2 = f + d; //won't compile because the result will be a double*/

        //Section 6.1.5 snippet 13
        /*short s1 = 1;
        byte b1 = 1;
        byte b2 = 2;
        short s2 = (short) +s1;
        byte b = (byte) (s1 + 2);
        b = (byte) (b1 & b2); //numeric promotion happens for bit-wise operators as well
        s2 = (short) (s1 << 1);
        s2 = (short) (s1 * 1);
        float f = 1.0f; //recall that to write a float literal you have to append it with an for an F
        double d = 1.0;
        int x = (int) (f - 1);
        float f2 = (float) (f + d);*/

        //Section 6.1.6 snippet 14
        /*
        int i = 0;
        byte b = (byte) i + 1;*/

        //section 6.1.6 snippet 15
        /*
        String s1 = "hello";
        int i = 1;
        String s2 = s1 + 1 + i;
        System.out.println(s2); //prints hello11*/
    }
}

//section 6.1.6 snippet 16
/*
class TestClass{
    static boolean a ;
    static boolean b ;
    static boolean c ;
    public static void main(String[] args) {
        boolean bool = (a = true) || (b = true) && (c = true) ;
        System.out.println(a + ", " + b + ", "+ c );
    }
}*/
