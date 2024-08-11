/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Circle extends Shape {
    //attribute - instance variable
    private double radius = 1.0;
    
    //constructor - default construct with no arg
    public Circle(){
        super();
    }
    
    //constructor - with arg - ver1 
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    
    //constructor - with arg - ver2
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    
    //getter
    public double getRadius(){
        return this.radius;
    }
    
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }
    
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    
    //setter
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public String toString(){
        return "A Circle with radius= " + this.radius + ", " + "which is a subclass of "
                + super.toString();
    }
}
