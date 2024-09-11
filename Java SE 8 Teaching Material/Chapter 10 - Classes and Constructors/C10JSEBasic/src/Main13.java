/*
class Area{
    public String UNIT; //UNIT is visible all over inside the class Area

    public Area(){
        this.UNIT = "cm^2";
    }

    public void printUnit(){
        System.out.println(this.UNIT); //will print "sq mt" because UNIT is visible here
    }
}
class Volume{
    //Area's UNIT is accessible in this class but not visible to the compiler directly
    public String UNIT;

    public Volume(){
        this.UNIT = "cm^3";
    }

    public void printUnit(){
        System.out.println(this.UNIT);//will print "cu mt"
        Area demo = new Area();
        demo.printUnit(); //will print "sq mt"
    }
}

public class Main13{
    public static void main(String[] args) {
        Volume demo = new Volume();
        demo.printUnit();
    }
}
*/
