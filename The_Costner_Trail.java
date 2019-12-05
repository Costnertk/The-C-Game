import java.util.*;
public class The_Costner_Trail
{
  public static int currentQuest = 1;
    
    public static void main(String[] ars)
    {
      Images text = new Images();
        Scanner input = new Scanner(System.in);
        //These statments will be encorperated into their own method as "character details"
        System.out.println("Menu Page");
        System.out.println("Enter the name you want for your character");
        String userName = input.nextLine();
        Quests selectedQuest = new Quests(userName);
        text.printTitle();
        
        System.out.println("1.Start game" + "\n" + "2.View Achievements" + "\n" + "3.Continue Game");
        int choice = input.nextInt();
        
      
        
        

        if(choice == 1)
        {
          selectedQuest.Quest1();
          for(int i = currentQuest; i < 3; i++)
          {
            System.out.println("Do you want to continue to the next quest?\n(1)Yes\n(2)No");
            final int continueQuest = input.nextInt();
            selectedQuest.runQuest(i);
          }
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