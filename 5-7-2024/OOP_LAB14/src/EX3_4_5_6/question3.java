package EX3_4_5_6;

import java.util.Set;
import java.util.HashSet;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;

public class question3 {
    public static boolean isSubSet(Set<String> a, Set<String> b) throws Exception{

        return a.containsAll(b);

    }

    public static void main(String[] args){
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();
        Path read_a = Paths.get("src/EX3_4_5_6/word_set_b.txt");
        Path read_b = Paths.get("src/EX3_4_5_6/word_sub_set.txt");
        String write_a = null;
        String write_b = null;

        try(BufferedReader br_a = Files.newBufferedReader(read_a, StandardCharsets.UTF_8);
            BufferedReader br_b = Files.newBufferedReader(read_b, StandardCharsets.UTF_8)){

            while((write_a = br_a.readLine()) != null){
                a.add(write_a);
            }

            while((write_b = br_b.readLine()) != null){
                b.add(write_b);
            }

            System.out.println("Is a subset of b: " + isSubSet(a, b));

        } catch(Exception e){
            System.out.println("Exception Detected!");
        }


    }
}
