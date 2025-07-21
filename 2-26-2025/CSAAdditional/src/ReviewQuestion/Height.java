package ReviewQuestion;

public class Height {
    private int feet;
    private int inches;

    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
        simplify();
    }

    public Height(int inches) {
        this(0, inches);
    }

    public int getFeet() {
        return this.feet;
    }

    public int getInches() {
        return this.inches;
    }

    public void simplify() {
            this.feet += this.inches / 12; //chia lay thuong de lay so feet
            this.inches %= 12; //chia lay du de lay so inch con lai
    }

    public void add(int inches){
        this.inches += inches;
        this.simplify();
    }

    public void add(Height ht){
        this.feet += ht.getFeet();
        this.inches += ht.getInches();
        this.simplify();
    }

    @Override
    public String toString(){
        return this.feet + " feet " + this.inches + " inches";
    }

    public static void main(String[] args) {
        Height h1 = new Height(12, 1);
        Height h2 = new Height(1, 1);
        Height h3 = new Height(23, 34);

        //h1 test
        System.out.println("h1 = " + h1);
        h1.add(10);
        System.out.println("h1 = " + h1);
        h1.add(34);
        System.out.println("h1 = " + h1);
        h1.add(1);
        System.out.println("h1 = " + h1);
        Height h1Add = new Height(12, 1);
        Height h2Add = new Height(1, 1);
        Height h3Add = new Height(23, 34);
        h1.add(h1Add);
        System.out.println("h1 = " + h1);
        h1.add(h2Add);
        System.out.println("h1 = " + h1);
        h1.add(h3Add);
        System.out.println("h1 = " + h1);
    }
}
