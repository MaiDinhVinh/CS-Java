public abstract class Canine2 {
    public abstract String getSound();
    public void bark() { System.out.println(getSound()); }
}
class Wolf2 extends Canine2 {
    public String getSound() {
        return "Wooooooof!";
    } }
class Fox2 extends Canine2 {
    public String getSound() {
        return "Squeak!";
    } }
class Coyote2 extends Canine2 {
    public String getSound() {
        return "Roar!";
    } }
//for snippet 16

class A extends Coyote2{
    @Override
    public String getSound(){
        return "Hello";
    }
}

class Test{
    public static void main(String[] args) {
        Canine2 c = new Wolf2();
        c.bark();
        c = new Fox2();
        c.bark();
        c = new Coyote2();
        c.bark();

        //for snippet 16

        c = new A();
        c.bark();

        Coyote2 coy = new A();
        coy.bark();
    }
}
