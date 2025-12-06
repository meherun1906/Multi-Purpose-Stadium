package Sakib.Accountant;

import java.time.LocalDate;

public class FinancialStatementAcc {
    private String month;
    private int year;
    private double totalIncome;
    private double totalExpense;
    private double netProfit;
    private LocalDate date;


    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double getNetProfit() {
        return netProfit;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setNetProfit(double netProfit) {
        this.netProfit = netProfit;


    }

    public FinancialStatementAcc(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FinancialStatementAcc{" +
                "month='" + month + '\'' +
                ", year=" + year +
                ", totalIncome=" + totalIncome +
                ", totalExpense=" + totalExpense +
                ", netProfit=" + netProfit +
                '}';


    }



    public FinancialStatementAcc(String month, double totalIncome, int year, double totalExpense, double netProfit) {
        this.month = month;
        this.totalIncome = totalIncome;
        this.year = year;
        this.totalExpense = totalExpense;
        this.netProfit = netProfit;





    }
}
