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
        List<String> compare = new ArrayList<>();
        List<String> temp_a = new ArrayList<>();

        compare.addAll(a);
        compare.addAll(b);
        temp_a.addAll(a);


        int compare_index = 0;
        int a_index = 0;
        int condition = 0;
        while(a_index < a.size()){
            if(compare.get(compare_index) == temp_a.get(a_index)){
                condition++;
            }

            if(condition == 2){
                result.add(temp_a.get(a_index));
            }



            if(compare_index == compare.size() - 1){
                compare_index = 0;
                a_index++;
                condition = 0;
            } else{
                compare_index++;
            }
        }

        return result;
    }

    public static void main(String[] args){
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();
        Path read_a = Paths.get("src/EX3_4_5_6/word_set_a.txt");
        Path read_b = Paths.get("src/EX3_4_5_6/word_set_b.txt");
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
