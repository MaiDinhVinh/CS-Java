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
    private String color = "red";
    private boolean filled = true;
    
    //constructor - default constructor with no-arg
    public Shape(){
        this.color = "green";
    }
    
    //constructor - with argument
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    //getter
    public String getColor(){
        return this.color;
    } 
    
    //getter for ONLY BOOLEAN TYPE IS CALLED "is...()"
    public boolean isFilled(){
        return this.filled;
    }
    
    //setter
    public void setColor(String color){
        this.color = color;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    @Override
    public String toString(){
        String checkcol;
        if(this.filled == true){
            checkcol = " filled.";
        } else{
            checkcol = " Not filled.";
        }
        return "A Shape with color of " + this.color + " and" + checkcol;
    }
}
