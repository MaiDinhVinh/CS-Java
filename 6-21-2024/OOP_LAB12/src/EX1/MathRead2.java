        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author vingi
 */
public class MathRead2 {
    public static void mathPrinttoFile(String input_dir, String output_dir){
        String print_line = null;
        int LHS = 0; //stand for left hand side
        int RHS = 0; //stand for right hand side
        int math_expression_length = 0;
        int mathop = 0;
        int count = 1;
        boolean end = false;
        try(BufferedReader bfr = new BufferedReader(new FileReader(input_dir)); //try-with-multiple-resource
                BufferedWriter bfw = new BufferedWriter(new FileWriter(output_dir))){
            do{
                try{
                    print_line = bfr.readLine(); 
                    if(print_line == null){
                        break;
                    }
//                    System.out.println("Expression: " + print_line);
                    bfw.write(print_line); //replaced with this
                    math_expression_length = print_line.length();
                    LHS = Integer.parseInt(print_line.substring(0, (math_expression_length / 2) - 1));
                    RHS = Integer.parseInt(print_line.substring((math_expression_length / 2 ) + 2));
                    mathop = (int)(print_line.charAt(math_expression_length / 2 ));
                    
                
                    switch (mathop){
                        case 43:
//                            System.out.println("Result: " + (LHS + RHS));
                            bfw.write("=" + (LHS + RHS) + "\n"); //replaced with this
                            break;
                        case 45:
//                            System.out.println("Result: " + (LHS - RHS));
                            bfw.write("=" + (LHS - RHS) + "\n");
                            break;
                        case 47:
//                            System.out.println("Result: " + (LHS / RHS));
                            bfw.write("=" + (LHS / RHS) + "\n");
                            break;
                        case 42:
//                            System.out.println("Result: " + (LHS * RHS));
                            bfw.write("=" + (LHS * RHS) + "\n");
                            break;
                        case 37:
//                            System.out.println("Result: " + (LHS % RHS));
                            bfw.write("=" + (LHS % RHS) + "\n");
                            break;
                        default:
//                            System.out.println("Invalid Operator");
                            bfw.write(" = Invalid Operator" + "\n");
                    }
                    
                    
                }catch(Exception ein){
//                    System.out.println("Error Found: " + ein.getMessage());
                    bfw.write(" = Error Found: " + ein.getMessage() + "\n");
                } finally{
//                    System.out.println("ID: " + count);
//                    System.out.println("Operation Type: " + (char)mathop);
//                    System.out.println("-----------------------");
                    count++;
                    mathop = 0;
                }
            }while(!end);
        }catch(Exception eout){
            System.out.println("Error: " + eout.getMessage());
        } finally{
            System.out.println("Program executed successfully");
        }
    }  
    
    
    
    public static void main(String[] args){
        mathPrinttoFile("src/EX1/math.txt", "src/EX1/math_result.txt");
    }
}
