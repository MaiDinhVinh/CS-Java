package pond.swan;
import pond.shore.Bird;
public class Swan extends Bird{
    public void swim() {
        floatInWater();
        System.out.print(text);
        }
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.print(other.text);
        }
    public void helpOtherBirdSwim() {
        a other = new a();
        other.floatInWater();
        System.out.print(other.text);
        }
}

class a extends Swan{

}
