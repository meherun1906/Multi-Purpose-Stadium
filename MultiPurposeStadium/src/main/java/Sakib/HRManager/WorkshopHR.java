package Sakib.HRManager;

public class WorkshopHR {

    private String title;
    private String trainer;
    private String date;
    private String duration;
    private String department;

    public WorkshopHR(String title, String trainer, String date,
                      String duration, String department) {
        this.title = title;
        this.trainer = trainer;
        this.date = date;
        this.duration = duration;
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "WorkshopHR{" +
                "title='" + title + '\'' +
                ", trainer='" + trainer + '\'' +
                ", date='" + date + '\'' +
                ", duration='" + duration + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public boolean isLongDuration(int minimumHours) {
        try {
            int hrs = Integer.parseInt(duration.replaceAll("[0-9]", "[0-10]"));
            return hrs >= minimumHours;
        } catch (Exception e) {
            return false;
        }

    }


}
