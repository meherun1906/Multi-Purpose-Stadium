package Meherun.CEO;

import java.io.Serializable;
import java.time.LocalDate;

public class CapExBudget implements Serializable {
    private String budgetTitle, budgetDetails;
    private final String budgetID;
    private String budgetStatus;
    private float amount;
    private LocalDate requestDate;

    public CapExBudget(String budgetTitle, String budgetDetails, String budgetID, String budgetStatus, float amount, LocalDate requestDate) {
        this.budgetTitle = budgetTitle;
        this.budgetDetails = budgetDetails;
        this.budgetID = budgetID;
        this.budgetStatus = budgetStatus;
        this.amount = amount;
        this.requestDate = requestDate;
    }

    public String getBudgetID() {
        return budgetID;
    }

    public void setBudgetStatus(String budgetStatus) {
        this.budgetStatus = budgetStatus;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public String getBudgetTitle() {
        return budgetTitle;
    }

    public void setBudgetTitle(String budgetTitle) {
        this.budgetTitle = budgetTitle;
    }

    public String getBudgetDetails() {
        return budgetDetails;
    }

    public void setBudgetDetails(String budgetDetails) {
        this.budgetDetails = budgetDetails;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getBudgetStatus() {
        return budgetStatus;
    }
}
