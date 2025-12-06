package Sakib.HRManager;

public class PerformanceReviewHR {
    private String employeeName;
    private String department;
    private double attendancePercent;
    private int tasksCompleted;
    private double supervisorRating;

    public PerformanceReviewHR(String employeeName, String department, double attendancePercent, int tasksCompleted, double supervisorRating) {
        this.employeeName = employeeName;
        this.department = department;
        this.attendancePercent = attendancePercent;
        this.tasksCompleted = tasksCompleted;
        this.supervisorRating = supervisorRating;
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

    public double getAttendancePercent() {
        return attendancePercent;
    }

    public void setAttendancePercent(double attendancePercent) {
        this.attendancePercent = attendancePercent;
    }

    public int getTasksCompleted() {
        return tasksCompleted;
    }

    public void setTasksCompleted(int tasksCompleted) {
        this.tasksCompleted = tasksCompleted;
    }

    public double getSupervisorRating() {
        return supervisorRating;
    }

    public void setSupervisorRating(double supervisorRating) {
        this.supervisorRating = supervisorRating;
    }

    @Override
    public String toString() {
        return "PerformanceReviewHR{" +
                "employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", attendancePercent=" + attendancePercent +
                ", tasksCompleted=" + tasksCompleted +
                ", supervisorRating=" + supervisorRating +
                '}';
    }
    public boolean isFromDepartment(String dept) {
        return department.equalsIgnoreCase(dept);
    }
}
