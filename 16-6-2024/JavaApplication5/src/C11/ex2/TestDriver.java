/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C11.ex2;

/**
 *
 * @author vingi
 */
public class TestDriver {
    public static void main(String[] args){
        Circle cir1 = new Circle(4.0, "black");
        Cylinder cy1 = new Cylinder(cir1, 6.0);
        System.out.println(cir1);
        System.out.println(cy1);
        System.out.println(cir1.getRadius());
        System.out.println(cir1.getColor());
        System.out.println(cir1.getPerimeter());
        System.out.println(cir1.getArea());
        System.out.println(cy1.getHeight());
//        System.out.println(cy1.getRadius());
        System.out.println(cy1.getVolume());
    }
}
