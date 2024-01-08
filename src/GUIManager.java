import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIManager extends Frame implements ActionListener {
    private CompetitorList competitorList = new CompetitorList();
    private StaffList staffList = new StaffList();
    private CompetitionList competitionList = new CompetitionList();

    private Button loginButton;
    private Button registerButton;
    private Button viewCompetitionsButton;
    private Button exitButton;

    private TextField idTextField;
    public static void main(String[] args) {
        GUIManager manager = new GUIManager();
        manager.init();
    }

    public void init() {
        loginButton = new Button("Login");
        registerButton = new Button("Register for a new competition");
        viewCompetitionsButton = new Button("View all competitions");
        exitButton = new Button("Exit");

        loginButton.addActionListener(this);
        registerButton.addActionListener(this);
        viewCompetitionsButton.addActionListener(this);
        exitButton.addActionListener(this);

        idTextField = new TextField(10);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(loginButton, gbc);

        gbc.gridy = 1;
        add(registerButton, gbc);

        gbc.gridy = 2;
        add(viewCompetitionsButton, gbc);

        gbc.gridy = 3;
        add(exitButton, gbc);

        setTitle("Competition Manager");
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            performLogin();
        } else if (e.getSource() == registerButton) {
            showRegistrationDialog();
        } else if (e.getSource() == viewCompetitionsButton) {
            showCompetitionsDialog();
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    private void performLogin() {
        int id = Integer.parseInt(idTextField.getText());
        Competitor competitor = competitorList.findCompetitorById(id);
        Staff staff = staffList.findStaffById(id);

        if (competitor != null) {
            System.out.println("Logged in as: " + competitor.getName());
            launchCompetitorInterface(competitionList, competitor, competitorList);
        } else if (staff != null) {
            if (staff.getPermissionLevel().equals("Official")) {
                launchOfficialInterface((Official) staff, competitorList, staffList);
            } else {
                System.out.println("Logged in as: " + staff.getName());
                launchStaffInterface(staff, competitorList, staffList, competitionList);
            }
        } else {
            System.out.println("No matching ID found.");
        }
    }

    private void showRegistrationDialog() {
        // Implement the registration dialog
    }

    private void showCompetitionsDialog() {
        // Implement the dialog to view all competitions
    }

    // Other methods for handling the functionality, similar to your original Manager class
}