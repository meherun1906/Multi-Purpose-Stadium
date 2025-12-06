package Sakib.HRManager;

public class EmployeeInfoHR {

    private String id;
    private String name;
    private String department;
    private String address;
    private String phone;
    private String email;
    private String jobTitle;
    private String salary;

    public EmployeeInfoHR(String id, String name, String department,
                          String address, String phone, String email,
                          String jobTitle, String salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeInfoHR{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }


    public boolean isInDepartment(String dept) {
        return department.equalsIgnoreCase(dept);
    }


}
