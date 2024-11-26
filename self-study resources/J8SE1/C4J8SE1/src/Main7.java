class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight) { // first constructor
        this.weight = weight;
        color = "brown";
    }
    public Hamster(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }
}