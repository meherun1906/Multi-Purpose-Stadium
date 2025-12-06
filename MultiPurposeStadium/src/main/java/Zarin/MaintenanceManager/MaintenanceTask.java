package Zarin.MaintenanceManager;

import java.io.Serializable;
import java.time.LocalDate;

public class MaintenanceTask implements Serializable {
    private String task;
    private String area;
    private String assignedTo;
    private String status;
    private LocalDate date;

    public MaintenanceTask(String task, String area, String assignedTo, String status, LocalDate date) {
        this.task = task;
        this.area = area;
        this.assignedTo = assignedTo;
        this.status = status;
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
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
