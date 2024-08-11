/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author vingi
 */

//use Integer.parseInt(...) to change from string to int
//VERSION 1 (DRAFT)
public class MathRead1 {
    public static void mathPrint(String input_dir){
        String print_line = null;
        int LHS = 0; //stand for left hand side
        int RHS = 0; //stand for right hand side
        int math_expression_length = 0;
        int mathop = 0;
        int count = 1;
        try(BufferedReader bfr 
                = new BufferedReader(new FileReader(input_dir))){
            while((print_line = bfr.readLine()) != null){
                if((math_expression_length = print_line.length()) % 2 == /*1*/ 0){
//                    LHS = Integer.parseInt(print_line.substring(0, math_expression_length / 2));
//                    RHS = Integer.parseInt(print_line.substring((math_expression_length / 2) + 3));
//                    mathop = (math_expression_length / 2) + 1;
//                    mathop = (int)(print_line.charAt((math_expression_length / 2) + 1));
                    LHS = Integer.parseInt(print_line.substring(0, (math_expression_length / 2) - 1));
//                    RHS = Integer.parseInt(print_line.substring((math_expression_length / 2) - 1 + 3));
//                    RHS = Integer.parseInt(print_line.substring(math_expression_length / 2) + 2);
                    RHS = Integer.parseInt(print_line.substring((math_expression_length / 2) + 2));
//                    mathop = (int)(print_line.charAt(math_expression_length / 2) + 1);
                    mathop = (int)(print_line.charAt(math_expression_length / 2));
                } else if((math_expression_length = print_line.length()) % 2 == /*0*/ 1){
//                    LHS = Integer.parseInt(print_line.substring(0, (math_expression_length / 2) - 1 ));
//                    RHS = Integer.parseInt(print_line.substring((math_expression_length / 2) + 2));
//                    mathop = math_expression_length / 2;
//                    mathop = (int)(print_line.charAt(math_expression_length / 2));
//                    LHS = Integer.parseInt(print_line.substring(0, (math_expression_length / 2) - 2));
//                    RHS = Integer.parseInt(print_line.substring(math_expression_length / 2) + 1);)
                    LHS = Integer.parseInt(print_line.substring(0, (math_expression_length / 2) - 1));
//                    RHS = Integer.parseInt(print_line.substring(math_expression_length / 2) + 1);
                    RHS = Integer.parseInt(print_line.substring((math_expression_length / 2) + 2));
//                    mathop = (int)(print_line.charAt(math_expression_length / 2) + 1); 
                    mathop = (int)(print_line.charAt(math_expression_length / 2));
                }
                switch (mathop /*math_expression_length + 1*/){
                        case 43:
                            System.out.println("Order: " + count);
                            System.out.println("Result: " + (LHS + RHS));
                            System.out.println("mathop: " + (char)mathop);
                            System.out.println("-----------------------");
                            count++;
                            break;
                        case 45:
                            System.out.println("Order: " + count);
                            System.out.println("Result: " + (LHS - RHS));
                            System.out.println("mathop: " + (char)mathop);
                            System.out.println("-----------------------");
                            count++;
                            break;
                        case 47:
                            System.out.println("Order: " + count);
                            System.out.println("Result: " + (LHS / RHS));
                            System.out.println("mathop: " + (char)mathop);
                            System.out.println("-----------------------");
                            count++;
                            break;
                        case 42:
                            System.out.println("Order: " + count);
                            System.out.println("Result: " + (LHS * RHS));
                            System.out.println("mathop: " + (char)mathop);
                            System.out.println("-----------------------");
                            count++;
                            break;
                        case 37:
                            System.out.println("Order: " + count);
                            System.out.println("Result: " + (LHS % RHS));
                            System.out.println("mathop: " + (char)mathop);
                            System.out.println("-----------------------");
                            count++;
                            break;
                        default:
                            System.out.println("Order: " + count);
                            System.out.println("Invalid Operator");
                            System.out.println("mathop: " + (char)mathop);
                            count++;
                            System.out.println("-----------------------");
                }
            } 
        } catch(Exception e){
            System.out.println("Error Found: " + e.getMessage());
            System.out.println("mathop: " + (char)mathop);
            System.out.println("-----------------------");
            count++;
        } 
    } 
    
    public static void main(String[] args){
        mathPrint("src/EX1/math.txt");
    }
}
