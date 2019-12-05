import java.util.*;
public class The_Costner_Trail
{
  public static int currentQuest = 1;
    
    public static void main(String[] ars)
    {
        Scanner input = new Scanner(System.in);
        //These statments will be encorperated into their own method as "character details"
        System.out.println("Menu Page");
        System.out.println("Enter the name you want for your character");
        String name = input.nextLine();
        System.out.println("1.Male \n2.Female");
        int choice = input.nextInt();
        int gender;
        if(choice == 1)
        {
          //this will probably need to be a method too to call value1 "he/she" and value2 "his/her"
          gender = 0;
        } 
        else 
        {
          gender = 1;
        }

        
        
        
        System.out.print(" ____________________   ___     ___   ____________\n" + "|                    | |   |   |   | |            |\n" + "|_______     ________| |   |   |   | |   _________|\n" + "        |   |          |   |   |   | |  |\n" + "        |   |          |   |___|   | |  |_________\n" + "        |   |          |           | |            |\n" + "        |   |          |    ___    | |   _________|\n" + "        |   |          |   |   |   | |  |\n" + "        |   |          |   |   |   | |  |_________\n" + "        |   |          |   |   |   | |            |\n" + "        |___|          |___|   |___| |____________|\n" + "\n" + " ____________________      _________________     ____________      ____________________     ____        ____     ____________     ______________\n" + "|                    |    |    _________    |   |            |    |                    |   |     L     |    |   |            |   |              |\n" + "|     _______________|    |   |         |   |   |    ________|    |_______     ________|   |      L    |    |   |   _________|   |    ______    |\n" + "|    |                    |   |         |   |   |   |                     |   |            |    |  L   |    |   |  |             |   |      |   |\n" + "|    |                    |   |         |   |   |   |________             |   |            |    |   L  |    |   |  |_________    |   |______|   |\n" + "|    |                    |   |         |   |   |            |            |   |            |    |L   L |    |   |            |   |          ____|\n" + "|    |                    |   |         |   |   |________    |            |   |            |    | L   L|    |   |   _________|   |   |___   L\n" + "|    |                    |   |         |   |            |   |            |   |            |    |  L   |    |   |  |             |   |   L   L\n" + "|    |_______________     |   |         |   |    ________|   |            |   |            |    |   L  |    |   |  |_________    |   |    L   L\n" + "|                    |    |   |_________|   |   |            |            |   |            |    |    L      |   |            |   |   |     L   L\n" + "|____________________|    |_________________|   |____________|            |___|            |____|     L_____|   |____________|   |___|      L___L\n" + "\n" + "\n");
        
        
        System.out.println("1.Start game" + "\n" + "2.View Achievements" + "\n" + "3.Continue Game");
        choice = input.nextInt();
        
      
        
        

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
                Quests selectedQuests = new Quests(name, gender, i); 
              }
            } else if (i == 1) {
              // this looks for the first iteration of i when i = 1 and starts quest 1
              selectedQuest("name", 1, 1);
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
              selectedQuest(name, gender, i);
          }
          
        }
        else
        {
          System.out.println("Not a valid input. Please try again");
        }
        
       
    }
}