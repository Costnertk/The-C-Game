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
        System.out.println("1.Use the pronouns he, his\n2.Use the pronouns she, her");
        int choice = input.nextInt();
        if(choice == 1)
        {
          //this will probably need to be a method too to call value1 "he/she" and value2 "his/her"
          int pronoun = 0;
        } else {
          //pronoun = 1;
        }
        //
        
        
        
        //The cool shit
        
        System.out.println(" ____________________   ___     ___   ____________");
        System.out.println("|                    | |   |   |   | |            |");
        System.out.println("|_______     ________| |   |   |   | |   _________|");
        System.out.println("        |   |          |   |   |   | |  |");
        System.out.println("        |   |          |   |___|   | |  |_________");
        System.out.println("        |   |          |           | |            |");
        System.out.println("        |   |          |    ___    | |   _________|");
        System.out.println("        |   |          |   |   |   | |  |");
        System.out.println("        |   |          |   |   |   | |  |_________");
        System.out.println("        |   |          |   |   |   | |            |");
        System.out.println("        |___|          |___|   |___| |____________|");
        System.out.println();
        System.out.println(" ____________________      _________________     ____________      ____________________     ____        ____     ____________     ______________");
        System.out.println("|                    |    |    _________    |   |            |    |                    |   |     L     |    |   |            |   |              |");
        System.out.println("|     _______________|    |   |         |   |   |    ________|    |_______     ________|   |      L    |    |   |   _________|   |    ______    |");
        System.out.println("|    |                    |   |         |   |   |   |                     |   |            |    |  L   |    |   |  |             |   |      |   |");
        System.out.println("|    |                    |   |         |   |   |   |________             |   |            |    |   L  |    |   |  |_________    |   |______|   |");
        System.out.println("|    |                    |   |         |   |   |            |            |   |            |    |L   L |    |   |            |   |          ____|");
        System.out.println("|    |                    |   |         |   |   |________    |            |   |            |    | L   L|    |   |   _________|   |   |___   L");
        System.out.println("|    |                    |   |         |   |            |   |            |   |            |    |  L   |    |   |  |             |   |   L   L");
        System.out.println("|    |_______________     |   |         |   |    ________|   |            |   |            |    |   L  |    |   |  |_________    |   |    L   L");
        System.out.println("|                    |    |   |_________|   |   |            |            |   |            |    |    L      |   |            |   |   |     L   L");
        System.out.println("|____________________|    |_________________|   |____________|            |___|            |____|     L_____|   |____________|   |___|      L___L");
        System.out.println("");
        System.out.println("");
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("1.Start game" + "\n" + "2.View Achievements");
        choice = input.nextInt();
        
        //This while statment will be concatonated into its own method because i expect this to be called often
        //this will have parameters for accepted values so that there can be more then two choices
        while(choice > 2 || choice < 1){
            System.out.println("Thats not one of the options\nEnter one of the given choices");
            choice = input.nextInt();
          }
        //
        
        
        //This is the begining of tha acutal game logic
        if(choice == 1){
          //This is where the game is played
          System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
          choice = input.nextInt();
          
        } else if(choice == 2){
          //this accesses the achive class
          System.out.println("Achivements and stuff");
        }
    }
}
