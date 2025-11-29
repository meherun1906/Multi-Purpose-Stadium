package Zarin.HeadOfSecurity;

public class DutySchedule {
    private String staff;
    private String gate;
    private String zone;
    private String shiftStart;
    private String shiftEnd;

    public DutySchedule(String staff, String gate, String zone, String shiftStart, String shiftEnd) {
        this.staff = staff;
        this.gate = gate;
        this.zone = zone;
        this.shiftStart = shiftStart;
        this.shiftEnd = shiftEnd;
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
}
