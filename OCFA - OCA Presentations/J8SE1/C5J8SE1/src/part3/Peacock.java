package part3;

public class Peacock extends Bird2{
    public String getName() {
        return "Peacock";
    }
    public static void main(String[] args) {
        Bird2 bird2 = new Peacock();
        bird2.displayInformation();
    }
}
