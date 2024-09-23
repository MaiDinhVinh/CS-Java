package ex2.hr;

import ex2.hr.reporting.TimeCard;
import java.util.Date;

public class Admin {
    public static String organizationName = "BVISHN";
    private String adminName;
    /**
     * the variable {@code numberOfEmployeeSignedIn} could be declared
     * in 2 ways
     * <p>
     * 1) USING FQCN
     * <p>
     * <blockquote><pre>
     *     private int numberOfEmployeeSignedIn = ex2.hr.reporting.TimeCard.authorizedEmpls.size();
     * </pre></blockquote><p>
     * 2) USING IMPORT STATEMENT
     * <blockquote><pre>
     *     import ex2.hr.reporting.TimeCard;
     *     //...many more lines of code
     *     private int numberOfEmployeeSignedIn = TimeCard.authorizedEmpls.size();
     * </pre></blockquote>
     * */

    public static int numberOfEmployeeSignedIn = TimeCard.authorizedEmpls.size();

    {
        numberOfEmployeeSignedIn++;
        System.out.println("Currently, there are " + numberOfEmployeeSignedIn +
                " admin(s) have been authorized to " + organizationName);
    }

    public Admin(String adminName){
        this.adminName = adminName;
        TimeCard.add(organizationName + ", " + adminName +
                " has been authorized at " + new Date());
    }

    public void getAllAuthorizedEmpls(){
        for(String i: TimeCard.authorizedEmpls){
            System.out.println(i);
        }
    }




}
