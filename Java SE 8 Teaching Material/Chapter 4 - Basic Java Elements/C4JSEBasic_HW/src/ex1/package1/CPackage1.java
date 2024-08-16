package ex1.package1;

import ex1.package2.CPackage2_test;

public class CPackage1 {
    //public static String imCPackage1StaticField = CPackage2_test.CPackage2TestStaticField;
    /**
    *
     * OBSERVATION: When i'm trying to access {@code CPackage2_test} static field
    * from class {@code CPackage1} (which resides in package {@code ex1.package1}),
     * it will give out error since JVM will automatically find class {@code CPackage2_test}
    * in package {@code ex1.package1} => it is impossible to access {@code CPackage2_test}
    * static field directly using simple class name. Instead, we have 2
     * solution for this:
     * <p>
     * 1) USE FQCN
     * <blockquote><pre>
     *     public static String imCPackage1StaticField = ex1.package1.package2.CPackage2_test.CPackage2TestStaticField;
     * </pre></blockquote><p>
     * 2) IMPORT THE CLASS
     * <blockquote><pre>
     *     import ex1.package1.package2.CPackage2_test;
     *     //.... more code down here
     *     public static String imCPackage1StaticField = CPackage2_test.CPackage2TestStaticField;
     * </pre></blockquote><p>
    * */
    public static String imCPackage1StaticField =
            CPackage2_test.CPackage2TestStaticField;

    private String imCPackage1InstanceField;

    public CPackage1(String otherString){
        this.imCPackage1InstanceField = otherString;
    }

    public String getImCPackage1InstanceField(){
        return this.imCPackage1InstanceField;
    }
}
