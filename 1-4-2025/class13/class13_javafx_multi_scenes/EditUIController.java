/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13_javafx_multi_scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class EditUIController {

    @FXML
    private TextField txtTitle;

    @FXML
    private TextField txtAuthor;

    @FXML
    private TextField txtPages;

    @FXML
    private Button btnBackToIndex;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnSubmit;

    @FXML
    private Label lbMessage;

    @FXML
    void btnBackToIndexClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToIndex();
    }

    @FXML
    void btnResetClick(ActionEvent event) {

    }

    @FXML
    void btnSubmitClick(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    public void initialize() {
        // TODO
    }

    public void initialize(String... args) {
        String id = args[0];
        String msg = "";
        if (id.equals("-1")) {
            msg = "Create a new book";
        } else {
            msg = "Update an existing book";
        }
        
        lbMessage.setText(msg);
    }
}
