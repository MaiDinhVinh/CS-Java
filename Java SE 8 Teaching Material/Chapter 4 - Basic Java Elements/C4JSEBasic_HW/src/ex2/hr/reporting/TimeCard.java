package ex2.hr.reporting;

import java.util.List;
import java.util.ArrayList;

public class TimeCard {
    public static List<String> authorizedEmpls = new ArrayList<>();

    public static void add(String input){
        authorizedEmpls.add(input);
    }

}
