package section5_4;

public class DeclareAndInstantiate {
    /**
     * 1) This statement below creates a new instance of<p>
     * {@link java.lang.Object} class. When we using the
     * {@code new} keyword, JVM will cut a chunk of memory from
     * the free memory and this chunk of memory will be formated into
     * various fields defined in the class => the formated chunk of
     * memory become the object<p>
     * 2) Depending on how class is defined, we can (or even might) need
     * to pass arguments when instantiating objects<p>
     * 3) The {@code new} keyword is actually cause the "constructor"
     * of the class to execute. The "constructor" will initializing
     * various data members of the object<p>
     * 4) Since reference variable only store the memory address to the real
     * object, therefore, in order to use this object, we must store their
     * address somewhere else to use later. One of the way is to use
     * variable. In this line of code, the address of the object is stored
     * in a variable {@code str}<p>
     * 5) If you just want to instantiate the object and let them forgotten by JVM,
     * we could just not assign the object address to any variable*/
    public static void main(String[] args) {
        java.lang.Object test = new java.lang.Object(); //check 1) javadoc
        String s = new String("hello"); //check 2) java doc
        String str = new String("this is str reference var"); //check 4) javadoc
        new Object(); //check 5) javadoc
    }
}
