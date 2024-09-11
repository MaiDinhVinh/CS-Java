/*
class Person {
    private String name; //class scope
    static String name = "rob"; //class scope. NOT OK because name with class scope already exists

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String name = "john"; //OK. name is scoped only within this for loop block
        }
        String name = "bob"; //OK. name is method scoped
        System.out.println(name); //will print bob
    }
}*/
