import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Users {

    public static void setUserToTbl(JTable tbl){
        String sql="Select * from tbluser";
        try {
            Statement st=MyConnection.connection().createStatement();
            ResultSet rs=st.executeQuery(sql);
            ResultSet rs1=st.executeQuery(sql);
            int rowCount=0;
            while (rs1.next()){
                rowCount++;
            }
            String colName[]={"User ID","user name","sex","email","type"};
            String data[][]=new String[rowCount][colName.length];
            int idx=0;
            while (rs.next()){
                data[idx][0]=rs.getInt("userID")+"";
                data[idx][1]=rs.getString("userName");
                data[idx][2]=rs.getString("userSex");
                data[idx][3]=rs.getString("userEmail");
                data[idx][4]=rs.getString("userType");
                idx++;
            }
            DefaultTableModel model= new DefaultTableModel(data,colName);
            tbl.setModel(model);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



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
