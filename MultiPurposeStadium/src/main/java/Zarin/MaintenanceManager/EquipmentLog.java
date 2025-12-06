package Zarin.MaintenanceManager;

import java.io.Serializable;
import java.time.LocalDate;

public class EquipmentLog implements Serializable {
    private String equipment;
    private LocalDate lastServiced;
    private LocalDate nextDue;
    private String technician;
    private String status;

    public EquipmentLog(String equipment, LocalDate lastServiced, LocalDate nextDue, String technician, String status) {
        this.equipment = equipment;
        this.lastServiced = lastServiced;
        this.nextDue = nextDue;
        this.technician = technician;
        this.status = status;
    }

    public String getEquipment() {
        return equipment;
    }

    public LocalDate getLastServiced() {
        return lastServiced;
    }

    public LocalDate getNextDue() {
        return nextDue;
    }

    public String getTechnician() {
        return technician;
    }

    public String getStatus() {
        return status;
    }
}
