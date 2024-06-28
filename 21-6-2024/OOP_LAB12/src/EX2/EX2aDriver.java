/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author vingi
 */
public class EX2aDriver {
    public static void main(String[] args){
        MathExpression[] result = new MathExpression[150];
        int math_result_index = 0;
        boolean end = false;
        String line = "";
        String error = "";
        
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
                    System.out.println("Error Found: " + ein.getMessage());
                } finally{
                    math_result_index++;
                } 
            } while(!end);
        } catch(Exception eout){
            System.out.println("Error: " + eout.getMessage() + "\n");
        }
        
        for(MathExpression i: result){
            System.out.println(i);
        }
    }
}
