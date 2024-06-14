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
        
        //copy toan bo gia tri tu array attribute cua Student sang temp arr
        //note: ve logic neu nhu khong co mon hoc => khong co diem va nguoc lai
//        if(this.courses.length == 0 && this.grades.length == 0){
//            /*neu nhu chua khai bao course => arr.length = 0 
//            => khong co mon hoc va diem mon hoc => them 1 mon moi 
//            => chi can arr.length = 1*/
//            temp_courses = new String[1];
//            temp_grades = new int[1];
//            temp_courses[0] = course;
//            temp_grades[0] = grade;
//            
//            //khai bao lai array courses voi length moi
//            this.courses = new String[temp_courses.length];
//            int original_courses_index = 0;
//            for(String i: temp_courses){
//                this.courses[original_courses_index] = i;
//                original_courses_index++;
//            }
//            
//            //khai bao lai array grades voi length moi 
//            this.grades = new int[temp_grades.length];
//            int original_grades_index = 0;
//            for(int g: temp_grades){
//                this.grades[original_grades_index] = g;
//                original_grades_index++;
//            }
//        } else{
            /*neu khong se chi co truong hop so mon hoc = so diem mon hoc
            tuong ung*/
            
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
            
            //khai bao lai array courses moi dua tren length moi
//            this.courses = new String[temp_courses.length];
//
//            //add lai ten course vao array this.courses
//            int original_courses_index = 0;
//            for(String str: temp_courses){
//                this.courses[original_courses_index] = str;
//                original_courses_index++;
//            }
            
            this.courses = temp_courses; //reference tu this.courses vao temp_courses
            this.grades = temp_grades; //refernce tu this.grades vao temp_grades;
            
//            //khai bao lai array grades voi length moi
//            this.grades = new int[temp_grades.length];
//            
//            //add lai diem courses vao array this.grades
//            int original_grades_index = 0;
//            for(int g: temp_grades){
//                this.grades[original_grades_index] = g;
//                original_grades_index++;
//            }
           
//        }
        
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
