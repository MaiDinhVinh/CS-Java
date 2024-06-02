/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducksabervn
 */
public class employeeTest {
    public static void main(String[] args){
        Employee emp1 = new Employee(1234, "John", "Cena", 1000);
        System.out.println("Begin Salary: " + emp1.getSalary());
        
        emp1.raiseSalary(7);
        System.out.println("Salary after: " + emp1.getSalary());
        
        
    }
}
