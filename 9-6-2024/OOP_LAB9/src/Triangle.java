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
    
    //constructor - default constructor with no args
    public Triangle(){
        this(1, 1);
        this.setColor("white");
    }
    
    //constructor with args - ver1 
    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
        this.setColor("white");
    } 
    
    //constructor with args - ver2
    public Triangle(int base, int height, String color){
        this(base, height);
        this.setColor(color);
    }
    
    @Override
    public double getArea(){
        return 0.5 * this.base * this.height;
    }
    
    @Override
    public String toString(){
        return "Triangle[" + "base= " + this.base + ", " + 
                "height= " + this.height + ", " + super.toString()
                + "]";
    }
}
