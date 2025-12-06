package Argo.EOM;

import java.time.LocalDate;

public class EOM_CollaborateWithMarketingTeams {
    private String name, id, phoneNumber, email;
    public LocalDate date;
    private Boolean collaboration, marketing;

    public EOM_CollaborateWithMarketingTeams(String name, String id, String phoneNumber, String email, LocalDate date, Boolean collaboration, Boolean marketing) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.date = date;
        this.collaboration = collaboration;
        this.marketing = marketing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getCollaboration() {
        return collaboration;
    }

    public void setCollaboration(Boolean collaboration) {
        this.collaboration = collaboration;
    }

    public Boolean getMarketing() {
        return marketing;
    }

    public void setMarketing(Boolean marketing) {
        this.marketing = marketing;
    }

    @Override
    public String toString() {
        return "EOM_CollaborateWithMarketingTeams{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", collaboration=" + collaboration +
                ", marketing=" + marketing +
                '}';
    }
}
