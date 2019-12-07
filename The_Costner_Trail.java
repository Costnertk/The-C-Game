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

        while(true)
        {


            // MAIN MENU ___________________________________
            
            // Images needs to be implimented to print main menu

            // prints out menu options
            System.out.println("1.Start game" + "\n2.Continue Game" + "\n3.Load Game" + "\n4.Quit Game");
            userInput = input.nextLine();

            

            // Logic trees for menu

            // Start game
            if(userInput.equals("1"))
            {
                game1.startGame();
            }

            // Continue Game
            else if(userInput.equals("2"))
            {
                System.out.println("this does nothing right now");
            }

            // Load Game 
            else if(userInput.equals("3"))
            {
                System.out.println("this does nothing right now");
            }

            // loop should only break when user choses to quit game

            else if(userInput.equals("4"))
            {
                break;
            }

            // If input meets no parameters it will ask for user to input again
            else
            {
                System.out.println("Not a valid input. Please try againg.");
                userInput = input.nextLine();
            }


        }
    }
}