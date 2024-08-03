package test1;

class Xemay{
    private int speed; //instance variable
    private String brand;

    public Xemay(){
        this.speed = 0;
        this.brand = "honda";
    }
    //accessor or getter
    public int getSpeed(){
        return this.speed;
    }
    //mutator or setter
    public void changeSpeed(int Speed){
        this.speed = Speed;
    }
}

