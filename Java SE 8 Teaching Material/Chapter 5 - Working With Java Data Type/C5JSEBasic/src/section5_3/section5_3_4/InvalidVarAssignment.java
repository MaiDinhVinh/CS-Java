package section5_3.section5_3_4;

public class InvalidVarAssignment {
    public static void main(String[] args) {
        byte b = 10; //8 bits
        char c = 'x';//16 bits
        short s = 300;//16 bits
        int i = 1; //32 bits
        long l = 1; //64 bits
        float f = 1.0f; //32 bits
        double d = 1.0;//64 bits
        c = i;
        i = l;
        f = d;
        b = i;
    }
}
