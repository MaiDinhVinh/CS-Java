package MainDir.UI.UIController;


import MainDir.UI.fxmlAndMain.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class HomeUIController {

    @FXML
    void btnModuleClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToModuleIndex();
    }

    @FXML
    void btnTeacherClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToTeacherIndex();
    }

}
