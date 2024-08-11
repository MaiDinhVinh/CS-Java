/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Rectangle extends Shape{
    //attribute - instance variable
    private int length;
    private int width;
    
    public Rectangle(){
        this(1, 1, "red");
    }
    
    public Rectangle(int length, int width, String color){
        super(color);
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(int length, int width){
        this(length, width, "red");
    }
    
    @Override
    public double getArea(){
        return length * width;
    }
    
    @Override
    public String toString(){
        return "Rectangle[" + "length= " + this.length + ", " + 
                "width= " + this.width + ", " + 
                super.toString() + "]";
    }
}
