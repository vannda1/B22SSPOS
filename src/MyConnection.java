import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection connection(){
        String str="jdbc:ucanaccess://src//db//pos.accdb";
        try {
            Connection con= DriverManager.getConnection(str);
            if(con!=null){
                System.out.println("database connected!");
                return con;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
