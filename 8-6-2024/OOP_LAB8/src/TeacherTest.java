/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class TeacherTest {
    public static void main(String[] args){
        Teacher demo1 = new Teacher("nam cao", "example4321");
        String[] courses = {"CS30", "MATH2", "LAB101"};
        for(String course: courses){
            if(demo1.addCourse(course)){
                System.out.println(course + " added");
            } else{
                System.out.println(course + " cannot be added");
            }
        }
        
        for(String course: courses){
            if(demo1.removeCourse(course)){
                System.out.println(course + " removed");
            } else{
                System.out.println(course + " cannot be removed");
            }
        }
    }
}
