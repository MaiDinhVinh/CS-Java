/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Point2D {
    //attribute - instance variable
    private int x = 0;
    private int y = 0;
    
    //constructor - no argument or default constructor
    public Point2D(){
//        this.x = 0;
//        this.y = 0;
        this(0, 0);
    }
    
    //constructor - have argument
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //getter
    public int getX(){
        return this.x;
    } 
    
    public int getY(){
        return this.y;
    }
    
    //setter
    public void setX(int x){
        this.x = x;
    } 
    
    public void setY(int y){
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}
