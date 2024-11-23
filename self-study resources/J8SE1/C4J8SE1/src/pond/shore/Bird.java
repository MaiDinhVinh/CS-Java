package pond.shore;

public class Bird {
    protected String text = "floating"; // protected access
    protected void floatInWater() { // protected access
        System.out.println(text);
    }
}

class Swan extends Bird{
    public void swim() {
        floatInWater(); // package access to superclass
        System.out.println(text); // package access to superclass
    }
    public void helpOtherSwanSwim() {
        pond.swan.Swan other = new pond.swan.Swan();
        other.floatInWater(); // package access to superclass
        System.out.println(other.text);// package access to superclass
    }
    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        other.floatInWater(); // DOES NOT COMPILE
        System.out.println(other.text); // DOES NOT COMPILE
    }
}



