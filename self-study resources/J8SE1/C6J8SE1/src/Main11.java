import java.io.IOException;

public class Main11{
    public static void main(String[] args) {
        String textInFile = null;
        try {
            readInFile();
        } catch (IOException e) {
            //?
        }
        System.out.println(textInFile.replace(" ", "")); //?
    }
    private static void readInFile() throws IOException {
        throw new IOException();
    }
}