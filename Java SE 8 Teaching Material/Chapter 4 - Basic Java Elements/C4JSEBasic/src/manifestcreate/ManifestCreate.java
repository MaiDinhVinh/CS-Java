package vn.edu.fpt;

public class ManifestCreate {
    /**
     * 1) Compile the file first<p>
     * 2) In the same directory with the source file, create a file ".txt" and
     * write this inside the txt file (This is our manifest file for our Jar file)
     * <blockquote><pre>
     *     Main-Class: vn.edu.fpt.ManifestCreate
     *     //remember to include a space between the colon and the FQCN
     *     //also, remember to enter a new line
     * </pre></blockquote><p>
     * 3) Then, in the command prompt, run this command
     * <blockquote><pre>
     *     jar -cvfm manifestcreate.jar <your_manifest_file_name>.txt vn\edu\fpt
     * </pre></blockquote><p>
     * 4) Now, we can run directly with Java command
     * <blockquote><pre>
     *     java -jar manifestcreate.jar
     *     //remember to run this in the corresponding directory
     *     //that stores the source file
     * </pre></blockquote>*/
    public static void main(String[] args) {
        System.out.println("manifest file created");
    }
}
