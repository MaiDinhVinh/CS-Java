package MainDir;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Optional;
import java.util.ArrayList;
import java.time.LocalDate;

public class SignUpFormUIController implements Initializable {

    @FXML
    private TextField txtFullNameInput;

    @FXML
    private TextField txtEmailAddressInput;

    @FXML
    private PasswordField txtPaaswordInput;

    @FXML
    private DatePicker txtDobInput;

    @FXML
    private ToggleButton btnGenderMale;

    @FXML
    private ToggleButton btnGenderFemale;

    @FXML
    private ToggleButton btnVisaPayment;

    @FXML
    private ToggleButton btnPayPalPayment;

    @FXML
    private TextField txtCardNumberInput;

    @FXML
    private PasswordField txtCardCvcInput;

    @FXML
    private DatePicker txtExpiredDateInput;

    @FXML
    private CheckBox btnTacAccept;

    @FXML
    private Button btnRegistrationConfirm;

    @FXML
    private Hyperlink hyperLinkTAC;

    private static boolean isVisaPaymentOptionEnabledBefore;

    private static String oldVisaCardNumber;

    private static String oldVisaCvcNumber;

    private static LocalDate oldVisaExpiredDate;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ToggleGroup genderGroup = new ToggleGroup();
        btnGenderMale.setToggleGroup(genderGroup);
        btnGenderFemale.setToggleGroup(genderGroup);

