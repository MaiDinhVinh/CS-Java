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
public class Cylinder {
    private Circle base;
    private double height;
    
    public Cylinder(Circle circle, double height){
        this.base = circle;
        this.height = height;
    }
    
    public double getRadius(){
        return this.base.getRadius();
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double getVolume(){
        return this.base.getArea() * this.height;
    }
    
    public double getArea(){
        return (2 * this.base.getArea()) + (this.base.getPerimeter() * this.height);
    }
    
    @Override
    public String toString(){
        return "Cylinder[" + "base= " + this.base.toString() + ", " + 
                "height= " + this.height + "]";
    }
}
