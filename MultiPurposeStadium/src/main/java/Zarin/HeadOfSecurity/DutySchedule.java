package Zarin.HeadOfSecurity;

import java.io.Serializable;
import java.time.LocalDate;

public class DutySchedule implements Serializable {
    private String staff;
    private String gate;
    private String zone;
    private String shiftStart;
    private String shiftEnd;
    private LocalDate date;

    public DutySchedule(String staff, String gate, String zone, String shiftStart, String shiftEnd, LocalDate date) {
        this.staff = staff;
        this.gate = gate;
        this.zone = zone;
        this.shiftStart = shiftStart;
        this.shiftEnd = shiftEnd;
        this.date = date;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
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

    public String getShiftStart() {
        return shiftStart;
    }

    public void setShiftStart(String shiftStart) {
        this.shiftStart = shiftStart;
    }

    public String getShiftEnd() {
        return shiftEnd;
    }

    public void setShiftEnd(String shiftEnd) {
        this.shiftEnd = shiftEnd;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
