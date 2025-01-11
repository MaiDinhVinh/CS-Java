package MainDir.UI.UIController;

import MainDir.Beans.Module.Module;
import MainDir.UI.fxmlAndMain.Navigator;
import MainDir.i18n_translation_handler.Translation;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Optional;
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

    private static String oldModName;

    private static Integer oldModDuration;

    private static String oldModLevel;

    @FXML
    void btnBackToIndexClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToModuleIndex();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnModLevel.setItems(FXCollections.observableArrayList(
                Arrays.asList("Beginner", "Intermediate", "Advanced")
        ));
    }

    public void initialize(Module selectedMod){
        UpdateModuleUIController.updateMod = selectedMod;
        UpdateModuleUIController.oldModName = UpdateModuleUIController.updateMod.getModName();
        UpdateModuleUIController.oldModDuration = UpdateModuleUIController.updateMod.getModDuration();
        UpdateModuleUIController.oldModLevel = UpdateModuleUIController.updateMod.getModLevel();
        txtModName.setText(selectedMod.getModName());
        txtModDuration.setText(Integer.toString(selectedMod.getModDuration()));
        btnModLevel.setValue(selectedMod.getModLevel());
    }

    @FXML
    void btnSubmitClick(ActionEvent event) {
        StringBuilder errorMessage = new StringBuilder();
        if(txtModName.getText().equals(""))
            errorMessage.append(Translation.getTranslator().getString("error.module.update.name.empty"));
        else
            UpdateModuleUIController.updateMod.setModName(txtModName.getText());
        try{
            UpdateModuleUIController.updateMod.setModDuration(Integer.parseInt(txtModDuration.getText()));
        } catch (NumberFormatException e) {
            errorMessage.append(Translation.getTranslator().getString("error.module.update.duration.invalid"));
        }
        if(btnModLevel.getValue() == null)
            errorMessage.append(Translation.getTranslator().getString("error.module.update.level.empty"));
        else
            UpdateModuleUIController.updateMod.setModLevel(btnModLevel.getValue());
        final String ERROR_MESSAGE = errorMessage.toString();
        if(ERROR_MESSAGE.equals("")){
            try{
                boolean isUpdated  = Module.update(UpdateModuleUIController.updateMod);
                if(isUpdated){
                    Alert insertModSuccess = new Alert(Alert.AlertType.INFORMATION);
                    insertModSuccess.setTitle(Translation.getTranslator().getString("alert.module.update.success.title"));
                    insertModSuccess.setHeaderText(Translation.getTranslator().getString("alert.module.update.success.header"));
                    insertModSuccess.show();
                    msgLabel.setText(Translation.getTranslator().getString("alert.module.update.success.message"));
                }
            } catch (Exception e) {
                System.err.println("controller error !");
            }

        }else {
            Alert insertModFailed = new Alert(Alert.AlertType.ERROR);
            insertModFailed.setTitle(Translation.getTranslator().getString("alert.module.update.error.title"));
            insertModFailed.setHeaderText(Translation.getTranslator().getString("alert.module.update.error.header")
                    + ERROR_MESSAGE);
            insertModFailed.show();
            msgLabel.setText(Translation.getTranslator().getString("alert.module.update.error.message"));
        }
    }

    @FXML
    void btnResetClick(ActionEvent event) {
        Alert resetAlert = new Alert(Alert.AlertType.CONFIRMATION);
        resetAlert.setTitle(Translation.getTranslator().getString("alert.module.update.reset.title"));
        resetAlert.setHeaderText(Translation.getTranslator().getString("alert.module.update.reset.header"));

        Optional<ButtonType> confirmationResponse = resetAlert.showAndWait();
        if(confirmationResponse.get() == ButtonType.OK){
            txtModName.setText(UpdateModuleUIController.oldModName);
            txtModDuration.setText(Integer.toString(UpdateModuleUIController.oldModDuration));
            btnModLevel.setValue(UpdateModuleUIController.oldModLevel);
            msgLabel.setText(Translation.getTranslator().getString("alert.module.update.reset.success.message"));
        }
    }
}