package part1;

public class Wolf extends Canine {
    @Override
    public double getAverageWeight() {
        return super.getAverageWeight()+20; //what happen if we remove "super" ?
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}
