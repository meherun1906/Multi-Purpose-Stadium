package Zarin.HeadOfSecurity;

public class AttendanceRecord {
    private String staffName;
    private String gate;
    private String status;

    public AttendanceRecord(String staffName, String gate, String status) {
        this.staffName = staffName;
        this.gate = gate;
        this.status = status;
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
}
