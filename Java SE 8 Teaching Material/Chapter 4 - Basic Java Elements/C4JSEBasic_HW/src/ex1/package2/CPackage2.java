package ex1.package2;

public class CPackage2 {
    //public static String package2StaticField = CPackage2_test.CPackage2TestStaticField;
    private String package2InstanceField;

    public CPackage2(String otherInstanceField){
        this.package2InstanceField = otherInstanceField;
    }

    public String getPackage2InstanceField(){
        return this.package2InstanceField;
    }
}
