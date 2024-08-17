package creatingjarfile;

public class Main {
    /**
     * To pack all class files, we will use this command
     * <blockquote><pre>
     *     jar Main.jar creatingjarfile
     *     //remember, we will have to run the command in the directory that is outside
     *     //of the package directory structure
     * </pre></blockquote><p>
     *
     * To execute the program, we will use this command
     * <blockquote><pre>
     *     java -classpath Main.jar creatingjarfile.Main
     *     //remember, we will have to run the command in the directory
     *     //that is outside of package directory structure
     * </pre></blockquote>*/
    public static void main(String[] args) {
        System.out.println("Jar File created");
    }
}
