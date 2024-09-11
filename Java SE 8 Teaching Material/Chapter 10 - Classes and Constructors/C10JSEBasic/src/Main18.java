/*
class Person{
    private String name; //name is class scoped
    public static void main(String[] args){
        String name = "bob"; //method scope. OK. Overlaps with the instance field name defined in the class
        int i = -1; //method scope
        for(int i = 0; i<10; i++){ //i has for loop scope. Not OK
            String name = "john"; //block scope. Not OK.
        }
        { //starting a new block here
            int i = 2; //block scope. Not OK.
        }
    }
}*/
