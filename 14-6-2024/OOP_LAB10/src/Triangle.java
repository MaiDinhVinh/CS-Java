/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Triangle extends Shape{
    //attribute - instance variable
    private int base;
    private int height;
    
    public Triangle(){
        this(1, 1, "red");
    }
    
    public Triangle(int base, int height, String color){
        super(color);
        this.base = base;
        this.height = height;
    }
    
    public Triangle(int base, int height){
        this(base, height, "red");
    }
    
    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
    
    @Override
    public String toString(){
        return "Triangle[" + "base= " + this.base + ", " + 
                "height= " + this.height + ", " + 
                super.toString() + "]";
    }
    
}
