package ex1.package2;

public class TestAccessField {
    public static void main(String[] args) {
        CPackage2_test demoCPackage2_test = new CPackage2_test();
        CPackage2 demoCPackage2 = new CPackage2(demoCPackage2_test.getCPackage2TestInstanceField());
        //System.out.println(CPackage2.package2StaticField);
        System.out.println(demoCPackage2.getPackage2InstanceField());
    }
}

/*
* OBSERVATION:
* In the same packages, the static field from class CPackage2_test
* is accessible from CPackage2 class and therefore, only simple class name
* is requried to access the field. Moreover, the instance field from
* CPackage2_test is also accessible to class CPackage2 by using a public
* accessor (getter)*/
