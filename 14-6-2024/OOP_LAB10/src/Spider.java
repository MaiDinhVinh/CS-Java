/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Spider extends Animal{
    public Spider(){
        super(8); //default constructor with no arguments => 8 legs default
    }
    
    @Override
    public void eat(){
        System.out.println("Spider eat");
    }
    
    
}
