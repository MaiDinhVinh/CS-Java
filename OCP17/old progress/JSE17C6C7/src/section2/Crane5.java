package section2;

public record Crane5(int numberEggs, String name) {
    public Crane5(int numberEggs, String name) {
        if (numberEggs < 0) throw new IllegalArgumentException();
        this.numberEggs = numberEggs;
        this.name = name;
    }
}
