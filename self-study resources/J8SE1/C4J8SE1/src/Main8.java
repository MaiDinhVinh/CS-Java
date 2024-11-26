class Hamster2 {
    private String color;
    private int weight;
    public Hamster2(int weight) { // first constructor
        //old code
        /*this.weight = weight;
        color = "brown";*/

        this(weight, "brown"); //new code
    }
    public Hamster2(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }
}