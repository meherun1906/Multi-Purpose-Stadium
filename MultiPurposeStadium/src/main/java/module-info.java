module mainpackage.multipurposestadium {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.xml;


    opens mainpackage.multipurposestadium to javafx.fxml;
    exports mainpackage.multipurposestadium;

    opens Meherun.CEO to javafx.fxml;
    exports Meherun.CEO;

    opens Meherun.Client to javafx.fxml;
    exports Meherun.Client;

    opens Zarin.HeadOfSecurity to javafx.fxml;
    exports Zarin.HeadOfSecurity;
}