package section2;

public class ZooGiftShop {
    private int a;
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() { return 3 - ZooGiftShop.this.a; }
        }; // Don't forget the semicolon!
        return basePrice - sale.dollarsOff();
    }
}