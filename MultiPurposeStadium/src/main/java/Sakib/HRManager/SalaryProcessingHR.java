package Sakib.HRManager;

public class SalaryProcessingHR {
    private int payrollId;
    private int employeeId;
    private String employeeName;

    public SalaryProcessingHR(int payrollId, int employeeId, String employeeName) {
        this.payrollId = payrollId;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(int payrollId) {
        this.payrollId = payrollId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "SalaryProcessingHR{" +
                "payrollId=" + payrollId +
                ", employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
    public String generatePayrollCode() {
        return "PAY-" + payrollId + "-EMP-" + employeeId;
    }
}
