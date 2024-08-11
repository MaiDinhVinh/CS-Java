package EX1_2;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class question2 {
    public static List<String> extractElement(List<String> origin, int start, int end) throws Exception{
        List<String> result = new ArrayList<>();
        for(int i = start; i < origin.size(); i++){
            if(i == end + 1){
                break;
            } else{
                result.add(origin.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args){
        List<String> origin = new ArrayList<>();
        Path read = Paths.get("src/EX1_2/word_list.txt");

        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)){
            String line = null;
            while((line = br.readLine()) != null){
                origin.add(line);
            }

            for(String i: extractElement(origin, 0, 4)){
                System.out.println(i);
            }
        } catch(Exception e){
            System.out.println("Exception Detected! " + e.getStackTrace());
        }

    }
}
