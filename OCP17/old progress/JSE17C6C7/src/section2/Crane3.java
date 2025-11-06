package section2;

public record Crane3(int numberEggs, String name) { }

class Test{
    public static void main(String[] args) {
        //for snippet 53
        var mommy = new Crane3(4, "Cammy");
        System.out.println(mommy.numberEggs());
        System.out.println(mommy.name());

        //for snippet 54

//        var mommy1 = new Crane3("Cammy", 4);
//        var mommy2 = new Crane3("Cammy");

        //for snippet 55
        var father = new Crane3(0, "Craig");
        System.out.println(father);

        //for snippet 56
        var copy = new Crane3(0, "Craig");
        System.out.println(copy);
        System.out.println(father.equals(copy));
        System.out.println(father.hashCode() + ", " + copy.hashCode());

        //for snippet 57
        var cousin = new Crane3(3, "Jenny");
        var friend = new Crane3(cousin.numberEggs(), "Janeice");
    }
}