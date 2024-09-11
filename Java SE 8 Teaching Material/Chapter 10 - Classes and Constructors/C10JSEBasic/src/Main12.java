/*
class Area{
    public static String UNIT="sq mt"; //UNIT is visible all over inside the class Area
    public void printUnit(){
        System.out.println(UNIT); //will print "sq mt" because UNIT is visible here
    }
}
class Volume{
    //Area's UNIT is accessible in this class but not visible to the compiler directly
    public static String UNIT="cu mt";
    public void printUnit(){
        System.out.println(UNIT); //will print "cu mt"
        System.out.println(Area.UNIT); //will print "sq mt"
    }
}
*/
