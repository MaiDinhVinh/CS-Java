package section2;

interface Bird {int a();}
public record Crane4(int numberEggs, String name) implements Bird {
    @Override
    public int a(){
        return 1;
    }
}
