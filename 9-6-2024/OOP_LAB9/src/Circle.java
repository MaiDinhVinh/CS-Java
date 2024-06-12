/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Circle {
    
    //attribute - instance variable
    private double radius;
    
    //constructor - default constructor with no args
    public Circle(){
        this.radius = 1.0;
    }
    
    //constructor with args 
    public Circle(double radius){
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
    
    @Override
    public String toString(){
        return "Circle[" + "radius= " + this.radius + ", " +
                "area= " + this.getArea() + ", " + "perimeter= " +
                this.getPerimeter() + "]";
    }
}
