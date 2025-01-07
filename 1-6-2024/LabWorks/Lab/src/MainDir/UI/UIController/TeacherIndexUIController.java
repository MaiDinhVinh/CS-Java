package MainDir.UI.UIController;


import MainDir.Beans.Teacher.Teacher;
import MainDir.UI.fxmlAndMain.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
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
        Navigator.getInstance().goToUpdateTeacher();
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
}
