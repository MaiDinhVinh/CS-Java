/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

/**
 *
 * @author vingi
 */
public class NonValidExpression extends MathExpression{
    public NonValidExpression(String exp){
        super(exp);
    }
    
    public NonValidExpression(String exp, boolean check){
        super(exp, check);
    }
    
    @Override
    public int calculate(){
//        System.out.print("(Invalid Operator)");
//        return 0; 
        System.out.print("");
        return Integer.MAX_VALUE;
    }
}
