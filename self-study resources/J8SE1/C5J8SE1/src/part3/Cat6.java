package part3;

public interface Cat6 extends Walk, Run{
    @Override
    public default int getSpeed(){ //what should I need to know about the "default" keyword ?
        return 2000;
    }
}
