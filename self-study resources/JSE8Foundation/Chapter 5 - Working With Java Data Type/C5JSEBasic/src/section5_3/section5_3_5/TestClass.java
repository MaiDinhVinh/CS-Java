package section5_3.section5_3_5;

public class TestClass {
    /**
     * OBSERVATION: <p>
     * <blockquote><pre>
     *     tc.x = 10;
     * </pre></blockquote><p>
     * This code won't run since instance field {@code x}
     * is declared as {@code final} => it is a constant
     * <blockquote><pre>
     *     y = 40;
     * </pre></blockquote><p>
     * In this code, variable {@code y} is also declared
     * as {@code final} => cannot assign other value to
     * this variable
     * <blockquote><pre>
     *     tc = new TestClass();
     * </pre></blockquote><p>
     * This code is wrong because {@code tc} can't
     * reference to other objects anymore<p>
     * <blockquote><pre>
     *     args = new String[0];
     * </pre></blockquote><p>
     * This code won't run because args is {@code final} =>
     * it cannot point to any array object*/
    final int x = 19;
    final static int y = 20;

    public static void main(final String[] args) {
        final TestClass tc = new TestClass();
        System.out.println(tc.x + " " + y + " " + tc);
    }
}
