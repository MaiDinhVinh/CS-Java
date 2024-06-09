/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Square extends Rectangle{
    
    //constructor - default constructor with no args
    public Square(){
        this(1.0);
    }
    
    //constructor - with args - ver1
    public Square(double side){
        super(side, side);
    } 
    
    //constructor - with args - ver2
    public Square(double side, String color, boolean filled){
//        this(side);
//        this.setColor(color);
//        this.setFilled(filled);
        super(side, side, color, filled);
    }
    
    @Override //da ke thua tu bo, nhung con lam khac
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override //da ke thua tu bo, nhung con lam khac
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override //suyt nua bi lua phan getArea() and getPerimeter()
    public double getArea(){
        return (this.getLength() * this.getLength());
    }
    
    public double getPerimeter(){
        return (this.getLength() * 4);
    }
    
    @Override
    public String toString(){
        return "A Square with side= " + this.getLength() + ", which is a subclass of "
                + super.toString();
    }
    

    
}
