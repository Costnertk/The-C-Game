import java.util.*;
public class The_Costner_Trail
{
    public static void main(String[] ars)
    {
        Scanner input = new Scanner(System.in);
        //These statments will be encorperated into their own method as "character details"
        System.out.println("Menu Page");
        System.out.println("Enter the name you want for your character");
        String name = input.nextLine();
        System.out.println("1.Male \n2.Female");
        int choice = input.nextInt();
        if(choice == 1)
        {
          //this will probably need to be a method too to call value1 "he/she" and value2 "his/her"
          String gender = ;
        } 
        else 
        {
          //gender = 1;
        }



        
        //The cool shit

        //Title converted to one line print statement. Would like to get Images print object working as alternative.
        System.out.print(" ____________________   ___     ___   ____________\n" + "|                    | |   |   |   | |            |\n" + "|_______     ________| |   |   |   | |   _________|\n" + "        |   |          |   |   |   | |  |\n" + "        |   |          |   |___|   | |  |_________\n" + "        |   |          |           | |            |\n" + "        |   |          |    ___    | |   _________|\n" + "        |   |          |   |   |   | |  |\n" + "        |   |          |   |   |   | |  |_________\n" + "        |   |          |   |   |   | |            |\n" + "        |___|          |___|   |___| |____________|\n" + "\n" + " ____________________      _________________     ____________      ____________________     ____        ____     ____________     ______________\n" + "|                    |    |    _________    |   |            |    |                    |   |     L     |    |   |            |   |              |\n" + "|     _______________|    |   |         |   |   |    ________|    |_______     ________|   |      L    |    |   |   _________|   |    ______    |\n" + "|    |                    |   |         |   |   |   |                     |   |            |    |  L   |    |   |  |             |   |      |   |\n" + "|    |                    |   |         |   |   |   |________             |   |            |    |   L  |    |   |  |_________    |   |______|   |\n" + "|    |                    |   |         |   |   |            |            |   |            |    |L   L |    |   |            |   |          ____|\n" + "|    |                    |   |         |   |   |________    |            |   |            |    | L   L|    |   |   _________|   |   |___   L\n" + "|    |                    |   |         |   |            |   |            |   |            |    |  L   |    |   |  |             |   |   L   L\n" + "|    |_______________     |   |         |   |    ________|   |            |   |            |    |   L  |    |   |  |_________    |   |    L   L\n" + "|                    |    |   |_________|   |   |            |            |   |            |    |    L      |   |            |   |   |     L   L\n" + "|____________________|    |_________________|   |____________|            |___|            |____|     L_____|   |____________|   |___|      L___L\n" + "\n" + "\n");
        
        
        System.out.println("1.Start game" + "\n" + "2.View Achievements");
        choice = input.nextInt();
        
        //This while statment will be concatonated into its own method because i expect this to be called often
        //this will have parameters for accepted values so that there can be more then two choices
        while(choice > 2 || choice < 1)
        {
          System.out.println("Thats not one of the options\nEnter one of the given choices");
          choice = input.nextInt();
        }
        
        Quests selectedQuest = new Quest(name, gender)

        if(Choice == 1)
        {

        }
        
        
        //This is the begining of tha acutal game logic
        //if(choice == 1){
          //This is where the game is played
         // System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
         // choice = input.nextInt();
          
       // } 
        //else if(choice == 2){
          //this accesses the achive class
          //System.out.println("Achivements and stuff");
        //}
    }
}
