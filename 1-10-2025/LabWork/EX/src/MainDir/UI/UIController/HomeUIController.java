package MainDir.UI.UIController;


import MainDir.UI.fxmlAndMain.Navigator;
import MainDir.i18n_translation_handler.Translation;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class HomeUIController implements Initializable {


    @FXML
    private ComboBox<String> btnPreferLang;

    private static String lastLanguageSelected = "";

    @FXML
    void btnModuleClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToModuleIndex();
    }

    @FXML
    void btnTeacherClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToTeacherIndex();
    }

    @FXML
    void btnPreferLangClick(ActionEvent event) throws IOException {
        if(btnPreferLang.getValue().equals("German")){
            Locale currentLocale = new Locale("de", "DE");
            Translation.setLocale(currentLocale);
            HomeUIController.lastLanguageSelected = "German";
        }else{
            Locale currentLocale = new Locale("en", "US");
            Translation.setLocale(currentLocale);
            HomeUIController.lastLanguageSelected = "English";
        }
        Navigator.getInstance().goToHome();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnPreferLang.setItems
                (FXCollections.observableArrayList("English", "German"));
        if(HomeUIController.lastLanguageSelected.equals("German"))
            btnPreferLang.setValue("German");
        else
            btnPreferLang.setValue("English");
    }
}
