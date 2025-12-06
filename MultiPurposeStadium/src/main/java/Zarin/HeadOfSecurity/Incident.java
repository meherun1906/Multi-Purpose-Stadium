package Zarin.HeadOfSecurity;

import java.io.Serializable;
import java.time.LocalDate;

public class Incident implements Serializable {
    private String location;
    private String type;
    private String description;
    private LocalDate date;
    private String status;


    public Incident(String location, String type, String description, LocalDate date, String status) {
        this.location = location;
        this.type = type;
        this.description = description;
        this.date = date;
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
