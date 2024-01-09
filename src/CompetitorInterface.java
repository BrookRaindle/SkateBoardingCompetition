import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompetitorInterface {
    private JFrame frame;
    private JButton viewCompetitionButton;
    private JButton viewProfileButton;
    private JButton viewSummaryButton;
    private JButton checkScoresButton;
    private JButton logoutButton;
    public Manager manager = null;

    public CompetitorInterface(Competitor competitor, Manager manager) {
        this.manager = manager;
        frame = new JFrame("Competitor Interface");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        viewCompetitionButton = new JButton("View Competition");
        viewProfileButton = new JButton("View Profile");
        viewSummaryButton = new JButton("View Summary");
        checkScoresButton = new JButton("Check Scores");
        logoutButton = new JButton("Log Out");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        panel.add(viewCompetitionButton);
        panel.add(viewProfileButton);
        panel.add(viewSummaryButton);
        panel.add(checkScoresButton);
        panel.add(logoutButton);

        frame.add(panel);

        viewCompetitionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleViewCompetitionButtonClick();
            }
        });

        viewProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleViewProfileButtonClick();
            }
        });

        viewSummaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleViewSummaryButtonClick();
            }
        });

        checkScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleCheckScoresButtonClick();
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogoutButtonClick();
            }
        });
    }

    public void display() {
        frame.setVisible(true);
    }

    private void handleViewCompetitionButtonClick() {
        JOptionPane.showMessageDialog(frame, "View Competition functionality for Competitor not implemented.");
    }

    private void handleViewProfileButtonClick() {
        JOptionPane.showMessageDialog(frame, "View Profile functionality for Competitor not implemented.");
    }

    private void handleViewSummaryButtonClick() {
        JOptionPane.showMessageDialog(frame, "View Summary functionality for Competitor not implemented.");
    }

    private void handleCheckScoresButtonClick() {
        JOptionPane.showMessageDialog(frame, "Check Scores functionality for Competitor not implemented.");
    }

    private void handleLogoutButtonClick() {
        frame.dispose();
    }
}