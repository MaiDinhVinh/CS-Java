package MainDir.UI.UIController;

import MainDir.Beans.Module.Module;
import MainDir.UI.fxmlAndMain.Navigator;
import MainDir.i18n_translation_handler.Translation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Optional;

public class ModuleIndexUIController implements Initializable {

    @FXML
    private TableView<Module> modTv;

    @FXML
    private TableColumn<Module, Integer> modIDCol;

    @FXML
    private TableColumn<Module, String> modNameCol;

    @FXML
    private TableColumn<Module, String> modLevelCol;

    @FXML
    private TableColumn<Module, Integer> modDurationCol;

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
        Module selectedMod = modTv.getSelectionModel().getSelectedItem();
        if(selectedMod == null){
            Alert noSelectedTeacher = new Alert(Alert.AlertType.ERROR);
            noSelectedTeacher.setTitle(Translation.getTranslator().getString("index.alert.module.update.error.title"));
            noSelectedTeacher.setHeaderText(Translation.getTranslator().getString("index.alert.module.update.error.header"));
            noSelectedTeacher.show();
        }else Navigator.getInstance().goToUpdateModule(selectedMod);
    }

    @FXML
    void btnDelModClick(ActionEvent event) {
        Module selectedMod = modTv.getSelectionModel().getSelectedItem();

        boolean isNull = selectedMod == null ? true : false;

        if(isNull){
            Alert deleteRowErr = new Alert(Alert.AlertType.ERROR);
            deleteRowErr.setTitle(Translation.getTranslator().getString("alert.module.delete.error.title"));
            deleteRowErr.setHeaderText(Translation.getTranslator().getString("alert.module.delete.error.header"));
            deleteRowErr.show();
        }else{
            Alert deleteRowConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
            deleteRowConfirmation.setTitle(Translation.getTranslator().getString("alert.module.delete.confirm.title"));
            deleteRowConfirmation.setHeaderText(Translation.getTranslator().getString("alert.module.delete.confirm.header"));

            Optional<ButtonType> confirmationResponse = deleteRowConfirmation.showAndWait();
            if(confirmationResponse.get() == ButtonType.OK){
                boolean isDeleted = Module.delete(selectedMod) ? true : false;
                if(isDeleted){
                    modTv.getItems().remove(selectedMod);
                    System.out.println("module deleted");
                }else{
                    System.out.println("module deleted unsucessfully !");
                }
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        modTv.setItems(Module.selectAll());

        modIDCol.setCellValueFactory((module) -> {
            return module.getValue().getModIdProperty();
        });

        modNameCol.setCellValueFactory((module) -> {
            return module.getValue().getModNameProperty();
        });

        modDurationCol.setCellValueFactory((module) -> {
            return module.getValue().getModDurationProperty();
        });

        modLevelCol.setCellValueFactory((module) -> {
            return module.getValue().getModLevelProperty();
        });
    }
}