package MainDir.UI.UIController;


import MainDir.Beans.Teacher.Teacher;
import MainDir.UI.fxmlAndMain.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;

public class UpdateTeacherUIController implements Initializable {

    @FXML
    private TextField txtTeacherName;

    @FXML
    private DatePicker dateDOBTeacher;

    @FXML
    private TextField txtTeacherSSID;

    @FXML
    private Label msgLabel;

    private static Teacher updateTeacher;

    private static String oldTeacherName;

    private static LocalDate oldTeacherDOB;

    private static String oldTeacherSSID;

    @FXML
    void btnBackToIndexClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToTeacherIndex();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void initialize(Teacher selectedTeacher){
        UpdateTeacherUIController.updateTeacher = selectedTeacher;
        UpdateTeacherUIController.oldTeacherName = UpdateTeacherUIController.updateTeacher.getTeacherName();
        UpdateTeacherUIController.oldTeacherDOB = LocalDate.parse(
                UpdateTeacherUIController.updateTeacher.getTeacherDOB());
        UpdateTeacherUIController.oldTeacherSSID = UpdateTeacherUIController.updateTeacher.getTeacherSSID();
        txtTeacherName.setText(selectedTeacher.getTeacherName());
        dateDOBTeacher.setValue(LocalDate.parse(selectedTeacher.getTeacherDOB()));
        txtTeacherSSID.setText(selectedTeacher.getTeacherSSID());
    }

    @FXML
    void btnSubmitClick(ActionEvent event) {
        //Teacher teacher = new Teacher();
        StringBuilder errorMessage = new StringBuilder();
        if (txtTeacherName.getText().equals(""))
            errorMessage.append("Teacher name field cannot be empty !\n");
        else
            UpdateTeacherUIController.updateTeacher.setTeacherName(txtTeacherName.getText());
        if (dateDOBTeacher.getValue() != null &&
                dateDOBTeacher.getValue().isBefore(LocalDate.now()))
            UpdateTeacherUIController.updateTeacher.setTeacherDOB(dateDOBTeacher.getValue().toString());
        else {
            if (dateDOBTeacher.getValue() == null)
                errorMessage.append("Teacher DOB field cannot be empty !\n");
            else if (dateDOBTeacher.getValue().equals(LocalDate.now()) ||
                    dateDOBTeacher.getValue().isAfter(LocalDate.now()))
                errorMessage.append("Teacher DOB cannot equal or larger than current date !\n");
        }
        if(txtTeacherSSID.getText().equals(""))
            errorMessage.append("Teacher SSID cannot be empty !\n");
        else{
            StringBuilder tempSSID = new StringBuilder();
            boolean invalidSSID = false;
            if (txtTeacherSSID.getText().equals(""))
                errorMessage.append("Teacher SSID cannot be empty !\n");
            else {
                if(dateDOBTeacher.getValue() != null) {
                    if(txtTeacherSSID.getText().length() == 11){
                        switch (txtTeacherSSID.getText().substring(0, 2)) {
                            case "00":
                            case "01":
                            case "10":
                            case "11":
                                tempSSID.append(txtTeacherSSID.getText().substring(0, 2));
                                break;
                            default:
                                invalidSSID = true;
                        }
                        if (Integer.valueOf(
                                Integer.parseInt(txtTeacherSSID.getText().substring(2, 4))
                        ) != (dateDOBTeacher.getValue().getYear() % 100))
                            invalidSSID = true;
                        else
                            tempSSID.append(txtTeacherSSID.getText().substring(2, 4));
                        if (Integer.valueOf(
                                Integer.parseInt(txtTeacherSSID.getText().substring(4, 6))
                        ) != (dateDOBTeacher.getValue().getMonthValue()))
                            invalidSSID = true;
                        else
                            tempSSID.append(txtTeacherSSID.getText().substring(4, 6));
                        if (!invalidSSID)
                            UpdateTeacherUIController.updateTeacher.setTeacherSSID(tempSSID.toString() +
                                    txtTeacherSSID.getText().substring(6));
                        else
                            errorMessage.append("Invalid teacher SSID !\n");
                    }else errorMessage.append("SSID must consist of 11 digits !\n");
                }else{
                    if(txtTeacherSSID.getText().length() > 11
                            || txtTeacherSSID.getText().length() < 11)
                        errorMessage.append("SSID must consist of 11 digits !\n");
                    else errorMessage.append("Invalid teacher SSID !\n"); //already invalid since DOB is missing tho
                }
            }
        }
        final String ERROR_MESSAGE = errorMessage.toString();
        if(ERROR_MESSAGE.equals("")){
            try{
                boolean isUpdated = Teacher.update(UpdateTeacherUIController.updateTeacher);
                if(isUpdated){
                    Alert insertModSuccess = new Alert(Alert.AlertType.INFORMATION);
                    insertModSuccess.setTitle("Update new teacher completed");
                    insertModSuccess.setHeaderText("Update new teacher completed successfully");
                    insertModSuccess.show();
                    msgLabel.setText("Message: Teacher is successfully updated !");
                }
            } catch (Exception e) {
                System.err.println("error encountered !");
            }
        }else{
            Alert insertModFailed = new Alert(Alert.AlertType.ERROR);
            insertModFailed.setTitle("Update new teacher failed");
            insertModFailed.setHeaderText("Update new teacher failed due to these following reason: \n"
                    + ERROR_MESSAGE);
            insertModFailed.show();
            msgLabel.setText("Message: Error encountered !, please try again");
        }
    }

    @FXML
    void btnResetClick(ActionEvent event) {
        Alert resetAlert = new Alert(Alert.AlertType.CONFIRMATION);
        resetAlert.setTitle("Reset confirmation");
        resetAlert.setHeaderText("Are you sure you want to reset all ?");

        Optional<ButtonType> confirmationResponse = resetAlert.showAndWait();
        if(confirmationResponse.get() == ButtonType.OK){
            txtTeacherName.setText(UpdateTeacherUIController.oldTeacherName);
            dateDOBTeacher.setValue(UpdateTeacherUIController.oldTeacherDOB);
            txtTeacherSSID.setText(UpdateTeacherUIController.oldTeacherSSID);
            msgLabel.setText("Message: Resetted !");
        }
    }
}
