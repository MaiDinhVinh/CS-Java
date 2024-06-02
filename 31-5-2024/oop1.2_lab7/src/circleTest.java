/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducksabervn
 */
public class circleTest {
    public static void main(String[] args){
        Circle demo1 = new Circle();
        System.out.println("demo1 radius: " + demo1.getRadius());
        
        Circle demo2 = new Circle(3.2345);
        System.out.println("demo2 radius: " + demo2.getRadius());
        
//        demo1.setRadius(100);
//        demo2.setRadius(23);
//        System.out.println("demo1 radius: " + demo1.getRadius());
//        System.out.println("demo2 radius: " + demo2.getRadius());
        System.out.println("Area = " + demo2.getArea());
        System.out.println("Circumference = " + demo2.getCircum());
        System.out.println(demo1);
        System.out.println(demo2);
    }
}
