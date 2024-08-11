/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class PersonTest {
    public static void main(String[] args){
        Person demo1 = new Person("test", "demo add 1234");
        System.out.println(demo1);
        System.out.println("Name= " + demo1.getName());
        System.out.println("Address= " + demo1.getAddress());
        demo1.setAddress("example 4321");
        System.out.println("------------------------------");
        System.out.println(demo1);
        System.out.println("Name= " + demo1.getName());
        System.out.println("Address= " + demo1.getAddress());
    }
}
