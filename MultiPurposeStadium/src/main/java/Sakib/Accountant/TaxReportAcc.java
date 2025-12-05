package Sakib.Accountant;

import java.time.LocalDate;

public class TaxReportAcc {
    private int reportId;
    private LocalDate fromDate;
    private LocalDate toDate;
    private double totalIncome;
    private double taxAmount;
    private String status;

    public TaxReportAcc(int reportId, LocalDate fromDate, LocalDate toDate, double totalIncome, String status, double taxAmount) {
        this.reportId = reportId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.totalIncome = totalIncome;
        this.status = status;
        this.taxAmount = taxAmount;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TaxReportAcc{" +
                "reportId=" + reportId +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", totalIncome=" + totalIncome +
                ", taxAmount=" + taxAmount +
                ", status='" + status + '\'' +
                '}';
    }


    public double calculateTax() {
        this.taxAmount = totalIncome * 0.10; // 10% tax
        return this.taxAmount;
    }

}
