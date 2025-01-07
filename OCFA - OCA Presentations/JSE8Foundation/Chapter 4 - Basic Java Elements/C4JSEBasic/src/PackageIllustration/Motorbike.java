//THIS IS FOR SECTION 4.3 (THIS IS FOR SECTION 4.4.3)
package PackageIllustration;

public class Motorbike {
    private String brand;
    private int speed;
    private int id;


    public Motorbike(String brand){
        this.brand = brand;
        this.speed = 0;
        this.id = 1234;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getID(){
        return this.id;
    }

    @Override
    public String toString(){
        return "brand: " + this.brand + ", " +
                "ID: " + this.id + ", " +
                "current speed: " + this.speed;
    }
}
