package mainpackage.multipurposestadium;

import java.io.Serializable;

public abstract class User implements Serializable {
    private final String iD;
    private String name, eMail, phone, designation, passWord;

    public User(String iD, String name, String eMail, String phone, String designation, String passWord) {
        this.iD = iD;
        this.name = name;
        this.eMail = eMail;
        this.phone = phone;
        this.designation = designation;
        this.passWord = passWord;
    }

    public String getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
