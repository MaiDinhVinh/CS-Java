public interface Walk {
    public default int getSpeed() { return 5; }
}
interface Run {
    public default int getSpeed() { return 10; }
}
//class Cat implements Walk, Run {}

class Cat2 implements Walk, Run{
    @Override
    public int getSpeed(){
        return 200;
    }
}

//for snippet 24

class Cat3 implements Walk, Run{
    @Override
    public int getSpeed(){
        return 200;
    }

    public int getWalkSpeed(){
        return Walk.super.getSpeed();
    }
}
