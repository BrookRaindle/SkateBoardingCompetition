import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    private JFrame frame;
    private JButton loginButton;
    private JButton registerButton;
    private JButton viewCompetitionButton;
    private JButton exitButton;

    public Gui() {
        frame = new JFrame("Main Menu");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginButton = new JButton("Login");
        registerButton = new JButton("Register");
        viewCompetitionButton = new JButton("View Competition");
        exitButton = new JButton("Exit");

        JPanel panel = new JPanel();
        panel.add(loginButton);
        panel.add(registerButton);
        panel.add(viewCompetitionButton);
        panel.add(exitButton);

        frame.add(panel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLoginButtonClick();
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleRegisterButtonClick();
            }
        });

        viewCompetitionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleViewCompetitionButtonClick();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void display() {
        frame.setVisible(true);
    }

    private void handleLoginButtonClick() {
        // Implement login functionality here
        String userID = JOptionPane.showInputDialog(frame, "Enter your user ID:");
        if (userID != null && !userID.isEmpty()) {
            int userId = Integer.parseInt(userID);
            // Use the entered user ID to determine the user type and launch the corresponding interface
            // For simplicity, we assume the user ID is enough to identify the user type.
            launchUserInterface(userId);
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid user ID. Please enter a valid ID.");
        }
    }

    private void handleRegisterButtonClick() {
        // Implement register functionality here
        // You may want to create a registration dialog or navigate to another frame
        // for user input.
        JOptionPane.showMessageDialog(frame, "Register functionality not implemented.");
    }

    private void handleViewCompetitionButtonClick() {
        // Implement view competition functionality here
        // You may want to create a dialog to select a competition and display its details.
        JOptionPane.showMessageDialog(frame, "View Competition functionality not implemented.");
    }

    private void launchUserInterface(int userId) {
        // Use the user ID to determine the user type and launch the corresponding interface
        // This is a placeholder. You need to replace it with your actual logic.
        // For simplicity, we assume that user IDs starting with 1 are competitors, 2 are staff, and 3 are officials.
        if (userId >= 1 && userId <= 3) {
            JOptionPane.showMessageDialog(frame, "Launching user interface for user ID: " + userId);
            // Implement logic to open the corresponding user interface based on the user type
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid user ID. Unable to determine user type.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui().display();
            }
        });
    }
}