package Meherun.CEO;

import mainpackage.multipurposestadium.User;

import java.io.Serializable;
import java.time.LocalDate;

public class CEO extends User implements Serializable {
    private final String designation;
    private final LocalDate dateOfJoining;
    private String officeLocation;

    public CEO(String iD, String name, String eMail, String phone, String passWord, String designation, LocalDate dateOfJoining, String officeLocation) {
        super(iD, name, eMail, phone, passWord);
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
        this.officeLocation = officeLocation;
    }

    public String getDesignation() {
        return designation;
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
