package Zarin.HeadOfSecurity;

import java.time.LocalDate;

public class Assignment {
    private  String staffID;
    private  String staffName;
    private  String gate;
    private  String zone;
    private  LocalDate date;

    public Assignment(String staffID, String staffName, String gate, String zone, LocalDate date) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.gate = gate;
        this.zone = zone;
        this.date = date;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getGate() {
        return gate;
    }

    public String getZone() {
        return zone;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "staffID='" + staffID + '\'' +
                ", staffName='" + staffName + '\'' +
                ", gate='" + gate + '\'' +
                ", zone='" + zone + '\'' +
                ", date=" + date +
                '}';
    }
}
