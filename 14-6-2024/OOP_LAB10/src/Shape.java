/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public abstract class Shape {
    //attribute - instance variable
    private String color;
    
    public Shape(){
        this.color = "red";
    }
    
    public Shape(String color){
        this.color = color;
    }
    
    //abstract method
    public abstract double getArea();
    
    @Override
    public String toString(){
        return "Shape[" + "color= " + this.color + "]"; 
    }
}
