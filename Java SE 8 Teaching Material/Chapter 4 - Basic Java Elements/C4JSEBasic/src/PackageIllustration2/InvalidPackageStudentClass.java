package PackageIllustration2;

public class InvalidPackageStudentClass {
    private String name;
    private String dateOfBirth;
    private int id;
    //private Motorbike[] confiscatedMotorbike;
    //invalid code since Motorbike class resides in another package

    private PackageIllustration.Motorbike[] confiscatedMotorbike;
    //valid code since we use FQCN


}
