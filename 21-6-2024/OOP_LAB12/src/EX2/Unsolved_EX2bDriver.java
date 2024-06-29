/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author vingi
 */
public class Unsolved_EX2bDriver {
    public static void main(String[] args){
        MathExpression[] result = new MathExpression[150];
        int math_result_index = 0;
        boolean end = false;
        String line = "";
        int res_index = 0;
        int[] res_array = new int[150];
        
        int test_count = 0;
        
        try(BufferedReader bfr = new BufferedReader(new FileReader("src/EX2/math.txt"))){
            do{
                try{
                    line = bfr.readLine();
                    if(line == null){
                        break;
                    }
                    switch (line.charAt(line.length() / 2)){
                        case 43:
                            result[math_result_index] = new Addition(line);
                            break;
                        case 45:
                            result[math_result_index] = new Subtraction(line);
                            break;
                        case 47:
                            result[math_result_index] = new Division(line);
                            break;
                        case 42:
                            result[math_result_index] = new Multiplication(line);
                            break;
                        case 37:
                            result[math_result_index] = new Modular(line);
                            break;
                        default:
                            result[math_result_index] = new NonValidExpression(line);
                    }
                } catch(Exception ein){
                    System.out.println("Error found: " + ein.getMessage()); 
                } finally{
                    res_array[res_index] = result[math_result_index].calculate();
                    math_result_index++;
                    res_index++;
                    //for testing
                    System.out.println("test " + test_count);
                    test_count++;
                } 
            } while(!end);
        } catch(Exception eout){
            System.out.println("Error: " + eout.getMessage()); //why this lines of code keep catching
                                                               //Error: 150 ?
        }
        
        res_index = 0;
        int count = 1;
        for(MathExpression i: result){
            try(BufferedWriter bfw = new BufferedWriter(new FileWriter("src/EX2/math_result_oop.txt"))){
                System.out.println("ID " + count + ". " + res_array[res_index]);
                System.out.println(res_index);
                res_index++;
                count++;
            } catch(Exception eprint){
                System.out.println("Error encountered" + eprint.getMessage());
            }
        }
    }
}
