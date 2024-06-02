/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducksabervn
 */
public class Circle {
    //attribute or instance variable
    private double radius = 1.0;
    
    
    //constructor - no input
    public Circle(){
        this.radius = 1.0;
    }
    
    //constructor - from input
    public Circle(double radius){
        this.radius = radius;
    }
    
    //getter
    public double getRadius(){
        return this.radius;
    }
    
    //setter
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    //get area
    public double getArea(){
        double area = Math.PI * (this.radius * this.radius);
        return area;
    }
    
    //get circumference
    public double getCircum(){
        double circum = 2 * Math.PI * this.radius;
        return circum;
    }
    
    //print radius
    @Override
    public String toString(){
        return "Radius: " + this.radius;
    }
}
