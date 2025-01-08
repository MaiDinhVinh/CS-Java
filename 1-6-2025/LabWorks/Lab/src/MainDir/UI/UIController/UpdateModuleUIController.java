package MainDir.UI.UIController;


import MainDir.Beans.Module.Module;
import MainDir.UI.fxmlAndMain.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UpdateModuleUIController implements Initializable {

    @FXML
    private TextField txtModName;

    @FXML
    private TextField txtModDuration;

    @FXML
    private ComboBox<String> btnModLevel;

    @FXML
    private Label msgLabel;

    private static Module updateMod;

    @FXML
    void btnBackToIndexClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToModuleIndex();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void initialize(Module selectedMod){
        UpdateModuleUIController.updateMod = selectedMod;
        txtModName.setText(selectedMod.getModName());
        txtModDuration.setText(Integer.toString(selectedMod.getModDuration()));
        btnModLevel.setValue(selectedMod.getModLevel());
    }

    @FXML
    void btnSubmitClick(ActionEvent event) {
        //Module updatedModule = new Module();
        StringBuilder errorMessage = new StringBuilder();
        if(txtModName.getText().equals(""))
            errorMessage.append("Module name shouldn't be empty !\n");
        else
            UpdateModuleUIController.updateMod.setModName(txtModName.getText());
        try{
            UpdateModuleUIController.updateMod.setModDuration(Integer.parseInt(txtModDuration.getText()));
        } catch (NumberFormatException e) {
            errorMessage.append("Module duration must be a valid integer !\n");
        }
        if(btnModLevel.getValue() == null)
            errorMessage.append("Module level shouldn't be empty !\n");
        else
            UpdateModuleUIController.updateMod.setModLevel(btnModLevel.getValue());
        final String ERROR_MESSAGE = errorMessage.toString();
        if(ERROR_MESSAGE.equals("")){
            try{
                boolean isUpdated  = Module.update(UpdateModuleUIController.updateMod);
                if(isUpdated){
                    Alert insertModSuccess = new Alert(Alert.AlertType.INFORMATION);
                    insertModSuccess.setTitle("Insert new module completed");
                    insertModSuccess.setHeaderText("Insert new module completed successfully");
                    insertModSuccess.show();
                    msgLabel.setText("Message: Module updated successfully !");
                }
            } catch (Exception e) {
                System.err.println("controller error !");
            }

        }else {
            Alert insertModFailed = new Alert(Alert.AlertType.ERROR);
            insertModFailed.setTitle("Insert new module failed");
            insertModFailed.setHeaderText("Insert new module failed due to these following reason: \n"
                    + ERROR_MESSAGE);
            insertModFailed.show();
            msgLabel.setText("Message: Error encountered !, please try again");
        }
    }
}
