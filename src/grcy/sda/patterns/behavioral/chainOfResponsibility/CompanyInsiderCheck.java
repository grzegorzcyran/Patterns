package grcy.sda.patterns.behavioral.chainOfResponsibility;

import java.util.List;

//company employee
public class CompanyInsiderCheck extends AccessCheck {


    @Override
    public boolean doCheck(String username) {

        System.out.println("CompanyInsiderCheck start for " + username);
        if(!Employees.checkEmployee(username)){
            System.out.println(getClass().getCanonicalName() + " do_Check");
            return false;
        }
        System.out.println(getClass().getCanonicalName() + " do_Check PASSED");
        return checkNextElement(username);
    }
}
