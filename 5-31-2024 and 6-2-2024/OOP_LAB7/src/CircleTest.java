/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class CircleTest {
    public static void main(String[] args){
        Circle demo1 = new Circle(10);  
        System.out.println(demo1.getRadius());
        demo1.setRadius(100);
        System.out.println(demo1.getRadius());
        System.out.println(demo1.getArea());
        System.out.println(demo1.getCircumference());
        System.out.println(demo1);
    }
}
