public interface Nocturnal2 {
    public int hunt();
}
interface CanFly {
    public void flap();
}
interface HasBigEyes2 extends Nocturnal2, CanFly {}