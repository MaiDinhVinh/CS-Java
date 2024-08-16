package ex1.package2;

public class CPackage2_test {
    public static String CPackage2TestStaticField = "I'm CPackage2_test static field";
    private String CPackage2TestInstanceField = "I'm CPackage2_test instance field";

    public CPackage2_test() {
    }

    public String getCPackage2TestInstanceField(){
        return this.CPackage2TestInstanceField;
    }

}
