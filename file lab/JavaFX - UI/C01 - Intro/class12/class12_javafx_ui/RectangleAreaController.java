/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12_javafx_ui;

/**
 *
 * @author Administrator
 */
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class RectangleAreaController implements Initializable {

    @FXML
    private TextField txtLength;

    @FXML
    private TextField txtWidth;

    @FXML
    private Button btnCalculate;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtPerimeterResult;

    @FXML
    private TextField txtAreaResult;

    @FXML
    void btnCalculateClick(ActionEvent event) {
        double length = Double.parseDouble(txtLength.getText());
        double width = Double.parseDouble(txtWidth.getText());

        double p = (length + width) * 2;
        double area = length * width;

        txtPerimeterResult.setText(Double.toString(p));
        txtAreaResult.setText(Double.toString(area));

    }

    @FXML
    void btnResetClick(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setHeaderText("Are you sure you want to reset all inputs?");
        alert.setTitle("Resetting Inputs");
        Optional<ButtonType> confirmationResponse 
                = alert.showAndWait();
        if (confirmationResponse.get() == ButtonType.OK) {
            resetTextFields();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initialized");
        resetTextFields();
    }

    void resetTextFields() {
        txtLength.setText("0");
        txtWidth.setText("0");
    }
}
