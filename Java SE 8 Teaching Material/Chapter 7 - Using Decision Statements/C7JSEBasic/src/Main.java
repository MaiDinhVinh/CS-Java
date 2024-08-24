public class Main {
    public static void main(String[] args) {
        //Section 7.1.1 snippet 1
        /*int i = 0;
        if (i == 0) System.out.println("hello world");*/

        //Section 7.1.1 snippet 2
        /*int i = 0;
        if(i == 0){
            i = 2;
            System.out.println("hello world" + i);
        }*/

        //Section 7.1.1 snippet 3
        /*int a = 1;
        if (a == 1) System.out.println("hello world");
        else System.out.println("condition is not met");*/

        //section 7.1.1 snippet 4
        /*
        int a = 1;
        if(a == 1){
            a = 2;
            System.out.println("hello world");
        }
        else System.out.println("hello world 2");*/

        //section 7.1.1 snippet 5
        /*int a = 1;
        if(a == 1) System.out.println("hello world");
        else{
            a = 2;
            System.out.println("hello world 2");
        }*/

        //section 7.1.1 snippet 6
        /*boolean flag = true;
        if(flag); //does nothing, but valid
        if(flag); else; //does nothing, but valid
        if(flag);else System.out.println(true); //does nothing because flag is true
        if(flag) System.out.println(true); else; //prints true*/

        //snippet 7
        /*boolean flag = true;
        if( flag )
        else System.out.println("false"); //compilation error*/

        //snippet 8
        /*boolean flag = false;
        if( flag ) {
        }
        else System.out.println("false");*/

        //snippet 9
        /*boolean flag = false;
        if( flag ) ; else System.out.println("false");*/

        //snippet 10
        /*boolean flag = false;
        if( !flag ) {
            System.out.println("false");
        }*/

        //snippet 11
        /*boolean flag = false;
        if(flag)
            System.out.println("false");
        else System.out.println("true");
        {
            System.out.println("false");
        }*/

        //snippet 12
        /*boolean flag = false;
        if(flag)
            System.out.println("false");
        else
            System.out.println("true");
        {
            System.out.println("false");
        }*/

        //snippet 13
        /*boolean flag = false;
        int i = 0;
        if(flag)
            i = i +1;
        System.out.println("true");
        else
        i = i + 2;
        System.out.println("false");*/

        //snippet 14
        /*boolean flag = false;
        int i = 0;
        if(flag) i = i +1;
        System.out.println("true");
        else i = i + 2;
        System.out.println("false");*/

        //snippet 15
        /*boolean flag = true;
        if(flag)
            System.out.println("true");
        {
            System.out.println("false");
        }*/

        //snippet 16
        /*int value = 3;
        if(value == 0)
            if(value == 1) System.out.println("b");
            //this if statement in books has the same indentation as the first if statement
        else System.out.println("c");*/

        //snippet 17
        /*int value = 3;
        if(value == 0) {
            if(value == 1) System.out.println("b");
        }
        else System.out.println("c");*/

        //snippet 18
        /*int value = 3;
        if(value == 0) {
            if(value == 1)
                System.out.println("b");
            else
                System.out.println("c");
        }*/

        //snippet 19
        /*int value = 3;
        if(value == 0)
            if(value == 1)
                System.out.println("b");
            else
                System.out.println("c");
        else
            System.out.println("d");*/

        //snippet 20
        /*int value = 3;
        if(value == 0){
            if(value == 1)
                System.out.println("b");
            else
                System.out.println("c");
        }
        else System.out.println("d");*/

        //snippet 21
        /*boolean flag = false;
        if(flag = true){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }*/

        //snippet 22
        /*String data = null;
        if( (data = readData()) != null ) //assuming that readData() returns a String
        {
            //do something
        }*/

        //snippet 23
        /*int x = 0;
        if(x++ > 0){ //line 2
            x--; //line 3
        }
        if (++x == 2){ //line 6
            x++; //line 7
        }
        System.out.println(x); //print 3*/

        //snippet 24
        /*boolean sweet = false;
        int calories = sweet ? 200 : 100; //assigns 100 to calories
        boolean sweetflag = (calories == 100 ? false : true); //assigns false to sweetflag
        boolean hardcoded = false;
        //assuming getRateFromDB() method returns a double
        double rate = hardcoded ? 10.0 : getRateFromDB(); //invokes method getRateFromDB
        String value = sweetflag ? "Sweetened" : "Unsweetened";
        Object obj = sweetflag ? "Sweetened" : new Object();*/

        
    }
}
