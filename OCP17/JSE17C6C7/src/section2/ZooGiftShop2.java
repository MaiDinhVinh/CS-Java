package section2;

public class ZooGiftShop2 {
    interface SaleTodayOnly {
        int dollarsOff();
    }
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() { return 3; }
        }; // Don't forget the semicolon!
        return basePrice - sale.dollarsOff();
    }
}