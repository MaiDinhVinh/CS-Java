package pond.swan;
import pond.shore.Bird;
public class Swan extends Bird{
    public void swim() {
        floatInWater(); // package access to superclass
        System.out.println(text); // package access to superclass
    }
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // package access to superclass
        System.out.println(other.text);// package access to superclass
    }
    public void helpOtherBirdSwim() {
        Swan2 other = new Swan2();
        other.floatInWater(); // DOES NOT COMPILE
        //System.out.println(other.text); // DOES NOT COMPILE
    }
}

class Swan2 extends Bird{
    @Override
    protected void floatInWater(){
        System.out.println(this.text);
    }
}
