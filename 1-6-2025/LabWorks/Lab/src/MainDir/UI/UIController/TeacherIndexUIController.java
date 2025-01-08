package MainDir.UI.UIController;


import MainDir.Beans.Module.Module;
import MainDir.Beans.Teacher.Teacher;
import MainDir.UI.fxmlAndMain.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class TeacherIndexUIController implements Initializable {

    @FXML
    private TableView<Teacher> teacherTv;

    @FXML
    private TableColumn<Teacher, Integer> teacherIDCol;

    @FXML
    private TableColumn<Teacher, String> teacherNameCol;

    @FXML
    private TableColumn<Teacher, String> teacherDOBCol;

    @FXML
    private TableColumn<Teacher, String> teacherSSIDCol;


    @FXML
    void btnBackToHomeClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToHome();
    }

    @FXML
    void btnInsertTeacherClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToInsertTeacher();
    }

    @FXML
    void btnUpdateTeacherClick(ActionEvent event) throws IOException {
        Teacher selectedTeacher = teacherTv.getSelectionModel().getSelectedItem();
        if(selectedTeacher == null){
            Alert noSelectedTeacher = new Alert(Alert.AlertType.ERROR);
            noSelectedTeacher.setTitle("Update error");
            noSelectedTeacher.setHeaderText("Please choose a teacher to update !");
            noSelectedTeacher.show();
        }else Navigator.getInstance().goToUpdateTeacher(selectedTeacher);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        teacherTv.setItems(Teacher.selectAll());

        teacherIDCol.setCellValueFactory((teacher) -> {
            return teacher.getValue().getTeacherIdProperty();
        });

        teacherNameCol.setCellValueFactory((teacher) -> {
            return teacher.getValue().getTeacherNameProperty();
        });

        teacherDOBCol.setCellValueFactory((teacher) -> {
            return teacher.getValue().getTeacherDOBProperty();
        });

        teacherSSIDCol.setCellValueFactory((teacher) -> {
            return teacher.getValue().getTeacherSSIDProperty();
        });
    }

    @FXML
    void btnTeacherDeleteClick(ActionEvent event) {
        Teacher selectedTeacher = teacherTv.getSelectionModel().getSelectedItem();

        boolean isNull = selectedTeacher == null ? true : false;

        if(isNull){
            Alert deleteRowErr = new Alert(Alert.AlertType.ERROR);
            deleteRowErr.setTitle("Delete teacher unsucessfully !");
            deleteRowErr.setHeaderText("No teacher is selected !, please select a teacher to delete");
            deleteRowErr.show();
        }else{
            Alert deleteRowConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
            deleteRowConfirmation.setTitle("Delete teacher confirmation");
            deleteRowConfirmation.setHeaderText("Are you sure you want to delete this teacher ?");

            Optional<ButtonType> confirmationResponse = deleteRowConfirmation.showAndWait();
            if(confirmationResponse.get() == ButtonType.OK){
                boolean isDeleted = Teacher.delete(selectedTeacher) ? true : false;
                if(isDeleted){
                    teacherTv.getItems().remove(selectedTeacher);
                    System.out.println("teacher deleted");
                }else{
                    System.out.println("teacher deleted unsucessfully !");
                }
            }
        }
    }
}
