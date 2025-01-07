package MainDir.UI.UIController;


import MainDir.UI.fxmlAndMain.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class ModuleIndexUIController {

    @FXML
    void btnBackToHomeClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToHome();
    }

    @FXML
    void btnInsertModClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToInsertModule();
    }

    @FXML
    void btnUpdateModClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToUpdateModule();
    }

}
