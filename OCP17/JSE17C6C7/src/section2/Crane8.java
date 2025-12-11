package section2;

public record Crane8(int numberEggs, String name) {
    public Crane8(String firstName, String lastName) {
        this(0, firstName + " " + lastName);
    }

    //for snippet 64

    public Crane8(int numberEggs, String firstName, String lastName) {
        this(numberEggs + 1, firstName + " " + lastName);
        numberEggs = 10; //?
//        this.numberEggs = 20;
    }
}
