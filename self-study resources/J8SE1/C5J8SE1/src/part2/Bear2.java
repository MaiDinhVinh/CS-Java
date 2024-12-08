package part2;

public class Bear2 implements Herbivore3, Omnivore2{
    @Override
    public int eatPlants(int quantity) {
        System.out.println("Eating plants: "+quantity);
        return quantity;
    }
    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
