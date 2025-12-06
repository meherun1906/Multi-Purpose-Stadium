package Sakib.HRManager;

public class AttendanceRecordHR {

    private String date;
    private String employeeName;
    private String department;
    private String checkInTime;
    private String checkOutTime;
    private String totalHours;
    private String absenceDetails;

    public AttendanceRecordHR(String date, String employeeName, String department, String checkInTime, String checkOutTime, String totalHours, String absenceDetails) {
        this.date = date;
        this.employeeName = employeeName;
        this.department = department;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.totalHours = totalHours;
        this.absenceDetails = absenceDetails;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(String totalHours) {
        this.totalHours = totalHours;
    }

    public String getAbsenceDetails() {
        return absenceDetails;
    }

    public void setAbsenceDetails(String absenceDetails) {
        this.absenceDetails = absenceDetails;
    }

    @Override
    public String toString() {
        return "AttendanceRecordHR{" +
                "date='" + date + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", checkInTime='" + checkInTime + '\'' +
                ", checkOutTime='" + checkOutTime + '\'' +
                ", totalHours='" + totalHours + '\'' +
                ", absenceDetails='" + absenceDetails + '\'' +
                '}';
    }
}
