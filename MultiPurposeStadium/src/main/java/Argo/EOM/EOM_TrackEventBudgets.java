package Argo.EOM;

import java.time.LocalDate;

public class EOM_TrackEventBudgets {
    private String name, id, phoneNumber, eventType;
    public LocalDate date;
    private Boolean track;
    private int bill;

    public EOM_TrackEventBudgets(String name, String id, String phoneNumber, String eventType, LocalDate date, Boolean track, int bill) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.eventType = eventType;
        this.date = date;
        this.track = track;
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

    public Boolean getTrack() {
        return track;
    }

    public void setTrack(Boolean track) {
        this.track = track;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "EOM_TrackEventBudgets{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eventType='" + eventType + '\'' +
                ", date=" + date +
                ", track=" + track +
                ", bill=" + bill +
                '}';
    }
}
