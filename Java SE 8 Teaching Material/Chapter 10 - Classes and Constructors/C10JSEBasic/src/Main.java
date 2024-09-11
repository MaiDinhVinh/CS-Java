/*class Student{
    String name;
}*/

/*class Calculator{
    public int calculate(int[] iArray){
        int sum = 0;
        for(int i : iArray){ //this is a for-each loop, we'll cover it later
            sum = sum+i;
        }
        return sum;
    }
}*/

/*class Person{
    private int age;
    public void setAge(int yrs){
        if(yrs<0) throw new IllegalArgumentException();
        else this.age = yrs;
    }
    public int getAge(){ return age; }
//other code
}*/

/*class TestClass{
    //first instance initializer
    {
        System.out.print("Hello ");
    }

    public TestClass(){
        System.out.println("im constructor");
    }
    public static void main(String[] args){
        new TestClass();
    }
    //second instance initializer
    {
        System.out.print("World!");
    }
}*/

/*class Account{
    int id;
    Account(int id){
        this.id = id;
    }
    public static void main(String[] args) {
        Account a = new Account(); //trying to use the no-args constructor
    }
}*/

public class Main {
    public static void main(String[] args) {
        //snippet 1 - check Student class
        /*Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "alice";
        System.out.println(s1.name); //prints alice
        System.out.println(s2.name); //prints null
        s2.name = "bob";
        System.out.println(s1.name); //prints alice
        System.out.println(s2.name); //prints bob*/

        //snippet 2 - Check calculator class
        /*int result = new Calculator().calculate( new int[]{1, 2, 3, 4, 5} );
        System.out.println(result);*/

        //snippet 3 - check Main2
        //snippet 4 - check Main3
        //snippet 5 - check Main4
        //snippet 6 - check Main5
        //snippet 7 - check Main6
        //snippet 8 - check Person class
        //snippet 9 - check TestClass
        //snippet 10 - check Main7
        //snippet 11 - check Main8
        //snippet 12 - check Account class
        //snippet 13 - check Main9
        //snippet 14 - check Main10
        //snippet 15 - check Main11
        //snippet 16 - check Main12
        //snippet 17 - check Main13
        //snippet 18 - check package Obscuring
        //snippet 19 - check Main14
        //snippet 20 - check Main15
        //snippet 21 - check Main16
        //snippet 22 - check Main17
        //snippet 23 - check Main18
        //snippet 24 - check Main19
        //snippet 25 - check Main20
    }
}
