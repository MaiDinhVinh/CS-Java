/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Shape {
    
    //attribute - instance variable
    private String color;
    
    
    //getter
    public double getArea(){
        return 0.0;
    }
    
    //additional setter for setting color
    public void setColor(String color){
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "Shape[" + "color= " + this.color + "]";
    }
    
}
