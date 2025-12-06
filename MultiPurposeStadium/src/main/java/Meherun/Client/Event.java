package Meherun.Client;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Event implements Serializable {
    private final String clientID;
    private String clientName, clientPhone, eventTitle, eventType, eventDescription, companyName,
            secondContactName,secondContactPhone;
    private LocalDate startDate, endDate;

    private String bookingID, bookingStatus, eventStatus, paymentStatus, review;
    private String duration;

    public Event(String clientID, String clientName, String clientPhone, String eventTitle, String eventType,
                 String eventDescription, String companyName, String secondContactName, String secondContactPhone, LocalDate startDate, LocalDate endDate) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.eventTitle = eventTitle;
        this.eventType = eventType;
        this.eventDescription = eventDescription;
        this.companyName = companyName;
        this.secondContactName = secondContactName;
        this.secondContactPhone = secondContactPhone;
        this.startDate = startDate;
        this.endDate = endDate;

        this.bookingID = null;
        this.bookingStatus = "Pending";
        this.eventStatus = "Pending";
        this.paymentStatus = "Pending";
        this.review = null;
        this.duration = null;

    }

    public String getClientID() {
        return clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSecondContactName() {
        return secondContactName;
    }

    public void setSecondContactName(String secondContactName) {
        this.secondContactName = secondContactName;
    }

    public String getSecondContactPhone() {
        return secondContactPhone;
    }

    public void setSecondContactPhone(String secondContactPhone) {
        this.secondContactPhone = secondContactPhone;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /*public long getDuration(LocalDate startDate, LocalDate endDate){
        LocalDate a = getStartDate();
        LocalDate b = getEndDate();
        long days = a.until(b, ChronoUnit.DAYS);
        return days;
    }*/
}
