package HW;

import java.time.LocalDate;


public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private String country;

    public Person(String firstName, String lastName, String gender, int birthYear, String country){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.country = country;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getGender(){
        return this.gender;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    public String getCountry(){
        return this.country;
    }

    //own method
    public int getAge(){
        int currentYear = LocalDate.now().getYear();
        return currentYear - this.birthYear;
    }

    @Override
    public String toString(){
        return "Person[" + "name= " + this.firstName + " " + this.lastName + ", " + "gender= " + this.gender +
                ", " + "birthYear= " + this.birthYear + ", " + "age= " + this.getAge() + ", " + "country= " +
                this.country + "]";
    }
}





