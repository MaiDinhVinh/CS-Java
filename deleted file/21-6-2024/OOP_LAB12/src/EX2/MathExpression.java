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
public abstract class MathExpression {
    private int left;
    private int right;
    private String operator;
    private boolean is_invalid = false;
    private String invalid_LHS;
    private String invalid_RHS;
    
    
    public MathExpression(){
        this.left = 0;
        this.right = 0;
        this.operator = null;
    }
    
    public MathExpression(String exp){
        try{
            this.left = Integer.parseInt(exp.substring(0, (exp.length() / 2) - 1));
            this.right = Integer.parseInt(exp.substring((exp.length() / 2 ) + 2));
            this.operator = exp.substring((exp.length() / 2), (exp.length() / 2) + 1);
        } catch(Exception arithmeticError){
            this.is_invalid = true;
            this.invalid_LHS = exp.substring(0, (exp.length() / 2) - 1);
            this.invalid_RHS = exp.substring((exp.length() / 2 ) + 2);
            this.operator = exp.substring((exp.length() / 2), (exp.length() / 2) + 1);
        } 

    }
    
    
    public int getLHS(){ //mean getLeftHandSide
        return this.left;
    }
    
    public int getRHS(){ //mean getRightHandSide
        return this.right;
    }
    
    public String getOperator(){ //what is the purpose of those getters and setters ?
        return this.operator;
    }
    
    public void setLHS(int left){
        this.left = left;
    }
    
    public void setRHS(int right){
        this.right = right;
    }
    
    public void setOperator(String operator){
        this.operator = operator;
    }
    
    public abstract int calculate();
    
    @Override
    public String toString(){
        if(!is_invalid){
            return this.left + this.operator + this.right + "=" + 
                    this.calculate();
        } else{
            return this.invalid_LHS + this.operator + this.invalid_RHS + "=" + 
                    Integer.MAX_VALUE;
        } 
    }
    
}
