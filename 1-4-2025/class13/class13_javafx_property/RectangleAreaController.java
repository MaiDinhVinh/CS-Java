/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13_javafx_property;

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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

public class RectangleAreaController implements Initializable {

    private static final String ZERO = "0";

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
    private ProgressBar pbProgress;

    @FXML
    private Spinner<Integer> spSpinner;

    @FXML
    private CheckBox cbCompleted;

    @FXML
    void btnCalculateClick(ActionEvent event) {
        calculatePerimeter();
        calculateArea();
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
        btnReset.disableProperty().set(true);
        txtLength.textProperty().addListener((observable, oldValue, newValue) -> {
            calculatePerimeter();
            calculateArea();
            disableEnableReset();
        });
        txtWidth.textProperty().addListener((observable, oldValue, newValue) -> {
            calculatePerimeter();
            calculateArea();
            disableEnableReset();
        });

        initSpinner();

    }

    void initSpinner() {
        spSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0, 10)
        //                    int min,
        //                    int max,
        //                    int initialValue,
        //                    int amountToStepBy
        );

        spSpinner.valueProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == 100) {
                cbCompleted.setSelected(true);
            } else {
                cbCompleted.setSelected(false);
            }
            pbProgress.setProgress(1.0 * newValue / 100.0);
        });
    }

    void resetTextFields() {
        txtLength.setText(ZERO);
        txtWidth.setText(ZERO);
    }

    void calculatePerimeter() {
        double p = 0;
        try {
            double length = Double.parseDouble(txtLength.getText());
            double width = Double.parseDouble(txtWidth.getText());

            p = (length + width) * 2;
        } catch (Exception e) {
        }

        txtPerimeterResult.setText(Double.toString(p));

    }

    void calculateArea() {
        double area = 0;
        try {
            double length = Double.parseDouble(txtLength.getText());
            double width = Double.parseDouble(txtWidth.getText());
            area = length * width;
        } catch (Exception e) {
        }

        txtAreaResult.setText(Double.toString(area));
    }

    void disableEnableReset() {
        try {
            double length = Double.parseDouble(txtLength.getText());
            double width = Double.parseDouble(txtWidth.getText());
            int zero = Integer.parseInt(ZERO);
            if (length == zero && width == zero) {
                btnReset.disableProperty().set(true);
            } else {
                btnReset.disableProperty().set(false);
            }
        } catch (Exception e) {
            btnReset.disableProperty().set(false);
        }

    }
}
