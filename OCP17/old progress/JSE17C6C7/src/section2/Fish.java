package section2;

class Bird2 {}
public class Fish extends Bird2{
    public static void main(String[] args) {
//        Fish fish = new Fish();
//        if (fish instanceof Bird2 b) {
//            // Do stuff
//        }
        Bird2 b = new Bird2();
        if (b instanceof Fish){
            //do stuff
        }
    }
}
