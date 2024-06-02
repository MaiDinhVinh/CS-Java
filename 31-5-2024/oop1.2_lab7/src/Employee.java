/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducksabervn
 */
public class Employee {
    //attribute - instance variable
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    
    //constructor - from input 
    public Employee(int id, String firstname, String lastname, int salary){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    
    //getter
    public int getID(){
        return this.id;
    }
    
    public String getFirstname(){
        return this.firstname;
    }
    
    public String getLastname(){
        return this.lastname;
    }
    
    public String getName(){
        return this.firstname + " " + this.lastname;
    }
    
    public int getSalary(){
        return this.salary;
    }
    
    public int getAnnualSalary(){
        return 12 * this.salary;
    }
    
    //setter
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public int raiseSalary(int percentage){
        
        //System.out.println((double)percentage/100*this.salary + this.salary);
        this.salary = (int)(percentage/100.0*this.salary + this.salary);
        return this.salary;
    }
    
    @Override
    public String toString(){
        return "Employee" + "[" + "id = " + this.id + "name = " + getName() + "salary = " + this.salary + "]"; 
    }
}
