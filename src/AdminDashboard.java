import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminDashboard {
    private JPanel mainPanel;
    private JLabel lblTotalUser;
    private JLabel lblUser;

    public AdminDashboard(){
        JFrame frame = new JFrame("Admin Dashboard");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        lblTotalUser.setText(Users.getTotalUser()+"");


        frame.setVisible(true);
        lblUser.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                UserControl user= new UserControl(1);
                frame.setVisible(false);
            }
        });
    }
}
