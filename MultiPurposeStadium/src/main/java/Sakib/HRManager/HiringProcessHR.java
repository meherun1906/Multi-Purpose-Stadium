package Sakib.HRManager;

public class HiringProcessHR {
    private String title;
    private int vacancy;
    private String requirements;
    private String salaryRange;

    public HiringProcessHR(String title, int vacancy, String requirements, String salaryRange) {
        this.title = title;
        this.vacancy = vacancy;
        this.requirements = requirements;
        this.salaryRange = salaryRange;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVacancy() {
        return vacancy;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(String salaryRange) {
        this.salaryRange = salaryRange;
    }

    @Override
    public String toString() {
        return "HiringProcessHR{" +
                "title='" + title + '\'' +
                ", vacancy=" + vacancy +
                ", requirements='" + requirements + '\'' +
                ", salaryRange='" + salaryRange + '\'' +
                '}';
    }
    public boolean isJobPostValid() {
        return title != null && !title.isEmpty() && vacancy > 0;
    }
}
