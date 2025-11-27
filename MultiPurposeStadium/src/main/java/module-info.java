module mainpackage.multipurposestadium {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.multipurposestadium to javafx.fxml;
    exports mainpackage.multipurposestadium;
}