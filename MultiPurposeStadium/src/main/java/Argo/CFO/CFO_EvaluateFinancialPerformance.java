package Argo.CFO;

import java.time.LocalDate;

public class CFO_EvaluateFinancialPerformance {
    private String name, phoneNumber, email, Id;
    public String balance;
    public LocalDate date;
    public Boolean performance;

    public CFO_EvaluateFinancialPerformance(String name, String phoneNumber, String email, String id, String balance, LocalDate date, Boolean performance) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        Id = id;
        this.balance = balance;
        this.date = date;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getPerformance() {
        return performance;
    }

    public void setPerformance(Boolean performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "CFO_EvaluateFinancialPerformance{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", Id='" + Id + '\'' +
                ", balance='" + balance + '\'' +
                ", date=" + date +
                ", performance=" + performance +
                '}';
    }
}
