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
public class Division extends MathExpression{
    public Division(String exp){
        super(exp);
    }
    
    @Override
    public int calculate(){
        int result = 0;
//        return super.getLHS() / super.getRHS(); 
        if(this.getRHS() == 0){
            result = Integer.MAX_VALUE;
        } else{
            result = this.getLHS() / this.getRHS();
        }
        
        return result;
    }
}
