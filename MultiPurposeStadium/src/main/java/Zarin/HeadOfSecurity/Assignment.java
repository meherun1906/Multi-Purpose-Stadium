package Zarin.HeadOfSecurity;

import java.io.Serializable;
import java.time.LocalDate;

public class Assignment implements Serializable {

    private String staffName;
    private String gate;
    private String zone;
    private LocalDate date;

    public Assignment(String staffName, String gate, String zone, LocalDate date) {
        this.staffName = staffName;
        this.gate = gate;
        this.zone = zone;
        this.date = date;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "staffName='" + staffName + '\'' +
                ", gate='" + gate + '\'' +
                ", zone='" + zone + '\'' +
                ", date=" + date +
                '}';
    }
}

