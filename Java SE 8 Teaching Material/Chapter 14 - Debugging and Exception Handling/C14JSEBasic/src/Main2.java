/*
//try what happen if we remove the try/catch block in doInterest method
//What happen if we remove the throws clause in computeSimpleInterest method
class TestClass{
    public static void main(String[] args){
        TestClass tc = new TestClass();
        tc.doInterest();
    }
    public double computeSimpleInterest(double p, double r, double t){
        if( t<0) throw new IllegalArgumentException("time is less than 0");
        return p*r*t/100;
    }
    public void doInterest(){
        try{
            double interest = computeSimpleInterest(1000.0, 10.0, -1);
            System.out.println("Computed interest "+interest);
        }catch(IllegalArgumentException iae){
            System.out.println("Problem in computing interest:"+iae.getMessage());
            iae.printStackTrace();
        }finally{
            System.out.println("all done");
        }
    }
}
*/
