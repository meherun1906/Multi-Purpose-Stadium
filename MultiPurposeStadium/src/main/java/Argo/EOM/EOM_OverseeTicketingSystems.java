package Argo.EOM;

import java.time.LocalDate;

public class EOM_OverseeTicketingSystems {
    private String name, id, phoneNumber, email, eventType;
    public LocalDate date;
    private Boolean ticketing;
    private int bill;

    public EOM_OverseeTicketingSystems(String name, String id, String phoneNumber, String email, String eventType, LocalDate date, Boolean ticketing, int bill) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.eventType = eventType;
        this.date = date;
        this.ticketing = ticketing;
        this.bill = bill;
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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getTicketing() {
        return ticketing;
    }

    public void setTicketing(Boolean ticketing) {
        this.ticketing = ticketing;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "EOM_OverseeTicketingSystems{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", eventType='" + eventType + '\'' +
                ", date=" + date +
                ", ticketing=" + ticketing +
                ", bill=" + bill +
                '}';
    }
}
