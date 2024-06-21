/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Fish extends Animal implements Pet{
    private String name;
    
    public Fish(){
        super(0);
        this.name = "unknown";
    }
    
    public Fish(String name){
        super(0);
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
        System.out.println("Fish play in water");
    }
    
    @Override
    public int getLegs(){
        System.out.println("brain issue ?");
        return 0;
    }
    
    @Override 
    public void eat(){
        System.out.println("Fish eat its own food");
    }
    
    @Override
    public void walk(){
        System.out.println("Fish cant walk");
    }
}
