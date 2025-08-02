public abstract class Animal {
    abstract String getName();
}
abstract class BigCat extends Animal {
    protected abstract void roar();
}
class Lion extends BigCat {
    public String getName() {
        return "Lion"; //explain
    }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!"); //explain
    }
}