package Zarin.HeadOfSecurity;

import java.io.Serializable;
import java.time.LocalDate;

public class AttendanceRecord implements Serializable {
    private String staffName;
    private String gate;
    private String status;
    private LocalDate date;

    public AttendanceRecord(String staffName, String gate, String status, LocalDate date) {
        this.staffName = staffName;
        this.gate = gate;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
