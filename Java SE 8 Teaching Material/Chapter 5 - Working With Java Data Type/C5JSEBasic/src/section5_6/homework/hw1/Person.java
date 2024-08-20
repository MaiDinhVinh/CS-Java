package section5_6.homework.hw1;


public class Person {
    int id;
    String name;
    java.util.Date dob;
    boolean VIP;

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = p1;
        int id = p2.id;
        p1.name = args[0];
    }

    public String getName(){
        return this.name;
    }
}
