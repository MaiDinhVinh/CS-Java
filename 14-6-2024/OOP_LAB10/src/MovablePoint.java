/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class MovablePoint implements Movable{
    //attribute - instance variable
    private int x;
    private int y;
    
    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "Point[" + "x= " + this.x + ", " + 
                "y= " + this.y + "]";
    }
    
    @Override
    public void moveUp(){
        y++;
    }
    
    @Override
    public void moveDown(){
        y--;
    }
    
    @Override
    public void moveLeft(){
        x--;
    }
    
    @Override
    public void moveRight(){
        x++;
    }
}
