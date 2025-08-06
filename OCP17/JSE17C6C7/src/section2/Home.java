package section2;

public class Home {
    private String greeting = "Hi";

    protected class Room {
        public int repeat = 3;
        public void enter() {
            for (int i = 0; i < repeat; i++) greet(greeting);
        }
        private static void greet(String message) {
            System.out.println(message);
        }
    }

    public void enterRoom() {
        var room = new Room();
        room.enter();
    }
    public static void main(String[] args) {
        var home = new Home();
        home.enterRoom();

        //for snippet 68

//        var home = new Home();
//        Room room = home.new Room();
//        room.enter();

        //for snippet 69
        new Home().new Room().enter();
    }
}
