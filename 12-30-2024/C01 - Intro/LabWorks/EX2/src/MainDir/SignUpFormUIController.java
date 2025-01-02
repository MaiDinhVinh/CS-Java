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
    private TextField txtPaaswordInput;

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
        String invalidCvcArgument = "";
        String visaPaymentHasBeenChosen = "";
        String emptyNameField = "";
        String emptyEmailField = "";
        String emptyPasswordField = "";
        String emptyDobField = "";
        String emptyCardNumber = "";
        String emptyCVCNumber = "";


    }

    @FXML
    void btnVisaPaymentClick(ActionEvent event) {
        if(SignUpFormUIController.isVisaPaymentOptionEnabledBefore){
            txtCardNumberInput.
        }
    }




}
