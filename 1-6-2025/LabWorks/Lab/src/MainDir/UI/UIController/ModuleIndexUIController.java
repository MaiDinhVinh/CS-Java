package MainDir.UI.UIController;


import MainDir.Beans.Module.Module;
import MainDir.UI.fxmlAndMain.Navigator;
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
        Navigator.getInstance().goToUpdateModule(selectedMod);
    }

    @FXML
    void btnDelModClick(ActionEvent event) {
        Module selectedMod = modTv.getSelectionModel().getSelectedItem();

        boolean isNull = selectedMod == null ? true : false;

        if(isNull){
            Alert deleteRowErr = new Alert(Alert.AlertType.ERROR);
            deleteRowErr.setTitle("Delete module unsucessfully !");
            deleteRowErr.setHeaderText("No book is selected !, please select a book to delete");
            deleteRowErr.show();
        }else{
            Alert deleteRowConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
            deleteRowConfirmation.setTitle("Delete module confirmation");
            deleteRowConfirmation.setHeaderText("Are you sure you want to delete this book ?");

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
