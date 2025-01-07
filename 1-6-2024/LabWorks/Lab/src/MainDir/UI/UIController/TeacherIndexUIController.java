package MainDir.UI.UIController;


import MainDir.UI.fxmlAndMain.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class TeacherIndexUIController {

    @FXML
    void btnBackToHomeClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToHome();
    }

    @FXML
    void btnInsertTeacherClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToInsertTeacher();
    }

    @FXML
    void btnUpdateTeacherClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToUpdateTeacher();
    }

}
