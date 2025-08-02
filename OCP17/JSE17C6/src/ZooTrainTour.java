public interface ZooTrainTour {
    abstract int getTrainName();
    private static void ride() {}
    default void playHorn() { getTrainName(); ride(); }
//    public static void slowDown() { playHorn(); }
    static void speedUp() { ride(); }
}