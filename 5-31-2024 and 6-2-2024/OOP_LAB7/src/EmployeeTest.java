/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1 = new Employee(1234, "John", "Cena", 1000);
        System.out.println("id: " + emp1.getID());
        System.out.println("firstname: " + emp1.getFirstname());
        System.out.println("Lastname: " + emp1.getLastname());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Annual salary: " + emp1.getAnnualSalary());
        emp1.setSalary(1500);
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Annual salary: " + emp1.getAnnualSalary());
        emp1.raiseSalary(70);
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Annual salary: " + emp1.getAnnualSalary());
        System.out.println(emp1);
    }
}
