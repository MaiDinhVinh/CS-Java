//THIS IS FOR SECTION 4.4 (THIS IS FOR SECTION 4.4.3)
package com.fpt;
import java.util.Date;
public class Student {
    private static int count = 0; //static field
    private String studentID; //instance field

    static{ //static initializer
        System.out.println("com.fpt.Student class loaded");
    }

    //instance initializer
    {
        Student.count++;
        System.out.println("com.fpt.Student count incremented");
    }

    public Student(String id){
        this.studentID = id;
        System.out.println(new Date() + " com.fpt.Student instance created. Total students created = " + count);
    }

    @Override
    public String toString(){
        return "com.fpt.Student[studentID: " + this.studentID + "]";
    }

    public static void main(String[] args) {
        Student s = new Student("A1234");
        System.out.println(s);
    }

}
