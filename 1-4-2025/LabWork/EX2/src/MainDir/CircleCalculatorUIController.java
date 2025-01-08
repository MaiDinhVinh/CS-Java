package MainDir;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CircleCalculatorUIController implements Initializable {

    private static final String ZERO = "0";

    @FXML
    private TextField txtRadInput;

    @FXML
    private TextField txtCircumferOutput;

    @FXML
    private TextField txtAreaOutput;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtRadInput.setText(ZERO);
        txtRadInput.textProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if(txtRadInput.getText().equals("")){
                        txtRadInput.setText(ZERO);
                        calculateCircumference();
                        calculateArea();
                    }else{
                        if(!txtRadInput.getText().equals("0") & txtRadInput.getText().charAt(0) == '0'){
                            String tempInput = txtRadInput.getText().substring(1);
                            txtRadInput.setText(tempInput);
                        }
                        calculateCircumference();
                        calculateArea();
                    }
        });
    }

    private void calculateCircumference(){
        txtCircumferOutput.setText(
                Double.toString(2 * Math.PI * Double.parseDouble(txtRadInput.getText()))
        );
    }

    private void calculateArea(){
        txtAreaOutput.setText(
                Double.toString(Math.PI * Double.parseDouble(txtRadInput.getText()) *
                        Double.parseDouble(txtRadInput.getText()))
        );
    }
}
