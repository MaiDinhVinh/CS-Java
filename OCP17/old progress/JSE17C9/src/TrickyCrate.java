public class TrickyCrate<T> {
    public <T> T tricky(T t) {
        return t;
    }

    public static String crateName() {
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky("bot");
    }

}
