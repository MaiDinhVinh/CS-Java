package part3;
//when do we use "Override" keyword with interface ?
public interface SharkFamily extends HasFins{
    public default int getNumberOfFins() {
        return 8; //why is there a default keyword here ?
    }
    public double getLongestFinLength();
    /*public boolean doFinsHaveScales() {
        return false;
    }*/
}
