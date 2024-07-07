package EX1_2;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class question1 {
    public static void swapElements(List<String> origin,  int first, int second) throws Exception{
        List<String> temp_list = new ArrayList<>();
        temp_list.addAll(origin);
        origin.clear();
        String temp_first = null;
        String temp_second = null;

        temp_first = temp_list.get(first);
        temp_second = temp_list.get(second);
        for(int i = 0; i < temp_list.size(); i++){
            if(i == first){
                origin.add(temp_second);
            } else if(i == second){
                origin.add(temp_first);
            } else{
                origin.add(temp_list.get(i));
            }
        }
    }

    public static void main(String[] args) throws Exception{
        List<String> origin = new ArrayList<>();
        Path read = Paths.get("src/EX1_2/word_list.txt");
        BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8);
        String line = null;
        while((line = br.readLine()) != null){
            origin.add(line);
        }

        swapElements(origin, 1, 4);

        for(String i: origin){
            System.out.println(i);
        }

    }
}
