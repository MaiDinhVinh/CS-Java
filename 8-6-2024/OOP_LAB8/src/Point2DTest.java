/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Point2DTest {
    public static void main(String[] args){
        Point2D coord1 = new Point2D(1, 2);
        System.out.println("coord1 = " + coord1);
        System.out.println("x - coord1 = " + coord1.getX());
        System.out.println("y - coord1 = " + coord1. getY());
        System.out.println(coord1);
        System.out.println("-----------------------");
        coord1.setX(3);
        coord1.setY(10);
        System.out.println(coord1);
        System.out.println("x - coord1 = " + coord1.getX());
        System.out.println("y - coord1 = " + coord1. getY());
    }
}
