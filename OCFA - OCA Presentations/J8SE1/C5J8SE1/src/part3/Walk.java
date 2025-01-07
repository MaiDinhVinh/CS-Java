package part3;

public interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
