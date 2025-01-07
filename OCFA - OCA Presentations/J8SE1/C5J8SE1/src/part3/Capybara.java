package part3;

public class Capybara extends Rodent{
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
//        Capybara capybara = (Capybara)rodent;
        if(rodent instanceof Capybara) {
            Capybara capybara = (Capybara)rodent;
        }
    }
}
