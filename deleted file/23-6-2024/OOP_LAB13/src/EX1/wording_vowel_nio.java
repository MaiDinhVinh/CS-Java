/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author vingi
 */
public class wording_vowel_nio {
    public static void main(String[] args){
        int numVowels = 0;
        int maxVowels = 0;
        String vow = "ueoai";
        Path read = Paths.get("src/EX1/random_words.txt");
        Path write = Paths.get("src/EX1/vowel_word.txt");
        String write_vowel = null;
        String final_word = null;
        
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8);
                BufferedWriter bw = Files.newBufferedWriter(write, StandardCharsets.UTF_8)){
            do{
                write_vowel = br.readLine();
                if(write_vowel == null){
                    break;
                }
                for(int i = 0; i < write_vowel.length(); i++){
                    if(vow.contains(write_vowel.substring(i, i+1)) == true){
                        numVowels++;
                    }
                }
            
                if(numVowels > maxVowels){
                    final_word = write_vowel;
                    maxVowels = numVowels;
                }
                
                numVowels = 0;
            } while(write_vowel != null); //cai nay k khac gi while true, co cach khac khong ?
            
            String write_file = "Word: " + final_word + " , " + "number of vow: " + maxVowels;
            bw.append(write_file, 0, write_file.length());
            bw.newLine();
        } catch(Exception ewrite){
            System.out.println("Exception found!");
        }
    } 
}
