package section2;

public class Fox {
    private class Den {}
    public void goHome() {
        new Den();
    }
    public static void visitFriend() {
//        new Den();
    }
}
class Squirrel {
    public void visitFox() {
//        new Den();
    }
}
