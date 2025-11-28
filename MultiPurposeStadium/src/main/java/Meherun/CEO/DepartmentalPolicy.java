package Meherun.CEO;

public class DepartmentalPolicy {
    private String department, policy;
    private final String policyId;

    public DepartmentalPolicy(String department, String policy, String policyId) {
        this.department = department;
        this.policy = policy;
        this.policyId = policyId;
    }

    public String getDepartment() {
        return department;
    }

    public String getPolicy() {
        return policy;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }
}
