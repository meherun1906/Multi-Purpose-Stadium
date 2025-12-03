package Zarin.HeadOfSecurity;

import java.io.Serializable;

public class Staff implements Serializable {
    private String id;
    private String name;
    private String role;
    private String contact;
    private String email;

    public Staff(String id, String name, String role, String contact, String email) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.contact = contact;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
