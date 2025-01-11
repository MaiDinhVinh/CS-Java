package MainDir.UI.UIController;

import MainDir.Beans.Teacher.Teacher;
import MainDir.UI.fxmlAndMain.Navigator;
import MainDir.i18n_translation_handler.Translation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

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
        Alert resetAlert = new Alert(Alert.AlertType.CONFIRMATION);
        resetAlert.setTitle(Translation.getTranslator().getString("alert.teacher.reset.title"));
        resetAlert.setHeaderText(Translation.getTranslator().getString("alert.teacher.reset.header"));

        Optional<ButtonType> confirmationResponse = resetAlert.showAndWait();
        if(confirmationResponse.get() == ButtonType.OK){
            txtTeacherNameInput.setText("");
            dateTeacherDOBInput.setValue(null);
            txtTeacherSSIDInput.setText("");
            msgLabel.setText(Translation.getTranslator().getString("alert.teacher.reset.success.message"));
        }
    }

    @FXML
    void btnSubmitClick(ActionEvent event) {
        Teacher teacher = new Teacher();
        StringBuilder errorMessage = new StringBuilder();
        if (txtTeacherNameInput.getText().equals(""))
            errorMessage.append(Translation.getTranslator().getString("error.teacher.name.empty"));
        else
            teacher.setTeacherName(txtTeacherNameInput.getText());
        if (dateTeacherDOBInput.getValue() != null &&
                dateTeacherDOBInput.getValue().isBefore(LocalDate.now()))
            teacher.setTeacherDOB(dateTeacherDOBInput.getValue().toString());
        else {
            if (dateTeacherDOBInput.getValue() == null)
                errorMessage.append(Translation.getTranslator().getString("error.teacher.dob.empty"));
            else if (dateTeacherDOBInput.getValue().equals(LocalDate.now()) ||
                    dateTeacherDOBInput.getValue().isAfter(LocalDate.now()))
                errorMessage.append(Translation.getTranslator().getString("error.teacher.dob.invalid"));
        }
        if(txtTeacherSSIDInput.getText().equals(""))
            errorMessage.append(Translation.getTranslator().getString("error.teacher.ssid.empty"));
        else{
            StringBuilder tempSSID = new StringBuilder();
            boolean invalidSSID = false;
            if (txtTeacherSSIDInput.getText().equals(""))
                errorMessage.append(Translation.getTranslator().getString("error.teacher.ssid.empty"));
            else{
                if(dateTeacherDOBInput.getValue() != null) {
                    if(txtTeacherSSIDInput.getText().length() == 11){
                        switch (txtTeacherSSIDInput.getText().substring(0, 2)) {
                            case "00":
                            case "01":
                            case "10":
                            case "11":
                                tempSSID.append(txtTeacherSSIDInput.getText().substring(0, 2));
                                break;
                            default:
                                invalidSSID = true;
                        }
                        if (Integer.valueOf(
                                Integer.parseInt(txtTeacherSSIDInput.getText().substring(2, 4))
                        ) != (dateTeacherDOBInput.getValue().getYear() % 100))
                            invalidSSID = true;
                        else
                            tempSSID.append(txtTeacherSSIDInput.getText().substring(2, 4));
                        if (Integer.valueOf(
                                Integer.parseInt(txtTeacherSSIDInput.getText().substring(4, 6))
                        ) != (dateTeacherDOBInput.getValue().getMonthValue()))
                            invalidSSID = true;
                        else
                            tempSSID.append(txtTeacherSSIDInput.getText().substring(4, 6));
                        if (!invalidSSID)
                            teacher.setTeacherSSID(tempSSID.toString() +
                                    txtTeacherSSIDInput.getText().substring(6));
                        else
                            errorMessage.append(Translation.getTranslator().getString("error.teacher.ssid.invalid"));
                    }else errorMessage.append(Translation.getTranslator().getString("error.teacher.ssid.length"));
                }else{
                    if(txtTeacherSSIDInput.getText().length() > 11
                            || txtTeacherSSIDInput.getText().length() < 11)
                        errorMessage.append(Translation.getTranslator().getString("error.teacher.ssid.length"));
                    else errorMessage.append(Translation.getTranslator().getString("error.teacher.ssid.invalid"));
                }
            }
        }
        final String ERROR_MESSAGE = errorMessage.toString();
        if(ERROR_MESSAGE.equals("")){
            try{
                Teacher insertedTeacher = Teacher.insert(teacher);
                if(insertedTeacher != null){
                    Alert insertModSuccess = new Alert(Alert.AlertType.INFORMATION);
                    insertModSuccess.setTitle(Translation.getTranslator().getString("alert.teacher.insert.success.title"));
                    insertModSuccess.setHeaderText(Translation.getTranslator().getString("alert.teacher.insert.success.header"));
                    insertModSuccess.show();
                    msgLabel.setText(Translation.getTranslator().getString("alert.teacher.insert.success.message") + insertedTeacher.getId());
                }
            } catch (Exception e) {
                System.err.println("error encountered !");
            }
        }else{
            Alert insertModFailed = new Alert(Alert.AlertType.ERROR);
            insertModFailed.setTitle(Translation.getTranslator().getString("alert.teacher.insert.error.title"));
            insertModFailed.setHeaderText(Translation.getTranslator().getString("alert.teacher.insert.error.header")
                    + ERROR_MESSAGE);
            insertModFailed.show();
            msgLabel.setText(Translation.getTranslator().getString("alert.teacher.insert.error.message"));
        }
    }
}