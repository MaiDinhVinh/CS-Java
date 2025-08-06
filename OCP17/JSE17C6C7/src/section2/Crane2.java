package section2;

public final class Crane2 {
    private final int numberEggs;
    private final String name;
    public Crane2(int numberEggs, String name) {
        if (numberEggs >= 0) this.numberEggs = numberEggs; // guard condition
        else throw new IllegalArgumentException();
        this.name = name;
    }
    public int getNumberEggs() {
        return numberEggs;
    }
    public String getName() {
        return name;
    }
}