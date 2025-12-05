package Sakib.Accountant;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class PayrollAcc {
    private Integer payrollId;
    private  Integer employeeId;
    private  String employeeName;
    private  String designation;
    private  Double basicSalary;
    private  Double allowance;
    private  Double deduction;
    private  Double totalSalary;

    public PayrollAcc(Integer payrollId, Integer employeeId, String employeeName, String designation, Double basicSalary, Double allowance, Double deduction, Double totalSalary) {
        this.payrollId = payrollId;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.deduction = deduction;
        this.totalSalary = totalSalary;
    }

    public Integer getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(Integer payrollId) {
        this.payrollId = payrollId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getAllowance() {
        return allowance;
    }

    public void setAllowance(Double allowance) {
        this.allowance = allowance;
    }

    public Double getDeduction() {
        return deduction;
    }

    public void setDeduction(Double deduction) {
        this.deduction = deduction;
    }

    public Double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(Double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return "PayrollAcc{" +
                "payrollId=" + payrollId +
                ", employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", designation='" + designation + '\'' +
                ", basicSalary=" + basicSalary +
                ", allowance=" + allowance +
                ", deduction=" + deduction +
                ", totalSalary=" + totalSalary +
                '}';
    }
}
