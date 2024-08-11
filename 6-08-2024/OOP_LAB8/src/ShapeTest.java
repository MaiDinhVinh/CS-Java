/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class ShapeTest {
    public static void main(String[] args){
        Shape demo1 = new Shape("Black", true);
        System.out.println(demo1);
        System.out.println("Filled ?: " + demo1.isFilled());
        System.out.println("demo1 color = " + demo1.getColor());
        demo1.setColor("blue");
        demo1.setFilled(false);
        System.out.println("--------------------------------");
        System.out.println(demo1);
        System.out.println("Filled ?: " + demo1.isFilled());
        System.out.println("demo1 color = " + demo1.getColor());
    }
}
