class FinancialFunction{
    static double ComputeSimpleInterest(double p, double r, double t){
        return p*r*t/100;
    }
}

class Deploy2{
    public static void main(String[] args) {
        double interest = FinancialFunction.ComputeSimpleInterest(1000, 10, 1);
        System.out.println(interest);
    }
}