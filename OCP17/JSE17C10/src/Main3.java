import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        var list = List.of("x", "y", "z");
        Separations result = list.stream()
                .collect(Collectors.teeing(
                        Collectors.joining(" "),
                        Collectors.joining(","),
                        (s, c) -> new Separations(s, c)));
        System.out.println(result);
    }
}

record Separations(String spaceSeparated, String commaSeparated) {}