/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author vingi
 */
public class wording_nio {
    public static void main(String[] args){
        Path read = Paths.get("src/EX1/random_words.txt");
        Path write = Paths.get("src/EX1/longest_word.txt");
        String line = null;
        int largest_length = 0;
        int smallest_length = Integer.MAX_VALUE; //ensure that there will be smaller string length
        
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)){
            
            
            while((line = br.readLine()) != null){
                if(line.length() > largest_length){
                    largest_length = line.length();
                } else if(line.length() < smallest_length){
                    smallest_length = line.length();
                }
            }
        } catch(Exception eread){
            System.out.println("Exception Found! " + eread.getMessage());
        }
        
        String write_line = null;
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8);
            BufferedWriter bw = Files.newBufferedWriter(write, StandardCharsets.UTF_8)){
            
            
            while((write_line = br.readLine()) != null){
                if(write_line.length() == largest_length){
                    String largest_to_write = "Word: " + write_line + " , " + "length: " + largest_length;
                    bw.append(largest_to_write, 0, largest_to_write.length());
                    bw.newLine();
                } else if(write_line.length() == smallest_length){
                    String smallest_to_write = "Word: " + write_line + " , " + "length: " + smallest_length;
                    bw.append(smallest_to_write, 0, smallest_to_write.length());
                    bw.newLine();
                }
            }
        } catch(Exception ewrite){
            System.out.println("Data processing failed");
        }
    }
}
