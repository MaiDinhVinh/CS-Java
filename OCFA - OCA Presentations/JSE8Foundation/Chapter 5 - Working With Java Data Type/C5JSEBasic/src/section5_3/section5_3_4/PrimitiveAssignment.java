package section5_3.section5_3_4;

public class PrimitiveAssignment {
    public static void main(String[] args) {
        byte b = 10; //8 bits
        char c = 'x';//16 bits
        short s = 300;//16 bits
        int i; //32 bits
        long l; //64 bits
        float f; //32 bits
        double d; //64 bits
        //no special care is needed for these assignments below
        i = b;
        i = s;
        l = i;
        f = i;
        d = f;
        //the source variable is smaller than the target variable
    }
}
