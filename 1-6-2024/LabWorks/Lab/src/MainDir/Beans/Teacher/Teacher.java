package MainDir.Beans.Teacher;

import MainDir.Beans.Module.Module;
import MainDir.dbservice.MySQLService;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Teacher{
    private ObjectProperty<Integer> id;
    private StringProperty teacherName;
    private StringProperty teacherDOB;
    private StringProperty teacherSSID;

    public Teacher(){
        id = new SimpleObjectProperty<Integer>(null);
        teacherName = new SimpleStringProperty();
        teacherDOB = new SimpleStringProperty();
        teacherSSID = new SimpleStringProperty();
    }

    public Integer getId(){
        return this.id.get();
    }

    public String getTeacherName(){
        return this.teacherName.get();
    }

    public String getTeacherDOB(){
        return this.teacherDOB.get();
    }

    public String getTeacherSSID(){
        return this.teacherSSID.get();
    }

    public ObjectProperty<Integer> getTeacherIdProperty(){
        return this.id;
    }

    public StringProperty getTeacherNameProperty(){
        return this.teacherName;
    }

    public StringProperty getTeacherDOBProperty(){
        return this.teacherDOB;
    }

    public StringProperty getTeacherSSIDProperty(){
        return this.teacherSSID;
    }

    public void setTeacherId(int id){
        this.id.set(id);
    }

    public void setTeacherName(String teacherName){
        this.teacherName.set(teacherName);
    }

    public void setTeacherDOB(String teacherDOB){
        this.teacherDOB.set(teacherDOB);
    }

    public void setTeacherSSID(String teacherSSID){
        this.teacherSSID.set(teacherSSID);
    }

    public static ObservableList<Teacher> selectAll(){
        ObservableList<Teacher> teachers = FXCollections.observableArrayList();

        try(
                Connection conn = MySQLService.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Teacher;");

        ){
            while(rs.next()){
                Teacher t = new Teacher();
                t.setTeacherId(rs.getInt("id"));
                t.setTeacherName(rs.getString("teacher_name"));
                t.setTeacherDOB((rs.getDate("teacher_dob")).toString());
                t.setTeacherSSID(rs.getString("teacher_ssid"));
                teachers.add(t);
            }
        }catch(Exception e){
            System.err.println("Error encountered !");
        }

        return teachers;
    }
}
