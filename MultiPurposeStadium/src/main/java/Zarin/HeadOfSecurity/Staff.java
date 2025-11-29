package Zarin.HeadOfSecurity;

public class Staff {
    private int id;
    private String name;
    private String role;
    private String contact;
    private String email;

    public Staff(int id, String name, String role, String email, String contact) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.email = email;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
