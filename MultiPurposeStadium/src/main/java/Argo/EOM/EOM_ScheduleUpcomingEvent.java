package Argo.EOM;

import java.time.LocalDate;

public class EOM_ScheduleUpcomingEvent {
    private String name, id, phoneNumber, eventType;
    public LocalDate date;
    private Boolean upcomingEvent;
    private int bill;

    public EOM_ScheduleUpcomingEvent(String name, String id, String phoneNumber, String eventType, LocalDate date, Boolean upcomingEvent, int bill) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.eventType = eventType;
        this.date = date;
        this.upcomingEvent = upcomingEvent;
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

    public Boolean getUpcomingEvent() {
        return upcomingEvent;
    }

    public void setUpcomingEvent(Boolean upcomingEvent) {
        this.upcomingEvent = upcomingEvent;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "EOM_ScheduleUpcomingEvent{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eventType='" + eventType + '\'' +
                ", date=" + date +
                ", upcomingEvent=" + upcomingEvent +
                ", bill=" + bill +
                '}';
    }



}
