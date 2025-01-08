package MainDir.UI.UIController;


import MainDir.Beans.Teacher.Teacher;
import MainDir.UI.fxmlAndMain.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class InsertTeacherUIController {

    @FXML
    private TextField txtTeacherNameInput;

    @FXML
    private DatePicker dateTeacherDOBInput;

    @FXML
    private TextField txtTeacherSSIDInput;

    @FXML
    private Label msgLabel;

    private static boolean isTeacherDOBNotAppropriate;

    @FXML
    void btnBackToIndexClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToTeacherIndex();
    }

    @FXML
    void btnResetClick(ActionEvent event) {

    }

    @FXML
    void btnSubmitClick(ActionEvent event) {
        Teacher teacher = new Teacher();
        StringBuilder errorMessage = new StringBuilder();
        if (txtTeacherNameInput.getText().equals(""))
            errorMessage.append("Teacher name field cannot be empty !\n");
        else
            teacher.setTeacherName(txtTeacherNameInput.getText());
        if (dateTeacherDOBInput.getValue() != null &&
                dateTeacherDOBInput.getValue().isBefore(LocalDate.now()))
            teacher.setTeacherDOB(dateTeacherDOBInput.getValue().toString());
        else {
            if (dateTeacherDOBInput.getValue() == null)
                errorMessage.append("Teacher DOB field cannot be empty !\n");
            else if (dateTeacherDOBInput.getValue().equals(LocalDate.now()) ||
                    dateTeacherDOBInput.getValue().isAfter(LocalDate.now()))
                errorMessage.append("Teacher DOB cannot equal or larger than current date !\n");
        }
        if(txtTeacherSSIDInput.getText().equals(""))
            errorMessage.append("Teacher SSID cannot be empty !\n");
        else{
            StringBuilder tempSSID = new StringBuilder();
            boolean invalidSSID = false;
            if (txtTeacherSSIDInput.getText().equals(""))
                errorMessage.append("Teacher SSID cannot be empty !\n");
            else{
                switch(txtTeacherSSIDInput.getText().substring(0, 2)){
                    case "00":
                    case "01":
                    case "10":
                    case "11":
                        tempSSID.append(txtTeacherSSIDInput.getText().substring(0, 2));
                        break;
                    default:
                        invalidSSID = true;
                }
            }

            if(Integer.valueOf(
                    Integer.parseInt(txtTeacherSSIDInput.getText().substring(2, 4))
            ) != (dateTeacherDOBInput.getValue().getYear()%100))
                invalidSSID = true;
            else
                tempSSID.append(txtTeacherSSIDInput.getText().substring(2, 4));
            if(Integer.valueOf(
                    Integer.parseInt(txtTeacherSSIDInput.getText().substring(4, 6))
            ) != (dateTeacherDOBInput.getValue().getMonthValue()))
                invalidSSID = true;
            else
                tempSSID.append(txtTeacherSSIDInput.getText().substring(4, 6));
            if(!invalidSSID)
                teacher.setTeacherSSID(tempSSID.toString() +
                        txtTeacherSSIDInput.getText().substring(6));
            else
                errorMessage.append("Invalid teacher SSID !\n");
        }
        final String ERROR_MESSAGE = errorMessage.toString();
        if(ERROR_MESSAGE.equals("")){
            try{
                Teacher insertedTeacher = Teacher.insert(teacher);
                if(insertedTeacher != null){
                    Alert insertModSuccess = new Alert(Alert.AlertType.INFORMATION);
                    insertModSuccess.setTitle("Insert new teacher completed");
                    insertModSuccess.setHeaderText("Insert new teacher completed successfully");
                    insertModSuccess.show();
                    msgLabel.setText("Message: Teacher is successfully added with ID: " + insertedTeacher.getId());
                }
            } catch (Exception e) {
                System.err.println("error encountered !");
            }
        }else{
            Alert insertModFailed = new Alert(Alert.AlertType.ERROR);
            insertModFailed.setTitle("Insert new teacher failed");
            insertModFailed.setHeaderText("Insert new teacher failed due to these following reason: \n"
                    + ERROR_MESSAGE);
            insertModFailed.show();
            msgLabel.setText("Message: Error encountered !, please try again");
        }
    }

}
