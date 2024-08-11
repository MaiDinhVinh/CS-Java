package EX2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class largest_word_sentence{
    public static void main(String[] args){
        int numSpace = 0;
        int numWord = 0;
        int maxWord = 0;
        String max_word_string = null;
        String check_line = null;
        String reversed_max_string = "";
        Path read = Paths.get("src/EX2/random_sentences (1).txt");
        Path write = Paths.get("src/EX2/result.txt");

        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8);
            BufferedWriter bw = Files.newBufferedWriter(write, StandardCharsets.UTF_8)){

            while((check_line = br.readLine()) != null){
                for(int i = 0; i < check_line.length(); i++){
                    if(check_line.charAt(i) == ' '){
                        numSpace++;
                    }
                }

                numWord = numSpace + 1;
                if(numWord > maxWord){
                    maxWord = numWord;
                    max_word_string = check_line;
                }

                numWord = 0;
                numSpace = 0;
            }

            String[] word_arr = new String[maxWord];
            int array_index = 0;
            String temp_array_string = "";
            for(int i = 0; i < max_word_string.length(); i++){

                if(i == max_word_string.length() - 1){
                    word_arr[array_index] = temp_array_string + '.';
                    break;
                }

                if(max_word_string.charAt(i) != ' '){
                    temp_array_string += max_word_string.charAt(i);
                } else if(max_word_string.charAt(i) == ' '){
                    word_arr[array_index] = temp_array_string + ' ';
                    temp_array_string = "";
                    array_index++;
                }
            }

            String final_output = "";
            for(int i = word_arr.length - 1; i >= 0; i--){
                final_output += word_arr[i];
            }

            bw.append(final_output, 0, final_output.length());
            bw.newLine();

        } catch(Exception eprint){
            System.out.println(eprint.getMessage());
        }
    }
}