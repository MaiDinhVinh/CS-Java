package ex1.package1;

import ex1.package2.CPackage2_test;

//import CPackage2_test;
public class TestP1AccessField {
    /**
     * In order to make both of instance fields interact,
     * we must initalize the {@code CPackage2_test} class
     * first by either using FQCN or use import statement*/
    public static void main(String[] args) {
        CPackage2_test demoCPackage2_test = new CPackage2_test();
        CPackage1 demoCPackage1 = new CPackage1(demoCPackage2_test.getCPackage2TestInstanceField());
        System.out.println(CPackage1.imCPackage1StaticField);
        System.out.println(demoCPackage1.getImCPackage1InstanceField());
    }
}
