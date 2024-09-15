class Name{
    String firstName, lastName;
}
public class Main {

    //snippet 1 HERE
    /*void save(){

    } //no parameters
    void saveAccount(Account acct){

    } //takes an Account as a parameter
    void add(int a, int b){

    } //takes two ints as parameters*/

    //snippet 2 HERE
    /*void add(int a, final int b){

    }//b is final*/


    //snippet 3 HERE
    /*public int get2X(int x){
        if(x>0) return 2*x;
    }*/

    //snippet 4 HERE
    /*String getValue(int x){
        if(x > 0) return "good day!";
        else return null; //this is ok
    }*/

    //snippet 5 HERE
    /*void doSomething(){
        System.out.println("hello");
        return void; //invalid
    }*/

    //snippet 6 HERE
    /*void doSomething(){
        System.out.println("hello");
        return; //empty return
    }*/

    //snippet 7 HERE
    /*void doSomething(){
        System.out.println("hello");
        //no return statement at all
    }*/

    //snippet 8 HERE
    /*public int getVal(int x){
        char ch = 'a';
        byte b = 0;
        if(x>0) return ch;
        else return b;
    }*/

    //snippet 9 HERE
    /*public int getVal(){
        return new Short((short)10); //wrapper object will be unboxed into a primitive
        //return new Long(10); //will not compile, Long cannot be converted to int
    }*/

    //snippet 10 HERE
    /*public Integer getVal(){
        byte b = 10;
        return 10; //ok, int 10 will be boxed into an Integer object
        //return b; //will not compile, byte cannot be converted to Integer
    }*/

    //snippet 11 HERE
    /*Object getValue(){
        return "hello";
        //return 10; //This is ok, 10 will be boxed into an Integer object, which is an Object
        //return null; //This is ok too
    }*/

    //snippet 12 HERE
    /*String getValue(){
        return new Object(); // will not compile because an Object is not a String
    }*/

    //snippet 13 HERE
    /*Name getName(){
        Name n = new Name(); //capture two values in a Name object
        n.firstName = "Ann";
        n.lastName = "Rand";
        return n; //return a reference to the Name object
    }*/

    //snippet 14 HERE
    /*String[] getName(){
        return new String[]{"ann", "rand" };
    }*/

    //snippet 15 HERE
    /*void process(int a, String str);
    public void process(int value, String name);
    void process(int a, String str) throws Exception;
    String process(int a, String str);
    private int process(int a, String data);
    static void process(int a, String str);*/

    //snippet 16 - check Main2
    //snippet 17 HERE
    /*void processData(Object obj){ }
    void processData(String str){ }*/

    //snippet 18 HERE
    /*void processData(int value){ }
    void processData(long value){ }*/

    //snippet 19 HERE
    /*void processData(Object obj){ }
    void processData(CharSequence str){ }*/

    //snippet 20 HERE
    /*void processData(int value){ }
    void processData(short value){ } */

    //snippet 21 - check Main3
    //snippet 22 HERE
    /*void processData(short value){ }
    void processData(Byte value){ }*/

    //snippet 23 - check Main4
    //snippet 24 - check Main5
    //snippet 25 - check Main6
    //snippet 26 - check Main7
    //snippet 27 - check Main8
    //snippet 28 - check Main9
    //snippet 29 - check Main10
    //snippet 30 - check Main11
    //snippet 31 - check Main12
    //snippet 32 - check Main13
    //snippet 33 - check Main14
    //snippet 34 - check Main15
    //snippet 35 - check Main16
    //snippet 36 - check Main17




    public static void main(String[] args) {
    }
}
