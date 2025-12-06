package Meherun.CEO;

import Meherun.Client.Event;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EventStatisticsController
{
    @javafx.fxml.FXML
    private TextField fromYearTextField;
    @javafx.fxml.FXML
    private TextField toYearTextField;
    @javafx.fxml.FXML
    private Label resultLabel;
    @javafx.fxml.FXML
    private PieChart eventStatisticsPieChart;

    @javafx.fxml.FXML
    public void initialize() {
    }

    ObservableList<Event> completed = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void loadChartButtonOnAction(ActionEvent actionEvent) {

        completed = GenericFileManager.readAll(Event.class, "Events.bin");

        int fromYear = Integer.parseInt(fromYearTextField.getText());
        int toYear = Integer.parseInt(toYearTextField.getText());

        int sports = 0, concerts = 0, conferences = 0, exhibitions = 0;
        try{
        for (Event e : completed){
            int end = e.getEndDate().getYear();
            if ((e.getEventStatus().equals("Completed")) && (end >= fromYear && end<= toYear) ){
                if (e.getEventType().equals("Sports")){
                    sports += 1;
                }
                if (e.getEventType().equals("Concert")){
                    concerts += 1;
                }
                if (e.getEventType().equals("Conference")){
                    conferences += 1;
                }
                if (e.getEventType().equals("Exhibition")){
                    exhibitions += 1;
                }
            }
        }} catch (Exception e1) {
            e1.printStackTrace();
        }
        eventStatisticsPieChart.getData().clear();
        eventStatisticsPieChart.getData().add(new PieChart.Data("Sports", sports));
        eventStatisticsPieChart.getData().add(new PieChart.Data("Concert", concerts));
        eventStatisticsPieChart.getData().add(new PieChart.Data("Conference", conferences));
        eventStatisticsPieChart.getData().add(new PieChart.Data("Exhibition", exhibitions));

    }
}