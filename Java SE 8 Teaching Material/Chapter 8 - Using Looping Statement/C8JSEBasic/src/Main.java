import java.util.*;

public class Main {
    public static void doIt(int h){
        int x = 1;
        LOOP1 : do{
            LOOP2 : for(int y = 1; y < h; y++ ) {
                if( y == x ) continue;
                if( x*x + y*y == h*h){
                    System.out.println("Found "+x+" "+y);
                    break LOOP1;
                }
            }
            x++;
        }while(x<h);
    }
    public static void main(String[] args) {
        //snippet 1
        /*while (//boolean_expression) {
            //statement(s);
        }*/

        //snippet 2
        /*int i = 4;
        while(i>0){
            i--;
            System.out.println("i is "+i);
        }
        System.out.println("Value of i after the loop is "+i);*/

        //snippet 3
        /*while(//boolean_expression) //statement; */

        //snippet 4
        /*int i = 4;
        //while(i-->0) System.out.println("i is "+i); //no curly braces
        while(i>0) System.out.println("i is "+i--);
        System.out.println("Value of i after the loop is "+i);*/

        //snippet 5
        /*int[] myArrayOfInts = //code to fetch the data
        int i = 0; //control variable
        while(i<myArrayOfInts.length){
        //do something with myArrayOfInts[i]
            i++; //increment i so that the control condition will evaluate to false after the last element is processed
        }*/

        //snippet 6
        /*while(true){
            System.out.println("keep printing this line forever!");
        }*/

        //snippet 7
        /*int i = 0;
        while(i>0){ // the condition is false to begin with
            System.out.println("hello"); //this will never be printed
            i++;
        }*/

        //snippet 8
        /*do {
            //statement(s);
        }while(//boolean_expression);*/

        //snippet 9
        /*int i = 4;
        do {
            System.out.println("i is "+i);
        } while(i-->0);
        System.out.println("Loop finished. i is "+i);*/

        //snippet 10
        /*int i = 4;
        do
            System.out.println("i is "+i);
        while(i-->0);
        System.out.println("Loop finished. i is "+i);*/

        //snippet 11
        /*Iterator<Account> acctIterator = accounts.iterator();
        while(acctIterator.hasNext()){
            //no need to enter the loop body if accounts collection is empty
            Account acct = acctIterator.next();
            //do something with acct
        }*/

        //snippet 12
        /*Iterator<Account> acctIterator = accounts.iterator();
        do {
            Account acct = acctIterator.next(); //will throw an exception
            //do something with acct
        }while(acctIterator.hasNext());*/

        //snippet 13
        /*Iterator<Account> acctIterator = accounts.iterator();
        if(acctIterator.hasNext()) {
            //no need to enter the if body if accounts collection is empty
            do{
                Account acct = acctIterator.next();
                //do something with acct
            }while(acctIterator.hasNext());
        }*/

        //snippet 14
        /*int i = 4;
        while(i>0){
            System.out.println("i is "+i);
            i--;
        }
        System.out.println("Value of i after the loop is "+i);*/

        //snippet 15
        /*for(int i = 4; i>0; i--){
            System.out.println("i is "+i);
        }*/
        //System.out.println("Value of i after the loop is "+i);

        //snippet 16
        /*for( //optional initialization section ; //optional condition section ; optional updation section ) {
            //statement(s);
        }*/

        //snippet 17
        /*for( //optional initialization section ; //optional condition section ; //optional updation section ) ;
        //no body at all*/

        //snippet 18
        /*for( //optional initialization section ; //optional condition section ; //optional updation section )
            //single_statement;*/

        //snippet 19
        /*for(int i = 3; i>0; i--){
            System.out.println("i is "+i);
        }*/


        //snippet 20
        /*int i = 0;
        for(i = 5; i<10; i++); //assignment
        Object obj;
        for(obj = "hello"; i<10; i++); //assignment*/

        //snippet 21
        /*int i = 0;
        int k = 0;
        Object obj = "";
        for(i = 0, k = 7, obj = "hello";i<10; i++); //multiple assignments*/

        //snippet 22
        /*int i = 0;
        int k = 0;
        for(++k; i<10; i++); //pre-increment*/

        //snippet 23
        /*int i = 0;
        for(new ArrayList(); i<10; i++); //instance creation*/

        //snippet 24
        /*int i = 0;
        for(System.out.println("starting the loop now"); i<10; i++); //method call*/

        //snippet 25
        /*int i = 0;
        int k = 0;
        for(k++, i--, new String();i<10; i++); //multiple expressions*/

        //snippet 26
        /*for(int i = 5; i<10; i++); //single variable declaration
        for(int i = 5, k = 7; i<10; i++); //multiple variable declaration*/

        //snippet 27
        /*for(int i = 5, String str = ""; i<10; i++); //invalid*/

        //snippet 28
        /*int i = 0;
        for(int i = 5; i<10; i++); //invalid because i is already declared*/

        //snippet 29
        /*for(int i = 5; i<10; i++){
            System.out.println("i is "+i);
        }
        System.out.println("Final value of i is "+i); //this line will not compile */

        //snippet 30
        /*int i = 0;
        for(;i<10; i++); //post-increment
        for(;i<10; i = i + 2); //increment by two
        for(;i<10; i = someRef.getValue()); //assignment
        for(Object obj = new Object(); obj != null; ) { //empty updation section
            System.out.println(obj);
            obj = null;
        }
        for(int i = 0; i<10; callSomeMethod() ); //method call*/

        //snippet 31
        /*for( ; ; ) ;*/

        //snippet 32
        /*boolean b = false;
        for(int i=0 ; b = !b ; ) {
            System.out.println(i++);
        }*/

        //snippet 33
        /*String[] values = { "a", "bb", "ccc" };
        for(int i = 0; i<values.length; i++){
            System.out.println(values[i]); //do something with each value
        }*/

        //snippet 34
        /*Set s = new HashSet();
        s.add("a");
        s.add("bb");
        s.add("ccc");
        Iterator it = s.iterator();
        while( it.hasNext() ){
            Object value = it.next();
            System.out.println(value); //do something with each value
        }*/

        //snippet 35
        /*String[] values = { "a", "bb", "ccc" };
        for(String value : values){
            System.out.println(value); //do something with each value
        }*/

        //snippet 36
        /*Set s = new HashSet();
        s.add("a");
        s.add("bb");
        s.add("ccc");
        for(Object value : s) {
            System.out.println(value); //do something with each value
        } */

        //snippet 37
        /*for( //Type //variableName : //array_or_Iterable ){
            //statement(s);
        }*/

        //snippet 38
        /*for( //Type //variableName : //array_or_Iterable ) //statement;*/

        //snippet 39
        /*List names = //get names from somewhere
        for(Object obj : names){
            String name = (String) obj;
            System.out.println(name.toUpperCase());
        }*/

        //snippet 40
        /*List<String> names = //get names from somewhere
        for(String name : names){
            System.out.println(name.toUpperCase());
        }*/

        //snippet 41
        /*List<String> names = //get names from somewhere
        int i = 0;
        for(String name : names){
            i++;
            System.out.println(i+" : "+name.toUpperCase());
        }
        System.out.println("Total number of names is "+i);*/

        //snippet 42
        /*String[] names = { "ally", "bob", "charlie", "david" };
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
            if("bob".equals(names[i])){
                System.out.println("Found bob at "+i);
                break;
            }
        }*/

        //snippet 43
        /*String[] names = { "ally", "bob", "charlie", "david" };
        for(String name : names){ //using a for-each loop this time
            if("bob".equals(name)){
                System.out.println("Ignoring bob!");
                continue;
            }
            System.out.println("Hi "+name+"!");
        }*/

        //snippet 44
        /*String[] names = { "ally", "bob", "charlie", "david" };
        for(int i=0; i<names.length; i++){
            continue; //or break;
            System.out.println("Hi "+names[i]+"!"); //This line will never get to execute
        }*/

        //snippet 45
        /*int[][] values = { {1, 2, 3} , { 2, 3}, {2 }, { 4, 5, 6, 7 } };
        int sum = 0;
        for(int i = 0; i<values.length; i++) {
            for(int j=0; j<values[i].length; i++) {
                sum = sum + values[i][j];
            }
        }
        System.out.println("Sum is "+sum);*/

        //snippet 46
        /*String[][] groups = { { "ally", "bob", "charlie" } , { "bob", "alice", "boone"}, {
                "chad", "dave", "elliot" } };
        for(int i = 0; i<groups.length; i++){
            for(String name : groups[i]){
                System.out.println("Checking "+name);
                if("bob".equals(name)) {
                    System.out.println("Found bob in Group "+i);
                    break;
                }
            }
        }*/

        //snippet 47
        /*String[][] groups = { { "ally", "bob", "charlie" } ,
                { "bob", "alice", "boone"},
                { "chad", "dave", "elliot" } };
        MY_OUTER_LOOP: for(int i = 0; i<groups.length; i++){
            for(String name : groups[i]){
                System.out.println("Checking "+name);
                if("bob".equals(name)) {
                    System.out.println("Found bob in Group "+i);
                    break MY_OUTER_LOOP;
                }
            }
        }*/

        //snippet 48
        /*SINGLE_STMT: System.out.println("hello");

        HELLO: if(a==b) callM1(); else callM2();

        COME_HERE : while(i=>0) {
            System.out.println("hello");
        }

        SOME_LABEL: { //ok, because this is a block of statements
            System.out.println("hello1");
            System.out.println("hello2");
        }*/

        //snippet 49
        /*BAD1 : int x = 0; //can't apply a label to declarations

        BAD2 : public void m1() { } //can't apply a label to methods*/

        //snippet 50
        /*LABEL_1 : for(String s : array) System.out.println(s); //usage of LABEL_1 is valid here
        for(int i = 0; i<10; i++){
            if(i ==2) continue LABEL_1;
            //usage of continue is invalid because LABEL_1 does not appear on a loop statement that contains this continue.
        }*/

        //snippet 51
        /*for(int i = 0; i<10; i++){
            LABEL_1 : if(i ==2) System.out.println(2); //usage of LABEL_1 is valid here
            for(int j = 0; j<10; j++){
                if(i ==2) continue LABEL_1;
                //usage of continue is invalid because LABEL_1 does not appear on a loop statement that contains this continue.
            }
        }*/

        //snippet 52
        /*LABEL_1 : for(int i = 0; i<10; i++){
            if(i ==2) System.out.println(2);
            for(int j = 0; j<10; j++){
                if(i ==2) continue LABEL_1;
                System.out.println(j);
                //usage of continue is valid because it refers to an outer loop
            }
        }*/

        //snippet 53
        /*MYLABEL: {
            System.out.print("1 ");
            if( args != null) break MYLABEL;
            System.out.print("2 ");
        }
        System.out.print("3 ");*/

        //snippet 54 (scroll to the top of the code !)

        //snippet 55
        /*while( booleanExpression ){
        }

        for( ; booleanExpression ; ){
        }*/

        //snippet 56 (the book haven't mentioned about this)
        /*while(true);*/

        //snippet 57
        /*for( Object obj : someIterable){
        }
        for( Iterator it = someIterable.iterator() ; it.hasNext() ; ){
            Object obj = it.next();
        }*/
    }
}
