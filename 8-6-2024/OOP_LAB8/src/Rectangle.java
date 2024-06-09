/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Rectangle extends Shape {
    //attribute
    private double length = 1.0;
    private double width = 1.0; 
    
    //constructor - default constructor with no args
    public Rectangle(){
        this(1.0, 1.0); //neu viet ntn the thi JVM co tu dong chen super(); vao khong?
    } 
    
    //constructor - with args - ver1
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    } 
    
    //constructor - with args - ver2
    public Rectangle(double width, double length, String color, boolean filled){
//        this(width, length);
//        super(color, filled);
          //viet nhu tren bi loi la super phai dat len dau truoc sau day moi la this(...)?
          
//        super(color, filled);
//        this(width, length);
          //tai sao viet ntn van bi loi ?
        super(color, filled);
        this.width = width;
        this.length = length;
//ANSWER: Vi neu neu ca super(..) ca this(...) thi co nghia la sinh 2 lan vi goi bo o super(...) la 1 lan
//goi them this nua la len nguoc lai constructor Rectangle co 4 args => sinh them 1 lan nua
//=> sai cau truc
        
        
    }
    
    //getter
    public double getWidth(){
        return this.width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getArea(){
        return this.width * this.length;
    }
    
    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }
    
    //setter
    public void setWidth(double width){
        this.width = width;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    @Override
    public String toString(){
        return "A Rectangle with width= " + this.width + " and length= " +
                this.length + ", which is a subclass of " + super.toString();
    }
    
}
