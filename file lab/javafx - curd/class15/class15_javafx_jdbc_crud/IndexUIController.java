/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class15_javafx_jdbc_crud;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class IndexUIController {

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private TableView<Book> tvBooks;

    @FXML
    private TableColumn<Book, String> tcTitle;

    @FXML
    private TableColumn<Book, String> tcAuthor;

    @FXML
    private TableColumn<Book, Integer> tcPages;

    @FXML
    void btnDeleteClick(ActionEvent event) {
        Book selectedBook = tvBooks.getSelectionModel().getSelectedItem();

        if (selectedBook == null) { //no book is selected
            selectBookWarning();
        } else { //a book is selected
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Are you sure you want to delete the selected book?");
            alert.setTitle("Deleting a book");
            Optional<ButtonType> confirmationResponse
                    = alert.showAndWait();
            if (confirmationResponse.get() == ButtonType.OK) {
                Book deleteBook = tvBooks.getSelectionModel().getSelectedItem();
                boolean result = Book.delete(deleteBook);
                
                if (result) {
                    tvBooks.getItems().remove(deleteBook); //update TableView
                    System.out.println("A book is deleted");
                } else {
                    System.err.println("No book is deleted");
                }
            }
        }

    }

    @FXML
    void btnInsertClick(ActionEvent event) throws IOException {

        Navigator.getInstance().goToEdit(null);
    }

    @FXML
    void btnUpdateClick(ActionEvent event) throws IOException {
        Book updateBook = tvBooks.getSelectionModel().getSelectedItem();
        
        if (updateBook == null) { //no book is selected
            selectBookWarning();
        } else { //a book is selected
            Navigator.getInstance().goToEdit(updateBook);
        }
    }

    /**
     * Initializes the controller class.
     */
    public void initialize() {
        System.out.println("#IndexUIController initialized!");

        tvBooks.setItems(Book.selectAll());

        tcTitle.setCellValueFactory((book) -> {
            return book.getValue().getTitleProperty();
        });

        tcAuthor.setCellValueFactory((book) -> {
            return book.getValue().getAuthorProperty();
        });

        tcPages.setCellValueFactory((book) -> {
            return book.getValue().getPagesProperty();
        });
    }

    private void selectBookWarning() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Please select a book");
        alert.setHeaderText("A book must be selected for the operation");
        alert.showAndWait();
    }
}
