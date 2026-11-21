import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Users {
    public static int getTotalUser(){
        String sql="select count(*) from tblUser";
        try {
            Statement st=MyConnection.connection().createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                return rs.getInt(1);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
