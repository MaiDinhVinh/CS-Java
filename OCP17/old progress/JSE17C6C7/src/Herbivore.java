public interface Herbivore {
    public void eatPlants();
}

interface Omnivore {
    public void eatPlants();
}

class Bear2 implements Herbivore, Omnivore {
    public void eatPlants() {
    System.out.println("Eating plants");
    }
}