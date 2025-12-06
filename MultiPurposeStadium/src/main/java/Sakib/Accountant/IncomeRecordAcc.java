package Sakib.Accountant;

public class IncomeRecordAcc {
    private String incomeSource;
    private double amount;
    private String description;

    public IncomeRecordAcc(String incomeSource, double amount, String description) {
        this.incomeSource = incomeSource;
        this.amount = amount;
        this.description = description;
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "IncomeRecordAcc{" +
                "incomeSource='" + incomeSource + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
    public double calculateVAT(double vatRate) {
        return amount * (vatRate / 100.0);
    }
}
