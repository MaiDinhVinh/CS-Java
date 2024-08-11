/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Test2 {
    public static void main(String[] args){
        Movable point1 = new MovablePoint(0, 0);
        
        System.out.println(point1);
//        point1.moveUp();
        point1.moveDown();
        point1.moveLeft();
//        point1.moveRight();
        System.out.println(point1);
        
    }
}
