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
public class Modular extends MathExpression{
    public Modular(String exp){
        super(exp);
    }
    
    @Override
    public int calculate(){
//        return super.getLHS() % super.getRHS();
        return this.getLHS() % this.getRHS();
    }
}
