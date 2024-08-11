/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Rectangle extends Shape{
    //attribute - instance variable
    private int length;
    private int width;
    
    //constructor - default constructor with no args
    public Rectangle(){
        this(1, 1);
        this.setColor("white");
    }
    
    //constructor with args - ver1
    public Rectangle(int length, int width){
        this.setColor("white");
        this.length = length;
        this.width = width;
    }
    
    //constructor with args - ver2
    public Rectangle(int length, int width, String color){
        this(length, width);
        this.setColor(color);
    }
    
    //getter - polymorphism
    @Override
    public double getArea(){
        return (double)(this.length * this.width);
    }
    
    @Override
    public String toString(){
        return "Rectangle[" + "length= " + this.length + ", " +
                "width= " + this.width + ", " + super.toString()
                + "]";
    }
    //QUESTION: vi sao method toString cua bo da duoc con thua ke lai
    //nhung dung this.toString() thi bi loi ?, co phai sau khi viet
    //@Override thi cai method nay ngay lap tuc bi ghi de co dung khong
    //?
}
