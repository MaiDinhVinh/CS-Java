package EX3_4_5_6;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;


public class question5 {
    public static Set<String> intersection(Set<String> a, Set<String> b) throws Exception{
        Set<String> result = new HashSet<>();

        for(String i: a){
            if(b.contains(i)){
                result.add(i);
            }
        }

        return result;

    }

    public static void main(String[] args){
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();
        Path read_a = Paths.get("src/EX3_4_5_6/word_set_b.txt"); //parent set
        Path read_b = Paths.get("src/EX3_4_5_6/word_set_a.txt"); //child set
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

            for(String i: intersection(a, b)){
                System.out.println(i);
            }

        } catch(Exception e){
            System.out.println("Exception detected!: " + e.getMessage());
        }

    }
}
