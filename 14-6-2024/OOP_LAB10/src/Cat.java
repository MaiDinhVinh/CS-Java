/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Cat extends Animal implements Pet {
    private String name;
    
    public Cat(){
        super(4);
        this.name = "Null";
    }
    
    public Cat(String name){
        super(4);
        this.name = name;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public void play(){
        System.out.println("Cat play");
    }
    
    @Override
    public void eat(){
        System.out.println("cat eats fish, mouse");
    }
}
