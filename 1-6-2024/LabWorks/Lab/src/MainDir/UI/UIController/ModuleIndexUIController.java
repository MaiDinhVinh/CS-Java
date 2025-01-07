package MainDir.UI.UIController;


import MainDir.Beans.Module.Module;
import MainDir.UI.fxmlAndMain.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



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
        Navigator.getInstance().goToUpdateModule();
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
