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
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("Filled ?: " + circle1.isFilled());
        System.out.println("circle1 color = " + circle1.getColor());
        System.out.println("circle1 radius= " + circle1.getRadius());
        System.out.println("circle1 area= " + circle1.getArea());
        System.out.println("circle1 perimeter= " + circle1.getPerimeter());
        circle1.setColor("blue");
        circle1.setFilled(false);
        circle1.setRadius(10.25);
        System.out.println("--------------------------------");
        System.out.println(circle1);
        System.out.println("Filled ?: " + circle1.isFilled());
        System.out.println("circle1 color = " + circle1.getColor());
        System.out.println("circle1 radius= " + circle1.getRadius());
        System.out.println("circle1 area= " + circle1.getArea());
        System.out.println("circle1 perimeter= " + circle1.getPerimeter());
    }
}
