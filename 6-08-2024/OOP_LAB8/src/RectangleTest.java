/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class RectangleTest {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(1.543, 9.023, "nigga", true);
        System.out.println(rect1);
        System.out.println("Filled ?: " + rect1.isFilled());
        System.out.println("rect1 color = " + rect1.getColor());
        System.out.println("rect1 width= " + rect1.getWidth());
        System.out.println("rect1 width= " + rect1.getLength());
        System.out.println("rect1 area= " + rect1.getArea());
        System.out.println("rect1 perimeter= " + rect1.getPerimeter());
        rect1.setColor("blue");
        rect1.setFilled(false);
        rect1.setWidth(13.44);
        rect1.setLength(22.19);
        System.out.println("--------------------------------");
        System.out.println(rect1);
        System.out.println("Filled ?: " + rect1.isFilled());
        System.out.println("rect1 color = " + rect1.getColor());
        System.out.println("rect1 width= " + rect1.getWidth());
        System.out.println("rect1 length= " + rect1.getLength());
        System.out.println("rect1 area= " + rect1.getArea());
        System.out.println("rect1 perimeter= " + rect1.getPerimeter());
    }
}
