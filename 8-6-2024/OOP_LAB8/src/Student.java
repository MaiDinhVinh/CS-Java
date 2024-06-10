/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */

//doan dau bi loi boi vi class Person khong co constructor
import java.util.Scanner;
public class Student extends Person{
    
    //attribute - instance variable
    private int numCourse = 0;
    private String[] courses = {};
    private int[] grades = {};
    
    //constructor with args
    public Student(String name, String address){
        super(name, address);
    }
    
    public void addCourseGrade(String course, int grade){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many course you want to add?: ");
        
    }
    
    @Override
    public String toString(){
        return "Student: " + this.getName() + "(" + this.getAddress() + ")";
    }
    
    
}
