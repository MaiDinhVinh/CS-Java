package MainDir.UI.fxmlAndMain;

import javafx.application.Application;
import javafx.stage.Stage;

public class ManagementAppUIMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Management app");
        Navigator.getInstance().setStage(primaryStage);
        Navigator.getInstance().goToHome();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}