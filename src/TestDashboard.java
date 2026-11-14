import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDashboard {
    private JPanel mainPanel;
    private JLabel lblTotalUser;
    public TestDashboard(){
        JFrame frame= new JFrame("Admin Dashboard");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        String sql="select count(*) from tbluser";
        try {
            Statement statement=MyConnection.connection().createStatement();
            ResultSet rs=statement.executeQuery(sql);
            if(rs.next()){
                lblTotalUser.setText(rs.getInt(1)+"");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        frame.setVisible(true);
    }
}
