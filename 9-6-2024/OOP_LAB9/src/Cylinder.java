/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Cylinder extends Circle {
    
    //attribute - instance variable
    private double height;
    
    //constructor - default constructor
    public Cylinder(){
        super();
        this.height = 1.0;
    }

    //constructor - with args - ver2
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    
    //getter
    public double getHeight(){
        return this.height;
    }
    
    public double getVolume(){
//        return Math.PI * (this.getRadius() * this.getRadius()) * this.height;
        return super.getArea() * this.height; 
    }
    
    @Override
    public double getArea(){
//        return (2 * Math.PI * (this.getRadius() * this.getRadius())) +
//               (2 * Math.PI * this.getRadius() * this.height);
        return 2 * super.getArea() + super.getPerimeter() * this.height;
    }
    
    @Override
    public double getPerimeter(){
        return (2 * Math.PI * this.getRadius()) + this.height;
    }
    
    @Override 
    public String toString(){
        return "Cylinder[" + "radius= " + this.getRadius() + ", " + 
                "height= " + this.height + ", " + "area= " + 
                this.getArea() + ", " + "perimeter= " + this.getPerimeter()
                + ", " + "volume= " + this.getVolume() +
                "]";
    }
}
