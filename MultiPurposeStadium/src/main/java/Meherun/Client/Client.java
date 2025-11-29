package Meherun.Client;

import mainpackage.multipurposestadium.User;

import java.io.Serializable;

public class Client extends User implements Serializable {
    private String address;
    private final String gender;

    public Client(String iD, String name, String eMail, String phone, String designation, String passWord, String address, String gender) {
        super(iD, name, eMail, phone, designation, passWord);
        this.address = address;
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
