package MainDir.UI.UIController;

import MainDir.Beans.Teacher.Teacher;
import MainDir.UI.fxmlAndMain.Navigator;
import MainDir.i18n_translation_handler.Translation;
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
        StringBuilder errorMessage = new StringBuilder();
        if (txtTeacherName.getText().equals(""))
            errorMessage.append(Translation.getTranslator().getString("error.teacher.update.name.empty"));
        else
            UpdateTeacherUIController.updateTeacher.setTeacherName(txtTeacherName.getText());
        if (dateDOBTeacher.getValue() != null &&
                dateDOBTeacher.getValue().isBefore(LocalDate.now()))
            UpdateTeacherUIController.updateTeacher.setTeacherDOB(dateDOBTeacher.getValue().toString());
        else {
            if (dateDOBTeacher.getValue() == null)
                errorMessage.append(Translation.getTranslator().getString("error.teacher.update.dob.empty"));
            else if (dateDOBTeacher.getValue().equals(LocalDate.now()) ||
                    dateDOBTeacher.getValue().isAfter(LocalDate.now()))
                errorMessage.append(Translation.getTranslator().getString("error.teacher.update.dob.invalid"));
        }
        if(txtTeacherSSID.getText().equals(""))
            errorMessage.append(Translation.getTranslator().getString("error.teacher.update.ssid.empty"));
        else{
            StringBuilder tempSSID = new StringBuilder();
            boolean invalidSSID = false;
            if (txtTeacherSSID.getText().equals(""))
                errorMessage.append(Translation.getTranslator().getString("error.teacher.update.ssid.empty"));
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
                            errorMessage.append(Translation.getTranslator().getString("error.teacher.update.ssid.invalid"));
                    }else errorMessage.append(Translation.getTranslator().getString("error.teacher.update.ssid.length"));
                }else{
                    if(txtTeacherSSID.getText().length() != 11)
                        errorMessage.append(Translation.getTranslator().getString("error.teacher.update.ssid.length"));
                    else errorMessage.append(Translation.getTranslator().getString("error.teacher.update.ssid.invalid"));
                }
            }
        }
        final String ERROR_MESSAGE = errorMessage.toString();
        if(ERROR_MESSAGE.equals("")){
            try{
                boolean isUpdated = Teacher.update(UpdateTeacherUIController.updateTeacher);
                if(isUpdated){
                    Alert insertModSuccess = new Alert(Alert.AlertType.INFORMATION);
                    insertModSuccess.setTitle(Translation.getTranslator().getString("alert.teacher.update.success.title"));
                    insertModSuccess.setHeaderText(Translation.getTranslator().getString("alert.teacher.update.success.header"));
                    insertModSuccess.show();
                    msgLabel.setText(Translation.getTranslator().getString("alert.teacher.update.success.message"));
                }
            } catch (Exception e) {
                System.err.println("error encountered !");
            }
        }else{
            Alert insertModFailed = new Alert(Alert.AlertType.ERROR);
            insertModFailed.setTitle(Translation.getTranslator().getString("alert.teacher.update.error.title"));
            insertModFailed.setHeaderText(Translation.getTranslator().getString("alert.teacher.update.error.header")
                    + ERROR_MESSAGE);
            insertModFailed.show();
            msgLabel.setText(Translation.getTranslator().getString("alert.teacher.update.error.message"));
        }
    }

    @FXML
    void btnResetClick(ActionEvent event) {
        Alert resetAlert = new Alert(Alert.AlertType.CONFIRMATION);
        resetAlert.setTitle(Translation.getTranslator().getString("alert.teacher.update.reset.title"));
        resetAlert.setHeaderText(Translation.getTranslator().getString("alert.teacher.update.reset.header"));

        Optional<ButtonType> confirmationResponse = resetAlert.showAndWait();
        if(confirmationResponse.get() == ButtonType.OK){
            txtTeacherName.setText(UpdateTeacherUIController.oldTeacherName);
            dateDOBTeacher.setValue(UpdateTeacherUIController.oldTeacherDOB);
            txtTeacherSSID.setText(UpdateTeacherUIController.oldTeacherSSID);
            msgLabel.setText(Translation.getTranslator().getString("alert.teacher.update.reset.success.message"));
        }
    }
}