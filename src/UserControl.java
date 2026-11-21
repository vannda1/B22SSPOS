import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserControl {
    private JPanel mainPanel;
    private JButton backButton;
    private JButton deleteButton;
    private JButton editButton;
    private JButton addNewButton;
    private JTextField txtSearch;
    private JButton searchButton;
    private JTable table1;

    public UserControl(int uid){
        JFrame frame= new JFrame("User Control");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(mainPanel);

        backButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AdminDashboard admin= new AdminDashboard();
                frame.setVisible(false);
            }
        });

        Users.setUserToTbl(table1);
        frame.setVisible(true);
    }
}
