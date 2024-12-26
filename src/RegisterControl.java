
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class RegisterControl implements Initializable {

    @FXML
    private Button closecol;
    @FXML
    private Button submitcol;
    @FXML
    private TextField mobilecol;
    @FXML
    private TextField namecol;
    @FXML
    private TextField idcol;
    @FXML
    private TextField coursecol;
    @FXML
    private Label registerMsg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



    public void closeButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) closecol.getScene().getWindow();
        stage.close();
    }

    public void submitButton(ActionEvent event){
        if(idcol.getText().isBlank()){
             DatabaseConnection connection=new DatabaseConnection();
             Connection connectDB=connectNow.getConnection();

             String id ="idcol";
             String name="namecol";
             String mobile="mobilecol";
             String course="coursecol";

             String insertField="INSERT INTO record(id,name,mobile,course) VALUES ('";
             String insertValues=id+"','"+name+"','"+mobile+"','"+course + "')";
             String insertRegister=insertField+insertValues;

             try{
                 Statement statement=connectDB.createStatement();
                 statement.executeUpdate(insertRegister);
             }catch (Exception e){
                 e.printStackTrace();
                 e.getCause();
             }


            registerMsg.setText(" Not Sucesfuly");
        }
        else {
            registerMsg.setText("User register Sucesfuly");
        }
    }


}


