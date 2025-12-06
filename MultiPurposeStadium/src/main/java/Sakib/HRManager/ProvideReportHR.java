package Sakib.HRManager;

import java.time.LocalDate;

public class ProvideReportHR {
    private String reportType;        // Attendance / Salary / Workforce
    private LocalDate startDate;
    private LocalDate endDate;
    private String department;
    private String jobRole;

    public ProvideReportHR(String reportType, LocalDate startDate, LocalDate endDate, String department, String jobRole) {
        this.reportType = reportType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.department = department;
        this.jobRole = jobRole;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    @Override
    public String toString() {
        return "ProvideReportHR{" +
                "reportType='" + reportType + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", department='" + department + '\'' +
                ", jobRole='" + jobRole + '\'' +
                '}';
    }
    public boolean isValidFilters() {
        if (reportType == null || startDate == null || endDate == null) return false;
        return !endDate.isBefore(startDate);
    }
}
