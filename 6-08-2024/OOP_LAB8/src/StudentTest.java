/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class StudentTest {
    public static void main(String[] args){
        Student demo1 = new Student("bach viet le", "example 1234");
        System.out.println(demo1);
        demo1.addCourseGrade("CS50", 97);
        demo1.addCourseGrade("PSY1", 68);
        demo1.printGrades();
        demo1.getArray();
        System.out.println("numcourse = " + demo1.getNumCourse());
        System.out.println("avg = " + demo1.getAverageGrade());
    }
}
