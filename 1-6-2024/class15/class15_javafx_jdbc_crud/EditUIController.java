/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class15_javafx_jdbc_crud;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class EditUIController {

    private Book editBook = null;

    @FXML
    private TextField txtTitle;

    @FXML
    private TextField txtAuthor;

    @FXML
    private TextField txtPages;

    @FXML
    private Button btnBackToIndex;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnSubmit;

    @FXML
    private Label lbMessage;

    @FXML
    void btnBackToIndexClick(ActionEvent event) throws IOException {
        Navigator.getInstance().goToIndex();
    }

    @FXML
    void btnResetClick(ActionEvent event) {

    }

    @FXML
    void btnSubmitClick(ActionEvent event) {
        try {
            if (editBook == null) { //insert a new book
                Book insertBook = extractBookFromFields();
                insertBook = Book.insert(insertBook);

                String msg = "New book inserted with id: " + insertBook.getId();
                lbMessage.setText(msg);
            } else { //update an existing book
                Book updateBook = extractBookFromFields();
                updateBook.setId(this.editBook.getId());
                
                boolean result = Book.update(updateBook);
                if (result) {
                    lbMessage.setText("Updated Succesfully");
                } else {
                    lbMessage.setText("Updated Unsuccessfully");
                }
            }
        } catch (Exception e) {
            lbMessage.setText(e.getMessage());
        }

    }

    /**
     * Initializes the controller class.
     */
    public void initialize() {
        // TODO
    }

    public void initialize(Book editBook) {
        this.editBook = editBook;
        String msg = "";
        if (this.editBook == null) { //insert a new book
            msg = "Create a new book";
        } else { //update an existing book
            msg = "Update an existing book";
            txtTitle.setText(editBook.getTitle());
            txtAuthor.setText(editBook.getAuthor());
            txtPages.setText(
                    Integer.toString(editBook.getPages())
            );
        }

        lbMessage.setText(msg);
    }

    private Book extractBookFromFields() {
        Book book = new Book();
        book.setTitle(txtTitle.getText());
        book.setAuthor(txtAuthor.getText());
        book.setPages(
                Integer.parseInt(txtPages.getText())
        );
        return book;
    }
}
