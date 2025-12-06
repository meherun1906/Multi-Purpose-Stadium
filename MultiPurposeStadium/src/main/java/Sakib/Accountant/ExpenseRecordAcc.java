package Sakib.Accountant;

public class ExpenseRecordAcc {
    private String expenseType;
    private Double amount;
    private String description;

    public ExpenseRecordAcc(String expenseType, Double amount, String description) {
        this.expenseType = expenseType;
        this.amount = amount;
        this.description = description;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ExpenseRecordAcc{" +
                "expenseType='" + expenseType + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
    public String toSummaryString() {
        return "Type: " + expenseType +
                ", Amount: " + amount +
                ", Description: " + description;
    }
    public boolean isAboveAmount(double limit) {
        return this.amount > limit;
    }
}
