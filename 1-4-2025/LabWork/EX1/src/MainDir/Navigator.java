package MainDir;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigator {

    private static final String HOME_FXML = "HomePageUI.fxml";
    private static final String ABOUT_FXML = "AboutPageUI.fxml";
    private static final String BLOG_FXML = "BlogPageUI.fxml";
    private static final String CONTACT_FXML = "ContactPageUI.fxml";

    private Stage stage = null;
    private static Navigator nav = null;
    private FXMLLoader loader;

    private Navigator(){
    }

    public static Navigator getInstance(){
        if(nav == null) nav = new Navigator();
        return nav;
    }

    public Stage getStage(){
        return this.stage;
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }

    private void goTo(String fxml) throws IOException {
        this.loader = new FXMLLoader();
        this.loader.setLocation(getClass().getResource(fxml));
        Parent root = this.loader.load();
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
    }

    public void goToHome() throws IOException {
        this.goTo(HOME_FXML);
    }

    public void goToAbout() throws IOException{
        this.goTo(ABOUT_FXML);
    }

    public void goToBlog() throws IOException{
        this.goTo(BLOG_FXML);
    }

    public void goToContact() throws IOException{
        this.goTo(CONTACT_FXML);
    }
}
