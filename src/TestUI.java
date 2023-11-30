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
        WIN gp = new Manager();
            


        choice = 100;
        while (choice != 0 )
        {
            choice = getMenuItem();
            if (choice == 1)  //All forces
            {
            
            }
            else if (choice == 2) //List all battles
            {

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

            }
            else if (choice == 5)
            {
             
            }
            else if (choice == 6)
            {

            }

            else if (choice == 7)
            {

            }
            else if (choice==8) 
            {

            }
            else if (choice == 9)
            {

            }
            else if (choice == 10) // Task 3.5 only
            {

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
