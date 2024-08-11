/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Point3DTest {
    public static void main(String[] args){
        Point3D coord3d = new Point3D();
        System.out.println(coord3d);
        System.out.println("coord3d - x = " + coord3d.getX());
        System.out.println("coord3d - y = " + coord3d.getY());
        System.out.println("coord3d - z = " + coord3d.getZ());
        System.out.println("-------------------------------");
        coord3d.setX(3);
        coord3d.setY(1);
        coord3d.setZ(8);
        System.out.println(coord3d);
        System.out.println("coord3d - x = " + coord3d.getX());
        System.out.println("coord3d - y = " + coord3d.getY());
        System.out.println("coord3d - z = " + coord3d.getZ());
    }
}
