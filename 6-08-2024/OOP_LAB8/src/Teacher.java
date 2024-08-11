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
    
    public void getArray(){
        for(String i: this.courses){
            System.out.println(i);
        }
    }
    
    public boolean addCourse(String course){
        boolean check = false;
        boolean existed = false;
        for(String i: this.courses){
            if(i == course){
                existed = true;
                break;
            }
        }
        
        
        //if no duplicate courses => adding new course
        if(existed == false){
            check = true;
            //initalizing new courses array for copying all elements from attribute array
            String[] temp_courses = new String[this.courses.length + 1];
            int temp_courses_index = 0;
            for(String j: this.courses){
                temp_courses[temp_courses_index] = j;
                temp_courses_index++;
            }
                
            //adding new course to temp array 
            temp_courses[this.courses.length] = course;
                
            //referencing this.courses to temp_courses
            this.courses = temp_courses;
        }
        
        //update numCourses
        this.numCourses = this.courses.length;
        
        return check;
    }
    
    public boolean removeCourse(String course){
        boolean check = false;
        int removePos = -1; 
        for(int i = 0; i < this.courses.length; i++){
            if(this.courses[i] == course){
                removePos = i;
            }
        }
        
        if(removePos > -1){
            check = true;
        }
        
        if(check == true){
            String[] temp_courses = new String[this.courses.length - 1];
            int temp_courses_index = 0;
            for(int i = 0; i < this.courses.length; i++){
                if(i == removePos){
                    continue;
                } else{
                    temp_courses[temp_courses_index] = this.courses[i];
                    temp_courses_index++;
                }
            }
            
            this.courses = temp_courses;
        }
        return check;
    } 
    
    @Override
    public String toString(){
        return "Teacher: " + this.getName() + "(" + this.getAddress() +
                ")";
    }
    
    
}
