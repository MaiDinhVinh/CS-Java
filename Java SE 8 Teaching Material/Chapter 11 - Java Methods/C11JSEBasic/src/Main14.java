/*
class InstanceCounter {
    static int count;

    InstanceCounter() {
//directly accessing count from a constructor
        int count = 9;
        InstanceCounter.count++;
        System.out.println(count);
    }

    static void printCount() {
//directly accessing count from a static method
        System.out.println(count);
    }

    void reduceCount() {
        //directly accessing count from an instance method
        count--;
    }

    public static void main(String[] args) {
        InstanceCounter demo = new InstanceCounter();
        System.out.println(InstanceCounter.count);
    }
}
*/
