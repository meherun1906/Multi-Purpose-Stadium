package Sakib.Accountant;

public class ClientPaymentAcc {

    private String amount;
    private String date;
    private String method;
    private String status;

    public ClientPaymentAcc(String amount, String date, String method, String status) {
        this.amount = amount;
        this.date = date;
        this.method = method;
        this.status = status;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
