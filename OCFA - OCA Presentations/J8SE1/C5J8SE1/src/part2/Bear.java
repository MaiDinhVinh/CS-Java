package part2;

public class Bear implements Herbivore2, Omnivore{
    @Override
    public void eatMeat() {
        System.out.println("Eating meat");
    }
    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
