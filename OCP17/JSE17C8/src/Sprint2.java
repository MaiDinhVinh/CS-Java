//Which interface below is a Functional Interface ?

@FunctionalInterface
public interface Sprint2 {
    public void sprint(int speed);
}
interface Dash extends Sprint2 {}
interface Skip extends Sprint2 {
    void skip();
}
interface Sleep {
    private void snore() {}
    default int getZzz() { return 1; }
}
interface Climb {
    void reach();
    default void fall() {}
    static int getBackUp() { return 100; }
    private static boolean checkHeight() { return true; }
}