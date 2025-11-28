package mainpackage.multipurposestadium;

import java.io.Serializable;

public abstract class User implements Serializable {
    private final String iD;
    private String name, eMail, phone, passWord;

    public User(String iD, String name, String eMail, String phone, String passWord) {
        this.iD = iD;
        this.name = name;
        this.eMail = eMail;
        this.phone = phone;
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

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
