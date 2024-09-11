//1ST VERSION
/*class TaxCalculator{
    double rate = 0.1;
    double getTaxAmount(double price){
        return rate*price;
    }
}
public class Main6 {
    double price = 95.0;
    TaxCalculator tc = new TaxCalculator();
    double taxAmt = price*tc.rate;
}*/
//2ND VERSION
/*
class TaxCalculator{
    //double rate = 0.1; //no more hardcoding
    double getTaxAmount(double price){
        return getRateFromDB()*price;
    }
    double getRateFromDB(){
        return 1.0; //only for illustration
    }
}

public class Main6 {
    double price = 95.0;
    TaxCalculator tc = new TaxCalculator();
    double taxAmt = price*tc.rate;
}*/
