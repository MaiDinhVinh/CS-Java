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
        
        //tao ra 2 array tam thoi de luu mon hoc va diem mon hoc moi
        String[] temp_courses;
        int[] temp_grades;
        
            
            //khai bao 2 array moi dua tren do dai array cu
            temp_courses = new String[this.courses.length + 1];
            temp_grades = new int[this.grades.length + 1];
            
            //copy mon hoc tu courses array qua temp_courses array
            int temp_courses_index = 0;
            for(String i: this.courses){
                temp_courses[temp_courses_index] = i;
                temp_courses_index++;
            } 
            //add them course tu argument method
            temp_courses[this.courses.length] = course;
            
            //copy diem mon hoc tu grades array qua temp_grades_arrays
            int temp_grades_index = 0;
            for(int j: this.grades){
                temp_grades[temp_grades_index] = j;
                temp_grades_index++;
            }
            //add them diem cua course tu argument method
            temp_grades[this.grades.length] = grade;
            
            
            this.courses = temp_courses; //reference tu this.courses vao temp_courses
            this.grades = temp_grades; //refernce tu this.grades vao temp_grades;

        
        //chinh lai so luong mon hoc
        this.numCourse = this.courses.length;
    }
    
    public void printGrades(){
        for(int i: grades){
            System.out.println("Grade: " + i);
        }
    }
    
    public double getAverageGrade(){
        double sum = 0;
        for(int i: grades){
            sum += i;
        }
        
        return sum / this.numCourse;
    }
    
    public int getNumCourse(){
        return this.numCourse;
    }
    
    public void getArray(){
        for(String course: this.courses){
            System.out.println(course);
        }
    }
    
    @Override
    public String toString(){
        return "Student: " + this.getName() + "(" + this.getAddress() + ")";
    }
    
    
}
