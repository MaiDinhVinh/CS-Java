package MainDir.Beans.Module;

import MainDir.dbservice.MySQLService;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
            System.err.println("Error encountered !");
        }

        return modules;
    }


}
