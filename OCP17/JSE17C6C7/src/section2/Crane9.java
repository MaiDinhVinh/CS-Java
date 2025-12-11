package section2;

public record Crane9(int numberEggs, String name) {
    @Override public int numberEggs() { return 10; }
    @Override public String toString() { return name; }

    //for snippet 66

    private static int type = 10;
//    public int size;
//    private boolean friendly;
}
