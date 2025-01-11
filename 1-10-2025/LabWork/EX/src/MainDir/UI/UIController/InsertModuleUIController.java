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
import java.util.ResourceBundle;
import java.util.Arrays;
import java.util.Optional;

public class InsertModuleUIController implements Initializable {


    @FXML
    private TextField txtModNameInput;

    @FXML
    private TextField txtModDurInput;

    @FXML
    private ComboBox<String> btnChoiceLev;

    @FXML
    private Label msgLabel;

    private static boolean isModDurationNotAppropriate;

    @FXML
    void btnBackToIndexClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToModuleIndex();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnChoiceLev.setItems(FXCollections.observableArrayList(
                Arrays.asList("Beginner", "Intermediate", "Advanced")
        ));
    }

    @FXML
    void btnSubmitClick(ActionEvent event){
        Module insertModule = new Module();
        StringBuilder errorMessage = new StringBuilder();
        if(txtModNameInput.getText().equals(""))
//            errorMessage.append("Module name shouldn't be empty !\n");
              errorMessage.append(Translation.
                      getTranslator().getString("error.module.name.empty"));
        else
            insertModule.setModName(txtModNameInput.getText());
        try{
            insertModule.setModDuration(Integer.parseInt(txtModDurInput.getText()));
        } catch (NumberFormatException e) {
//            errorMessage.append("Module duration must be a valid integer !\n");
              errorMessage.append(Translation.
                    getTranslator().getString("error.module.duration.invalid"));
        }
        if(btnChoiceLev.getValue() == null)
//            errorMessage.append("Module level shouldn't be empty !\n");
            errorMessage.append(Translation.
                    getTranslator().getString("error.module.level.empty"));
        else
            insertModule.setModLevel(btnChoiceLev.getValue());
        final String ERROR_MESSAGE = errorMessage.toString();
        if(ERROR_MESSAGE.equals("")){
            try{
                Module insertedMod = Module.insert(insertModule);
                if(insertedMod != null){
                    Alert insertModSuccess = new Alert(Alert.AlertType.INFORMATION);
//                    insertModSuccess.setTitle("Insert new module completed");
                    insertModSuccess.setTitle(
                            Translation.
                                    getTranslator().getString("alert.insert.success.title")
                    );
//                    insertModSuccess.setHeaderText("Insert new module completed successfully");
                    insertModSuccess.setHeaderText(
                            Translation.
                                    getTranslator().getString("alert.insert.success.header")
                    );
                    insertModSuccess.show();
//                    msgLabel.setText("Message: Module is successfully added with ID: " + insertedMod.getId());
                    msgLabel.setText(Translation.getTranslator().getString("alert.insert.success.message")
                            + insertedMod.getId());
                }
            } catch (Exception e) {
                System.err.println("error encountered !");
            }

        }else{
            Alert insertModFailed = new Alert(Alert.AlertType.ERROR);
//            insertModFailed.setTitle("Insert new module failed");
            insertModFailed.setTitle(
                    Translation.getTranslator().getString("alert.insert.error.title")
            );
//            insertModFailed.setHeaderText("Insert new module failed due to these following reason: \n"
//                    + ERROR_MESSAGE);
            insertModFailed.setHeaderText(Translation.getTranslator().getString("alert.insert.error.header")
                    + ERROR_MESSAGE);
            insertModFailed.show();
//            msgLabel.setText("Message: Error encountered !, please try again");
            msgLabel.setText(
                    Translation.getTranslator().getString("alert.insert.error.message")
            );
        }
    }

    @FXML
    void btnResetClick(ActionEvent event) {
        Alert resetAlert = new Alert(Alert.AlertType.CONFIRMATION);
//        resetAlert.setTitle("Reset confirmation");
        resetAlert.setTitle(
                Translation.getTranslator().getString("alert.reset.title")
        );
//        resetAlert.setHeaderText("Are you sure you want to reset all ?");
        resetAlert.setHeaderText(
                Translation.getTranslator().getString("alert.reset.header")
        );

        Optional<ButtonType> confirmationResponse = resetAlert.showAndWait();
        if(confirmationResponse.get() == ButtonType.OK){
            txtModNameInput.setText("");
            txtModDurInput.setText("");
            btnChoiceLev.setValue(null);
//            msgLabel.setText("Message: Resetted !");
            msgLabel.setText(
                    Translation.getTranslator().getString("alert.reset.success.message")
            );
        }
    }
}
