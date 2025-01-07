package MainDir.UI.UIController;


import MainDir.UI.fxmlAndMain.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class InsertModuleUIController {

    @FXML
    void btnBackToIndexClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToModuleIndex();
    }

}
