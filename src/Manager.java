import java.util.Scanner;

public class Manager {
    private static Scanner scanner = new Scanner(System.in);
    private CompetitorList competitorList = new CompetitorList();
    private StaffList staffList = new StaffList();

    public static void main(String[] args) {
        Manager manager = new Manager();  // Create an instance of Manager
        manager.runProgram();  // Call the instance method to run the program
    }

    private void runProgram() {
        int choice;
        buildCompetitors(competitorList);
        buildStaff(staffList);

        do {
            System.out.println("\n" + //
                    "Choose an option:");
            System.out.println("1. Login");
            System.out.println("2. Register as a new competitor");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    login(competitorList, staffList);
                    break;
                case 2:
                    launchRegistrationInterface(competitorList);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    private void login(CompetitorList competitorList, StaffList staffList) {
        System.out.print("Enter your ID number: ");
        int id = scanner.nextInt();

        Competitor competitor = competitorList.findCompetitorById(id);
        Staff staff = staffList.findStaffById(id);

        if (competitor != null) {
            System.out.println("Logged in as: " + competitor.getName());
            launchCompetitorInterface(competitor, competitorList);
        } else if (staff != null) {
            System.out.println("Logged in as: " + staff.getName());
            launchStaffInterface(staff, competitorList, staffList);
        } else {
            System.out.println("No matching ID found.");
        }
    }
    
    private static void buildCompetitors(CompetitorList competitorList) {
        competitorList.addCompetitor(new Surfer(12345, "Liam Rodriguez", "United States", "Amateur", 34));
        competitorList.addCompetitor(new Surfer(23456, "Olivia Monroe", "Germany", "Amateur", 41));
        competitorList.addCompetitor(new Surfer(34567, "Ethan Sullivan", "United Kingdom", "Amateur", 27));
        competitorList.addCompetitor(new Surfer(45678, "Ava Martinez", "Germany", "Amateur", 72));
        competitorList.addCompetitor(new Surfer(56789, "Jackson Harper", "United Kingdom", "Amateur", 19));
        competitorList.addCompetitor(new Surfer(67890, "Sophia Valencia", "Japan", "Amateur", 45));
        competitorList.addCompetitor(new Surfer(78901, "Noah Harrison", "United States", "Amateur", 23));
        competitorList.addCompetitor(new Surfer(89012, "Isabella Chang", "United Kingdom", "Amateur", 25));
        competitorList.addCompetitor(new Surfer(90123, "Mia Patel", "Japan", "Amateur", 34));
        competitorList.addCompetitor(new Surfer(01234, "Lucas Malone", "Japan", "Amateur", 27));
    }

    private static void buildStaff(StaffList staffList){
        staffList.addStaff(new Staff(24650, "Caleb", "", "Thompson","Staff"));
        staffList.addStaff(new Staff(81094, "Stella", "", "Mitchell","Staff"));
        staffList.addStaff(new Staff(87429, "Mason", "", "Williams","Staff"));
        staffList.addStaff(new Staff(56213, "Scarlett", "", "Bennett","Staff"));
        staffList.addStaff(new Staff(93781, "Grace", "", "Cooper","Staff"));
    }

    private static Competitor createCompetitor(int compNum,int competitorType, String name, String country, String level, int age) {
        switch (competitorType) {
            case 1:
                return new Surfer(compNum ,name, country, level, age);
            case 2:
                return new Skater(compNum, name, country, level, age);
            default:
                System.out.println("Invalid competitor type, returning to menu");
                return null;
        }
    }


    private static void launchRegistrationInterface(CompetitorList competitorList){
            System.out.println("\n" + //
                    "Registration process:");
    
            System.out.print("Enter your name: ");
            String name = scanner.next(); // Assuming a single-word name for simplicity
    
            System.out.print("Enter your country: ");
            String country = scanner.next();
    
            System.out.print("Choose your level (Novice, Intermediate, Advanced, Expert, Professional): ");
            String level = scanner.next();
    
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.print("Enter Desired 5 Digit Login number:");
            int compNum = scanner.nextInt();
            while(competitorList.findCompetitorById(compNum) != null){
                System.out.print("Sorry, That number is unavailable, try another number:");
                compNum = scanner.nextInt();
            }
    
            System.out.print("Choose your type (1. ExampleCompetitor, 2. AnotherCompetitor): ");
            int competitorType = scanner.nextInt();
    
            Competitor competitor = createCompetitor(compNum, competitorType, name, country, level, age);
            competitorList.addCompetitor(competitor);
    
            System.out.println("Registration successful!");
            launchCompetitorInterface(competitor);

        }


    private static void launchCompetitorInterface(Competitor competitor, CompetitorList competitorList) {
        int choice;
        do {
            System.out.println("\n" + //
                    "Choose an option:");
            System.out.println("1. Register for new Competition");
            System.out.println("2. Competition Profile");
            System.out.println("3. Return to menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    return competitor.getFullDetails();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while (choice != 3);
    }

    private static void launchStaffInterface(Staff staff, CompetitorList competitorList, StaffList staffList) {
        int choice;
        do {
            System.out.println("\\n" + //
                    "Choose an option:");
            System.out.println("1. Add Score");
            System.out.println("2. Register Competitor Late");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}