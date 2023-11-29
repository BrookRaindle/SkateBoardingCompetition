import java.util.Scanner;

public class TestUI {
    
    private Scanner In = new Scanner(System.in);

    private int getMenuItem()
    {
        int choice = 100;
        System.out.println("Main Menu");
        System.out.println("0. Quit");
        System.out.println("1. test StaffBuilder");
        System.out.println("2. test BuildCompetition");
        System.out.println("3. --");
        System.out.println("4. --");
        System.out.println("5. --");
        System.out.println("6. --");
        System.out.println("7. --");
        System.out.println("8. --");
        //For Task 3.5 only
        System.out.println("9. Save this test");
        System.out.println("10. Restore a test");

        while (choice < 0 || choice  > 10)
        {
            System.out.println("Enter the number of your choice");
            choice =  In.nextInt();
        }
    }
    
    private void playGame()
    {
        int choice;
        String admiralName;
        int result = -1;
        System.out.println("Enter admiral's name");
        String s = In.nextLine();
        WIN gp = new Manager(s);
        choice = 100;
        while (choice != 0 )
        {
            choice = getMenuItem();
            if (choice == 1)  //All forces
            {
                System.out.println(gp.getAllForces());
            }
            else if (choice == 2) //List all battles
            {
                System.out.println(gp.getAllBattles());
            }
            else if (choice == 3) //get Force
            {
                System.out.println("Enter Force reference");
                myIn.nextLine();
                String ref = (myIn.nextLine()).trim();
              System.out.println(gp.getForceDetails(ref));
            }
            else if (choice == 4) //activate Force
            {
                System.out.println("Enter Force Reference to be Activated");
                myIn.nextLine();
                String ref = (myIn.nextLine()).trim();
                int ans = gp.activateForce(ref);
                System.out.println(this.activation(ans));
                System.out.println("New Balance: " + gp.getWarchest() + "\n");

            }
            else if (choice == 5) //List ASFleet
            {
                System.out.println(gp.getASFleet());
            }
            else if (choice == 6) //engage in a battle
            {
                System.out.println("Enter Battle Number to Engage");
                myIn.nextLine();
                int number = Integer.parseInt(myIn.nextLine().trim());
                result = gp.doBattle(number);
                if(result == -1){
                    System.out.print("No such battle Exists");
                }
                if(result == 0){
                    System.out.println("Congratulations, You Won the Battle!");
                    System.out.println("New Balance: " + gp.getWarchest() + "\n");
                }
                if(result == 1){
                    System.out.println("No Suitable Force Available, You Lost the Battle!");
                    System.out.println("New Balance: " + gp.getWarchest() + "\n");
                }
                if(result == 2){
                    System.out.println("Your Ship Wasn't Strong Enough and was destroyed!" + "\n" + "You Lose the Battle!");
                    System.out.println("New Balance: " + gp.getWarchest() + "\n");
                }
                if(result == 3){
                    System.out.println("Your Ship Wasn't Strong Enough and was destroyed!");
                    System.out.println("You are out of Ships and are Completely Defeated!");
                }
                if(result == 4){
                    System.out.println("Your Strengths were the same, You win the battle!");
                    System.out.println("New Balance: " + gp.getWarchest() + "\n");
                }
            }

            else if (choice == 7) //recall force
            {
                System.out.println("Enter Force Reference to be Recalled");
                String ref = (myIn.nextLine()).trim();
                gp.recallForce(ref);
                System.out.println("Forced recalled successfully");

            }
            else if (choice==8) //view game state
            {
                System.out.println(gp.toString());
            }
            // Uncomment after task 3.5

            else if (choice == 9){
                System.out.println("Write to file");
                gp.saveGame("Olenka.txt");
             }
             else if (choice == 10) // Task 3.5 only
             {
                 System.out.println("Restore from file");
                 ((SpaceWars) gp).restoreGame("SaveFile.txt");
                 System.out.println(gp.toString());
             }
        }
        System.out.println("Thank-you");
    }













    public static void main(String[] args){
        TestUI test = new TestUI();
        test.runTest();
    }
}

















}
