package MainDir;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;
import java.util.Optional;
import java.util.ArrayList;

public class CampsiteRegistrationUIController implements Initializable {

    @FXML
    private TextField txtGuestLessThan2;

    @FXML
    private ComboBox<String> boxAccomodationType;

    @FXML
    private ComboBox<String> boxUserTitle;

    @FXML
    private TextField txtUserFirstName;

    @FXML
    private TextField txtUserLastName;

    @FXML
    private TextField txtUserContactEmail;

    @FXML
    private TextField txtUserContactPhone;

    @FXML
    private DatePicker txtCheckInDate;

    @FXML
    private DatePicker txtCheckOutDate;

    @FXML
    private ComboBox<String> boxEquipmentType;

    @FXML
    private CheckBox chkBoxSlideOuts;

    @FXML
    private TextArea txtAreaReqServ;

    @FXML
    private CheckBox chkBoxPets;

    @FXML
    private TextArea txtAreaComments;

    @FXML
    private Button btnRequestReservation;

    @FXML
    private Button btnCancel;

    @FXML
    private TextField txtGuestMoreThan18;

    @FXML
    private TextField txtGuest2To17;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        boxAccomodationType.setItems(FXCollections.observableArrayList("Tent",
                "RV", "Travel Trailer", "Pop-up Camper", "Safari Tent", "Yurt",
                "Cabin", "Bungalow", "Pod/Camping Pod", "Static Caravan / Park Home",
                "Bell Tent", "Dome Tent", "Treehouse", "Shepherd's Hut",
                "Bivouac / Bivy", "Hammock", "Lodge", "Fifth-wheel Trailer",
                "Teardrop Trailer", "Camper Van"));

        boxUserTitle.setItems(FXCollections.observableArrayList("Mr", "Mrs", "Miss", "Ms",
                "Sir"));

