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
        String[] courses = {"CS30", "CS30", "MATH2", "PSY1", "LAB4", "LIT4"};
        for(String course: courses){
            if(demo1.addCourse(course)){
                System.out.println(course + " added");
            } else{
                System.out.println(course + " cannot be added");
            }
        }
        
        demo1.getArray();
        
        System.out.println("------------------------------");
        for(String course: courses){
            if(demo1.removeCourse(course)){
                System.out.println(course + " removed");
            } else{
                System.out.println(course + " cannot be removed");
            }
        }
        
        demo1.getArray();
    }
}
