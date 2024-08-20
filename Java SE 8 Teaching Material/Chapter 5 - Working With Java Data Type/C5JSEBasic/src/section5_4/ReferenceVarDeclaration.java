package section5_4;

public class ReferenceVarDeclaration {
    /**
     * <blockquote><pre>
     *     Motorbike motor; //class Motorbike has been imported
     * </pre></blockquote><p>
     *
     * <blockquote><pre>
     *     com.fpt.edu.Motorbike honda; //use FQCN
     * </pre></blockquote>*/
    public static void main(String[] args) {
        String str; //both resides in java.lang package
        Object obj;

        //OR we could do something like this
        Object obj1, obj2;

        //OR
        Object ob1 = null;
        Object ob2 = ob1, ob3; //ob2 has the same value as ob1 (which points to null)


    }
}
