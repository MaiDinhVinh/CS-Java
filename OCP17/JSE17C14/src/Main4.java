import java.io.Console;
import java.util.Locale;

public class Main4 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console not available");
        } else {
            console.writer().println("Welcome to Our Zoo!");
            console.writer().format(new Locale("fr", "FR"),"It has %s animals and employs %s people", 391, 25);
            console.writer().println();
            console.writer().format(new Locale("vn", "VN"),"The zoo spans %5.1f acres", 128.91); //notice the decimal sign
        }
    }
}