        ToggleGroup paymentGroup = new ToggleGroup();
        btnPayPalPayment.setToggleGroup(paymentGroup);
        btnVisaPayment.setToggleGroup(paymentGroup);
    }

    @FXML
    void btnPayPalPaymentClick(ActionEvent event) throws URISyntaxException, IOException, InterruptedException {
        if(SignUpFormUIController.isVisaPaymentOptionEnabledBefore){
            SignUpFormUIController.oldVisaCardNumber = txtCardNumberInput.getText();
            SignUpFormUIController.oldVisaCvcNumber = txtCardCvcInput.getText();
            SignUpFormUIController.oldVisaExpiredDate = txtExpiredDateInput.getValue();
            txtCardNumberInput.clear();
            txtCardCvcInput.clear();
            //bản chất DatePicker chứa LocalDate object => set về null = k còn gì trong DatePicker
            txtExpiredDateInput.setValue(null);
        }
        Alert payPalRedirect = new Alert(Alert.AlertType.INFORMATION);
        payPalRedirect.setHeaderText("Rediect you to PayPal website...\nYou can close this window once the redirection is completed");
        payPalRedirect.setTitle("Payment redirection");
        payPalRedirect.show();
        Desktop.getDesktop().browse(new URI("https://ducksabervn.com"));
    }

    @FXML
    void btnRegistrationClick(ActionEvent event) {
        //declare all types of error
        String emptyNameField = "";
        String emptyEmailField = "";
        String emptyPasswordField = "";
        String emptyDobField = "";
        String emptyGenderSelecton = "";
        String emptyPaymentOption = "";
        String emptyCardNumber = "";
        String emptyCVCNumber = "";
        String invalidCvcArgument = "";
        String emptyExpiredDate = "";
        String invalidExpiredDate = "";
        String emptyTACCheckBox = "";

        //ArrayList to store all error message
        ArrayList<String> errorMessage = new ArrayList<>();

        //check CVC
        String cvc = txtCardCvcInput.getText();
        if(cvc.length() > 3 | cvc.length() < 3) invalidCvcArgument += "CVC number must contains 3 numbers !\n";
        else{
            for(int i = 0; i < 3; i++){
                if(cvc.charAt(i) >= 48 & cvc.charAt(i) <= 57) continue;
                else{
                    invalidCvcArgument += "CVC number must contains ONLY NUMBER !\n";
                    break;
                }
            }
        }

        errorMessage.add(invalidCvcArgument);

        //check empty field (payment selection not included)
        if(txtFullNameInput.getText().equals("")) emptyNameField += "User name cannot be empty !\n";
        if(txtEmailAddressInput.getText().equals("")) emptyEmailField += "User's email cannot be empty !\n";
        if(txtPaaswordInput.getText().equals("")) emptyPasswordField += "User's password cannot be empty !\n";
//        if(txtDobInput.getValue().equals(null)) emptyDobField += "User's date of birth cannot be empty !\n";

        try{
            //check empty date of birth
            txtDobInput.getValue().toString();
        }catch(NullPointerException e){
            emptyDobField += "User's date of birth cannot be empty !\n";
        }

        if(btnGenderFemale.isSelected() == false & btnGenderMale.isSelected() == false)
            emptyGenderSelecton += "User's gender option cannot be empty !\n";
        errorMessage.add(emptyNameField);
        errorMessage.add(emptyEmailField);
        errorMessage.add(emptyPasswordField);
        errorMessage.add(emptyDobField);
        errorMessage.add(emptyGenderSelecton);
        //check empty field for payment selection
        if(btnVisaPayment.isSelected() == false & btnPayPalPayment.isSelected() == false)
            emptyPaymentOption += "You must choose 1 payment option !\n";
        else if(btnVisaPayment.isSelected() == true){
            if(txtCardNumberInput.getText().equals("")) emptyCardNumber += "Card number field cannot be empty !\n";
            if(txtCardCvcInput.getText().equals("")) emptyCVCNumber += "CVC number field cannot be empty !\n";
            try{
                //check valid expired date
                LocalDate currentSessionDate = LocalDate.now();
                if(txtExpiredDateInput.getValue().equals(currentSessionDate)
                        || txtExpiredDateInput.getValue().isBefore(currentSessionDate)) invalidExpiredDate += "Your card is expired !\n";
            }catch(NullPointerException e){
                emptyExpiredDate += "Your card's expired date cannot be empty !\n";
            }
        }

        errorMessage.add(emptyPaymentOption);
        errorMessage.add(emptyCardNumber);
        errorMessage.add(emptyCVCNumber);
        errorMessage.add(emptyExpiredDate);
        errorMessage.add(invalidExpiredDate);

        if(btnTacAccept.isSelected() == false) emptyTACCheckBox += "You must agree with our Terms and Condition !\n";

        errorMessage.add(emptyTACCheckBox);

        StringBuilder finalErrorMessage = new StringBuilder();
        for(String error: errorMessage){
            if(error.equals("")) continue;
            else finalErrorMessage.append(error);
        }

        final String ERROR_MESSAGE_WINDOW = finalErrorMessage.toString();

        if(ERROR_MESSAGE_WINDOW.equals("")){
            Alert registrationSuccessful = new Alert(Alert.AlertType.INFORMATION);
            registrationSuccessful.setTitle("Registration sucessful");
            registrationSuccessful.setHeaderText("Registration successful !");
            registrationSuccessful.show();
        }else{
            Alert registrationFailed = new Alert(Alert.AlertType.ERROR);
            registrationFailed.setTitle("Registration failed");
            registrationFailed.setHeaderText("Registration failed due to these reasons:\n" + ERROR_MESSAGE_WINDOW);
            registrationFailed.show();
        }
    }

    @FXML
    void btnVisaPaymentClick(ActionEvent event) {
        if(SignUpFormUIController.isVisaPaymentOptionEnabledBefore){
            txtCardNumberInput.setText(SignUpFormUIController.oldVisaCardNumber);
            txtCardCvcInput.setText(SignUpFormUIController.oldVisaCvcNumber);
            txtExpiredDateInput.setValue(SignUpFormUIController.oldVisaExpiredDate);
        }else{
            SignUpFormUIController.isVisaPaymentOptionEnabledBefore = true;
        }
    }

    @FXML
    void hyperLinkClick(ActionEvent event) throws URISyntaxException, IOException{
        Desktop.getDesktop().browse(new URI("https://ducksabervn.com"));
    }
}
