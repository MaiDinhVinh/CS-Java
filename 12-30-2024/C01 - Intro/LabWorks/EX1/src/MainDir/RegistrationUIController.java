package MainDir;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;
import java.net.URL;
import java.net.URI;
import java.util.ResourceBundle;

public class RegistrationUIController implements Initializable {

    @FXML
    private RadioButton radBtnPersonal;

    @FXML
    private RadioButton radBtnCompany;

    @FXML
    private TextField txtEmailInput;

    @FXML
    private TextField txtNameInput;

    @FXML
    private PasswordField txtPasswordInput;

    @FXML
    private RadioButton radBtnMale;

    @FXML
    private RadioButton radBtnFemale;

    @FXML
    private Button BtnRegistrationConfirm;

    @FXML
    private Hyperlink HyperLinkTaC;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*
        * 1 cách code khác thay thế 2 code bên dưới, gợi ý bởi
        * Claude 3.5 Sonnet*/

        /*ToggleGroup userTypeGroup = new ToggleGroup();
        radBtnPersonal.setToggleGroup(userTypeGroup);
        radBtnCompany.setToggleGroup(userTypeGroup);

        ToggleGroup genderGroup = new ToggleGroup();
        radBtnMale.setToggleGroup(genderGroup);
        radBtnFemale.setToggleGroup(genderGroup);
        */
    }

    @FXML
    void radioBtnCompanyClick(ActionEvent event) {
        if(radBtnPersonal.isSelected()){
            Alert personalRadSelected = new Alert(Alert.AlertType.ERROR);
            personalRadSelected.setHeaderText("ERROR: Only 1 type of user is allowed, " +
                    "please choose again !");
            personalRadSelected.setTitle("ERROR");

            Optional<ButtonType> confirmationResponse = personalRadSelected.showAndWait();

            /*
            * lưu ý: method disarm() cho button k hoạt động đc ở đây, phải dùng method
            * setSelected(<boolean value>) để logic code mới chạy đc
            * => logic code đúng nhưng lại dùng sai method + quá ngu trong việc
            * quên k save file .fxml lại*/

            if(confirmationResponse.get() == ButtonType.OK) radBtnCompany.setSelected(false);
        }
    }

    @FXML
    void radioBtnPersonalClick(ActionEvent event) {
        if(radBtnCompany.isSelected()){
            Alert companyRadSelected = new Alert(Alert.AlertType.ERROR);
            companyRadSelected.setHeaderText("ERROR: Only 1 type of user is allowed, " +
                    "please choose again !");
            companyRadSelected.setTitle("ERROR");

            /*
             * lưu ý: method disarm() cho button k hoạt động đc ở đây, phải dùng method
             * setSelected(<boolean value>) để logic code mới chạy đc
             * => logic code đúng nhưng lại dùng sai method + quá ngu trong việc
             * quên k save file .fxml lại*/

            Optional<ButtonType> confirmationResponse = companyRadSelected.showAndWait();

            if(confirmationResponse.get() == ButtonType.OK) radBtnCompany.setSelected(false);
        }
    }

    @FXML
    void radioBtnFemaleClick(ActionEvent event) {
        if(radBtnMale.isSelected()) {
            Alert maleRadSelected = new Alert(Alert.AlertType.ERROR);
            maleRadSelected.setHeaderText("ERROR: Only 1 type of gender is allowed, " +
                    "please choose again !");
            maleRadSelected.setTitle("ERROR");

            /*
             * lưu ý: method disarm() cho button k hoạt động đc ở đây, phải dùng method
             * setSelected(<boolean value>) để logic code mới chạy đc
             * => logic code đúng nhưng lại dùng sai method + quá ngu trong việc
             * quên k save file .fxml lại*/

            Optional<ButtonType> confirmationResponse = maleRadSelected.showAndWait();

            if (confirmationResponse.get() == ButtonType.OK) radBtnFemale.setSelected(false);
        }
    }

    @FXML
    void radioBtnMaleClick(ActionEvent event) {
        if(radBtnFemale.isSelected()) {
            Alert femaleRadSelected = new Alert(Alert.AlertType.ERROR);
            femaleRadSelected.setHeaderText("ERROR: Only 1 type of gender is allowed, " +
                    "please choose again !");
            femaleRadSelected.setTitle("ERROR");

            /*
             * lưu ý: method disarm() cho button k hoạt động đc ở đây, phải dùng method
             * setSelected(<boolean value>) để logic code mới chạy đc
             * => logic code đúng nhưng lại dùng sai method + quá ngu trong việc
             * quên k save file .fxml lại*/

            Optional<ButtonType> confirmationResponse = femaleRadSelected.showAndWait();

            if (confirmationResponse.get() == ButtonType.OK) radBtnMale.setSelected(false);
        }
    }

    @FXML
    void hyperLinkTACClick(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://ducksabervn.com"));
    }

    @FXML
    void registrationConfirmClick(ActionEvent event) {
        
    }

}
