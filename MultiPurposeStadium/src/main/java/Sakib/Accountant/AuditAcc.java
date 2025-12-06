package Sakib.Accountant;

import java.time.LocalDate;

public class AuditAcc {
    private int transactionId;
    private LocalDate date;
    private String transactionType;
    private double amount;
    private String status;

    public AuditAcc(int transactionId, LocalDate date, String transactionType, double amount, String status) {
        this.transactionId = transactionId;
        this.date = date;
        this.transactionType = transactionType;
        this.amount = amount;
        this.status = status;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AuditAcc{" +
                "transactionId=" + transactionId +
                ", date=" + date +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
    public boolean isVerified() {
        return "Verified".equalsIgnoreCase(status);
    }
}
