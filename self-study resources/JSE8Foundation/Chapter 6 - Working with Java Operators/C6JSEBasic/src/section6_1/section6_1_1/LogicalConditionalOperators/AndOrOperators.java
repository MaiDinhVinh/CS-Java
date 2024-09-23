package section6_1.section6_1_1.LogicalConditionalOperators;

public class AndOrOperators {
    /**
     * {@code ||} will return {@code true} if one of these operands is
     * {@code true}<p>
     * {@code &&} will return {@code false} if one of these
     * operands is {@code false}<p>
     * This is Binary Operation (involves 2 operands)*/
    public static void main(String[] args) {
        boolean iAmHungry = false;
        boolean fridgeHasFood = false;
        boolean eatUp = iAmHungry && fridgeHasFood; //return false
        boolean tooMuchExcitement = true;
        boolean eatAnyway = eatUp || tooMuchExcitement; //return true
        System.out.println(eatUp);
        System.out.println(eatAnyway);
    }
}
