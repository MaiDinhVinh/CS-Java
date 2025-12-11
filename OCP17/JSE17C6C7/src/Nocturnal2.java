public interface Nocturnal2 {
    public int hunt();
}
interface CanFly {
    public void flap();
    public int hunt();
}
interface HasBigEyes2 extends Nocturnal2, CanFly {}

class hello implements HasBigEyes2{
    @Override
    public int hunt(){
        return 1;
    }

    @Override
    public void flap(){
        System.out.println("hello");
    }
}