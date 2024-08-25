public class Main {
    public static void main(String[] args) {
        //Section 7.1.1 snippet 1
        /*int i = 0;
        if (i == 0)
            System.out.println("hello world");*/

        //Section 7.1.1 snippet 2
        /*int i = 0;
        if(i == 0)
        {
            i = 2;
            System.out.println("hello world" + i);
        }*/

        //Section 7.1.1 snippet 3
        /*int a = 1;
        if (a == 1) System.out.println("hello world");
        else System.out.println("condition is not met");*/

        //section 7.1.1 snippet 4
        /*int a = 1;
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
        boolean flag = false;
        if(flag = true){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

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

        //snippet 25
        /*boolean flag = true;
        if(flag) System.out.println("true");
        else System.out.println("false");*/

        //snippet 26
        /*boolean flag = true;
        flag ? System.out.println("true") : System.out.println("false");*/

        //snippet 27
        /*boolean flag = true;
        int x = flag ? System.out.println("true")
                : System.out.println("false");*/

        //snippet 28
        /*int a = 1, b = 2;
        boolean flag = a == b? true : false; //ternary expression that returns a boolean*/

        //snippet 29
        /*int a = 1, b = 2;
        double d = a == b? 5 : 10.0;*/

        //snippet 30
        /*int a = 1, b = 2;
        int d = a == b ? 5 : 10.0;*/

        //snippet 31
        /*int a = 1, b = 2;
        int d = (int)(a == b ? 5 : 10.0);*/

        //snippet 32
        /*int a = 1, b = 2;
        Object obj = a == b? 5 : "hello";*/

        //snippet 33
        /*int a = 1;
        int b = 2;
        Double d = 10.0;
        Byte by = 1;
        Number n = a == b? d : by;*/

        //snippet 34
        /*int a = 1;
        int b = 2;
        int value = a == b? 10 : "hello"; //1*/

        //snippet 35
        /*int a = 1;
        int b = 2;
        System.out.println(a == b? 10 : "hello"); //2*/

        //snippet 36
        /*int i = args.length;
        switch(i) { //switch block starts here
            case 0 : System.out.println("No argument");
                break;
            case 1 : System.out.println("Only one argument");
                break;
            case 2 : System.out.println("Two arguments");
                break;
            default : System.out.println("Too many arguments!");
                break;
        } //switch block ends here
        System.out.println("All done.");*/

        //snippet 37
        /*int i = args.length;
        if(i == 0) {
            System.out.println("No argument");
        } else if (i == 1) {
            System.out.println("Only one argument");
        } else if (i == 2) {
            System.out.println("Two arguments");
        } else {
            System.out.println("Too many arguments!");
        }
        System.out.println("All done.");*/

        //snippet 38
        /*switch(args[0]){
            case "1" : System.out.println("one"); //valid because "1" is a compile time constant
            case "1"+"2" : System.out.println("one"); //valid because "1"+"2" is a compile time
                //constant
            case args[1] : System.out.println("same args"); //will not compile because args[1]
                //is not a compile time constant
            case "abc".toUpperCase() : System.out.println("ABC"); //will not compile because
                //"abc".toUpperCase() is not a compile time constant
        }*/

        //snippet 39
        /*int i = 0;
        switch(i){
            default : System.out.println("This will always be printed");
        }*/

        //snippet 40
        /*byte b = 10;
        switch(b){ //type of the switch expression here is byte
            case 1000 : //1000 is too large to fit into a byte
                System.out.println("hello!");
        }*/

        //snippet 41
        /*byte b = 10;
        switch(b+1){ //type of the switch expression here is now int due to numeric promotion
            case 1000 : //1000 can fit into an int
                System.out.println("hello!");
        }*/

        //snippet 42
        /*switch(args.length) { //switch block starts here
            case 0 : System.out.println("No argument");
                        //break;
            case 1 : System.out.println("Only one argument");
                        //break;
            case 2 : System.out.println("Two arguments");
                        //break;
            default : System.out.println("Too many arguments!");
                        //break;
        } //switch block ends here
        System.out.println("All done.");*/

        //snippet 43
        /*char ch = 0;
        int noOfVowels = 0;
        while( (ch = readCharFromStream()) > 0) {
            switch(ch) {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                    noOfVowels++;
                default : logCharToWhatever(ch);
            }
        }
        System.out.println("Number of vowels received "+noOfVowels);*/

        //snippet 44
        /*int i = 0;
        switch(args[0]) {default : i = i + 3;
            case "2" : i = i + 2;
            case "0" : break;
            case "1" : i = i + 1;
        }
        System.out.println("i is "+i);*/

    }
}
