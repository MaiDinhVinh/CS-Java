/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class CircleCylinderTest {
    public static void main(String[] args){
        Cylinder demo1 = new Cylinder(2.9, 10);
        
        System.out.println(demo1);
        System.out.println("area= " + demo1.getArea());
        System.out.println("perimeter= " + demo1.getPerimeter());
        System.out.println("radius= " + demo1.getRadius());
    }
}
