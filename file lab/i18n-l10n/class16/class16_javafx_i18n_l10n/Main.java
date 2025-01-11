/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class16_javafx_i18n_l10n;

import java.io.IOException;
import java.util.Locale;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
//        Locale currentLocale = new Locale("vi", "VN");
//        Locale currentLocale = new Locale("en", "US");
        Locale currentLocale = new Locale("fr", "FR");
        Translator.setLocale(currentLocale);
        String windowsTitle = Translator.getResource().getString("stage.title");
        primaryStage.setTitle(windowsTitle);
        Navigator.getInstance().setStage(primaryStage);
        Navigator.getInstance().goToIndex();
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
