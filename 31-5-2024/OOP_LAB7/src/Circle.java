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
    
    //constructor - no input
    public Circle(){
        this.radius = 1.0;
    }
    
    //constructor - input
    public Circle(double radius){
        this.radius = radius;
    }
    
    //getter
    public double getRadius(){
        return this.radius;
    }
    
    public double getArea(){
        return Math.PI*(this.radius*this.radius);
    }
    
    public double getCircumference(){
        return Math.PI*(2*this.radius);
    }
    
    //setter
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    //print all
    @Override
    public String toString(){
        return "Circle[radius=" + this.radius + "]";
    }
}
