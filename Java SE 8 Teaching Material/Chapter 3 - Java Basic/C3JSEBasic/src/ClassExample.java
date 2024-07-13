/*
- The "Car" class "captures" the details of a car => This is "Abstraction" process, which capturing
the details of an entity or concept => When car details has been captured => many instances of
the car could be created

- The "Dealership" class also the same with "Car" class => all details of a Dealership entity
has been captured => "Abstraction" process

- Notice that this is not "Car object" and "Dealership object", these are just "classes" where
we define the attributes of the object and define how they will behave
 */

class Car{
    String make; String model; int year;
}

class Dealership{
    java.util.ArrayList<Car> cars = new java.util.ArrayList<>();
    void addCar(Car c){ cars.add(c); }
    void removeCar(Car c){ cars.remove(c); }
    void printCars(){
        for(Car c: cars){
            System.out.println("Make: "+c.make+"Model: "+c.model+"Year: "+c.year);
        }
    }
}
