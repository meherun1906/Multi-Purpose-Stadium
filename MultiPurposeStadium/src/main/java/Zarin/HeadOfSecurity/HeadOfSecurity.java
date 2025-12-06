package Zarin.HeadOfSecurity;

import mainpackage.multipurposestadium.User;

import java.io.Serializable;


public class HeadOfSecurity extends User implements Serializable {
    public HeadOfSecurity(String iD, String name, String eMail, String phone, String designation, String passWord) {
        super(iD, name, eMail, phone, designation, passWord);
    }
}
    //private String securityId;


