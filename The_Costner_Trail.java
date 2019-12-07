import java.util.*;
public class The_Costner_Trail
{
    public static void main(String[] ars) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu Page");
        System.out.println("Enter the name you want for your character");
        String name = input.nextLine();
        String userInput;

        StartGame game1 = new StartGame(name);

        game1.startGame();
        
        while(true)
        {
            // main menu while loop
            
            // Images needs to be implimented to print main menu

            // primts out menu options
            System.out.println("1.Start game" + "\n2.Continue Game" + "\n3.Load Game" + "\n4.Quit Game");
            userInput = input.nextLine();

            // Logic trees for menu

            // Start game
            if(userInput.equals("1"))
            {

            }

            // Continue Game
            else if(userInput.equals("2"))
            {

            }

            // Load Game 
            else if(userInput.equals("3"))
            {

            }

            // loop should only break when user choses to quit game

            else if(userInput.equals("4"))
            {
                break;
            }

            else
            {
                System.out.println("Not a valid input. Please try againg.");
            }


        }
    }
}