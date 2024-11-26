class YetMoreInitializationOrder {
    static { add(2); }
    static void add(int num) { System.out.print(num + " "); }
    YetMoreInitializationOrder() { add(5); }
    static { add(4); }
    { add(6); }
    static { new YetMoreInitializationOrder(); }
    {  add(8); }
    public static void main(String[] args){
    }
}