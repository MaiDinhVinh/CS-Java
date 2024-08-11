/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C11.ex2;

/**
 *
 * @author vingi
 */
public class Circle {
    private double radius;
    private String color;
    public static final double PI = 3.14;
    
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public double getArea(){
        return PI * this.radius * this.radius;
    }
    
    public double getPerimeter(){
        return 2 * PI * this.radius;
    }
    
    @Override
    public String toString(){
        return "Circle[" + "radius=" + this.radius + ", " +
                "color=" + this.color + "]";
    }
}
