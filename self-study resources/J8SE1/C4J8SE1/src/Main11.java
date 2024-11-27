class InitializationOrderSimple {
    private String name = "Torchie";
    { System.out.println(name); }
    public static int COUNT = 0;
    static{
        System.out.println(COUNT + "In static 1");
    }
    static{
        COUNT += 10;
        System.out.println(COUNT + "In static 2");
    }
    public InitializationOrderSimple() {
        System.out.println("constructor");
    }
}

class CallInitializationOrderSimple{
    public static void main(String[] args) {
        InitializationOrderSimple init = new InitializationOrderSimple();
    }
}