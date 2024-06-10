/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Person {
    
    //attribute - instance variable
    private String name;
    private String address;
    
    //constructor with args
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    //getter
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    //setter
    public void setAddress(String address){
        this.address = address;
    }
    
    @Override
    public String toString(){
        return this.name + "(" + this.address + ")";
    }
}
