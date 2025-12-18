public class Main5 {
    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e + "\n");
            System.out.println(e.getMessage()+ "\n");
            e.printStackTrace();
        }
    }
    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
}
