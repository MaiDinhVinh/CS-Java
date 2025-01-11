package MainDir.Beans.Module;

import MainDir.dbservice.MySQLService;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class Module {
    private ObjectProperty<Integer> id;
    private StringProperty modName;
    private ObjectProperty<Integer> modDuration;
    private StringProperty modLevel;

    public Module(){
        id = new SimpleObjectProperty<Integer>(null);
        modName = new SimpleStringProperty();
        modDuration = new SimpleObjectProperty<Integer>(0);
        modLevel = new SimpleStringProperty();
    }

    public Integer getId(){
        return this.id.get();
    }

    public String getModName(){
        return this.modName.get();
    }

    public Integer getModDuration(){
        return this.modDuration.get();
    }

    public String getModLevel(){
        return this.modLevel.get();
    }

    public ObjectProperty<Integer> getModIdProperty(){
        return this.id;
    }

    public StringProperty getModNameProperty(){
        return this.modName;
    }

    public ObjectProperty<Integer> getModDurationProperty(){
        return this.modDuration;
    }

    public StringProperty getModLevelProperty(){
        return this.modLevel;
    }

    public void setModuleId(int id){
        this.id.set(id);
    }

    public void setModName(String modName){
        this.modName.set(modName);
    }

    public void setModDuration(int modDuration){
        this.modDuration.set(modDuration);
    }

    public void setModLevel(String modLevel){
        this.modLevel.set(modLevel);
    }

    public static ObservableList<Module> selectAll(){
        ObservableList<Module> modules = FXCollections.observableArrayList();

        try(
                Connection conn = MySQLService.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Module;");

                ){
            while(rs.next()){
                Module mod = new Module();
                mod.setModuleId(rs.getInt("id"));
                mod.setModName((rs.getString("mod_name")));
                mod.setModDuration(rs.getInt("mod_duration"));
                mod.setModLevel((rs.getString("mod_level")));

                modules.add(mod);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }

        return modules;
    }

    public static boolean delete(Module selectedMod) {
        String sqlDel = "DELETE FROM Module WHERE id = ?;";
        try(
                Connection conn = MySQLService.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sqlDel);
        ){
            stmt.setInt(1, selectedMod.getId());

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

    public static Module insert(Module mod) throws SQLException {
        String sqlInsert = "INSERT INTO Module(mod_name, mod_duration, mod_level) "
                + "VALUES(?, ?, ?);";
        ResultSet key = null;
        try(
                Connection conn = MySQLService.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sqlInsert,Statement.RETURN_GENERATED_KEYS);
                ){

            stmt.setString(1, mod.getModName());
            stmt.setInt(2, Integer.parseInt(mod.getModDuration().toString()));
            stmt.setString(3, mod.getModLevel());

            int rowUpdated = stmt.executeUpdate();

            if(rowUpdated == 1){
                key = stmt.getGeneratedKeys();
                key.next();
                int insertModuleKey = key.getInt(1);
                mod.setModuleId(insertModuleKey);
                return mod;
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

    public static boolean update(Module mod){
        String sqlUpdate = "UPDATE Module " +
                "SET mod_name = ?, mod_duration = ?, mod_level = ? " +
                "WHERE id = ?;";
        try(
                Connection conn = MySQLService.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sqlUpdate);
                ){
            stmt.setString(1, mod.getModName());
            stmt.setInt(2, Integer.parseInt(Integer.toString(mod.getModDuration())));
            stmt.setString(3, mod.getModLevel());
            stmt.setInt(4, mod.getId());

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
