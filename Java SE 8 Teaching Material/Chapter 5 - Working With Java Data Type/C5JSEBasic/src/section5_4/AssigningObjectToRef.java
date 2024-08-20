package section5_4;

public class AssigningObjectToRef {
    /**
     * Java rules indicated that we can't assign any object type
     * that is different than thw reference variable type
     * (HOWEVER: THERE ARE SPECIAL CASES WHERE WE USE "UPCAST"
     * AND "DOWNCAST")<p>
     * <blockquote><pre>
     *     String str = new Object(); //this is not valid
     * </pre></blockquote>*/
    public static void main(String[] args) {
        Object obj = new Object(); //check 1) javadoc
    }
}
