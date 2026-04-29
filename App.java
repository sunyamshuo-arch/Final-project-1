import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
      
        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new JFrame("Welcome");
            mainFrame.setSize(400, 300);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setLayout(new BorderLayout(10, 10));

            JPanel topPanel = new JPanel();
            JLabel lblFirstName = new JLabel("Yanshuo");
            topPanel.add(lblFirstName);

            JPanel centerPanel = new JPanel();
            JTextField txtFirstName = new JTextField(10);
            centerPanel.add(txtFirstName);

            JPanel bottomPanel = new JPanel();
            JButton okButton = new JButton("OK");
            bottomPanel.add(okButton);

            mainFrame.add(topPanel, BorderLayout.NORTH);
            mainFrame.add(centerPanel, BorderLayout.CENTER);
            mainFrame.add(bottomPanel, BorderLayout.SOUTH);

            mainFrame.setVisible(true);
        });
    }
}
