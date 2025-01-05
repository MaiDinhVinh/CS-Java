/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13_javafx_multi_scenes;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class IndexUIController {

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    void btnDeleteClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Are you sure you want to delete the selected book?");
        alert.setTitle("Deleting a book");
        Optional<ButtonType> confirmationResponse
                = alert.showAndWait();
        if (confirmationResponse.get() == ButtonType.OK) {
            System.out.println("A book is deleted");
        }
    }

    @FXML
    void btnInsertClick(ActionEvent event) throws IOException {

        Navigator.getInstance().goToEdit("-1");
    }

    @FXML
    void btnUpdateClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToEdit("3");
    }

    /**
     * Initializes the controller class.
     */
    public void initialize() {
        System.out.println("#IndexUIController initialized!");
    }

    public void initialize(String... args) {

    }
}
