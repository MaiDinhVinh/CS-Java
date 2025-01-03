package MainDir;

import javafx.collections.FXCollections;
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
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.ArrayList;

public class Registration2UIController implements Initializable {

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtEmailRepeat;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtCity;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private PasswordField txtPasswordRepeat;

    @FXML
    private ChoiceBox<String> btnSelectCountry;

    @FXML
    private RadioButton radBtnGenderMale;

    @FXML
    private RadioButton radBtnGenderFemale;

    @FXML
    private ChoiceBox<String> btnSelectDay;

    @FXML
    private ChoiceBox<String> btnSelectMonth;

    @FXML
    private TextField txtDateYear;

    @FXML
    private ChoiceBox<String> btnSelectNationality;

    @FXML
    private CheckBox chkBoxChildren;

    @FXML
    private CheckBox chkBoxTAC;

    @FXML
    private Button btnRegister;

    private final static List<String> OFFICIAL_COUNTRIES = Arrays.asList("Afghanistan",
            "Albania", "Algeria", "Andorra", "Angola",
            "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria",
            "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados",
            "Belarus", "Belgium", "Belize", "Benin", "Bhutan",
            "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei",
            "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia",
            "Cameroon", "Canada", "Central African Republic", "Chad", "Chile",
            "China", "Colombia", "Comoros", "Congo", "Costa Rica",
            "Croatia", "Cuba", "Cyprus", "Czech Republic", "Democratic Republic of the Congo",
            "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador",
            "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia",
            "Eswatini", "Ethiopia", "Fiji", "Finland", "France",
            "Gabon", "Gambia", "Georgia", "Germany", "Ghana",
            "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau",
            "Guyana", "Haiti", "Honduras", "Hungary", "Iceland",
            "India", "Indonesia", "Iran", "Iraq", "Ireland",
            "Israel", "Italy", "Jamaica", "Japan", "Jordan",
            "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan",
            "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia",
            "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar",
            "Malawi", "Malaysia", "Maldives", "Mali", "Malta",
            "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia",
            "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco",
            "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal",
            "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria",
            "North Korea", "North Macedonia", "Norway", "Oman", "Pakistan",
            "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay",
            "Peru", "Philippines", "Poland", "Portugal", "Qatar",
            "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia",
            "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe",
            "Saudi Arabia",
            "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore",
            "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa",
            "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan",
            "Suriname", "Sweden", "Switzerland", "Syria", "Tajikistan",
            "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga",
            "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu",
            "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States",
            "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela",
            "Vietnam", "Yemen", "Zambia", "Zimbabwe");

    private static final List<String> DAYS_IN_A_MONTH = Arrays.asList("1", "2", "3", "4",
            "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");

    private static final List<String> MONTHS_IN_A_YEAR = Arrays.asList("January", "February",
            "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December");

    @FXML
    void btnRegisterClick(ActionEvent event) {
        final StringBuilder errorMessage = new StringBuilder();

        if(txtEmail.getText().equals("")) errorMessage.append("User's email field cannot be empty !\n");
        else{
            if(txtEmailRepeat.getText().equals("")) errorMessage.append("User must repeat their email one more time !\n");
            else if(!txtEmailRepeat.getText().equals(txtEmail.getText()))
                errorMessage.append("Repeated email is not correct !\n");
        }

        if(txtPassword.getText().equals("")) errorMessage.append("User's password field cannot be empty !\n");
        else{
            if(txtPasswordRepeat.getText().equals("")) errorMessage.append("User must repeat their password one more time !\n");
            else if(!txtPasswordRepeat.getText().equals(txtPassword.getText()))
                errorMessage.append("Repeated password is not correct !\n");
        }

        if(txtName.getText().equals("")) errorMessage.append("User's name field cannot be empty !\n");

        if(txtPhone.getText().equals("")) errorMessage.append("User's phone number field cannot be empty !\n");

        if(txtCity.getText().equals("")) errorMessage.append("User's city field cannot be empty !\n");

        if(btnSelectCountry.getValue() == null) errorMessage.append("User's country field cannot be empty !\n");

        if(radBtnGenderMale.isSelected() == false & radBtnGenderFemale.isSelected() == false)
            errorMessage.append("User's gender option cannot be empty !\n");

        if(btnSelectDay.getValue() == null &
                btnSelectMonth.getValue() == null & txtDateYear.getText().equals(""))
            errorMessage.append("User's birthday field cannot be empty !\n");

        if(btnSelectNationality.getValue() == null) errorMessage.append("User's nationality field cannot be empty !\n");

        if(chkBoxChildren.isSelected() == false) errorMessage.append("User must have a child !\n");

        if(chkBoxTAC.isSelected() == false) errorMessage.append("User must agree with Terms and Conditions");

        final String ERROR_MESSAGE = errorMessage.toString();
        if(!ERROR_MESSAGE.equals("")){
            Alert registrationFailed = new Alert(Alert.AlertType.ERROR);
            registrationFailed.setTitle("Registration Failed");
            registrationFailed.setHeaderText("Registration failed due to these reasons: \n" + ERROR_MESSAGE);
            registrationFailed.showAndWait();
        }else{
            Alert registrationCompleted = new Alert(Alert.AlertType.INFORMATION);
            registrationCompleted.setTitle("Registration Completed");
            registrationCompleted.setHeaderText("Registration completed successful");
            registrationCompleted.showAndWait();

        }
    }

    @FXML
    void hyperLinkTAC(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://ducksabervn.com"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnSelectCountry.setItems(FXCollections.
                observableArrayList(Registration2UIController.OFFICIAL_COUNTRIES));
        btnSelectNationality.setItems(FXCollections.
                observableArrayList(Registration2UIController.OFFICIAL_COUNTRIES));

        btnSelectMonth.setItems(FXCollections.
                observableArrayList(Registration2UIController.MONTHS_IN_A_YEAR));

        btnSelectDay.setItems(FXCollections.
                observableArrayList(Registration2UIController.DAYS_IN_A_MONTH));
        ToggleGroup genderGroup = new ToggleGroup();
        radBtnGenderFemale.setToggleGroup(genderGroup);
        radBtnGenderMale.setToggleGroup(genderGroup);
    }
}
