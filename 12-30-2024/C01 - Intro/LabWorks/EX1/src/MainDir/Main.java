package MainDir;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root = FXMLLoader.load(getClass().getResource("RegistrationUI.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("Registration");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
