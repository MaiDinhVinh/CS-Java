package section5_3.section5_3_2;

public class AllTypesOfVariableInitAndDeclare {
    /**
     * SOME INVALID DECLARATION AND INITiALIZATION
     * <blockquote><pre>
     *     int a = 10, int b; //there should be only 1 type name
     *     int a, Object b; //there should be only 1 type name in 1 statement
     *     int x = y = 10; //y must be defined first
     * </pre></blockquote><p>
     * Another valid way to initialize a reference variable
     * <blockquote><pre>
     *     Object obj = null; //this indicates that this reference variable is pointing to nothing
     * </pre></blockquote><p>
     * HOWEVER, THIS IS NOT USABLE FOR PRIMITIVE VARIABLE
     * <blockquote><pre>
     *     int i = null;
     * </pre></blockquote>*/
    public static void main(String[] args) {
        int x = 10; //initializing variable x using an int literal 10

        int y = x; //initializing variable y by assigning it with value from variable x

        String str = "hello"; //initializing str by creating a new string

        section5_3.section5_3_1.SomeClass obj = new section5_3.section5_3_1.SomeClass();

        //initializing obj reference variable by creating a SomeClass instance
        Object obj2 = obj;//initializing obj2 by assigning memory address from obj to obj2

        int a = 10, b = 20, c = 30; //initializing each variable of the same type with different value simultaneously

        String s1 = "123", s2 = "hello"; //same with last example

        int m = 20; int p = m = 10;
        /*
        * First initialize the variable m with 20 and then re assign it to 10, then
        * initialize the variable p with value from variable m*/

        int d, e = 10, f = 20; //only d is declared, e and f is initialized with different value

        String str1 = "hello", str2; //only str1 is initialized with a new string, str2 is declared
    }
}
