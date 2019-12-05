import java.util.*;
public class The_Costner_Trail
{
  public static int currentQuest = 1;
    
    public static void main(String[] ars)
    {
      Images text = new Images(name);
        Scanner input = new Scanner(System.in);
        //These statments will be encorperated into their own method as "character details"
        System.out.println("Menu Page");
        System.out.println("Enter the name you want for your character");
        String name = input.nextLine();
        Quests selectedQuest = new Quests(name);
        text.printTitle();
        
        System.out.println("1.Start game" + "\n" + "2.View Achievements" + "\n" + "3.Continue Game");
        int choice = input.nextInt();
        
      
        
        

        if(choice == 1)
        {
          //System.out.println("\f"); tried to implemant clear screen;
          for (int i = 1; i < 3; i++) {
            //                ^ this variable here will be updated as the number of quests increases
            // a for loop is used to make the variable 'i' which is used to itterate through
            // quests
            if (i > 1) {
              // this checks to see if i > 1 which means user has complete quest 1 and will be
              // presented with a choice to continue
              System.out.println("Do you want to continue to the next quest?\n(1)Yes\n(2)No");
              final int continueQuest = input.nextInt();
              if (continueQuest == 1) {
                // this allows the user to continue playing quests until they choose no allowing
                // them to end the game early
               
              }
            } else if (i == 1) {
              // this looks for the first iteration of i when i = 1 and starts quest 1
              selectedQuest.runQuest(1);
            }
          }
          currentQuest = 1;
        }
        else if(choice == 2)
        {
          //Achievements menu
        }
        //continue game
        else if(choice == 3)
        {
          for (int i = currentQuest; i < 3; i++) 
          {
              System.out.println("Do you want to continue to the next quest?\n(1)Yes\n(2)No");
              final int continueQuest = input.nextInt();
              selectedQuest.runQuest(i);
          }
          
        }
        else
        {
          System.out.println("Not a valid input. Please try again");
        }
        
       
    }
}