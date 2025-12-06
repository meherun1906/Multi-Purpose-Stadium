package Meherun.CEO;

import java.io.Serializable;

public class VIPBenefits implements Serializable {
    private String benefit, condition ;

    public VIPBenefits(String benefit, String condition) {
        this.benefit = benefit;
        this.condition = condition;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
