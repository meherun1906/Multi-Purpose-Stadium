package mainpackage.multipurposestadium;

import Meherun.CEO.DummyObjects;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("logInView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Multipurpose Stadium!");
        stage.setScene(scene);
        stage.show();
        //DummyObjects d = new DummyObjects();
        //d.createDummyObjects();
    }
}
