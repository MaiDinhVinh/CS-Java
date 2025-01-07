package section5_3.section5_3_1;

/**
 * Declaration is just means "something exist"<p>
 * Definition describe exactly WHAT IT IS<p>
 * Only declaration is not enough since it is "partial information"
 * ,therefore, the definition makes it complete and usable<p>
 * IN TERM OF VARIABLE: Java doesn't have any clear distinction between
 * declaration and definition since a variable declartion has already
 * included itself all necessary information<p>
 * EXAMPLE:
 * <blockquote><pre>
 *     int i;
 *     //this declaration has the information included itself including
 *     //the data type of the variable, the name of the variable
 *     //PLEASE BE CAREFUL SINCE ASSIGNING THE VALUE TO THE VARIABLE
 *     //IS NOT DEFINING, BUT IT IS CALLED "INITIALIZATION"
 * </pre></blockquote><p>
 * EXAMPLE OF INITIALIZATION
 * <blockquote><pre>
 *     int i = 10;
 *     Object obj = null;
 * </pre></blockquote>*/
public class SomeClass //CLASS DECLARATION
//CLASS DEFINITION START HERE
{

    public void m1() //METHOD DECLARTION
    //METHOD DECLARATION START HERE
    {
        System.out.println("hi");
        /*
        * the variable i is declared as primitve variable with primitve data type of int
        * and initialized with value 10*/
        int i = 10;
        /*
        * the variable obj is declared as reference variable with reference data type of java.lang.Object
        * and initialized with value of null*/
        Object obj = null;
    }
    //METHOD DECLARATION ENDS HERE
}
//CLASS DEFINITON ENDS HERE