package MainDir;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class AboutPageUIController {

    @FXML
    void btnAboutClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToAbout();
    }

    @FXML
    void btnBlogClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToBlog();
    }

    @FXML
    void btnContactClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToContact();
    }

    @FXML
    void btnHomeClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToHome();
    }

}