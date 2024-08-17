package section5_2.section5_2_2;

public class TestStudent {
    /**
     * OBSERVATION:<p>
     * <blockquote><pre>
     *     int a = 1;
     * </pre></blockquote><p>
     * This mean that we are assigning the value of 1 to the
     * variable a<p>
     * <blockquote><pre>
     *     int b = a;
     * </pre></blockquote><p>
     * This mean that JVM directly copies value from variable a
     * and then assign it to b<p>
     * <blockquote><pre>
     *     b = 0;
     * </pre></blockquote><p>
     * This is just re-assigning value of b to value of 2<p>
     * <blockquote><pre>
     *     Student s1 = new Student();
     * </pre></blockquote><p>
     * This is creating a new instance from class Student
     * <blockquote><pre>
     *     s1.id = 1;
     * </pre></blockquote><p>
     * This is just assigning a value of 1 to the instance variable s1<p>
     * of the Student class
     * <blockquote><pre>
     *     Student s1 = s2;
     * </pre></blockquote><p>
     * This is just assigning the memory address from reference s1 to reference s2
     * <blockquote><pre>
     *     s2.id = 2;
     * </pre></blockquote><p>
     * Since s2 has the memory address to s1 => s2 can point to the object that s1<p>
     * is currently pointing to => s2 has access to the instance field and reassign it<p>
     * => this will change the instance field of the real object (which both s1 and s2 are pointing to)<p>
     * => they will return a same result.*/
    public static void main(String[] args) {
        int a = 1;

        int b = a;
        b = 0;
        System.out.println(a);

        Student s1 = new Student();
        s1.id = 1;
        Student s2 = s1;
        s2.id = 2;
        System.out.println(s1.id);
    }
}
