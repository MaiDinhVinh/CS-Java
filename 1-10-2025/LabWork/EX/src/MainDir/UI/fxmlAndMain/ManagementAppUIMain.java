package MainDir.UI.fxmlAndMain;

import MainDir.i18n_translation_handler.Translation;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Locale;

public class ManagementAppUIMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Locale currentLocale = new Locale("en", "US");
        Translation.setLocale(currentLocale);
        primaryStage.setTitle(Translation.getTranslator().getString("title.window"));
        Navigator.getInstance().setStage(primaryStage);
        Navigator.getInstance().goToHome();
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}