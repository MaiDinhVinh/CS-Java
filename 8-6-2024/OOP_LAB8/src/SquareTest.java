/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class SquareTest {
    public static void main(String[] args){
        Square sqr1 = new Square();
        System.out.println(sqr1);
        System.out.println("Filled ?: " + sqr1.isFilled());
        System.out.println("rect1 color = " + sqr1.getColor());
        System.out.println("rect1 width= " + sqr1.getWidth());
        System.out.println("rect1 width= " + sqr1.getLength());
        System.out.println("rect1 area= " + sqr1.getArea());
        System.out.println("rect1 perimeter= " + sqr1.getPerimeter());
        sqr1.setColor("blue");
        sqr1.setFilled(false);
        sqr1.setWidth(13.44);
        sqr1.setLength(22.19);
        System.out.println("--------------------------------");
        System.out.println(sqr1);
        System.out.println("Filled ?: " + sqr1.isFilled());
        System.out.println("rect1 color = " + sqr1.getColor());
        System.out.println("rect1 width= " + sqr1.getWidth());
        System.out.println("rect1 length= " + sqr1.getLength());
        System.out.println("rect1 area= " + sqr1.getArea());
        System.out.println("rect1 perimeter= " + sqr1.getPerimeter());
        
        
    }
}
