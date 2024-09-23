public class Main8 {
    public static double computeInterest(double p, double r, int t) throws Exception{
        if(t<0) throw new Exception("t must be > 0");
        else return p*r*t;
    }
    public static void main(String[] args){
        double interest = 0.0;
        try{
            computeInterest(100, 0.1, -1);
        }catch(Exception e){
            e.printStackTrace();
//          or  System.out.println(e);
        }
        System.out.println(interest);
    }
}
