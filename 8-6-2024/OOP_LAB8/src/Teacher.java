/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Teacher extends Person{
    
    //attribute - instance variables
    private int numCourses = 0;
    private String[] courses = {};
    
    //constructor with args
    public Teacher(String name, String address){
        super(name, address);
    }
    
    public boolean addCourse(String course){
        boolean check = false;
        for(String i: courses){
            if(course == i){
                check = true;
                break;
            } 
        }
        return check;
    } //phai add them course
    
    public boolean removeCourse(String course){
        boolean check = false;
        for(String i: courses){
            if(course == i){
                check = true;
                break;
            }
        }
        return check;
    } //phai remove course
    
    @Override
    public String toString(){
        return "Teacher: " + this.getName() + "(" + this.getAddress() +
                ")";
    }
    
    
}
