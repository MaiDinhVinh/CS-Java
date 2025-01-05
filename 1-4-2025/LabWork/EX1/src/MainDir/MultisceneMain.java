package MainDir;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MultisceneMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Classic Website");
        Navigator.getInstance().setStage(primaryStage);
        Navigator.getInstance().goToHome();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}