class InitializationOrder {
    private String name = "Torchie";
    { System.out.println(name); }
    private static int COUNT = 0;
    static{
        System.out.println(COUNT);
    }

    {
        COUNT++; System.out.println(COUNT);
    }

    public InitializationOrder() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("read to construct");
        new InitializationOrder();
    }
}