        boxEquipmentType.setItems(FXCollections.observableArrayList("Travel Trailer / Caravan",
                "Fifth-wheel Trailer", "Motorhome / RV (Class A)", "Motorhome / RV (Class B/Camper Van)",
                "Motorhome / RV (Class C)", "Pop-up Camper / Folding Trailer", "Truck Camper",
                "Teardrop Trailer", "Tent Trailer"));
    }

    @FXML
    void btnCancelClick(ActionEvent event) {
        Alert cancelConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
        cancelConfirmation.setTitle("Cancel confirmation");
        cancelConfirmation.setHeaderText("Do you want to cancel the reservation ?\nThis action is irreversible");
        Optional<ButtonType> confirmationResponse = cancelConfirmation.showAndWait();
        if(confirmationResponse.get() == ButtonType.OK) {
            boxAccomodationType.setValue("");
            boxUserTitle.setValue("");
            txtUserFirstName.setText("");
            txtUserLastName.setText("");
            txtGuestLessThan2.setText("");
            txtGuest2To17.setText("");
            txtGuestMoreThan18.setText("");
            txtUserContactEmail.setText("");
            txtUserContactPhone.setText("");
            txtCheckInDate.setValue(null);
            txtCheckOutDate.setValue(null);
            boxEquipmentType.setValue("");
            chkBoxSlideOuts.setSelected(false);
            txtAreaReqServ.clear();
            chkBoxPets.setSelected(false);
            txtAreaComments.clear();

            Alert canellationCompleted = new Alert(Alert.AlertType.INFORMATION);
            canellationCompleted.setTitle("Cancellation Completed");
            canellationCompleted.setHeaderText("Cancellation Completed");
            canellationCompleted.show();
        }
    }
    @FXML
    void btnReqReservationClick(ActionEvent event) {
        ArrayList<String> allErrorType = new ArrayList<>();

        String emptyAccomodation = "";
        String emptyFirstName = "";
        String emptyLastName = "";
        String bothEmailAndPhoneEmpty = "";
        String emptyCheckInDate = "";
        String emptyCheckOutDate = "";
        String emptyEquipmentType = "";
        String invalidCheckInDate = "";
        String invalidCheckOutDate = "";
        String invalidLessThan2GuestAge = "";
        String invalid2To17GuestAge = "";
        String invalidMoreThan18GuestAge = "";

        //check valid check-in - check-out date
        try{
            if(txtCheckInDate.getValue().isAfter(txtCheckOutDate.getValue())){
                invalidCheckInDate += "Check-in date must be smaller than check-out date !\n";
            }else if(txtCheckOutDate.getValue().isBefore(txtCheckInDate.getValue())){
                invalidCheckOutDate += "Check-out date must be larger than check-in date !\n";
            }
        }catch(NullPointerException e){
            if(txtCheckInDate.getValue() == null) emptyCheckInDate += "Check-in date cannot be empty !\n";
            if(txtCheckOutDate.getValue() == null) emptyCheckOutDate += "Check-out date cannot be empty !\n";
        }

        //check valid guests age
        try{
            if(Integer.parseInt(txtGuestLessThan2.getText()) <= 0 |
                    Integer.parseInt(txtGuestLessThan2.getText()) > 1){
                invalidLessThan2GuestAge += "Inappropriate age for guest !\n";
            }

            if(Integer.parseInt(txtGuest2To17.getText()) < 2 |
                    Integer.parseInt(txtGuest2To17.getText()) > 17){
                invalid2To17GuestAge += "Inappropriate age for guest !\n";
            }

            if(Integer.parseInt(txtGuestMoreThan18.getText()) < 18){
                invalidMoreThan18GuestAge += "Inappropriate age for guest !\n";
            }
        }catch(NumberFormatException e){
            if(!txtGuestLessThan2.getText().equals("")) invalidLessThan2GuestAge += "Invalid guest age argument !\n";
            if(!txtGuest2To17.getText().equals("")) invalid2To17GuestAge += "Invalid guest age argument !\n";
            if(!txtGuestMoreThan18.getText().equals("")) invalidMoreThan18GuestAge += "Invalid guest age argument !\n";
        }

        if(txtUserContactEmail.getText().equals("") &
                txtUserContactPhone.getText().equals("")){
            bothEmailAndPhoneEmpty += "Either contact email or phone must be provided !\n";
        }

        if(boxAccomodationType.getValue() == null) emptyAccomodation += "Please provide accomodation option !\n";
        if(boxEquipmentType.getValue() == null) emptyEquipmentType += "Please provide equipment type !\n";

        if(txtUserFirstName.getText().equals("")) emptyFirstName += "User's first name cannot be empty !\n";
        if(txtUserLastName.getText().equals("")) emptyLastName += "User's last name cannot be empty !\n";

        allErrorType.add(emptyAccomodation);
        allErrorType.add(emptyFirstName);
        allErrorType.add(emptyLastName);
        allErrorType.add(bothEmailAndPhoneEmpty);
        allErrorType.add(emptyCheckInDate);
        allErrorType.add(emptyCheckOutDate);
        allErrorType.add(emptyEquipmentType);
        allErrorType.add(invalidCheckInDate);
        allErrorType.add(invalidCheckOutDate);
        allErrorType.add(invalidLessThan2GuestAge);
        allErrorType.add(invalid2To17GuestAge);
        allErrorType.add(invalidMoreThan18GuestAge);

        StringBuilder errorMessage = new StringBuilder();
        for(String str: allErrorType){
            if(str.equals("")) continue;
            else errorMessage.append(str);
        }

        final String ERROR_MESSAGE = errorMessage.toString();

        if(!ERROR_MESSAGE.equals("")){
            Alert reqReservError = new Alert(Alert.AlertType.ERROR);
            reqReservError.setHeaderText("Request reservation falied due to these reason: \n" +ERROR_MESSAGE);
            reqReservError.setTitle("Request reservation failed");
            reqReservError.show();

        }else{
            Alert reqReservSuccessful = new Alert(Alert.AlertType.INFORMATION);
            reqReservSuccessful.setHeaderText("Request Reservation Sucessfully !");
            reqReservSuccessful.setTitle("Request reservation completed");
            reqReservSuccessful.show();

        }
    }
}

