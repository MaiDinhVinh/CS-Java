class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }
public class Main2{
    /*public void visitPorcupine() {
        try {
            //seeAnimal();
        } catch (AnimalsOutForAWalk e) {
            System.out.print("try back later");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
    }*/

    /*public void visitMonkeys() {
        try {
            //seeAnimal();
        } catch (ExhibitClosedForLunch e) {
            System.out.print("try back later");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
    }*/

    /*public void visitMonkeys() {
        try {
            //seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        } catch (ExhibitClosedForLunch e) {
            System.out.print("try back later");
        }
    }*/

    /*public void visitSnakes() {
        try {
            //seeAnimal();
        } catch (RuntimeException e) {
            System.out.print("runtime exception");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        } catch (Exception e) {
            System.out.print("exception");
        }
    }*/
}