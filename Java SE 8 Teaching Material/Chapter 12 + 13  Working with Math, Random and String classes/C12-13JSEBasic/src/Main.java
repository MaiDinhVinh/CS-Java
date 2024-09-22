

class Account{
    String acctNo;
    Account(String acctNo){
        this.acctNo = acctNo;
    }

    public String toStringObject(){
        return super.toString();
    }

    @Override
    //what should we add here ?
    public String toString(){
        return "Account["+acctNo+"]";
    }
}
public class Main{
    public static void main(String[] args) {
        //snippet 1
        /*double d = Math.abs(-1.1);
        float f = Math.abs(-1.1f);
        System.out.println(d);
        System.out.println(f);*/

        //snippet 2
        /*double d = Math.ceil(1.1);
        double e = Math.ceil(-1.1);*/

        //snippet 3
        /*double d = Math.floor(1.1);
        double e = Math.floor(-1.1);*/

        //snippet 4
        /*long d1 = Math.round(1.1); //assigns 1 to d
        long d2 = Math.round(1.5); //assigns 2 to d
        long d3 = Math.round(-1.1); //assigns -1 to d
        long d4 = Math.round(-1.6); //assigns -1 to d
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);*/

        //snippet 5
        /*double d = Math.random();
        int i = (int) (Math.random()*10); // 0,1,2,3,4,5,6,7,8,9
        long l = Math.round(Math.random()*10); // 0,1,2,3,4,5,6,7,8,9,10*/

        //snippet 6
        /*java.util.Random r = new java.util.Random();
        int i = r.nextInt();
        System.out.println(i);
        double d = r.nextDouble();
        System.out.println(d);*/

        //snippet 7
        /*java.util.Random r1 = new java.util.Random(10);
        java.util.Random r2 = new java.util.Random(10);
        System.out.println(r1.nextInt());
        System.out.println(r2.nextInt());*/

        //snippet 8
        /*java.util.Random r = new java.util.Random();
        int i = r.nextInt();
        r.setSeed(10000);
        i = r.nextInt();
        System.out.println(i);*/

        //snippet 9
        /*String s1 = "hello ";
        String s12 = s1 + " world";
        //explain this method, what happen when each operands aren't string ?*/

        //snippet 10
        /*String s1 = "hello ";
        String s11 = s1 + 1;
        String s12 = 1 + " hello";
        String s2 = "" + true;
        double d = 0.0;
        String s3 = "-"+d +"-";
        Object o = null;
        String s4 = "hello "+o;*/

        //snippet 11
        /*String x = true + 1;
        Object obj = "string";
        String y = obj + obj;*/

        //snippet 12 - check Account class
        /*Account a = new Account("A1234");
        String s = "Printing account - "+a;
        System.out.println(s);
        String s2 = "Printing account - "+a.toStringObject();
        System.out.println(s2);*/

        //snippet 13
        /*String s = "1";
        s += 2;
        System.out.println(s); */

        //snippet 14
       /* int x = 1;
        x += "2";*/

        //snippet 15
        /*Object m = 1;
        System.out.println(m instanceof Integer);
        System.out.println(m instanceof String);
        m += "2";
        System.out.println(m instanceof Integer);
        System.out.println(m instanceof String);
        System.out.println(m);*/

        //snippet 16
        /*Object m = "Hello ";
        m += 1;
        System.out.println(m);*/

        //snippet 17
        /*String s = "first line
        second line";*/

        //snippet 18
        /*String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);
        String str3 = "hell"+"o";
        System.out.println(str1 == str3);
        String str4 = new String("hello"); //this code is special, why ?
        System.out.println(str2 == str4);
        String str5 = "world";
        String str6 = str2+str5;
        String str7 = str2+str5;
        System.out.println(str6 == str7);*/

        //snippet 19
        /*String s1 = "12";
        s1 = s1+"34";
        System.out.println(s1);*/

        //snippet 20
        /*String s1 = "ab";
        s1.concat("cd");
        System.out.println(s1);
        s1.toUpperCase();
        System.out.println(s1);*/

        //snippet 21
        /*System.out.println("0123".indexOf('2'));
        System.out.println("Hi, How are you?".indexOf("are"));
        System.out.println("/user/ceo/MyClass.java".indexOf('/'));
        System.out.println("/user/ceo/MyClass.java".lastIndexOf("/"));
        System.out.println("/user/ceo/MyClass.java".lastIndexOf(".class"));*/

        //snippet 22
        /*System.out.println(" 123 ".trim());*/

        //snippet 23
        /*String s1 = "aaa"; //size of this string is 3
        System.out.println(s1.substring(0,3) == s1); //prints true because the resulting substring is the same as the original string
        System.out.println(s1.substring(0) == s1); //prints true because the resulting substring is the same as the original string
        System.out.println(s1.replace('b', 'c') == s1); //nothing is replaced because there is no b in the string*/

        //snippet 24
        /*String str = " hello ";
        str = str.concat("world ").trim().concat("!").toUpperCase();
        System.out.println(str);*/

        //snippet 25
        /*String str = "hello";
        System.out.println(str == "hello");*/

        //snippet 26 - check Main2
        //snippet 27
        /*System.out.println(new String("1234").equals("1234"));*/

        //snippet 28
        /*String a = "alice";
        String b = "bob";
        String c = "charlie";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(c));
        System.out.println(a.compareTo(new String("alice")));*/

        //snippet 29
        /*String name = "bob";
        int acctNo = 1234;
        int points = 100;
        System.out.format("Hello, %s!%nThe point balance in your account %s is %d.%n",
                name, acctNo, points); //4
        System.out.format("Great Job!\n", name); //5
        System.out.format("These points are worth %d USD.%nThank you!", points*10.0); //6*/

        


    }
}