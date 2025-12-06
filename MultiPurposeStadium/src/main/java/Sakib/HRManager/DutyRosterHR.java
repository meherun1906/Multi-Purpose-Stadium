package Sakib.HRManager;

import java.time.LocalDate;

public class DutyRosterHR {
    private int rosterId;
    private String department;
    private LocalDate startDate;
    private LocalDate endDate;
    private String shiftType; // Morning, Evening, Night
    private int employeeId;
    private String employeeName;

    public DutyRosterHR(int rosterId, String department, LocalDate startDate, String shiftType, LocalDate endDate, String employeeName, int employeeId) {
        this.rosterId = rosterId;
        this.department = department;
        this.startDate = startDate;
        this.shiftType = shiftType;
        this.endDate = endDate;
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public int getRosterId() {
        return rosterId;
    }

    public void setRosterId(int rosterId) {
        this.rosterId = rosterId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getShiftType() {
        return shiftType;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "DutyRosterHR{" +
                "rosterId=" + rosterId +
                ", department='" + department + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", shiftType='" + shiftType + '\'' +
                ", employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
    public String getDisplayInfo() {
        return employeeName + " Sakib " + shiftType + " Morning,evening" + startDate + " 01.11.2025 " + endDate + "31.12.2025";
    }
}


