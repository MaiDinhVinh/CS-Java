public class Bunny {
    private String color;
    private int height;
    private int length;
    public Bunny(int length, int theHeight) {
        length = this.length; //what is special about this code ?
        height = theHeight; // what is special about this code ?
        this.color = "white";
    }
    public static void main(String[] args) {
        Bunny b = new Bunny(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);
    }
}