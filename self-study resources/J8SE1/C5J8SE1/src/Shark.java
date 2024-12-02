class Fish {
    protected int size;
    private int age;
    public Fish(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

public class Shark extends Fish{
    private int numberOfFins = 8;
    public Shark(int age) {
        super(age);
        this.size = 4;
    }
    public void displaySharkDetails() {
        //original code
        /*System.out.print("Shark with age: "+getAge()); //explain this code
        System.out.print(" and "+size+" meters long"); //explain this code
        System.out.print(" with "+numberOfFins+" fins"); //explain this code*/

        //version 2
        /*System.out.print("Shark with age: "+this.getAge()); //explain this code
        System.out.print(" and "+this.size+" meters long"); //explain this code
        System.out.print(" with "+this.numberOfFins+" fins"); //explain this code*/

        //version 3
        /*System.out.print("Shark with age: "+super.getAge()); //explain this code
        System.out.print(" and "+super.size+" meters long"); //explain this code
        System.out.print(" with "+this.numberOfFins+" fins"); //explain this code*/

        //version 4
        /*System.out.print("Shark with age: "+super.getAge()); //explain this code
        System.out.print(" and "+super.size+" meters long"); //explain this code
        System.out.print(" with "+super.numberOfFins+" fins"); //explain this code*/
    }
}
