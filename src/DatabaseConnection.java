import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection(){
        String databaseName = "";
        String databaseUser="";
        String databasePassword="";
        String url="jdbc://localhost/" + databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

}
