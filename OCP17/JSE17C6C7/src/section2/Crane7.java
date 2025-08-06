package section2;

public record Crane7(int numberEggs, String name) {
    public Crane7 {
        if (name == null || name.length() < 1)
            throw new IllegalArgumentException();
        name = name.substring(0,1).toUpperCase()
                + name.substring(1).toLowerCase();

        //for snippet 62

//        this.numberEggs = 10;
    }
}
