interface Weather { int getAverageTemperature(); }
public enum Season5 implements Weather {
    WINTER, SPRING, SUMMER, FALL;
    public int getAverageTemperature() { return 30; }
}