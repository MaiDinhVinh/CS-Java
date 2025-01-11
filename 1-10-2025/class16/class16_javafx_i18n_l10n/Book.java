/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class16_javafx_i18n_l10n;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Administrator
 */
public class Book {

    private ObjectProperty<Integer> id;
    private StringProperty title;
    private StringProperty author;
    private ObjectProperty<Integer> pages;

    public Book() {
        id = new SimpleObjectProperty<>(null);
        title = new SimpleStringProperty();
        author = new SimpleStringProperty();
        pages = new SimpleObjectProperty<>(0);
    }

    public Integer getId() {
        return id.get();
    }

    public String getTitle() {
        return title.get();
    }

    public String getAuthor() {
        return author.get();
    }

    public Integer getPages() {
        return pages.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public void setAuthor(String author) {
        this.author.set(author);
    }

    public void setPages(int pages) {
        this.pages.set(pages);
    }

    public ObjectProperty<Integer> getIdProperty() {
        return this.id;
    }

    public StringProperty getTitleProperty() {
        return this.title;
    }

    public StringProperty getAuthorProperty() {
        return this.author;
    }

    public ObjectProperty<Integer> getPagesProperty() {
        return this.pages;
    }

    public static ObservableList<Book> selectAll() {
        ObservableList<Book> books = FXCollections.observableArrayList();

        try (
                Connection conn = DbService.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM book");) {
            while (rs.next()) {
                Book b = new Book();
                b.setId(rs.getInt("id")); //"id" is column name in table book
                b.setTitle(rs.getString("title")); //"title" is column name in table book
                b.setPages(rs.getInt("page")); //"page" is column name in table book
                b.setAuthor(rs.getString("author")); //"author" is column name in table book

                books.add(b);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return books;
    }

    public static Book insert(Book newBook) throws SQLException {
        String sql = "INSERT into book (title, author, page) "
                + "VALUES (?, ?, ?)";
        ResultSet key = null;
        try (
            Connection conn = DbService.getConnection();
            PreparedStatement stmt = 
                    conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ) {
            
            stmt.setString(1, newBook.getTitle());
            stmt.setString(2, newBook.getAuthor());
            stmt.setInt(3, newBook.getPages());
            
            int rowInserted = stmt.executeUpdate();
            
            if (rowInserted == 1) {
                key = stmt.getGeneratedKeys();
                key.next();
                int newKey = key.getInt(1);
                newBook.setId(newKey);
                return newBook;
            } else {
                System.err.println("No book inserted");
                return null;
            }
            
            
        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            if (key != null) {
                key.close();
            }
        }
    }
    
    public static boolean delete(Book deleteBook) {
        String sql = "DELETE FROM book WHERE id = ?";
        try (
            Connection conn = DbService.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
                ) {
            
            stmt.setInt(1, deleteBook.getId());
                        
            int rowDeleted = stmt.executeUpdate();
            
            if (rowDeleted == 1) {
                return true;
            } else {
                System.err.println("No book deleted");
                return false;
            }
            
            
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }
    
    public static boolean update(Book updateBook) {
        String sql = "UPDATE book SET " +
                "title = ?, " +
                "author = ?, " +
                "page = ? " +
                "WHERE id = ?";
        try (
            Connection conn = DbService.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
                ) {
            
            stmt.setString(1, updateBook.getTitle());
            stmt.setString(2, updateBook.getAuthor());
            stmt.setInt(3, updateBook.getPages());
            stmt.setInt(4, updateBook.getId());
                        
            int rowUpdated = stmt.executeUpdate();
            
            if (rowUpdated == 1) {
                return true;
            } else {
                System.err.println("No book updated");
                return false;
            }
            
            
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }
    
}
