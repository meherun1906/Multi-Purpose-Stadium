package Sakib.HRManager;

import java.time.LocalDate;

public class TrainingDevelopmentHR {
    private String trainer;
    private String title;
    LocalDate date;
    private Integer duration;
    private  String description;

    public TrainingDevelopmentHR(String trainer, String title, LocalDate date, Integer duration, String description) {
        this.trainer = trainer;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.description = description;

    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "TrainingDevelopmentHR{" +
                "trainer='" + trainer + '\'' +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                '}';
    }

    public void setDescription(String description) {
        this.description = description;

    }
    public boolean isUpcoming() {
        return date.isAfter(LocalDate.now());
    }
}
