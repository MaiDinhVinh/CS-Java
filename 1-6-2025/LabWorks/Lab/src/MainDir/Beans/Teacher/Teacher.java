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
import java.sql.*;
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

    public static boolean delete(Teacher selectedTeacher) {
        String sqlDel = "DELETE FROM Teacher WHERE id = ?;";
        try(
                Connection conn = MySQLService.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sqlDel);
        ){
            stmt.setInt(1, selectedTeacher.getId());

            boolean isDeleted = stmt.executeUpdate() == 1 ? true : false;
            if(isDeleted){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            System.err.println("Error encountered !");
            return false;
        }
    }

    public static Teacher insert(Teacher t) throws SQLException {
        String sqlInsert = "INSERT INTO Teacher(teacher_name, teacher_dob, teacher_ssid) "
                + "VALUES(?, ?, ?)";
        ResultSet key = null;
        try(
                Connection conn = MySQLService.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
        ){

            stmt.setString(1, t.getTeacherName());
            stmt.setString(2, t.getTeacherDOB());
            stmt.setString(3, t.getTeacherSSID());

            int rowUpdated = stmt.executeUpdate();

            if(rowUpdated == 1){
                key = stmt.getGeneratedKeys();
                key.next();
                int insertModuleKey = key.getInt(1);
                t.setTeacherId(insertModuleKey);
                return t;
            }else{
                System.err.println("no module inserted !");
                return null;
            }
        } catch (Exception e) {
            System.err.println("Error encountered !");
            return null;
        }finally{
            if(key != null) key.close();
        }
    }

    public static boolean update(Teacher teacher){
        String sqlUpdate = "UPDATE Teacher " +
                "SET teacher_name = ?, teacher_dob = ?, teacher_ssid = ? " +
                "WHERE id = ?;";
        try(
                Connection conn = MySQLService.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sqlUpdate);
        ){
            stmt.setString(1, teacher.getTeacherName());
            String LocalDate;
            stmt.setString(2, teacher.getTeacherDOB());
            stmt.setString(3, teacher.getTeacherSSID());
            stmt.setInt(4, teacher.getId());

            int rowUpdated = stmt.executeUpdate();

            if(rowUpdated == 1) return true;
            else{
                System.out.println("No module updated !");
                return false;
            }
        }catch(Exception e){
            System.err.println("sql update error encountered !");
            return false;
        }
    }
}
