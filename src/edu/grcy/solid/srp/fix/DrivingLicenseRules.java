package edu.grcy.solid.srp.fix;

public class DrivingLicenseRules {

    private static final int DRIVING_LICENSE_REQUIRED_AGE = 18;

    public static boolean canGetDrivingLicense (Person person) {
        return person.getAge() >= DRIVING_LICENSE_REQUIRED_AGE;
    }
}
