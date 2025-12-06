package Zarin.MaintenanceManager;

import mainpackage.multipurposestadium.User;

import java.io.Serializable;

public class MaintenanceManager extends User implements Serializable {
    public MaintenanceManager(String iD, String name, String eMail, String phone, String designation, String passWord) {
        super(iD, name, eMail, phone, designation, passWord);
    }

}
