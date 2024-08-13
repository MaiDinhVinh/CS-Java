/*package com.fpt
* //this may not work since this Java file resides in something called "default package"
* in this situation is "src"
* */


import java.util.Scanner; //this is importing the Scanner classes from Java APIs

public class SummaryImportantJavaKeywords {
    public static void main(String[] args) {
        /*
         * class: This keyword is for object definition. Technically,
         * "class" keyword is used to create a new "reference type". In this
         * example, we are defining a Motorbike object.
         *
         * There are 2 other keywords, which are "interface" and "enum" but we won't
         * mention about it here
         */
        class Motorbike1{}
        class CSPlayer{}
        class Student{}

        /*
         * new: This keyword is to create a new instance of a class.
         */

         Motorbike1 honda = new Motorbike1();
         CSPlayer ZywoO = new CSPlayer();
         Student demo = new Student();

         /*
          * if and else: The "if" and "else" statement is used to make
          * decision statement
          */

        int testNum = 0;
        if(testNum % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        /*
        * switch, case, default, break: These keyword is used for more complicated
        * decision statement which allows us to have multiple option instead of 2
        * (Although is is also achievable by using "else if")
        *
        * - "Switch": Indicate much more complicated decision statement mechanism
        * - "Case": Just like "if", "case 1" = "if(keyboardInput == 1)"
        * - "break": If the condition is satisfied, it will break out of the switch block
        * - "default": equivalent to "else", if no condition is satisfied => do anything in
        * "default" block
        * */

        int keyboardInput = 0;
        switch (keyboardInput){
            case 1:
                System.out.println("a");
                break;
            case 2:
                System.out.println("b");
                break;
            case 3:
                System.out.println("c");
                break;
            case 4:
                System.out.println("d");
                break;
            default:
                System.out.println("invalid input");
        }

        /*
        * for, while, do, break, continue: The "for" and "while" to create
        * different type of loop
        *
        * - "while": This is a type of loop that requires a doing condition
        * in order to make the the loop functional
        * - "for": This is a type of loop that also requires a doing condition
        * - "do": This is a special keyword that used in "do-while" loop
        * - "break": terminate a loop
        * - "continue": skip over a logic block within a loop
        * */

        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        int iterate = 0;
        while(iterate <= 10){
            System.out.println(iterate);
            iterate++;
        }

        /*
        * package and import: The "package" keyword is used to organize classes into
        * packages while the "import" keyword is to import others classes from other
        * packages (code illustration in line 1 - 3) */

        /*
        * public, protected and private: These are all keywords that implement
        * one of the OOP feature - Encapsulation: Protecting the attributes and
        * functionality of the object*/

        private int speed;
        int tienDien;
        /*
        * please be careful that we are in main right now, and this line of code
        * could be understood as int variable declaration. However,
        * this is INSTANCE VARIABLE DECLARATION with a modifer of "no modifier -
        * default"*/

        protected Family familyHierarchy;

        public int populationCount;

        /*extends and implements: This is keywords for Class inheritance and
        * Interface implementation. We won't mention about this in this course*/

        class Motorbike extends Vehicles{}
        class Casio580FX implements Calculator{}


        /*
        * boolean, byte, char, double, float, short, long, int:
        * These are all "Primitive datatype" in Java */

        boolean is1Plus1Equal2 = true;
        char demoChar = 'a';
        /*
        * NOTE: Java is very sensitive when it is coming to the sign,
        * '' is for char while "" is for String*/
        double demoDouble = 1.0;
        float demoFloat = 1.0f;
        /*
        * reason for the "f" after the value is that double and float
        * are difference in term of the size of the value where double
        * has a larger size than float */

        /*
        * super and this: These are all keywords for OOP
        * - "super": This keyword is equivalent to the Superclass or
        * Parent class
        * - "This": This keyword is referencing to the instance of a class
        * it self*/

        super.toString(); //this is calling the toString() method from parent class
        this.studentHeight; //this is referencing to the instance variable of a class

        /*
        * return: This is the keyword for function ("Method" to be exctly since
        * Java is OOP-based => no definition of "Function"), this mean return something
        * to the user*/

        public int getGrade(){
            return this.grade; //this mean returning the instance variable of the class
        }

        /*
        * static: This is the keyword that specifies a method or a variable
        * that belong to the class itself.  */

        class Motorbike2{
            public static int productionCount; //this is a int variable that belong to the class itself = to all instances of that class
        }

        /*
        * throws, catch, throw: These are keywords for Exception Handling Mechanism
        * feature in Java*/

        try{
            System.out.println("hello world");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }




    }
}