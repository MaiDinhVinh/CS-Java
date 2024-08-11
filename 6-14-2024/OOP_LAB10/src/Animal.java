/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public abstract class Animal {
    //attribute - instance variable
    protected int legs;
    
    protected Animal(int legs){
        this.legs = legs;
    }
    
    public void walk(){
        System.out.println("an animal walking");
    }
    
    public int getLegs(){
        return this.legs;
    }
    
    public abstract void eat();
}
