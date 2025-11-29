package Meherun.CEO;

import mainpackage.multipurposestadium.User;

import java.io.Serializable;
import java.time.LocalDate;

public class CEO extends User implements Serializable {
    private final LocalDate dateOfJoining;
    private String officeLocation;

    public CEO(String iD, String name, String eMail, String phone, String designation, String passWord, LocalDate dateOfJoining, String officeLocation) {
        super(iD, name, eMail, phone, designation, passWord);
        this.dateOfJoining = dateOfJoining;
        this.officeLocation = officeLocation;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
