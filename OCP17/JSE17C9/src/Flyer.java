import java.util.List;

public interface Flyer {
}
class HangGlider implements Flyer { public void fly() {} }
class Goose implements Flyer { public void fly() {} }
class Test{
    private void anyFlyer(List<Flyer> flyer) {}
    private void groupOfFlyers(List<? extends Flyer> flyer) {}
}
