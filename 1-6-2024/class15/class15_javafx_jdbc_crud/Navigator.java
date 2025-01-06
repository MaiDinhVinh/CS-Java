/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class15_javafx_jdbc_crud;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class Navigator {

    public static final String INDEX_FXML = "IndexUI.fxml";
    public static final String EDIT_FXML = "EditUI.fxml";
    
    private FXMLLoader loader;
    private Stage stage = null;
    
    private static Navigator nav = null;

    private Navigator() {
    }
    
    public static Navigator getInstance(){
        if (nav == null){
            nav = new Navigator();
        }
        
        return nav;
    }
    
    
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Stage getStage() {
        return stage;
    }
    
    
    
    private void goTo(String fxml) throws IOException {
        this.loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxml));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
    }
    
    public void goToIndex() throws IOException {
        this.goTo(INDEX_FXML);
    }
    
    public void goToEdit(Book editBook) throws IOException {
        this.goTo(EDIT_FXML);
        EditUIController ctrl = loader.getController();
        ctrl.initialize(editBook);
    }
}
