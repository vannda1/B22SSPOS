import javax.swing.*;
import java.awt.*;

public class AdminDashboard {
    private JPanel mainPanel;
    private JLabel lblTotalUser;
    public AdminDashboard(){
        JFrame frame = new JFrame("Admin Dashboard");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        lblTotalUser.setText(Users.getTotalUser()+"");


        frame.setVisible(true);
    }
}
