/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducksabervn
 */
public class employee {
    //attribute - instance variable
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    
    //constructor - from input 
    public employee(int id, String firstname, String lastname, int salary){
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
        return this.firstname + this.lastname;
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
    
    public void raiseSalary(int percentage){
        
        //(int)this.salary = (double)(this.salary) + ((percentage/100)*(double)(this.salary)); -- loi required variable, found value ?
    }
    
    @Override
    public String toString(){
        return "Employee" + "[" + "id = " + this.id + "name = " + getName() + "salary = " + this.salary + "]"; 
    }
}
