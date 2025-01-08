package MainDir.UI.fxmlAndMain;

import MainDir.Beans.Module.Module;
import MainDir.Beans.Teacher.Teacher;
import MainDir.UI.UIController.UpdateModuleUIController;
import MainDir.UI.UIController.UpdateTeacherUIController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigator {
    private final static String HOME_FXML = "Home.fxml";

    private final static String MOD_INDEX_FXML = "ModuleIndexUI.fxml";

    private final static String TEACHER_INDEX_FXML = "TeacherIndexUI.fxml";

    private final static String MOD_INSERT_FXML = "InsertModuleUI.fxml";

    private final static String TEACHER_INSERT_FXML = "InsertTeacherUI.fxml";

    private final static String MOD_UPDATE_FXML = "UpdateModuleUI.fxml";

    private final static String TEACHER_UPDATE_FXML = "UpdateTeacherUI.fxml";

    private Stage stage;

    private FXMLLoader loader;

    private static Navigator nav = null;

    private Navigator(){}

    public static Navigator getInstance(){
        if(nav == null){
            nav =  new Navigator();
        }
        return nav;
    }

    public Stage getStage(){
        return this.stage;
    }

    public Navigator getNav(){
        return nav;
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }

    private void goTo(String fxml) throws IOException {
        this.loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxml));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
    }

    public void goToHome() throws IOException {
        this.goTo(HOME_FXML);
    }

    public void goToModuleIndex() throws IOException {
        this.goTo(MOD_INDEX_FXML);
    }

    public void goToTeacherIndex() throws IOException {
        this.goTo(TEACHER_INDEX_FXML);
    }

    public void goToInsertModule() throws IOException {
        this.goTo(MOD_INSERT_FXML);
    }

    public void goToInsertTeacher() throws IOException {
        this.goTo(TEACHER_INSERT_FXML);
    }

    public void goToUpdateModule(Module selectedMod) throws IOException {
        this.goTo(MOD_UPDATE_FXML);
        UpdateModuleUIController updateModCtrl = loader.getController();
        updateModCtrl.initialize(selectedMod);
    }

    public void goToUpdateTeacher(Teacher selectedTeacher) throws IOException {
        this.goTo(TEACHER_UPDATE_FXML);
        UpdateTeacherUIController updateTeachCtrl = loader.getController();
        updateTeachCtrl.initialize(selectedTeacher);
    }
}
