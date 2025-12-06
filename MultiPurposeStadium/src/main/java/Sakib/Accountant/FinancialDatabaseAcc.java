package Sakib.Accountant;

import java.time.LocalDate;

public class FinancialDatabaseAcc {
    private int recordId;
    private String type;
    private double amount;
    private LocalDate date;
    private String description;

    public FinancialDatabaseAcc(int recordId, String type, double amount, LocalDate date, String description) {
        this.recordId = recordId;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FinancialDatabaseAcc{" +
                "recordId=" + recordId +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
    public boolean isValidAmount() {
        return amount > 0;
    }

}

